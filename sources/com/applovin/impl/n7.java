package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f9890a = {60, 60, 24, 7, 4, 12};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f9891b = {" second", " minute", " hour", " day", " week", " month"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f9892c = {"s", "m", "h", "d", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "mth"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final DecimalFormat f9893d = new DecimalFormat();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Random f9894e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f9895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f9896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f9897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Boolean f9898i;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    class b extends t4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9899a;

        b(String str) {
            this.f9899a = str;
        }

        @Override // com.applovin.impl.t4
        protected Map a() {
            return CollectionUtils.hashMap("name", "Utils:" + this.f9899a);
        }
    }

    public static double a(long j10) {
        return j10 / 1024.0d;
    }

    public static float b(float f10) {
        return f10 * 1000.0f;
    }

    public static double d(long j10) {
        return j10 / 1000.0d;
    }

    public static long e(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static String f(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static int g(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.o.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Exception thrown while getting memory state.", th2);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean j() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean k() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Unable to check Network Interfaces", th2);
            return false;
        }
    }

    public static boolean l() {
        Context contextO = com.applovin.impl.sdk.k.o();
        if (contextO != null) {
            return y.a(contextO).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean m(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.k.o();
        }
        if (context != null) {
            return y.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static int a(int i10, int i11) {
        return (i10 < 0 || i10 > 100) ? i11 : i10;
    }

    public static long b(long j10) {
        return j10 * 8;
    }

    public static void c() {
    }

    public static int d(int i10) {
        return i10 * 1024;
    }

    public static Boolean i(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f9898i;
        if (bool != null) {
            return bool;
        }
        try {
            String strA = y.a(context).a();
            String strC = c(context);
            if (strC == null) {
                return null;
            }
            if (strC.equals(strA)) {
                Boolean bool2 = Boolean.TRUE;
                f9898i = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(strA) && strC.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f9898i = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f9898i = bool4;
            return bool4;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.b("Utils", "Unable to determine if the current process is the main process", th2);
            return null;
        }
    }

    public static boolean j(Context context) {
        if (f9896g == null) {
            f9896g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f9896g.booleanValue();
    }

    public static void a() {
    }

    public static void b() {
    }

    public static int c(int i10) {
        return a(i10, 95);
    }

    public static int d(Context context) {
        WindowManager windowManagerF = f(context);
        if (windowManagerF == null) {
            return 0;
        }
        return windowManagerF.getDefaultDisplay().getRotation();
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Unable to get Android SDK codename", th2);
            return "";
        }
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() <= d(8)) {
            return;
        }
        com.applovin.impl.sdk.o.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + d(8) + " maximum)");
    }

    public static long c(float f10) {
        return a(b(f10));
    }

    public static WindowManager f(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StrictMode.setVmPolicy(vmPolicy);
        return windowManager;
    }

    public static String a(Map map, boolean z10) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                TreeMap treeMap = new TreeMap(new a());
                treeMap.putAll(map);
                map = treeMap;
            }
            for (Map.Entry entry : map.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(C4240b4.j.f42670c);
                }
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.contains(C4240b4.j.f42670c)) {
                        value = str.replace(C4240b4.j.f42670c, "%26");
                    }
                }
                sb2.append(entry.getKey());
                sb2.append(D5.T);
                sb2.append(value);
            }
            return sb2.toString();
        }
        return "";
    }

    public static double c(long j10) {
        return a(b(j10));
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Unable to get Android OS info", th2);
            return "";
        }
    }

    public static boolean h(Context context) {
        if (f9895f == null) {
            f9895f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f9895f.booleanValue();
    }

    public static String b(Class cls, String str) {
        try {
            Field fieldA = a(cls, str);
            fieldA.setAccessible(true);
            return (String) fieldA.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(com.applovin.impl.sdk.k kVar) {
        String str = kVar.n0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.k.o().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static byte[] d(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean e(com.applovin.impl.sdk.k kVar) {
        if (((Boolean) kVar.a(x4.f11289d2)).booleanValue()) {
            return kVar.n0().isMuted();
        }
        return ((Boolean) kVar.a(x4.f11271b2)).booleanValue();
    }

    public static com.applovin.impl.sdk.k f() {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            return kVar;
        }
        Context contextO = com.applovin.impl.sdk.k.o();
        if (contextO == null) {
            return null;
        }
        return AppLovinSdk.getInstance(contextO).a();
    }

    public static boolean g(Context context) {
        return y.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean k(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String strI0 = kVar.i0();
            String strI02 = appLovinAdBase.getSdk().i0();
            if (strI0.equals(strI02)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + strI02 + ", but is being rendered from sdk with key: " + strI0;
            com.applovin.impl.sdk.o.h("AppLovinAd", str);
            a(str, appLovinAdBase, "AppLovinAd", kVar);
        }
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static int g() {
        if (o0.b()) {
            return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        return 0;
    }

    public static String c(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static String c(Context context) {
        int iMyPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f9897h)) {
            return f9897h;
        }
        try {
            iMyPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.b("Utils", "Unable to determine process name", th2);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.o.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (iMyPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f9897h = str;
                return str;
            }
        }
        return null;
    }

    public static Context e(Context context) {
        return l(context) ? context : com.applovin.impl.sdk.k.o();
    }

    public static String b(Context context) {
        Point pointB = o0.b(context);
        int i10 = pointB.x;
        int i11 = pointB.y;
        int iD = d(context);
        if ((i10 > i11 && (iD == 0 || iD == 2)) || (i11 > i10 && (iD == 1 || iD == 3))) {
            return a(iD);
        }
        return b(iD);
    }

    public static String d(String str) {
        return a(str, str.split("\\.").length);
    }

    public static boolean d(com.applovin.impl.sdk.k kVar) {
        String str = kVar.n0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static Map a(Map map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "portrait";
        }
        if (i10 == 1) {
            return "landscape_right";
        }
        if (i10 == 2) {
            return "portrait_upside_down";
        }
        if (i10 != 3) {
            return "unknown";
        }
        return "landscape_left";
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    public static long a(com.applovin.impl.sdk.k kVar) {
        long jLongValue = ((Long) kVar.a(x4.H5)).longValue();
        long jLongValue2 = ((Long) kVar.a(x4.I5)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : jCurrentTimeMillis + (jLongValue - jLongValue2);
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    private static long b(String str) {
        if (str == null) {
            return 0L;
        }
        return new File(str).length();
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static boolean b(com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th2) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return false;
            }
            kVar.O().d("Utils", "Failed to wrap JSONObject with exception", th2);
            return false;
        }
    }

    private static long a(float f10) {
        return Math.round(f10);
    }

    public static boolean b(List list) {
        Context contextO = com.applovin.impl.sdk.k.o();
        if (contextO == null) {
            com.applovin.impl.sdk.o.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(contextO.getPackageName());
    }

    public static String a(long j10, boolean z10) {
        String str;
        String[] strArr = z10 ? f9891b : f9892c;
        long jCurrentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            long j11 = f9890a[i10];
            if (jCurrentTimeMillis < j11) {
                if (jCurrentTimeMillis <= 0) {
                    return z10 ? "just now" : "now";
                }
                String str2 = "";
                if (!z10 || jCurrentTimeMillis <= 1) {
                    str = "";
                } else {
                    str = "s";
                }
                if (z10) {
                    str2 = " ago";
                }
                return String.format("%d%s%s%s", Long.valueOf(jCurrentTimeMillis), strArr[i10], str, str2);
            }
            jCurrentTimeMillis /= j11;
        }
        return z10 ? "just now" : "now";
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    public static double a(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Failed to parse double from String: " + str, th2);
            return d10;
        }
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.k kVar) {
        List listC = kVar.c(x4.G0);
        String lastPathSegment = uri.getLastPathSegment();
        if (listC.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String strEncodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) kVar.a(x4.H0);
        int length = StringUtils.emptyIfNull(strEncodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        if (!StringUtils.isValidString(strEncodeUriString) || !StringUtils.isValidString(str)) {
            return strEncodeUriString;
        }
        return str + strEncodeUriString;
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb2.append(str);
            sb2.append("\"\n..FORMAT: \"");
            sb2.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb2.append("\"\n..SDK KEY: \"");
            sb2.append(kVar.i0());
            sb2.append("\"\n..PACKAGE NAME: \"");
            sb2.append(com.applovin.impl.sdk.k.o().getPackageName());
            sb2.append("\"\n..Reason: ");
            sb2.append(object);
            sb2.append("\n**************************************************\n");
            String string = sb2.toString();
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("AppLovinSdk", string);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        AppLovinAd appLovinAdDequeueAd = kVar.k().dequeueAd(cVar.getAdZone());
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd != null) {
            cVar.a(appLovinAdDequeueAd);
            ((AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(cVar);
            return appLovinAdDequeueAd;
        }
        return cVar.f();
    }

    public static u a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        return u.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, Reporting.Key.AD_SIZE, null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, Reporting.Key.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.k kVar) {
        return a(jSONObject, str, null, str2, null, false, kVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z10, kVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z10, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new e(str, null, map2, z10));
        }
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String strOptString = jSONObject.optString(next);
                        String strReplace = StringUtils.replace(next, map);
                        if (AppLovinSdkUtils.isValidString(strOptString)) {
                            strOptString = StringUtils.replace(strOptString, map);
                        }
                        arrayList.add(new e(strReplace, strOptString, map2, z10));
                    }
                } catch (Throwable th2) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("Utils", "Failed to create and add postback url.", th2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(com.applovin.impl.sdk.k kVar, String str) {
        String strI0 = kVar.i0();
        if (((Boolean) kVar.a(x4.f11455x)).booleanValue()) {
            if (strI0 == null || strI0.length() != 86) {
                a(TextUtils.isEmpty(strI0) ? "Empty SDK key" : "Invalid SDK key length", str, kVar);
            }
        }
    }

    private static void a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        a(str, (AppLovinAdBase) null, str2, kVar);
    }

    private static void a(String str, AppLovinAdBase appLovinAdBase, String str2, com.applovin.impl.sdk.k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sdkKey=");
        sb2.append(kVar.i0());
        if (appLovinAdBase != null) {
            sb2.append(",adSdkKey=");
            sb2.append(appLovinAdBase.getSdk().i0());
        }
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", sb2.toString(), map);
        CollectionUtils.putStringIfValid("error_message", str, map);
        kVar.D().a(d2.S0, str2, map);
    }

    public static Map a(Map map, com.applovin.impl.sdk.k kVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static String a(Context context, String str, com.applovin.impl.sdk.k kVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities.isEmpty()) {
                return null;
            }
            return listQueryIntentActivities.get(0).activityInfo.name;
        } catch (Throwable th2) {
            kVar.D().a(str, th2);
            return null;
        }
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "landscape_right";
        }
        if (i10 == 1) {
            return "portrait_upside_down";
        }
        if (i10 == 2) {
            return "landscape_left";
        }
        if (i10 != 3) {
            return "unknown";
        }
        return "portrait";
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.k kVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Utils", "Unable to close stream: " + closeable, th2);
                }
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.k kVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th2);
                }
            }
        }
    }

    public static void a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.vc
            @Override // java.lang.Runnable
            public final void run() {
                n7.a(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static String a(Object obj) {
        if (obj instanceof y2) {
            return ((y2) obj).Q();
        }
        if (w3.a(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        }
        return null;
    }

    public static List a(boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context) {
        if (bVar instanceof o7) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.l().keySet()).iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse((String) it.next());
            if (a(uri, kVar, context)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        Uri uriL0 = bVar.l0();
        if (z10 && uriL0 != null && a(uriL0, kVar, context)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("Utils", "Cached video missing: " + uriL0);
            }
            arrayList.add(uriL0);
        }
        return arrayList;
    }

    private static boolean a(Uri uri, com.applovin.impl.sdk.k kVar, Context context) {
        return !kVar.G().c(uri.getLastPathSegment(), context) || (((Boolean) kVar.a(x4.U5)).booleanValue() && (b(uri.getPath()) > 0L ? 1 : (b(uri.getPath()) == 0L ? 0 : -1)) == 0);
    }

    public static boolean a(List list, com.applovin.impl.sdk.ad.b bVar) {
        if (list.isEmpty()) {
            return false;
        }
        List listQ = bVar.Q();
        Map mapL = bVar.l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (listQ.contains((String) mapL.get(((Uri) it.next()).toString()))) {
                return true;
            }
        }
        return false;
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb2.append("\nFailed to load " + str + " from " + name + ":\n");
                sb2.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb2.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a("", sb2.toString(), context);
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static boolean a(double d10) {
        if (d10 >= 100.0d) {
            return true;
        }
        return d10 > 0.0d && ((double) f9894e.nextFloat()) < d10 / 100.0d;
    }

    public static byte[] a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(byte[] bArr, int i10) {
        int i11 = i10 + 8;
        if (bArr.length < i11) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j10 = 0;
        while (i10 < i11) {
            j10 |= (((long) bArr[i10]) & 255) << (i10 * 8);
            i10++;
        }
        return j10;
    }

    public static int a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(String str, int i10) {
        String[] strArrSplit = StringUtils.toDigitsOnlyVersionString(str).split("\\.");
        if (strArrSplit.length == i10) {
            return tc.a(".", strArrSplit);
        }
        if (strArrSplit.length > i10) {
            return uc.a(".", new ArrayList(Arrays.asList(strArrSplit)).subList(0, i10));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
        arrayList.addAll(Collections.nCopies(i10 - arrayList.size(), "0"));
        return uc.a(".", arrayList);
    }

    public static int a(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i10 = 0;
            while (i10 < iMax) {
                String str3 = i10 < strArrSplit.length ? strArrSplit[i10] : "0";
                String str4 = i10 < strArrSplit2.length ? strArrSplit2[i10] : "0";
                int i11 = Integer.parseInt(str3);
                int i12 = Integer.parseInt(str4);
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                i10++;
            }
            return 0;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Failed to process version string.", th2);
            return 0;
        }
    }

    public static WebView a(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (!z10) {
                return webView;
            }
            webView.setWebViewClient(new b(str));
            return webView;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("Utils", "Failed to initialize WebView for " + str + ".", th2);
            return null;
        }
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.k kVar) {
        if (activity == null) {
            activity = kVar.u0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.i0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static String a(int i10, Context context, com.applovin.impl.sdk.k kVar) {
        if (i10 == 0) {
            return "";
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e10) {
                if (kVar != null) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("Utils", "Opening raw resource file threw exception", e10);
                    }
                }
                return "";
            } finally {
                a(inputStreamOpenRawResource, kVar);
            }
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Utils", "Failed to retrieve resource " + i10, th2);
                }
            }
            return "";
        }
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        if (maxAdFormat == null || maxAdFormat2 == null) {
            return false;
        }
        if (maxAdFormat == maxAdFormat2) {
            return true;
        }
        if (maxAdFormat.isAdViewAd() && maxAdFormat2.isAdViewAd()) {
            return true;
        }
        return maxAdFormat.isFullscreenAd() && maxAdFormat2.isFullscreenAd();
    }

    public static boolean a(String str, com.applovin.impl.sdk.k kVar) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, kVar.c(x4.f11424t0));
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.b("Utils", "Unable to collect memory info.", th2);
            return null;
        }
    }

    public static String a(AppLovinSdkSettings appLovinSdkSettings) {
        String strEmptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(strEmptyIfNull)) {
            return null;
        }
        Map<String, String> mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(strEmptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(mapTryToStringMap)) {
            return null;
        }
        return mapTryToStringMap.get("UnityVersion");
    }

    public static void a(String str, int i10, int i11, r1 r1Var) {
        if (i10 > i11) {
            r1Var.a(d2.U0, str, CollectionUtils.hashMap("details", i10 + " Leaking Instances"));
        }
    }

    public static void a(float f10, long j10, com.applovin.impl.sdk.k kVar) {
        Vibrator vibrator = (Vibrator) com.applovin.impl.sdk.k.o().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("Utils", "Vibrating with intensity: " + f10 + " for duration: " + j10 + "ms");
            }
            if (o0.g()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j10, Math.max(1, Math.min(255, (int) (255.0f * f10)))));
            } else {
                vibrator.vibrate(j10);
            }
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("Utils", "Failed to vibrate", th2);
            }
            HashMap map = new HashMap();
            map.put("top_main_method", th2.toString());
            map.put("details", "intensity=" + f10 + ", duration=" + j10);
            kVar.D().a(d2.R0, "hapticsVibrate", map);
        }
    }

    public static List a(String str, List list, com.applovin.impl.sdk.k kVar) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null || CollectionUtils.isEmpty(arrayList)) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (StringUtils.containsIgnoreCase(line, str2)) {
                            arrayList2.add(str2);
                            it.remove();
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
            return arrayList2;
        } catch (Throwable th2) {
            kVar.D().b("Utils", "getStringsPresentInFileLines", th2);
            return arrayList2;
        }
    }

    public static PackageInfo a(Context context, int i10) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
