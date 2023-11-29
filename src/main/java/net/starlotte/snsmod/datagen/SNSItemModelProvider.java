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
        buttonItem(SNSBlocks.CANDY_CANE_STONE_BUTTON, SNSBlocks.CANDY_CANE_STONE);
        buttonItem(SNSBlocks.HUMBUG_BLOCK_BUTTON, SNSBlocks.HUMBUG_BLOCK);
        buttonItem(SNSBlocks.HUMBUG_BRICKS_BUTTON, SNSBlocks.HUMBUG_BRICKS);
        buttonItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_BUTTON, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        buttonItem(SNSBlocks.MINT_BLOCK_BUTTON, SNSBlocks.MINT_BLOCK);
        buttonItem(SNSBlocks.MINT_BRICKS_BUTTON, SNSBlocks.MINT_BRICKS);
        buttonItem(SNSBlocks.HARDENED_MINT_BLOCK_BUTTON, SNSBlocks.HARDENED_MINT_BLOCK);
        buttonItem(SNSBlocks.TOOTHPASTE_BLOCK_BUTTON, SNSBlocks.TOOTHPASTE_BLOCK);
        buttonItem(SNSBlocks.TOOTHPASTE_BRICKS_BUTTON, SNSBlocks.TOOTHPASTE_BRICKS);
        buttonItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_BUTTON, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
        buttonItem(SNSBlocks.TOOTHPASTE_STONE_BUTTON, SNSBlocks.TOOTHPASTE_STONE);
//DECORATION
    //CANDY CANE
        complexBlock(SNSBlocks.CANDY_CANE_CAT_TEDDY.get());
        complexBlock(SNSBlocks.LEMON_CANDY_CANE_CAT_TEDDY.get());
        complexBlock(SNSBlocks.MINT_CANDY_CANE_CAT_TEDDY.get());
        complexBlock(SNSBlocks.PEPPERMINT_CANDY_CANE_CAT_TEDDY.get());
        complexBlock(SNSBlocks.SPEARMINT_CANDY_CANE_CAT_TEDDY.get());
        complexBlock(SNSBlocks.HUMBUG_CAT_TEDDY.get());

        complexBlock(SNSBlocks.CANDY_CANE_WOLF_TEDDY.get());
        complexBlock(SNSBlocks.LEMON_CANDY_CANE_WOLF_TEDDY.get());
        complexBlock(SNSBlocks.MINT_CANDY_CANE_WOLF_TEDDY.get());
        complexBlock(SNSBlocks.PEPPERMINT_CANDY_CANE_WOLF_TEDDY.get());
        complexBlock(SNSBlocks.SPEARMINT_CANDY_CANE_WOLF_TEDDY.get());
        complexBlock(SNSBlocks.HUMBUG_WOLF_TEDDY.get());

        complexBlock(SNSBlocks.CANDY_CANE_TABLE.get());

        complexBlock(SNSBlocks.CANDY_CANE_BONE.get());
        complexBlock(SNSBlocks.CANDY_CANE_FOOD_BOWL.get());
        complexBlock(SNSBlocks.CANDY_CANE_WATER_BOWL.get());
//DOOR ITEMS
        simpleBlockItem(SNSBlocks.CANDY_CANE_DOOR);
        simpleBlockItem(SNSBlocks.HARDENED_MINT_BLOCK_DOOR);
        simpleBlockItem(SNSBlocks.TOOTHPASTE_DOOR);
        simpleBlockItem(SNSBlocks.TOOTHPASTE_BRICKS_DOOR);
//FENCE ITEMS
        fenceItem(SNSBlocks.CANDY_CANE_BLOCK_FENCE, SNSBlocks.CANDY_CANE_BLOCK);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_FENCE, SNSBlocks.CANDY_CANE_BRICKS);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE, SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE, SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE, SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        fenceItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE, SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        fenceItem(SNSBlocks.CANDY_CANE_PLANK_FENCE, SNSBlocks.CANDY_CANE_PLANKS);
        fenceItem(SNSBlocks.CANDY_CANE_STONE_FENCE, SNSBlocks.CANDY_CANE_STONE);
        fenceItem(SNSBlocks.HUMBUG_BLOCK_FENCE, SNSBlocks.HUMBUG_BLOCK);
        fenceItem(SNSBlocks.HUMBUG_BRICKS_FENCE, SNSBlocks.HUMBUG_BRICKS);
        fenceItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        fenceItem(SNSBlocks.MINT_BLOCK_FENCE, SNSBlocks.MINT_BLOCK);
        fenceItem(SNSBlocks.MINT_BRICKS_FENCE, SNSBlocks.MINT_BRICKS);
        fenceItem(SNSBlocks.HARDENED_MINT_BLOCK_FENCE, SNSBlocks.HARDENED_MINT_BLOCK);
        fenceItem(SNSBlocks.TOOTHPASTE_BLOCK_FENCE, SNSBlocks.TOOTHPASTE_BLOCK);
        fenceItem(SNSBlocks.TOOTHPASTE_BRICKS_FENCE, SNSBlocks.TOOTHPASTE_BRICKS);
        fenceItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
        fenceItem(SNSBlocks.TOOTHPASTE_STONE_FENCE, SNSBlocks.TOOTHPASTE_STONE);
//FLORA
        simpleBlockItem(SNSBlocks.CANDY_CANE_BUSH);
        simpleBlockItem(SNSBlocks.CANDY_CANE_CARNATION);
        simpleBlockItem(SNSBlocks.CANDY_CANE_CARNATIONS);
        simpleBlockItem(SNSBlocks.CANDY_CANE_FLOWER);
        simpleBlockItem(SNSBlocks.CANDY_CANE_FLOWER_2);
        simpleBlockItem(SNSBlocks.CANDY_CANE_FLOWER_3);
        simpleBlockItem(SNSBlocks.CANDY_CANE_FLOWER_4);
        simpleBlockItem(SNSBlocks.CANDY_CANE_GRASS);
        simpleBlockItem(SNSBlocks.CANDY_CANE_GRASS_LONG);
        saplingItem(SNSBlocks.CANDY_CANE_SAPLING);

        simpleBlockItem(SNSBlocks.MINT_BUSH);
        simpleBlockItem(SNSBlocks.MINT_CHOCOLATE_TULIP);
        simpleBlockItem(SNSBlocks.MINT_FLOWER);
        simpleBlockItem(SNSBlocks.MINT_IMPEONY);
        simpleBlockItem(SNSBlocks.POLO_PLANT);
//SIMPLE ITEMS
        simpleItem(SNSItems.CANDY_CANE);
        simpleItem(SNSItems.CANDY_CANE_HANGING_SIGN);
        simpleItem(SNSItems.CANDY_CANE_SIGN);
        simpleItem(SNSItems.CANDY_CANE_SUGAR);

        simpleItem(SNSItems.MINT_CHOCOLATE_BALL);
        simpleItem(SNSItems.MINT_IMPERIAL);
        simpleItem(SNSItems.MINT_MARSHMALLOW);
        simpleItem(SNSItems.POLO);
        simpleItem(SNSItems.TOOTHPASTE);

        simpleItem(SNSItems.MINT_HUMBUG);

        simpleItem(SNSItems.CINNAMON_ROLL);
        simpleItem(SNSItems.GLAZED_CINNAMON_ROLL);
        simpleItem(SNSItems.CINNAMON_STICKS);
//SPAWN EGGS
        withExistingParent(SNSItems.CANDY_CANEFLY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItems.CANDY_CANE_CAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItems.CANDY_CANE_WOLF_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
//TORCH
        simpleTorch(SNSBlocks.CANDY_CANE_TORCH);

//WALL ITEMS
        wallItem(SNSBlocks.CANDY_CANE_BLOCK_WALL, SNSBlocks.CANDY_CANE_BLOCK);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_WALL, SNSBlocks.CANDY_CANE_BRICKS);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL, SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL, SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL, SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        wallItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL, SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        wallItem(SNSBlocks.CANDY_CANE_PLANK_WALL, SNSBlocks.CANDY_CANE_PLANKS);
        wallItem(SNSBlocks.CANDY_CANE_STONE_WALL, SNSBlocks.CANDY_CANE_STONE);
        wallItem(SNSBlocks.HUMBUG_BLOCK_WALL, SNSBlocks.HUMBUG_BLOCK);
        wallItem(SNSBlocks.HUMBUG_BRICKS_WALL, SNSBlocks.HUMBUG_BRICKS);
        wallItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL, SNSBlocks.HARDENED_HUMBUG_BLOCK);
        wallItem(SNSBlocks.MINT_BLOCK_WALL, SNSBlocks.MINT_BLOCK);
        wallItem(SNSBlocks.MINT_BRICKS_WALL, SNSBlocks.MINT_BRICKS);
        wallItem(SNSBlocks.HARDENED_MINT_BLOCK_WALL, SNSBlocks.HARDENED_MINT_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_BLOCK_WALL, SNSBlocks.TOOTHPASTE_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_BRICKS_WALL, SNSBlocks.TOOTHPASTE_BRICKS);
        wallItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL, SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
        wallItem(SNSBlocks.TOOTHPASTE_STONE_WALL, SNSBlocks.TOOTHPASTE_STONE);



    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory")).texture("texture",
                new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(SNSMod.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
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

    private ItemModelBuilder simpleTorch(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SNSMod.MOD_ID,"block/" + block.getId().getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(SNSMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

}
