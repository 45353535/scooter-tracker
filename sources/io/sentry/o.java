package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f83774a = new ThreadLocal();

    static final class a implements g1, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b1 f83775b;

        a(b1 b1Var) {
            this.f83775b = b1Var;
        }

        @Override // io.sentry.g1, java.lang.AutoCloseable
        public void close() {
            o.f83774a.set(this.f83775b);
        }
    }

    @Override // io.sentry.c1
    public g1 a(b1 b1Var) {
        b1 b1Var2 = get();
        f83774a.set(b1Var);
        return new a(b1Var2);
    }

    @Override // io.sentry.c1
    public void close() {
        f83774a.remove();
    }

    @Override // io.sentry.c1
    public b1 get() {
        return (b1) f83774a.get();
    }

    @Override // io.sentry.c1
    public void init() {
    }
}
