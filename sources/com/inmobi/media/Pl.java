package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Pl extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37553a;

    public Pl(long j10) {
        this.f37553a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pl) && this.f37553a == ((Pl) obj).f37553a;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f37553a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.f37553a + ")";
    }
}
