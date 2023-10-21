package net.starlotte.snsmod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;

public class SNSBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SNSMod.MOD_ID);



    public static final RegistryObject<BlockEntityType<CandyCaneFurnaceBlockEntity>> CANDY_CANE_FURNACE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("candy_cane_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(CandyCaneFurnaceBlockEntity::new,
                            SNSBlocks.CANDY_CANE_FURNACE.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
