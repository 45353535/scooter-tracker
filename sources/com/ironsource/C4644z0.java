package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4644z0 {
    public static int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int b(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1021;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return 1020;
        }
        if (aVar == IronSource.a.BANNER) {
            return 1019;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return 1018;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int c(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.BANNER) {
            return 612;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int d(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1027;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int e(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1024;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int f(IronSource.a aVar) {
        if (aVar == IronSource.a.INTERSTITIAL || aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (aVar == IronSource.a.BANNER) {
            return 604;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return 704;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int g(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1022;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int h(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }
}
