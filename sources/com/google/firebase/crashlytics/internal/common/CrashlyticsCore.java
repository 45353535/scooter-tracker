package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class CrashlyticsCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseApp f32036b;

    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DataCollectionArbiter f32037c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CrashlyticsFileMarker f32040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CrashlyticsFileMarker f32041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CrashlyticsController f32043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IdManager f32044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FileStore f32045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnalyticsEventLogger f32046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CrashlyticsAppQualitySessionsSubscriber f32047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CrashlyticsNativeComponent f32048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RemoteConfigDeferredProxy f32049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CrashlyticsWorkers f32050p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32039e = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnDemandCounter f32038d = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.f32036b = firebaseApp;
        this.f32037c = dataCollectionArbiter;
        this.f32035a = firebaseApp.getApplicationContext();
        this.f32044j = idManager;
        this.f32048n = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.f32046l = analyticsEventLogger;
        this.f32045k = fileStore;
        this.f32047m = crashlyticsAppQualitySessionsSubscriber;
        this.f32049o = remoteConfigDeferredProxy;
        this.f32050p = crashlyticsWorkers;
    }

    public static /* synthetic */ void c(CrashlyticsCore crashlyticsCore, Throwable th2) {
        crashlyticsCore.f32043i.X("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(crashlyticsCore.f32038d.getRecordedOnDemandExceptions()));
        crashlyticsCore.f32043i.X("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(crashlyticsCore.f32038d.getDroppedOnDemandExceptions()));
        crashlyticsCore.f32043i.O(Thread.currentThread(), th2);
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private void l() {
        try {
            this.f32042h = Boolean.TRUE.equals((Boolean) this.f32050p.common.getExecutor().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f32129b.f32043i.t());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f32042h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        r();
        try {
            try {
                this.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.f
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void handleBreadcrumb(String str) {
                        this.f32112a.log(str);
                    }
                });
                this.f32043i.T();
                if (!settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                    Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f32043i.A(settingsProvider)) {
                    Logger.getLogger().w("Previous sessions could not be finalized.");
                }
                this.f32043i.Z(settingsProvider.getSettingsAsync());
                q();
            } catch (Exception e10) {
                Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                q();
            }
        } catch (Throwable th2) {
            q();
            throw th2;
        }
    }

    private void o(final SettingsProvider settingsProvider) {
        Future<?> futureSubmit = this.f32050p.common.getExecutor().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f32135b.n(settingsProvider);
            }
        });
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Logger.getLogger().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", e12);
        }
    }

    static boolean p(String str, boolean z10) {
        if (!z10) {
            Logger.getLogger().v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".     |  | ");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".   \\ |  | /");
        Log.e(Logger.TAG, ".    \\    /");
        Log.e(Logger.TAG, ".     \\  /");
        Log.e(Logger.TAG, ".      \\/");
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".      /\\");
        Log.e(Logger.TAG, ".     /  \\");
        Log.e(Logger.TAG, ".    /    \\");
        Log.e(Logger.TAG, ".   / |  | \\");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".");
        return false;
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f32043i.n();
    }

    public Task<Void> deleteUnsentReports() {
        return this.f32043i.s();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f32042h;
    }

    @CanIgnoreReturnValue
    public Task<Void> doBackgroundInitializationAsync(final SettingsProvider settingsProvider) {
        return this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f32110b.n(settingsProvider);
            }
        });
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f32037c.isAutomaticDataCollectionEnabled();
    }

    public void log(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f32039e;
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.n
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore crashlyticsCore = this.f32130b;
                crashlyticsCore.f32050p.diskWrite.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32113b.f32043i.d0(j, str);
                    }
                });
            }
        });
    }

    public void logException(@NonNull final Throwable th2, @NonNull final Map<String, String> map) {
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f32126b.f32043i.c0(Thread.currentThread(), th2, map);
            }
        });
    }

    public void logFatalException(final Throwable th2) {
        Logger.getLogger().d("Recorded on-demand fatal events: " + this.f32038d.getRecordedOnDemandExceptions());
        Logger.getLogger().d("Dropped on-demand fatal events: " + this.f32038d.getDroppedOnDemandExceptions());
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.h
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.c(this.f32116b, th2);
            }
        });
    }

    boolean m() {
        return this.f32040f.isPresent();
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        if (!p(appData.buildId, CommonUtils.getBooleanResourceValue(this.f32035a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String sessionId = new CLSUUID().getSessionId();
        try {
            this.f32041g = new CrashlyticsFileMarker("crash_marker", this.f32045k);
            this.f32040f = new CrashlyticsFileMarker("initialization_marker", this.f32045k);
            UserMetadata userMetadata = new UserMetadata(sessionId, this.f32045k, this.f32050p);
            LogFileManager logFileManager = new LogFileManager(this.f32045k);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
            this.f32049o.setupListener(userMetadata);
            this.f32043i = new CrashlyticsController(this.f32035a, this.f32044j, this.f32037c, this.f32045k, this.f32041g, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.f32035a, this.f32044j, this.f32045k, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.f32038d, this.f32047m, this.f32050p), this.f32048n, this.f32046l, this.f32047m, this.f32050p);
            boolean zM = m();
            l();
            this.f32043i.y(sessionId, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (!zM || !CommonUtils.canTryConnection(this.f32035a)) {
                Logger.getLogger().d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            o(settingsProvider);
            return false;
        } catch (Exception e10) {
            Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f32043i = null;
            return false;
        }
    }

    void q() {
        CrashlyticsWorkers.checkBackgroundThread();
        try {
            if (this.f32040f.remove()) {
                return;
            }
            Logger.getLogger().w("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void r() {
        CrashlyticsWorkers.checkBackgroundThread();
        this.f32040f.create();
        Logger.getLogger().v("Initialization marker file was created.");
    }

    public Task<Void> sendUnsentReports() {
        return this.f32043i.U();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f32037c.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(final String str, final String str2) {
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f32120b.f32043i.V(str, str2);
            }
        });
    }

    public void setCustomKeys(final Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f32133b.f32043i.W(map);
            }
        });
    }

    public void setInternalKey(final String str, final String str2) {
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f32123b.f32043i.X(str, str2);
            }
        });
    }

    public void setUserId(final String str) {
        this.f32050p.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f32118b.f32043i.Y(str);
            }
        });
    }
}
