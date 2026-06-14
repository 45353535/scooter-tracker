package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class dg0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dg0 f109913g = new dg0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f109914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f109915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f109916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f109917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f109918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f109919f;

    public dg0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f109914a = f10;
        this.f109915b = f11;
        this.f109916c = f12;
        this.f109917d = f13;
        this.f109918e = f14;
        this.f109919f = f15;
    }

    public final float a() {
        return this.f109917d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg0)) {
            return false;
        }
        dg0 dg0Var = (dg0) obj;
        return Float.compare(this.f109914a, dg0Var.f109914a) == 0 && Float.compare(this.f109915b, dg0Var.f109915b) == 0 && Float.compare(this.f109916c, dg0Var.f109916c) == 0 && Float.compare(this.f109917d, dg0Var.f109917d) == 0 && Float.compare(this.f109918e, dg0Var.f109918e) == 0 && Float.compare(this.f109919f, dg0Var.f109919f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f109919f) + ((Float.floatToIntBits(this.f109918e) + ((Float.floatToIntBits(this.f109917d) + ((Float.floatToIntBits(this.f109916c) + ((Float.floatToIntBits(this.f109915b) + (Float.floatToIntBits(this.f109914a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f109914a + ", top=" + this.f109915b + ", right=" + this.f109916c + ", bottom=" + this.f109917d + ", cutoutTop=" + this.f109918e + ", cutoutBottom=" + this.f109919f + ")";
    }
}
