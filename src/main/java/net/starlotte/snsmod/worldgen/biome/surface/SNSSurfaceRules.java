package net.starlotte.snsmod.worldgen.biome.surface;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.worldgen.biome.SNSBiomes;

public class SNSSurfaceRules {
    private static final SurfaceRules.RuleSource MINT_BLOCK = makeStateRule(SNSBlocks.MINT_BLOCK.get());
    private static final SurfaceRules.RuleSource HARDENED_MINT_BLOCK = makeStateRule(SNSBlocks.HARDENED_MINT_BLOCK.get());
    private static final SurfaceRules.RuleSource CANDY_CANE_STONE = makeStateRule(SNSBlocks.CANDY_CANE_STONE.get());
    private static final SurfaceRules.RuleSource CANDY_CANE_GRASS_BLOCK = makeStateRule(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get());

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, CANDY_CANE_GRASS_BLOCK), MINT_BLOCK);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, CANDY_CANE_GRASS_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CANDY_CANE_STONE)),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, MINT_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, HARDENED_MINT_BLOCK)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}