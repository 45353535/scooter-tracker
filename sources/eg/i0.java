package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f69153a = jg.f0.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.k f69154b = b();

    public static final kotlinx.coroutines.k a() {
        return f69154b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final kotlinx.coroutines.k b() {
        if (!f69153a) {
            return kotlinx.coroutines.j.f93624h;
        }
        e1 e1VarC = o0.c();
        return (jg.u.c(e1VarC) || !(e1VarC instanceof kotlinx.coroutines.k)) ? kotlinx.coroutines.j.f93624h : (kotlinx.coroutines.k) e1VarC;
    }
}
