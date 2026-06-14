package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f82762a;

    t1() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f82762a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f82762a.post(runnable);
    }

    t1(Looper looper) {
        this.f82762a = new Handler(looper);
    }
}
