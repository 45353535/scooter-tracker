package net.pubnative.lite.sdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.analytics.CrashController;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.analytics.ReportingEventCallback;
import net.pubnative.lite.sdk.api.PNApiClient;
import net.pubnative.lite.sdk.api.SDKConfigAPiClient;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.db.OnDatabaseResetListener;
import net.pubnative.lite.sdk.location.HyBidLocationManager;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.PNAdRequestFactory;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.AdTopicsAPIManager;
import net.pubnative.lite.sdk.utils.AtomManager;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNApiUrlComposer;
import net.pubnative.lite.sdk.utils.sdkmanager.DisplayManager;
import net.pubnative.lite.sdk.utils.sdkmanager.SdkManager;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityManager;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;
import net.pubnative.lite.sdk.vpaid.VideoAdCache;
import net.pubnative.lite.sdk.vpaid.enums.AudioState;
import net.pubnative.lite.sdk.vpaid.utils.FileUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HyBid {
    public static final String HYBID_VERSION = "3.7.1";
    private static final String TAG = "HyBid";
    private static boolean isDiagnosticsEnabled = false;
    private static HyBidPreferences preferences = null;
    private static AdCache sAdCache = null;
    private static String sAge = null;

    @SuppressLint({"StaticFieldLeak"})
    private static PNApiClient sApiClient = null;
    private static String sAppToken = null;
    private static String sAppVersion = null;
    private static Application sApplication = null;
    private static boolean sAtomInitialized = false;
    private static BrowserManager sBrowserManager = null;
    private static String sBundleId = null;
    private static String sContentAgeRating = null;
    private static boolean sCoppaEnabled = false;
    private static CrashController sCrashController = null;
    private static String sDeveloperDomain = null;
    private static DeviceInfo sDeviceInfo = null;
    private static DiagnosticsManager sDiagnosticsManager = null;
    private static String sGender = null;
    private static String sIabCategory = null;
    private static String sIabSubcategory = null;
    private static boolean sInitialized = false;
    private static String sKeywords = null;

    @SuppressLint({"StaticFieldLeak"})
    private static HyBidLocationManager sLocationManager = null;
    private static boolean sLocationTrackingEnabled = true;
    private static boolean sLocationUpdatesEnabled = true;
    private static ReportingController sReportingController;
    private static boolean sReportingEnabled;

    @SuppressLint({"StaticFieldLeak"})
    private static SDKConfigAPiClient sSDKConfigAPiClient;

    @SuppressLint({"StaticFieldLeak"})
    private static SdkManager sSdkManager;
    private static boolean sTestMode;
    private static TopicManager sTopicManager;
    private static boolean sTopicsApiEnabled;

    @SuppressLint({"StaticFieldLeak"})
    private static UserDataManager sUserDataManager;
    private static VgiIdManager sVgiIdManager;
    private static VideoAdCache sVideoAdCache;
    private static Integer skipXmlResource = Integer.valueOf(R.mipmap.skip);
    private static Integer normalCloseXmlResource = -1;
    private static Integer pressedCloseXmlResource = -1;
    private static AudioState sVideoAudioState = AudioState.ON;

    public interface InitialisationListener {
        void onInitialisationFinished(boolean z10);
    }

    public static /* synthetic */ void a(Application application, InitialisationListener initialisationListener, Boolean bool) {
        validateAtomStart(bool, application);
        if (initialisationListener != null) {
            initialisationListener.onInitialisationFinished(true);
        }
    }

    public static void addReportingCallback(ReportingEventCallback reportingEventCallback) {
        getReportingController().addCallback(reportingEventCallback);
    }

    public static boolean areLocationUpdatesEnabled() {
        return sLocationUpdatesEnabled;
    }

    public static /* synthetic */ void c(String str) {
        if (getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("init");
        reportingEvent.setAppToken(str);
        getReportingController().reportEvent(reportingEvent);
    }

    private static String encodeSignalData(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    private static void fetchConfigs(String str, Application application, InitialisationListener initialisationListener) {
        fetchSDKConfig(application, str, initialisationListener);
    }

    private static synchronized void fetchSDKConfig(final Application application, String str, final InitialisationListener initialisationListener) {
        SDKConfigAPiClient sDKConfigAPiClient = sSDKConfigAPiClient;
        if (sDKConfigAPiClient != null) {
            sDKConfigAPiClient.fetchConfig(new SDKConfigAPiClient.AtomConfigListener() { // from class: net.pubnative.lite.sdk.d
                @Override // net.pubnative.lite.sdk.api.SDKConfigAPiClient.AtomConfigListener
                public final void onAtomValueFetched(Boolean bool) {
                    HyBid.a(application, initialisationListener, bool);
                }
            });
        }
    }

    public static AdCache getAdCache() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getAdCache()");
        }
        return sAdCache;
    }

    public static String getAge() {
        return sAge;
    }

    public static PNApiClient getApiClient() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getApiClient()");
        }
        return sApiClient;
    }

    public static synchronized String getAppToken() {
        try {
            if (!isInitialized()) {
                Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getAppToken()");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sAppToken;
    }

    public static String getAppVersion() {
        return sAppVersion;
    }

    public static BrowserManager getBrowserManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getBrowserManager()");
        }
        return sBrowserManager;
    }

    public static String getBundleId() {
        return sBundleId;
    }

    public static String getContentAgeRating() {
        return sContentAgeRating;
    }

    public static String getCustomRequestSignalData() {
        return getCustomRequestSignalData(null);
    }

    public static String getDeveloperDomain() {
        return sDeveloperDomain;
    }

    public static DeviceInfo getDeviceInfo() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getDeviceInfo()");
        }
        return sDeviceInfo;
    }

    public static DiagnosticsManager getDiagnosticsManager() {
        return sDiagnosticsManager;
    }

    public static String getEncodedCustomRequestSignalData() {
        return encodeSignalData(getCustomRequestSignalData());
    }

    public static String getGender() {
        return sGender;
    }

    public static String getHyBidVersion() {
        return "3.7.1";
    }

    public static String getIabCategory() {
        return sIabCategory;
    }

    public static String getKeywords() {
        return sKeywords;
    }

    public static HyBidLocationManager getLocationManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getLocationManager()");
        }
        return sLocationManager;
    }

    public static Integer getNormalCloseXmlResource() {
        return normalCloseXmlResource;
    }

    public static Integer getPressedCloseXmlResource() {
        return pressedCloseXmlResource;
    }

    public static ReportingController getReportingController() {
        if (sReportingController == null) {
            sReportingController = new ReportingController();
        }
        return sReportingController;
    }

    public static SDKConfigAPiClient getSDKConfigApiClient() {
        return sSDKConfigAPiClient;
    }

    public static String getSDKVersionInfo() {
        return getSdkManager().getDisplayManager().getDisplayManagerVersion(IntegrationType.IN_APP_BIDDING);
    }

    public static SdkManager getSdkManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getViewabilityManager()");
        }
        SdkManager sdkManager = sSdkManager;
        return sdkManager != null ? sdkManager : SdkManager.builder().displayManager(DisplayManager.builder().setIsWrapped(BuildConfig.IS_WRAPPED).setDisplayManagerName(BuildConfig.DISPLAY_MANAGER_NAME).build()).build();
    }

    public static Integer getSkipXmlResource() {
        return skipXmlResource;
    }

    public static TopicManager getTopicManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getTopicManager()");
        }
        return sTopicManager;
    }

    public static UserDataManager getUserDataManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getUserDataManager()");
        }
        return sUserDataManager;
    }

    public static VgiIdManager getVgiIdManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getVgiIdManager()");
        }
        return sVgiIdManager;
    }

    public static synchronized VideoAdCache getVideoAdCache() {
        try {
            if (!isInitialized()) {
                Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getVideoAdCache()");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sVideoAdCache;
    }

    @Deprecated
    public static AudioState getVideoAudioStatus() {
        return sVideoAudioState;
    }

    public static BaseViewabilityManager getViewabilityManager() {
        if (!isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before using getViewabilityManager()");
        }
        return getSdkManager().getVisibilityManager();
    }

    public static String getsIabSubcategory() {
        return sIabSubcategory;
    }

    private static boolean hasPackageName(String str) {
        return HyBid.class.getPackage() != null && HyBid.class.getPackage().getName().equalsIgnoreCase(str);
    }

    public static void initialize(String str, Application application) {
        initialize(str, application, null);
    }

    public static Boolean isAtomStarted() {
        return Boolean.valueOf(sAtomInitialized);
    }

    public static boolean isCoppaEnabled() {
        return sCoppaEnabled;
    }

    public static Boolean isDiagnosticsEnabled() {
        return Boolean.valueOf(isDiagnosticsEnabled);
    }

    public static boolean isInitialized() {
        return sInitialized;
    }

    public static boolean isLocationTrackingEnabled() {
        return sLocationTrackingEnabled;
    }

    public static Boolean isReportingEnabled() {
        return Boolean.valueOf(sReportingEnabled);
    }

    public static boolean isTestMode() {
        return sTestMode;
    }

    public static Boolean isTopicsApiEnabled() {
        return Boolean.valueOf(sTopicsApiEnabled);
    }

    public static boolean isViewabilityMeasurementActivated() {
        BaseViewabilityManager visibilityManager = getSdkManager().getVisibilityManager();
        return visibilityManager != null && visibilityManager.isViewabilityMeasurementActivated();
    }

    public static boolean removeReportingCallback(ReportingEventCallback reportingEventCallback) {
        return getReportingController().removeCallback(reportingEventCallback);
    }

    public static void reportException(Exception exc) {
        if (sCrashController == null || getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        getReportingController().reportEvent(sCrashController.formatException(exc));
    }

    public static void setAge(String str) {
        sAge = str;
    }

    public static synchronized void setAppToken(String str) {
        sAppToken = str;
    }

    public static void setAppVersion(String str) {
        sAppVersion = str;
    }

    public static void setAtomStarted(Boolean bool) {
        sAtomInitialized = bool.booleanValue();
    }

    public static void setCloseXmlResource(Integer num, Integer num2) {
        normalCloseXmlResource = num;
        pressedCloseXmlResource = num2;
    }

    public static void setContentAgeRating(String str) {
        sContentAgeRating = str;
    }

    public static void setCoppaEnabled(boolean z10) {
        sCoppaEnabled = z10;
    }

    public static void setDeveloperDomain(String str) {
        sDeveloperDomain = str;
    }

    public static void setDiagnosticsEnabled(Boolean bool) {
        isDiagnosticsEnabled = bool.booleanValue();
    }

    public static void setGender(String str) {
        sGender = str;
    }

    public static void setIabCategory(String str) {
        sIabCategory = str;
    }

    public static void setIabSubcategory(String str) {
        sIabSubcategory = str;
    }

    public static void setKeywords(String str) {
        sKeywords = str;
    }

    public static void setLocationTrackingEnabled(boolean z10) {
        sLocationTrackingEnabled = z10;
    }

    public static void setLocationUpdatesEnabled(boolean z10) {
        sLocationUpdatesEnabled = z10;
    }

    public static void setLogLevel(Logger.Level level) {
        Logger.setLogLevel(level);
    }

    public static void setReportingEnabled(Boolean bool) {
        sReportingEnabled = bool.booleanValue();
    }

    public static void setSDKConfigURL(String str) {
    }

    public static void setSdkManager(SdkManager sdkManager) {
        if (sdkManager == null || !hasPackageName("com.verve.ng.sdk")) {
            return;
        }
        sSdkManager = sdkManager;
    }

    public static void setSkipXmlResource(Integer num) {
        skipXmlResource = num;
    }

    public static void setTestMode(boolean z10) {
        sTestMode = z10;
    }

    public static void setTopicsApiEnabled(Boolean bool) {
        sTopicsApiEnabled = bool.booleanValue();
    }

    @Deprecated
    public static void setVideoAudioStatus(AudioState audioState) {
        sVideoAudioState = audioState;
    }

    public static void validateAtom() {
        fetchConfigs(sAppToken, sApplication, null);
    }

    private static void validateAtomStart(Boolean bool, Application application) {
        if (isAtomStarted().booleanValue() || bool == null || application == null || !bool.booleanValue()) {
            return;
        }
        AtomManager.initializeAtom(application.getApplicationContext());
    }

    public static String getCustomRequestSignalData(String str) {
        return getCustomRequestSignalData(null, str);
    }

    public static String getSDKVersionInfo(IntegrationType integrationType) {
        DisplayManager displayManager = getSdkManager().getDisplayManager();
        if (integrationType == null) {
            integrationType = IntegrationType.IN_APP_BIDDING;
        }
        return displayManager.getDisplayManagerVersion(integrationType);
    }

    public static void initialize(final String str, final Application application, InitialisationListener initialisationListener) {
        long jCurrentTimeMillis;
        Boolean boolIsTopicsAPIEnabled;
        sAppToken = str;
        sApplication = application;
        if (str == null || application == null) {
            initialisationListener.onInitialisationFinished(false);
        }
        try {
            jCurrentTimeMillis = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        HyBidPreferences hyBidPreferences = new HyBidPreferences(application.getApplicationContext());
        preferences = hyBidPreferences;
        hyBidPreferences.setAppFirstInstalledTime(String.valueOf(jCurrentTimeMillis));
        preferences.setSessionTimeStamp(System.currentTimeMillis(), new OnDatabaseResetListener() { // from class: net.pubnative.lite.sdk.b
            @Override // net.pubnative.lite.sdk.db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                new SessionImpressionPrefs(application.getApplicationContext()).nukePrefs();
            }
        }, HyBidPreferences.TIMESTAMP.NORMAL);
        sBundleId = application.getPackageName();
        sApiClient = new PNApiClient(application);
        FileUtils.initParentDirAsync(application.getApplicationContext());
        if (application.getSystemService("location") != null) {
            sLocationManager = new HyBidLocationManager(application);
            if (isLocationTrackingEnabled() && areLocationUpdatesEnabled()) {
                sLocationManager.startLocationUpdates();
            }
        }
        sUserDataManager = new UserDataManager(application.getApplicationContext());
        sAdCache = new AdCache();
        sVideoAdCache = new VideoAdCache();
        sBrowserManager = new BrowserManager();
        sVgiIdManager = new VgiIdManager(application.getApplicationContext());
        sDiagnosticsManager = new DiagnosticsManager(application.getApplicationContext(), getReportingController());
        if (hasPackageName(BuildConfig.LIBRARY_PACKAGE_NAME)) {
            sSdkManager = SdkManager.builder().visibilityManager(new HyBidViewabilityManager(application)).displayManager(DisplayManager.builder().setIsWrapped(BuildConfig.IS_WRAPPED).setDisplayManagerName(BuildConfig.DISPLAY_MANAGER_NAME).build()).build();
        }
        if (Build.VERSION.SDK_INT >= 33 && (boolIsTopicsAPIEnabled = AdTopicsAPIManager.isTopicsAPIEnabled(application.getApplicationContext())) != null && boolIsTopicsAPIEnabled.booleanValue()) {
            setTopicsApiEnabled(Boolean.TRUE);
            sTopicManager = new TopicManager(application.getApplicationContext());
        }
        if (sCrashController == null) {
            sCrashController = new CrashController();
        }
        if (sDeviceInfo == null) {
            DeviceInfo deviceInfo = new DeviceInfo(application.getApplicationContext());
            sDeviceInfo = deviceInfo;
            deviceInfo.initialize(new DeviceInfo.Listener() { // from class: net.pubnative.lite.sdk.c
                @Override // net.pubnative.lite.sdk.DeviceInfo.Listener
                public final void onInfoLoaded() {
                    HyBid.c(str);
                }
            });
        }
        if (sSDKConfigAPiClient == null) {
            SDKConfigAPiClient sDKConfigAPiClient = new SDKConfigAPiClient(application.getApplicationContext());
            sSDKConfigAPiClient = sDKConfigAPiClient;
            sDKConfigAPiClient.setAppToken(str);
        }
        fetchConfigs(str, application, initialisationListener);
        sInitialized = true;
    }

    public static String getCustomRequestSignalData(Context context, String str) {
        PNAdRequestFactory pNAdRequestFactory = new PNAdRequestFactory();
        if (isInitialized()) {
            return PNApiUrlComposer.getUrlQuery(getApiClient().getApiUrl(), (PNAdRequest) pNAdRequestFactory.buildRequest("", "", AdSize.SIZE_INTERSTITIAL, "", true, IntegrationType.IN_APP_BIDDING, str, 0, false));
        }
        if (context == null) {
            return "";
        }
        return PNApiUrlComposer.getUrlQuery(BuildConfig.BASE_URL, (PNAdRequest) pNAdRequestFactory.buildRequest(context, "", "", AdSize.SIZE_INTERSTITIAL, "", true, IntegrationType.IN_APP_BIDDING, str, 0, false));
    }

    public static String getEncodedCustomRequestSignalData(String str) {
        return encodeSignalData(getCustomRequestSignalData(str));
    }

    public static void reportException(Throwable th2) {
        if (sCrashController == null || getReportingController() == null || !isReportingEnabled().booleanValue()) {
            return;
        }
        getReportingController().reportEvent(sCrashController.formatException(th2));
    }

    public static String getEncodedCustomRequestSignalData(Context context, String str) {
        return encodeSignalData(getCustomRequestSignalData(context, str));
    }
}
