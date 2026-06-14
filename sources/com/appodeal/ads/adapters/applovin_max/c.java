package com.appodeal.ads.adapters.applovin_max;

import com.appodeal.ads.InitializeParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11993e;

    public c(String sdkKey, List adUnitIds, String mediatorName, boolean z10, Map extraData) {
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(adUnitIds, "adUnitIds");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f11989a = sdkKey;
        this.f11990b = adUnitIds;
        this.f11991c = mediatorName;
        this.f11992d = z10;
        this.f11993e = extraData;
    }

    public final List a() {
        return this.f11990b;
    }

    public final Map b() {
        return this.f11993e;
    }

    public final String c() {
        return this.f11991c;
    }

    public final String d() {
        return this.f11989a;
    }

    public final boolean e() {
        return this.f11992d;
    }

    public final String toString() {
        return "ApplovinMaxInitializeParams(sdkKey='" + this.f11989a + "', adUnitIds=" + this.f11990b + ", mediatorName='" + this.f11991c + "', isMuted=" + this.f11992d + ", extraData='" + this.f11993e + "')";
    }
}
