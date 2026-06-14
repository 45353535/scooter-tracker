package vb;

import io.bidmachine.media3.common.a;
import oa.c;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.c0 f106110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f106116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f106121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.bidmachine.media3.common.a f106122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f106123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f106124o;

    public f(String str) {
        this(null, 0, str);
    }

    private boolean c(q9.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f106118i);
        d0Var.l(bArr, this.f106118i, iMin);
        int i11 = this.f106118i + iMin;
        this.f106118i = i11;
        return i11 == i10;
    }

    private void d() {
        this.f106110a.p(0);
        c.C1110c c1110cF = oa.c.f(this.f106110a);
        io.bidmachine.media3.common.a aVar = this.f106122m;
        if (aVar == null || c1110cF.f96487c != aVar.E || c1110cF.f96486b != aVar.F || !"audio/ac4".equals(aVar.f80561o)) {
            io.bidmachine.media3.common.a aVarN = new a.b().f0(this.f106115f).U(this.f106114e).u0("audio/ac4").R(c1110cF.f96487c).v0(c1110cF.f96486b).j0(this.f106112c).s0(this.f106113d).N();
            this.f106122m = aVarN;
            this.f106116g.f(aVarN);
        }
        this.f106123n = c1110cF.f96488d;
        this.f106121l = (((long) c1110cF.f96489e) * 1000000) / ((long) this.f106122m.F);
    }

    private boolean e(q9.d0 d0Var) {
        int iH;
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f106119j) {
                iH = d0Var.H();
                this.f106119j = iH == 172;
                if (iH == 64 || iH == 65) {
                    break;
                }
            } else {
                this.f106119j = d0Var.H() == 172;
            }
        }
        this.f106120k = iH == 65;
        return true;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        q9.a.i(this.f106116g);
        while (d0Var.a() > 0) {
            int i10 = this.f106117h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f106123n - this.f106118i);
                        this.f106116g.c(d0Var, iMin);
                        int i11 = this.f106118i + iMin;
                        this.f106118i = i11;
                        if (i11 == this.f106123n) {
                            q9.a.g(this.f106124o != -9223372036854775807L);
                            this.f106116g.e(this.f106124o, 1, this.f106123n, 0, null);
                            this.f106124o += this.f106121l;
                            this.f106117h = 0;
                        }
                    }
                } else if (c(d0Var, this.f106111b.e(), 16)) {
                    d();
                    this.f106111b.W(0);
                    this.f106116g.c(this.f106111b, 16);
                    this.f106117h = 2;
                }
            } else if (e(d0Var)) {
                this.f106117h = 1;
                this.f106111b.e()[0] = -84;
                this.f106111b.e()[1] = (byte) (this.f106120k ? 65 : 64);
                this.f106118i = 2;
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106115f = dVar.b();
        this.f106116g = tVar.track(dVar.c(), 1);
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106124o = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106117h = 0;
        this.f106118i = 0;
        this.f106119j = false;
        this.f106120k = false;
        this.f106124o = -9223372036854775807L;
    }

    public f(String str, int i10, String str2) {
        q9.c0 c0Var = new q9.c0(new byte[16]);
        this.f106110a = c0Var;
        this.f106111b = new q9.d0(c0Var.f98765a);
        this.f106117h = 0;
        this.f106118i = 0;
        this.f106119j = false;
        this.f106120k = false;
        this.f106124o = -9223372036854775807L;
        this.f106112c = str;
        this.f106113d = i10;
        this.f106114e = str2;
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
