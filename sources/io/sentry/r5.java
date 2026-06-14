package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r5 f84093d = new r5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f84094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f84095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f84096c = new io.sentry.util.a();

    private r5() {
    }

    public static r5 a() {
        return f84093d;
    }

    public void b(boolean z10) {
        g1 g1VarD = this.f84096c.d();
        try {
            if (!this.f84094a) {
                this.f84095b = Boolean.valueOf(z10);
                this.f84094a = true;
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
