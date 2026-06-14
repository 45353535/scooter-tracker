package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c43 f117363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y31 f117364b = y31.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sk2 f117365c = sk2.f115840h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kl1 f117366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kl1 f117367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kl1 f117368f;

    public wa0(c43 c43Var) {
        this.f117363a = c43Var;
    }

    public final void a(z31 z31Var, kl1 kl1Var, f43 f43Var) {
        if (kl1Var == null) {
            return;
        }
        if (f43Var.a(kl1Var.f109962a) != -1) {
            z31Var.a(kl1Var, f43Var);
            return;
        }
        f43 f43Var2 = (f43) this.f117365c.get(kl1Var);
        if (f43Var2 != null) {
            z31Var.a(kl1Var, f43Var2);
        }
    }

    public static kl1 a(qc2 qc2Var, y31 y31Var, kl1 kl1Var, c43 c43Var) {
        vm0 vm0Var = (vm0) qc2Var;
        f43 f43VarJ = vm0Var.j();
        int iH = vm0Var.h();
        Object objA = f43VarJ.c() ? null : f43VarJ.a(iH);
        int iA = (vm0Var.n() || f43VarJ.c()) ? -1 : f43VarJ.a(iH, c43Var).a(w83.a(vm0Var.i()) - c43Var.a());
        for (int i10 = 0; i10 < y31Var.size(); i10++) {
            kl1 kl1Var2 = (kl1) y31Var.get(i10);
            if (a(kl1Var2, objA, vm0Var.n(), vm0Var.e(), vm0Var.f(), iA)) {
                return kl1Var2;
            }
        }
        if (y31Var.isEmpty() && kl1Var != null && a(kl1Var, objA, vm0Var.n(), vm0Var.e(), vm0Var.f(), iA)) {
            return kl1Var;
        }
        return null;
    }

    public static boolean a(kl1 kl1Var, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!kl1Var.f109962a.equals(obj)) {
            return false;
        }
        if (z10 && kl1Var.f109963b == i10 && kl1Var.f109964c == i11) {
            return true;
        }
        return !z10 && kl1Var.f109963b == -1 && kl1Var.f109966e == i12;
    }

    public final void a(f43 f43Var) {
        z31 z31VarA = b41.a();
        if (this.f117364b.isEmpty()) {
            a(z31VarA, this.f117367e, f43Var);
            if (!y72.a(this.f117368f, this.f117367e)) {
                a(z31VarA, this.f117368f, f43Var);
            }
            if (!y72.a(this.f117366d, this.f117367e) && !y72.a(this.f117366d, this.f117368f)) {
                a(z31VarA, this.f117366d, f43Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f117364b.size(); i10++) {
                a(z31VarA, (kl1) this.f117364b.get(i10), f43Var);
            }
            if (!this.f117364b.contains(this.f117366d)) {
                a(z31VarA, this.f117366d, f43Var);
            }
        }
        this.f117365c = z31VarA.a();
    }
}
