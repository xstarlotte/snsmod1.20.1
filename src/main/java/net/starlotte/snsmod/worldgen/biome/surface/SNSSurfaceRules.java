package net.starlotte.snsmod.worldgen.biome.surface;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.worldgen.biome.SNSBiomes;

public class SNSSurfaceRules {
//candy cane
    private static final SurfaceRules.RuleSource CANDY_CANE_STONE = makeStateRule(SNSBlocks.CANDY_CANE_STONE.get());
    private static final SurfaceRules.RuleSource CANDY_CANE_GRASS_BLOCK = makeStateRule(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource CANDY_CANE_DIRT = makeStateRule(SNSBlocks.CANDY_CANE_DIRT.get());
//cinnamon
    private static final SurfaceRules.RuleSource CINNAMON_BLOCK = makeStateRule(SNSBlocks.CINNAMON_BLOCK.get());
    private static final SurfaceRules.RuleSource CINNAMON_GRASS_BLOCK = makeStateRule(SNSBlocks.CINNAMON_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource CINNAMON_DIRT = makeStateRule(SNSBlocks.CINNAMON_DIRT.get());
//mint
    private static final SurfaceRules.RuleSource MINT_DIRT = makeStateRule(SNSBlocks.MINT_DIRT.get());
    private static final SurfaceRules.RuleSource MINT_GRASS_BLOCK = makeStateRule(SNSBlocks.MINT_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource MINT_BLOCK = makeStateRule(SNSBlocks.MINT_BLOCK.get());

    public static SurfaceRules.RuleSource makeRules() {

        return SurfaceRules.sequence(
//candy cane
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, CANDY_CANE_GRASS_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, CANDY_CANE_DIRT)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CANDY_CANE_STONE)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, CANDY_CANE_STONE)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CANDY_CANE_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, CANDY_CANE_STONE)),
//cinnamon
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, CINNAMON_GRASS_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, CINNAMON_DIRT)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CINNAMON_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, CINNAMON_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, CINNAMON_BLOCK)),
//mint
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, MINT_GRASS_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, MINT_DIRT)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, MINT_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, MINT_BLOCK)),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.MINT_BIOME),
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, MINT_BLOCK))

        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}