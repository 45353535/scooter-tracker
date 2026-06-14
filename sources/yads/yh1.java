package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zh1 f118184b;

    public yh1(int i10, zh1 zh1Var) {
        this.f118183a = i10;
        this.f118184b = zh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh1)) {
            return false;
        }
        yh1 yh1Var = (yh1) obj;
        return this.f118183a == yh1Var.f118183a && this.f118184b == yh1Var.f118184b;
    }

    public final int hashCode() {
        return this.f118184b.hashCode() + (this.f118183a * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f118183a + ", mode=" + this.f118184b + ")";
    }
}
