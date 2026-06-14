package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8472a = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f8474c;

    public c(Context context) {
        this.f8473b = new WeakReference(null);
        this.f8474c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f8473b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f8474c = this.f8473b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f8474c.get();
    }

    public Activity b() {
        return (Activity) this.f8473b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f8474c = new WeakReference(null);
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f8473b = weakReference;
        this.f8474c = weakReference;
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f8472a).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(b bVar) {
        this.f8472a.add(bVar);
    }

    public void b(b bVar) {
        this.f8472a.remove(bVar);
    }
}
