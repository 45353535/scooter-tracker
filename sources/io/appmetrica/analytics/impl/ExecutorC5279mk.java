package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ExecutorC5279mk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f77765a;

    public ExecutorC5279mk(Handler handler) {
        this.f77765a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f77765a.post(runnable);
    }
}
