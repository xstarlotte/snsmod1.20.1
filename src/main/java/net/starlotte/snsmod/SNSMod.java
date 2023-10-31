package net.starlotte.snsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
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
import net.starlotte.snsmod.util.SNSWoodTypes;
import net.starlotte.snsmod.worldgen.biome.SNSTerraBlenderAPI;
import net.starlotte.snsmod.worldgen.biome.surface.SNSSurfaceRules;
import net.starlotte.snsmod.worldgen.tree.SNSTrunkPlacerTypes;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

@Mod(SNSMod.MOD_ID)

public class SNSMod {
    public static final String MOD_ID = "snsmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SNSMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SNSBlocks.register(modEventBus);
        SNSBlockEntities.register(modEventBus);
        SNSItems.register(modEventBus);
        SNSMenuTypes.register(modEventBus);
        SNSPaintings.register(modEventBus);
        SNSParticles.register(modEventBus);
        SNSRecipes.register(modEventBus);
        SNSTabs.register(modEventBus);
        SNSTerraBlenderAPI.registerRegions();
        SNSTrunkPlacerTypes.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_BUSH.getId(), SNSBlocks.POTTED_CANDY_CANE_BUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_CARNATION.getId(), SNSBlocks.POTTED_CANDY_CANE_CARNATION);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_CARNATIONS.getId(), SNSBlocks.POTTED_CANDY_CANE_CARNATIONS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_FLOWER.getId(), SNSBlocks.POTTED_CANDY_CANE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_FLOWER_2.getId(), SNSBlocks.POTTED_CANDY_CANE_FLOWER_2);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_FLOWER_3.getId(), SNSBlocks.POTTED_CANDY_CANE_FLOWER_3);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_FLOWER_4.getId(), SNSBlocks.POTTED_CANDY_CANE_FLOWER_4);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_GRASS.getId(), SNSBlocks.POTTED_CANDY_CANE_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_GRASS_LONG.getId(), SNSBlocks.POTTED_CANDY_CANE_GRASS_LONG);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.CANDY_CANE_SAPLING.getId(), SNSBlocks.POTTED_CANDY_CANE_SAPLING);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.MINT_BUSH.getId(), SNSBlocks.POTTED_MINT_BUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.MINT_CHOCOLATE_TULIP.getId(), SNSBlocks.POTTED_MINT_CHOCOLATE_TULIP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.MINT_FLOWER.getId(), SNSBlocks.POTTED_MINT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.MINT_IMPEONY.getId(), SNSBlocks.POTTED_MINT_IMPEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlocks.POLO_PLANT.getId(), SNSBlocks.POTTED_POLO_PLANT);

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, SNSSurfaceRules.makeRules());

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
                Sheets.addWoodType(SNSWoodTypes.CANDY_CANE);
            });
        }
    }
}
