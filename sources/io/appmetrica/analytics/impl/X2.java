package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class X2 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f76655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f76656b;

    public X2(Y2 y22, BatteryInfo batteryInfo) {
        this.f76656b = y22;
        this.f76655a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Z2 z22 = this.f76656b.f76688a;
        ChargeType chargeType = this.f76655a.chargeType;
        ChargeType chargeType2 = Z2.f76729d;
        synchronized (z22) {
            Iterator it = z22.f76732c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
