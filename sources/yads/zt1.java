package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zt1 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w92 f118816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au1 f118817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z43 f118819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f118820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118821f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f118823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f118824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f118825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f118826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f118827l;

    public zt1(String str) {
        w92 w92Var = new w92(4);
        this.f118816a = w92Var;
        w92Var.a()[0] = -1;
        this.f118817b = new au1();
        this.f118827l = -9223372036854775807L;
        this.f118818c = str;
    }

    @Override // yads.qk0
    public final void a(w92 w92Var) {
        if (this.f118819d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = w92Var.f117358c;
            int i11 = w92Var.f117357b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f118821f;
            if (i13 == 0) {
                byte[] bArr = w92Var.f117356a;
                while (true) {
                    if (i11 >= i10) {
                        w92Var.e(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f118824i && (b10 & 224) == 224;
                    this.f118824i = z10;
                    if (z11) {
                        w92Var.e(i11 + 1);
                        this.f118824i = false;
                        this.f118816a.f117356a[1] = bArr[i11];
                        this.f118822g = 2;
                        this.f118821f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f118822g);
                w92Var.a(this.f118816a.f117356a, this.f118822g, iMin);
                int i14 = this.f118822g + iMin;
                this.f118822g = i14;
                if (i14 >= 4) {
                    this.f118816a.e(0);
                    if (this.f118817b.a(this.f118816a.b())) {
                        au1 au1Var = this.f118817b;
                        this.f118826k = au1Var.f108823c;
                        if (!this.f118823h) {
                            long j10 = ((long) au1Var.f108827g) * 1000000;
                            int i15 = au1Var.f108824d;
                            this.f118825j = j10 / ((long) i15);
                            xv0 xv0Var = new xv0();
                            xv0Var.f117972a = this.f118820e;
                            xv0Var.f117982k = au1Var.f108822b;
                            xv0Var.f117983l = 4096;
                            xv0Var.f117995x = au1Var.f108825e;
                            xv0Var.f117996y = i15;
                            xv0Var.f117974c = this.f118818c;
                            this.f118819d.a(new yv0(xv0Var));
                            this.f118823h = true;
                        }
                        this.f118816a.e(0);
                        this.f118819d.a(4, this.f118816a);
                        this.f118821f = 2;
                    } else {
                        this.f118822g = 0;
                        this.f118821f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i12, this.f118826k - this.f118822g);
                this.f118819d.a(iMin2, w92Var);
                int i16 = this.f118822g + iMin2;
                this.f118822g = i16;
                int i17 = this.f118826k;
                if (i16 >= i17) {
                    long j11 = this.f118827l;
                    if (j11 != -9223372036854775807L) {
                        this.f118819d.a(j11, 1, i17, 0, null);
                        this.f118827l += this.f118825j;
                    }
                    this.f118822g = 0;
                    this.f118821f = 0;
                }
            }
        }
    }

    @Override // yads.qk0
    public final void b() {
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f118820e = y63Var.f118107e;
        y63Var.b();
        this.f118819d = ap0Var.a(y63Var.f118106d, 1);
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f118827l = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f118821f = 0;
        this.f118822g = 0;
        this.f118824i = false;
        this.f118827l = -9223372036854775807L;
    }
}
