package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class Z2 implements ChargeTypeProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ChargeType f76729d = ChargeType.UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f76730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f76731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f76732c = new ArrayList();

    public Z2(@NonNull ICommonExecutor iCommonExecutor, @NonNull W2 w22) {
        Y2 y22 = new Y2(this);
        this.f76730a = iCommonExecutor;
        this.f76731b = a(w22.a(y22));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f76729d;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(numValueOf, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @Nullable
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f76731b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @NonNull
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f76731b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f76732c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
