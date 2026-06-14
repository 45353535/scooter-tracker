package yads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class yt3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f118380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wt3 f118382c;

    public void a(boolean z10) {
    }

    public final void b() {
        boolean z10 = true;
        this.f118380a = true;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100 && !a()) {
            z10 = false;
        }
        this.f118381b = z10;
        a(z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f118381b) {
            this.f118381b = true;
            if (this.f118380a) {
                a(true);
                wt3 wt3Var = this.f118382c;
                if (wt3Var != null) {
                    wt3Var.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || a();
        if (this.f118381b != z10) {
            this.f118381b = z10;
            if (this.f118380a) {
                a(z10);
                wt3 wt3Var = this.f118382c;
                if (wt3Var != null) {
                    wt3Var.a(z10);
                }
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }
}
