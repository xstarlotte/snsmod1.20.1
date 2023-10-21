package net.starlotte.snsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.starlotte.snsmod.SNSMod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SNSPaintingVariantTagProvider extends PaintingVariantTagsProvider {
    public SNSPaintingVariantTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, SNSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .addOptional(new ResourceLocation(SNSMod.MOD_ID, "candy_cane"))

        ;
    }
}
