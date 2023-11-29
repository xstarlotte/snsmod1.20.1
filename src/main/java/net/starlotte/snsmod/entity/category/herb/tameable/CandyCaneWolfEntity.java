package net.starlotte.snsmod.entity.category.herb.tameable;


import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.scores.Team;
import net.minecraftforge.event.ForgeEventFactory;
import net.starlotte.snsmod.entity.SNSEntities;
import net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant.CandyCaneWolfVariant;
import net.starlotte.snsmod.item.SNSItems;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class CandyCaneWolfEntity extends TamableAnimal implements GeoEntity {

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
            SynchedEntityData.defineId(CandyCaneWolfEntity.class, EntityDataSerializers.INT);

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public Level getEntityLevel() {
        return level();
    }
    private static final EntityDataAccessor<Boolean> SITTING =
            SynchedEntityData.defineId(CandyCaneWolfEntity.class, EntityDataSerializers.BOOLEAN);
    public CandyCaneWolfEntity(EntityType<? extends TamableAnimal> type, Level level) {
        super(type, level);
    }
    //animations
    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }
    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if(tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.wolf.running", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        if(this.isSitting()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.wolf.sitting", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.wolf.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;

    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }




//AI
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(1, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(2, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(6, (new HurtByTargetGoal(this)).setAlertOthers());
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10D)
                .add(Attributes.MOVEMENT_SPEED, 0.3f);
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob mob) {
        return SNSEntities.CANDY_CANE_WOLF.get().create(serverLevel);
    }
    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.getItem() == SNSItems.CANDY_CANE.get();
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        Item itemForTaming = SNSItems.CANDY_CANE_SUGAR.get();

        if(isFood(itemstack)) {
            return super.mobInteract(player, hand);
        }

        if (item == itemForTaming && !isTame()) {
            if (this.getEntityLevel().isClientSide) {
                return InteractionResult.CONSUME;
            } else {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }

                if (!ForgeEventFactory.onAnimalTame(this, player)) {
                    if (!this.getEntityLevel().isClientSide) {
                        super.tame(player);
                        this.navigation.recomputePath();
                        this.setTarget(null);
                        this.getEntityLevel().broadcastEntityEvent(this, (byte)7);
                        setSitting(true);
                    }
                }

                return InteractionResult.SUCCESS;
            }
        }

        if(isTame() && !this.getEntityLevel().isClientSide && hand == InteractionHand.MAIN_HAND) {
            setSitting(!isSitting());
            return InteractionResult.SUCCESS;
        }

        if (itemstack.getItem() == itemForTaming) {
            return InteractionResult.PASS;
        }

        return super.mobInteract(player, hand);
    }

    public void setSitting(boolean sitting) {
        this.entityData.set(SITTING, sitting);
        this.setOrderedToSit(sitting);
    }

    public boolean isSitting() {
        return this.entityData.get(SITTING);
    }

    @Override
    public Team getTeam() {
        return super.getTeam();
    }

    public boolean canBeLeashed(Player player) {
        return false;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SITTING, false);
        this.entityData.define(DATA_ID_TYPE_VARIANT,0);
    }

    //variant

    public CandyCaneWolfVariant getVariant() {
        return CandyCaneWolfVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(CandyCaneWolfVariant variant) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason,
                                        @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        CandyCaneWolfVariant variant = Util.getRandom(CandyCaneWolfVariant.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        setSitting(pCompound.getBoolean("isSitting"));
        this.entityData.set(DATA_ID_TYPE_VARIANT, pCompound.getInt("Variant"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putBoolean("isSitting", this.isSitting());
        pCompound.putInt("Variant", this.getTypeVariant());
    }












    protected SoundEvent getAmbientSound() {
        return SoundEvents.WOLF_AMBIENT;
    }
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.WOLF_HURT;
    }
    protected SoundEvent getDeathSound() {
        return SoundEvents.WOLF_DEATH;
    }
    protected float getSoundVolume() {
        return 0.2F;
    }
    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }
}
