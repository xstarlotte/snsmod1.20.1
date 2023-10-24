package net.starlotte.snsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.worldgen.SNSBiomeModifiers;
import net.starlotte.snsmod.worldgen.SNSConfiguredFeatures;
import net.starlotte.snsmod.worldgen.SNSPlacedFeatures;
import net.starlotte.snsmod.worldgen.biome.SNSBiomes;
import net.starlotte.snsmod.worldgen.dimension.SNSDimensions;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SNSWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.BIOME, SNSBiomes::boostrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, SNSBiomeModifiers::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, SNSConfiguredFeatures::bootstrap)
            .add(Registries.DIMENSION_TYPE, SNSDimensions::bootstrapType)
            .add(Registries.LEVEL_STEM, SNSDimensions::bootstrapStem)
            .add(Registries.PLACED_FEATURE, SNSPlacedFeatures::bootstrap);


    public SNSWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(SNSMod.MOD_ID));
    }
}
