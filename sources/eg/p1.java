package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f69163a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f69164b = jg.o0.a(new jg.e0("ThreadLocalEventLoop"));

    private p1() {
    }

    public final r0 a() {
        return (r0) f69164b.get();
    }

    public final r0 b() {
        ThreadLocal threadLocal = f69164b;
        r0 r0Var = (r0) threadLocal.get();
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0VarA = s0.a();
        threadLocal.set(r0VarA);
        return r0VarA;
    }

    public final void c() {
        f69164b.set(null);
    }

    public final void d(r0 r0Var) {
        f69164b.set(r0Var);
    }
}
