package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements qk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v92 f112195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f112196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f112198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z43 f112199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f112202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f112203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yv0 f112204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f112205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f112206l;

    public j0() {
        this(null);
    }

    @Override // yads.qk0
    public final void a(w92 w92Var) {
        if (this.f112199e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = w92Var.f117358c - w92Var.f117357b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f112200f;
            if (i11 == 0) {
                while (w92Var.f117358c - w92Var.f117357b > 0) {
                    if (this.f112202h) {
                        int iM = w92Var.m();
                        this.f112202h = iM == 172;
                        if (iM == 64 || iM == 65) {
                            boolean z10 = iM == 65;
                            this.f112200f = 1;
                            byte[] bArr = this.f112196b.f117356a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z10 ? 65 : 64);
                            this.f112201g = 2;
                        }
                    } else {
                        this.f112202h = w92Var.m() == 172;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = this.f112196b.f117356a;
                int iMin = Math.min(i10, 16 - this.f112201g);
                w92Var.a(bArr2, this.f112201g, iMin);
                int i12 = this.f112201g + iMin;
                this.f112201g = i12;
                if (i12 == 16) {
                    this.f112195a.b(0);
                    k0 k0VarA = l0.a(this.f112195a);
                    yv0 yv0Var = this.f112204j;
                    if (yv0Var == null || 2 != yv0Var.f118411z || k0VarA.f112526a != yv0Var.A || !"audio/ac4".equals(yv0Var.f118398m)) {
                        xv0 xv0Var = new xv0();
                        xv0Var.f117972a = this.f112198d;
                        xv0Var.f117982k = "audio/ac4";
                        xv0Var.f117995x = 2;
                        xv0Var.f117996y = k0VarA.f112526a;
                        xv0Var.f117974c = this.f112197c;
                        yv0 yv0Var2 = new yv0(xv0Var);
                        this.f112204j = yv0Var2;
                        this.f112199e.a(yv0Var2);
                    }
                    this.f112205k = k0VarA.f112527b;
                    this.f112203i = (((long) k0VarA.f112528c) * 1000000) / ((long) this.f112204j.A);
                    this.f112196b.e(0);
                    this.f112199e.a(16, this.f112196b);
                    this.f112200f = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f112205k - this.f112201g);
                this.f112199e.a(iMin2, w92Var);
                int i13 = this.f112201g + iMin2;
                this.f112201g = i13;
                int i14 = this.f112205k;
                if (i13 == i14) {
                    long j10 = this.f112206l;
                    if (j10 != -9223372036854775807L) {
                        this.f112199e.a(j10, 1, i14, 0, null);
                        this.f112206l += this.f112203i;
                    }
                    this.f112200f = 0;
                }
            }
        }
    }

    @Override // yads.qk0
    public final void b() {
    }

    public j0(String str) {
        byte[] bArr = new byte[16];
        this.f112195a = new v92(bArr);
        this.f112196b = new w92(bArr);
        this.f112200f = 0;
        this.f112201g = 0;
        this.f112202h = false;
        this.f112206l = -9223372036854775807L;
        this.f112197c = str;
    }

    @Override // yads.qk0
    public final void a(ap0 ap0Var, y63 y63Var) {
        y63Var.a();
        y63Var.b();
        this.f112198d = y63Var.f118107e;
        y63Var.b();
        this.f112199e = ap0Var.a(y63Var.f118106d, 1);
    }

    @Override // yads.qk0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f112206l = j10;
        }
    }

    @Override // yads.qk0
    public final void a() {
        this.f112200f = 0;
        this.f112201g = 0;
        this.f112202h = false;
        this.f112206l = -9223372036854775807L;
    }
}
