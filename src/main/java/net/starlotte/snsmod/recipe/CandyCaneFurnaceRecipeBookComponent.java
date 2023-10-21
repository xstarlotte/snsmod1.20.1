package net.starlotte.snsmod.recipe;

import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.world.item.Item;
import net.starlotte.snsmod.item.SNSItems;

import java.util.Set;

public class CandyCaneFurnaceRecipeBookComponent extends AbstractFurnaceRecipeBookComponent {

    @Override
    protected Set<Item> getFuelItems() {
        return Set.of(SNSItems.CANDY_CANE_SUGAR.get());
    }
}
