package io.sentry.transport;

import java.net.Authenticator;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f84238a = new m();

    private m() {
    }

    public static m a() {
        return f84238a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
