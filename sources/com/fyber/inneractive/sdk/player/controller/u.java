package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f21540a;

    public u(z zVar) {
        this.f21540a = zVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.equals(this.f21540a.f21550d.getContext())) {
            this.f21540a.f21550d.c();
            this.f21540a.f21550d.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.equals(this.f21540a.f21550d.getContext())) {
            this.f21540a.f21550d.d();
            this.f21540a.f21550d.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
