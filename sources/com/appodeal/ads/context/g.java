package com.appodeal.ads.context;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Application.ActivityLifecycleCallbacks, ComponentCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f13191b;

    public g(i iVar) {
        this.f13191b = iVar;
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e a(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_CREATED, name);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e b(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_DESTROYED, name);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e c(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_PAUSE, name);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e d(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_RESUME, name);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e e(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_STARTED, name);
    }

    public static final com.appodeal.ads.analytics.breadcrumbs.e f(Activity activity) {
        String name = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new com.appodeal.ads.analytics.breadcrumbs.c(LogConstants.EVENT_STOPPED, name);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b(activity);
            }
        });
        WeakReference weakReference = this.f13191b.f13193a;
        if (Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f13191b.f13195c.g(new WeakReference(null));
            this.f13191b.f13193a = null;
        }
        this.f13191b.f13194b.g(new ActivityProvider.State.Destroyed(new WeakReference(activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.c(activity);
            }
        });
        this.f13191b.f13194b.g(new ActivityProvider.State.Paused(new WeakReference(activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.d(activity);
            }
        });
        WeakReference weakReference = new WeakReference(activity);
        i iVar = this.f13191b;
        iVar.f13193a = weakReference;
        iVar.f13195c.g(weakReference);
        this.f13191b.f13194b.g(new ActivityProvider.State.Resumed(weakReference));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.e(activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.context.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.f(activity);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f13191b.f13194b.g(new ActivityProvider.State.ConfigurationChanged(newConfig));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
