package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5308o extends H7 implements ActivityLifecycleRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f77872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC5283n f77873b = EnumC5283n.f77799d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5518wa f77874c = new C5518wa(true);

    @AnyThread
    public final synchronized void a(@NonNull Context context) {
        if (this.f77872a == null) {
            try {
                this.f77872a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC5283n enumC5283n = this.f77873b;
        EnumC5283n enumC5283n2 = EnumC5283n.f77797b;
        if (enumC5283n != enumC5283n2 && !this.f77874c.f78497a.isEmpty()) {
            if (this.f77872a == null) {
                this.f77873b = EnumC5283n.f77798c;
            } else {
                this.f77873b = enumC5283n2;
                this.f77872a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f77873b == EnumC5283n.f77797b && this.f77874c.f78497a.isEmpty()) {
            this.f77873b = EnumC5283n.f77799d;
            Application application = this.f77872a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    public final synchronized void registerListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                    activityEventArr = ActivityEvent.values();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            activityEventArr = ActivityEvent.values();
        }
        for (ActivityEvent activityEvent : activityEventArr) {
            this.f77874c.a(activityEvent, activityLifecycleListener);
        }
        b();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    public final synchronized void unregisterListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        if (activityEventArr != null) {
            try {
                if (activityEventArr.length == 0) {
                    activityEventArr = ActivityEvent.values();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            activityEventArr = ActivityEvent.values();
        }
        for (ActivityEvent activityEvent : activityEventArr) {
            C5518wa c5518wa = this.f77874c;
            Collection collection = (Collection) c5518wa.f78497a.get(activityEvent);
            if (collection != null && collection.remove(activityLifecycleListener)) {
                if (collection.isEmpty() && c5518wa.f78498b) {
                    c5518wa.f78497a.remove(activityEvent);
                }
                new ArrayList(collection);
            }
        }
        c();
    }

    @AnyThread
    public final synchronized void a(@NonNull Application application) {
        try {
            if (this.f77872a == null) {
                this.f77872a = application;
            }
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    @AnyThread
    public final EnumC5283n a() {
        return this.f77873b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f77874c.f78497a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
