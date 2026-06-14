package org.bidon.sdk.ads.banner.helper.impl;

import android.app.Activity;
import android.app.ActivityManager;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/impl/PauseResumeObserverImpl;", "Lorg/bidon/sdk/ads/banner/helper/PauseResumeObserver;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "lifecycleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isForegrounded", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PauseResumeObserverImpl implements PauseResumeObserver {

    @NotNull
    private final MutableStateFlow lifecycleFlow;

    @Nullable
    private WeakReference<Activity> weakActivity;

    public PauseResumeObserverImpl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.lifecycleFlow = l0.a(isForegrounded() ? ActivityLifecycleState.Resumed : ActivityLifecycleState.Paused);
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: org.bidon.sdk.ads.banner.helper.impl.PauseResumeObserverImpl.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = PauseResumeObserverImpl.this.weakActivity;
                LogExtKt.logInfo("PauseResumeObserver", "Activity Destroyed (current: " + (weakReference != null ? (Activity) weakReference.get() : null) + ") " + activity);
                WeakReference weakReference2 = PauseResumeObserverImpl.this.weakActivity;
                if (Intrinsics.areEqual(activity, weakReference2 != null ? (Activity) weakReference2.get() : null)) {
                    PauseResumeObserverImpl.this.weakActivity = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = PauseResumeObserverImpl.this.weakActivity;
                LogExtKt.logInfo("PauseResumeObserver", "Activity <Paused> (current: " + (weakReference != null ? (Activity) weakReference.get() : null) + ") " + activity);
                WeakReference weakReference2 = PauseResumeObserverImpl.this.weakActivity;
                if (Intrinsics.areEqual(activity, weakReference2 != null ? (Activity) weakReference2.get() : null)) {
                    LogExtKt.logInfo("PauseResumeObserver", "Activity Paused " + activity);
                    PauseResumeObserverImpl.this.getLifecycleFlow().setValue(ActivityLifecycleState.Paused);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                WeakReference weakReference = PauseResumeObserverImpl.this.weakActivity;
                LogExtKt.logInfo("PauseResumeObserver", "Activity Resumed (current: " + (weakReference != null ? (Activity) weakReference.get() : null) + ") " + activity);
                PauseResumeObserverImpl.this.weakActivity = new WeakReference(activity);
                PauseResumeObserverImpl.this.getLifecycleFlow().setValue(ActivityLifecycleState.Resumed);
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

    private final boolean isForegrounded() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    @Override // org.bidon.sdk.ads.banner.helper.PauseResumeObserver
    @NotNull
    public MutableStateFlow getLifecycleFlow() {
        return this.lifecycleFlow;
    }
}
