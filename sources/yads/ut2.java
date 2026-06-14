package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ut2 {
    public static vt2 a() {
        vt2 vt2Var;
        vt2 vt2Var2 = vt2.f117187k;
        if (vt2Var2 != null) {
            return vt2Var2;
        }
        synchronized (vt2.f117186j) {
            vt2Var = vt2.f117187k;
            if (vt2Var == null) {
                vt2Var = new vt2();
                vt2.f117187k = vt2Var;
            }
        }
        return vt2Var;
    }
}
