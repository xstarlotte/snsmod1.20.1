package net.starlotte.snsmod.entity.client.renderer.entity.category.herb.ambient;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.client.model.entity.category.herb.ambient.CandyCaneflyModel;
import org.joml.Vector3d;
import software.bernie.example.client.model.entity.BatModel;
import software.bernie.example.entity.BatEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class CandyCaneflyRenderer extends GeoEntityRenderer<CandyCaneflyEntity> {
    public CandyCaneflyRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneflyModel());
    }


}
