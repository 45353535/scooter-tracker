package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f79009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f79010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f79011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f79012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C5620n f79013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f79014f = new d0(this);

    public g0(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f79009a = clientContext;
        this.f79010b = u10;
        this.f79011c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5619m c5619m) {
        this.f79013e = c5619m != null ? c5619m.f79033b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f79009a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
