package net.starlotte.snsmod.block;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.item.SNSItems;

import java.util.function.Supplier;

public class SNSBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SNSMod.MOD_ID);
//HERB
    //CANDY_CANE
    public static final RegistryObject<Block> CANDY_CANE_BLOCK = registerBlock("candy_cane_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_BUTTON = registerBlock("candy_cane_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_FENCE = registerBlock("candy_cane_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_FENCE_GATE = registerBlock("candy_cane_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_PRESSURE_PLATE = registerBlock("candy_cane_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_SLAB = registerBlock("candy_cane_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_STAIRS = registerBlock("candy_cane_block_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BLOCK_WALL = registerBlock("candy_cane_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CANDY_CANE_BRICK
    public static final RegistryObject<Block> CANDY_CANE_BRICKS = registerBlock("candy_cane_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BUTTON = registerBlock("candy_cane_bricks_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_FENCE = registerBlock("candy_cane_bricks_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_FENCE_GATE = registerBlock("candy_cane_bricks_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_PRESSURE_PLATE = registerBlock("candy_cane_bricks_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_SLAB = registerBlock("candy_cane_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_STAIRS = registerBlock("candy_cane_bricks_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_WALL = registerBlock("candy_cane_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CANDY_CANE_BRICK_BLUE
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE = registerBlock("candy_cane_bricks_blue", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_BUTTON = registerBlock("candy_cane_bricks_blue_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_FENCE = registerBlock("candy_cane_bricks_blue_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_FENCE_GATE = registerBlock("candy_cane_bricks_blue_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_PRESSURE_PLATE = registerBlock("candy_cane_bricks_blue_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_SLAB = registerBlock("candy_cane_bricks_blue_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_STAIRS = registerBlock("candy_cane_bricks_blue_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BRICKS_BLUE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_BLUE_WALL = registerBlock("candy_cane_bricks_blue_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CANDY_CANE_BRICK_GREEN
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN = registerBlock("candy_cane_bricks_green", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_BUTTON = registerBlock("candy_cane_bricks_green_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_FENCE = registerBlock("candy_cane_bricks_green_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_FENCE_GATE = registerBlock("candy_cane_bricks_green_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_PRESSURE_PLATE = registerBlock("candy_cane_bricks_green_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_SLAB = registerBlock("candy_cane_bricks_green_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_STAIRS = registerBlock("candy_cane_bricks_green_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BRICKS_GREEN.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_GREEN_WALL = registerBlock("candy_cane_bricks_green_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CANDY_CANE_BRICK_LIGHT_BLUE
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW = registerBlock("candy_cane_bricks_yellow", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_BUTTON = registerBlock("candy_cane_bricks_yellow_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_FENCE = registerBlock("candy_cane_bricks_yellow_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_FENCE_GATE = registerBlock("candy_cane_bricks_yellow_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_PRESSURE_PLATE = registerBlock("candy_cane_bricks_yellow_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_SLAB = registerBlock("candy_cane_bricks_yellow_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_STAIRS = registerBlock("candy_cane_bricks_yellow_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_YELLOW_WALL = registerBlock("candy_cane_bricks_yellow_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CANDY_CANE_BRICK_YELLOW
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE = registerBlock("candy_cane_bricks_light_blue", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_BUTTON = registerBlock("candy_cane_bricks_light_blue_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE = registerBlock("candy_cane_bricks_light_blue_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE = registerBlock("candy_cane_bricks_light_blue_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_PRESSURE_PLATE = registerBlock("candy_cane_bricks_light_blue_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB = registerBlock("candy_cane_bricks_light_blue_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS = registerBlock("candy_cane_bricks_light_blue_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_BRICKS_LIGHT_BLUE_WALL = registerBlock("candy_cane_bricks_light_blue_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //HUMBUG
    public static final RegistryObject<Block> HUMBUG_BLOCK = registerBlock("humbug_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HUMBUG_BLOCK_BUTTON = registerBlock("humbug_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HUMBUG_BLOCK_FENCE = registerBlock("humbug_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HUMBUG_BLOCK_FENCE_GATE = registerBlock("humbug_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HUMBUG_BLOCK_PRESSURE_PLATE = registerBlock("humbug_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HUMBUG_BLOCK_SLAB = registerBlock("humbug_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HUMBUG_BLOCK_STAIRS = registerBlock("humbug_block_stairs", () -> new StairBlock(() -> SNSBlocks.HUMBUG_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HUMBUG_BLOCK_WALL = registerBlock("humbug_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //HUMBUG_BRICKS
    public static final RegistryObject<Block> HUMBUG_BRICKS = registerBlock("humbug_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HUMBUG_BRICKS_BUTTON = registerBlock("humbug_bricks_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HUMBUG_BRICKS_FENCE = registerBlock("humbug_bricks_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HUMBUG_BRICKS_FENCE_GATE = registerBlock("humbug_bricks_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HUMBUG_BRICKS_PRESSURE_PLATE = registerBlock("humbug_bricks_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HUMBUG_BRICKS_SLAB = registerBlock("humbug_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HUMBUG_BRICKS_STAIRS = registerBlock("humbug_bricks_stairs", () -> new StairBlock(() -> SNSBlocks.HUMBUG_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HUMBUG_BRICKS_WALL = registerBlock("humbug_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //HARDENED_HUMBUG
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK = registerBlock("hardened_humbug_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_BUTTON = registerBlock("hardened_humbug_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_FENCE = registerBlock("hardened_humbug_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_FENCE_GATE = registerBlock("hardened_humbug_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_PRESSURE_PLATE = registerBlock("hardened_humbug_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_SLAB = registerBlock("hardened_humbug_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_STAIRS = registerBlock("hardened_humbug_block_stairs", () -> new StairBlock(() -> SNSBlocks.HUMBUG_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_HUMBUG_BLOCK_WALL = registerBlock("hardened_humbug_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //MINT
    public static final RegistryObject<Block> MINT_BLOCK = registerBlock("mint_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MINT_BLOCK_BUTTON = registerBlock("mint_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> MINT_BLOCK_FENCE = registerBlock("mint_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MINT_BLOCK_FENCE_GATE = registerBlock("mint_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MINT_BLOCK_PRESSURE_PLATE = registerBlock("mint_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> MINT_BLOCK_SLAB = registerBlock("mint_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MINT_BLOCK_STAIRS = registerBlock("mint_block_stairs", () -> new StairBlock(() -> SNSBlocks.MINT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MINT_BLOCK_WALL = registerBlock("mint_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //MINT_BRICKS
    public static final RegistryObject<Block> MINT_BRICKS = registerBlock("mint_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MINT_BRICKS_BUTTON = registerBlock("mint_bricks_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> MINT_BRICKS_FENCE = registerBlock("mint_bricks_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MINT_BRICKS_FENCE_GATE = registerBlock("mint_bricks_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MINT_BRICKS_PRESSURE_PLATE = registerBlock("mint_bricks_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> MINT_BRICKS_SLAB = registerBlock("mint_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MINT_BRICKS_STAIRS = registerBlock("mint_bricks_stairs", () -> new StairBlock(() -> SNSBlocks.MINT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MINT_BRICKS_WALL = registerBlock("mint_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //HARDENED_MINT
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK = registerBlock("hardened_mint_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_BUTTON = registerBlock("hardened_mint_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_FENCE = registerBlock("hardened_mint_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_FENCE_GATE = registerBlock("hardened_mint_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_PRESSURE_PLATE = registerBlock("hardened_mint_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_SLAB = registerBlock("hardened_mint_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_STAIRS = registerBlock("hardened_mint_block_stairs", () -> new StairBlock(() -> SNSBlocks.MINT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_WALL = registerBlock("hardened_mint_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //TOOTHPASTE
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK = registerBlock("toothpaste_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_BUTTON = registerBlock("toothpaste_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_FENCE = registerBlock("toothpaste_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_FENCE_GATE = registerBlock("toothpaste_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_PRESSURE_PLATE = registerBlock("toothpaste_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_SLAB = registerBlock("toothpaste_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_STAIRS = registerBlock("toothpaste_block_stairs", () -> new StairBlock(() -> SNSBlocks.TOOTHPASTE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_WALL = registerBlock("toothpaste_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //TOOTHPASTE_BRICKS
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS = registerBlock("toothpaste_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_BUTTON = registerBlock("toothpaste_bricks_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_FENCE = registerBlock("toothpaste_bricks_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_FENCE_GATE = registerBlock("toothpaste_bricks_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_PRESSURE_PLATE = registerBlock("toothpaste_bricks_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_SLAB = registerBlock("toothpaste_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_STAIRS = registerBlock("toothpaste_bricks_stairs", () -> new StairBlock(() -> SNSBlocks.TOOTHPASTE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_WALL = registerBlock("toothpaste_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //HARDENED_TOOTHPASTE
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK = registerBlock("hardened_toothpaste_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_BUTTON = registerBlock("hardened_toothpaste_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_FENCE = registerBlock("hardened_toothpaste_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE = registerBlock("hardened_toothpaste_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE = registerBlock("hardened_toothpaste_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_SLAB = registerBlock("hardened_toothpaste_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_STAIRS = registerBlock("hardened_toothpaste_block_stairs", () -> new StairBlock(() -> SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_WALL = registerBlock("hardened_toothpaste_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return SNSItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
