package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class gi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111225b;

    public gi3(int i10, int i11) {
        this.f111224a = i10;
        this.f111225b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi3)) {
            return false;
        }
        gi3 gi3Var = (gi3) obj;
        return this.f111224a == gi3Var.f111224a && this.f111225b == gi3Var.f111225b;
    }

    public final int hashCode() {
        return this.f111225b + (this.f111224a * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f111224a + ", height=" + this.f111225b + ")";
    }
}
