package io.sentry.android.core;

import android.net.TrafficStats;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements io.sentry.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f82617a = new j0();

    private j0() {
    }

    public static j0 c() {
        return f82617a;
    }

    @Override // io.sentry.i1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.i1
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
