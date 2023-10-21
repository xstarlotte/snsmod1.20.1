package net.starlotte.snsmod.particle;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;

public class SNSParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
        DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SNSMod.MOD_ID);

        public static final RegistryObject<SimpleParticleType> CANDY_CANE_FLAME_PARTICLES =
                PARTICLE_TYPES.register("candy_cane_flame_particles", () -> new SimpleParticleType(true));
   // public static final RegistryObject<SimpleParticleType> CANDY_CANE_SMOKE_PARTICLES =
    //        PARTICLE_TYPES.register("candy_cane_smoke_particles", () -> new SimpleParticleType(true));

        public static void register(IEventBus eventBus) {
            PARTICLE_TYPES.register(eventBus);
        }
}
