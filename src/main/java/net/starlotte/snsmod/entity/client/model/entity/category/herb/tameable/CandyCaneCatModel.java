package net.starlotte.snsmod.entity.client.model.entity.category.herb.tameable;

import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneCatModel<T extends CandyCaneCatEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneCatModel() {
        super(new ResourceLocation(SNSMod.MOD_ID, "category/herb/tameable/candy_cane_cat"), true);

    }

}
