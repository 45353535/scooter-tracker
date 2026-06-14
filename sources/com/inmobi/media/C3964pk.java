package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3964pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39297c;

    public C3964pk(long j10, long j11, long j12) {
        this.f39295a = j10;
        this.f39296b = j11;
        this.f39297c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3964pk)) {
            return false;
        }
        C3964pk c3964pk = (C3964pk) obj;
        return this.f39295a == c3964pk.f39295a && this.f39296b == c3964pk.f39296b && this.f39297c == c3964pk.f39297c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f39297c) + ((androidx.collection.b.a(this.f39296b) + (androidx.collection.b.a(this.f39295a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f39295a + ", readTimeoutInSec=" + this.f39296b + ", callTimeoutInSec=" + this.f39297c + ")";
    }
}
