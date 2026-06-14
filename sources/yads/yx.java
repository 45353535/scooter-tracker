package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class yx implements pl1, kj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f118421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ol1 f118422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jj0 f118423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay f118424d;

    public yx(ay ayVar, Object obj) {
        this.f118424d = ayVar;
        this.f118422b = ayVar.createEventDispatcher(null);
        this.f118423c = ayVar.createDrmEventDispatcher(null);
        this.f118421a = obj;
    }

    public final tk1 a(tk1 tk1Var) {
        ay ayVar = this.f118424d;
        long j10 = tk1Var.f116276f;
        ayVar.getClass();
        ay ayVar2 = this.f118424d;
        long j11 = tk1Var.f116277g;
        ayVar2.getClass();
        return (j10 == tk1Var.f116276f && j11 == tk1Var.f116277g) ? tk1Var : new tk1(tk1Var.f116271a, tk1Var.f116272b, tk1Var.f116273c, tk1Var.f116274d, tk1Var.f116275e, j10, j11);
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f118422b.a(a(tk1Var));
        }
    }

    @Override // yads.kj0
    public final void c(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f118423c.c();
        }
    }

    @Override // yads.kj0
    public final void d(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f118423c.b();
        }
    }

    public final boolean e(int i10, kl1 kl1Var) {
        kl1 kl1VarA;
        if (kl1Var != null) {
            kl1VarA = this.f118424d.a(this.f118421a, kl1Var);
            if (kl1VarA == null) {
                return false;
            }
        } else {
            kl1VarA = null;
        }
        this.f118424d.getClass();
        ol1 ol1Var = this.f118422b;
        if (ol1Var.f114365a != i10 || !w83.a(ol1Var.f114366b, kl1VarA)) {
            this.f118422b = this.f118424d.createEventDispatcher(i10, kl1VarA, 0L);
        }
        jj0 jj0Var = this.f118423c;
        if (jj0Var.f112362a == i10 && w83.a(jj0Var.f112363b, kl1VarA)) {
            return true;
        }
        this.f118423c = this.f118424d.createDrmEventDispatcher(i10, kl1VarA);
        return true;
    }

    @Override // yads.kj0
    public final void b(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f118423c.d();
        }
    }

    @Override // yads.pl1
    public final void c(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f118422b.a(ge1Var, a(tk1Var));
        }
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var) {
        if (e(i10, kl1Var)) {
            this.f118423c.a();
        }
    }

    @Override // yads.pl1
    public final void b(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f118422b.c(ge1Var, a(tk1Var));
        }
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, int i11) {
        if (e(i10, kl1Var)) {
            this.f118423c.a(i11);
        }
    }

    @Override // yads.kj0
    public final void a(int i10, kl1 kl1Var, Exception exc) {
        if (e(i10, kl1Var)) {
            this.f118423c.a(exc);
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f118422b.b(ge1Var, a(tk1Var));
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, ge1 ge1Var, tk1 tk1Var, IOException iOException, boolean z10) {
        if (e(i10, kl1Var)) {
            this.f118422b.a(ge1Var, a(tk1Var), iOException, z10);
        }
    }

    @Override // yads.pl1
    public final void a(int i10, kl1 kl1Var, tk1 tk1Var) {
        if (e(i10, kl1Var)) {
            this.f118422b.b(a(tk1Var));
        }
    }
}
