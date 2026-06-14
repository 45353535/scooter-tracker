package com.pubmatic.sdk.common.session;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000256B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\n018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/pubmatic/sdk/common/session/POBAppStateMonitor;", "Lcom/pubmatic/sdk/common/session/POBAppStateMonitoring;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "", "release", "()V", "Lcom/pubmatic/sdk/common/session/POBAppStateMonitor$POBAppLifecycleListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addAppLifecycleListener", "(Lcom/pubmatic/sdk/common/session/POBAppStateMonitor$POBAppLifecycleListener;)V", "removeAppLifecycleListener", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "a", "Landroid/app/Application;", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/Runnable;", "runnable", "", "d", "J", "lastActivityStartTimer", EidRequestBuilder.REQUEST_FIELD_EMAIL, "lastActivityStopTimer", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "isAppInForeground", "", "g", "Ljava/util/List;", "listeners", y.f66058y, "POBAppLifecycleListener", "common_release"}, k = 1, mv = {1, 7, 1})
public final class POBAppStateMonitor implements POBAppStateMonitoring, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile POBAppStateMonitor f62510h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable runnable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long lastActivityStartTimer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastActivityStopTimer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAppInForeground;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List listeners;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pubmatic/sdk/common/session/POBAppStateMonitor$Companion;", "", "()V", "FOREGROUND_DELAY", "", "TAG", "", C4424m2.f43617p, "Lcom/pubmatic/sdk/common/session/POBAppStateMonitor;", Constants.GET_INSTANCE, "application", "Landroid/app/Application;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBAppStateMonitor getInstance(@NotNull Application application) {
            POBAppStateMonitor pOBAppStateMonitor;
            Intrinsics.checkNotNullParameter(application, "application");
            POBAppStateMonitor pOBAppStateMonitor2 = POBAppStateMonitor.f62510h;
            if (pOBAppStateMonitor2 != null) {
                return pOBAppStateMonitor2;
            }
            synchronized (this) {
                pOBAppStateMonitor = POBAppStateMonitor.f62510h;
                if (pOBAppStateMonitor == null) {
                    pOBAppStateMonitor = new POBAppStateMonitor(application, null);
                    POBAppStateMonitor.f62510h = pOBAppStateMonitor;
                }
            }
            return pOBAppStateMonitor;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/pubmatic/sdk/common/session/POBAppStateMonitor$POBAppLifecycleListener;", "", "onAppMovedToBackground", "", "onAppMovedToForeground", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface POBAppLifecycleListener {
        void onAppMovedToBackground();

        void onAppMovedToForeground();
    }

    public /* synthetic */ POBAppStateMonitor(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isAppInForeground || this$0.lastActivityStopTimer - this$0.lastActivityStartTimer < 700) {
            return;
        }
        this$0.isAppInForeground = false;
        Iterator it = this$0.listeners.iterator();
        while (it.hasNext()) {
            ((POBAppLifecycleListener) it.next()).onAppMovedToBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.application.registerActivityLifecycleCallbacks(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(POBAppStateMonitor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.application.unregisterActivityLifecycleCallbacks(this$0);
    }

    @NotNull
    public static final POBAppStateMonitor getInstance(@NotNull Application application) {
        return INSTANCE.getInstance(application);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void addAppLifecycleListener(@NotNull POBAppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
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
        if (!this.isAppInForeground) {
            this.isAppInForeground = true;
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((POBAppLifecycleListener) it.next()).onAppMovedToForeground();
            }
        }
        this.lastActivityStartTimer = System.currentTimeMillis();
        this.handler.removeCallbacks(this.runnable);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.lastActivityStopTimer = System.currentTimeMillis();
        this.handler.postDelayed(this.runnable, 700L);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void release() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pubmatic.sdk.common.session.c
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.c(this.f62522b);
            }
        });
        this.lastActivityStartTimer = 0L;
        this.lastActivityStopTimer = 0L;
        this.listeners.clear();
    }

    @Override // com.pubmatic.sdk.common.session.POBAppStateMonitoring
    public void removeAppLifecycleListener(@NotNull POBAppLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    private POBAppStateMonitor(Application application) {
        this.application = application;
        this.isAppInForeground = true;
        this.listeners = new ArrayList();
        this.runnable = new Runnable() { // from class: com.pubmatic.sdk.common.session.a
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.a(this.f62520b);
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            HandlerThread handlerThread = new HandlerThread("POBAppStateMonitor");
            handlerThread.start();
            looperMyLooper = handlerThread.getLooper();
        }
        this.handler = new Handler(looperMyLooper);
        this.isAppInForeground = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pubmatic.sdk.common.session.b
            @Override // java.lang.Runnable
            public final void run() {
                POBAppStateMonitor.b(this.f62521b);
            }
        });
    }
}
