package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f118040a;

    public y0(z0 z0Var) {
        this.f118040a = z0Var;
    }

    public final HashSet a(WeakHashMap weakHashMap) {
        HashSet hashSet;
        synchronized (this.f118040a.f118476a) {
            Set setKeySet = weakHashMap.keySet();
            hashSet = new HashSet(setKeySet.size());
            for (Object obj : setKeySet) {
                if (obj != null) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = a(this.f118040a.f118478c).iterator();
        while (it.hasNext()) {
            ((d1) ((co2) it.next())).a(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = a(this.f118040a.f118477b).iterator();
        while (it.hasNext()) {
            ((l1) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = a(this.f118040a.f118477b).iterator();
        while (it.hasNext()) {
            ((l1) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = a(this.f118040a.f118478c).iterator();
        while (it.hasNext()) {
            ((d1) ((co2) it.next())).b(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f118040a.b(activity);
    }
}
