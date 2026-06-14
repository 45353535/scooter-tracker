package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c5 {
    public static d5 a() {
        d5 d5Var;
        d5 d5Var2 = d5.f109761d;
        if (d5Var2 != null) {
            return d5Var2;
        }
        synchronized (d5.f109760c) {
            d5Var = d5.f109761d;
            if (d5Var == null) {
                d5Var = new d5();
                d5.f109761d = d5Var;
            }
        }
        return d5Var;
    }
}
