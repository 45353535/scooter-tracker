package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J.\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "callbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "foregroundActivityCount", "", "isAppInForeground", "", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "targetActivityInfo", "Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "addListener", "", "callback", "deInit", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "init", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "removeListener", "startActivitySafely", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", y.f66058y, "LifeCycleCallback", "TargetActivityInfo", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;

    @Nullable
    private volatile TargetActivityInfo targetActivityInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ActivityManager instance = new ActivityManager();

    @NotNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NotNull
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ,\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$Companion;", "", "()V", "TAG", "", C4424m2.f43617p, "Lcom/vungle/ads/internal/util/ActivityManager;", "getInstance$vungle_ads_release$annotations", "getInstance$vungle_ads_release", "()Lcom/vungle/ads/internal/util/ActivityManager;", "addLifecycleListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "deInit", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "deInit$vungle_ads_release", "init", "isForeground", "", "removeLifecycleListener", "startWhenForeground", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        public final void addLifecycleListener(@NotNull LifeCycleCallback listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        @NotNull
        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(@NotNull LifeCycleCallback listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(@NotNull Context context, @Nullable Intent deepLinkOverrideIntent, @Nullable Intent defaultIntent, @Nullable PresenterAdOpenCallback adOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "", "()V", "onBackground", "", "onForeground", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class LifeCycleCallback {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "(Ljava/lang/ref/WeakReference;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;)V", "getAdOpenCallback", "()Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "getContext", "()Ljava/lang/ref/WeakReference;", "getDeepLinkOverrideIntent", "()Landroid/content/Intent;", "getDefaultIntent", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final /* data */ class TargetActivityInfo {

        @Nullable
        private final PresenterAdOpenCallback adOpenCallback;

        @NotNull
        private final WeakReference<Context> context;

        @Nullable
        private final Intent deepLinkOverrideIntent;

        @Nullable
        private final Intent defaultIntent;

        public TargetActivityInfo(@NotNull WeakReference<Context> context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable PresenterAdOpenCallback presenterAdOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i10 & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        @NotNull
        public final WeakReference<Context> component1() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        @NotNull
        public final TargetActivityInfo copy(@NotNull WeakReference<Context> context, @Nullable Intent deepLinkOverrideIntent, @Nullable Intent defaultIntent, @Nullable PresenterAdOpenCallback adOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TargetActivityInfo(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) other;
            return Intrinsics.areEqual(this.context, targetActivityInfo.context) && Intrinsics.areEqual(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && Intrinsics.areEqual(this.defaultIntent, targetActivityInfo.defaultIntent) && Intrinsics.areEqual(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        @Nullable
        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        @NotNull
        public final WeakReference<Context> getContext() {
            return this.context;
        }

        @Nullable
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        @Nullable
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return iHashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(LifeCycleCallback callback) {
        this.callbacks.add(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objB;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Result.Companion companion = Result.f93230c;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            Logger.INSTANCE.e(TAG, "Error initializing ActivityManager", thG);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent deepLinkOverrideIntent, Intent defaultIntent, PresenterAdOpenCallback adOpenCallback) {
        try {
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to start activity: " + e10);
            if (deepLinkOverrideIntent != null && adOpenCallback != null) {
                try {
                    adOpenCallback.onDeeplinkClick(false);
                } catch (Exception unused) {
                }
            }
            if (deepLinkOverrideIntent != null && defaultIntent != null) {
                context.startActivity(defaultIntent);
                return true;
            }
        }
        if (deepLinkOverrideIntent == null) {
            if (defaultIntent != null) {
                context.startActivity(defaultIntent);
            }
            return false;
        }
        context.startActivity(deepLinkOverrideIntent);
        if (adOpenCallback != null) {
            adOpenCallback.onDeeplinkClick(true);
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                Companion companion = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((LifeCycleCallback) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(@NotNull LifeCycleCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }
}
