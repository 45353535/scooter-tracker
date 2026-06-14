package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f84239a = new n();

    private n() {
    }

    public static p a() {
        return f84239a;
    }

    @Override // io.sentry.transport.p
    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
