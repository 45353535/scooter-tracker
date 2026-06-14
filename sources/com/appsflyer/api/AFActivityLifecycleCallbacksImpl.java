package com.appsflyer.api;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/appsflyer/api/AFActivityLifecycleCallbacksImpl;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "androidLifecycleListener", "Lcom/appsflyer/api/AndroidLifecycleListener;", "(Lcom/appsflyer/api/AndroidLifecycleListener;)V", "backgroundCheckRunnable", "Ljava/lang/Runnable;", "backgroundHandler", "Landroid/os/Handler;", "checkBackgroundDelay", "", "isInForeground", "", "isPaused", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFActivityLifecycleCallbacksImpl implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AndroidLifecycleListener androidLifecycleListener;

    @Nullable
    private Runnable backgroundCheckRunnable;

    @NotNull
    private final Handler backgroundHandler;
    private long checkBackgroundDelay;
    private boolean isInForeground;
    private boolean isPaused;

    public AFActivityLifecycleCallbacksImpl(@NotNull AndroidLifecycleListener androidLifecycleListener) {
        Intrinsics.checkNotNullParameter(androidLifecycleListener, "androidLifecycleListener");
        this.androidLifecycleListener = androidLifecycleListener;
        this.checkBackgroundDelay = 500L;
        this.backgroundHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityPaused$lambda$2(AFActivityLifecycleCallbacksImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInForeground && this$0.isPaused) {
            this$0.isInForeground = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.androidLifecycleListener.onActivityOnCreate();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.isPaused = true;
        try {
            Runnable runnable = this.backgroundCheckRunnable;
            if (runnable != null) {
                this.backgroundHandler.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: com.appsflyer.api.a
                @Override // java.lang.Runnable
                public final void run() {
                    AFActivityLifecycleCallbacksImpl.onActivityPaused$lambda$2(this.f15582b);
                }
            };
            this.backgroundCheckRunnable = runnable2;
            Handler handler = this.backgroundHandler;
            Intrinsics.checkNotNull(runnable2);
            handler.postDelayed(runnable2, this.checkBackgroundDelay);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Runnable runnable = this.backgroundCheckRunnable;
        if (runnable != null) {
            this.backgroundHandler.removeCallbacks(runnable);
        }
        this.backgroundCheckRunnable = null;
        if (!this.isInForeground) {
            try {
                this.androidLifecycleListener.onActivityOnResume();
            } catch (Exception e10) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e10, true);
            }
        }
        this.isPaused = false;
        this.isInForeground = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
