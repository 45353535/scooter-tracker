package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBImpression {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f62776a;

    @Nullable
    protected POBRequest.AdPosition adPosition;

    @NonNull
    protected final String adUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBBanner f62777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBVideo f62778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBNative f62779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62782g;

    @Nullable
    protected String gpid;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62783h;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    protected final String f62784id;

    @Nullable
    protected String pmZoneId;

    @Nullable
    protected String testCreativeId;

    public POBImpression(@NonNull String str, @NonNull String str2) {
        this.f62782g = false;
        this.f62784id = str;
        this.adUnitId = str2;
    }

    public static boolean canEnableMRAIDAppStatus(@NonNull Context context) {
        if (POBUtils.requiresQueryAllPackagesPermission()) {
            return POBUtils.hasQueryAllPackagesPermission(context);
        }
        return true;
    }

    Map a() {
        return this.f62776a;
    }

    String b() {
        return this.pmZoneId;
    }

    @NonNull
    public POBRequest.AdPosition getAdPosition() {
        return this.adPosition;
    }

    @NonNull
    public String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public POBBanner getBanner() {
        return this.f62777b;
    }

    @Nullable
    protected String getCustomData() {
        Map mapA = a();
        if (mapA != null && !mapA.isEmpty()) {
            StringBuilder sb2 = null;
            for (String str : mapA.keySet()) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                } else {
                    sb2.append("|");
                }
                sb2.append(str);
                sb2.append(C4240b4.j.f42668b);
                List<String> list = (List) mapA.get(str);
                if (list != null) {
                    int i10 = 0;
                    for (String str2 : list) {
                        if (i10 > 0) {
                            sb2.append(StringUtils.COMMA);
                        }
                        sb2.append(str2);
                        i10++;
                    }
                }
            }
            if (sb2 != null) {
                return sb2.toString();
            }
        }
        return null;
    }

    @Nullable
    protected JSONObject getExtJson(@Nullable JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("keywords", jSONArray);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("pubmatic", jSONObject2);
                jSONObject.putOpt("bidder", jSONObject3);
            }
            if (!POBUtils.isNullOrEmpty(this.gpid)) {
                jSONObject.putOpt("gpid", this.gpid);
            } else if (!POBUtils.isNullOrEmpty(this.adUnitId)) {
                jSONObject.putOpt("gpid", this.adUnitId);
            }
            if (this.f62781f) {
                jSONObject.putOpt("reward", 1);
            }
            a(jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Ext Json.", new Object[0]);
            return null;
        }
    }

    @NonNull
    public String getId() {
        return this.f62784id;
    }

    @NonNull
    public JSONObject getImpressionJson() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f62784id);
        if (POBInstanceProvider.getSdkConfig().isUseInternalBrowser()) {
            jSONObject.put("clickbrowser", 0);
        } else {
            jSONObject.put("clickbrowser", 1);
        }
        jSONObject.put("displaymanager", "PubMatic_OpenWrap_SDK");
        jSONObject.put("displaymanagerver", "4.10.0");
        jSONObject.put("tagid", this.adUnitId);
        String strB = b();
        if (POBUtils.isNullOrEmpty(strB)) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            jSONArray.put(putKeyValueObject("pmZoneId", strB));
        }
        String testCreativeId = getTestCreativeId();
        if (!POBUtils.isNullOrEmpty(testCreativeId)) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(putKeyValueObject("testcrid", testCreativeId));
        }
        String customData = getCustomData();
        if (customData != null) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(putKeyValueObject("dctr", customData));
        }
        JSONObject extJson = getExtJson(jSONArray);
        if (extJson != null && extJson.length() > 0) {
            jSONObject.putOpt("ext", extJson);
        }
        jSONObject.put("secure", 1);
        POBBanner pOBBanner = this.f62777b;
        if (pOBBanner != null) {
            if (this.f62780e) {
                pOBBanner.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
            } else if (a(this.adPosition)) {
                this.f62777b.setAdPosition(this.adPosition);
            }
            POBBanner pOBBanner2 = this.f62777b;
            jSONObject.put("banner", pOBBanner2.getRTBJson(pOBBanner2.getSupportedAPIs(false), false));
        }
        POBVideo pOBVideo = this.f62778c;
        if (pOBVideo != null) {
            if (this.f62780e) {
                pOBVideo.setPosition(POBRequest.AdPosition.FULL_SCREEN);
            } else if (a(this.adPosition)) {
                this.f62778c.setPosition(this.adPosition);
            }
            jSONObject.put("video", this.f62778c.getRTBJson());
        }
        POBNative pOBNative = this.f62779d;
        if (pOBNative != null) {
            jSONObject.put("native", pOBNative.getRTBJson());
        }
        jSONObject.put("instl", this.f62780e ? 1 : 0);
        return jSONObject;
    }

    @Nullable
    public POBNative getNative() {
        return this.f62779d;
    }

    @Nullable
    public String getTestCreativeId() {
        return this.testCreativeId;
    }

    @Nullable
    public POBVideo getVideo() {
        return this.f62778c;
    }

    public boolean isCtaOverlayEnabled() {
        return this.f62782g;
    }

    public boolean isInterstitial() {
        return this.f62780e;
    }

    public boolean isMRAIDAppStatusEnabled() {
        return this.f62783h;
    }

    public boolean isRewardedAd() {
        return this.f62781f;
    }

    @NonNull
    protected JSONObject putKeyValueObject(@Nullable String str, @Nullable Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(C4240b4.i.W, str);
            jSONObject.putOpt("value", new JSONArray(objArr));
            return jSONObject;
        } catch (JSONException unused) {
            POBLog.warn("POBImpression", "Not able to generate Json with key/value pair.", new Object[0]);
            return jSONObject;
        }
    }

    public void setAdPosition(@NonNull POBRequest.AdPosition adPosition) {
        this.adPosition = adPosition;
    }

    public void setBanner(@Nullable POBBanner pOBBanner) {
        this.f62777b = pOBBanner;
    }

    public void setCtaOverlayEnabled(boolean z10) {
        this.f62782g = z10;
    }

    public void setCustomParam(@Nullable Map<String, List<String>> map) {
        this.f62776a = map;
    }

    public void setGpid(@NonNull String str) {
        this.gpid = str;
    }

    public void setInterstitial(boolean z10) {
        this.f62780e = z10;
    }

    public void setMRAIDAppStatusEnabled(boolean z10) {
        this.f62783h = z10;
    }

    public void setNative(@Nullable POBNative pOBNative) {
        this.f62779d = pOBNative;
    }

    @Deprecated
    public void setPMZoneId(@Nullable String str) {
        this.pmZoneId = str;
    }

    public void setTestCreativeId(@Nullable String str) {
        this.testCreativeId = str;
    }

    public void setVideo(@Nullable POBVideo pOBVideo) {
        this.f62778c = pOBVideo;
    }

    private boolean a(POBRequest.AdPosition adPosition) {
        return (adPosition == null || adPosition == POBRequest.AdPosition.UNKNOWN) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (isCtaOverlayEnabled()) {
                jSONObject2.putOpt("ctaoverlay", 1);
            }
            if (isMRAIDAppStatusEnabled()) {
                jSONObject2.putOpt("mraidappstatus", 1);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.putOpt("owsdk", jSONObject2);
            }
        } catch (JSONException unused) {
            POBLog.debug("POBImpression", "Not able to add owsdk parameters", new Object[0]);
        }
    }

    public POBImpression(@NonNull String str, @NonNull String str2, boolean z10, boolean z11) {
        this(str, str2);
        this.f62781f = z10;
        this.f62780e = z11;
    }
}
