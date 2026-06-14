package vb;

import com.google.common.base.Ascii;
import io.bidmachine.media3.common.a;
import j$.util.Objects;
import oa.b;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.c0 f106066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f106072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f106076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.bidmachine.media3.common.a f106077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f106078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106079n;

    public c(String str) {
        this(null, 0, str);
    }

    private boolean c(q9.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f106074i);
        d0Var.l(bArr, this.f106074i, iMin);
        int i11 = this.f106074i + iMin;
        this.f106074i = i11;
        return i11 == i10;
    }

    private void d() {
        this.f106066a.p(0);
        b.C1109b c1109bF = oa.b.f(this.f106066a);
        io.bidmachine.media3.common.a aVar = this.f106077l;
        if (aVar == null || c1109bF.f96460d != aVar.E || c1109bF.f96459c != aVar.F || !Objects.equals(c1109bF.f96457a, aVar.f80561o)) {
            a.b bVarP0 = new a.b().f0(this.f106071f).U(this.f106070e).u0(c1109bF.f96457a).R(c1109bF.f96460d).v0(c1109bF.f96459c).j0(this.f106068c).s0(this.f106069d).p0(c1109bF.f96463g);
            if ("audio/ac3".equals(c1109bF.f96457a)) {
                bVarP0.Q(c1109bF.f96463g);
            }
            io.bidmachine.media3.common.a aVarN = bVarP0.N();
            this.f106077l = aVarN;
            this.f106072g.f(aVarN);
        }
        this.f106078m = c1109bF.f96461e;
        this.f106076k = (((long) c1109bF.f96462f) * 1000000) / ((long) this.f106077l.F);
    }

    private boolean e(q9.d0 d0Var) {
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f106075j) {
                int iH = d0Var.H();
                if (iH == 119) {
                    this.f106075j = false;
                    return true;
                }
                this.f106075j = iH == 11;
            } else {
                this.f106075j = d0Var.H() == 11;
            }
        }
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        q9.a.i(this.f106072g);
        while (d0Var.a() > 0) {
            int i10 = this.f106073h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f106078m - this.f106074i);
                        this.f106072g.c(d0Var, iMin);
                        int i11 = this.f106074i + iMin;
                        this.f106074i = i11;
                        if (i11 == this.f106078m) {
                            q9.a.g(this.f106079n != -9223372036854775807L);
                            this.f106072g.e(this.f106079n, 1, this.f106078m, 0, null);
                            this.f106079n += this.f106076k;
                            this.f106073h = 0;
                        }
                    }
                } else if (c(d0Var, this.f106067b.e(), 128)) {
                    d();
                    this.f106067b.W(0);
                    this.f106072g.c(this.f106067b, 128);
                    this.f106073h = 2;
                }
            } else if (e(d0Var)) {
                this.f106073h = 1;
                this.f106067b.e()[0] = Ascii.VT;
                this.f106067b.e()[1] = 119;
                this.f106074i = 2;
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106071f = dVar.b();
        this.f106072g = tVar.track(dVar.c(), 1);
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106079n = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106073h = 0;
        this.f106074i = 0;
        this.f106075j = false;
        this.f106079n = -9223372036854775807L;
    }

    public c(String str, int i10, String str2) {
        q9.c0 c0Var = new q9.c0(new byte[128]);
        this.f106066a = c0Var;
        this.f106067b = new q9.d0(c0Var.f98765a);
        this.f106073h = 0;
        this.f106079n = -9223372036854775807L;
        this.f106068c = str;
        this.f106069d = i10;
        this.f106070e = str2;
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
