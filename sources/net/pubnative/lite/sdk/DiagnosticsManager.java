package net.pubnative.lite.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.analytics.ReportingEventCallback;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DiagnosticsManager implements ReportingEventCallback {
    private static final String ADMOB_MEDIATION_BANNER_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationBannerCustomEvent";
    private static final String ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationInterstitialCustomEvent";
    private static final String ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationLeaderboardCustomEvent";
    private static final String ADMOB_MEDIATION_MRECT_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationMRectCustomEvent";
    private static final String ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationNativeCustomEvent";
    private static final String ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS = "net.pubnative.hybid.adapters.admob.mediation.HyBidMediationRewardedVideoCustomEvent";
    private static final String FORMAT_BANNER_CLASS = "net.pubnative.lite.sdk.views.HyBidAdView";
    private static final String FORMAT_INTERSTITIAL_CLASS = "net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd";
    private static final String FORMAT_NATIVE_CLASS = "net.pubnative.lite.sdk.request.HyBidNativeAdRequest";
    private static final String FORMAT_REWARDED_CLASS = "net.pubnative.lite.sdk.rewarded.HyBidRewardedAd";
    private static final String GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPBannerCustomEvent";
    private static final String GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPInterstitialCustomEvent";
    private static final String GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPLeaderboardCustomEvent";
    private static final String GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS = "net.pubnative.lite.adapters.dfp.HyBidDFPMRectCustomEvent";
    private static final String TAG = "DiagnosticsManager";
    private final String googleAdsPackageId;

    public DiagnosticsManager(Context context, ReportingController reportingController) {
        if (context != null) {
            this.googleAdsPackageId = getGoogleAdsAppId(context);
        } else {
            this.googleAdsPackageId = "";
        }
        if (reportingController != null) {
            reportingController.addCallback(this);
        }
    }

    private boolean checkAvailableClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static synchronized String generatePlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        sb2.append("\nHyBid Placement Diagnostics Log:\n\n");
        if (jSONObject == null || jSONObject.length() == 0) {
        } else {
            try {
                sb2.append(jSONObject.toString(2));
                sb2.append("\n-----------------------------------------------------------------");
            } catch (JSONException e10) {
                Logger.e(TAG, "Error parsing placement params: ", e10);
                sb2.append("Placement data could not be loaded");
                sb2.append("\n-----------------------------------------------------------------");
            }
        }
        return sb2.toString();
    }

    private String getAvailableAdapters() {
        StringBuilder sb2 = new StringBuilder();
        if (checkAvailableClass(ADMOB_MEDIATION_BANNER_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_BANNER_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(ADMOB_MEDIATION_MRECT_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_MRECT_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_LEADERBOARD_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_INTERSTITIAL_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_REWARDED_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(ADMOB_MEDIATION_NATIVE_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(GAM_HEADER_BIDDING_BANNER_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(GAM_HEADER_BIDDING_MRECT_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(GAM_HEADER_BIDDING_LEADERBOARD_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS)) {
            sb2.append("\t");
            sb2.append(GAM_HEADER_BIDDING_INTERSTITIAL_ADAPTER_CLASS);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (sb2.length() == 0) {
            sb2.append("\t");
            sb2.append("No adapters available");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb2.toString();
    }

    private String getAvailableFormats() {
        StringBuilder sb2 = new StringBuilder();
        if (checkAvailableClass(FORMAT_BANNER_CLASS)) {
            sb2.append("\t");
            sb2.append("Banner");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(FORMAT_INTERSTITIAL_CLASS)) {
            sb2.append("\t");
            sb2.append("Interstitial");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(FORMAT_REWARDED_CLASS)) {
            sb2.append("\t");
            sb2.append("Rewarded");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (checkAvailableClass(FORMAT_NATIVE_CLASS)) {
            sb2.append("\t");
            sb2.append(LogConstants.KEY_NATIVE);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (sb2.length() == 0) {
            sb2.append("\t");
            sb2.append("No formats available");
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb2.toString();
    }

    private synchronized String getDiagnosticsLog(ReportingEvent reportingEvent) {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
            sb2.append("\nHyBid Diagnostics Log:\n\n");
            if (HyBid.isInitialized()) {
                sb2.append("Event: ");
                sb2.append(reportingEvent.getEventType());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Version: ");
                sb2.append(HyBid.getHyBidVersion());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Bundle Id: ");
                sb2.append(HyBid.getBundleId());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("App Token: ");
                sb2.append(HyBid.getAppToken());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Test Mode: ");
                sb2.append(HyBid.isTestMode() ? "true" : "false");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("COPPA: ");
                sb2.append(HyBid.isCoppaEnabled() ? "true" : "false");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Video Audio State: ");
                sb2.append(HyBid.getVideoAudioStatus().getStateName());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Location tracking (if permission): ");
                sb2.append(HyBid.isLocationTrackingEnabled() ? "true" : "false");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Location updates (if permission): ");
                sb2.append(HyBid.areLocationUpdatesEnabled() ? "true" : "false");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Time: ");
                sb2.append(System.currentTimeMillis());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Device OS: ");
                sb2.append("Android");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Device OS Version: ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Device Model: ");
                sb2.append(Build.MODEL);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("Device Manufacturer: ");
                sb2.append(Build.MANUFACTURER);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                if (!TextUtils.isEmpty(this.googleAdsPackageId)) {
                    sb2.append("Google Ads Application Id: ");
                    sb2.append(this.googleAdsPackageId);
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb2.append("Available formats:\n");
                sb2.append(getAvailableFormats());
                sb2.append("Available adapters:\n");
                sb2.append(getAvailableAdapters());
            } else {
                sb2.append("HyBid SDK has not been initialised");
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb2.append("\n-----------------------------------------------------------------");
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    private String getGoogleAdsAppId(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    private Boolean isDiagnosticsEnabled() {
        return HyBid.isDiagnosticsEnabled();
    }

    private void reportInitialisation(ReportingEvent reportingEvent) {
        printDiagnosticsLog(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.analytics.ReportingEventCallback
    public void onEvent(ReportingEvent reportingEvent) {
        if (reportingEvent == null || TextUtils.isEmpty(reportingEvent.getEventType()) || !reportingEvent.getEventType().equals("init") || !isDiagnosticsEnabled().booleanValue()) {
            return;
        }
        reportInitialisation(reportingEvent);
    }

    public void printDiagnosticsLog() {
        Logger.d(TAG, getDiagnosticsLog(null));
    }

    public void printPlacementDiagnosticsLog(Context context, JSONObject jSONObject) {
        if (HyBid.isDiagnosticsEnabled().booleanValue()) {
            Logger.d(TAG, generatePlacementDiagnosticsLog(context, jSONObject));
        }
    }

    public void printDiagnosticsLog(ReportingEvent reportingEvent) {
        Logger.d(TAG, getDiagnosticsLog(reportingEvent));
    }
}
