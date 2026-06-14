package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.M7;
import com.ironsource.S3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Ee {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected static final String f40734a0 = "genericParams";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    protected static final String f40735a1 = "pixel";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    protected static final String f40736a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected static final String f40737b0 = "adUnits";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    protected static final String f40738b1 = "pixelEventsUrl";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    protected static final String f40739b2 = "compressToken";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected static final String f40740c0 = "providerLoadName";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    protected static final String f40741c1 = "pixelEventsEnabled";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    protected static final String f40742c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected static final String f40743d0 = "application";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    protected static final String f40744d1 = "placements";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    protected static final String f40745d2 = "instanceType";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected static final String f40746e0 = "rewardedVideo";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    protected static final String f40747e1 = "placementId";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    protected static final String f40748e2 = "maxAdsPerSession";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected static final String f40749f0 = "interstitial";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    protected static final String f40750f1 = "placementName";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    protected static final String f40751f2 = "reward";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected static final String f40752g0 = "banner";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    protected static final String f40753g1 = "delivery";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    protected static final String f40754g2 = "name";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected static final String f40755h0 = "nativeAd";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    protected static final String f40756h1 = "isDefault";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    protected static final String f40757h2 = "amount";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected static final String f40758i0 = "integration";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    protected static final String f40759i1 = "capping";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    protected static final String f40760i2 = "bannerRefreshRate";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected static final String f40761j0 = "loggers";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    protected static final String f40762j1 = "pacing";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    protected static final String f40763j2 = "protocolVersion";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected static final String f40764k0 = "segment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected static final String f40765k1 = "enabled";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    protected static final String f40766k2 = "adFormats";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f40767l = "appKey";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected static final String f40768l0 = "events";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    protected static final String f40769l1 = "maxImpressions";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    protected static final String f40770l2 = "adUnits";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f40771m = "userId";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected static final String f40772m0 = "crashReporter";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    protected static final String f40773m1 = "numOfSeconds";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    protected static final String f40774m2 = "rewarded";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f40775n = "response";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected static final String f40776n0 = "token";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    protected static final String f40777n1 = "unit";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f40778o = "error";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected static final String f40779o0 = "external";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    protected static final String f40780o1 = "virtualItemName";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f40781p = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected static final String f40782p0 = "mediationTypes";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected static final String f40783p1 = "virtualItemCount";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final boolean f40784q = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected static final String f40785q0 = "providerDefaultInstance";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    protected static final String f40786q1 = "uuidEnabled";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final boolean f40787r = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected static final String f40788r0 = "testSuite";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    protected static final String f40789r1 = "abt";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final boolean f40790s = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected static final String f40791s0 = "controllerUrl";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    protected static final String f40792s1 = "delayLoadFailure";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f40793t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    protected static final String f40794t0 = "AdQuality";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    protected static final String f40795t1 = "keysToInclude";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f40796u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    protected static final String f40797u0 = "initMode";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    protected static final String f40798u1 = "reporterURL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f40799v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected static final String f40800v0 = "adq_init_blob";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected static final String f40801v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f40802w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected static final String f40803w0 = "settings";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    protected static final String f40804w1 = "includeANR";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final boolean f40805x = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected static final String f40806x0 = "collectBiddingDataTimeout";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected static final String f40807x1 = "timeout";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final boolean f40808y = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected static final String f40809y0 = "providers";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected static final String f40810y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final boolean f40811z = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected static final String f40812z0 = "parallelInit";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    protected static final String f40813z1 = "adSourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4555td f40814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4589vd f40815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private S3 f40816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f40817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f40818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f40819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f40820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f40821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private M7.a f40822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private N5 f40824k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40829a;

        a(String str) {
            this.f40829a = str;
        }

        public String b() {
            return this.f40829a;
        }
    }

    public Ee(Context context, String str, String str2, String str3) {
        this.f40821h = a.NOT_SET;
        this.f40823j = false;
        this.f40820g = context;
        this.f40822i = Ib.O().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f40819f = new JSONObject();
            } else {
                this.f40819f = new JSONObject(str3);
            }
            this.f40823j = o();
            t();
            r();
            s();
            this.f40817d = TextUtils.isEmpty(str) ? "" : str;
            this.f40818e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f40819f);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            a();
        }
    }

    public static a a(Ee ee2) {
        return ee2 != null ? ee2.i() : a.NOT_SET;
    }

    private void b(@NotNull JSONObject jSONObject) {
        this.f40824k = new N5(jSONObject.optJSONObject(C4455ne.f44465d));
    }

    @Nullable
    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C4324g3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f40756h1, false);
        C4300ed c4300edA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C4324g3 c4324g3 = new C4324g3(iOptInt, strOptString, zOptBoolean, c4300edA);
        if (c4300edA != null) {
            this.f40822i.b(this.f40820g, c4324g3, IronSource.a.BANNER);
        }
        return c4324g3;
    }

    private Yb f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f40756h1, false);
        C4300ed c4300edA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        Yb yb2 = new Yb(iOptInt, strOptString, zOptBoolean, c4300edA);
        if (c4300edA != null) {
            this.f40822i.b(this.f40820g, yb2, IronSource.a.NATIVE_AD);
        }
        return yb2;
    }

    private String m() {
        return this.f40823j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f40819f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f40819f, "configurations"), b());
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int iOptInt;
        try {
            iOptInt = this.f40819f.optInt(f40763j2, 0);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r() {
        /*
            Method dump skipped, instruction units count: 2091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ee.r():void");
    }

    private void s() {
        try {
            JSONObject jSONObjectC = c(this.f40819f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, m());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.f40814a = new C4555td();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                    String strOptString = jSONArrayB.optString(i10);
                    this.f40814a.d(strOptString);
                    NetworkSettings networkSettingsB = C4589vd.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < jSONArrayB2.length(); i11++) {
                    String strOptString2 = jSONArrayB2.optString(i11);
                    this.f40814a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = C4589vd.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i11);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i12 = 0; i12 < jSONArrayB3.length(); i12++) {
                    String strOptString3 = jSONArrayB3.optString(i12);
                    this.f40814a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = C4589vd.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i12);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i13 = 0; i13 < jSONArrayB4.length(); i13++) {
                    String strOptString4 = jSONArrayB4.optString(i13);
                    this.f40814a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = C4589vd.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        try {
            this.f40815b = C4589vd.c();
            JSONObject jSONObjectC = c(this.f40819f, "providerSettings");
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectC2 = c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = c(jSONObjectC2, m());
                    JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                    if (this.f40815b.a(next)) {
                        Ib.U().q().a(new C4649z5(A5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = this.f40815b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (b(strOptString4)) {
                            jSONObject = jSONObjectC;
                            NetworkSettings networkSettingsB2 = this.f40815b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            it = itKeys;
                            NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectB), IronSourceUtils.b(new JSONObject(interstitialSettings2.toString()), jSONObjectB2), IronSourceUtils.b(new JSONObject(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(new JSONObject(nativeAdSettings2.toString()), jSONObjectB4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                            this.f40815b.a(networkSettings);
                        } else {
                            jSONObject = jSONObjectC;
                            it = itKeys;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            this.f40815b.a(networkSettings2);
                        }
                        jSONObjectC = jSONObject;
                        itKeys = it;
                    }
                }
            }
            this.f40815b.b();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Nullable
    public String e() {
        JSONObject jSONObject = this.f40819f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f40819f.optString("error");
    }

    public Y8 g() {
        return new Y8(this.f40817d, this.f40818e);
    }

    public List<IronSource.a> h() {
        C4555td c4555td;
        C4555td c4555td2;
        C4555td c4555td3;
        C4555td c4555td4;
        if (this.f40819f == null || this.f40816c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f40816c.f() != null && (c4555td4 = this.f40814a) != null && !c4555td4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.f40816c.d() != null && (c4555td3 = this.f40814a) != null && !c4555td3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.f40816c.c() != null && (c4555td2 = this.f40814a) != null && !c4555td2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.f40816c.e() != null && (c4555td = this.f40814a) != null && !c4555td.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.f40821h;
    }

    public JSONObject j() {
        return this.f40819f;
    }

    public C4555td k() {
        return this.f40814a;
    }

    public C4589vd l() {
        return this.f40815b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f40819f;
        return (jSONObject == null || jSONObject.has("error") || this.f40814a == null || this.f40815b == null || this.f40816c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f40817d);
            jSONObject.put("userId", this.f40818e);
            jSONObject.put("response", this.f40819f);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.f40823j ? "adFormats" : X0.f42007c;
    }

    private C4283dd g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f40756h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C4300ed c4300edA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        C4283dd c4283dd = new C4283dd(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c4300edA);
        if (c4300edA != null) {
            this.f40822i.b(this.f40820g, c4283dd, IronSource.a.REWARDED_VIDEO);
        }
        return c4283dd;
    }

    public S3 c() {
        return this.f40816c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f40823j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new U9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    private J9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f40756h1, false);
        C4300ed c4300edA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        J9 j92 = new J9(iOptInt, strOptString, zOptBoolean, c4300edA);
        if (c4300edA != null) {
            this.f40822i.b(this.f40820g, j92, IronSource.a.INTERSTITIAL);
        }
        return j92;
    }

    public void a(a aVar) {
        this.f40821h = aVar;
    }

    private void a() {
        this.f40819f = new JSONObject();
        this.f40817d = "";
        this.f40818e = "";
        this.f40814a = new C4555td();
        this.f40815b = C4589vd.c();
        this.f40816c = new S3.a().a();
        this.f40822i = Ib.O().x();
        b(this.f40819f);
    }

    private boolean b(String str) {
        return this.f40815b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    @NotNull
    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : new JSONObject();
    }

    public N5 f() {
        return this.f40824k;
    }

    private Context d() {
        return this.f40820g;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f40819f, "configurations"), "adFormats"), str), X0.f42007c);
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(f40756h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    @NotNull
    public static Rf b(@Nullable Ee ee2) {
        if (ee2 != null && ee2.q()) {
            return ee2.c().b().k();
        }
        return Rf.a();
    }

    private Ff h(JSONObject jSONObject) {
        Ff ff2 = new Ff();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            ff2.b(jSONObjectC.optString("controllerUrl"));
        }
        return ff2;
    }

    public Ee(Ee ee2) {
        this.f40821h = a.NOT_SET;
        this.f40823j = false;
        try {
            this.f40820g = ee2.d();
            this.f40819f = new JSONObject(ee2.f40819f.toString());
            this.f40817d = ee2.f40817d;
            this.f40818e = ee2.f40818e;
            this.f40823j = ee2.f40823j;
            this.f40814a = ee2.k();
            this.f40815b = ee2.l();
            this.f40816c = ee2.c();
            this.f40821h = ee2.i();
            this.f40822i = Ib.O().x();
            b(this.f40819f);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            a();
        }
    }

    private G1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                iArr5[i10] = jSONArrayOptJSONArray.optInt(i10);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                iArr6[i11] = jSONArrayOptJSONArray2.optInt(i11);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                iArr7[i12] = jSONArrayOptJSONArray3.optInt(i12);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                iArr4[i13] = jSONArrayOptJSONArray4.optInt(i13);
            }
        }
        return new G1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z10) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i10 : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j10 : jOptLong;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r7
  0x0036: PHI (r7v3 com.ironsource.id) = (r7v1 com.ironsource.id), (r7v2 com.ironsource.id) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C4300ed a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.ed$a r1 = new com.ironsource.ed$a
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.id r7 = com.ironsource.EnumC4368id.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.id r7 = com.ironsource.EnumC4368id.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.ed r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ee.a(org.json.JSONObject):com.ironsource.ed");
    }
}
