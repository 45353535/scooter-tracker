package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f56327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56328d;

    public o(int i10, boolean z10, double d10, int i11) {
        this.f56325a = i10;
        this.f56326b = z10;
        this.f56327c = d10;
        this.f56328d = i11;
    }

    public final int a() {
        return this.f56325a;
    }

    public final int b() {
        return this.f56328d;
    }

    public final double c() {
        return this.f56327c;
    }

    public final boolean d() {
        return this.f56326b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f56325a == oVar.f56325a && this.f56326b == oVar.f56326b && Double.compare(this.f56327c, oVar.f56327c) == 0 && this.f56328d == oVar.f56328d;
    }

    public int hashCode() {
        return (((((this.f56325a * 31) + androidx.compose.foundation.c.a(this.f56326b)) * 31) + androidx.collection.a.a(this.f56327c)) * 31) + this.f56328d;
    }

    public String toString() {
        return "MediaConfig(chunkSize=" + this.f56325a + ", isStreamingEnabled=" + this.f56326b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.f56327c + ", mediaCacheDiskCleanUpLimit=" + this.f56328d + ')';
    }
}
