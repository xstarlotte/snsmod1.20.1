package net.starlotte.snsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.block.entity.SNSBlockEntities;
import net.starlotte.snsmod.item.SNSItems;
import net.starlotte.snsmod.painting.SNSPaintings;
import net.starlotte.snsmod.particle.SNSParticles;
import net.starlotte.snsmod.recipe.SNSRecipes;
import net.starlotte.snsmod.screen.CandyCaneFurnaceScreen;
import net.starlotte.snsmod.screen.SNSMenuTypes;
import org.slf4j.Logger;

@Mod(SNSMod.MOD_ID)

public class SNSMod {
    public static final String MOD_ID = "snsmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SNSMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SNSItems.register(modEventBus);
        SNSBlocks.register(modEventBus);
        SNSTabs.register(modEventBus);
        SNSMenuTypes.register(modEventBus);
        SNSBlockEntities.register(modEventBus);
        SNSRecipes.register(modEventBus);
        SNSPaintings.register(modEventBus);
        SNSParticles.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_FLOWER.getId(), SNSBlocks.POTTED_CANDY_CANE_FLOWER);

        });
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {

                MenuScreens.register(SNSMenuTypes.CANDY_CANE_FURNACE_MENU.get(), CandyCaneFurnaceScreen::new);

            });
        }
    }
}
