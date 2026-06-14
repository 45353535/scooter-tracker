package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ze1 {
    public static af1 a() {
        af1 af1Var;
        af1 af1Var2 = af1.f108671e;
        if (af1Var2 != null) {
            return af1Var2;
        }
        synchronized (af1.f108670d) {
            af1Var = af1.f108671e;
            if (af1Var == null) {
                af1Var = new af1(new qw1(qw1.f115185c));
                af1.f108671e = af1Var;
            }
        }
        return af1Var;
    }
}
