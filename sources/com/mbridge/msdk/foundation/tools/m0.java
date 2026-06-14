package com.mbridge.msdk.foundation.tools;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.X1;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import net.pubnative.lite.sdk.models.Protocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class m0 extends v {
    private static int A = 0;
    private static String B = "";
    private static Object C = null;
    private static int D = 0;
    private static int E = 0;
    private static long F = -1;
    private static long G = -1;
    private static String H = "";
    private static String I = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f49020j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f49021k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f49022l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f49023m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f49024n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f49025o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f49026p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f49027q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f49028r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f49029s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile int f49030t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f49031u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f49032v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f49033w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f49034x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f49035y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f49036z = -1;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49037a;

        a(Context context) {
            this.f49037a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.f49037a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49038a;

        b(Context context) {
            this.f49038a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f49038a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(m0.f49035y)) {
                    return;
                }
                String unused2 = m0.f49035y = defaultUserAgent;
                m0.G(this.f49038a);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49039a;

        c(Context context) {
            this.f49039a = context;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f49039a.getSystemService("connectivity");
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f48614z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = m0.f49030t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = m0.f49030t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f49039a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = m0.f49030t = 0;
                    } else {
                        int unused4 = m0.f49030t = m0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = m0.f49030t = 0;
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = m0.f49034x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                ActivityManager activityManager = (ActivityManager) contextD.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                long unused = m0.G = memoryInfo.totalMem;
                long unused2 = m0.F = memoryInfo.availMem;
            }
        }
    }

    public static int A() {
        return f49036z;
    }

    public static int B() {
        if (D == 0) {
            D = v0.e();
        }
        return D;
    }

    public static void C(Context context) {
        try {
            v.e(context);
            o();
            q();
            t(context);
            B(context);
            A(context);
            F(context);
            n();
            s();
            p(context);
            w();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.f48614z = v0.b("android.permission.ACCESS_NETWORK_STATE", context);
            w(context);
            l();
            g.b();
            g();
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int D(Context context) {
        if (f49022l == -1) {
            f49022l = v0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f49022l;
    }

    public static int E() {
        if (f49024n == -1) {
            f49024n = v0.g() ? 1 : 0;
        }
        return f49024n;
    }

    private static void F() {
        String str = Build.VERSION.RELEASE;
        String strN = n();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strN)) {
            f49035y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mozilla/5.0 (Linux; Android ");
        sb2.append(str);
        sb2.append("; ");
        sb2.append(strN);
        sb2.append(" Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        f49035y = sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Context context) {
        try {
            y0.b(context, "mbridge_ua", f49035y);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (C == null) {
            C = v0.g(str);
        }
        return C;
    }

    public static int e(String str) {
        if (E == 0) {
            E = v0.f(str);
        }
        return E;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e10) {
            q0.b("SameDiTool", "", e10);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(f49035y)) {
            l(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f49035y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void k() {
        try {
            Object objA = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    g.a(str);
                }
                if (objA2 instanceof Integer) {
                    g.a(((Integer) objA2).intValue());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f49035y)) {
                    F();
                }
                z(context);
            } else if (TextUtils.isEmpty(f49035y)) {
                try {
                    f49035y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f49035y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f49035y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f49035y)) {
                        try {
                            f49035y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f49035y)) {
                        F();
                    }
                }
            } else {
                z(context);
            }
        } catch (Throwable th4) {
            q0.b("SameDiTool", th4.getMessage(), th4);
        }
        G(context);
        return f49035y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapV.get("height")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String n() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    private static void o() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static String p() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f49028r = "";
            } else if (TextUtils.isEmpty(f49028r)) {
                if (context == null) {
                    f49028r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f49028r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f49028r = "";
        }
        return f49028r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f49029s = "";
            } else if (TextUtils.isEmpty(f49029s)) {
                if (context == null) {
                    f49029s = "";
                    return f49028r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f49029s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f49029s = "";
        }
        return f49029s;
    }

    @SuppressLint({"MissingPermission"})
    public static int s(Context context) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f49030t;
            }
            if (contextD == null) {
                return f49030t;
            }
            if (f49030t != -1) {
                g(contextD);
                return f49030t;
            }
            f49030t = 0;
            return f49030t;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            f49030t = 0;
            return f49030t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return f49032v;
        }
        try {
            if (!TextUtils.isEmpty(f49032v)) {
                return f49032v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f49032v = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String u() {
        try {
            if (TextUtils.isEmpty(I)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                long jA = l0.a();
                String strJ = j(contextD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strJ);
                    jSONObject.put("2", String.valueOf(G));
                    jSONObject.put("3", String.valueOf(jA));
                    jSONObject.put(Protocol.VAST_1_0_WRAPPER, "");
                    jSONObject.put("5", "");
                } catch (Exception e10) {
                    q0.b("SameDiTool", e10.getMessage());
                }
                String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                I = strB;
                if (strB == null) {
                    I = "";
                }
            }
        } catch (Exception e11) {
            q0.b("SameDiTool", e11.getMessage());
        }
        return I;
    }

    public static HashMap v(Context context) {
        HashMap map = new HashMap();
        if (context != null) {
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                map.put("height", Integer.valueOf(displayMetrics.heightPixels));
                map.put("width", Integer.valueOf(displayMetrics.widthPixels));
                return map;
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage(), e10);
            }
        }
        return map;
    }

    public static String w() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f49034x)) {
                new Thread(new d()).start();
                return f49034x;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
        return f49034x;
    }

    public static String x(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return "";
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static String y(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(G) : "";
    }

    private static void z(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int A(Context context) {
        if (context == null) {
            return A;
        }
        int i10 = A;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            A = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 != 0 && i10 != 9) {
            try {
                return (!com.mbridge.msdk.foundation.same.a.f48614z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
        return "";
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f49021k)) {
                    f49021k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f49021k = "";
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f49021k = "";
        }
        return f49021k;
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
        return -1.0f;
    }

    public static int y() {
        try {
            if (!s0.a().a("v_a_d_p", false)) {
                return 0;
            }
            if (v0.i()) {
                f49025o = 1;
            } else if (v0.j()) {
                f49025o = 2;
            } else {
                f49025o = 0;
            }
        } catch (Exception e10) {
            f49025o = 0;
            q0.b("SameDiTool", e10.getMessage());
        }
        return f49025o;
    }

    public static String B(Context context) {
        if (context == null) {
            return B;
        }
        try {
            if (TextUtils.isEmpty(B)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                B = str;
                return str;
            }
            return B;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int D() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static boolean E(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static void d(int i10) {
        f49027q = i10;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(f49035y)) {
            try {
                f49035y = y0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapV.get("width")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f49026p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f49026p = languageTag;
                return languageTag;
            } catch (Throwable th2) {
                q0.a("SameDiTool", th2.getMessage());
                f49026p = "en-US";
            }
        }
        return f49026p;
    }

    public static int z() {
        try {
            if (v0.i()) {
                return 1;
            }
            return v0.j() ? 2 : 0;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage());
            return 0;
        }
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j10 = F;
            if (j10 > 0) {
                return Long.valueOf((j10 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return -1;
        }
    }

    public static int m() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(H)) {
            long j10 = G;
            if (j10 > 0) {
                H = Math.ceil(Float.valueOf(j10 / 1.0737418E9f).doubleValue()) + "GB";
            }
        }
        return H;
    }

    public static int F(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
        }
        if (!TextUtils.isEmpty(f49020j)) {
            return f49020j;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f49020j = context.getPackageManager().getInstallerPackageName(str);
            q0.a("SameDiTool", "PKGSource:" + f49020j);
        }
        return f49020j;
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int v() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j10 = G;
        if (j10 > 0) {
            return Long.valueOf((j10 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static int w(Context context) {
        if (context == null) {
            return f49033w;
        }
        if (f49033w == 0) {
            try {
                f49033w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
        return f49033w;
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return X1.f42014f;
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? X1.f42014f : str;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return X1.f42014f;
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f49031u)) {
            f49031u = r() + "";
        }
        return f49031u;
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String s() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return -1;
        }
    }

    public static int C() {
        return f49027q;
    }

    public static String l() {
        String str;
        if (!TextUtils.isEmpty(f49023m)) {
            return f49023m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th3) {
                    q0.b("SameDiTool", th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    q0.b("SameDiTool", th4.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = k0.b(string);
                }
                f49023m = string;
            } else {
                f49023m = "android";
            }
        } catch (Throwable th5) {
            q0.b("SameDiTool", th5.getMessage());
        }
        return f49023m;
    }
}
