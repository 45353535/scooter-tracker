package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.Fb;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBRequestBuilding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBRequestBuilder implements POBRequestBuilding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBRequest f62810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f62811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f62812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBLocationDetector f62813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBDeviceInfo f62814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBAppInfo f62815g;

    public POBRequestBuilder(@NonNull POBRequest pOBRequest, @NonNull String str, @NonNull Context context) {
        this.f62811c = context.getApplicationContext();
        this.f62809a = str;
        this.f62810b = pOBRequest;
        this.f62812d = Boolean.valueOf(POBUtils.isDebugBuild(context));
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("profileid", this.f62810b.getProfileId());
            if (this.f62812d.booleanValue() && this.f62810b.getVersionId() != null) {
                jSONObject2.put("versionid", this.f62810b.getVersionId());
            }
            jSONObject2.put("clientconfig", 1);
            jSONObject.put("wrapper", jSONObject2);
            if (this.f62810b.a()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("returnallbidstatus", true);
                jSONObject.put("prebid", jSONObject3);
                return jSONObject;
            }
        } catch (JSONException e10) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getExtObject() : " + e10.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    private String b() {
        String adServerUrl = this.f62810b.getAdServerUrl();
        if (adServerUrl == null) {
            adServerUrl = this.f62809a;
        }
        return this.f62810b.isDebugStateEnabled() ? POBUtils.buildUrlWithQueryParam(adServerUrl, "debug", "1") : adServerUrl;
    }

    private void c() {
        POBDeviceInfo pOBDeviceInfo = this.f62814f;
        if (pOBDeviceInfo != null) {
            pOBDeviceInfo.refreshAdvertisingIdInfo();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public POBHttpRequest build() {
        return prepareHttpRequest(b(), getBody().toString(), "2.5");
    }

    public JSONObject getAppJson(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            POBAppInfo pOBAppInfo = this.f62815g;
            if (pOBAppInfo != null) {
                POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper = POBCommonOrtbJsonHelper.INSTANCE;
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, "name", pOBAppInfo.getAppName());
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, "bundle", this.f62815g.getPackageName());
            }
            POBApplicationInfo applicationInfo = POBInstanceProvider.getSdkConfig().getApplicationInfo();
            if (applicationInfo != null) {
                POBCommonOrtbJsonHelper pOBCommonOrtbJsonHelper2 = POBCommonOrtbJsonHelper.INSTANCE;
                POBCommonOrtbJsonHelper.addParamToJson(jSONObject, C4240b4.j.D, applicationInfo.getDomain());
                if (applicationInfo.getStoreURL() != null) {
                    POBCommonOrtbJsonHelper.addParamToJson(jSONObject, "storeurl", applicationInfo.getStoreURL().toString());
                } else {
                    POBLog.warn("POBRequestBuilder", "Missing \"storeURL\" in the request. It is required for platform identification", new Object[0]);
                }
                Boolean boolIsPaid = applicationInfo.isPaid();
                if (boolIsPaid != null) {
                    jSONObject.put("paid", boolIsPaid.booleanValue() ? 1 : 0);
                }
                if (applicationInfo.getCategories() != null) {
                    jSONObject.put("cat", new JSONArray(applicationInfo.getCategories().split(StringUtils.COMMA)));
                }
                if (!POBUtils.isNullOrEmpty(applicationInfo.getKeywords())) {
                    jSONObject.put("keywords", applicationInfo.getKeywords());
                }
            }
            POBAppInfo pOBAppInfo2 = this.f62815g;
            if (pOBAppInfo2 != null) {
                jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, pOBAppInfo2.getAppVersion());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(Fb.f40908b, jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getAppJson() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public JSONObject getBody() {
        c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", UUID.randomUUID().toString());
            jSONObject.put("at", 1);
            jSONObject.put("imp", POBCommonOrtbJsonHelper.getImpressionJsonArray(this.f62810b));
            jSONObject.put("app", getAppJson(this.f62810b.getPubId()));
            jSONObject.put(C4240b4.i.G, POBCommonOrtbJsonHelper.getDeviceObject(this.f62814f, this.f62813e, this.f62811c));
            if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBHTMLMeasurement") != null) {
                jSONObject.put("source", POBCommonOrtbJsonHelper.getMeasurementJson());
            }
            JSONObject userJson = POBCommonOrtbJsonHelper.getUserJson(this.f62811c, this.f62810b.getPlacementType());
            if (userJson.length() > 0) {
                jSONObject.put("user", userJson);
            }
            if (this.f62810b.getTestMode() != null && this.f62810b.getTestMode().booleanValue()) {
                jSONObject.put("test", 1);
            }
            JSONObject regsJson = POBCommonOrtbJsonHelper.getRegsJson(this.f62811c);
            if (regsJson != null && regsJson.length() > 0) {
                jSONObject.put("regs", regsJson);
            }
            jSONObject.put("ext", a());
            return jSONObject;
        } catch (JSONException e10) {
            POBLog.error("POBRequestBuilder", "Exception occurred in getBody() : " + e10.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    public POBHttpRequest prepareHttpRequest(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        HashMap map = new HashMap();
        map.put("Content-Type", D5.L);
        if (str3 != null) {
            map.put("x-openrtb-version", str3);
        }
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.POST);
        pOBHttpRequest.setPostData(str2);
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setTimeout(this.f62810b.getNetworkTimeout() * 1000);
        pOBHttpRequest.setRequestTag(String.valueOf(hashCode()));
        pOBHttpRequest.setHeaders(map);
        return pOBHttpRequest;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setAppInfo(@Nullable POBAppInfo pOBAppInfo) {
        this.f62815g = pOBAppInfo;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setDeviceInfo(@Nullable POBDeviceInfo pOBDeviceInfo) {
        this.f62814f = pOBDeviceInfo;
    }

    @Override // com.pubmatic.sdk.common.base.POBRequestBuilding
    public void setLocationDetector(@Nullable POBLocationDetector pOBLocationDetector) {
        this.f62813e = pOBLocationDetector;
    }
}
