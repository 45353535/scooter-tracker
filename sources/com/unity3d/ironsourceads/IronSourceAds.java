package com.unity3d.ironsourceads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED(LogConstants.KEY_REWARDED_VIDEO);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67795a;

        AdFormat(String str) {
            this.f67795a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f67795a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.1.0";
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        O9.f41513a.a(context, initRequest, initializationListener);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final void setMetaData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        O9.f41513a.a(key, value);
    }

    public static final void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        r.m().a(key, values);
    }
}
