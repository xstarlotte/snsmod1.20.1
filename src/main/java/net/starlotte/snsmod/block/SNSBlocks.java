package net.starlotte.snsmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.custom.*;
import net.starlotte.snsmod.block.custom.decorations.CandyCaneTableBlock;
import net.starlotte.snsmod.block.custom.decorations.pets.CandyCaneBoneBlock;
import net.starlotte.snsmod.block.custom.decorations.pets.CandyCaneBowlBlock;
import net.starlotte.snsmod.block.custom.decorations.teddies.CandyCaneCatTeddyBlock;
import net.starlotte.snsmod.block.custom.decorations.teddies.CandyCaneWolfTeddyBlock;
import net.starlotte.snsmod.item.SNSItems;
import net.starlotte.snsmod.util.SNSWoodTypes;
import net.starlotte.snsmod.worldgen.tree.CandyCaneTreeGrower;

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
    public static final RegistryObject<Block> CANDY_CANE_DIRT = registerBlock("candy_cane_dirt", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> CANDY_CANE_DOOR = registerBlock("candy_cane_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_GRASS_BLOCK = registerBlock("candy_cane_grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> CANDY_CANE_LEAVES = registerBlock("candy_cane_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return true;}
        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 60;}
        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 30;}});
    public static final RegistryObject<Block> CANDY_CANE_PLANKS = registerBlock("candy_cane_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)){
        @Override
        public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return true;}
        @Override
        public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 20;}
        @Override
        public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {return 5;}});
    public static final RegistryObject<Block> CANDY_CANE_PLANK_BUTTON = registerBlock("candy_cane_plank_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON).sound(SoundType.WOOD), BlockSetType.CHERRY, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_FENCE = registerBlock("candy_cane_plank_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_FENCE_GATE = registerBlock("candy_cane_plank_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_PRESSURE_PLATE = registerBlock("candy_cane_plank_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHERRY_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.CHERRY));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_SLAB = registerBlock("candy_cane_plank_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_STAIRS = registerBlock("candy_cane_plank_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CANDY_CANE_PLANK_WALL = registerBlock("candy_cane_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CANDY_CANE_STALK = registerBlock("candy_cane_stalk", () -> new SNSFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));
    public static final RegistryObject<Block> STRIPPED_CANDY_CANE_STALK = registerBlock("stripped_candy_cane_stalk", () -> new SNSFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final RegistryObject<Block> CANDY_CANE_TORCH = registerBlock("candy_cane_torch", () -> new SNSTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).lightLevel((state) -> 14)));
    public static final RegistryObject<Block> CANDY_CANE_WALL_TORCH = registerBlock("candy_cane_wall_torch", () -> new SNSWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.WALL_TORCH).lightLevel((state) -> 14).lootFrom(SNSBlocks.CANDY_CANE_TORCH)));
    public static final RegistryObject<Block> CANDY_CANE_TRAPDOOR = registerBlock("candy_cane_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
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
    //CANDY CANE STONE
    public static final RegistryObject<Block> CANDY_CANE_STONE = registerBlock("candy_cane_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_STONE_BUTTON = registerBlock("candy_cane_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> CANDY_CANE_STONE_FENCE = registerBlock("candy_cane_stone_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_STONE_FENCE_GATE = registerBlock("candy_cane_stone_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CANDY_CANE_STONE_PRESSURE_PLATE = registerBlock("candy_cane_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> CANDY_CANE_STONE_SLAB = registerBlock("candy_cane_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_STONE_STAIRS = registerBlock("candy_cane_stone_stairs", () -> new StairBlock(() -> SNSBlocks.CANDY_CANE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CANDY_CANE_STONE_WALL = registerBlock("candy_cane_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //CINNAMON
    public static final RegistryObject<Block> CINNAMON_BLOCK = registerBlock("cinnamon_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> CINNAMON_DIRT = registerBlock("cinnamon_dirt", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> CINNAMON_GRASS_BLOCK = registerBlock("cinnamon_grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
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
    public static final RegistryObject<Block> MINT_DIRT = registerBlock("mint_dirt", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> MINT_GRASS_BLOCK = registerBlock("mint_grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
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
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_DOOR = registerBlock("hardened_mint_block_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_FENCE = registerBlock("hardened_mint_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_FENCE_GATE = registerBlock("hardened_mint_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_PRESSURE_PLATE = registerBlock("hardened_mint_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_SLAB = registerBlock("hardened_mint_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_STAIRS = registerBlock("hardened_mint_block_stairs", () -> new StairBlock(() -> SNSBlocks.MINT_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_TRAPDOOR = registerBlock("hardened_mint_block_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_MINT_BLOCK_WALL = registerBlock("hardened_mint_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
//TOOTHPASTE
    //HARDENED
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK = registerBlock("hardened_toothpaste_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_BUTTON = registerBlock("hardened_toothpaste_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_FENCE = registerBlock("hardened_toothpaste_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE = registerBlock("hardened_toothpaste_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE = registerBlock("hardened_toothpaste_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_SLAB = registerBlock("hardened_toothpaste_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_STAIRS = registerBlock("hardened_toothpaste_block_stairs", () -> new StairBlock(() -> SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HARDENED_TOOTHPASTE_BLOCK_WALL = registerBlock("hardened_toothpaste_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //TOOTHPASTE
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK = registerBlock("toothpaste_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_BUTTON = registerBlock("toothpaste_block_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_FENCE = registerBlock("toothpaste_block_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_FENCE_GATE = registerBlock("toothpaste_block_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_PRESSURE_PLATE = registerBlock("toothpaste_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_SLAB = registerBlock("toothpaste_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_STAIRS = registerBlock("toothpaste_block_stairs", () -> new StairBlock(() -> SNSBlocks.TOOTHPASTE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BLOCK_WALL = registerBlock("toothpaste_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_DOOR = registerBlock("toothpaste_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_GRASS_BLOCK = registerBlock("toothpaste_grass_block", () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    //TOOTHPASTE_BRICKS
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS = registerBlock("toothpaste_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_BUTTON = registerBlock("toothpaste_bricks_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_DOOR = registerBlock("toothpaste_bricks_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_FENCE = registerBlock("toothpaste_bricks_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_FENCE_GATE = registerBlock("toothpaste_bricks_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_PRESSURE_PLATE = registerBlock("toothpaste_bricks_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_SLAB = registerBlock("toothpaste_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_STAIRS = registerBlock("toothpaste_bricks_stairs", () -> new StairBlock(() -> SNSBlocks.TOOTHPASTE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_BRICKS_WALL = registerBlock("toothpaste_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //TOOTHPASTE STONE
    public static final RegistryObject<Block> TOOTHPASTE_STONE = registerBlock("toothpaste_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_BUTTON = registerBlock("toothpaste_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE), BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_FENCE = registerBlock("toothpaste_stone_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_FENCE_GATE = registerBlock("toothpaste_stone_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_PRESSURE_PLATE = registerBlock("toothpaste_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.STONE), BlockSetType.STONE));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_SLAB = registerBlock("toothpaste_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_STAIRS = registerBlock("toothpaste_stone_stairs", () -> new StairBlock(() -> SNSBlocks.TOOTHPASTE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOOTHPASTE_STONE_WALL = registerBlock("toothpaste_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
//FLORA
    public static final RegistryObject<Block> CANDY_CANE_BUSH = registerBlock("candy_cane_bush",
        () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_CARNATION = registerBlock("candy_cane_carnation",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_CARNATIONS = registerBlock("candy_cane_carnations",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_FLOWER = registerBlock("candy_cane_flower",
        () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_FLOWER_2 = registerBlock("candy_cane_flower_2",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_FLOWER_3 = registerBlock("candy_cane_flower_3",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_FLOWER_4 = registerBlock("candy_cane_flower_4",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_GRASS = registerBlock("candy_cane_grass",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> CANDY_CANE_GRASS_LONG = registerBlock("candy_cane_grass_long",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> MINT_BUSH = registerBlock("mint_bush",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> MINT_CHOCOLATE_TULIP = registerBlock("mint_chocolate_tulip",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> MINT_FLOWER = registerBlock("mint_flower",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> MINT_IMPEONY = registerBlock("mint_impeony",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POLO_PLANT = registerBlock("polo_plant",
            () -> new FlowerBlock(() -> MobEffects.HUNGER, 6, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    //POTTED FLORA
    public static final RegistryObject<Block> POTTED_CANDY_CANE_BUSH = BLOCKS.register("potted_candy_cane_bush",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_BUSH, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_CARNATION = BLOCKS.register("potted_candy_cane_carnation",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_CARNATION, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_CARNATIONS = BLOCKS.register("potted_candy_cane_carnations",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_CARNATIONS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER = BLOCKS.register("potted_candy_cane_flower",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_2 = BLOCKS.register("potted_candy_cane_flower_2",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_2, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_3 = BLOCKS.register("potted_candy_cane_flower_3",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_3, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_FLOWER_4 = BLOCKS.register("potted_candy_cane_flower_4",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_4, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_GRASS = BLOCKS.register("potted_candy_cane_grass",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_GRASS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_CANDY_CANE_GRASS_LONG = BLOCKS.register("potted_candy_cane_grass_long",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_GRASS_LONG, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    public static final RegistryObject<Block> POTTED_MINT_BUSH = BLOCKS.register("potted_mint_bush",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MINT_BUSH, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_MINT_CHOCOLATE_TULIP = BLOCKS.register("potted_mint_chocolate_tulip",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MINT_BUSH, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_MINT_FLOWER = BLOCKS.register("potted_mint_flower",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MINT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_MINT_IMPEONY = BLOCKS.register("potted_mint_impeony",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MINT_BUSH, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> POTTED_POLO_PLANT = BLOCKS.register("potted_polo_plant",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MINT_BUSH, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
//SAPLING
    public static final RegistryObject<Block> CANDY_CANE_SAPLING = registerBlock("candy_cane_sapling", () -> new SaplingBlock(new CandyCaneTreeGrower(), (BlockBehaviour.Properties.copy(Blocks.CHERRY_SAPLING))));
//POTTED SAPLING
    public static final RegistryObject<Block> POTTED_CANDY_CANE_SAPLING = BLOCKS.register("potted_candy_cane_sapling",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_CHERRY_SAPLING)));
//BLOCK ENTITIES
    //FURNACES
    public static final RegistryObject<Block> CANDY_CANE_FURNACE = registerBlock("candy_cane_furnace", () -> new CandyCaneFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //SIGNS
    public static final RegistryObject<Block> CANDY_CANE_SIGN = BLOCKS.register("candy_cane_sign",
            () -> new SNSStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), SNSWoodTypes.CANDY_CANE));
    public static final RegistryObject<Block> CANDY_CANE_WALL_SIGN = BLOCKS.register("candy_cane_wall_sign",
            () -> new SNSWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), SNSWoodTypes.CANDY_CANE));
    public static final RegistryObject<Block> CANDY_CANE_HANGING_SIGN = BLOCKS.register("candy_cane_hanging_sign",
            () -> new SNSHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), SNSWoodTypes.CANDY_CANE));
    public static final RegistryObject<Block> CANDY_CANE_WALL_HANGING_SIGN = BLOCKS.register("candy_cane_wall_hanging_sign",
            () -> new SNSWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), SNSWoodTypes.CANDY_CANE));

//DECORATIONS
    //CANDY CANE
    public static final RegistryObject<Block> CANDY_CANE_CAT_TEDDY = registerBlock("candy_cane_cat_teddy",
        () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> LEMON_CANDY_CANE_CAT_TEDDY = registerBlock("lemon_candy_cane_cat_teddy",
            () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> MINT_CANDY_CANE_CAT_TEDDY = registerBlock("mint_candy_cane_cat_teddy",
            () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> PEPPERMINT_CANDY_CANE_CAT_TEDDY = registerBlock("peppermint_candy_cane_cat_teddy",
            () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> SPEARMINT_CANDY_CANE_CAT_TEDDY = registerBlock("spearmint_candy_cane_cat_teddy",
            () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> HUMBUG_CAT_TEDDY = registerBlock("humbug_cat_teddy",
            () -> new CandyCaneCatTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));

    public static final RegistryObject<Block> CANDY_CANE_WOLF_TEDDY = registerBlock("candy_cane_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> LEMON_CANDY_CANE_WOLF_TEDDY = registerBlock("lemon_candy_cane_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> MINT_CANDY_CANE_WOLF_TEDDY = registerBlock("mint_candy_cane_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> PEPPERMINT_CANDY_CANE_WOLF_TEDDY = registerBlock("peppermint_candy_cane_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> SPEARMINT_CANDY_CANE_WOLF_TEDDY = registerBlock("spearmint_candy_cane_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));
    public static final RegistryObject<Block> HUMBUG_WOLF_TEDDY = registerBlock("humbug_wolf_teddy",
            () -> new CandyCaneWolfTeddyBlock(BlockBehaviour.Properties.copy(Blocks.PLAYER_HEAD).noOcclusion()));

public static final RegistryObject<Block> CANDY_CANE_TABLE = registerBlock("candy_cane_table",
        () -> new CandyCaneTableBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> CANDY_CANE_BONE = registerBlock("candy_cane_bone",
            () -> new CandyCaneBoneBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_FOOD_BOWL = registerBlock("candy_cane_food_bowl",
            () -> new CandyCaneBowlBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> CANDY_CANE_WATER_BOWL = registerBlock("candy_cane_water_bowl",
            () -> new CandyCaneBowlBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

//PORTALS
public static final RegistryObject<Block> HERB_MAYFAIR_PORTAL = registerBlock("herb_mayfair_portal",
        () -> new HerbMayfairPortalBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_PORTAL).noLootTable().noOcclusion().noCollission()));




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
