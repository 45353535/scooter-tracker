package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55442h;

    public q(String sessionId, long j10, long j11, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f55435a = sessionId;
        this.f55436b = j10;
        this.f55437c = j11;
        this.f55438d = i10;
        this.f55439e = i11;
        this.f55440f = i12;
        this.f55441g = i13;
        this.f55442h = i14;
    }

    public final int a() {
        return this.f55438d;
    }

    public final int b() {
        return this.f55441g;
    }

    public final long c() {
        return this.f55437c;
    }

    public final int d() {
        return this.f55439e;
    }

    public final int e() {
        return this.f55440f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f55435a, qVar.f55435a) && this.f55436b == qVar.f55436b && this.f55437c == qVar.f55437c && this.f55438d == qVar.f55438d && this.f55439e == qVar.f55439e && this.f55440f == qVar.f55440f && this.f55441g == qVar.f55441g && this.f55442h == qVar.f55442h;
    }

    public final int f() {
        return this.f55442h;
    }

    public final String g() {
        return this.f55435a;
    }

    public final long h() {
        return this.f55436b;
    }

    public int hashCode() {
        return (((((((((((((this.f55435a.hashCode() * 31) + androidx.collection.b.a(this.f55436b)) * 31) + androidx.collection.b.a(this.f55437c)) * 31) + this.f55438d) * 31) + this.f55439e) * 31) + this.f55440f) * 31) + this.f55441g) * 31) + this.f55442h;
    }

    public final boolean i() {
        return this.f55435a.length() > 0;
    }

    public String toString() {
        return "IlrdSignal(sessionId=" + this.f55435a + ", sessionStartTs=" + this.f55436b + ", lastImpressionTs=" + this.f55437c + ", bannerImpressionCount=" + this.f55438d + ", mrecImpressionCount=" + this.f55439e + ", nativeImpressionCount=" + this.f55440f + ", interstitialImpressionCount=" + this.f55441g + ", rewardedImpressionCount=" + this.f55442h + ')';
    }
}
