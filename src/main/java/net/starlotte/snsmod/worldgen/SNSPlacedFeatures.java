package net.starlotte.snsmod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;

import java.util.List;

public class SNSPlacedFeatures {
//FLORA
    public static final ResourceKey<PlacedFeature> CANDY_CANE_FLOWER_PLACED_KEY = registerKey("candy_cane_flower_placed");
//TREES
    public static final ResourceKey<PlacedFeature> CANDY_CANE_TREE_PLACED_KEY = registerKey("candy_cane_tree_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
//FLORA
        register(context, CANDY_CANE_FLOWER_PLACED_KEY, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_FLOWER_KEY),
            List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
//TREES
        register(context, CANDY_CANE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_TREE_KEY),
                //count = 3 placed on average, 0.1f = 10% chance of 2 (final number) more being spawned additionally.
                //the 2nd MUST be an integer (must be a whole number when divided by 1, for example; 1/0.1 = 10 (whole number))
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        SNSBlocks.CANDY_CANE_SAPLING.get()));

    }
    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(SNSMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
