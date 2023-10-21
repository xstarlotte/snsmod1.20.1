package net.starlotte.snsmod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.starlotte.snsmod.item.SNSItems;
import net.starlotte.snsmod.recipe.CandyCaneFurnaceRecipe;
import net.starlotte.snsmod.screen.CandyCaneFurnaceMenu;

import java.util.Map;

public class CandyCaneFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    private Map<Item, Integer> BURN_DURATION_MAP =
            Map.of(SNSItems.CANDY_CANE_SUGAR.get(), 640);

    public CandyCaneFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(SNSBlockEntities.CANDY_CANE_FURNACE_BLOCK_ENTITY.get(), pPos, pBlockState, CandyCaneFurnaceRecipe.Type.INSTANCE);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.snsmod.candy_cane_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new CandyCaneFurnaceMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel) {
        return BURN_DURATION_MAP.getOrDefault(pFuel.getItem(), 0);
    }
}
