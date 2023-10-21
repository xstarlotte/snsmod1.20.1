package net.starlotte.snsmod.screen;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.starlotte.snsmod.recipe.CandyCaneFurnaceRecipe;

public class CandyCaneFurnaceMenu extends AbstractFurnaceMenu {
    protected CandyCaneFurnaceMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public CandyCaneFurnaceMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(SNSMenuTypes.CANDY_CANE_FURNACE_MENU.get(), CandyCaneFurnaceRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public CandyCaneFurnaceMenu(int pContainerId, Inventory pPlayerInventory) {
        super(SNSMenuTypes.CANDY_CANE_FURNACE_MENU.get(), CandyCaneFurnaceRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }

    @Override
    protected boolean isFuel(ItemStack pStack) {
        return true;
    }
}
