package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f34903a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f34906d;

    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f34903a;
    }

    private void e() {
        boolean z10 = !this.f34905c;
        Iterator<com.iab.omid.library.corpmailru.adsession.a> it = com.iab.omid.library.corpmailru.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void b() {
        this.f34904b = true;
        this.f34905c = false;
        e();
    }

    public void c() {
        this.f34904b = false;
        this.f34905c = false;
        this.f34906d = null;
    }

    @RequiresApi(api = 16)
    @VisibleForTesting
    ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
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
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View viewD;
        boolean z10 = false;
        boolean z11 = d().importance != 100;
        boolean z12 = true;
        for (com.iab.omid.library.corpmailru.adsession.a aVar : com.iab.omid.library.corpmailru.b.a.a().c()) {
            if (aVar.e() && (viewD = aVar.d()) != null && viewD.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (z11 && z12) {
            z10 = true;
        }
        a(z10);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f34906d = aVar;
    }

    private void a(boolean z10) {
        if (this.f34905c != z10) {
            this.f34905c = z10;
            if (this.f34904b) {
                e();
                a aVar = this.f34906d;
                if (aVar != null) {
                    aVar.a(!z10);
                }
            }
        }
    }
}
