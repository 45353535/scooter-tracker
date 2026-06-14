package org.bidon.sdk.ads.banner.helper.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import hg.l0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.ads.banner.helper.ActivityLifecycleState;
import org.bidon.sdk.ads.banner.helper.PauseResumeObserver;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/impl/ActivityLifecycleObserver;", "Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "lifecycleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getInitialState", "registerApplicationObserver", "", "application", "Landroid/app/Application;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityLifecycleObserver implements PauseResumeObserver {

    @NotNull
    private final MutableStateFlow lifecycleFlow;

    @Nullable
    private WeakReference<Activity> weakActivity;

    public ActivityLifecycleObserver(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.lifecycleFlow = l0.a(getInitialState(activity));
        this.weakActivity = new WeakReference<>(activity);
    }

    private final ActivityLifecycleState getInitialState(Activity activity) {
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        registerApplicationObserver(application);
        ActivityLifecycleState activityLifecycleState = ActivityLifecycleState.Resumed;
        if (!activity.getWindow().getDecorView().getRootView().isShown()) {
            activityLifecycleState = null;
        }
        if (activityLifecycleState == null) {
            activityLifecycleState = ActivityLifecycleState.Paused;
        }
        LogExtKt.logInfo("ActivityLifecycleObserver", "Activity initial state " + activityLifecycleState + ": " + activity);
        return activityLifecycleState;
    }

    private final void registerApplicationObserver(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: org.bidon.sdk.ads.banner.helper.impl.ActivityLifecycleObserver.registerApplicationObserver.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = ActivityLifecycleObserver.this.weakActivity;
                if (Intrinsics.areEqual(activity, weakReference != null ? (Activity) weakReference.get() : null)) {
                    LogExtKt.logInfo("ActivityLifecycleObserver", "Activity Destroyed " + activity);
                    ActivityLifecycleObserver.this.weakActivity = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = ActivityLifecycleObserver.this.weakActivity;
                if (Intrinsics.areEqual(activity, weakReference != null ? (Activity) weakReference.get() : null)) {
                    LogExtKt.logInfo("ActivityLifecycleObserver", "Activity Paused " + activity);
                    ActivityLifecycleObserver.this.getLifecycleFlow().setValue(ActivityLifecycleState.Paused);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = ActivityLifecycleObserver.this.weakActivity;
                if (Intrinsics.areEqual(activity, weakReference != null ? (Activity) weakReference.get() : null)) {
                    LogExtKt.logInfo("ActivityLifecycleObserver", "Activity Resumed " + activity);
                    ActivityLifecycleObserver.this.getLifecycleFlow().setValue(ActivityLifecycleState.Resumed);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        });
    }

    @Override // org.bidon.sdk.ads.banner.helper.PauseResumeObserver
    @NotNull
    public MutableStateFlow getLifecycleFlow() {
        return this.lifecycleFlow;
    }
}
