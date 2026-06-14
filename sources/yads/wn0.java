package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wn0 {
    public static xn0 a() {
        xn0 xn0Var;
        xn0 xn0Var2 = xn0.f117910c;
        if (xn0Var2 != null) {
            return xn0Var2;
        }
        synchronized (xn0.f117909b) {
            xn0Var = xn0.f117910c;
            if (xn0Var == null) {
                xn0Var = new xn0();
                xn0.f117910c = xn0Var;
            }
        }
        return xn0Var;
    }
}
