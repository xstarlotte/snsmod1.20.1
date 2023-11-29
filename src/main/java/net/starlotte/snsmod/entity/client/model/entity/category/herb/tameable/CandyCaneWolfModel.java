package net.starlotte.snsmod.entity.client.model.entity.category.herb.tameable;

import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneCatEntity;
import net.starlotte.snsmod.entity.category.herb.tameable.CandyCaneWolfEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneWolfModel<T extends CandyCaneWolfEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneWolfModel() {
        super(new ResourceLocation(SNSMod.MOD_ID, "category/herb/tameable/candy_cane_wolf"), true);

    }

}
