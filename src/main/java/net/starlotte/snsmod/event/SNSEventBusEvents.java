package net.starlotte.snsmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.SNSEntities;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;

@Mod.EventBusSubscriber(modid = SNSMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SNSEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SNSEntities.CANDY_CANEFLY.get(), CandyCaneflyEntity.createAttributes().build());
    }

}
