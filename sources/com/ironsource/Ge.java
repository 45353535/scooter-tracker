package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Ge {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    static String N = "";
    static String O = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40986a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f40987b = "?request=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f40988c = "platform";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f40989d = "applicationKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f40990e = "applicationUserId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f40991f = "sdkVersion";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f40992g = "pluginType";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f40993h = "pluginVersion";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f40994i = "plugin_fw_v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f40995j = "advId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f40996k = "auid";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f40997l = "isDemandOnly";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f40998m = "serr";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f40999n = "appVer";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f41000o = "osVer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f41001p = "devModel";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f41002q = "devMake";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f41003r = "connType";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f41004s = "rawConnType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f41005t = "mt";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f41006u = "fs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f41007v = "coppa";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f41008w = "dff";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f41009x = "browserUserAgent";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f41010y = "deviceLang";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f41011z = "bundleId";

    public static String a() {
        return N;
    }

    public static String b() {
        return O;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, List<Pair<String, String>> list, boolean z11) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z10) {
            arrayList.add(new Pair(G, "1"));
        }
        if (!IronSourceUtils.g()) {
            arrayList.add(new Pair(f40998m, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f40992g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f40993h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f40994i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(f40995j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String strB = B1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            arrayList.add(new Pair(f40999n, strB));
        }
        arrayList.add(new Pair(f41000o, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(f41002q, Build.MANUFACTURER));
        arrayList.add(new Pair(f41001p, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.c(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4432ma.b().c();
        if (concurrentHashMapC.containsKey("is_child_directed")) {
            arrayList.add(new Pair(f41007v, concurrentHashMapC.get("is_child_directed").get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f44107f)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f44107f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f44111j)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f44105d)) {
            String str7 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f44105d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                arrayList.add(new Pair(f41008w, "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f44106e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f44106e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.f44106e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            arrayList.add(new Pair(f41003r, strA));
        }
        String strD = Y3.d(context);
        if (!TextUtils.isEmpty(strD)) {
            arrayList.add(new Pair(f41004s, strD));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = interfaceC4634y7I.s();
        if (strS.length() != 0) {
            arrayList.add(new Pair(f41009x, strS));
        }
        try {
            str5 = interfaceC4634y7I.c(context) + TokenBuilder.TOKEN_DELIMITER + interfaceC4634y7I.A(context);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new Pair(f41010y, str5));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + X3.b(context)));
        arrayList.add(new Pair("mnc", "" + X3.c(context)));
        String strG = interfaceC4634y7I.G(context);
        if (!TextUtils.isEmpty(strG)) {
            arrayList.add(new Pair("icc", strG));
        }
        String strU = interfaceC4634y7I.u(context);
        if (!TextUtils.isEmpty(strU)) {
            arrayList.add(new Pair(D, strU));
        }
        String strD2 = interfaceC4634y7I.d();
        if (!TextUtils.isEmpty(strD2)) {
            arrayList.add(new Pair("tz", strD2));
        }
        arrayList.add(new Pair(F, "" + interfaceC4634y7I.m()));
        String strD3 = interfaceC4634y7I.d(context);
        if (!TextUtils.isEmpty(strD3)) {
            arrayList.add(new Pair("auid", strD3));
        }
        if (z11) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(N6.f41393j0, String.valueOf(C4371j0.a())));
        String strA2 = a(arrayList);
        N = strA2;
        return a(LevelPlay.getSdkVersion()) + URLEncoder.encode(K9.e(C4427m5.b().c(), strA2), "UTF-8");
    }

    private static void b(String str) {
        f40986a = str;
    }

    public static String a(String str, boolean z10, int i10) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z10)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return str + "&" + a(arrayList);
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    private static String a(String str) {
        return f40986a + str + f40987b;
    }
}
