package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.purchase.ADJPConstants;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TreeMap f11197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f11199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f11200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11201e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f11202f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f11203g = DesugarCollections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f11197a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", BidMachine.NAME);
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f11199c = new ArrayList(treeMap.keySet());
        HashMap map = new HashMap();
        f11198b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.5.0.8.1");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.6.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    public static List a(com.applovin.impl.sdk.k kVar) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList(kVar.c(r3.f10320m7));
        if (!((Boolean) kVar.a(r3.f10322n7)).booleanValue()) {
            return arrayList;
        }
        synchronized (f11202f) {
            hashSet = new HashSet(f11201e.keySet());
        }
        arrayList.retainAll(hashSet);
        return arrayList;
    }

    public static JSONArray b(com.applovin.impl.sdk.k kVar) {
        synchronized (f11202f) {
            try {
                if (f11200d != null) {
                    d(kVar);
                    return f11200d;
                }
                f11200d = new JSONArray();
                for (String str : f11199c) {
                    MaxAdapter maxAdapterA = a(str, kVar);
                    if (maxAdapterA != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("name", f11197a.get(str));
                            jSONObject.put("class", str);
                            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, a(maxAdapterA));
                            jSONObject.put("version", maxAdapterA.getAdapterVersion());
                            jSONObject.put("is_supported", a(maxAdapterA, str));
                        } catch (Throwable unused) {
                        }
                        f11200d.put(jSONObject);
                        f11201e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                    }
                }
                return f11200d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void c(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        synchronized (f11202f) {
            try {
                if (StringUtils.isValidString(JsonUtils.getString(jSONObject, ADJPConstants.KEY_SDK_VERSION, ""))) {
                    return;
                }
                MaxAdapter maxAdapterA = a(str, kVar);
                if (maxAdapterA == null) {
                    return;
                }
                String strA = a(maxAdapterA);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                JsonUtils.putString(jSONObject, ADJPConstants.KEY_SDK_VERSION, strA);
                f11201e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void d(com.applovin.impl.sdk.k kVar) {
        synchronized (f11202f) {
            for (int i10 = 0; i10 < f11200d.length(); i10++) {
                try {
                    JSONObject jSONObject = JsonUtils.getJSONObject(f11200d, i10, (JSONObject) null);
                    String string = JsonUtils.getString(jSONObject, "class", "");
                    b(jSONObject, string, kVar);
                    c(jSONObject, string, kVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void e(com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayB = b(kVar);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayB, i10, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown") + " (" + JsonUtils.getString(jSONObject, "version", "unknown") + ")");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strJoin = StringUtils.join(", ", arrayList);
        String str = "Please update to the latest adapter versions. Incompatible adapter(s) found: " + strJoin;
        if (n7.c(kVar)) {
            throw new IllegalArgumentException(str);
        }
        com.applovin.impl.sdk.o.h("MediationUtils", str);
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", strJoin, map);
        kVar.D().d(d2.S0, map);
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th2);
            return "";
        }
    }

    public static MaxMediatedNetworkInfo a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f11202f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f11201e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "class", str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(kVar.w0().e());
        if (!((Boolean) kVar.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", "");
        map.put("{CUSTOM_DATA}", "");
        map.put("{CREATIVE_ID}", "");
        return map;
    }

    public static boolean a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f11198b.get(str);
        return TextUtils.isEmpty(str2) || n7.a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    private static void b(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        synchronized (f11202f) {
            try {
                Integer numA = kVar.S().a(str);
                if (numA == null) {
                    return;
                }
                JsonUtils.putInt(jSONObject, "initialization_status", numA.intValue());
                f11201e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static MaxAdapter a(String str, com.applovin.impl.sdk.k kVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("AppLovinSdk", "Failed to load: " + str, th2);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(kVar.y0());
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static AppLovinSdkUtils.Size b(int i10, MaxAdFormat maxAdFormat, Context context) {
        try {
            int i11 = AdSize.FULL_WIDTH;
            Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
            Method method2 = AdSize.class.getMethod("getWidth", null);
            Method method3 = AdSize.class.getMethod("getHeight", null);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i10));
            AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
            f11203g.put(Integer.valueOf(i10), size);
            return size;
        } catch (Throwable unused) {
            return maxAdFormat.getSize();
        }
    }

    public static boolean a(Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).getMediationServeId());
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        if (i10 < 0) {
            i10 = AppLovinSdkUtils.pxToDp(context, o0.a(context).x);
        }
        Map map = f11203g;
        if (map.containsKey(Integer.valueOf(i10))) {
            return (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i10));
        }
        if (Boolean.TRUE.equals((Boolean) a5.a(z4.J, Boolean.FALSE, context))) {
            return a(i10, context);
        }
        return b(i10, maxAdFormat, context);
    }

    public static AppLovinSdkUtils.Size a(int i10, Context context) {
        int iRound;
        if (i10 >= 600) {
            iRound = Math.round(i10 / 8.088889f);
        } else if (i10 > 450) {
            iRound = Math.round(i10 / 7.8f);
        } else {
            iRound = Math.round(i10 / 6.4f);
        }
        AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(i10, Math.max(50, Math.min(iRound, Math.min(90, Math.round(AppLovinSdkUtils.pxToDp(context, o0.b(context).y) * 0.15f)))));
        f11203g.put(Integer.valueOf(i10), size);
        return size;
    }

    public static boolean a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "code")) {
            return false;
        }
        kVar.D().a(d2.S0, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    public static Map a(y2 y2Var, com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(kVar.w0().e());
        if (!((Boolean) kVar.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", StringUtils.emptyIfNull(y2Var.getPlacement()));
        map.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(y2Var.e()));
        map.put("{CREATIVE_ID}", StringUtils.emptyIfNull(y2Var.getCreativeId()));
        return map;
    }
}
