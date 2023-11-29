package net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneCatVariant {
    DEFAULT(0),
    LEMON(1),
    MINT(2),
    PEPPERMINT(3),
    SPEARMINT(4);


    private static final CandyCaneCatVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CandyCaneCatVariant::getId)).toArray(CandyCaneCatVariant[]::new);
    private final int id;

    CandyCaneCatVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CandyCaneCatVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
