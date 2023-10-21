package net.starlotte.snsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;

public class SNSBlockStateProvider extends BlockStateProvider {
    public SNSBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SNSMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//CANDY_CANE
        blockWithItem(SNSBlocks.CANDY_CANE_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BLOCK_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BLOCK_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BLOCK_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));

//CANDY_CANE_BRICK
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BRICKS_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BRICKS_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICKS_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICKS_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BRICKS_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BRICKS_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BRICKS_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS.get()));
//CANDY_CANE_BRICK_BLUE
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get()));
//CANDY_CANE_BRICK_GREEN
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get()));
//CANDY_CANE_BRICK_LIGHT_BLUE
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get()));
 //CANDY_CANE_BRICK_YELLOW
        blockWithItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get()));
 //HUMBUG
        blockWithItem(SNSBlocks.HUMBUG_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.HUMBUG_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.HUMBUG_BLOCK_FENCE.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.HUMBUG_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.HUMBUG_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.HUMBUG_BLOCK_SLAB.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.HUMBUG_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.HUMBUG_BLOCK_WALL.get(), blockTexture(SNSBlocks.HUMBUG_BLOCK.get()));
//HUMBUG_BRICKS
        blockWithItem(SNSBlocks.HUMBUG_BRICKS);
        buttonBlock((ButtonBlock) SNSBlocks.HUMBUG_BRICKS_BUTTON.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        fenceBlock((FenceBlock) SNSBlocks.HUMBUG_BRICKS_FENCE.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.HUMBUG_BRICKS_FENCE_GATE.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.HUMBUG_BRICKS_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        slabBlock((SlabBlock) SNSBlocks.HUMBUG_BRICKS_SLAB.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        stairsBlock((StairBlock) SNSBlocks.HUMBUG_BRICKS_STAIRS.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
        wallBlock((WallBlock) SNSBlocks.HUMBUG_BRICKS_WALL.get(), blockTexture(SNSBlocks.HUMBUG_BRICKS.get()));
//HARDENED_HUMBUG
        blockWithItem(SNSBlocks.HARDENED_HUMBUG_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_SLAB.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL.get(), blockTexture(SNSBlocks.HARDENED_HUMBUG_BLOCK.get()));
//MINT
        blockWithItem(SNSBlocks.MINT_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.MINT_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.MINT_BLOCK_FENCE.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.MINT_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.MINT_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.MINT_BLOCK_SLAB.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.MINT_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.MINT_BLOCK_WALL.get(), blockTexture(SNSBlocks.MINT_BLOCK.get()));
//MINT_BRICKS
        blockWithItem(SNSBlocks.MINT_BRICKS);
        buttonBlock((ButtonBlock) SNSBlocks.MINT_BRICKS_BUTTON.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        fenceBlock((FenceBlock) SNSBlocks.MINT_BRICKS_FENCE.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.MINT_BRICKS_FENCE_GATE.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.MINT_BRICKS_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        slabBlock((SlabBlock) SNSBlocks.MINT_BRICKS_SLAB.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        stairsBlock((StairBlock) SNSBlocks.MINT_BRICKS_STAIRS.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
        wallBlock((WallBlock) SNSBlocks.MINT_BRICKS_WALL.get(), blockTexture(SNSBlocks.MINT_BRICKS.get()));
//HARDENED_MINT
        blockWithItem(SNSBlocks.HARDENED_MINT_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.HARDENED_MINT_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        doorBlockWithRenderType((DoorBlock)SNSBlocks.HARDENED_MINT_BLOCK_DOOR.get(), modLoc("block/hardened_mint_block_door_bottom"), modLoc("block/hardened_mint_block_door_top"), "translucent");
        fenceBlock((FenceBlock) SNSBlocks.HARDENED_MINT_BLOCK_FENCE.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.HARDENED_MINT_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.HARDENED_MINT_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.HARDENED_MINT_BLOCK_SLAB.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.HARDENED_MINT_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
        trapdoorBlockWithRenderType((TrapDoorBlock) SNSBlocks.HARDENED_MINT_BLOCK_TRAPDOOR.get(), modLoc("block/hardened_mint_block_trapdoor"), true, "translucent");
        wallBlock((WallBlock) SNSBlocks.HARDENED_MINT_BLOCK_WALL.get(), blockTexture(SNSBlocks.HARDENED_MINT_BLOCK.get()));
//TOOTHPASTE
        blockWithItem(SNSBlocks.TOOTHPASTE_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.TOOTHPASTE_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.TOOTHPASTE_BLOCK_FENCE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.TOOTHPASTE_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.TOOTHPASTE_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.TOOTHPASTE_BLOCK_SLAB.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.TOOTHPASTE_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.TOOTHPASTE_BLOCK_WALL.get(), blockTexture(SNSBlocks.TOOTHPASTE_BLOCK.get()));
//TOOTHPASTE_BRICKS
        blockWithItem(SNSBlocks.TOOTHPASTE_BRICKS);
        buttonBlock((ButtonBlock) SNSBlocks.TOOTHPASTE_BRICKS_BUTTON.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        fenceBlock((FenceBlock) SNSBlocks.TOOTHPASTE_BRICKS_FENCE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.TOOTHPASTE_BRICKS_FENCE_GATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.TOOTHPASTE_BRICKS_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        slabBlock((SlabBlock) SNSBlocks.TOOTHPASTE_BRICKS_SLAB.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        stairsBlock((StairBlock) SNSBlocks.TOOTHPASTE_BRICKS_STAIRS.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        wallBlock((WallBlock) SNSBlocks.TOOTHPASTE_BRICKS_WALL.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
//HARDENED_TOOTHPASTE
        blockWithItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK);
        buttonBlock((ButtonBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_SLAB.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL.get(), blockTexture(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get()));
// BLOCK ITEMS
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_STAIRS);
        simpleBlockWithItem(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get(), models().orientableWithBottom(SNSBlocks.CANDY_CANE_GRASS_BLOCK.getId().getPath(),
                modLoc("block/candy_cane_grass_block_side"),
                modLoc("block/candy_cane_grass_block_side"),
                new ResourceLocation("snsmod:block/candy_cane_grass_block_bottom"),
                modLoc("block/candy_cane_grass_block_top")));

        blockItem(SNSBlocks.CANDY_CANE_BRICKS_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_STAIRS);

        blockItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_BLUE_STAIRS);

        blockItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_GREEN_STAIRS);

        blockItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS);

        blockItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_STAIRS);

        blockItem(SNSBlocks.HUMBUG_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.HUMBUG_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.HUMBUG_BLOCK_SLAB);
        blockItem(SNSBlocks.HUMBUG_BLOCK_STAIRS);

        blockItem(SNSBlocks.HUMBUG_BRICKS_FENCE_GATE);
        blockItem(SNSBlocks.HUMBUG_BRICKS_PRESSURE_PLATE);
        blockItem(SNSBlocks.HUMBUG_BRICKS_SLAB);
        blockItem(SNSBlocks.HUMBUG_BRICKS_STAIRS);

        blockItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_SLAB);
        blockItem(SNSBlocks.HARDENED_HUMBUG_BLOCK_STAIRS);

        blockItem(SNSBlocks.MINT_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.MINT_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.MINT_BLOCK_SLAB);
        blockItem(SNSBlocks.MINT_BLOCK_STAIRS);

        blockItem(SNSBlocks.MINT_BRICKS_FENCE_GATE);
        blockItem(SNSBlocks.MINT_BRICKS_PRESSURE_PLATE);
        blockItem(SNSBlocks.MINT_BRICKS_SLAB);
        blockItem(SNSBlocks.MINT_BRICKS_STAIRS);

        blockItem(SNSBlocks.HARDENED_MINT_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.HARDENED_MINT_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.HARDENED_MINT_BLOCK_SLAB);
        blockItem(SNSBlocks.HARDENED_MINT_BLOCK_STAIRS);
        blockItem(SNSBlocks.HARDENED_MINT_BLOCK_TRAPDOOR, "_bottom");

        blockItem(SNSBlocks.TOOTHPASTE_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.TOOTHPASTE_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.TOOTHPASTE_BLOCK_SLAB);
        blockItem(SNSBlocks.TOOTHPASTE_BLOCK_STAIRS);

        blockItem(SNSBlocks.TOOTHPASTE_BRICKS_FENCE_GATE);
        blockItem(SNSBlocks.TOOTHPASTE_BRICKS_PRESSURE_PLATE);
        blockItem(SNSBlocks.TOOTHPASTE_BRICKS_SLAB);
        blockItem(SNSBlocks.TOOTHPASTE_BRICKS_STAIRS);

        blockItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_SLAB);
        blockItem(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_STAIRS);



    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("snsmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("snsmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
