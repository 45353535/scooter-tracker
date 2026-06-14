package com.mobilefuse.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0007J\u001c\u0010\"\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\bH\u0007J\u0012\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0010H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0007J\u0012\u00100\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/mobilefuse/sdk/AppLifecycleHelper;", "", "()V", "activityObservers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/lang/ref/SoftReference;", "Lcom/mobilefuse/sdk/AppLifecycleHelper$ActivityLifecycleObserver;", "appContext", "Landroid/app/Application;", "<set-?>", "", "appInForeground", "isAppInForeground$annotations", "isAppInForeground", "()Z", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity$annotations", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "detectAppBackgroundTask", "Ljava/lang/Runnable;", "firstActivityKnown", "globalContext", "Landroid/content/Context;", "getGlobalContext$annotations", "getGlobalContext", "()Landroid/content/Context;", "initialized", "addActivityLifecycleObserver", "", "observer", "callActivityObservers", "action", "Lkotlin/Function1;", "getActivityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "init", POBCoreNativeConstants.NATIVE_CONTEXT, "isActivityInForeground", "activity", "onActivityActivated", "onActivityDeactivated", "onApplicationTransitionToBackground", "onApplicationTransitionToForeground", "removeActivityLifecycleObserver", "tryToRefreshFirstActivity", "ActivityLifecycleObserver", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AppLifecycleHelper {
    private static Application appContext;

    @SuppressLint({"StaticFieldLeak"})
    private static WeakReference<Activity> currentActivityRef;
    private static boolean firstActivityKnown;
    private static boolean initialized;

    @NotNull
    public static final AppLifecycleHelper INSTANCE = new AppLifecycleHelper();
    private static final CopyOnWriteArraySet<SoftReference<ActivityLifecycleObserver>> activityObservers = new CopyOnWriteArraySet<>();
    private static boolean appInForeground = true;
    private static final Runnable detectAppBackgroundTask = new Runnable() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$detectAppBackgroundTask$1
        @Override // java.lang.Runnable
        public final void run() {
            AppLifecycleHelper.INSTANCE.onApplicationTransitionToBackground();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/AppLifecycleHelper$ActivityLifecycleObserver;", "", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onApplicationInBackground", "onApplicationInForeground", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static class ActivityLifecycleObserver {
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onApplicationInBackground() {
        }

        public void onApplicationInForeground() {
        }
    }

    private AppLifecycleHelper() {
    }

    public static final /* synthetic */ Runnable access$getDetectAppBackgroundTask$p(AppLifecycleHelper appLifecycleHelper) {
        return detectAppBackgroundTask;
    }

    public static final void addActivityLifecycleObserver(@NotNull ActivityLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            activityObservers.add(new SoftReference<>(observer));
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callActivityObservers(Function1<? super ActivityLifecycleObserver, Unit> action) {
        Iterator<SoftReference<ActivityLifecycleObserver>> it = activityObservers.iterator();
        while (it.hasNext()) {
            ActivityLifecycleObserver activityLifecycleObserver = it.next().get();
            if (activityLifecycleObserver != null) {
                action.invoke(activityLifecycleObserver);
            }
        }
    }

    private final Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return new Application.ActivityLifecycleCallbacks() { // from class: com.mobilefuse.sdk.AppLifecycleHelper.getActivityLifecycleCallbacks.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppLifecycleHelper.INSTANCE.onActivityDeactivated(activity);
                SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityDestroyed$$inlined$runnableTry$1(activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AppLifecycleHelper appLifecycleHelper = AppLifecycleHelper.INSTANCE;
                    appLifecycleHelper.onActivityDeactivated(activity);
                    SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new Function0<Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityPaused$$inlined$handleExceptions$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                            try {
                                AppLifecycleHelper.INSTANCE.callActivityObservers(new Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityPaused$$inlined$handleExceptions$lambda$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
                                        invoke2(activityLifecycleObserver);
                                        return Unit.f93236a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        it.onActivityPaused(activity);
                                    }
                                });
                            } catch (Throwable th2) {
                                int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                                if (i10 == 1) {
                                    StabilityHelper.logException("[Automatically caught]", th2);
                                } else if (i10 != 2) {
                                    throw new lf.m();
                                }
                            }
                        }
                    }));
                    SchedulersKt.getGlobalHandler().removeCallbacks(AppLifecycleHelper.access$getDetectAppBackgroundTask$p(appLifecycleHelper));
                    SchedulersKt.getGlobalHandler().postDelayed(AppLifecycleHelper.access$getDetectAppBackgroundTask$p(appLifecycleHelper), 2000L);
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new lf.m();
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppLifecycleHelper.INSTANCE.onActivityActivated(activity);
                SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1(activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppLifecycleHelper.INSTANCE.onActivityActivated(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppLifecycleHelper.INSTANCE.onActivityDeactivated(activity);
            }
        };
    }

    @Nullable
    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currentActivityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static /* synthetic */ void getCurrentActivity$annotations() {
    }

    @NotNull
    public static final Context getGlobalContext() {
        Application application = appContext;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
        }
        return application;
    }

    public static /* synthetic */ void getGlobalContext$annotations() {
    }

    public static final void init(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (initialized) {
                return;
            }
            appContext = context;
            initialized = true;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appContext");
            }
            context.registerActivityLifecycleCallbacks(INSTANCE.getActivityLifecycleCallbacks());
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }

    public static final boolean isActivityInForeground(@Nullable Activity activity) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (getCurrentActivity() == null && !firstActivityKnown) {
                return true;
            }
            if (getCurrentActivity() == null) {
                return false;
            }
            if (activity == null) {
                return true;
            }
            return activity == getCurrentActivity();
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
            return false;
        }
    }

    public static final boolean isAppInForeground() {
        return appInForeground;
    }

    public static /* synthetic */ void isAppInForeground$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityActivated(Activity activity) {
        currentActivityRef = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityDeactivated(Activity activity) {
        if (getCurrentActivity() == activity) {
            currentActivityRef = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onApplicationTransitionToBackground() {
        if (appInForeground) {
            appInForeground = false;
            SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new Function0<Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$onApplicationTransitionToBackground$$inlined$runnableTry$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        AppLifecycleHelper.INSTANCE.callActivityObservers(new Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$onApplicationTransitionToBackground$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
                                invoke2(activityLifecycleObserver);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                it.onApplicationInBackground();
                            }
                        });
                    } catch (Throwable th2) {
                        int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i10 == 1) {
                            StabilityHelper.logException("[Automatically caught]", th2);
                        } else if (i10 != 2) {
                            throw new lf.m();
                        }
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onApplicationTransitionToForeground() {
        SchedulersKt.getGlobalHandler().removeCallbacks(detectAppBackgroundTask);
        if (appInForeground) {
            return;
        }
        appInForeground = true;
        SchedulersKt.getGlobalHandler().post(new AppLifecycleHelper$sam$java_lang_Runnable$0(new Function0<Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$onApplicationTransitionToForeground$$inlined$runnableTry$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    AppLifecycleHelper.INSTANCE.callActivityObservers(new Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$onApplicationTransitionToForeground$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
                            invoke2(activityLifecycleObserver);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            it.onApplicationInForeground();
                        }
                    });
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new lf.m();
                    }
                }
            }
        }));
    }

    public static final void removeActivityLifecycleObserver(@NotNull ActivityLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (SoftReference<ActivityLifecycleObserver> item : activityObservers) {
                ActivityLifecycleObserver activityLifecycleObserver = item.get();
                if (activityLifecycleObserver == null) {
                    Intrinsics.checkNotNullExpressionValue(item, "item");
                    linkedHashSet.add(item);
                } else if (activityLifecycleObserver == observer) {
                    Intrinsics.checkNotNullExpressionValue(item, "item");
                    linkedHashSet.add(item);
                }
            }
            activityObservers.removeAll(linkedHashSet);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }

    public static final void tryToRefreshFirstActivity(@Nullable Activity activity) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!firstActivityKnown && getCurrentActivity() == null && activity != null) {
                currentActivityRef = new WeakReference<>(activity);
                firstActivityKnown = true;
            }
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }
}
