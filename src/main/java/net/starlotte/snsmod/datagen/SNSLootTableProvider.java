package net.starlotte.snsmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.starlotte.snsmod.datagen.loot.SNSLootTables;

import java.util.List;
import java.util.Set;

public class SNSLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(SNSLootTables::new, LootContextParamSets.BLOCK)));
    }
}
