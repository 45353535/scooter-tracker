package com.appodeal.ads.adapters.inmobi;

import com.appodeal.ads.AdUnitParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12350b;

    public b(long j10) {
        Map extras = d.f12356a;
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f12349a = j10;
        this.f12350b = extras;
    }

    public final String toString() {
        return "InmobiAdUnitParams(placementId=" + this.f12349a + ", extras=" + this.f12350b + ")";
    }
}
