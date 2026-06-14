package com.appodeal.ads.networking;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f14125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14131h;

    public i(List configKeys, Long l10, boolean z10, boolean z11, boolean z12, String adRevenueKey, long j10, String str) {
        Intrinsics.checkNotNullParameter(configKeys, "configKeys");
        Intrinsics.checkNotNullParameter(adRevenueKey, "adRevenueKey");
        this.f14124a = configKeys;
        this.f14125b = l10;
        this.f14126c = z10;
        this.f14127d = z11;
        this.f14128e = z12;
        this.f14129f = adRevenueKey;
        this.f14130g = j10;
        this.f14131h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f14124a, iVar.f14124a) && Intrinsics.areEqual(this.f14125b, iVar.f14125b) && this.f14126c == iVar.f14126c && this.f14127d == iVar.f14127d && this.f14128e == iVar.f14128e && Intrinsics.areEqual(this.f14129f, iVar.f14129f) && this.f14130g == iVar.f14130g && Intrinsics.areEqual(this.f14131h, iVar.f14131h);
    }

    public final int hashCode() {
        int iHashCode = this.f14124a.hashCode() * 31;
        Long l10 = this.f14125b;
        int iA = e.a(this.f14130g, com.appodeal.ads.initializing.f.a(this.f14129f, (androidx.compose.foundation.c.a(this.f14128e) + ((androidx.compose.foundation.c.a(this.f14127d) + ((androidx.compose.foundation.c.a(this.f14126c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31);
        String str = this.f14131h;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseConfig(configKeys=" + this.f14124a + ", expirationDurationSec=" + this.f14125b + ", isEventTrackingEnabled=" + this.f14126c + ", isRevenueTrackingEnabled=" + this.f14127d + ", isInternalEventTrackingEnabled=" + this.f14128e + ", adRevenueKey=" + this.f14129f + ", initTimeoutMs=" + this.f14130g + ", initializationMode=" + this.f14131h + ")";
    }
}
