package net.starlotte.snsmod.entity.client.renderer.entity.category.herb.ambient;


import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.client.model.entity.category.herb.ambient.CandyCaneflyModel;
import net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant.CandyCaneflyVariant;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneflyRenderer extends GeoEntityRenderer<CandyCaneflyEntity> {

    private static final Map<CandyCaneflyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneflyVariant.class), map -> {
                map.put(CandyCaneflyVariant.DEFAULT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/ambient/candy_canefly.png"));
                map.put(CandyCaneflyVariant.LEMON, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/ambient/lemon_candy_canefly.png"));
                map.put(CandyCaneflyVariant.MINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/ambient/mint_candy_canefly.png"));
                map.put(CandyCaneflyVariant.PEPPERMINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/ambient/peppermint_candy_canefly.png"));
                map.put(CandyCaneflyVariant.SPEARMINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/ambient/spearmint_candy_canefly.png"));
            });

    public CandyCaneflyRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneflyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneflyEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
}
