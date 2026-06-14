package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class sy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115994e;

    public sy2(int i10, int i11, int i12, int i13) {
        this.f115990a = i10;
        this.f115991b = i11;
        this.f115992c = i12;
        this.f115993d = i13;
        this.f115994e = i12 * i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy2)) {
            return false;
        }
        sy2 sy2Var = (sy2) obj;
        return this.f115990a == sy2Var.f115990a && this.f115991b == sy2Var.f115991b && this.f115992c == sy2Var.f115992c && this.f115993d == sy2Var.f115993d;
    }

    public final int hashCode() {
        return this.f115993d + bb3.a(this.f115992c, bb3.a(this.f115991b, this.f115990a * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.f115990a + ", y=" + this.f115991b + ", width=" + this.f115992c + ", height=" + this.f115993d + ")";
    }
}
