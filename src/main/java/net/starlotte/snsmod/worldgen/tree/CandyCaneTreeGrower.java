package net.starlotte.snsmod.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.starlotte.snsmod.worldgen.SNSConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class CandyCaneTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return SNSConfiguredFeatures.CANDY_CANE_KEY;
    }
}
