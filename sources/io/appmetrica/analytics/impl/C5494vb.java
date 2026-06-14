package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5494vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f78444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q2 f78445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC5519wb f78446c;

    public C5494vb(Handler handler, Q2 q22) {
        this.f78444a = handler;
        this.f78445b = q22;
        this.f78446c = new RunnableC5519wb(handler, q22);
    }

    public static void a(Handler handler, Q2 q22, Runnable runnable) {
        handler.removeCallbacks(runnable, q22.f76279b.f76218b.getApiKey());
        handler.postAtTime(runnable, q22.f76279b.f76218b.getApiKey(), SystemClock.uptimeMillis() + ((long) (((Integer) WrapUtils.getOrDefault(q22.f76279b.f76218b.getSessionTimeout(), 10)).intValue() * 500)));
    }
}
