package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class va2 implements z63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qk0 f116934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v92 f116935b = new v92(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116936c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l43 f116938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f116939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f116940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f116941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f116942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f116943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f116944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f116945l;

    public va2(qk0 qk0Var) {
        this.f116934a = qk0Var;
    }

    @Override // yads.z63
    public final void a(int i10, w92 w92Var) {
        int i11;
        int i12;
        int i13;
        if (this.f116938e == null) {
            throw new IllegalStateException();
        }
        int i14 = -1;
        int i15 = 0;
        if ((i10 & 1) != 0) {
            int i16 = this.f116936c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    uf1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f116943j != -1) {
                        uf1.d("PesReader", "Unexpected start indicator: expected " + this.f116943j + " more bytes");
                    }
                    this.f116934a.b();
                }
            }
            this.f116936c = 1;
            this.f116937d = 0;
        }
        int i17 = i10;
        while (true) {
            int i18 = w92Var.f117358c;
            int i19 = w92Var.f117357b;
            int i20 = i18 - i19;
            if (i20 <= 0) {
                return;
            }
            int i21 = this.f116936c;
            if (i21 == 0) {
                i11 = i14;
                i12 = i15;
                w92Var.e(i20 + i19);
            } else if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new IllegalStateException();
                    }
                    int i22 = this.f116943j;
                    int i23 = i22 == i14 ? i15 : i20 - i22;
                    if (i23 > 0) {
                        i20 -= i23;
                        w92Var.d(i19 + i20);
                    }
                    this.f116934a.a(w92Var);
                    int i24 = this.f116943j;
                    if (i24 != i14) {
                        int i25 = i24 - i20;
                        this.f116943j = i25;
                        if (i25 == 0) {
                            this.f116934a.b();
                            this.f116936c = 1;
                            this.f116937d = i15;
                        }
                    }
                } else if (a(Math.min(10, this.f116942i), w92Var, this.f116935b.f116906a) && a(this.f116942i, w92Var, (byte[]) null)) {
                    this.f116935b.b(i15);
                    this.f116945l = -9223372036854775807L;
                    if (this.f116939f) {
                        this.f116935b.c(4);
                        long jA = ((long) this.f116935b.a(3)) << 30;
                        this.f116935b.c(1);
                        long jA2 = ((long) (this.f116935b.a(15) << 15)) | jA;
                        this.f116935b.c(1);
                        long jA3 = jA2 | ((long) this.f116935b.a(15));
                        this.f116935b.c(1);
                        if (!this.f116941h && this.f116940g) {
                            this.f116935b.c(4);
                            long jA4 = ((long) this.f116935b.a(3)) << 30;
                            this.f116935b.c(1);
                            long jA5 = jA4 | ((long) (this.f116935b.a(15) << 15));
                            this.f116935b.c(1);
                            long jA6 = jA5 | ((long) this.f116935b.a(15));
                            this.f116935b.c(1);
                            this.f116938e.b(jA6);
                            this.f116941h = true;
                        }
                        this.f116945l = this.f116938e.b(jA3);
                    }
                    i17 |= this.f116944k ? 4 : 0;
                    this.f116934a.a(i17, this.f116945l);
                    this.f116936c = 3;
                    this.f116937d = 0;
                    i15 = 0;
                    i14 = -1;
                }
                i11 = i14;
                i12 = i15;
            } else {
                i12 = i15;
                if (a(9, w92Var, this.f116935b.f116906a)) {
                    this.f116935b.b(i12);
                    int iA = this.f116935b.a(24);
                    if (iA != 1) {
                        vd1.a("Unexpected start code prefix: ", iA, "PesReader");
                        this.f116943j = -1;
                        i13 = 0;
                        i11 = -1;
                    } else {
                        this.f116935b.c(8);
                        int iA2 = this.f116935b.a(16);
                        this.f116935b.c(5);
                        this.f116944k = this.f116935b.e();
                        this.f116935b.c(2);
                        this.f116939f = this.f116935b.e();
                        this.f116940g = this.f116935b.e();
                        this.f116935b.c(6);
                        int iA3 = this.f116935b.a(8);
                        this.f116942i = iA3;
                        if (iA2 == 0) {
                            this.f116943j = -1;
                        } else {
                            int i26 = (iA2 - 3) - iA3;
                            this.f116943j = i26;
                            if (i26 < 0) {
                                uf1.d("PesReader", "Found negative packet payload size: " + this.f116943j);
                                i11 = -1;
                                this.f116943j = -1;
                            }
                            i13 = 2;
                        }
                        i11 = -1;
                        i13 = 2;
                    }
                    this.f116936c = i13;
                    i12 = 0;
                    this.f116937d = 0;
                } else {
                    i11 = -1;
                }
            }
            i15 = i12;
            i14 = i11;
        }
    }

    public final boolean a(int i10, w92 w92Var, byte[] bArr) {
        int iMin = Math.min(w92Var.f117358c - w92Var.f117357b, i10 - this.f116937d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            w92Var.e(w92Var.f117357b + iMin);
        } else {
            w92Var.a(bArr, this.f116937d, iMin);
        }
        int i11 = this.f116937d + iMin;
        this.f116937d = i11;
        return i11 == i10;
    }

    @Override // yads.z63
    public final void a(l43 l43Var, ap0 ap0Var, y63 y63Var) {
        this.f116938e = l43Var;
        this.f116934a.a(ap0Var, y63Var);
    }

    @Override // yads.z63
    public final void a() {
        this.f116936c = 0;
        this.f116937d = 0;
        this.f116941h = false;
        this.f116934a.a();
    }
}
