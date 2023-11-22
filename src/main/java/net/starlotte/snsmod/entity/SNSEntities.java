package net.starlotte.snsmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;

public class SNSEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SNSMod.MOD_ID);

    public static final RegistryObject<EntityType<CandyCaneflyEntity>> CANDY_CANEFLY =
            ENTITY_TYPES.register("candy_canefly", () -> EntityType.Builder.of(CandyCaneflyEntity::new, MobCategory.AMBIENT)
                    .sized(2.5f, 2.5f).build("candy_canefly"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
