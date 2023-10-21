package net.starlotte.snsmod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;

public class SNSRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SNSMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CandyCaneFurnaceRecipe>> CANDY_CANE_FURNACE_SERIALIZER =
            SERIALIZERS.register("candy_cane_furnace", () -> CandyCaneFurnaceRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
