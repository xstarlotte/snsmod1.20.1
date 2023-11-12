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
        blockWithItem(SNSBlocks.CANDY_CANE_DIRT);
        doorBlockWithRenderType((DoorBlock)SNSBlocks.CANDY_CANE_DOOR.get(), modLoc("block/candy_cane_door_bottom"), modLoc("block/candy_cane_door_top"), "translucent");
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_BLOCK_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_BLOCK_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_BLOCK_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_BLOCK_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_BLOCK.get()));
        trapdoorBlockWithRenderType((TrapDoorBlock) SNSBlocks.CANDY_CANE_TRAPDOOR.get(), modLoc("block/candy_cane_trapdoor"), true, "translucent");
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
//CANDY CANE PLANKS
        blockWithItem(SNSBlocks.CANDY_CANE_PLANKS);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_PLANK_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_PLANK_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_PLANK_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_PLANK_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_PLANK_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_PLANK_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_PLANK_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
 //CANDY CANE STONE
        blockWithItem(SNSBlocks.CANDY_CANE_STONE);
        buttonBlock((ButtonBlock) SNSBlocks.CANDY_CANE_STONE_BUTTON.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        fenceBlock((FenceBlock) SNSBlocks.CANDY_CANE_STONE_FENCE.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        slabBlock((SlabBlock) SNSBlocks.CANDY_CANE_STONE_SLAB.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        stairsBlock((StairBlock) SNSBlocks.CANDY_CANE_STONE_STAIRS.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
        wallBlock((WallBlock) SNSBlocks.CANDY_CANE_STONE_WALL.get(), blockTexture(SNSBlocks.CANDY_CANE_STONE.get()));
 //CINNAMON
        blockWithItem(SNSBlocks.CINNAMON_DIRT);
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
        blockWithItem(SNSBlocks.MINT_DIRT);
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
        doorBlockWithRenderType((DoorBlock)SNSBlocks.TOOTHPASTE_DOOR.get(), modLoc("block/toothpaste_door_bottom"), modLoc("block/toothpaste_door_top"), "translucent");
//TOOTHPASTE_BRICKS
        blockWithItem(SNSBlocks.TOOTHPASTE_BRICKS);
        buttonBlock((ButtonBlock) SNSBlocks.TOOTHPASTE_BRICKS_BUTTON.get(), blockTexture(SNSBlocks.TOOTHPASTE_BRICKS.get()));
        doorBlockWithRenderType((DoorBlock)SNSBlocks.TOOTHPASTE_BRICKS_DOOR.get(), modLoc("block/toothpaste_bricks_door_bottom"), modLoc("block/toothpaste_bricks_door_top"), "translucent");
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
//TOOTHPASTE STONE
        blockWithItem(SNSBlocks.TOOTHPASTE_STONE);
        buttonBlock((ButtonBlock) SNSBlocks.TOOTHPASTE_STONE_BUTTON.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        fenceBlock((FenceBlock) SNSBlocks.TOOTHPASTE_STONE_FENCE.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        fenceGateBlock((FenceGateBlock) SNSBlocks.TOOTHPASTE_STONE_FENCE_GATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) SNSBlocks.TOOTHPASTE_STONE_PRESSURE_PLATE.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        slabBlock((SlabBlock) SNSBlocks.TOOTHPASTE_STONE_SLAB.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        stairsBlock((StairBlock) SNSBlocks.TOOTHPASTE_STONE_STAIRS.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
        wallBlock((WallBlock) SNSBlocks.TOOTHPASTE_STONE_WALL.get(), blockTexture(SNSBlocks.TOOTHPASTE_STONE.get()));
// BLOCK ITEMS
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_BLOCK_STAIRS);
        blockItem(SNSBlocks.CANDY_CANE_TRAPDOOR, "_bottom");

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

        blockItem(SNSBlocks.CANDY_CANE_PLANK_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_PLANK_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_PLANK_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_PLANK_STAIRS);

        blockItem(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE);
        blockItem(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE);
        blockItem(SNSBlocks.CANDY_CANE_STONE_SLAB);
        blockItem(SNSBlocks.CANDY_CANE_STONE_STAIRS);

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

        blockItem(SNSBlocks.TOOTHPASTE_STONE_FENCE_GATE);
        blockItem(SNSBlocks.TOOTHPASTE_STONE_PRESSURE_PLATE);
        blockItem(SNSBlocks.TOOTHPASTE_STONE_SLAB);
        blockItem(SNSBlocks.TOOTHPASTE_STONE_STAIRS);

//DECORATION
        //CANDY CANE
        horizontalBlock(SNSBlocks.CANDY_CANE_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_cat_teddy")));
        horizontalBlock(SNSBlocks.LEMON_CANDY_CANE_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/lemon_candy_cane_cat_teddy")));
        horizontalBlock(SNSBlocks.MINT_CANDY_CANE_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/mint_candy_cane_cat_teddy")));
        horizontalBlock(SNSBlocks.PEPPERMINT_CANDY_CANE_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/peppermint_candy_cane_cat_teddy")));
        horizontalBlock(SNSBlocks.SPEARMINT_CANDY_CANE_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/spearmint_candy_cane_cat_teddy")));
        horizontalBlock(SNSBlocks.HUMBUG_CAT_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/humbug_cat_teddy")));

        horizontalBlock(SNSBlocks.CANDY_CANE_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_wolf_teddy")));
        horizontalBlock(SNSBlocks.LEMON_CANDY_CANE_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/lemon_candy_cane_wolf_teddy")));
        horizontalBlock(SNSBlocks.MINT_CANDY_CANE_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/mint_candy_cane_wolf_teddy")));
        horizontalBlock(SNSBlocks.PEPPERMINT_CANDY_CANE_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/peppermint_candy_cane_wolf_teddy")));
        horizontalBlock(SNSBlocks.SPEARMINT_CANDY_CANE_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/spearmint_candy_cane_wolf_teddy")));
        horizontalBlock(SNSBlocks.HUMBUG_WOLF_TEDDY.get(), new ModelFile.UncheckedModelFile(modLoc("block/humbug_wolf_teddy")));

        horizontalBlock(SNSBlocks.CANDY_CANE_TABLE.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_table")));

        horizontalBlock(SNSBlocks.CANDY_CANE_BONE.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_bone")));
        horizontalBlock(SNSBlocks.CANDY_CANE_FOOD_BOWL.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_food_bowl")));
        horizontalBlock(SNSBlocks.CANDY_CANE_WATER_BOWL.get(), new ModelFile.UncheckedModelFile(modLoc("block/candy_cane_water_bowl")));
//FLORA
        saplingBlock(SNSBlocks.CANDY_CANE_SAPLING);
        simpleBlock(SNSBlocks.CANDY_CANE_BUSH.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_BUSH.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_BUSH.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_CARNATION.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_CARNATION.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_CARNATION.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_CARNATIONS.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_CARNATIONS.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_CARNATIONS.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_FLOWER.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_FLOWER.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_FLOWER.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_FLOWER_2.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_FLOWER_2.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_FLOWER_2.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_FLOWER_3.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_FLOWER_3.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_FLOWER_3.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_FLOWER_4.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_FLOWER_4.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_FLOWER_4.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_GRASS.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_GRASS.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_GRASS.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.CANDY_CANE_GRASS_LONG.get(),
                models().cross(blockTexture(SNSBlocks.CANDY_CANE_GRASS_LONG.get()).getPath(), blockTexture(SNSBlocks.CANDY_CANE_GRASS_LONG.get())).renderType("cutout"));

        simpleBlock(SNSBlocks.MINT_BUSH.get(),
                models().cross(blockTexture(SNSBlocks.MINT_BUSH.get()).getPath(), blockTexture(SNSBlocks.MINT_BUSH.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.MINT_CHOCOLATE_TULIP.get(),
                models().cross(blockTexture(SNSBlocks.MINT_CHOCOLATE_TULIP.get()).getPath(), blockTexture(SNSBlocks.MINT_CHOCOLATE_TULIP.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.MINT_FLOWER.get(),
                models().cross(blockTexture(SNSBlocks.MINT_FLOWER.get()).getPath(), blockTexture(SNSBlocks.MINT_FLOWER.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.MINT_IMPEONY.get(),
                models().cross(blockTexture(SNSBlocks.MINT_IMPEONY.get()).getPath(), blockTexture(SNSBlocks.MINT_IMPEONY.get())).renderType("cutout"));
        simpleBlock(SNSBlocks.POLO_PLANT.get(),
                models().cross(blockTexture(SNSBlocks.POLO_PLANT.get()).getPath(), blockTexture(SNSBlocks.POLO_PLANT.get())).renderType("cutout"));
//MULTI TEXTURE BLOCKS
        simpleBlockWithItem(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get(), models().orientableWithBottom(SNSBlocks.CANDY_CANE_GRASS_BLOCK.getId().getPath(),
                modLoc("block/candy_cane_grass_block_side"),
                modLoc("block/candy_cane_grass_block_side"),
                new ResourceLocation("snsmod:block/candy_cane_grass_block_bottom"),
                modLoc("block/candy_cane_grass_block_top")));
        simpleBlockWithItem(SNSBlocks.CINNAMON_BLOCK.get(), models().orientableWithBottom(SNSBlocks.CINNAMON_BLOCK.getId().getPath(),
                modLoc("block/cinnamon_block_side"),
                modLoc("block/cinnamon_block_side"),
                new ResourceLocation("snsmod:block/cinnamon_block_bottom"),
                modLoc("block/cinnamon_block_top")));
        simpleBlockWithItem(SNSBlocks.CINNAMON_GRASS_BLOCK.get(), models().orientableWithBottom(SNSBlocks.CINNAMON_GRASS_BLOCK.getId().getPath(),
                modLoc("block/cinnamon_grass_block_side"),
                modLoc("block/cinnamon_grass_block_side"),
                new ResourceLocation("snsmod:block/cinnamon_grass_block_bottom"),
                modLoc("block/cinnamon_grass_block_top")));
        simpleBlockWithItem(SNSBlocks.MINT_GRASS_BLOCK.get(), models().orientableWithBottom(SNSBlocks.MINT_GRASS_BLOCK.getId().getPath(),
                modLoc("block/mint_grass_block_side"),
                modLoc("block/mint_grass_block_side"),
                new ResourceLocation("snsmod:block/mint_grass_block_bottom"),
                modLoc("block/mint_grass_block_top")));
        simpleBlockWithItem(SNSBlocks.TOOTHPASTE_GRASS_BLOCK.get(), models().orientableWithBottom(SNSBlocks.TOOTHPASTE_GRASS_BLOCK.getId().getPath(),
                modLoc("block/toothpaste_grass_block_side"),
                modLoc("block/toothpaste_grass_block_side"),
                new ResourceLocation("snsmod:block/toothpaste_grass_block_bottom"),
                modLoc("block/toothpaste_grass_block_top")));

//PORTALS

        blockWithItem(SNSBlocks.HERB_MAYFAIR_PORTAL);

//SIGN
        hangingSignBlock(SNSBlocks.CANDY_CANE_HANGING_SIGN.get(), SNSBlocks.CANDY_CANE_WALL_HANGING_SIGN.get(),
                blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
        signBlock(((StandingSignBlock) SNSBlocks.CANDY_CANE_SIGN.get()), ((WallSignBlock) SNSBlocks.CANDY_CANE_WALL_SIGN.get()),
                blockTexture(SNSBlocks.CANDY_CANE_PLANKS.get()));
//TREE
        axisBlock((RotatedPillarBlock) SNSBlocks.STRIPPED_CANDY_CANE_STALK.get(), new ResourceLocation(SNSMod.MOD_ID, "block/stripped_candy_cane_stalk"),
               new ResourceLocation(SNSMod.MOD_ID, "block/stripped_candy_cane_stalk_top"));
        blockItem(SNSBlocks.CANDY_CANE_STALK);
        blockItem(SNSBlocks.STRIPPED_CANDY_CANE_STALK);
        leavesBlock(SNSBlocks.CANDY_CANE_LEAVES);
        logBlock((RotatedPillarBlock) SNSBlocks.CANDY_CANE_STALK.get());

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

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
   /* @Override
    private void sideBottomTop(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    } */
}
