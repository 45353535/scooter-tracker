package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class rl1 implements pl1, kj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl1 f115493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ol1 f115494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jj0 f115495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vl1 f115496d;

    public rl1(vl1 vl1Var, tl1 tl1Var) {
        this.f115496d = vl1Var;
        this.f115494b = vl1Var.f117069f;
        this.f115495c = vl1Var.f117070g;
        this.f115493a = tl1Var;
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f115495c.a();
        }
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f115494b.a(tk1Var);
        }
    }

    @Override // yads.kj0
    public final void c(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f115495c.c();
        }
    }

    @Override // yads.kj0
    public final void d(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f115495c.b();
        }
    }

    public final boolean e(int i10, kl1 kl1Var) {
        kl1 kl1VarA = null;
        if (kl1Var != null) {
            tl1 tl1Var = this.f115493a;
            int i11 = 0;
            while (true) {
                if (i11 >= tl1Var.f116288c.size()) {
                    break;
                }
                if (((kl1) tl1Var.f116288c.get(i11)).f109965d == kl1Var.f109965d) {
                    kl1VarA = kl1Var.a(e.a(tl1Var.f116287b, kl1Var.f109962a));
                    break;
                }
                i11++;
            }
            if (kl1VarA == null) {
                return false;
            }
        }
        kl1 kl1Var2 = kl1VarA;
        int i12 = i10 + this.f115493a.f116289d;
        ol1 ol1Var = this.f115494b;
        if (ol1Var.f114365a != i12 || !w83.a(ol1Var.f114366b, kl1Var2)) {
            this.f115494b = new ol1(this.f115496d.f117069f.f114367c, i12, kl1Var2, 0L);
        }
        jj0 jj0Var = this.f115495c;
        if (jj0Var.f112362a == i12 && w83.a(jj0Var.f112363b, kl1Var2)) {
            return true;
        }
        this.f115495c = new jj0(this.f115496d.f117070g.f112364c, i12, kl1Var2);
        return true;
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, int i11) {
        if (e(i10, kl1Var)) {
            this.f115495c.a(i11);
        }
    }

    @Override // yads.kj0
    public final void b(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f115495c.d();
        }
    }

    @Override // yads.pl1
    public final void c(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f115494b.a(ge1Var, tk1Var);
        }
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, Exception exc) {
        if (e(i10, kl1Var)) {
            this.f115495c.a(exc);
        }
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f115494b.c(ge1Var, tk1Var);
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f115494b.b(ge1Var, tk1Var);
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var, IOException iOException, boolean z10) {
        if (e(i10, kl1Var)) {
            this.f115494b.a(ge1Var, tk1Var, iOException, z10);
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f115494b.b(tk1Var);
        }
    }
}
