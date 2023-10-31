package net.starlotte.snsmod.item;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.item.custom.SNSFuelItem;

public class SNSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNSMod.MOD_ID);
//FOOD
    //candy cane
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_CHOCOLATE_BALL = ITEMS.register("mint_chocolate_ball", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_IMPERIAL = ITEMS.register("mint_imperial", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_MARSHMALLOW = ITEMS.register("mint_marshmallow", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> POLO = ITEMS.register("polo", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    //cinnamon
    public static final RegistryObject<Item> CINNAMON_ROLL = ITEMS.register("cinnamon_roll", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_2)));
    public static final RegistryObject<Item> CINNAMON_STICKS = ITEMS.register("cinnamon_sticks", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));

    //FUEL
    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new SNSFuelItem(new Item.Properties(), 640));
//SIGNS
    public static final RegistryObject<Item> CANDY_CANE_SIGN = ITEMS.register("candy_cane_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), SNSBlocks.CANDY_CANE_SIGN.get(), SNSBlocks.CANDY_CANE_WALL_SIGN.get()));
    public static final RegistryObject<Item> CANDY_CANE_HANGING_SIGN = ITEMS.register("candy_cane_hanging_sign",
            () -> new HangingSignItem(SNSBlocks.CANDY_CANE_HANGING_SIGN.get(), SNSBlocks.CANDY_CANE_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
