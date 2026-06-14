package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f82583a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f82584b = Process.myTid();

    private l() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.k
            @Override // java.lang.Runnable
            public final void run() {
                l.f82584b = Process.myTid();
            }
        });
    }

    public static l e() {
        return f82583a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return h(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? C4240b4.i.Z : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean f(long j10) {
        return Looper.getMainLooper().getThread().getId() == j10;
    }

    public boolean g(io.sentry.protocol.d0 d0Var) {
        Long l10 = d0Var.l();
        return l10 != null && f(l10.longValue());
    }

    public boolean h(Thread thread) {
        return f(thread.getId());
    }
}
