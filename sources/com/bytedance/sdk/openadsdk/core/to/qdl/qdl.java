package com.bytedance.sdk.openadsdk.core.to.qdl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements Application.ActivityLifecycleCallbacks {
    private static volatile qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ud f17488ud;

    private qdl(Application application) {
        this.f17488ud = ud.qdl(application);
    }

    public static qdl qdl(Application application) {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl(application);
                        application.registerActivityLifecycleCallbacks(qdl);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ud udVar = this.f17488ud;
        if (udVar != null) {
            udVar.qdl(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ud udVar = this.f17488ud;
        if (udVar != null) {
            udVar.ud(activity);
        }
    }

    public String qdl(String str, long j10, int i10) {
        ud udVar = this.f17488ud;
        if (udVar != null) {
            return udVar.qdl(str, j10, i10);
        }
        return "null";
    }
}
