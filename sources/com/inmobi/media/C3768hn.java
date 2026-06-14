package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3768hn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38723a;

    public C3768hn(long j10) {
        this.f38723a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3768hn) && this.f38723a == ((C3768hn) obj).f38723a;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f38723a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f38723a + ")";
    }
}
