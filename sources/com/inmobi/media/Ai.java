package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36581b;

    public Ai(int i10, long j10, int i11) {
        this.f36580a = i10;
        this.f36581b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai)) {
            return false;
        }
        Ai ai2 = (Ai) obj;
        return this.f36580a == ai2.f36580a && this.f36581b == ai2.f36581b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return androidx.collection.a.a(1.0d) + ((androidx.collection.b.a(this.f36581b) + (this.f36580a * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f36580a + ", retryInterval=" + this.f36581b + ", delayFactor=1.0)";
    }

    public Ai(long j10, int i10) {
        this.f36580a = i10;
        this.f36581b = j10;
    }
}
