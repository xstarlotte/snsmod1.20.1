package net.starlotte.snsmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.recipe.CandyCaneFurnaceRecipe;
import net.starlotte.snsmod.screen.CandyCaneFurnaceScreen;

import java.util.List;

@JeiPlugin
public class JEISNSPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(SNSMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new CandyCaneFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<CandyCaneFurnaceRecipe> candyCaneFurnaceRecipes = recipeManager.getAllRecipesFor(CandyCaneFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(CandyCaneFurnaceRecipeCategory.CANDY_CANE_FURNACE_TYPE, candyCaneFurnaceRecipes);
    }
//clickable area (match with gui texture slots)
    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {

        registration.addRecipeClickArea(CandyCaneFurnaceScreen.class, 60,30,20,30,
                CandyCaneFurnaceRecipeCategory.CANDY_CANE_FURNACE_TYPE);
    }
}
