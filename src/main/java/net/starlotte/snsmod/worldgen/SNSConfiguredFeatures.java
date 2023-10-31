package net.starlotte.snsmod.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.worldgen.tree.custom.CandyCaneTrunkPlacer;

public class SNSConfiguredFeatures {

//FLORA
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_BUSH_KEY = registerKey("candy_cane_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_CARNATION_KEY = registerKey("candy_cane_carnation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_CARNATIONS_KEY = registerKey("candy_cane_carnations");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_FLOWER_KEY = registerKey("candy_cane_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_FLOWER_2_KEY = registerKey("candy_cane_flower_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_FLOWER_3_KEY = registerKey("candy_cane_flower_3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_FLOWER_4_KEY = registerKey("candy_cane_flower_4");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_GRASS_KEY = registerKey("candy_cane_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_GRASS_LONG_KEY = registerKey("candy_cane_grass_long");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MINT_BUSH_KEY = registerKey("mint_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINT_CHOCOLATE_TULIP_KEY = registerKey("mint_chocolate_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINT_FLOWER_KEY = registerKey("mint_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINT_IMPEONY_KEY = registerKey("mint_impeony");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POLO_PLANT_KEY = registerKey("polo_plant");

//TREES
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_TREE_KEY = registerKey("candy_cane_tree");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
//FLORA
        register(context, CANDY_CANE_BUSH_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_BUSH.get())))));
        register(context, CANDY_CANE_CARNATION_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_CARNATION.get())))));
        register(context, CANDY_CANE_CARNATIONS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_CARNATIONS.get())))));
        register(context, CANDY_CANE_FLOWER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_FLOWER.get())))));
        register(context, CANDY_CANE_FLOWER_2_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_FLOWER_2.get())))));
        register(context, CANDY_CANE_FLOWER_3_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_FLOWER_3.get())))));
        register(context, CANDY_CANE_FLOWER_4_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_FLOWER_4.get())))));
        register(context, CANDY_CANE_GRASS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_GRASS.get())))));
        register(context, CANDY_CANE_GRASS_LONG_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.CANDY_CANE_GRASS_LONG.get())))));

        register(context, MINT_BUSH_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.MINT_BUSH.get())))));
        register(context, MINT_CHOCOLATE_TULIP_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.MINT_CHOCOLATE_TULIP.get())))));
        register(context, MINT_FLOWER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.MINT_FLOWER.get())))));
        register(context, MINT_IMPEONY_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.MINT_IMPEONY.get())))));
        register(context, POLO_PLANT_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlocks.POLO_PLANT.get())))));

//TREES
        register(context, CANDY_CANE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(SNSBlocks.CANDY_CANE_STALK.get()),
                new CandyCaneTrunkPlacer(2, 2, 2),
                BlockStateProvider.simple(SNSBlocks.CANDY_CANE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1,0,2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SNSMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
