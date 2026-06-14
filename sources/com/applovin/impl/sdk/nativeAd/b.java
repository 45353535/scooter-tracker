package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b extends i5 implements a.InterfaceC0182a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f10796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f10797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f10799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f10800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f10802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f10804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f10805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o7 f10806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f10807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f10808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f10809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f10810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f10811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f10812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f10813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f10814y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f10815z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f10799j = "";
        this.f10800k = "";
        this.f10801l = "";
        this.f10802m = null;
        this.f10803n = "";
        this.f10804o = null;
        this.f10805p = null;
        this.f10807r = null;
        this.f10808s = null;
        this.f10809t = null;
        this.f10810u = null;
        this.f10811v = new ArrayList();
        this.f10812w = new ArrayList();
        this.f10813x = new ArrayList();
        this.f10814y = new ArrayList();
        this.f10815z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f10796g = jSONObject;
        this.f10797h = jSONObject2;
        this.f10798i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f10809t = Uri.parse(string);
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processed click destination URL: " + this.f10809t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, POBCoreNativeConstants.NATIVE_FALLBACK_URL, null);
        if (StringUtils.isValidString(string2)) {
            this.f10810u = Uri.parse(string2);
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processed click destination backup URL: " + this.f10810u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f10796g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f9071a.a(x4.O2)).booleanValue()) {
                try {
                    this.f10811v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed click tracking URLs: " + this.f10811v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f10813x.add(new e.a(this.f9071a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processed click tracking requests: " + this.f10813x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f10798i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f9071a.D().a(this.f9072b, "prepareNativeComponents", th2);
        }
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f10829b.b(appLovinNativeAdImpl);
            }
        });
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f10796g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f9071a.a(x4.N2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "VAST ad rendered successfully");
        }
        this.f10806q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f10796g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f10807r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f10796g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f10808s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f10796g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "No oRtb response provided: " + this.f10796g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, POBCoreNativeConstants.NATIVE_LINK, (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, POBCoreNativeConstants.NATIVE_ASSETS, null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to retrieve assets - failing ad load: " + this.f10796g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
            if (jSONObject4.has("title")) {
                this.f10799j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r32), "text", r32);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.a(this.f9072b, "Processed title: " + this.f10799j);
                }
            } else if (jSONObject4.has(POBCoreNativeConstants.NATIVE_LINK)) {
                a(JsonUtils.getJSONObject(jSONObject4, POBCoreNativeConstants.NATIVE_LINK, (JSONObject) r32));
            } else if (jSONObject4.has(POBCoreNativeConstants.NATIVE_IMAGE)) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, POBCoreNativeConstants.NATIVE_IMAGE, (JSONObject) r32);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                if (i12 == 1 || 3 == i11) {
                    this.f10804o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed icon URL: " + this.f10804o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f10805p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed main image URL: " + this.f10805p);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.k(this.f9072b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9073c.k(this.f9072b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9073c.a(this.f9072b, "Inferring main image from " + i13 + "x" + i14 + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        this.f10805p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9073c.a(this.f9072b, "Inferring icon image from " + i13 + "x" + i14 + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        this.f10804o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.k(this.f9072b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i16 == 1 || i15 == 8) {
                    this.f10800k = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed advertiser: " + this.f10800k);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f10801l = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed body: " + this.f10801l);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f10803n = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Processed cta: " + this.f10803n);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f10802m = Double.valueOf(dA);
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9073c.a(this.f9072b, "Processed star rating: " + this.f10802m);
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.a(this.f9072b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.k(this.f9072b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r32 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, POBCoreNativeConstants.NATIVE_TRACKER_JAVASCRIPT, null);
        if (StringUtils.isValidString(string7)) {
            this.f10812w.add(string7);
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER, null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f10814y.add(new e.a(this.f9071a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9073c.a(this.f9072b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ?? r62 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, POBCoreNativeConstants.NATIVE_EVENT_TRACKERS, null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r62);
                int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r62);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f10812w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new e.a(this.f9071a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f10814y.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9073c.a(this.f9072b, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f10815z.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9073c.a(this.f9072b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9073c.a(this.f9072b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9073c.a(this.f9072b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i19 == 555) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9073c.a(this.f9072b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f9073c.b(this.f9072b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.b(this.f9072b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r62 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Processing VAST video...");
        }
        this.f9071a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.f10796g), JsonUtils.shallowCopy(this.f10797h), this, this.f9071a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f10796g), JsonUtils.shallowCopy(this.f10797h), this.f9071a).setTitle(this.f10799j).setAdvertiser(this.f10800k).setBody(this.f10801l).setCallToAction(this.f10803n).setStarRating(this.f10802m).setIconUri(this.f10804o).setMainImageUri(this.f10805p).setPrivacyIconUri(this.f10807r).setVastAd(this.f10806q).setPrivacyDestinationUri(this.f10808s).setClickDestinationUri(this.f10809t).setClickDestinationBackupUri(this.f10810u).setClickTrackingUrls(this.f10811v).setJsTrackers(this.f10812w).setClickTrackingRequests(this.f10813x).setImpressionRequests(this.f10814y).setViewableMRC50Requests(this.f10815z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f9071a.q0().a((i5) new a(appLovinNativeAdImplBuild, this.f9071a, this), d6.b.CORE);
    }

    private void b(String str) {
        this.f10798i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0182a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
