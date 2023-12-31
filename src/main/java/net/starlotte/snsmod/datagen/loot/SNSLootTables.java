package net.starlotte.snsmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.item.SNSItems;

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
        this.add(SNSBlocks.CANDY_CANE_DOOR.get(), block -> createDoorTable(SNSBlocks.CANDY_CANE_DOOR.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_DIRT.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get());
        this.add(SNSBlocks.CANDY_CANE_LEAVES.get(), block -> createLeavesDrops(block, SNSBlocks.CANDY_CANE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANKS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_PLANK_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_PLANK_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_PLANK_WALL.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STALK.get());
        this.dropSelf(SNSBlocks.STRIPPED_CANDY_CANE_STALK.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_TORCH.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_TRAPDOOR.get());
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
//CANDY CANE STONE
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_BUTTON.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_FENCE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.CANDY_CANE_STONE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.CANDY_CANE_STONE_SLAB.get()));
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_STAIRS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_STONE_WALL.get());
//CINNAMON
        this.dropSelf(SNSBlocks.CINNAMON_BLOCK.get());
        this.dropSelf(SNSBlocks.CINNAMON_DIRT.get());
        this.dropSelf(SNSBlocks.CINNAMON_GRASS_BLOCK.get());
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
        this.dropSelf(SNSBlocks.MINT_DIRT.get());
        this.dropSelf(SNSBlocks.MINT_GRASS_BLOCK.get());
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
        this.add(SNSBlocks.TOOTHPASTE_DOOR.get(), block -> createDoorTable(SNSBlocks.TOOTHPASTE_DOOR.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_GRASS_BLOCK.get());
//TOOTHPASTE_BRICKS
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_BRICKS_BUTTON.get());
        this.add(SNSBlocks.TOOTHPASTE_BRICKS_DOOR.get(), block -> createDoorTable(SNSBlocks.TOOTHPASTE_BRICKS_DOOR.get()));
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
 //TOOTHPASTE STONE
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_BUTTON.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_FENCE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_FENCE_GATE.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_PRESSURE_PLATE.get());
        this.add(SNSBlocks.TOOTHPASTE_STONE_SLAB.get(), block -> createSlabItemTable(SNSBlocks.TOOTHPASTE_STONE_SLAB.get()));
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_STAIRS.get());
        this.dropSelf(SNSBlocks.TOOTHPASTE_STONE_WALL.get());

//DECORATIONS
    //CANDY CANE
        this.dropSelf(SNSBlocks.CANDY_CANE_CAT_TEDDY.get());
        this.dropSelf(SNSBlocks.LEMON_CANDY_CANE_CAT_TEDDY.get());
        this.dropSelf(SNSBlocks.MINT_CANDY_CANE_CAT_TEDDY.get());
        this.dropSelf(SNSBlocks.PEPPERMINT_CANDY_CANE_CAT_TEDDY.get());
        this.dropSelf(SNSBlocks.SPEARMINT_CANDY_CANE_CAT_TEDDY.get());
        this.dropSelf(SNSBlocks.HUMBUG_CAT_TEDDY.get());

        this.dropSelf(SNSBlocks.CANDY_CANE_WOLF_TEDDY.get());
        this.dropSelf(SNSBlocks.LEMON_CANDY_CANE_WOLF_TEDDY.get());
        this.dropSelf(SNSBlocks.MINT_CANDY_CANE_WOLF_TEDDY.get());
        this.dropSelf(SNSBlocks.PEPPERMINT_CANDY_CANE_WOLF_TEDDY.get());
        this.dropSelf(SNSBlocks.SPEARMINT_CANDY_CANE_WOLF_TEDDY.get());
        this.dropSelf(SNSBlocks.HUMBUG_WOLF_TEDDY.get());

        this.dropSelf(SNSBlocks.CANDY_CANE_TABLE.get());

        this.dropSelf(SNSBlocks.CANDY_CANE_BONE.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_FOOD_BOWL.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_WATER_BOWL.get());
//FLORA
        this.dropSelf(SNSBlocks.CANDY_CANE_BUSH.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_CARNATION.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_CARNATIONS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_FLOWER.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_FLOWER_2.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_FLOWER_3.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_FLOWER_4.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_GRASS.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_GRASS_LONG.get());
        this.dropSelf(SNSBlocks.CANDY_CANE_SAPLING.get());
        this.dropSelf(SNSBlocks.MINT_BUSH.get());
        this.dropSelf(SNSBlocks.MINT_CHOCOLATE_TULIP.get());
        this.dropSelf(SNSBlocks.MINT_FLOWER.get());
        this.dropSelf(SNSBlocks.MINT_IMPEONY.get());
        this.dropSelf(SNSBlocks.POLO_PLANT.get());

        this.add(SNSBlocks.POTTED_CANDY_CANE_BUSH.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_BUSH.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_CARNATION.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_CARNATION.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_CARNATIONS.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_CARNATIONS.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_FLOWER.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_FLOWER.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_FLOWER_2.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_FLOWER_2.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_FLOWER_3.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_FLOWER_3.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_FLOWER_4.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_FLOWER_4.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_GRASS.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_GRASS.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_GRASS_LONG.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_GRASS_LONG.get()));
        this.add(SNSBlocks.POTTED_CANDY_CANE_SAPLING.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_CANDY_CANE_SAPLING.get()));
        this.add(SNSBlocks.POTTED_MINT_BUSH.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_MINT_BUSH.get()));
        this.add(SNSBlocks.POTTED_MINT_CHOCOLATE_TULIP.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_MINT_CHOCOLATE_TULIP.get()));
        this.add(SNSBlocks.POTTED_MINT_FLOWER.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_MINT_FLOWER.get()));
        this.add(SNSBlocks.POTTED_MINT_IMPEONY.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_MINT_IMPEONY.get()));
        this.add(SNSBlocks.POTTED_POLO_PLANT.get(),
                createPotFlowerItemTable(SNSBlocks.POTTED_POLO_PLANT.get()));
//BLOCK ENTITIES
// FURNACES
        this.dropSelf(SNSBlocks.CANDY_CANE_FURNACE.get());
//SIGNS
        this.add(SNSBlocks.CANDY_CANE_SIGN.get(), block ->
                createSingleItemTable(SNSItems.CANDY_CANE_SIGN.get()));
        this.add(SNSBlocks.CANDY_CANE_WALL_SIGN.get(), block ->
                createSingleItemTable(SNSItems.CANDY_CANE_SIGN.get()));
        this.add(SNSBlocks.CANDY_CANE_HANGING_SIGN.get(), block ->
                createSingleItemTable(SNSItems.CANDY_CANE_HANGING_SIGN.get()));
        this.add(SNSBlocks.CANDY_CANE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(SNSItems.CANDY_CANE_HANGING_SIGN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SNSBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
