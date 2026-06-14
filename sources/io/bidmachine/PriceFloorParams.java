package io.bidmachine;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public final class PriceFloorParams {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    @NonNull
    Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m7756addPriceFloor(double d10) {
        m7757addPriceFloor(UUID.randomUUID().toString(), d10);
        return this;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m7757addPriceFloor(@NonNull String str, double d10) {
        this.priceFloorsMap.put(str, Double.valueOf(d10));
        return this;
    }
}
