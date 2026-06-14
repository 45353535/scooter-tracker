package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5626u implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5627v f79044a;

    public C5626u(C5627v c5627v) {
        this.f79044a = c5627v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i10 = AbstractC5625t.f79043a[activityEvent.ordinal()];
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                this.f79044a.f79045a.getContext().getContentResolver().unregisterContentObserver(this.f79044a.f79048d);
            } else {
                C5617k c5617k = this.f79044a.f79047c;
                if (c5617k == null || !c5617k.f79022a) {
                    return;
                }
                this.f79044a.f79045a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f79044a.f79048d);
            }
        } catch (Throwable unused) {
        }
    }
}
