package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36828d;

    public F6(float f10, float f11, int i10, int i11) {
        this.f36825a = f10;
        this.f36826b = f11;
        this.f36827c = i10;
        this.f36828d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f62 = (F6) obj;
        return Float.compare(this.f36825a, f62.f36825a) == 0 && Float.compare(this.f36826b, f62.f36826b) == 0 && this.f36827c == f62.f36827c && this.f36828d == f62.f36828d;
    }

    public final int hashCode() {
        return this.f36828d + AbstractC3712fi.a(this.f36827c, (Float.floatToIntBits(this.f36826b) + (Float.floatToIntBits(this.f36825a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f36825a + ", y=" + this.f36826b + ", width=" + this.f36827c + ", height=" + this.f36828d + ")";
    }
}
