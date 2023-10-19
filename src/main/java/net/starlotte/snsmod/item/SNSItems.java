package net.starlotte.snsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;

public class SNSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNSMod.MOD_ID);

    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_BALL = ITEMS.register("mint_chocolate_ball", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_IMPERIAL = ITEMS.register("mint_imperial", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_MARSHMALLOW = ITEMS.register("mint_marshmallow", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));










    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
