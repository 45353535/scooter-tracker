package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cv implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq2 f109607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv f109609d;

    public cv(dv dvVar, iq2 iq2Var) {
        this.f109609d = dvVar;
        this.f109607b = iq2Var;
    }

    @Override // yads.iq2
    public final void a() {
        this.f109607b.a();
    }

    @Override // yads.iq2
    public final boolean c() {
        return this.f109609d.f110080e == -9223372036854775807L && this.f109607b.c();
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        if (this.f109609d.f110080e != -9223372036854775807L) {
            return -3;
        }
        if (this.f109608c) {
            fa0Var.f112430b = 4;
            return -4;
        }
        int iA = this.f109607b.a(zv0Var, fa0Var, i10);
        if (iA != -5) {
            dv dvVar = this.f109609d;
            long j10 = dvVar.f110082g;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || fa0Var.f110672f < j10) && !(iA == -3 && dvVar.getBufferedPositionUs() == Long.MIN_VALUE && !fa0Var.f110671e))) {
                return iA;
            }
            fa0Var.b();
            fa0Var.f112430b = 4;
            this.f109608c = true;
            return -4;
        }
        yv0 yv0Var = zv0Var.f118845b;
        yv0Var.getClass();
        int i11 = yv0Var.C;
        if (i11 != 0 || yv0Var.D != 0) {
            dv dvVar2 = this.f109609d;
            if (dvVar2.f110081f != 0) {
                i11 = 0;
            }
            int i12 = dvVar2.f110082g == Long.MIN_VALUE ? yv0Var.D : 0;
            xv0 xv0Var = new xv0(yv0Var);
            xv0Var.A = i11;
            xv0Var.B = i12;
            zv0Var.f118845b = new yv0(xv0Var);
        }
        return -5;
    }

    @Override // yads.iq2
    public final int a(long j10) {
        if (this.f109609d.f110080e != -9223372036854775807L) {
            return -3;
        }
        return this.f109607b.a(j10);
    }
}
