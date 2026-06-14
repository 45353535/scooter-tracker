package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76038a;

    public Km(long j10) {
        this.f76038a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Km.class == obj.getClass() && this.f76038a == ((Km) obj).f76038a;
    }

    public final int hashCode() {
        long j10 = this.f76038a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f76038a + '}';
    }
}
