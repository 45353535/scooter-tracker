package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* JADX INFO: loaded from: classes12.dex */
public final class Y2 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z2 f76688a;

    public Y2(Z2 z22) {
        this.f76688a = z22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f76688a.f76731b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f76688a.getClass();
        BatteryInfo batteryInfoA = Z2.a(intent);
        this.f76688a.f76731b = batteryInfoA;
        if (chargeType != batteryInfoA.chargeType) {
            this.f76688a.f76730a.execute(new X2(this, batteryInfoA));
        }
    }
}
