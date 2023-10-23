package net.starlotte.snsmod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SNSHangingSignBlockEntity extends SignBlockEntity {
    public SNSHangingSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(SNSBlockEntities.SNS_HANGING_SIGN.get(), blockPos, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return SNSBlockEntities.SNS_HANGING_SIGN.get();
    }
}
