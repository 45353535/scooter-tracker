package com.appodeal.ads.networking;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f14106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14110g;

    public f(String appToken, String environment, Map eventTokens, boolean z10, boolean z11, long j10, String str) {
        Intrinsics.checkNotNullParameter(appToken, "appToken");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(eventTokens, "eventTokens");
        this.f14104a = appToken;
        this.f14105b = environment;
        this.f14106c = eventTokens;
        this.f14107d = z10;
        this.f14108e = z11;
        this.f14109f = j10;
        this.f14110g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f14104a, fVar.f14104a) && Intrinsics.areEqual(this.f14105b, fVar.f14105b) && Intrinsics.areEqual(this.f14106c, fVar.f14106c) && this.f14107d == fVar.f14107d && this.f14108e == fVar.f14108e && this.f14109f == fVar.f14109f && Intrinsics.areEqual(this.f14110g, fVar.f14110g);
    }

    public final int hashCode() {
        int iA = e.a(this.f14109f, (androidx.compose.foundation.c.a(this.f14108e) + ((androidx.compose.foundation.c.a(this.f14107d) + ((this.f14106c.hashCode() + com.appodeal.ads.initializing.f.a(this.f14105b, this.f14104a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31);
        String str = this.f14110g;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AdjustConfig(appToken=" + this.f14104a + ", environment=" + this.f14105b + ", eventTokens=" + this.f14106c + ", isEventTrackingEnabled=" + this.f14107d + ", isRevenueTrackingEnabled=" + this.f14108e + ", initTimeoutMs=" + this.f14109f + ", initializationMode=" + this.f14110g + ")";
    }
}
