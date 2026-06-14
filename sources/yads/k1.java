package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f112551a;

    public k1(o1 o1Var) {
        this.f112551a = o1Var;
    }

    public final Activity a() {
        Activity activity;
        o1 o1Var = this.f112551a;
        synchronized (o1Var) {
            CollectionsKt.removeAll((List) o1Var.f114150a, (Function1) m1.f113288b);
            WeakReference weakReference = (WeakReference) CollectionsKt.firstOrNull((List) o1Var.f114150a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        o1 o1Var = this.f112551a;
        synchronized (o1Var) {
            CollectionsKt.removeAll((List) o1Var.f114150a, (Function1) n1.f113677b);
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) o1Var.f114150a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f112551a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f112551a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f112551a.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
