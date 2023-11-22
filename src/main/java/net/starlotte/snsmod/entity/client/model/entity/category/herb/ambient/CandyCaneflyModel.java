package net.starlotte.snsmod.entity.client.model.entity.category.herb.ambient;

import net.minecraft.resources.ResourceLocation;
import net.starlotte.snsmod.SNSMod;
import net.starlotte.snsmod.entity.category.herb.ambient.CandyCaneflyEntity;
import software.bernie.example.entity.BatEntity;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneflyModel<T extends CandyCaneflyEntity> extends DefaultedEntityGeoModel<T> {
    // We use the alternate super-constructor here to tell the model it should handle head-turning for us
    public CandyCaneflyModel() {
        super(new ResourceLocation(SNSMod.MOD_ID, "category/herb/ambient/candy_canefly"), true);
    }
}
