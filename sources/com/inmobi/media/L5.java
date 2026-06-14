package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f37267c;

    public L5(int i10, int i11, float f10) {
        this.f37265a = i10;
        this.f37266b = i11;
        this.f37267c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l52 = (L5) obj;
        return this.f37265a == l52.f37265a && this.f37266b == l52.f37266b && Float.compare(this.f37267c, l52.f37267c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37267c) + AbstractC3712fi.a(this.f37266b, this.f37265a * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f37265a + ", height=" + this.f37266b + ", density=" + this.f37267c + ")";
    }
}
