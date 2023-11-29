package net.starlotte.snsmod.entity.client.renderer.entity.category.herb.tameable;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneCatEntity;
import net.starlotte.snsmod.entity.client.model.entity.category.herb.ambient.CandyCaneflyModel;
import net.starlotte.snsmod.entity.client.model.entity.category.herb.tameable.CandyCaneCatModel;
import net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant.CandyCaneCatVariant;
import net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant.CandyCaneflyVariant;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;

public class CandyCaneCatRenderer extends GeoEntityRenderer<CandyCaneCatEntity> {

    private static final Map<CandyCaneCatVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneCatVariant.class), map -> {
                map.put(CandyCaneCatVariant.DEFAULT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/tameable/candy_cane_cat.png"));
                map.put(CandyCaneCatVariant.LEMON, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/tameable/lemon_candy_cane_cat.png"));
                map.put(CandyCaneCatVariant.MINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/tameable/mint_candy_cane_cat.png"));
                map.put(CandyCaneCatVariant.PEPPERMINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/tameable/peppermint_candy_cane_cat.png"));
                map.put(CandyCaneCatVariant.SPEARMINT, new ResourceLocation(SNSMod.MOD_ID, "textures/entity/category/herb/tameable/spearmint_candy_cane_cat.png"));
            });

    public CandyCaneCatRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneCatModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneCatEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }

    @Override
    public void render(CandyCaneCatEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(0.8f, 0.8f, 0.8f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }



}

