package com.appodeal.ads.networking;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14120j;

    public g(String devKey, String appId, String adId, List conversionKeys, boolean z10, boolean z11, boolean z12, String inAppTrackerType, long j10, String str) {
        Intrinsics.checkNotNullParameter(devKey, "devKey");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(conversionKeys, "conversionKeys");
        Intrinsics.checkNotNullParameter(inAppTrackerType, "inAppTrackerType");
        this.f14111a = devKey;
        this.f14112b = appId;
        this.f14113c = adId;
        this.f14114d = conversionKeys;
        this.f14115e = z10;
        this.f14116f = z11;
        this.f14117g = z12;
        this.f14118h = inAppTrackerType;
        this.f14119i = j10;
        this.f14120j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f14111a, gVar.f14111a) && Intrinsics.areEqual(this.f14112b, gVar.f14112b) && Intrinsics.areEqual(this.f14113c, gVar.f14113c) && Intrinsics.areEqual(this.f14114d, gVar.f14114d) && this.f14115e == gVar.f14115e && this.f14116f == gVar.f14116f && this.f14117g == gVar.f14117g && Intrinsics.areEqual(this.f14118h, gVar.f14118h) && this.f14119i == gVar.f14119i && Intrinsics.areEqual(this.f14120j, gVar.f14120j);
    }

    public final int hashCode() {
        int iA = e.a(this.f14119i, com.appodeal.ads.initializing.f.a(this.f14118h, (androidx.compose.foundation.c.a(this.f14117g) + ((androidx.compose.foundation.c.a(this.f14116f) + ((androidx.compose.foundation.c.a(this.f14115e) + ((this.f14114d.hashCode() + com.appodeal.ads.initializing.f.a(this.f14113c, com.appodeal.ads.initializing.f.a(this.f14112b, this.f14111a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        String str = this.f14120j;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppsflyerConfig(devKey=" + this.f14111a + ", appId=" + this.f14112b + ", adId=" + this.f14113c + ", conversionKeys=" + this.f14114d + ", isEventTrackingEnabled=" + this.f14115e + ", isRevenueTrackingEnabled=" + this.f14116f + ", isInternalEventTrackingEnabled=" + this.f14117g + ", inAppTrackerType=" + this.f14118h + ", initTimeoutMs=" + this.f14119i + ", initializationMode=" + this.f14120j + ")";
    }
}
