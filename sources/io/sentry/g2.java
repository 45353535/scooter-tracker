package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83510a;

    public g2(v7 v7Var) {
        this.f83510a = v7Var;
    }

    @Override // io.sentry.o1
    public boolean a() {
        io.sentry.internal.a.a().b();
        return e7.d().c(this.f83510a.getFatalLogger());
    }
}
