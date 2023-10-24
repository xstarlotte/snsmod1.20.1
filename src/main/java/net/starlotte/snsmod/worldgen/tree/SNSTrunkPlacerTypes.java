package net.starlotte.snsmod.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.worldgen.tree.custom.CandyCaneTrunkPlacer;

public class SNSTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, SNSMod.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<CandyCaneTrunkPlacer>> CANDY_CANE_TRUNK_PLACER =
            TRUNK_PLACERS.register("candy_cane_trunk_placer", () -> new TrunkPlacerType<>(CandyCaneTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}
