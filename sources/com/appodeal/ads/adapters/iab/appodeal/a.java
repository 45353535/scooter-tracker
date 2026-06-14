package com.appodeal.ads.adapters.iab.appodeal;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f12204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12206c;

    public a(JSONObject ad2, String packageName, long j10) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f12204a = ad2;
        this.f12205b = packageName;
        this.f12206c = j10;
    }

    public final String toString() {
        return "AppodealNativeAdUnitParams(ad=" + this.f12204a + ", packageName='" + this.f12205b + "', expiryTime=" + this.f12206c + ")";
    }
}
