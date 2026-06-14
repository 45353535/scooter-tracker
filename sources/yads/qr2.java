package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qr2 {
    public static rr2 a() {
        rr2 rr2Var;
        rr2 rr2Var2 = rr2.f115560c;
        if (rr2Var2 != null) {
            return rr2Var2;
        }
        synchronized (rr2.f115559b) {
            rr2Var = rr2.f115560c;
            if (rr2Var == null) {
                rr2Var = new rr2();
                rr2.f115560c = rr2Var;
            }
        }
        return rr2Var;
    }
}
