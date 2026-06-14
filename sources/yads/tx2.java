package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tx2 {
    public static rx2 a(h7 h7Var) {
        i7 i7Var;
        dy2 dy2Var = (h7Var == null || (i7Var = h7Var.f111500b) == null) ? null : i7Var.f111883b;
        int i10 = dy2Var == null ? -1 : sx2.f115972a[dy2Var.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return new fj3();
            }
            if (i10 != 2) {
                throw new lf.m();
            }
        }
        return new be0();
    }
}
