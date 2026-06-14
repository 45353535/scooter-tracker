package com.amazon.device.ads;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.N6;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class DtbAdRequestParamsBuilder {
    static final String bidderParamFormat = "{\"user\":{\"buyeruid\":\"%s\"}, \"imp\":[{\"displaymanager\":\"%s\",\"displaymanagerver\":\"%s\"}]}";
    private final String LOG_TAG = DtbAdRequestParamsBuilder.class.getSimpleName();
    private DTBAdNetworkInfo adNetworkInfo;

    /* JADX INFO: renamed from: com.amazon.device.ads.DtbAdRequestParamsBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    DtbAdRequestParamsBuilder(@NonNull DTBAdNetworkInfo dTBAdNetworkInfo) {
        this.adNetworkInfo = dTBAdNetworkInfo == null ? new DTBAdNetworkInfo(DTBAdNetwork.UNKNOWN) : dTBAdNetworkInfo;
    }

    private HashMap<String, Object> getCustomParams(Map<String, String> map) {
        HashMap<String, Object> map2 = new HashMap<>();
        if (map != null) {
            for (String str : map.keySet()) {
                map2.put(str, map.get(str));
            }
        }
        return map2;
    }

    private HashMap<String, Object> getSlotParams(List<DTBAdSize> list) {
        HashMap<String, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 1;
            for (DTBAdSize dTBAdSize : list) {
                JSONObject jSONObject = new JSONObject();
                if (dTBAdSize.isInterstitialAd()) {
                    jSONObject.put("sz", "interstitial");
                } else {
                    jSONObject.put("sz", dTBAdSize.getWidth() + "x" + dTBAdSize.getHeight());
                }
                jSONObject.put("slot", dTBAdSize.getSlotUUID());
                int i11 = i10 + 1;
                jSONObject.put(BigoAdapter.SLOT_ID, i10);
                JSONArray jSONArray2 = new JSONArray();
                if (AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdType[dTBAdSize.getDTBAdType().ordinal()] != 1) {
                    jSONArray2.put(AdType.DISPLAY.toString());
                } else {
                    jSONArray2.put(AdType.VIDEO.toString());
                }
                jSONObject.put("supportedMediaTypes", jSONArray2);
                if (dTBAdSize.getPubSettings() != null) {
                    jSONObject.put("ps", dTBAdSize.getPubSettings());
                }
                if (dTBAdSize.getSlotInfoExtra() != null) {
                    if (dTBAdSize.getSlotInfoExtra().getPos() != ApsSlotInfoExtra.PosOption.NO_VALUE) {
                        jSONObject.put(POBCTAOverlayData.KEY_CTA_POS, dTBAdSize.getSlotInfoExtra().getPos().getValue());
                    }
                    JSONObject videoSlotExtraJSON = dTBAdSize.getSlotInfoExtra().getVideoSlotExtraJSON();
                    if (videoSlotExtraJSON != null) {
                        jSONObject.put("video", videoSlotExtraJSON);
                    }
                }
                jSONArray.put(jSONObject);
                i10 = i11;
            }
            map.put("slots", jSONArray);
            return map;
        } catch (JSONException unused) {
            DtbLog.warn(this.LOG_TAG, "Error constructing slot parameters");
            return map;
        }
    }

    private String getValidSignal(ApsBidderAdapter apsBidderAdapter) {
        if (ApsPrivacyManager.INSTANCE.isSystemResourceAccessAllowed()) {
            String str = (String) apsBidderAdapter.getSignal().get("token");
            return DtbCommonUtils.isNullOrEmpty(str) ? "" : str;
        }
        ApsLog.d(this.LOG_TAG, "User Consent not granted");
        ApsMetrics.customEvent(((String) apsBidderAdapter.getSignal().get(DtbConstants.AMZN_BIDDER_NAME_KEY)) + "_TOKEN_P1_CONSENT", "NoConsent", null);
        return "";
    }

    void addCurrentEnvironmentToCustomAtt() {
        Map map = new HashMap();
        if (AdRegistration.getCustomDictionary() != null) {
            map = AdRegistration.getCustomDictionary();
        }
        if (map.containsKey("framework")) {
            return;
        }
        AdRegistration.addCustomAttribute("framework", DtbCommonUtils.getSDKFramework());
    }

    void addInAppNativeBrowserToCustomAtt(Context context) {
        if (DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.CUSTOM_TAB_FEATURE_ENABLED_FLAG, true)) {
            try {
                if (Build.VERSION.SDK_INT < 31 || !DtbCommonUtils.isClassAvailable("androidx.browser.customtabs.CustomTabsClient") || CustomTabsClient.getPackageName(context, Collections.EMPTY_LIST) == null) {
                    return;
                }
                AdRegistration.addCustomAttribute("inAppNativeBrowser", Boolean.TRUE.toString());
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to set inAppNativeBrowser in Bid Request", e10);
            }
        }
    }

    void addOmidPartnerNameAndPartnerVersionToBidRequest() {
        if (AdRegistration.getCustomDictionary() == null) {
            DtbLog.info(this.LOG_TAG, "Custom Dictionary Not found");
            return;
        }
        try {
            if (DtbCommonUtils.isNullOrEmpty(this.adNetworkInfo.getAdNetworkName()) || !DTBAdNetwork.valueOf(this.adNetworkInfo.getAdNetworkName()).isMediation()) {
                return;
            }
            AdRegistration.addCustomAttribute("omidPartnerName", DTBMetricsConfiguration.getClientConfigVal("partner_name", "Amazon1", "om_sdk_feature"));
            AdRegistration.addCustomAttribute("omidPartnerVersion", DtbCommonUtils.getSDKVersion());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to set OM SDK Partner Name and Version in Bid Request", e10);
        }
    }

    HashMap<String, Object> getBidderParams() {
        HashMap<String, Object> map = new HashMap<>();
        Map<String, ApsBidderAdapter> allAdapterInstances = ApsBidder.getApsBidderInstance().getAllAdapterInstances();
        if (DtbCommonUtils.isNullOrEmpty(allAdapterInstances)) {
            ApsLog.d(this.LOG_TAG, "No Bidder Adapter found");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ApsBidderAdapter> entry : allAdapterInstances.entrySet()) {
                String key = entry.getKey();
                ApsBidderAdapter value = entry.getValue();
                jSONObject.put(key, new JSONObject(String.format(bidderParamFormat, getValidSignal(value), (String) value.getSignal().get(DtbConstants.AMZN_BIDDER_NAME_KEY), value.getBidderSDKVersion())));
            }
            map.put(DtbConstants.AMZN_BIDDER_REQUEST_KEY, jSONObject);
            return map;
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Error during token collection from bidder Adapter", e10);
            return map;
        }
    }

    HashMap<String, Object> getCommonParams(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("isDTBMobile", "true");
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, AdRegistration.getAppKey());
        map.put("adsdk", DtbCommonUtils.getSDKVersion());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (!DtbCommonUtils.isNullOrEmpty(idfa)) {
            map.put("idfa", idfa);
        }
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut != null) {
            map.put("oo", Boolean.toString(optOut.booleanValue()));
        }
        JSONObject paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
        if (paramsJson != null) {
            map.put("dinfo", paramsJson);
        }
        String userAgentString = DtbDeviceData.getDeviceDataInstance().getUserAgentString();
        if (userAgentString != null) {
            map.put(N6.f41375d0, userAgentString);
        }
        map.put("pkg", DtbPackageNativeData.getPackageNativeDataInstance(context).getParamsJson());
        String adId = DtbSharedPreferences.getInstance().getAdId();
        if (adId != null) {
            map.put("ad-id", adId);
        }
        if (AdRegistration.isTestMode()) {
            map.put("isTest", "true");
        }
        if (AdRegistration.isLocationEnabled()) {
            String locationParam = new DtbGeoLocation().getLocationParam();
            if (!DtbCommonUtils.isNullOrEmpty(locationParam)) {
                map.put("geoloc", locationParam);
            }
        }
        return map;
    }

    HashMap<String, Object> getCustomAttributeParams(boolean z10, Context context) {
        HashMap<String, Object> map = new HashMap<>();
        JSONObject pJTemplate = DtbSharedPreferences.getInstance().getPJTemplate();
        JSONObject jSONObject = new JSONObject();
        addOmidPartnerNameAndPartnerVersionToBidRequest();
        addCurrentEnvironmentToCustomAtt();
        AdRegistration.addCustomAttribute("autoRefresh", String.valueOf(z10));
        addInAppNativeBrowserToCustomAtt(context);
        Iterator<String> itKeys = pJTemplate.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (pJTemplate.get(next) instanceof String) {
                    String str = AdRegistration.getCustomDictionary().get(pJTemplate.getString(next));
                    if (!DtbCommonUtils.isNullOrEmpty(str)) {
                        jSONObject.put(next, str);
                    }
                } else if (pJTemplate.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = pJTemplate.getJSONObject(next);
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (jSONObject2.get(next2) instanceof String) {
                            String str2 = AdRegistration.getCustomDictionary().get(jSONObject2.getString(next2));
                            if (!DtbCommonUtils.isNullOrEmpty(str2)) {
                                jSONObject3.put(next2, str2);
                            }
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject.put(next, jSONObject3);
                    }
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error when constructing custom attribute parameters", e10);
            }
        }
        if (!DtbCommonUtils.isNullOrEmpty(this.adNetworkInfo.getAdNetworkName())) {
            jSONObject.put(DtbConstants.MEDIATION_NAME, this.adNetworkInfo.getAdNetworkName());
        }
        if (jSONObject.length() > 0) {
            map.put("pj", jSONObject);
        }
        return map;
    }

    public HashMap<String, Object> getParams(Context context, List<DTBAdSize> list, Map<String, String> map, boolean z10) {
        HashMap<String, Object> map2 = new HashMap<>();
        map2.putAll(getCommonParams(context));
        map2.putAll(getSlotParams(list));
        map2.putAll(getCustomParams(map));
        map2.putAll(getCustomAttributeParams(z10, context));
        map2.putAll(getBidderParams());
        return map2;
    }
}
