package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4450n9;
import com.ironsource.C4536sb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f67856a;

        AdFormat(String str) {
            this.f67856a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f67856a;
        }
    }

    private LevelPlay() {
    }

    public static final void addImpressionDataListener(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C4536sb.f44908a.a(listener);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.1.0";
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest initRequest, @NotNull LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4536sb.f44908a.a(context, initRequest, listener);
    }

    public static final void launchTestSuite(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        r.m().c(context);
    }

    public static final void removeImpressionDataListener(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C4536sb.f44908a.b(listener);
    }

    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final boolean setDynamicUserId(@NotNull String dynamicUserId) {
        Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return r.m().b(dynamicUserId);
    }

    public static final void setMetaData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C4536sb.f44908a.a(key, value);
    }

    public static final void setNetworkData(@NotNull String networkKey, @NotNull JSONObject networkData) {
        Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        r.m().b(networkKey, networkData);
    }

    public static final void setSegment(@NotNull LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C4536sb.f44908a.b(segment);
    }

    public static final void validateIntegration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C4450n9.f44458a.a(context);
    }

    public static final void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C4536sb.f44908a.a(key, values);
    }
}
