package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3617c0 f37978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3869m0 f37979b;

    public X(C3617c0 adLifecycleData, C3869m0 adManagerTelemetryHelper) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(adManagerTelemetryHelper, "adManagerTelemetryHelper");
        this.f37978a = adLifecycleData;
        this.f37979b = adManagerTelemetryHelper;
    }

    public final void a(W adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        if (adFetchEvent instanceof C3731gb) {
            C3617c0 c3617c0 = this.f37978a;
            c3617c0.getClass();
            c3617c0.f38309b = SystemClock.elapsedRealtime();
        } else if (adFetchEvent instanceof If) {
            C3617c0 c3617c02 = this.f37978a;
            c3617c02.getClass();
            c3617c02.f38313f = SystemClock.elapsedRealtime();
        } else {
            if (!(adFetchEvent instanceof Oi)) {
                throw new lf.m();
            }
            C3869m0 c3869m0 = this.f37979b;
            Map payload = ((Oi) adFetchEvent).f37504a;
            c3869m0.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            eg.i.d(c3869m0.f38999a, null, null, new C3819k0(c3869m0, payload, null), 3, null);
        }
    }
}
