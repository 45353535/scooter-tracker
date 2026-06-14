package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes3.dex */
final class w extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f84249b;

    w(String str, String str2) {
        this.f84248a = (String) io.sentry.util.w.c(str, "user is required");
        this.f84249b = (String) io.sentry.util.w.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f84248a, this.f84249b.toCharArray());
        }
        return null;
    }
}
