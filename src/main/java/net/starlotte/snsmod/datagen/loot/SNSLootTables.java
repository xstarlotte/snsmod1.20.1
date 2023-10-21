package net.starlotte.snsmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.block.SNSBlocks;

import java.util.Set;

public class SNSLootTables extends BlockLootSubProvider {
    public SNSLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//CANDY_CANE
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BLOCK_WALL.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get());
//CANDY_CANE_BRICKS
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICKS_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICKS_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_WALL.get());
//CANDY_CANE_BRICKS_BLUE
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL.get());
//CANDY_CANE_BRICKS_GREEN
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL.get());
//CANDY_CANE_BRICKS_LIGHT_BLUE
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL.get());
//CANDY_CANE_BRICKS_YELLOW
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL.get());
//HUMBUG
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK.get());
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.HUMBUG_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.HUMBUG_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.HUMBUG_BLOCK_WALL.get());
//HUMBUG_BRICKS
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS.get());
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_BUTTON.get());
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_FENCE.get());
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_PRESSURE_PLATE.get());
        this.add(SNSBlocks.HUMBUG_BRICKS_SLAB.get(), block -> createSlabItemTable(SNSBlocks.HUMBUG_BRICKS_SLAB.get()));
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_STAIRS.get());
        this.dropSelf(SNSBlocks.HUMBUG_BRICKS_WALL.get());
//HARDENED_HUMBUG
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK.get());
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.HARDENED_HUMBUG_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.HARDENED_HUMBUG_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL.get());
//MINT
        this.dropSelf(SNSBlocks.MINT_BLOCK.get());
        this.dropSelf(SNSBlocks.MINT_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.MINT_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.MINT_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.MINT_BLOCK_WALL.get());
//MINT_BRICKS
        this.dropSelf(SNSBlocks.MINT_BRICKS.get());
        this.dropSelf(SNSBlocks.MINT_BRICKS_BUTTON.get());
        this.dropSelf(SNSBlocks.MINT_BRICKS_FENCE.get());
        this.dropSelf(SNSBlocks.MINT_BRICKS_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.MINT_BRICKS_PRESSURE_PLATE.get());
        this.add(SNSBlocks.MINT_BRICKS_SLAB.get(), block -> createSlabItemTable(SNSBlocks.MINT_BRICKS_SLAB.get()));
        this.dropSelf(SNSBlocks.MINT_BRICKS_STAIRS.get());
        this.dropSelf(SNSBlocks.MINT_BRICKS_WALL.get());
//HARDENED_MINT
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK.get());
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_BUTTON.get());
        this.add(SNSBlocks.HARDENED_MINT_BLOCK_DOOR.get(), block -> createDoorTable(SNSBlocks.HARDENED_MINT_BLOCK_DOOR.get()));
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.HARDENED_MINT_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.HARDENED_MINT_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_TRAPDOOR.get());
        this.dropSelf(SNSBlocks.HARDENED_MINT_BLOCK_WALL.get());
//TOOTHPASTE
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.TOOTHPASTE_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.TOOTHPASTE_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BLOCK_WALL.get());
//TOOTHPASTE_BRICKS
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_BUTTON.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_FENCE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_PRESSURE_PLATE.get());
        this.add(SNSBlocks.TOOTHPASTE_BRICKS_SLAB.get(), block -> createSlabItemTable(SNSBlocks.TOOTHPASTE_BRICKS_SLAB.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_STAIRS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_WALL.get());
//HARDENED_TOOTHPASTE
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get());
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_BUTTON.get());
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE.get());
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_SLAB.get()));
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_STAIRS.get());
        this.dropSelf(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL.get());
//FLORA
        this.dropSelf(SNSBlocks.CANDY_CANE_FLOWER.get());
        this.add(SNSBlocks.POTTED_CANDY_CANE_FLOWER.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_FLOWER.get()));
//BLOCK ENTITIES
// FURNACES
        this.dropSelf(SNSBlocks.CANDY_CANE_FURNACE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SNSBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
