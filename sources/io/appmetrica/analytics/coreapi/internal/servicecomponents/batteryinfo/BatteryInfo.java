package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class BatteryInfo {

    @Nullable
    public final Integer batteryLevel;

    @NonNull
    public final ChargeType chargeType;

    public BatteryInfo(@Nullable Integer num, @NonNull ChargeType chargeType) {
        this.batteryLevel = num;
        this.chargeType = chargeType;
    }
}
