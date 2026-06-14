package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5610d implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f79001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f79002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C5616j f79003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f79004d = lf.i.a(new C5607a(this));

    public C5610d(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f79001a = clientContext;
        this.f79002b = u10;
    }

    public static final Activity.ScreenCaptureCallback d(C5610d c5610d) {
        return s8.d.a(c5610d.f79004d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C5619m c5619m) {
        this.f79003c = c5619m != null ? c5619m.f79032a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f79001a.getActivityLifecycleRegistry().registerListener(new C5609c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
