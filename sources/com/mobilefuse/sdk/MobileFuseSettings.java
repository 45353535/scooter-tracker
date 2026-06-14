package com.mobilefuse.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.iab.omid.library.mobilefuse.Omid;
import com.mobilefuse.sdk.component.MraidAdRendererComponent;
import com.mobilefuse.sdk.component.VastAdRendererComponent;
import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.mobilefuse.sdk.config.UsageInfoType;
import com.mobilefuse.sdk.core.BuildConfig;
import com.mobilefuse.sdk.device.UserAgentInfoKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.identity.EidService;
import com.mobilefuse.sdk.identity.IdentifierUpdateSignal;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.storyboard.StoryboardAdRenderComponent;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0007J\u001c\u0010+\u001a\u00020*2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 H\u0007J\n\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010/\u001a\u00020\u000fH\u0007J\b\u00100\u001a\u00020\u0004H\u0007J\n\u00101\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u00102\u001a\u000203H\u0007J\b\u00104\u001a\u000205H\u0007J\b\u00106\u001a\u00020\u0004H\u0007J\u0012\u00107\u001a\u0004\u0018\u00010\u00042\u0006\u00108\u001a\u00020\u001bH\u0007J\n\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010<\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u0004H\u0007J\b\u0010?\u001a\u00020\u0004H\u0007J\b\u0010@\u001a\u00020AH\u0007J\b\u0010B\u001a\u00020*H\u0007J\b\u0010C\u001a\u00020\u0015H\u0007J\b\u0010D\u001a\u00020\u0015H\u0007J\b\u0010E\u001a\u00020\u0015H\u0007J\b\u0010F\u001a\u00020\u0015H\u0007J\b\u0010G\u001a\u00020\u0015H\u0007J\r\u0010H\u001a\u00020*H\u0001¢\u0006\u0002\bIJ\u0012\u0010J\u001a\u00020*2\b\u0010K\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020\u0015H\u0007J\u0010\u0010N\u001a\u00020*2\u0006\u0010M\u001a\u00020\u0015H\u0007J\u0010\u0010O\u001a\u00020*2\u0006\u0010M\u001a\u00020\u0015H\u0007J\u0010\u0010P\u001a\u00020*2\u0006\u0010Q\u001a\u000205H\u0007J\u0018\u0010R\u001a\u00020*2\u0006\u00108\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u0004H\u0007J\u0018\u0010S\u001a\u00020*2\u0006\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0004H\u0007J\u0018\u0010V\u001a\u00020*2\u0006\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0004H\u0007J\u0010\u0010W\u001a\u00020*2\u0006\u0010M\u001a\u00020\u0015H\u0007J\u0010\u0010X\u001a\u00020*2\u0006\u0010M\u001a\u00020\u0015H\u0007J\u0010\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020AH\u0007J\b\u0010[\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aj\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0004`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00158A@AX\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006\\"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseSettings;", "", "()V", "OMID_VERSION_UNKNOWN", "", "advertisingId", "appName", "appPackageInfo", "Landroid/content/pm/PackageInfo;", "appSetId", "getAppSetId$mobilefuse_sdk_core_release", "()Ljava/lang/String;", "setAppSetId$mobilefuse_sdk_core_release", "(Ljava/lang/String;)V", "appVersionCode", "", "appVersionName", "deviceIp", "getDeviceIp$mobilefuse_sdk_core_release", "setDeviceIp$mobilefuse_sdk_core_release", "expiredAdReloading", "", "initialized", "limitTrackingEnabled", "logHttpRequests", "overrideSettings", "Ljava/util/HashMap;", "Lcom/mobilefuse/sdk/MobileFuseSetting;", "Lkotlin/collections/HashMap;", "spoofMode", "tabletDevice", "testCeltraIdsMap", "", "testMode", "<set-?>", "testModeOverrideFromServer", "isTestModeOverrideFromServer$annotations", "isTestModeOverrideFromServer", "()Z", "setTestModeOverrideFromServer", "(Z)V", "clearMaxInterstitialCloseButtonDelay", "", "configureTestCeltraIds", "configMap", "getAdvertisingId", "getAppName", "getAppVersionCode", "getAppVersionName", "getDeviceLanguage", "getMaxInterstitialCloseButtonDelayMs", "", "getMaxInterstitialCloseButtonDelaySeconds", "", "getMfxBidEndpointUrl", "getOverride", "setting", "getSdkAdapterName", "getSdkAdapterVersion", "getSdkModuleName", "getSdkModuleVersion", "getTestCeltraIdForPlacement", "placementId", "getUserAgent", "getVideoClickthroughBehaviour", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "initSettings", "isExpiredAdReloading", "isLimitTrackingEnabled", "isSpoofMode", "isTabletDevice", "isTestMode", "reset", "reset$mobilefuse_sdk_core_release", "setAdvertisingId", "value", "setExpiredAdReloading", "newValue", "setLimitTrackingEnabled", "setLogHttpRequests", "setMaxInterstitialCloseButtonDelayInSeconds", "seconds", "setOverride", "setSdkAdapter", "name", "version", "setSdkModule", "setSpoofMode", "setTestMode", "setVideoClickthroughBehaviour", "behaviour", "shouldLogHttpRequests", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseSettings {
    private static String advertisingId;
    private static String appName;
    private static PackageInfo appPackageInfo;

    @Nullable
    private static String appSetId;
    private static int appVersionCode;
    private static String appVersionName;

    @Nullable
    private static String deviceIp;
    private static boolean initialized;
    private static boolean logHttpRequests;
    private static boolean spoofMode;
    private static boolean tabletDevice;
    private static Map<String, String> testCeltraIdsMap;
    private static boolean testMode;
    private static boolean testModeOverrideFromServer;

    @NotNull
    public static final MobileFuseSettings INSTANCE = new MobileFuseSettings();
    private static boolean limitTrackingEnabled = true;
    private static final HashMap<MobileFuseSetting, String> overrideSettings = new HashMap<>();
    private static boolean expiredAdReloading = true;
    private static final String OMID_VERSION_UNKNOWN = "unknown";

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileFuseSetting.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MobileFuseSetting.IFA.ordinal()] = 1;
            iArr[MobileFuseSetting.LMT.ordinal()] = 2;
        }
    }

    static {
        SdkInitializer.ensureSdkSetup(true);
    }

    private MobileFuseSettings() {
    }

    public static final void clearMaxInterstitialCloseButtonDelay() {
    }

    public static final void configureTestCeltraIds(@NotNull Map<String, String> configMap) {
        Intrinsics.checkNotNullParameter(configMap, "configMap");
        testCeltraIdsMap = configMap;
    }

    @Nullable
    public static final String getAdvertisingId() {
        return advertisingId;
    }

    @Nullable
    public static final String getAppName() {
        return appName;
    }

    public static final int getAppVersionCode() {
        return appVersionCode;
    }

    @NotNull
    public static final String getAppVersionName() {
        String str = appVersionName;
        return str == null ? "" : str;
    }

    @Nullable
    public static final String getDeviceLanguage() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
            return locale.getLanguage();
        } catch (Throwable th2) {
            int i10 = MobileFuseSettings$getDeviceLanguage$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
                return null;
            }
            if (i10 == 2) {
                return null;
            }
            throw new lf.m();
        }
    }

    public static final long getMaxInterstitialCloseButtonDelayMs() {
        return 0L;
    }

    public static final float getMaxInterstitialCloseButtonDelaySeconds() {
        return 0.0f;
    }

    @NotNull
    public static final String getMfxBidEndpointUrl() {
        String override = getOverride(MobileFuseSetting.MFX_BID_ENDPOINT_URL);
        return override == null ? BuildConfig.MFX_BID_ENDPOINT_URL : override;
    }

    @Nullable
    public static final String getOverride(@NotNull MobileFuseSetting setting) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(setting, "setting");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            errorResult = new SuccessResult(overrideSettings.get(setting));
        } catch (Throwable th2) {
            if (MobileFuseSettings$getOverride$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = null;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new lf.m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    @Nullable
    public static final String getSdkAdapterName() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoName(UsageInfoType.ADAPTER);
    }

    @Nullable
    public static final String getSdkAdapterVersion() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoVersion(UsageInfoType.ADAPTER);
    }

    @Nullable
    public static final String getSdkModuleName() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoName(UsageInfoType.MODULE);
    }

    @Nullable
    public static final String getSdkModuleVersion() {
        return ExternalUsageInfo.INSTANCE.getUsageInfoVersion(UsageInfoType.MODULE);
    }

    @Nullable
    public static final String getTestCeltraIdForPlacement(@NotNull String placementId) {
        String str;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Map<String, String> map = testCeltraIdsMap;
            if (map != null && (str = map.get(placementId)) != null) {
                return str;
            }
            Map<String, String> map2 = testCeltraIdsMap;
            if (map2 == null) {
                return null;
            }
            String str2 = map2.get(ProxyConfig.MATCH_ALL_SCHEMES);
            if (str2 != null) {
                return str2;
            }
            return null;
        } catch (Throwable th2) {
            int i10 = MobileFuseSettings$getTestCeltraIdForPlacement$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
                return null;
            }
            if (i10 == 2) {
                return null;
            }
            throw new lf.m();
        }
    }

    @NotNull
    public static final String getUserAgent() {
        return UserAgentInfoKt.getUserAgentInfo().getUserAgent();
    }

    @NotNull
    public static final ClickthroughBehaviour getVideoClickthroughBehaviour() {
        ClickthroughBehaviour clickthroughBehaviour = MobileFuseDefaults.DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR;
        Intrinsics.checkNotNullExpressionValue(clickthroughBehaviour, "MobileFuseDefaults.DEFAU…EO_CLICKTHROUGH_BEHAVIOUR");
        return clickthroughBehaviour;
    }

    public static final void initSettings() {
        String version;
        if (initialized) {
            return;
        }
        initialized = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            MraidAdRendererComponent.register();
            VastAdRendererComponent.register();
            StoryboardAdRenderComponent.INSTANCE.register();
            TelemetryManager.INSTANCE.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
            try {
                version = Omid.getVersion();
                if (version == null) {
                    version = OMID_VERSION_UNKNOWN;
                }
            } catch (Throwable unused) {
                version = OMID_VERSION_UNKNOWN;
            }
            TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
            companion.registerModule("com.iab.omid.library.mobilefuse", version);
            companion.registerModule(com.mobilefuse.sdk.common.BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
            VideoPlayerSettings.Companion companion2 = VideoPlayerSettings.INSTANCE;
            companion2.setSdkName("MobileFuse Ads");
            String sdkVersion = MobileFuse.getSdkVersion();
            Intrinsics.checkNotNullExpressionValue(sdkVersion, "MobileFuse.getSdkVersion()");
            companion2.setSdkVersion(sdkVersion);
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            appName = Utils.getApplicationName(globalContext);
            tabletDevice = Utils.isDeviceTypeTablet();
            PackageInfo packageInfo = Utils.getPackageInfo(globalContext);
            appPackageInfo = packageInfo;
            appVersionName = packageInfo != null ? packageInfo.versionName : null;
            appVersionCode = packageInfo != null ? packageInfo.versionCode : 0;
        } catch (Throwable th2) {
            int i10 = MobileFuseSettings$initSettings$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }

    public static final boolean isExpiredAdReloading() {
        return expiredAdReloading;
    }

    public static final boolean isLimitTrackingEnabled() {
        return limitTrackingEnabled;
    }

    public static final boolean isSpoofMode() {
        return spoofMode;
    }

    public static final boolean isTabletDevice() {
        return tabletDevice;
    }

    public static final boolean isTestMode() {
        return testMode;
    }

    public static final boolean isTestModeOverrideFromServer() {
        return testModeOverrideFromServer;
    }

    public static /* synthetic */ void isTestModeOverrideFromServer$annotations() {
    }

    @VisibleForTesting
    public static final void reset$mobilefuse_sdk_core_release() {
        initialized = false;
        appName = null;
        tabletDevice = false;
        testMode = false;
        spoofMode = false;
        appPackageInfo = null;
        appVersionName = null;
        appVersionCode = 0;
        advertisingId = null;
        limitTrackingEnabled = false;
        overrideSettings.clear();
        testCeltraIdsMap = null;
        expiredAdReloading = true;
        logHttpRequests = false;
        appSetId = null;
        deviceIp = null;
        ExternalUsageInfo.INSTANCE.clear();
    }

    public static final void setAdvertisingId(@Nullable String value) throws Throwable {
        String override = getOverride(MobileFuseSetting.IFA);
        if (override != null) {
            value = override;
        }
        advertisingId = value;
        EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.IFA_CHANGED);
    }

    public static final void setExpiredAdReloading(boolean newValue) {
        expiredAdReloading = newValue;
    }

    public static final void setLimitTrackingEnabled(boolean newValue) {
        if (getOverride(MobileFuseSetting.LMT) != null) {
            MobileFuse.logDebug("Can't apply the lmt value because its override is active.");
        } else {
            limitTrackingEnabled = newValue;
            EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
        }
    }

    public static final void setLogHttpRequests(boolean newValue) {
        logHttpRequests = newValue;
        HttpRequestTracker.setEnabled(newValue);
    }

    public static final void setMaxInterstitialCloseButtonDelayInSeconds(float seconds) {
    }

    public static final void setOverride(@NotNull MobileFuseSetting setting, @NotNull String value) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(value, "value");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            overrideSettings.put(setting, value);
            int i10 = WhenMappings.$EnumSwitchMapping$0[setting.ordinal()];
            if (i10 == 1) {
                if (advertisingId != null) {
                    advertisingId = value;
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                limitTrackingEnabled = Boolean.parseBoolean(value);
                EidService.INSTANCE.getService().handleSdkStateChanged(IdentifierUpdateSignal.LMT_CHANGED);
            }
        } catch (Throwable th2) {
            int i11 = MobileFuseSettings$setOverride$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i11 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i11 != 2) {
                throw new lf.m();
            }
        }
    }

    public static final void setSdkAdapter(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        ExternalUsageInfo.INSTANCE.addUsageInfo(UsageInfoType.ADAPTER, name, version);
    }

    public static final void setSdkModule(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        ExternalUsageInfo.INSTANCE.addUsageInfo(UsageInfoType.MODULE, name, version);
    }

    public static final void setSpoofMode(boolean newValue) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.SPOOF_MODE, Boolean.valueOf(spoofMode), true));
            Telemetry.INSTANCE.onAction(TelemetryActionFactory.createWarnAction(MobileFuseSetting.class, TelemetryActionSdkEvents.SDK_SET_SPOOF_MODE_GLOBALLY.updateExtraMessageField(spoofMode ? "on" : "off"), arrayList));
        } catch (Throwable th2) {
            int i10 = MobileFuseSettings$setSpoofMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
        spoofMode = newValue;
    }

    public static final void setTestMode(boolean newValue) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new TelemetryActionParam(TelemetrySdkParamType.TEST_MODE, Boolean.valueOf(testMode), true));
            Telemetry.INSTANCE.onAction(TelemetryActionFactory.createWarnAction(MobileFuseSetting.class, TelemetryActionSdkEvents.SDK_SET_TEST_MODE_GLOBALLY.updateExtraMessageField(testMode ? "on" : "off"), arrayList));
        } catch (Throwable th2) {
            int i10 = MobileFuseSettings$setTestMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
        testMode = newValue;
    }

    public static final void setTestModeOverrideFromServer(boolean z10) {
        testModeOverrideFromServer = z10;
    }

    public static final void setVideoClickthroughBehaviour(@NotNull ClickthroughBehaviour behaviour) {
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
    }

    public static final boolean shouldLogHttpRequests() {
        return logHttpRequests;
    }

    @Nullable
    public final String getAppSetId$mobilefuse_sdk_core_release() {
        return appSetId;
    }

    @Nullable
    public final String getDeviceIp$mobilefuse_sdk_core_release() {
        return deviceIp;
    }

    public final void setAppSetId$mobilefuse_sdk_core_release(@Nullable String str) {
        appSetId = str;
    }

    public final void setDeviceIp$mobilefuse_sdk_core_release(@Nullable String str) {
        deviceIp = str;
    }
}
