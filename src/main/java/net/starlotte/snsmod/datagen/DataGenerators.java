package net.starlotte.snsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.starlotte.snsmod.SNSMod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SNSMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new SNSRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), SNSLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new SNSBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeClient(), new SNSPaintingVariantTagProvider(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new SNSItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new SNSBlockStateProvider(packOutput, existingFileHelper));

    }
}
