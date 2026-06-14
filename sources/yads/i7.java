package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by2 f111882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dy2 f111883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111884c;

    public i7(by2 by2Var, dy2 dy2Var, long j10) {
        this.f111882a = by2Var;
        this.f111883b = dy2Var;
        this.f111884c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return this.f111882a == i7Var.f111882a && this.f111883b == i7Var.f111883b && this.f111884c == i7Var.f111884c;
    }

    public final int hashCode() {
        by2 by2Var = this.f111882a;
        int iHashCode = (by2Var == null ? 0 : by2Var.hashCode()) * 31;
        dy2 dy2Var = this.f111883b;
        return androidx.collection.b.a(this.f111884c) + ((iHashCode + (dy2Var != null ? dy2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.f111882a + ", visibility=" + this.f111883b + ", delay=" + this.f111884c + ")";
    }
}
