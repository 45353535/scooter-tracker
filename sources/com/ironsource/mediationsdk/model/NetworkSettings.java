package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C4462o4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44116r = "customNetwork";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44117s = "customNetworkPackage";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f44118t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f44121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f44122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f44123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f44124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f44125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f44127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f44129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f44135q;

    public NetworkSettings(String str) {
        this.f44119a = str;
        this.f44129k = str;
        this.f44120b = str;
        this.f44134p = str;
        this.f44135q = str;
        this.f44122d = new JSONObject();
        this.f44123e = new JSONObject();
        this.f44124f = new JSONObject();
        this.f44125g = new JSONObject();
        this.f44121c = new JSONObject();
        this.f44130l = -1;
        this.f44131m = -1;
        this.f44132n = -1;
        this.f44133o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f44127i;
    }

    public JSONObject getApplicationSettings() {
        return this.f44121c;
    }

    public int getBannerPriority() {
        return this.f44132n;
    }

    public JSONObject getBannerSettings() {
        return this.f44124f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f44121c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f44121c) != null) {
            return jSONObject5.optString(f44118t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f44122d) != null) {
            return jSONObject4.optString(f44118t);
        }
        if (aVar.equals(IronSource.a.INTERSTITIAL) && (jSONObject3 = this.f44123e) != null) {
            return jSONObject3.optString(f44118t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f44124f) != null) {
            return jSONObject2.optString(f44118t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f44125g) == null) {
            return null;
        }
        return jSONObject.optString(f44118t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f44121c;
        return jSONObject != null ? jSONObject.optString(f44117s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f44131m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f44123e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f44133o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f44125g;
    }

    public String getProviderDefaultInstance() {
        return this.f44134p;
    }

    public String getProviderInstanceName() {
        return this.f44129k;
    }

    public String getProviderName() {
        return this.f44119a;
    }

    public String getProviderNetworkKey() {
        return this.f44135q;
    }

    public String getProviderTypeForReflection() {
        return this.f44120b;
    }

    public int getRewardedVideoPriority() {
        return this.f44130l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f44122d;
    }

    public String getSubProviderId() {
        return this.f44126h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f44128j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f44127i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f44121c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f44132n = i10;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f44124f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f44131m = i10;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f44123e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f44128j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f44133o = i10;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f44125g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f44135q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f44130l = i10;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f44122d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f44126h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f44121c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f44124f.put(str, obj);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f44123e.put(str, obj);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f44125g.put(str, obj);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f44122d.put(str, obj);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f44119a = str;
        this.f44129k = str;
        this.f44120b = str2;
        this.f44134p = str3;
        this.f44135q = str4;
        this.f44122d = jSONObject2;
        this.f44123e = jSONObject3;
        this.f44124f = jSONObject4;
        this.f44125g = jSONObject5;
        this.f44121c = jSONObject;
        this.f44130l = -1;
        this.f44131m = -1;
        this.f44132n = -1;
        this.f44133o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f44119a = networkSettings.getProviderName();
        this.f44129k = networkSettings.getProviderName();
        this.f44120b = networkSettings.getProviderTypeForReflection();
        this.f44122d = networkSettings.getRewardedVideoSettings();
        this.f44123e = networkSettings.getInterstitialSettings();
        this.f44124f = networkSettings.getBannerSettings();
        this.f44125g = networkSettings.getNativeAdSettings();
        this.f44121c = networkSettings.getApplicationSettings();
        this.f44130l = networkSettings.getRewardedVideoPriority();
        this.f44131m = networkSettings.getInterstitialPriority();
        this.f44132n = networkSettings.getBannerPriority();
        this.f44133o = networkSettings.getNativeAdPriority();
        this.f44134p = networkSettings.getProviderDefaultInstance();
        this.f44135q = networkSettings.getProviderNetworkKey();
    }
}
