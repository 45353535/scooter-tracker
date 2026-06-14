package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f110992a = new w92(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110993b;

    public final long a(yc0 yc0Var) {
        int i10 = 0;
        yc0Var.b(this.f110992a.f117356a, 0, 1, false);
        int i11 = this.f110992a.f117356a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        yc0Var.b(this.f110992a.f117356a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f110992a.f117356a[i10] & 255) + (i14 << 8);
        }
        this.f110993b = i13 + 1 + this.f110993b;
        return i14;
    }
}
