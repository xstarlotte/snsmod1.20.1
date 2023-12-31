package net.starlotte.snsmod.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.starlotte.snsmod.SNSMod;

public class SNSPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, SNSMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> CANDY_CANE = PAINTING_VARIANTS.register("candy_cane",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDY_CANE_CAT = PAINTING_VARIANTS.register("candy_cane_cat",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDY_CANE_CAT_LEMON = PAINTING_VARIANTS.register("candy_cane_cat_lemon",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDY_CANE_CAT_MINT = PAINTING_VARIANTS.register("candy_cane_cat_mint",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDY_CANE_CAT_PEPPERMINT = PAINTING_VARIANTS.register("candy_cane_cat_peppermint",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> CANDY_CANE_CAT_SPEARMINT = PAINTING_VARIANTS.register("candy_cane_cat_spearmint",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> MINT_HUMBUG_CAT = PAINTING_VARIANTS.register("mint_humbug_cat",
            () -> new PaintingVariant(16, 16));


    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
