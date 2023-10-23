package net.starlotte.snsmod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SNSSignBlockEntity extends SignBlockEntity {
    public SNSSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(SNSBlockEntities.SNS_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return SNSBlockEntities.SNS_SIGN.get();
    }
}
