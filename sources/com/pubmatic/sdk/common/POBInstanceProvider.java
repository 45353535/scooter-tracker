package com.pubmatic.sdk.common;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.network.POBVolley;
import com.pubmatic.sdk.common.session.POBAppSessionHandler;
import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import com.pubmatic.sdk.common.session.POBImpDepthHandler;
import com.pubmatic.sdk.common.session.POBImpDepthHandling;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class POBInstanceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile POBDeviceInfo f62214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile POBAppInfo f62215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile POBLocationDetector f62216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile POBNetworkHandler f62217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile POBNetworkHandler f62218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile POBSDKConfig f62219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile POBCacheManager f62220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile POBTrackerHandler f62221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile POBNetworkMonitor f62222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile POBAdViewCacheService f62223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile POBCrashAnalysing f62224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile POBAppSessionHandler f62225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile POBImpDepthHandling f62226m;

    @NonNull
    public static POBAdViewCacheService getAdViewCacheService() {
        if (f62223j == null) {
            synchronized (POBAdViewCacheService.class) {
                try {
                    if (f62223j == null) {
                        f62223j = new POBAdViewCacheService();
                    }
                } finally {
                }
            }
        }
        return f62223j;
    }

    @NonNull
    public static POBAppInfo getAppInfo(@NonNull Context context) {
        if (f62215b == null) {
            synchronized (POBAppInfo.class) {
                try {
                    if (f62215b == null) {
                        f62215b = new POBAppInfo(context);
                    }
                } finally {
                }
            }
        }
        return f62215b;
    }

    @NonNull
    public static POBAppSessionHandler getApplicationSessionHandler(@NonNull Application application) {
        if (f62225l == null) {
            synchronized (POBAppSessionHandler.class) {
                try {
                    if (f62225l == null) {
                        f62225l = new POBAppSessionHandler(POBAppStateMonitor.getInstance(application));
                    }
                } finally {
                }
            }
        }
        return f62225l;
    }

    @NonNull
    public static POBCacheManager getCacheManager(@NonNull Context context) {
        if (f62220g == null) {
            synchronized (POBCacheManager.class) {
                try {
                    if (f62220g == null) {
                        f62220g = new POBCacheManager(context, getNetworkHandler(context));
                    }
                } finally {
                }
            }
        }
        return f62220g;
    }

    @Nullable
    public static synchronized POBCrashAnalysing getCrashAnalytics() {
        if (f62224k == null) {
            try {
                POBCrashAnalytics.Companion companion = POBCrashAnalytics.INSTANCE;
                f62224k = (POBCrashAnalysing) POBCrashAnalytics.class.newInstance();
            } catch (Exception e10) {
                POBLog.error("POBInstanceProvider", "Exception caught while initializing CrashAnalytics. Message -> " + e10.getMessage(), new Object[0]);
            }
        }
        return f62224k;
    }

    @NonNull
    public static POBDeviceInfo getDeviceInfo(@NonNull Context context) {
        if (f62214a == null) {
            synchronized (POBDeviceInfo.class) {
                try {
                    if (f62214a == null) {
                        f62214a = new POBDeviceInfo(context);
                    }
                } finally {
                }
            }
        }
        return f62214a;
    }

    @NonNull
    public static POBImpDepthHandling getImpDepthHandler(@NonNull POBAppSessionHandler pOBAppSessionHandler) {
        if (f62226m == null) {
            synchronized (POBImpDepthHandler.class) {
                try {
                    if (f62226m == null) {
                        f62226m = new POBImpDepthHandler(pOBAppSessionHandler);
                    }
                } finally {
                }
            }
        }
        return f62226m;
    }

    @NonNull
    public static POBLocationDetector getLocationDetector(@NonNull Context context) {
        if (f62216c == null) {
            synchronized (POBLocationDetector.class) {
                try {
                    if (f62216c == null) {
                        f62216c = new POBLocationDetector(context);
                        f62216c.setLocationUpdateIntervalInMs(getSdkConfig().getLocationDetectionDurationInMillis());
                    }
                } finally {
                }
            }
        }
        return f62216c;
    }

    @NonNull
    public static POBNetworkHandler getNetworkHandler(@NonNull Context context) {
        if (f62217d == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (f62217d == null) {
                        f62217d = new POBNetworkHandler(context);
                    }
                } finally {
                }
            }
        }
        return f62217d;
    }

    @NonNull
    public static POBNetworkHandler getNetworkHandlerWithBackgroundThreadDelivery(@NonNull Context context) {
        if (f62218e == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (f62218e == null) {
                        f62218e = new POBNetworkHandler(POBVolley.newRequestQueueWithBackgroundThreadDelivery(context));
                    }
                } finally {
                }
            }
        }
        return f62218e;
    }

    @NonNull
    public static POBNetworkMonitor getNetworkMonitor(@NonNull Context context) {
        if (f62222i == null) {
            synchronized (POBNetworkMonitor.class) {
                try {
                    if (f62222i == null) {
                        f62222i = new POBNetworkMonitor(context);
                    }
                } finally {
                }
            }
        }
        return f62222i;
    }

    @NonNull
    public static POBSDKConfig getSdkConfig() {
        if (f62219f == null) {
            synchronized (POBNetworkHandler.class) {
                try {
                    if (f62219f == null) {
                        f62219f = new POBSDKConfig();
                    }
                } finally {
                }
            }
        }
        return f62219f;
    }

    @NonNull
    public static POBTrackerHandler getTrackerHandler(@NonNull POBNetworkHandler pOBNetworkHandler) {
        if (f62221h == null) {
            synchronized (POBTrackerHandler.class) {
                try {
                    if (f62221h == null) {
                        f62221h = new POBTrackerHandler(pOBNetworkHandler);
                    }
                } finally {
                }
            }
        }
        return f62221h;
    }
}
