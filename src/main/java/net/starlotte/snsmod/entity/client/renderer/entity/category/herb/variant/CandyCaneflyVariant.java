package net.starlotte.snsmod.entity.client.renderer.entity.category.herb.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CandyCaneflyVariant {
    DEFAULT(0),
    LEMON(1),
    MINT(2),
    PEPPERMINT(3),
    SPEARMINT(4);


    private static final CandyCaneflyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CandyCaneflyVariant::getId)).toArray(CandyCaneflyVariant[]::new);
    private final int id;

    CandyCaneflyVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CandyCaneflyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
