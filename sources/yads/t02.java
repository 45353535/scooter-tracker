package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t02 {
    public static u02 a() {
        u02 u02Var;
        u02 u02Var2 = u02.f116431b;
        if (u02Var2 != null) {
            return u02Var2;
        }
        synchronized (u02.f116430a) {
            u02Var = u02.f116431b;
            if (u02Var == null) {
                u02Var = new u02();
                u02.f116431b = u02Var;
            }
        }
        return u02Var;
    }
}
