package net.starlotte.snsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.item.SNSItems;

public class SNSItemModelProvider extends ItemModelProvider {
    public SNSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SNSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//BUTTON ITEMS
        buttonItem(SNSBlocks.CANDY_CANE_BLOCK_BUTTON, SNSBlocks.CANDY_CANE_BLOCK);
        buttonItem(SNSBlocks.CANDY_CANE_BRICKS_BUTTON, SNSBlocks.CANDY_CANE_BRICKS);
        buttonItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_BUTTON, SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        buttonItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_BUTTON, SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        buttonItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_BUTTON, SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        buttonItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_BUTTON, SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        buttonItem(SNSBlocks.CANDY_CANE_PLANK_BUTTON, SNSBlocks.CANDY_CANE_PLANKS);
        buttonItem(SNSBlocks.HUMBUG_BLOCK_BUTTON, SNSBlocks.HUMBUG_BLOCK);
        buttonItem(SNSBlocks.HUMBUG_BRICKS_BUTTON, SNSBlocks.HUMBUG_BRICKS);
        buttonItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_BUTTON, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        buttonItem(SNSBlocks.MINT_BLOCK_BUTTON, SNSBlocks.MINT_BLOCK);
        buttonItem(SNSBlocks.MINT_BRICKS_BUTTON, SNSBlocks.MINT_BRICKS);
        buttonItem(SNSBlocks.HARDENED_MINT_BLOCK_BUTTON, SNSBlocks.HARDENED_MINT_BLOCK);
        buttonItem(SNSBlocks.TOOTHPASTE_BLOCK_BUTTON, SNSBlocks.TOOTHPASTE_BLOCK);
        buttonItem(SNSBlocks.TOOTHPASTE_BRICKS_BUTTON, SNSBlocks.TOOTHPASTE_BRICKS);
        buttonItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_BUTTON, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
//DOOR ITEMS
        simpleBlockItem(SNSBlocks.HARDENED_MINT_BLOCK_DOOR);
//FENCE ITEMS
        fenceItem(SNSBlocks.CANDY_CANE_BLOCK_FENCE, SNSBlocks.CANDY_CANE_BLOCK);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_FENCE, SNSBlocks.CANDY_CANE_BRICKS);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE, SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE, SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE, SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE, SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        fenceItem(SNSBlocks.CANDY_CANE_PLANK_FENCE, SNSBlocks.CANDY_CANE_PLANKS);
        fenceItem(SNSBlocks.HUMBUG_BLOCK_FENCE, SNSBlocks.HUMBUG_BLOCK);
        fenceItem(SNSBlocks.HUMBUG_BRICKS_FENCE, SNSBlocks.HUMBUG_BRICKS);
        fenceItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        fenceItem(SNSBlocks.MINT_BLOCK_FENCE, SNSBlocks.MINT_BLOCK);
        fenceItem(SNSBlocks.MINT_BRICKS_FENCE, SNSBlocks.MINT_BRICKS);
        fenceItem(SNSBlocks.HARDENED_MINT_BLOCK_FENCE, SNSBlocks.HARDENED_MINT_BLOCK);
        fenceItem(SNSBlocks.TOOTHPASTE_BLOCK_FENCE, SNSBlocks.TOOTHPASTE_BLOCK);
        fenceItem(SNSBlocks.TOOTHPASTE_BRICKS_FENCE, SNSBlocks.TOOTHPASTE_BRICKS);
        fenceItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
//WALL ITEMS
        wallItem(SNSBlocks.CANDY_CANE_BLOCK_WALL, SNSBlocks.CANDY_CANE_BLOCK);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_WALL, SNSBlocks.CANDY_CANE_BRICKS);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL, SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL, SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL, SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL, SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        wallItem(SNSBlocks.CANDY_CANE_PLANK_WALL, SNSBlocks.CANDY_CANE_PLANKS);
        wallItem(SNSBlocks.HUMBUG_BLOCK_WALL, SNSBlocks.HUMBUG_BLOCK);
        wallItem(SNSBlocks.HUMBUG_BRICKS_WALL, SNSBlocks.HUMBUG_BRICKS);
        wallItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        wallItem(SNSBlocks.MINT_BLOCK_WALL, SNSBlocks.MINT_BLOCK);
        wallItem(SNSBlocks.MINT_BRICKS_WALL, SNSBlocks.MINT_BRICKS);
        wallItem(SNSBlocks.HARDENED_MINT_BLOCK_WALL, SNSBlocks.HARDENED_MINT_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_BLOCK_WALL, SNSBlocks.TOOTHPASTE_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_BRICKS_WALL, SNSBlocks.TOOTHPASTE_BRICKS);
        wallItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
//SIMPLE ITEMS
        simpleItem(SNSItems.CANDY_CANE);
        simpleItem(SNSItems.CANDY_CANE_HANGING_SIGN);
        simpleItem(SNSItems.CANDY_CANE_SIGN);
        simpleItem(SNSItems.CANDY_CANE_SUGAR);
        simpleItem(SNSItems.MINT_CHOCOLATE_BALL);
        simpleItem(SNSItems.MINT_IMPERIAL);
        simpleItem(SNSItems.MINT_MARSHMALLOW);
        simpleItem(SNSItems.TOOTHPASTE);
//FLORA
        simpleBlockItem(SNSBlocks.CANDY_CANE_FLOWER);
        saplingItem(SNSBlocks.CANDY_CANE_SAPLING);

    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory")).texture("texture",
                new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SNSMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SNSMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SNSMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

}
