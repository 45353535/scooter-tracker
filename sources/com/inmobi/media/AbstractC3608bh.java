package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3608bh {
    public static final void a(AbstractC3582ah telemetryType) {
        Intrinsics.checkNotNullParameter(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof Xg) {
            linkedHashMap.put("trigger", ((Xg) telemetryType).f38009a);
            Wj wj = Wj.f37959a;
            Wj.b("BillingClientConnectionError", linkedHashMap, EnumC3585ak.f38215a);
        } else if (telemetryType instanceof Yg) {
            linkedHashMap.put("errorCode", Short.valueOf(((Yg) telemetryType).f38060a));
            Wj wj2 = Wj.f37959a;
            Wj.b("IAPFetchFailed", linkedHashMap, EnumC3585ak.f38215a);
        } else {
            if (!(telemetryType instanceof Zg)) {
                throw new lf.m();
            }
            Wj wj3 = Wj.f37959a;
            Wj.b("IAPFetchSuccess", linkedHashMap, EnumC3585ak.f38215a);
        }
    }
}
