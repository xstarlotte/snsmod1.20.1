package net.starlotte.snsmod.entity.category.herb.ambient;


import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomFlyingGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant.CandyCaneflyVariant;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nonnull;

public class CandyCaneflyEntity extends PathfinderMob implements GeoEntity {

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(CandyCaneflyEntity.class, EntityDataSerializers.INT);



 //animations

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public CandyCaneflyEntity(EntityType<? extends CandyCaneflyEntity> type, Level level) {
        super(type, level);
        this.moveControl = new FlyingMoveControl(this, 4, true);
    }
    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }
    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.candy_canefly.flying", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

//AI

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new WaterAvoidingRandomFlyingGoal(this, 1f));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 4f));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10D)
                .add(Attributes.FLYING_SPEED, Attributes.FLYING_SPEED.getDefaultValue());
    }
//flying
    @Nonnull
    @Override
    protected PathNavigation createNavigation(@Nonnull Level level) {
        FlyingPathNavigation flyingPathNavigator = new FlyingPathNavigation(this, level);
        flyingPathNavigator.setCanOpenDoors(false);
        flyingPathNavigator.setCanFloat(true);
        flyingPathNavigator.setCanPassDoors(true);
        return flyingPathNavigator;
    }
    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }

    //data


    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT,0);
    }

    //variant

    public CandyCaneflyVariant getVariant() {
        return CandyCaneflyVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(CandyCaneflyVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason,
                                        @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        CandyCaneflyVariant variant = Util.getRandom(CandyCaneflyVariant.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.entityData.set(DATA_ID_TYPE_VARIANT, pCompound.getInt("Variant"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("Variant", this.getTypeVariant());
    }
}
