package com.appodeal.ads.adapters.mintegral;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12493c;

    public a(String unitId, String placementId, boolean z10) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f12491a = unitId;
        this.f12492b = placementId;
        this.f12493c = z10;
    }

    public final String toString() {
        return "MintegralAdUnitParams(unitId='" + this.f12491a + "', placementId='" + this.f12492b + "', isMuted=" + this.f12493c + ")";
    }
}
