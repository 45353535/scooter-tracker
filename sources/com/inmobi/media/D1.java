package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.inmobi.media.D1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class D1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f36695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f36696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36697c;

    public D1(Context context) {
        this.f36697c = context;
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper(...)");
        this.f36695a = new C1(mainLooper);
    }

    public static final void a(Context context, D1 d12) {
        if (E1.a(context) || d12.f36696b != null) {
            return;
        }
        d12.f36695a.sendEmptyMessageDelayed(1001, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f36696b;
        if (!Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f36696b = new WeakReference(activity);
        }
        this.f36695a.removeMessages(1001);
        this.f36695a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f36696b;
        if (!Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f36696b = new WeakReference(activity);
        }
        this.f36695a.removeMessages(1001);
        this.f36695a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference weakReference = this.f36696b;
        if (Intrinsics.areEqual(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f36695a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.f36696b == null) {
            final Context context = this.f36697c;
            Runnable runnable = new Runnable() { // from class: w3.i
                @Override // java.lang.Runnable
                public final void run() {
                    D1.a(context, this);
                }
            };
            Context context2 = Ji.f37157a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Ji.f37163g.submit(runnable);
        }
    }
}
