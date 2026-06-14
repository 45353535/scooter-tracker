package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public final class nf extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f64964a;

    public nf(sf sfVar) {
        this.f64964a = sfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f64964a.a(activity);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
