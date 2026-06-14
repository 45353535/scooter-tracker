package com.appodeal.ads.utils.session;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15072i;

    public e(int i10, String sessionUuid, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        this.f15064a = i10;
        this.f15065b = sessionUuid;
        this.f15066c = j10;
        this.f15067d = j11;
        this.f15068e = j12;
        this.f15069f = j13;
        this.f15070g = j14;
        this.f15071h = j15;
        this.f15072i = j16;
    }

    public static e a(e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        int i11 = eVar.f15064a;
        String sessionUuid = eVar.f15065b;
        long j15 = eVar.f15066c;
        long j16 = eVar.f15067d;
        long j17 = (i10 & 16) != 0 ? eVar.f15068e : j10;
        long j18 = (i10 & 32) != 0 ? eVar.f15069f : j11;
        long j19 = (i10 & 64) != 0 ? eVar.f15070g : j12;
        long j20 = (i10 & 128) != 0 ? eVar.f15071h : j13;
        long j21 = (i10 & 256) != 0 ? eVar.f15072i : j14;
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        return new e(i11, sessionUuid, j15, j16, j17, j18, j19, j20, j21);
    }

    public final String b() {
        return this.f15065b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15064a == eVar.f15064a && Intrinsics.areEqual(this.f15065b, eVar.f15065b) && this.f15066c == eVar.f15066c && this.f15067d == eVar.f15067d && this.f15068e == eVar.f15068e && this.f15069f == eVar.f15069f && this.f15070g == eVar.f15070g && this.f15071h == eVar.f15071h && this.f15072i == eVar.f15072i;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f15072i) + com.appodeal.ads.networking.e.a(this.f15071h, com.appodeal.ads.networking.e.a(this.f15070g, com.appodeal.ads.networking.e.a(this.f15069f, com.appodeal.ads.networking.e.a(this.f15068e, com.appodeal.ads.networking.e.a(this.f15067d, com.appodeal.ads.networking.e.a(this.f15066c, com.appodeal.ads.initializing.f.a(this.f15065b, this.f15064a * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Session(sessionId=" + this.f15064a + ", sessionUuid=" + this.f15065b + ", sessionStartTimeMs=" + this.f15066c + ", sessionStartTimeMonoMs=" + this.f15067d + ", sessionUptimeMs=" + this.f15068e + ", sessionUptimeMonoMs=" + this.f15069f + ", resumeTimeMs=" + this.f15070g + ", resumeTimeMonoMs=" + this.f15071h + ", impressionsCount=" + this.f15072i + ")";
    }
}
