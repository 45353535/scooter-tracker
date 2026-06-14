package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f47242a = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47243b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47244c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47245d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47246e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f47247f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f47248g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f47267b.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        this.f47242a.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f47244c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f47244c == 0) {
            this.f47247f.postDelayed(this.f47248g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f47244c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f47244c == 1) {
            if (!this.f47245d) {
                this.f47247f.removeCallbacks(this.f47248g);
            } else {
                a("OnAppForeground", "");
                this.f47245d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f47243b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f47243b == 1 && this.f47246e) {
            this.f47246e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f47243b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    private void b() {
        if (this.f47243b == 0 && this.f47245d) {
            a("OnAppBackground", "");
            this.f47246e = true;
        }
    }

    public void a(a aVar) {
        this.f47242a.add(aVar);
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<a> it = this.f47242a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put("event", str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f47244c == 0) {
            this.f47245d = true;
        }
    }
}
