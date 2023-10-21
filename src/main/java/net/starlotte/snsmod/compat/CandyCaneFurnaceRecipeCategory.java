package net.starlotte.snsmod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.recipe.CandyCaneFurnaceRecipe;

public class CandyCaneFurnaceRecipeCategory implements IRecipeCategory<CandyCaneFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(SNSMod.MOD_ID, "candy_cane_furnace");
    public static final ResourceLocation TEXTURE = new ResourceLocation(SNSMod.MOD_ID,
            "textures/gui/candy_cane_furnace.png");

    public static final mezz.jei.api.recipe.RecipeType<CandyCaneFurnaceRecipe> CANDY_CANE_FURNACE_TYPE =
            new mezz.jei.api.recipe.RecipeType<>(UID, CandyCaneFurnaceRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public CandyCaneFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SNSBlocks.CANDY_CANE_FURNACE.get()));
    }

    @Override
    public RecipeType<CandyCaneFurnaceRecipe> getRecipeType() {
        return CANDY_CANE_FURNACE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.snsmod.candy_cane_furnace");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CandyCaneFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 56, 17).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 35).addItemStack(recipe.getResultItem(null));
    }
}
