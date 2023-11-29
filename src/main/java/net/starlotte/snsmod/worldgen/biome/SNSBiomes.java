package net.starlotte.snsmod.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.SNSEntities;
import net.starlotte.snsmod.worldgen.SNSPlacedFeatures;

public class SNSBiomes {
        public static final ResourceKey<Biome> CANDY_CANE_BIOME = register("candy_cane_biome");
        public static final ResourceKey<Biome> CINNAMON_BIOME = register("cinnamon_biome");
        public static final ResourceKey<Biome> MINT_BIOME = register("mint_biome");
    public static final ResourceKey<Biome> TOOTHPASTE_BIOME = register("toothpaste_biome");

        public static void boostrap(BootstapContext<Biome> context) {
            context.register(CANDY_CANE_BIOME, candyCaneBiome(context));
            context.register(CINNAMON_BIOME, cinnamonBiome(context));
            context.register(MINT_BIOME, mintBiome(context));
            context.register(TOOTHPASTE_BIOME, toothpasteBiome(context));
        }

        public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
            BiomeDefaultFeatures.addDefaultSprings(builder);
            BiomeDefaultFeatures.addSurfaceFreezing(builder);
        }
//candy cane
        public static Biome candyCaneBiome(BootstapContext<Biome> context) {
 //BIOME
            BiomeGenerationSettings.Builder biomeBuilder =
                    new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_BUSH_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_CARNATION_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_CARNATIONS_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_2_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_3_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_4_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_GRASS_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_GRASS_LONG_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_TREE_PLACED_KEY);
            globalOverworldGeneration(biomeBuilder);
  //SPAWNING
            MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
            spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(SNSEntities.CANDY_CANEFLY.get(), 10, 3, 5));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(SNSEntities.CANDY_CANE_CAT.get(), 5, 4, 4));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(SNSEntities.CANDY_CANE_WOLF.get(), 5, 4, 4));

            return new Biome.BiomeBuilder()
                    .hasPrecipitation(true)
                    .downfall(0.8f)
                    .temperature(0.7f)
                    .generationSettings(biomeBuilder.build())
                    .mobSpawnSettings(spawnBuilder.build())
                    .specialEffects((new BiomeSpecialEffects.Builder())
                            .waterColor(0x5ca97e)
                            .skyColor(0x408883)
                            .waterFogColor(0x5ca97e)
                            .fogColor(0x408883)
                            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                            .build())
                    .build();
        }
//cinnamon

    public static Biome cinnamonBiome(BootstapContext<Biome> context) {
        //BIOME
        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        //SPAWNING
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();


        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x542C08)
                        .skyColor(0xA87445)
                        .waterFogColor(0x542C08)
                        .fogColor(0xA87445)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }

//mint
    public static Biome mintBiome(BootstapContext<Biome> context) {
        //BIOME
        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.MINT_BUSH_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.MINT_CHOCOLATE_TULIP_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.MINT_FLOWER_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.MINT_IMPEONY_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.POLO_PLANT_PLACED_KEY);
        globalOverworldGeneration(biomeBuilder);
        //SPAWNING
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();


        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x5ca97e)
                        .skyColor(0x408883)
                        .waterFogColor(0x5ca97e)
                        .fogColor(0x408883)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }

    //toothpaste
    public static Biome toothpasteBiome(BootstapContext<Biome> context) {
        //BIOME
        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        //SPAWNING
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();


        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x5ca97e)
                        .skyColor(0x408883)
                        .waterFogColor(0x5ca97e)
                        .fogColor(0x408883)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .build();
    }

        public static ResourceKey<Biome> register(String name) {
            return ResourceKey.create(Registries.BIOME, new ResourceLocation(SNSMod.MOD_ID, name));
        }
}
