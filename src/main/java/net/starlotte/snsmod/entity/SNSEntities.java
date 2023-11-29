package net.starlotte.snsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneCatEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneWolfEntity;

public class SNSEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SNSMod.MOD_ID);
//HERB
    //CANDY CANE
    //AMBIENT
    public static final RegistryObject<EntityType<CandyCaneflyEntity>> CANDY_CANEFLY =
        ENTITY_TYPES.register("candy_canefly", () -> EntityType.Builder.of(CandyCaneflyEntity::new, MobCategory.AMBIENT)
                .sized(0.5f, 0.5f).build("candy_canefly"));
    //TAMEABLE
    public static final RegistryObject<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.8f).build("candy_cane_cat"));
    public static final RegistryObject<EntityType<CandyCaneWolfEntity>> CANDY_CANE_WOLF =
            ENTITY_TYPES.register("candy_cane_wolf", () -> EntityType.Builder.of(CandyCaneWolfEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.8f).build("candy_cane_wolf"));
    //HOSTILE


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
