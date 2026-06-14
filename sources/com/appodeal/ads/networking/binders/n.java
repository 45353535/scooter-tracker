package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f14073j;

    public n(long j10, String str, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f14064a = j10;
        this.f14065b = str;
        this.f14066c = j11;
        this.f14067d = j12;
        this.f14068e = j13;
        this.f14069f = j14;
        this.f14070g = j15;
        this.f14071h = j16;
        this.f14072i = j17;
        this.f14073j = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f14064a == nVar.f14064a && Intrinsics.areEqual(this.f14065b, nVar.f14065b) && this.f14066c == nVar.f14066c && this.f14067d == nVar.f14067d && this.f14068e == nVar.f14068e && this.f14069f == nVar.f14069f && this.f14070g == nVar.f14070g && this.f14071h == nVar.f14071h && this.f14072i == nVar.f14072i && this.f14073j == nVar.f14073j;
    }

    public final int hashCode() {
        int iA = androidx.collection.b.a(this.f14064a) * 31;
        String str = this.f14065b;
        return androidx.collection.b.a(this.f14073j) + com.appodeal.ads.networking.e.a(this.f14072i, com.appodeal.ads.networking.e.a(this.f14071h, com.appodeal.ads.networking.e.a(this.f14070g, com.appodeal.ads.networking.e.a(this.f14069f, com.appodeal.ads.networking.e.a(this.f14068e, com.appodeal.ads.networking.e.a(this.f14067d, com.appodeal.ads.networking.e.a(this.f14066c, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Session(sessionId=" + this.f14064a + ", sessionUuid=" + this.f14065b + ", sessionUptimeSec=" + this.f14066c + ", sessionUptimeMonotonicMs=" + this.f14067d + ", sessionStartSec=" + this.f14068e + ", sessionStartMonotonicMs=" + this.f14069f + ", appUptimeSec=" + this.f14070g + ", appUptimeMonotonicMs=" + this.f14071h + ", appSessionAverageLengthSec=" + this.f14072i + ", appSessionAverageLengthMonotonicMs=" + this.f14073j + ")";
    }
}
