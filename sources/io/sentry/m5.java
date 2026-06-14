package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t5 f83729a;

    public m5() {
        if (b()) {
            this.f83729a = new d7();
        } else {
            this.f83729a = new o7();
        }
    }

    private static boolean b() {
        return io.sentry.util.y.c() && io.sentry.util.y.b();
    }

    @Override // io.sentry.t5
    public s5 a() {
        return this.f83729a.a();
    }
}
