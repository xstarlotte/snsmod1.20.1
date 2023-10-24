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
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.worldgen.SNSPlacedFeatures;

public class SNSBiomes {
        public static final ResourceKey<Biome> CANDY_CANE_BIOME = register("candy_cane_biome");
        public static final ResourceKey<Biome> MINT_BIOME = register("mint_biome");

        public static void boostrap(BootstapContext<Biome> context) {
            context.register(CANDY_CANE_BIOME, candyCaneBiome(context));
            context.register(MINT_BIOME, mintBiome(context));
        }

        public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
            BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
            BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
            BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
            BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
            BiomeDefaultFeatures.addDefaultSprings(builder);
            BiomeDefaultFeatures.addSurfaceFreezing(builder);
        }

        public static Biome candyCaneBiome(BootstapContext<Biome> context) {
            MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 2, 3, 5));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 5, 4, 4));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));

            BiomeDefaultFeatures.farmAnimals(spawnBuilder);
            BiomeDefaultFeatures.commonSpawns(spawnBuilder);

            BiomeGenerationSettings.Builder biomeBuilder =
                    new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

            globalOverworldGeneration(biomeBuilder);

            BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

            BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
            BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_TREE_PLACED_KEY);

            return new Biome.BiomeBuilder()
                    .hasPrecipitation(true)
                    .downfall(0.8f)
                    .temperature(0.7f)
                    .generationSettings(biomeBuilder.build())
                    .mobSpawnSettings(spawnBuilder.build())
                    .specialEffects((new BiomeSpecialEffects.Builder())
                            .waterColor(0xe82e3b)
                            .waterFogColor(0xbf1b26)
                            .skyColor(0x30c918)
                            .fogColor(0x22a1e6)
                            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                            .build())
                    .build();
        }

        public static Biome mintBiome(BootstapContext<Biome> context) {
            MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();


            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 2, 3, 5));
            spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 5, 4, 4));
            BiomeDefaultFeatures.farmAnimals(spawnBuilder);
            BiomeDefaultFeatures.commonSpawns(spawnBuilder);

            BiomeGenerationSettings.Builder biomeBuilder =
                    new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

            globalOverworldGeneration(biomeBuilder);
            BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);
            BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
            BiomeDefaultFeatures.addFerns(biomeBuilder);
            BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
            BiomeDefaultFeatures.addExtraGold(biomeBuilder);

            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS);

            BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
            BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder);

            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_FLOWER_PLACED_KEY);
            biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SNSPlacedFeatures.CANDY_CANE_TREE_PLACED_KEY);

            return new Biome.BiomeBuilder()
                    .hasPrecipitation(true)
                    .downfall(0.8f)
                    .temperature(0.7f)
                    .generationSettings(biomeBuilder.build())
                    .mobSpawnSettings(spawnBuilder.build())
                    .specialEffects((new BiomeSpecialEffects.Builder())
                            .waterColor(0xe82e3b)
                            .waterFogColor(0xbf1b26)
                            .skyColor(0x30c918)
                            .fogColor(0x22a1e6)
                            .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                    .build())
                    .build();
        }

        public static ResourceKey<Biome> register(String name) {
            return ResourceKey.create(Registries.BIOME, new ResourceLocation(SNSMod.MOD_ID, name));
        }
}
