package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class us1 {
    public static vs1 a() {
        vs1 vs1Var;
        vs1 vs1Var2 = vs1.f117164b;
        if (vs1Var2 != null) {
            return vs1Var2;
        }
        synchronized (vs1.f117165c) {
            vs1Var = vs1.f117164b;
            if (vs1Var == null) {
                vs1Var = new vs1();
                vs1.f117164b = vs1Var;
            }
        }
        return vs1Var;
    }
}
