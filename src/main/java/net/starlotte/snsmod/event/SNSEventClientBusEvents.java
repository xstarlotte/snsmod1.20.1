package net.starlotte.snsmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.particle.CandyCaneFlameParticles;
//import net.starlotte.snsmod.particle.CandyCaneSmokeParticles;
import net.starlotte.snsmod.particle.SNSParticles;

@Mod.EventBusSubscriber(modid = SNSMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SNSEventClientBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(SNSParticles.CANDY_CANE_FLAME_PARTICLES.get(), CandyCaneFlameParticles.Provider::new);
       // event.registerSpriteSet(SNSParticles.CANDY_CANE_SMOKE_PARTICLES.get(), CandyCaneSmokeParticles.Provider::new);
    }

}
