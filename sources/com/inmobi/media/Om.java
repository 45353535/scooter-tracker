package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Om extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37507a;

    public Om(long j10) {
        this.f37507a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Om) && this.f37507a == ((Om) obj).f37507a;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f37507a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f37507a + ")";
    }
}
