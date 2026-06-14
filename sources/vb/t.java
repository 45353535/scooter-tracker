package vb;

import io.bidmachine.media3.common.a;
import oa.i0;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.d0 f106410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.a f106411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f106415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f106421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f106422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f106423n;

    public t(String str) {
        this(null, 0, str);
    }

    private void c(q9.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f106420k && (b10 & 224) == 224;
            this.f106420k = z10;
            if (z11) {
                d0Var.W(iF + 1);
                this.f106420k = false;
                this.f106410a.e()[1] = bArrE[iF];
                this.f106418i = 2;
                this.f106417h = 1;
                return;
            }
        }
        d0Var.W(iG);
    }

    private void d(q9.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f106422m - this.f106418i);
        this.f106415f.c(d0Var, iMin);
        int i10 = this.f106418i + iMin;
        this.f106418i = i10;
        if (i10 < this.f106422m) {
            return;
        }
        q9.a.g(this.f106423n != -9223372036854775807L);
        this.f106415f.e(this.f106423n, 1, this.f106422m, 0, null);
        this.f106423n += this.f106421l;
        this.f106418i = 0;
        this.f106417h = 0;
    }

    private void e(q9.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), 4 - this.f106418i);
        d0Var.l(this.f106410a.e(), this.f106418i, iMin);
        int i10 = this.f106418i + iMin;
        this.f106418i = i10;
        if (i10 < 4) {
            return;
        }
        this.f106410a.W(0);
        if (!this.f106411b.a(this.f106410a.q())) {
            this.f106418i = 0;
            this.f106417h = 1;
            return;
        }
        i0.a aVar = this.f106411b;
        this.f106422m = aVar.f96571c;
        if (!this.f106419j) {
            this.f106421l = (((long) aVar.f96575g) * 1000000) / ((long) aVar.f96572d);
            this.f106415f.f(new a.b().f0(this.f106416g).U(this.f106414e).u0(this.f106411b.f96570b).k0(4096).R(this.f106411b.f96573e).v0(this.f106411b.f96572d).j0(this.f106412c).s0(this.f106413d).N());
            this.f106419j = true;
        }
        this.f106410a.W(0);
        this.f106415f.c(this.f106410a, 4);
        this.f106417h = 2;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        q9.a.i(this.f106415f);
        while (d0Var.a() > 0) {
            int i10 = this.f106417h;
            if (i10 == 0) {
                c(d0Var);
            } else if (i10 == 1) {
                e(d0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                d(d0Var);
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106416g = dVar.b();
        this.f106415f = tVar.track(dVar.c(), 1);
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106423n = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106417h = 0;
        this.f106418i = 0;
        this.f106420k = false;
        this.f106423n = -9223372036854775807L;
    }

    public t(String str, int i10, String str2) {
        this.f106417h = 0;
        q9.d0 d0Var = new q9.d0(4);
        this.f106410a = d0Var;
        d0Var.e()[0] = -1;
        this.f106411b = new i0.a();
        this.f106423n = -9223372036854775807L;
        this.f106412c = str;
        this.f106413d = i10;
        this.f106414e = str2;
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
