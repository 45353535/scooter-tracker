package com.appodeal.ads.networking;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14123c;

    public h(boolean z10, boolean z11, long j10) {
        this.f14121a = z10;
        this.f14122b = z11;
        this.f14123c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f14121a == hVar.f14121a && this.f14122b == hVar.f14122b && this.f14123c == hVar.f14123c;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f14123c) + ((androidx.compose.foundation.c.a(this.f14122b) + (androidx.compose.foundation.c.a(this.f14121a) * 31)) * 31);
    }

    public final String toString() {
        return "FacebookConfig(isEventTrackingEnabled=" + this.f14121a + ", isRevenueTrackingEnabled=" + this.f14122b + ", initTimeoutMs=" + this.f14123c + ")";
    }
}
