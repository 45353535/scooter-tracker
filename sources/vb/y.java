package vb;

import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f106461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.c0 f106462b = new q9.c0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106463c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q9.j0 f106465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f106467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f106468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f106472l;

    public y(m mVar) {
        this.f106461a = mVar;
    }

    private boolean d(q9.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f106464d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d0Var.X(iMin);
        } else {
            d0Var.l(bArr, this.f106464d, iMin);
        }
        int i11 = this.f106464d + iMin;
        this.f106464d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f106462b.p(0);
        int iH = this.f106462b.h(24);
        if (iH != 1) {
            q9.u.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f106470j = -1;
            return false;
        }
        this.f106462b.r(8);
        int iH2 = this.f106462b.h(16);
        this.f106462b.r(5);
        this.f106471k = this.f106462b.g();
        this.f106462b.r(2);
        this.f106466f = this.f106462b.g();
        this.f106467g = this.f106462b.g();
        this.f106462b.r(6);
        int iH3 = this.f106462b.h(8);
        this.f106469i = iH3;
        if (iH2 == 0) {
            this.f106470j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f106470j = i10;
            if (i10 < 0) {
                q9.u.h("PesReader", "Found negative packet payload size: " + this.f106470j);
                this.f106470j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f106462b.p(0);
        this.f106472l = -9223372036854775807L;
        if (this.f106466f) {
            this.f106462b.r(4);
            long jH = ((long) this.f106462b.h(3)) << 30;
            this.f106462b.r(1);
            long jH2 = jH | ((long) (this.f106462b.h(15) << 15));
            this.f106462b.r(1);
            long jH3 = jH2 | ((long) this.f106462b.h(15));
            this.f106462b.r(1);
            if (!this.f106468h && this.f106467g) {
                this.f106462b.r(4);
                long jH4 = ((long) this.f106462b.h(3)) << 30;
                this.f106462b.r(1);
                long jH5 = jH4 | ((long) (this.f106462b.h(15) << 15));
                this.f106462b.r(1);
                long jH6 = jH5 | ((long) this.f106462b.h(15));
                this.f106462b.r(1);
                this.f106465e.b(jH6);
                this.f106468h = true;
            }
            this.f106472l = this.f106465e.b(jH3);
        }
    }

    private void g(int i10) {
        this.f106463c = i10;
        this.f106464d = 0;
    }

    @Override // vb.l0
    public void a(q9.d0 d0Var, int i10) {
        q9.a.i(this.f106465e);
        if ((i10 & 1) != 0) {
            int i11 = this.f106463c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    q9.u.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f106470j != -1) {
                        q9.u.h("PesReader", "Unexpected start indicator: expected " + this.f106470j + " more bytes");
                    }
                    this.f106461a.packetFinished(d0Var.g() == 0);
                }
            }
            g(1);
        }
        while (d0Var.a() > 0) {
            int i12 = this.f106463c;
            if (i12 == 0) {
                d0Var.X(d0Var.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (d(d0Var, this.f106462b.f98765a, Math.min(10, this.f106469i)) && d(d0Var, null, this.f106469i)) {
                        f();
                        i10 |= this.f106471k ? 4 : 0;
                        this.f106461a.packetStarted(this.f106472l, i10);
                        g(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = d0Var.a();
                    int i13 = this.f106470j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        d0Var.V(d0Var.f() + iA);
                    }
                    this.f106461a.a(d0Var);
                    int i15 = this.f106470j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f106470j = i16;
                        if (i16 == 0) {
                            this.f106461a.packetFinished(false);
                            g(1);
                        }
                    }
                }
            } else if (d(d0Var, this.f106462b.f98765a, 9)) {
                g(e() ? 2 : 0);
            }
        }
    }

    @Override // vb.l0
    public void b(q9.j0 j0Var, oa.t tVar, l0.d dVar) {
        this.f106465e = j0Var;
        this.f106461a.b(tVar, dVar);
    }

    public boolean c(boolean z10) {
        return this.f106463c == 3 && this.f106470j == -1 && !(z10 && (this.f106461a instanceof n)) && (!z10 || e());
    }

    @Override // vb.l0
    public void seek() {
        this.f106463c = 0;
        this.f106464d = 0;
        this.f106468h = false;
        this.f106461a.seek();
    }
}
