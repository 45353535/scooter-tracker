package yads;

import com.ironsource.N6;

/* JADX INFO: loaded from: classes4.dex */
public final class tc3 implements od3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f116195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f116196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g12 f116197c;

    public /* synthetic */ tc3(c4 c4Var, t9 t9Var) {
        this(c4Var, t9Var, new s02());
    }

    @Override // yads.od3
    public final am2 a() {
        t9 t9Var = this.f116196b;
        qz1 qz1Var = (qz1) t9Var.f116127t;
        if (qz1Var == null) {
            qz1Var = null;
        }
        am2 am2VarA = this.f116197c.a(t9Var, this.f116195a, qz1Var);
        am2VarA.b(wl2.f117511a, N6.G1);
        am2VarA.f108723b = this.f116196b.f116116i;
        return am2VarA;
    }

    public tc3(c4 c4Var, t9 t9Var, g12 g12Var) {
        this.f116195a = c4Var;
        this.f116196b = t9Var;
        this.f116197c = g12Var;
    }
}
