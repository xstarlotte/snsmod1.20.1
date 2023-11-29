package net.starlotte.snsmod.item;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.block.SNSBlocks;
import net.starlotte.snsmod.entity.SNSEntities;
import net.starlotte.snsmod.item.custom.SNSFuelItem;

public class SNSItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SNSMod.MOD_ID);
//FOOD
    //candy cane
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    //cinnamon
    public static final RegistryObject<Item> CINNAMON_ROLL = ITEMS.register("cinnamon_roll", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> GLAZED_CINNAMON_ROLL = ITEMS.register("glazed_cinnamon_roll", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_2)));
    public static final RegistryObject<Item> CINNAMON_STICKS = ITEMS.register("cinnamon_sticks", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    //mint
    public static final RegistryObject<Item> MINT_CHOCOLATE_BALL = ITEMS.register("mint_chocolate_ball", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_IMPERIAL = ITEMS.register("mint_imperial", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> MINT_MARSHMALLOW = ITEMS.register("mint_marshmallow", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> POLO = ITEMS.register("polo", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    public static final RegistryObject<Item> TOOTHPASTE = ITEMS.register("toothpaste", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));

    public static final RegistryObject<Item> MINT_HUMBUG = ITEMS.register("mint_humbug", () -> new Item(new Item.Properties().food(SNSFoodProperties.TIER_1)));
    //FUEL
    public static final RegistryObject<Item> CANDY_CANE_SUGAR = ITEMS.register("candy_cane_sugar", () -> new SNSFuelItem(new Item.Properties(), 640));
//SIGNS
    public static final RegistryObject<Item> CANDY_CANE_SIGN = ITEMS.register("candy_cane_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), SNSBlocks.CANDY_CANE_SIGN.get(), SNSBlocks.CANDY_CANE_WALL_SIGN.get()));
    public static final RegistryObject<Item> CANDY_CANE_HANGING_SIGN = ITEMS.register("candy_cane_hanging_sign",
            () -> new HangingSignItem(SNSBlocks.CANDY_CANE_HANGING_SIGN.get(), SNSBlocks.CANDY_CANE_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

//SPAWN_EGGS
    public static final RegistryObject<Item> CANDY_CANEFLY_SPAWN_EGG = ITEMS.register("candy_canefly_spawn_egg",
        () -> new ForgeSpawnEggItem(SNSEntities.CANDY_CANEFLY, 0xf9f8f6, 0x872e2e,
                new Item.Properties()));
    public static final RegistryObject<Item> CANDY_CANE_CAT_SPAWN_EGG = ITEMS.register("candy_cane_cat_spawn_egg",
            () -> new ForgeSpawnEggItem(SNSEntities.CANDY_CANE_CAT, 0xf9f8f6, 0x872e2e,
                    new Item.Properties()));
    public static final RegistryObject<Item> CANDY_CANE_WOLF_SPAWN_EGG = ITEMS.register("candy_cane_wolf_spawn_egg",
            () -> new ForgeSpawnEggItem(SNSEntities.CANDY_CANE_WOLF, 0xf9f8f6, 0x872e2e,
                    new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
