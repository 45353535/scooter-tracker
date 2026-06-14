package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f43029d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f43030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f43032c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f43029d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f43029d == null) {
                        f43029d = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return f43029d;
    }

    public Context getActiveContext() {
        Activity activity = this.f43030a;
        return activity != null ? activity : this.f43031b;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f43031b;
        return (context != null || (activity = this.f43030a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f43030a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f43032c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f43030a = activity;
            Iterator<a> it = this.f43032c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f43030a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f43032c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f43030a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f43031b = context;
        }
    }
}
