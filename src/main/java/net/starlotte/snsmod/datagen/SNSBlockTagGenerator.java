package net.starlotte.snsmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SNSBlockTagGenerator extends BlockTagsProvider {
    public SNSBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SNSMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.DIRT)
                .add(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get()

                );

        this.tag(BlockTags.FENCES)
                .add(SNSBlocks.CANDY_CANE_BLOCK_FENCE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_FENCE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE.get(),
                        SNSBlocks.CANDY_CANE_PLANK_FENCE.get(),
                        SNSBlocks.CANDY_CANE_STONE_FENCE.get(),
                        SNSBlocks.HUMBUG_BLOCK_FENCE.get(),
                        SNSBlocks.HUMBUG_BRICKS_FENCE.get(),
                        SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE.get(),
                        SNSBlocks.MINT_BLOCK_FENCE.get(),
                        SNSBlocks.MINT_BRICKS_FENCE.get(),
                        SNSBlocks.HARDENED_MINT_BLOCK_FENCE.get(),
                        SNSBlocks.TOOTHPASTE_BLOCK_FENCE.get(),
                        SNSBlocks.TOOTHPASTE_BRICKS_FENCE.get(),
                        SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE.get()
                );

        this.tag(BlockTags.FENCE_GATES)
                .add(SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_PLANK_FENCE_GATE.get(),
                        SNSBlocks.CANDY_CANE_STONE_FENCE_GATE.get(),
                        SNSBlocks.HUMBUG_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.HUMBUG_BRICKS_FENCE_GATE.get(),
                        SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.MINT_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.MINT_BRICKS_FENCE_GATE.get(),
                        SNSBlocks.HARDENED_MINT_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.TOOTHPASTE_BLOCK_FENCE_GATE.get(),
                        SNSBlocks.TOOTHPASTE_BRICKS_FENCE_GATE.get(),
                        SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE.get()
                );

        this.tag(BlockTags.FLOWERS)
                .add(SNSBlocks.CANDY_CANE_BUSH.get(),
                SNSBlocks.CANDY_CANE_CARNATION.get(),
                SNSBlocks.CANDY_CANE_CARNATIONS.get(),
                SNSBlocks.CANDY_CANE_FLOWER.get(),
                SNSBlocks.CANDY_CANE_FLOWER_2.get(),
                SNSBlocks.CANDY_CANE_FLOWER_3.get(),
                SNSBlocks.CANDY_CANE_FLOWER_4.get(),
                SNSBlocks.CANDY_CANE_GRASS.get(),
                SNSBlocks.CANDY_CANE_GRASS_LONG.get()

                );

        this.tag(BlockTags.LEAVES)
                .add(SNSBlocks.CANDY_CANE_LEAVES.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(SNSBlocks.CANDY_CANE_STALK.get(),
                SNSBlocks.STRIPPED_CANDY_CANE_STALK.get()
                );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(SNSBlocks.CANDY_CANE_BLOCK.get(),
                        SNSBlocks.CANDY_CANE_BLOCK_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_BLOCK_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL.get(),
                        SNSBlocks.CANDY_CANE_STONE.get(),
                        SNSBlocks.CANDY_CANE_STONE_SLAB.get(),
                        SNSBlocks.CANDY_CANE_STONE_STAIRS.get(),
                        SNSBlocks.CANDY_CANE_STONE_WALL.get()
                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(SNSBlocks.CANDY_CANE_BLOCK.get(),
                        SNSBlocks.CANDY_CANE_BLOCK_SLAB.get(),
                        SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get()
                );

        this.tag(BlockTags.PLANKS)
                .add(SNSBlocks.CANDY_CANE_PLANKS.get()
                );

        this.tag(BlockTags.WALLS)
                .add(SNSBlocks.CANDY_CANE_BLOCK_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL.get(),
                        SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL.get(),
                        SNSBlocks.CANDY_CANE_PLANK_WALL.get(),
                        SNSBlocks.CANDY_CANE_STONE_WALL.get(),
                        SNSBlocks.HUMBUG_BLOCK_WALL.get(),
                        SNSBlocks.HUMBUG_BRICKS_WALL.get(),
                        SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL.get(),
                        SNSBlocks.MINT_BLOCK_WALL.get(),
                        SNSBlocks.MINT_BRICKS_WALL.get(),
                        SNSBlocks.HARDENED_MINT_BLOCK_WALL.get(),
                        SNSBlocks.TOOTHPASTE_BLOCK_WALL.get(),
                        SNSBlocks.TOOTHPASTE_BRICKS_WALL.get(),
                        SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL.get()
                );

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
