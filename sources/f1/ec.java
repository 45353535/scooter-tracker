package f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ec {
    public static /* synthetic */ void c(ec ecVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        ecVar.a(f10);
    }

    public abstract void a(float f10);

    public abstract void b(y2 y2Var);

    public abstract void d(ve veVar);

    public abstract void e(boolean z10);
}
