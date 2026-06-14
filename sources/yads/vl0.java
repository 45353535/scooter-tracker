package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vl0 implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv0 f117056b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f117058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wl0 f117060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f117062h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ul0 f117057c = new ul0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f117063i = -9223372036854775807L;

    public vl0(wl0 wl0Var, yv0 yv0Var, boolean z10) {
        this.f117056b = yv0Var;
        this.f117060f = wl0Var;
        this.f117058d = wl0Var.f117508b;
        a(wl0Var, z10);
    }

    @Override // yads.iq2
    public final void a() {
    }

    @Override // yads.iq2
    public final boolean c() {
        return true;
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        int i11 = this.f117062h;
        boolean z10 = i11 == this.f117058d.length;
        if (z10 && !this.f117059e) {
            fa0Var.f112430b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f117061g) {
            zv0Var.f118845b = this.f117056b;
            this.f117061g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f117062h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f117057c.a(this.f117060f.f117507a[i11]);
            fa0Var.c(bArrA.length);
            fa0Var.f110670d.put(bArrA);
        }
        fa0Var.f110672f = this.f117058d[i11];
        fa0Var.f112430b = 1;
        return -4;
    }

    @Override // yads.iq2
    public final int a(long j10) {
        int iMax = Math.max(this.f117062h, w83.a(this.f117058d, j10, true));
        int i10 = iMax - this.f117062h;
        this.f117062h = iMax;
        return i10;
    }

    public final void a(wl0 wl0Var, boolean z10) {
        int i10 = this.f117062h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f117058d[i10 - 1];
        this.f117059e = z10;
        this.f117060f = wl0Var;
        long[] jArr = wl0Var.f117508b;
        this.f117058d = jArr;
        long j12 = this.f117063i;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f117062h = w83.a(jArr, j11, false);
            }
        } else {
            int iA = w83.a(jArr, j12, true);
            this.f117062h = iA;
            if (this.f117059e && iA == this.f117058d.length) {
                j10 = j12;
            }
            this.f117063i = j10;
        }
    }
}
