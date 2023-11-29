package net.starlotte.snsmod.event;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.SNSEntities;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneCatEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneWolfEntity;
import org.checkerframework.checker.units.qual.A;

@Mod.EventBusSubscriber(modid = SNSMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SNSEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

    }


}
