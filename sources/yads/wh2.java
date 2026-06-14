package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class wh2 implements iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh2 f117457c;

    public wh2(zh2 zh2Var, int i10) {
        this.f117457c = zh2Var;
        this.f117456b = i10;
    }

    @Override // yads.iq2
    public final void a() throws IOException {
        zh2 zh2Var = this.f117457c;
        hq2 hq2Var = zh2Var.f118705t[this.f117456b];
        hj0 hj0Var = hq2Var.f111687h;
        if (hj0Var != null && hj0Var.c() == 1) {
            gj0 gj0VarD = hq2Var.f111687h.d();
            gj0VarD.getClass();
            throw gj0VarD;
        }
        zh2Var.f118697l.a(((ld0) zh2Var.f118690e).a(zh2Var.C));
    }

    @Override // yads.iq2
    public final boolean c() {
        zh2 zh2Var = this.f117457c;
        return !zh2Var.E && zh2Var.I == -9223372036854775807L && zh2Var.f118705t[this.f117456b].a(zh2Var.L);
    }

    @Override // yads.iq2
    public final int a(zv0 zv0Var, fa0 fa0Var, int i10) {
        zh2 zh2Var = this.f117457c;
        int i11 = this.f117456b;
        if (zh2Var.E || zh2Var.I != -9223372036854775807L) {
            return -3;
        }
        zh2Var.c();
        yh2 yh2Var = zh2Var.f118710y;
        boolean[] zArr = yh2Var.f118188d;
        if (!zArr[i11]) {
            yv0 yv0Var = yh2Var.f118185a.a(i11).f116497e[0];
            ol1 ol1Var = zh2Var.f118691f;
            ol1Var.a(new tk1(1, tr1.d(yv0Var.f118398m), yv0Var, 0, null, ol1Var.a(zh2Var.H), -9223372036854775807L));
            zArr[i11] = true;
        }
        int iA = zh2Var.f118705t[i11].a(zv0Var, fa0Var, i10, zh2Var.L);
        if (iA == -3) {
            zh2Var.a(i11);
        }
        return iA;
    }

    @Override // yads.iq2
    public final int a(long j10) throws Throwable {
        zh2 zh2Var = this.f117457c;
        int i10 = this.f117456b;
        if (zh2Var.E || zh2Var.I != -9223372036854775807L) {
            return 0;
        }
        zh2Var.c();
        yh2 yh2Var = zh2Var.f118710y;
        boolean[] zArr = yh2Var.f118188d;
        if (!zArr[i10]) {
            yv0 yv0Var = yh2Var.f118185a.a(i10).f116497e[0];
            ol1 ol1Var = zh2Var.f118691f;
            ol1Var.a(new tk1(1, tr1.d(yv0Var.f118398m), yv0Var, 0, null, ol1Var.a(zh2Var.H), -9223372036854775807L));
            zArr[i10] = true;
        }
        hq2 hq2Var = zh2Var.f118705t[i10];
        int iA = hq2Var.a(j10, zh2Var.L);
        synchronized (hq2Var) {
            if (iA >= 0) {
                int i11 = hq2Var.f111698s + iA;
                if (i11 <= hq2Var.f111695p) {
                    hq2Var.f111698s = i11;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA == 0) {
            zh2Var.a(i10);
        }
        return iA;
    }
}
