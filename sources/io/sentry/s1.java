package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f84164a = Runtime.getRuntime();

    @Override // io.sentry.w0
    public void c() {
    }

    @Override // io.sentry.w0
    public void d(s3 s3Var) {
        s3Var.f(Long.valueOf(this.f84164a.totalMemory() - this.f84164a.freeMemory()));
    }
}
