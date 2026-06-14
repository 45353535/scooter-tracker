package com.mobilefuse.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.work.PeriodicWorkRequest;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.mobilefuse.sdk.utils.LongExtensionsKt;

/* JADX INFO: loaded from: classes10.dex */
public class AdmCacheMonitor {
    private static int NEXT_ID = 1;
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private AdController adController;
    private Runnable currentAdExpirationTask;
    private boolean currentAdmExpired;
    private Handler handler;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f53359id;
    private Listener listener;
    private Runnable loadNewAdTask;
    private long loadedNewAdTimestamp;
    private AdController newAdController;
    private AdController.AdListener newAdControllerListener;
    private long startedMonitorTimestamp;
    private final String logPrefix = "[AdmCacheMonitor] ";
    private LoadState loadState = LoadState.IDLE;
    private MonitorState monitorState = MonitorState.IDLE;
    private int currentLoadAttempt = 0;
    private long expirationLimitMillis = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;

    public interface Listener {
        void onAdExpired(float f10) throws Throwable;

        void onAdmCacheExpired() throws Throwable;

        void onNewAdFullyLoaded(AdController adController) throws Throwable;

        void onNewAdLoadFailed() throws Throwable;

        void onNewAdRequested() throws Throwable;
    }

    private enum LoadState {
        IDLE,
        LOADING,
        LOADED,
        FAILED
    }

    private enum MonitorState {
        IDLE,
        RUNNING,
        PAUSED,
        DESTROYED
    }

    public AdmCacheMonitor(AdController adController, @NonNull Listener listener) throws Throwable {
        this.f53359id = 0;
        this.adController = adController;
        this.listener = listener;
        int i10 = NEXT_ID;
        NEXT_ID = i10 + 1;
        this.f53359id = i10;
        logDebug("-- CREATED");
        this.handler = new Handler(Looper.getMainLooper());
        this.activityLifecycleObserver = createActivityLifecycleObserver();
        this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.j
            @Override // java.lang.Runnable
            public final void run() {
                AdmCacheMonitor.c(this.f53386b);
            }
        }, 200L);
    }

    public static /* synthetic */ void a(AdmCacheMonitor admCacheMonitor) {
        admCacheMonitor.getClass();
        try {
            admCacheMonitor.loadNewAd();
        } catch (Throwable th2) {
            StabilityHelper.logException(admCacheMonitor, th2);
        }
    }

    public static /* synthetic */ void b(AdmCacheMonitor admCacheMonitor) {
        admCacheMonitor.getClass();
        try {
            admCacheMonitor.onCurrentAdmCacheExpired();
        } catch (Throwable th2) {
            StabilityHelper.logException(admCacheMonitor, th2);
        }
    }

    public static /* synthetic */ void c(AdmCacheMonitor admCacheMonitor) {
        admCacheMonitor.getClass();
        try {
            AppLifecycleHelper.addActivityLifecycleObserver(admCacheMonitor.activityLifecycleObserver);
        } catch (Throwable th2) {
            StabilityHelper.logException(admCacheMonitor, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAdmExpirationTimer() throws Throwable {
        logDebug("cancelAdmExpirationTimer");
        this.handler.removeCallbacks(this.currentAdExpirationTask);
    }

    private void cancelLoadNewAdTimer() throws Throwable {
        logDebug("cancelLoadNewAdTimer");
        this.handler.removeCallbacks(this.loadNewAdTask);
    }

    private AppLifecycleHelper.ActivityLifecycleObserver createActivityLifecycleObserver() {
        return new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.AdmCacheMonitor.1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityPaused(@NonNull Activity activity) {
                try {
                    if (AdmCacheMonitor.this.adController == null) {
                        return;
                    }
                    if (AppLifecycleHelper.getCurrentActivity() == null || AdmCacheMonitor.this.adController.getRenderingActivity() == activity) {
                        AdmCacheMonitor.this.pauseMonitor();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onActivityResumed(@NonNull Activity activity) {
                try {
                    if (AdmCacheMonitor.this.adController == null) {
                        return;
                    }
                    if (AdmCacheMonitor.this.adController.getRenderingActivity() == activity || AdmCacheMonitor.this.adController.getRenderingActivity() == null) {
                        AdmCacheMonitor.this.resumeMonitor();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    private AdController.AdListener createNewAdControllerListener() {
        return new AdController.AdListener() { // from class: com.mobilefuse.sdk.AdmCacheMonitor.2
            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClicked(String str) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdClosed() throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdControllerUpdated(AdController adController) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdError(AdError adError) throws Throwable {
                AdmCacheMonitor.this.logDebug(TelemetryAdLifecycleEvent.AD_ERROR);
                AdmCacheMonitor.this.onNewAdLoadFailed(2);
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdExpired(float f10) throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdLoaded() throws Throwable {
                AdmCacheMonitor.this.logDebug("onAdLoaded");
                AdmCacheMonitor.this.loadedNewAdTimestamp = System.currentTimeMillis();
                if (AdmCacheMonitor.this.monitorState == MonitorState.PAUSED) {
                    return;
                }
                AdmCacheMonitor.this.cancelAdmExpirationTimer();
                AdmCacheMonitor.this.onNewAdLoaded();
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdNotFilled(int i10) throws Throwable {
                AdmCacheMonitor.this.logDebug("onAdNotFilled [reason: " + i10 + C4240b4.j.f42674e);
                AdmCacheMonitor.this.onNewAdLoadFailed(i10);
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onAdRendered() throws Throwable {
            }

            @Override // com.mobilefuse.sdk.AdController.AdListener
            public void onFullscreenChanged(boolean z10) throws Throwable {
            }
        };
    }

    private void expireCurrentAd() throws Throwable {
        logDebug("expireCurrentAd");
        this.listener.onAdExpired(LongExtensionsKt.millisecondsToSeconds(this.expirationLimitMillis));
    }

    private void loadNewAd() throws Throwable {
        logDebug("loadNewAd");
        if (!MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("The auto ADM cache reloading is disabled. Can't load new ad. Call the MobileFuseSettings.setExpiredAdReloading(true) to enable the The auto ADM cache reloading. ");
            return;
        }
        this.loadState = LoadState.LOADING;
        if (this.newAdController == null) {
            AdController.AdListener adListenerCreateNewAdControllerListener = createNewAdControllerListener();
            this.newAdControllerListener = adListenerCreateNewAdControllerListener;
            this.newAdController = this.adController.newInstance(adListenerCreateNewAdControllerListener);
        }
        tryToLoadNextAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logDebug(String str) {
        MobileFuse.logDebug("[AdmCacheMonitor] " + this.f53359id + "::" + str);
    }

    private void onCurrentAdmCacheExpired() throws Throwable {
        logDebug("onCurrentAdmCacheExpired");
        this.currentAdmExpired = true;
        this.listener.onAdmCacheExpired();
        if (!MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("The auto ADM cache reloading is disabled. Dispatch ad expiration signal. Call the MobileFuseSettings.setExpiredAdReloading(true) to enable the The auto ADM cache reloading. ");
            this.loadState = LoadState.FAILED;
        }
        if (this.loadState == LoadState.FAILED) {
            expireCurrentAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAdLoadFailed(int i10) throws Throwable {
        logDebug("onNewAdLoadFailed [reason: " + i10 + C4240b4.j.f42674e);
        if (this.loadState != LoadState.LOADING) {
            return;
        }
        this.listener.onNewAdLoadFailed();
        if (i10 != 1 && this.currentLoadAttempt != 2) {
            tryToLoadNextAd();
            return;
        }
        this.loadState = LoadState.FAILED;
        if (this.currentAdmExpired) {
            expireCurrentAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAdLoaded() throws Throwable {
        logDebug("onNewAdLoaded");
        this.loadState = LoadState.LOADED;
        AdController adController = this.newAdController;
        this.newAdController = null;
        this.newAdControllerListener = null;
        this.listener.onNewAdFullyLoaded(adController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseMonitor() throws Throwable {
        if (this.monitorState != MonitorState.RUNNING) {
            return;
        }
        this.monitorState = MonitorState.PAUSED;
        logDebug("pauseMonitor");
        cancelLoadNewAdTimer();
        cancelAdmExpirationTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeMonitor() throws Throwable {
        LoadState loadState;
        LoadState loadState2;
        logDebug("resumeMonitor");
        if (this.monitorState != MonitorState.PAUSED || (loadState = this.loadState) == (loadState2 = LoadState.FAILED) || loadState == LoadState.LOADED) {
            return;
        }
        if (this.startedMonitorTimestamp == 0) {
            logDebug("can't resume monitor. was not started earlier.");
            return;
        }
        AdController adController = this.newAdController;
        if (adController != null && adController.adState == AdController.AdState.LOADED) {
            logDebug("New Ad was loaded in the meantime in background. Don't resume timers and dispatch ad readiness.");
            if (System.currentTimeMillis() - this.loadedNewAdTimestamp < this.expirationLimitMillis) {
                logDebug("new Ad Controller still has valid ADM cache. Update AdController with it.");
                onNewAdLoaded();
                return;
            } else {
                logDebug("new Ad Controller doesn't have valid ADM cache. Report Ad Expiration.");
                this.loadState = loadState2;
                expireCurrentAd();
                return;
            }
        }
        MonitorState monitorState = MonitorState.RUNNING;
        this.monitorState = monitorState;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.expirationLimitMillis;
        long j11 = this.startedMonitorTimestamp;
        long j12 = j10 - (jCurrentTimeMillis - j11);
        long j13 = (j10 - 15000) - (jCurrentTimeMillis - j11);
        if (j12 > 0) {
            this.monitorState = monitorState;
            startAdmExpirationTimer(j12);
        } else {
            this.currentAdExpirationTask.run();
        }
        if (MobileFuseSettings.isExpiredAdReloading()) {
            if (j13 <= 0) {
                this.loadNewAdTask.run();
            } else {
                this.monitorState = monitorState;
                startLoadNewAdTimer(j13);
            }
        }
    }

    private void startAdmExpirationTimer(long j10) throws Throwable {
        logDebug("startAdmExpirationTimer [delay: " + j10 + C4240b4.j.f42674e);
        this.handler.postDelayed(this.currentAdExpirationTask, j10);
    }

    private void startLoadNewAdTimer(long j10) throws Throwable {
        if (MobileFuseSettings.isExpiredAdReloading()) {
            logDebug("startLoadNewAdTimer [delay: " + j10 + C4240b4.j.f42674e);
            this.handler.postDelayed(this.loadNewAdTask, j10);
        }
    }

    private void tryToLoadNextAd() throws Throwable {
        this.currentLoadAttempt++;
        logDebug("tryToLoadNextAd [attempt: " + this.currentLoadAttempt + C4240b4.j.f42674e);
        this.listener.onNewAdRequested();
        this.newAdController.loadAd();
    }

    public void cancelMonitor() throws Throwable {
        logDebug("cancelMonitor");
        AppLifecycleHelper.removeActivityLifecycleObserver(this.activityLifecycleObserver);
        this.startedMonitorTimestamp = 0L;
        cancelLoadNewAdTimer();
        cancelAdmExpirationTimer();
    }

    public void destroy() throws Throwable {
        MonitorState monitorState = this.monitorState;
        MonitorState monitorState2 = MonitorState.DESTROYED;
        if (monitorState == monitorState2) {
            return;
        }
        cancelMonitor();
        logDebug("destroy");
        this.monitorState = monitorState2;
        AdController adController = this.newAdController;
        if (adController != null) {
            adController.destroy();
            this.newAdControllerListener = null;
        }
        this.adController = null;
    }

    public void startMonitor(int i10) throws Throwable {
        if (this.monitorState != MonitorState.IDLE) {
            return;
        }
        long j10 = ((long) i10) * 1000;
        this.expirationLimitMillis = j10;
        if (j10 < 20000) {
            this.expirationLimitMillis = 20000L;
        }
        logDebug("startMonitor");
        if (this.loadNewAdTask == null) {
            this.loadNewAdTask = new Runnable() { // from class: com.mobilefuse.sdk.k
                @Override // java.lang.Runnable
                public final void run() {
                    AdmCacheMonitor.a(this.f53388b);
                }
            };
        }
        if (this.currentAdExpirationTask == null) {
            this.currentAdExpirationTask = new Runnable() { // from class: com.mobilefuse.sdk.l
                @Override // java.lang.Runnable
                public final void run() {
                    AdmCacheMonitor.b(this.f53390b);
                }
            };
        }
        this.startedMonitorTimestamp = System.currentTimeMillis();
        if (!AppLifecycleHelper.isActivityInForeground(this.adController.getRenderingActivity())) {
            logDebug("activity is not in foreground, pause monitor.");
            this.monitorState = MonitorState.PAUSED;
        } else {
            this.monitorState = MonitorState.RUNNING;
            startAdmExpirationTimer(this.expirationLimitMillis);
            startLoadNewAdTimer(this.expirationLimitMillis - 15000);
        }
    }
}
