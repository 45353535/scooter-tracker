package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5157i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77363b;

    public C5157i0(String str, long j10) {
        this.f77362a = str;
        this.f77363b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5157i0.class == obj.getClass()) {
            C5157i0 c5157i0 = (C5157i0) obj;
            if (this.f77363b != c5157i0.f77363b) {
                return false;
            }
            String str = this.f77362a;
            String str2 = c5157i0.f77362a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f77362a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f77363b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
