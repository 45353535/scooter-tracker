package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110735b;

    public fi3(int i10, int i11) {
        this.f110734a = i10;
        this.f110735b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi3)) {
            return false;
        }
        fi3 fi3Var = (fi3) obj;
        return this.f110734a == fi3Var.f110734a && this.f110735b == fi3Var.f110735b;
    }

    public final int hashCode() {
        return this.f110735b + (this.f110734a * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f110734a + ", height=" + this.f110735b + ")";
    }
}
