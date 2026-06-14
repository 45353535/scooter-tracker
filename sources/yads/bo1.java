package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bo1 implements k12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f109071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to1 f109072b;

    public bo1(t9 t9Var, to1 to1Var) {
        this.f109071a = t9Var;
        this.f109072b = to1Var;
    }

    @Override // yads.k12
    public final j12 a(zy1 zy1Var) {
        t9 t9Var = this.f109071a;
        to1 to1Var = this.f109072b;
        c4 c4Var = zy1Var.f115507c;
        es2 es2Var = zy1Var.f115508d;
        qn1 qn1Var = new qn1(c4Var);
        jn1 jn1Var = new jn1(c4Var, es2Var, t9Var);
        xn1 xn1Var = new xn1(new ym1(to1Var.f116308b, qn1Var, jn1Var));
        pm1 pm1Var = new pm1(c4Var, es2Var, zy1Var.f115506b, new yn1(), jn1Var, xn1Var, new fa2(zy1Var, to1Var));
        return new ao1(pm1Var, new p02(t9Var, es2Var, zy1Var, pm1Var));
    }
}
