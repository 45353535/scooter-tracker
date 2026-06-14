package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f38005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38008d;

    public Xf(Rf ping, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(ping, "ping");
        this.f38005a = ping;
        this.f38006b = i10;
        this.f38007c = str;
        this.f38008d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xf)) {
            return false;
        }
        Xf xf2 = (Xf) obj;
        return Intrinsics.areEqual(this.f38005a, xf2.f38005a) && this.f38006b == xf2.f38006b && Intrinsics.areEqual(this.f38007c, xf2.f38007c) && this.f38008d == xf2.f38008d;
    }

    public final int hashCode() {
        int iA = AbstractC3712fi.a(this.f38006b, this.f38005a.hashCode() * 31, 31);
        String str = this.f38007c;
        return androidx.collection.b.a(this.f38008d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f38005a + ", statusCode=" + this.f38006b + ", error=" + this.f38007c + ", timestamp=" + this.f38008d + ")";
    }
}
