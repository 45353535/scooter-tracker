package com.moloco.sdk.common_adapter_internal;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f54119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f54121f;

    public b(int i10, int i11, float f10, float f11, int i12, float f12) {
        this.f54116a = i10;
        this.f54117b = i11;
        this.f54118c = f10;
        this.f54119d = f11;
        this.f54120e = i12;
        this.f54121f = f12;
    }

    public final int a() {
        return this.f54120e;
    }

    public final float b() {
        return this.f54119d;
    }

    public final int c() {
        return this.f54117b;
    }

    public final float d() {
        return this.f54121f;
    }

    public final float e() {
        return this.f54118c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54116a == bVar.f54116a && this.f54117b == bVar.f54117b && Float.compare(this.f54118c, bVar.f54118c) == 0 && Float.compare(this.f54119d, bVar.f54119d) == 0 && this.f54120e == bVar.f54120e && Float.compare(this.f54121f, bVar.f54121f) == 0;
    }

    public final int f() {
        return this.f54116a;
    }

    public int hashCode() {
        return (((((((((this.f54116a * 31) + this.f54117b) * 31) + Float.floatToIntBits(this.f54118c)) * 31) + Float.floatToIntBits(this.f54119d)) * 31) + this.f54120e) * 31) + Float.floatToIntBits(this.f54121f);
    }

    public String toString() {
        return "ScreenData(widthPx=" + this.f54116a + ", heightPx=" + this.f54117b + ", widthDp=" + this.f54118c + ", heightDp=" + this.f54119d + ", dpi=" + this.f54120e + ", pxRatio=" + this.f54121f + ')';
    }
}
