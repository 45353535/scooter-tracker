package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements io.sentry.transport.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.transport.p f82581a = new h();

    private h() {
    }

    public static io.sentry.transport.p a() {
        return f82581a;
    }

    @Override // io.sentry.transport.p
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
