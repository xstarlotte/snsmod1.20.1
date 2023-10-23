package net.starlotte.snsmod.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.starlotte.snsmod.SNSMod;

public class SNSBiomeModifiers {
//FLORA
public static final ResourceKey<BiomeModifier> ADD_FLOWER_CANDY_CANE = registerKey("add_flower_candy_cane");
//TREES
    public static final ResourceKey<BiomeModifier> ADD_TREE_CANDY_CANE = registerKey("add_tree_candy_cane");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
//FLORA
        context.register(ADD_FLOWER_CANDY_CANE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_FLOWER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
//TREES
        context.register(ADD_TREE_CANDY_CANE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_TREE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));


    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(SNSMod.MOD_ID, name));
    }
}