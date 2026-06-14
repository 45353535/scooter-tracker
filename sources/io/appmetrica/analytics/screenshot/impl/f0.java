package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f79008a;

    public f0(g0 g0Var) {
        this.f79008a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = e0.f79007a[activityEvent.ordinal()];
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                this.f79008a.f79012d = true;
                return;
            }
            C5620n c5620n = this.f79008a.f79013e;
            if (c5620n == null || !c5620n.f79035a) {
                return;
            }
            this.f79008a.f79012d = false;
            g0 g0Var = this.f79008a;
            g0Var.f79011c.postDelayed(g0Var.f79014f, 0L);
        } catch (Throwable unused) {
        }
    }
}
