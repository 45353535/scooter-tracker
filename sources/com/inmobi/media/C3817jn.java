package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3817jn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38841a;

    public C3817jn(long j10) {
        this.f38841a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3817jn) && this.f38841a == ((C3817jn) obj).f38841a;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f38841a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f38841a + ")";
    }
}
