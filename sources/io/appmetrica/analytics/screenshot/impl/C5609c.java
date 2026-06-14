package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5609c implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5610d f79000a;

    public C5609c(C5610d c5610d) {
        this.f79000a = c5610d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = AbstractC5608b.f78999a[activityEvent.ordinal()];
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C5610d.d(this.f79000a));
            } else {
                C5616j c5616j = this.f79000a.f79003c;
                if (c5616j == null || !c5616j.f79019a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.f79000a.f79001a.getContext().getMainExecutor(), C5610d.d(this.f79000a));
            }
        } catch (Throwable unused) {
        }
    }
}
