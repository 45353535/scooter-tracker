package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class K5 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L5 f76017a;

    public K5(L5 l52) {
        this.f76017a = l52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = J5.f75987a[activityEvent.ordinal()];
        if (i10 == 1) {
            this.f76017a.f76048b.resumeSession();
        } else {
            if (i10 != 2) {
                return;
            }
            this.f76017a.f76048b.pauseSession();
        }
    }
}
