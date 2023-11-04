package net.starlotte.snsmod.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.worldgen.biome.SNSBiomes;

import java.util.List;
import java.util.OptionalLong;

public class SNSDimensions {
  //LEVEL STEMS
    public static final ResourceKey<LevelStem> HERB_MAYFAIR_DIM_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(SNSMod.MOD_ID, "herb_mayfair_dim"));
  //LEVELS
    public static final ResourceKey<Level> HERB_MAYFAIR_DIM_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(SNSMod.MOD_ID, "heb_mayfair_dim"));
   //DIMENSION TYPES
    public static final ResourceKey<DimensionType> HERB_MAYFAIR_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(SNSMod.MOD_ID, "herb_mayfair_dim_type"));


    public static void bootstrapType(BootstapContext<DimensionType> context) {
        context.register(HERB_MAYFAIR_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

       // NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
       //         new FixedBiomeSource(biomeRegistry.getOrThrow(SNSBiomes.CANDY_CANE_BIOME)),
        //        noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(SNSBiomes.CANDY_CANE_BIOME)),
                                Pair.of(Climate.parameters(0.9F, 0.5F, 0.0F, 0.5F, 0.0F, 0.1F, 0.0F), biomeRegistry.getOrThrow(SNSBiomes.CINNAMON_BIOME)),
                               Pair.of(Climate.parameters(0.1F, 0.0F, 0.0F, 0.9F, 0.0F, 0.2F, 0.0F), biomeRegistry.getOrThrow(SNSBiomes.MINT_BIOME)),
                                Pair.of(Climate.parameters(0.1F, 0.0F, 0.0F, 0.9F, 0.0F, 0.3F, 0.0F), biomeRegistry.getOrThrow(SNSBiomes.TOOTHPASTE_BIOME))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(SNSDimensions.HERB_MAYFAIR_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(HERB_MAYFAIR_DIM_KEY, stem);
    }
}
