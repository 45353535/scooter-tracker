package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tn0 {
    public static un0 a() {
        un0 un0Var;
        un0 un0Var2 = un0.f116722d;
        if (un0Var2 != null) {
            return un0Var2;
        }
        synchronized (un0.f116721c) {
            un0Var = un0.f116722d;
            if (un0Var == null) {
                un0Var = new un0();
                un0.f116722d = un0Var;
            }
        }
        return un0Var;
    }
}
