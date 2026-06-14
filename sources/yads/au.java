package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class au implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cu f108815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hq2 f108816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f108818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cu f108819f;

    public au(cu cuVar, cu cuVar2, hq2 hq2Var, int i10) {
        this.f108819f = cuVar;
        this.f108815b = cuVar2;
        this.f108816c = hq2Var;
        this.f108817d = i10;
    }

    @Override // yads.iq2
    public final void a() {
    }

    @Override // yads.iq2
    public final boolean c() {
        return !this.f108819f.d() && this.f108816c.a(this.f108819f.f109594x);
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        if (this.f108819f.d()) {
            return -3;
        }
        bo boVar = this.f108819f.f109593w;
        if (boVar != null) {
            int iA = boVar.a(this.f108817d + 1);
            hq2 hq2Var = this.f108816c;
            if (iA <= hq2Var.f111696q + hq2Var.f111698s) {
                return -3;
            }
        }
        if (!this.f108818e) {
            cu cuVar = this.f108819f;
            ol1 ol1Var = cuVar.f109578h;
            int[] iArr = cuVar.f109573c;
            int i11 = this.f108817d;
            ol1Var.a(new tk1(1, iArr[i11], cuVar.f109574d[i11], 0, null, ol1Var.a(cuVar.f109591u), -9223372036854775807L));
            this.f108818e = true;
        }
        return this.f108816c.a(zv0Var, fa0Var, i10, this.f108819f.f109594x);
    }

    @Override // yads.iq2
    public final int a(long j10) throws Throwable {
        if (this.f108819f.d()) {
            return 0;
        }
        int iA = this.f108816c.a(j10, this.f108819f.f109594x);
        bo boVar = this.f108819f.f109593w;
        if (boVar != null) {
            int iA2 = boVar.a(this.f108817d + 1);
            hq2 hq2Var = this.f108816c;
            iA = Math.min(iA, iA2 - (hq2Var.f111696q + hq2Var.f111698s));
        }
        hq2 hq2Var2 = this.f108816c;
        synchronized (hq2Var2) {
            if (iA >= 0) {
                int i10 = hq2Var2.f111698s + iA;
                if (i10 <= hq2Var2.f111695p) {
                    hq2Var2.f111698s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA > 0 && !this.f108818e) {
            cu cuVar = this.f108819f;
            ol1 ol1Var = cuVar.f109578h;
            int[] iArr = cuVar.f109573c;
            int i11 = this.f108817d;
            ol1Var.a(new tk1(1, iArr[i11], cuVar.f109574d[i11], 0, null, ol1Var.a(cuVar.f109591u), -9223372036854775807L));
            this.f108818e = true;
        }
        return iA;
    }
}
