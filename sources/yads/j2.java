package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class j2 {
    public final k2 a() {
        k2 k2Var;
        k2 k2Var2 = k2.f112557c;
        if (k2Var2 != null) {
            return k2Var2;
        }
        synchronized (this) {
            k2Var = k2.f112557c;
            if (k2Var == null) {
                k2Var = new k2();
                k2.f112557c = k2Var;
            }
        }
        return k2Var;
    }
}
