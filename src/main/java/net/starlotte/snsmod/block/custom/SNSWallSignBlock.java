package net.starlotte.snsmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.starlotte.snsmod.block.entity.SNSSignBlockEntity;

public class SNSWallSignBlock extends WallSignBlock {
    public SNSWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SNSSignBlockEntity(pPos, pState);
    }
}
