package com.appodeal.ads.utils.session;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15055d;

    public b(int i10, long j10, long j11, long j12) {
        this.f15052a = i10;
        this.f15053b = j10;
        this.f15054c = j11;
        this.f15055d = j12;
    }

    public static b b(b bVar, int i10, long j10, long j11, int i11) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f15052a;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            j10 = bVar.f15053b;
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = bVar.f15054c;
        }
        return new b(i12, j12, j11, bVar.f15055d);
    }

    public final int a() {
        return this.f15052a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15052a == bVar.f15052a && this.f15053b == bVar.f15053b && this.f15054c == bVar.f15054c && this.f15055d == bVar.f15055d;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f15055d) + com.appodeal.ads.networking.e.a(this.f15054c, com.appodeal.ads.networking.e.a(this.f15053b, this.f15052a * 31, 31), 31);
    }

    public final String toString() {
        return "AppTimes(sessionsAmount=" + this.f15052a + ", appUptimeMs=" + this.f15053b + ", appUptimeMonoMs=" + this.f15054c + ", firstLaunchTime=" + this.f15055d + ")";
    }
}
