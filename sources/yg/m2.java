package yg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m2 {
    public static /* synthetic */ void c(m2 m2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = m2Var.d() + 1;
        }
        m2Var.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
