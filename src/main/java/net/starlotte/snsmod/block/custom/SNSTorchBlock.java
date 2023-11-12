package net.starlotte.snsmod.block.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.TorchBlock;
import net.starlotte.snsmod.particle.SNSParticles;

public class SNSTorchBlock extends TorchBlock {
    public SNSTorchBlock(Properties pProperties) { super(pProperties, ParticleTypes.FLAME);
    }

}
