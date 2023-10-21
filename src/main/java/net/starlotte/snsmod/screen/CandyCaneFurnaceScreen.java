package net.starlotte.snsmod.screen;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.recipe.CandyCaneFurnaceRecipeBookComponent;

public class CandyCaneFurnaceScreen extends AbstractFurnaceScreen<CandyCaneFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SNSMod.MOD_ID, "textures/gui/candy_cane_furnace.png");

    public CandyCaneFurnaceScreen(CandyCaneFurnaceMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new CandyCaneFurnaceRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
