package net.starlotte.snsmod.block.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.WallTorchBlock;
import net.starlotte.snsmod.particle.SNSParticles;

public class SNSWallTorchBlock extends WallTorchBlock {
    public SNSWallTorchBlock(Properties pProperties) {
        super(pProperties, ParticleTypes.FLAME);
    }

}
