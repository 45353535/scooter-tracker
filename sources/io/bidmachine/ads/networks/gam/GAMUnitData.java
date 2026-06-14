package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class GAMUnitData {

    @NonNull
    private final String adUnitId;

    @NonNull
    private final Map<String, String> customTargeting;
    private final float price;
    private final float score;

    public GAMUnitData(@NonNull String str, float f10, float f11, @NonNull Map<String, String> map) {
        this.adUnitId = str;
        this.score = f10;
        this.price = f11;
        this.customTargeting = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GAMUnitData gAMUnitData = (GAMUnitData) obj;
            if (this.adUnitId.equals(gAMUnitData.adUnitId) && Float.compare(gAMUnitData.score, this.score) == 0 && Float.compare(gAMUnitData.price, this.price) == 0) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAdUnitId() {
        return this.adUnitId;
    }

    @NonNull
    public Map<String, String> getCustomTargeting() {
        return this.customTargeting;
    }

    public float getPrice() {
        return this.price;
    }

    public float getScore() {
        return this.score;
    }

    public int hashCode() {
        return (((this.adUnitId.hashCode() * 31) + Float.floatToIntBits(this.score)) * 31) + Float.floatToIntBits(this.price);
    }

    @NonNull
    public String toString() {
        return "adUnitId - " + this.adUnitId + ", score - " + this.score + ", price - " + this.price;
    }
}
