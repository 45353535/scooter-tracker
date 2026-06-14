package com.iab.omid.library.pubnativenet.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes9.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f35854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f35855c;

    public interface a {
        void a(boolean z10);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f35854b;
    }

    protected boolean d() {
        return false;
    }

    public void e() {
        this.f35853a = true;
        boolean zA = a();
        this.f35854b = zA;
        b(zA);
    }

    public void f() {
        this.f35853a = false;
        this.f35855c = null;
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
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f35855c = aVar;
    }

    protected void b(boolean z10) {
    }

    private void a(boolean z10) {
        if (this.f35854b != z10) {
            this.f35854b = z10;
            if (this.f35853a) {
                b(z10);
                a aVar = this.f35855c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
