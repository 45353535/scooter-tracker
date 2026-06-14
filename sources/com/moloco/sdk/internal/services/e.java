package com.moloco.sdk.internal.services;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f55539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f55540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f55542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f55543h;

    public e(int i10, float f10, int i11, float f11, float f12, int i12, float f13, float f14) {
        this.f55536a = i10;
        this.f55537b = f10;
        this.f55538c = i11;
        this.f55539d = f11;
        this.f55540e = f12;
        this.f55541f = i12;
        this.f55542g = f13;
        this.f55543h = f14;
    }

    public final float a() {
        return this.f55540e;
    }

    public final int b() {
        return this.f55541f;
    }

    public final float c() {
        return this.f55539d;
    }

    public final int d() {
        return this.f55538c;
    }

    public final float e() {
        return this.f55537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f55536a == eVar.f55536a && Float.compare(this.f55537b, eVar.f55537b) == 0 && this.f55538c == eVar.f55538c && Float.compare(this.f55539d, eVar.f55539d) == 0 && Float.compare(this.f55540e, eVar.f55540e) == 0 && this.f55541f == eVar.f55541f && Float.compare(this.f55542g, eVar.f55542g) == 0 && Float.compare(this.f55543h, eVar.f55543h) == 0;
    }

    public final int f() {
        return this.f55536a;
    }

    public final float g() {
        return this.f55542g;
    }

    public final float h() {
        return this.f55543h;
    }

    public int hashCode() {
        return (((((((((((((this.f55536a * 31) + Float.floatToIntBits(this.f55537b)) * 31) + this.f55538c) * 31) + Float.floatToIntBits(this.f55539d)) * 31) + Float.floatToIntBits(this.f55540e)) * 31) + this.f55541f) * 31) + Float.floatToIntBits(this.f55542g)) * 31) + Float.floatToIntBits(this.f55543h);
    }

    public String toString() {
        return "ScreenInfo(screenWidthPx=" + this.f55536a + ", screenWidthDp=" + this.f55537b + ", screenHeightPx=" + this.f55538c + ", screenHeightDp=" + this.f55539d + ", density=" + this.f55540e + ", dpi=" + this.f55541f + ", xdpi=" + this.f55542g + ", ydpi=" + this.f55543h + ')';
    }
}
