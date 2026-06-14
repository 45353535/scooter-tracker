package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5258m implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f77725a = new HashSet();

    public C5258m(@NonNull C5308o c5308o) {
        c5308o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC5233l interfaceC5233l) {
        this.f77725a.add(interfaceC5233l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C5186j4.l().f77467c.a().execute(new RunnableC5207k(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f77725a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C5124gj) ((InterfaceC5233l) it.next())).a(activity);
        }
    }
}
