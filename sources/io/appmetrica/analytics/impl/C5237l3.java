package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5237l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f77641a;

    public C5237l3(long j10) {
        this.f77641a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5237l3.class == obj.getClass() && this.f77641a == ((C5237l3) obj).f77641a;
    }

    public final int hashCode() {
        long j10 = this.f77641a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f77641a + '}';
    }
}
