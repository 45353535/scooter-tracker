package com.appodeal.ads.adapters.level_play.mediation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12424c;

    public b(String slotUuid, long j10, String str) {
        Intrinsics.checkNotNullParameter(slotUuid, "slotUuid");
        this.f12422a = slotUuid;
        this.f12423b = j10;
        this.f12424c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f12422a, bVar.f12422a) && this.f12423b == bVar.f12423b && Intrinsics.areEqual(this.f12424c, bVar.f12424c);
    }

    public final int hashCode() {
        int iA = (androidx.collection.b.a(this.f12423b) + (this.f12422a.hashCode() * 31)) * 31;
        String str = this.f12424c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Amazon(slotUuid=" + this.f12422a + ", timeoutMs=" + this.f12423b + ", interstitialType=" + this.f12424c + ")";
    }
}
