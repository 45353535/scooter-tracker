package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mt1 {
    public static nt1 a() {
        nt1 nt1Var;
        nt1 nt1Var2 = nt1.f114026b;
        if (nt1Var2 != null) {
            return nt1Var2;
        }
        synchronized (nt1.f114027c) {
            nt1Var = nt1.f114026b;
            if (nt1Var == null) {
                nt1Var = new nt1();
                nt1.f114026b = nt1Var;
            }
        }
        return nt1Var;
    }
}
