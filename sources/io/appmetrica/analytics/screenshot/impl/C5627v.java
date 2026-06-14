package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5627v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f79045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f79046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5617k f79047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f79048d;

    public C5627v(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f79045a = clientContext;
        this.f79046b = u10;
        this.f79048d = new Z(clientContext, new C5624s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5619m c5619m) {
        this.f79047c = c5619m != null ? c5619m.f79034c : null;
        this.f79048d.f78995c = this.f79047c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f79045a.getActivityLifecycleRegistry().registerListener(new C5626u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
