package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rm2 {
    public static sm2 a() {
        sm2 sm2Var;
        sm2 sm2Var2 = sm2.f115877b;
        if (sm2Var2 != null) {
            return sm2Var2;
        }
        synchronized (sm2.f115876a) {
            sm2Var = sm2.f115877b;
            if (sm2Var == null) {
                sm2Var = new sm2();
                sm2.f115877b = sm2Var;
            }
        }
        return sm2Var;
    }
}
