package com.pubmatic.sdk.monitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class POBActivityLifeCycleMonitor implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f62645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f62646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62647c = false;

    @Nullable
    public WeakReference<Activity> currentActivity;

    interface a {
        void a(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    public POBActivityLifeCycleMonitor(Application application) {
        this.f62646b = application;
    }

    @Nullable
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a aVar;
        if (!this.f62647c && (aVar = this.f62645a) != null) {
            aVar.a(activity);
        }
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.currentActivity = null;
        this.f62647c = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a aVar = this.f62645a;
        if (aVar != null) {
            aVar.onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
        a aVar = this.f62645a;
        if (aVar != null) {
            aVar.onActivityResumed(activity);
        }
        this.f62647c = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void reset() {
        this.f62646b.unregisterActivityLifecycleCallbacks(this);
        this.currentActivity = null;
    }

    public void start(a aVar) {
        this.f62645a = aVar;
        this.f62646b.registerActivityLifecycleCallbacks(this);
    }
}
