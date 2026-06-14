package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes12.dex */
public class GAMUtils {
    @NonNull
    public static String toString(@NonNull Waterfall.Configuration.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice();
    }

    @NonNull
    public static String toString(@NonNull Waterfall.Result.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice() + ", status - " + adUnit.getStatus();
    }

    @NonNull
    public static String toString(@Nullable Waterfall.Result.EstimatedPrice estimatedPrice) {
        if (estimatedPrice == null) {
            return "estimated price - null";
        }
        return "estimated price - " + estimatedPrice.getValue().getValue() + " " + estimatedPrice.getCurrency().getValue() + ", precision - " + estimatedPrice.getPrecision().getValue();
    }
}
