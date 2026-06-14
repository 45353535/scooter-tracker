package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d82 {
    public static e82 a() {
        e82 e82Var;
        e82 e82Var2 = e82.f110249d;
        if (e82Var2 != null) {
            return e82Var2;
        }
        synchronized (e82.f110248c) {
            e82Var = e82.f110249d;
            if (e82Var == null) {
                e82Var = new e82(new o82());
                e82.f110249d = e82Var;
            }
        }
        return e82Var;
    }
}
