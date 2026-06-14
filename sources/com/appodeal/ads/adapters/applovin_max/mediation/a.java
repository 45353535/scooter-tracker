package com.appodeal.ads.adapters.applovin_max.mediation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12023c;

    public a(String slotUuid, long j10, String str) {
        Intrinsics.checkNotNullParameter(slotUuid, "slotUuid");
        this.f12021a = slotUuid;
        this.f12022b = j10;
        this.f12023c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12021a, aVar.f12021a) && this.f12022b == aVar.f12022b && Intrinsics.areEqual(this.f12023c, aVar.f12023c);
    }

    public final int hashCode() {
        int iA = (androidx.collection.b.a(this.f12022b) + (this.f12021a.hashCode() * 31)) * 31;
        String str = this.f12023c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Amazon(slotUuid=" + this.f12021a + ", timeoutMs=" + this.f12022b + ", interstitialType=" + this.f12023c + ")";
    }
}
