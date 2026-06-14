package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.A1;
import com.ironsource.C4313f9;
import com.ironsource.C4462o4;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.K6;
import com.ironsource.Q9;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.ironsource.Yc;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.c;
import com.ironsource.mediationsdk.r;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class IronSourceUtils {
    private static int A = 1;
    private static AtomicBoolean B = new AtomicBoolean(false);
    private static String C = null;
    private static Boolean D = null;
    private static IronSourceUtils E = new IronSourceUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44312a = "default_is_events_formatter_type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44313b = "default_is_events_url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44314c = "default_is_non_connectivity_events";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44315d = "default_is_opt_in_events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44316e = "default_is_opt_out_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44317f = "default_is_trigger_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44318g = "default_rv_events_formatter_type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44319h = "default_rv_events_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44320i = "default_rv_non_connectivity_events";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44321j = "default_rv_opt_in_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44322k = "default_rv_opt_out_events";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44323l = "default_rv_trigger_events";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44324m = "default_pxl_events_url";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44325n = "default_pxl_trigger_events";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44326o = "default_app_opt_in_events";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44327p = "default_app_opt_out_events";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44328q = "default_app_events_url";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44329r = "default_app_trigger_events";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44330s = "default_app_events_formatter_type";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f44331t = "default_app_non_connectivity_events";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f44332u = "general_properties";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f44333v = "last_response";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44334w = "firstSessionTimestamp";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44335x = "providerPriority";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44336y = "9.1.0";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44337z = "Mediation_Shared_Preferences";

    public static String a(long j10, String str) {
        return h(String.format("%s%s%s", Long.valueOf(j10), r.m().n(), str));
    }

    public static IronSourceUtils b() {
        return E;
    }

    private static String c(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44312a : (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? f44318g : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44330s : "";
    }

    private static String d(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44314c : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f44320i : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44331t : "";
    }

    private static String e(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44315d : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f44321j : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44326o : "";
    }

    private static String f(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44316e : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f44322k : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44327p : "";
    }

    public static boolean g() {
        return A == 1;
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        HashMap map = new HashMap();
        try {
            Xa xaA = Ib.U().e().a();
            if (xaA != null) {
                for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
                    HashMap map2 = new HashMap();
                    map.put(adFormat, map2);
                    for (String str : xaA.a(adFormat)) {
                        if (!str.equals(A1.f40170e)) {
                            map2.put(str, new JSONObject());
                        }
                    }
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e10);
        }
        return map;
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.1.0";
    }

    public static String h(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            C4462o4.d().a(e10);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e10);
            return "";
        }
    }

    public static synchronized void i(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i10) {
        A = i10;
    }

    private static String b(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44313b : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f44319h : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? f44324m : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44328q : "";
    }

    private static String g(String str) {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f44317f : IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? f44323l : IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? f44325n : IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f44329r : "";
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return X3.f42018b;
            }
            return networkCapabilities.hasTransport(0) ? X3.f42023g : "none";
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.NATIVE.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static synchronized void c(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(StringUtils.COMMA);
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(f(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void d(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(StringUtils.COMMA);
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(g(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void e(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
            editorEdit.putString(b(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
        }
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void b(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(StringUtils.COMMA);
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(e(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static String f() {
        String strA = K6.a().a("userId");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static void a(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new c());
        thread.start();
    }

    public static boolean f(Context context) {
        return Yc.e(context);
    }

    public static synchronized void a(Context context, String str, int[] iArr) {
        String string;
        try {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
                if (iArr != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 : iArr) {
                        sb2.append(i10);
                        sb2.append(StringUtils.COMMA);
                    }
                    string = sb2.toString();
                } else {
                    string = null;
                }
                editorEdit.putString(d(str), string);
                editorEdit.apply();
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void e(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
        editorEdit.putString(f44333v, str);
        editorEdit.apply();
    }

    public static String e(Context context) {
        return context.getSharedPreferences(f44337z, 0).getString(f44333v, "");
    }

    public static synchronized int[] c(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f44337z, 0).getString(f(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static synchronized void d(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
            editorEdit.putString(c(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
        }
    }

    public static long e() {
        return System.currentTimeMillis();
    }

    public static synchronized String b(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f44337z, 0).getString(b(str), str2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
        }
        return str2;
    }

    public static synchronized String a(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f44337z, 0).getString(c(str), str2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
        }
        return str2;
    }

    public static synchronized int[] d(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f44337z, 0).getString(g(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static synchronized int[] b(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f44337z, 0).getString(e(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static String c(Context context, String str, String str2) {
        return context.getSharedPreferences(f44337z, 0).getString(str, str2);
    }

    public static synchronized int[] a(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            try {
                String string = context.getSharedPreferences(f44337z, 0).getString(d(str), null);
                if (!TextUtils.isEmpty(string)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                    ArrayList arrayList = new ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                    }
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iArr;
    }

    public static boolean c(Context context) {
        if (D == null) {
            D = Boolean.valueOf(!C4313f9.a(context));
        }
        return D.booleanValue();
    }

    public static String c() {
        return K6.a().a("userId");
    }

    public static JSONObject b(boolean z10) {
        return a(z10, false, 1);
    }

    public static synchronized String d() {
        try {
            if (B.compareAndSet(false, true)) {
                C = UUID.randomUUID().toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C;
    }

    public static void b(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public static Q9 d(Context context) {
        String str;
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        if (context == null) {
            return null;
        }
        String strB = r.m().b(context);
        if (TextUtils.isEmpty(strB)) {
            strB = interfaceC4634y7I.M(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new Q9(strB, str);
    }

    public static void b(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    public static JSONObject a(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, POBAdDescriptor.DYNAMIC_PRICE_BID);
                return jSONObject;
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
        }
        return jSONObject;
    }

    public static void b(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f44337z, 0).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    public static JSONObject a(String str, List<String> list, List<String> list2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i10 < list.size() && i11 < list2.size(); i11++) {
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i10++;
            }
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(StringUtils.COMMA, arrayList));
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            return jSONObject;
        }
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return map;
    }

    public static JSONObject a(boolean z10, boolean z11, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObject.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z11 && i10 != -1) {
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
                return jSONObject;
            }
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
        }
        return jSONObject;
    }

    public static boolean a(Context context, String str, boolean z10) {
        return context.getSharedPreferences(f44337z, 0).getBoolean(str, z10);
    }

    public static int a(Context context, String str, int i10) {
        return context.getSharedPreferences(f44337z, 0).getInt(str, i10);
    }

    public static String b(Context context) {
        if (Ib.U().i().a(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static long a(Context context, String str, long j10) {
        return context.getSharedPreferences(f44337z, 0).getLong(str, j10);
    }

    public static JSONObject a(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObject3.optJSONObject(next) != null) {
                jSONObject3.put(next, a(jSONObject3.getJSONObject(next), (JSONObject) obj));
            } else {
                jSONObject3.put(next, obj);
            }
        }
        return jSONObject3;
    }

    public static List<Pair<String, String>> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return arrayList;
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return "";
        }
    }
}
