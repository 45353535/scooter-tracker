package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58658c;

    public a(boolean z10, boolean z11, boolean z12) {
        this.f58656a = z10;
        this.f58657b = z11;
        this.f58658c = z12;
    }

    public static /* synthetic */ a a(a aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f58656a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f58657b;
        }
        if ((i10 & 4) != 0) {
            z12 = aVar.f58658c;
        }
        return aVar.b(z10, z11, z12);
    }

    public final a b(boolean z10, boolean z11, boolean z12) {
        return new a(z10, z11, z12);
    }

    public final boolean c() {
        return this.f58658c;
    }

    public final boolean d() {
        return this.f58656a;
    }

    public final boolean e() {
        return this.f58657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f58656a == aVar.f58656a && this.f58657b == aVar.f58657b && this.f58658c == aVar.f58658c;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.c.a(this.f58656a) * 31) + androidx.compose.foundation.c.a(this.f58657b)) * 31) + androidx.compose.foundation.c.a(this.f58658c);
    }

    public String toString() {
        return "PlayingState(isPlaying=" + this.f58656a + ", isVisible=" + this.f58657b + ", hasMore=" + this.f58658c + ')';
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }
}
