package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56691f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f56686a = i10;
        this.f56687b = i11;
        this.f56688c = i12;
        this.f56689d = i13;
        this.f56690e = i14;
        this.f56691f = i15;
    }

    public final int a() {
        return this.f56690e;
    }

    public final int b() {
        return this.f56691f;
    }

    public final int c() {
        return this.f56686a;
    }

    public final int d() {
        return this.f56687b;
    }

    public final int e() {
        return this.f56688c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f56686a == aVar.f56686a && this.f56687b == aVar.f56687b && this.f56688c == aVar.f56688c && this.f56689d == aVar.f56689d && this.f56690e == aVar.f56690e && this.f56691f == aVar.f56691f;
    }

    public final int f() {
        return this.f56689d;
    }

    public int hashCode() {
        return (((((((((this.f56686a * 31) + this.f56687b) * 31) + this.f56688c) * 31) + this.f56689d) * 31) + this.f56690e) * 31) + this.f56691f;
    }

    public String toString() {
        return "AdTouch(viewPositionX=" + this.f56686a + ", viewPositionY=" + this.f56687b + ", viewSizeHeight=" + this.f56688c + ", viewSizeWidth=" + this.f56689d + ", touchX=" + this.f56690e + ", touchY=" + this.f56691f + ')';
    }
}
