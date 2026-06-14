package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class cx2 extends bo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f109643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yv0 f109644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f109645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f109646r;

    public cx2(c30 c30Var, h30 h30Var, yv0 yv0Var, int i10, Object obj, long j10, long j11, long j12, int i11, yv0 yv0Var2) {
        super(c30Var, h30Var, yv0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f109643o = i11;
        this.f109644p = yv0Var2;
    }

    @Override // yads.me1
    public final void a() {
        z43 wj0Var;
        Cdo cdo = this.f109069m;
        if (cdo == null) {
            throw new IllegalStateException();
        }
        for (hq2 hq2Var : cdo.f109989b) {
            if (hq2Var.E != 0) {
                hq2Var.E = 0L;
                hq2Var.f111705z = true;
            }
        }
        int i10 = this.f109643o;
        int i11 = 0;
        while (true) {
            int[] iArr = cdo.f109988a;
            if (i11 >= iArr.length) {
                uf1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                wj0Var = new wj0();
                break;
            }
            if (i10 == iArr[i11]) {
                wj0Var = cdo.f109989b[i11];
                break;
            }
            i11++;
        }
        z43 z43Var = wj0Var;
        z43Var.a(this.f109644p);
        try {
            h30 h30Var = this.f116364b;
            long j10 = this.f109645q;
            long j11 = h30Var.f111458g;
            long j12 = j11 == -1 ? -1L : j11 - j10;
            if (j10 != 0 || j11 != j12) {
                h30Var = new h30(h30Var.f111452a, h30Var.f111453b, h30Var.f111454c, h30Var.f111455d, h30Var.f111456e, h30Var.f111457f + j10, j12, h30Var.f111459h, h30Var.f111460i, h30Var.f111461j);
            }
            long jA = this.f116371i.a(h30Var);
            if (jA != -1) {
                jA += this.f109645q;
            }
            yc0 yc0Var = new yc0(this.f116371i, this.f109645q, jA);
            for (int iA = 0; iA != -1; iA = z43Var.a(yc0Var, Integer.MAX_VALUE, true)) {
                this.f109645q += (long) iA;
            }
            z43Var.a(this.f116369g, 1, (int) this.f109645q, 0, null);
            f30.a(this.f116371i);
            this.f109646r = true;
        } catch (Throwable th2) {
            f30.a(this.f116371i);
            throw th2;
        }
    }

    @Override // yads.me1
    public final void b() {
    }

    @Override // yads.bo
    public final boolean d() {
        return this.f109646r;
    }
}
