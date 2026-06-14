package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bk2 {
    public final ck2 a() {
        ck2 ck2Var;
        ck2 ck2Var2 = ck2.f109434d;
        if (ck2Var2 != null) {
            return ck2Var2;
        }
        synchronized (this) {
            ck2Var = ck2.f109434d;
            if (ck2Var == null) {
                ck2Var = new ck2();
                ck2.f109434d = ck2Var;
            }
        }
        return ck2Var;
    }
}
