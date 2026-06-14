package ua;

import io.bidmachine.media3.common.a;
import n9.x;
import oa.s0;
import q9.d0;
import ua.e;

/* JADX INFO: loaded from: classes12.dex */
final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f105358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f105359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f105361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f105362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105363g;

    public f(s0 s0Var) {
        super(s0Var);
        this.f105358b = new d0(r9.f.f99242a);
        this.f105359c = new d0(4);
    }

    @Override // ua.e
    protected boolean b(d0 d0Var) throws e.a {
        int iH = d0Var.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f105363g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // ua.e
    protected boolean c(d0 d0Var, long j10) throws x {
        int iH = d0Var.H();
        long jR = j10 + (((long) d0Var.r()) * 1000);
        if (iH == 0 && !this.f105361e) {
            d0 d0Var2 = new d0(new byte[d0Var.a()]);
            d0Var.l(d0Var2.e(), 0, d0Var.a());
            oa.d dVarB = oa.d.b(d0Var2);
            this.f105360d = dVarB.f96492b;
            this.f105357a.f(new a.b().U("video/x-flv").u0("video/avc").S(dVarB.f96502l).B0(dVarB.f96493c).d0(dVarB.f96494d).q0(dVarB.f96501k).g0(dVarB.f96491a).N());
            this.f105361e = true;
            return false;
        }
        if (iH != 1 || !this.f105361e) {
            return false;
        }
        int i10 = this.f105363g == 1 ? 1 : 0;
        if (!this.f105362f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f105359c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f105360d;
        int i12 = 0;
        while (d0Var.a() > 0) {
            d0Var.l(this.f105359c.e(), i11, this.f105360d);
            this.f105359c.W(0);
            int iL = this.f105359c.L();
            this.f105358b.W(0);
            this.f105357a.c(this.f105358b, 4);
            this.f105357a.c(d0Var, iL);
            i12 = i12 + 4 + iL;
        }
        this.f105357a.e(jR, i10, i12, 0, null);
        this.f105362f = true;
        return true;
    }
}
