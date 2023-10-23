package net.starlotte.snsmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.item.SNSItems;

public class SNSTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SNSMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = CREATIVE_MODE_TABS.register("block_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SNSBlocks.CANDY_CANE_BLOCK.get()))
            .title(Component.translatable("snstab.block_tab")).displayItems((displayParameters, output) -> {
                //CANDY_CANE
                output.accept(SNSBlocks.CANDY_CANE_BLOCK.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BLOCK_WALL.get());
                output.accept(SNSBlocks.CANDY_CANE_GRASS_BLOCK.get());
                output.accept(SNSBlocks.CANDY_CANE_LEAVES.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANKS.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_PLANK_WALL.get());
                output.accept(SNSBlocks.CANDY_CANE_STALK.get());
                output.accept(SNSBlocks.STRIPPED_CANDY_CANE_STALK.get());
                //CANDY_CANE_BRICKS
                output.accept(SNSBlocks.CANDY_CANE_BRICKS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_WALL.get());
                //CANDY_CANE_BRICKS_BLUE
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_BLUE_WALL.get());
                //CANDY_CANE_BRICKS_GREEN
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_GREEN_WALL.get());
                //CANDY_CANE_BRICKS_LIGHT_BLUE
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_LIGHT_BLUE_WALL.get());
                //CANDY_CANE_BRICKS_YELLOW
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_BUTTON.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_FENCE_GATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_SLAB.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_STAIRS.get());
                output.accept(SNSBlocks.CANDY_CANE_BRICKS_YELLOW_WALL.get());
                //HUMBUG
                output.accept(SNSBlocks.HUMBUG_BLOCK.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_FENCE.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_SLAB.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.HUMBUG_BLOCK_WALL.get());
                //HUMBUG_BRICKS
                output.accept(SNSBlocks.HUMBUG_BRICKS.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_BUTTON.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_FENCE.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_FENCE_GATE.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_SLAB.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_STAIRS.get());
                output.accept(SNSBlocks.HUMBUG_BRICKS_WALL.get());
                //HARDENED_HUMBUG
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_SLAB.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.HARDENED_HUMBUG_BLOCK_WALL.get());
                //MINT
                output.accept(SNSBlocks.MINT_BLOCK.get());
                output.accept(SNSBlocks.MINT_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.MINT_BLOCK_FENCE.get());
                output.accept(SNSBlocks.MINT_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.MINT_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.MINT_BLOCK_SLAB.get());
                output.accept(SNSBlocks.MINT_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.MINT_BLOCK_WALL.get());
                //MINT_BRICKS
                output.accept(SNSBlocks.MINT_BRICKS.get());
                output.accept(SNSBlocks.MINT_BRICKS_BUTTON.get());
                output.accept(SNSBlocks.MINT_BRICKS_FENCE.get());
                output.accept(SNSBlocks.MINT_BRICKS_FENCE_GATE.get());
                output.accept(SNSBlocks.MINT_BRICKS_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.MINT_BRICKS_SLAB.get());
                output.accept(SNSBlocks.MINT_BRICKS_STAIRS.get());
                output.accept(SNSBlocks.MINT_BRICKS_WALL.get());
                //HARDENED_MINT
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_DOOR.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_FENCE.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_SLAB.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_TRAPDOOR.get());
                output.accept(SNSBlocks.HARDENED_MINT_BLOCK_WALL.get());
                //TOOTHPASTE
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_FENCE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_SLAB.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.TOOTHPASTE_BLOCK_WALL.get());
                //TOOTHPASTE_BRICKS
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_BUTTON.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_FENCE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_FENCE_GATE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_SLAB.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_STAIRS.get());
                output.accept(SNSBlocks.TOOTHPASTE_BRICKS_WALL.get());
                //HARDENED_TOOTHPASTE
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_BUTTON.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_FENCE_GATE.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_PRESSURE_PLATE.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_SLAB.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_STAIRS.get());
                output.accept(SNSBlocks.HARDENED_TOOTHPASTE_BLOCK_WALL.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> DECORATION_TAB = CREATIVE_MODE_TABS.register("decoration_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SNSBlocks.CANDY_CANE_FLOWER.get()))
            .title(Component.translatable("snstab.decoration_tab")).displayItems((displayParameters, output) -> {
                output.accept(SNSBlocks.CANDY_CANE_FLOWER.get());
                output.accept(SNSBlocks.CANDY_CANE_SAPLING.get());
                output.accept(SNSBlocks.CANDY_CANE_HANGING_SIGN.get());
                output.accept(SNSBlocks.CANDY_CANE_SIGN.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SNSItems.CANDY_CANE.get()))
            .title(Component.translatable("snstab.food_tab")).displayItems((displayParameters, output) -> {
                output.accept(SNSItems.CANDY_CANE.get());
                output.accept(SNSItems.MINT_CHOCOLATE_BALL.get());
                output.accept(SNSItems.MINT_IMPERIAL.get());
                output.accept(SNSItems.MINT_MARSHMALLOW.get());
                output.accept(SNSItems.TOOTHPASTE.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> MISC_TAB = CREATIVE_MODE_TABS.register("misc_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SNSItems.CANDY_CANE_SUGAR.get()))
            .title(Component.translatable("snstab.misc_tab")).displayItems((displayParameters, output) -> {
                output.accept(SNSItems.CANDY_CANE_SUGAR.get());
            }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
