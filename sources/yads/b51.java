package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr1 f108908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xz f108909b;

    public b51(zr1 zr1Var, xz xzVar) {
        this.f108908a = zr1Var;
        this.f108909b = xzVar;
    }

    public final void a() {
        zr1 zr1Var = this.f108908a;
        zr1Var.f118779a.f108767a.execute(new Runnable() { // from class: yads.d3
            @Override // java.lang.Runnable
            public final void run() {
                b51.a(this.f109728b);
            }
        });
    }

    public static final void a(b51 b51Var) {
        b51Var.f108909b.onInitializationCompleted();
    }
}
