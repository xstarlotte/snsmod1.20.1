package net.starlotte.snsmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.worldgen.biome.custom.SNSOverworldRegion;
import terrablender.api.Regions;

public class SNSTerraBlenderAPI {
    public static void registerRegions() {
        Regions.register(new SNSOverworldRegion(new ResourceLocation(SNSMod.MOD_ID, "overworld"), 5));
    }
}
