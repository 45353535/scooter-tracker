package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.appevents.t0;
import com.facebook.b0;
import com.facebook.internal.e;
import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.ironsource.C4257c4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19992b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Locale f20000j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f19991a = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f19993c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f19994d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f19995e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f19996f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f19997g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f19998h = "NoCarrier";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f19999i = "";

    public interface a {
        void a(JSONObject jSONObject);

        void b(com.facebook.i iVar);
    }

    private z() {
    }

    public static final JSONObject A() {
        if (e3.a.d(z.class)) {
            return null;
        }
        try {
            String string = com.facebook.s.m().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, z.class);
            return null;
        }
    }

    public static final String C(String str) {
        String strU = com.facebook.s.u();
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return StringsKt.W(strU, "facebook.com", "fb.gg", false, 4, null);
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return StringsKt.W(strU, "facebook.com", "instagram.com", false, 4, null);
            }
        }
        return strU;
    }

    private final GraphRequest D(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", K(z()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestY = GraphRequest.f19547n.y(null, null);
        graphRequestY.G(bundle);
        graphRequestY.F(b0.GET);
        return graphRequestY;
    }

    public static final void E(final String accessToken, final a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject jSONObjectA = u.a(accessToken);
        if (jSONObjectA != null) {
            callback.a(jSONObjectA);
            return;
        }
        GraphRequest.b bVar = new GraphRequest.b() { // from class: com.facebook.internal.x
            @Override // com.facebook.GraphRequest.b
            public final void a(com.facebook.a0 a0Var) {
                z.F(callback, accessToken, a0Var);
            }
        };
        GraphRequest graphRequestD = f19991a.D(accessToken);
        graphRequestD.C(bVar);
        graphRequestD.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(a callback, String accessToken, com.facebook.a0 response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            callback.b(response.b().getException());
            return;
        }
        JSONObject jSONObjectD = response.d();
        if (jSONObjectD == null) {
            throw new IllegalStateException("Required value was null.");
        }
        u.b(accessToken, jSONObjectD);
        callback.a(response.d());
    }

    public static final String H(Context context) {
        a0.g(context, POBCoreNativeConstants.NATIVE_CONTEXT);
        return com.facebook.s.n();
    }

    public static final Method I(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method J(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return I(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String K(String str) {
        return Intrinsics.areEqual(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale L() {
        try {
            return com.facebook.s.m().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object M(JSONObject jsonObject, String str, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new com.facebook.i("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, objOpt);
        return jSONObject;
    }

    private final String O(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        for (byte b10 : digest) {
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString(b10 & Ascii.SI));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    private final String P(String str, String str2) {
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return Q(str, bytes);
    }

    private final String Q(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return O(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object R(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean S() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            a1 a1Var = a1.f93282a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.s.n()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM = com.facebook.s.m();
            PackageManager packageManager = contextM.getPackageManager();
            String packageName = contextM.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean T(AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.INSTANCE.e());
    }

    public static final boolean U() {
        if (e3.a.d(z.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectA = A();
            if (jSONObjectA == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectA.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, z.class);
            return false;
        }
    }

    private final boolean V(Context context) {
        Method methodJ = J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodJ == null) {
            return false;
        }
        Object objR = R(null, methodJ, context);
        return (objR instanceof Integer) && Intrinsics.areEqual(objR, (Object) 0);
    }

    public static final boolean W(String str) {
        return str == null || str.length() == 0;
    }

    public static final List X(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jsonArray.getString(i10));
        }
        return arrayList;
    }

    public static final Map Y(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void Z(String str, Exception exc) {
        if (!com.facebook.s.B() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final void a0(String str, String str2) {
        if (!com.facebook.s.B() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final String b0(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNullExpressionValue(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return string;
    }

    private final void c(JSONObject jSONObject, com.facebook.internal.a aVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !V(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (aVar.k()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public static final String c0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f19991a.P("MD5", key);
    }

    private final void d(JSONObject jSONObject, com.facebook.internal.a aVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !V(context)) {
            jSONObject.put(C4257c4.f42799c, aVar.j());
        } else {
            if (aVar.k()) {
                return;
            }
            jSONObject.put(C4257c4.f42799c, aVar.j());
        }
    }

    public static final String d0(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                    i(bufferedInputStream);
                    i(inputStreamReader);
                    return string;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Throwable th5) {
            th2 = th5;
            i(bufferedInputStream);
            i(inputStreamReader);
            throw th2;
        }
    }

    public static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.areEqual(obj, obj2);
    }

    private final void e0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f19995e = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f19995e = k(f19995e);
        } catch (Exception unused) {
        }
    }

    public static final JSONObject f(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObjectA = u.a(accessToken);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        com.facebook.a0 a0VarK = f19991a.D(accessToken).k();
        if (a0VarK.b() != null) {
            return null;
        }
        return a0VarK.d();
    }

    private final int f0() {
        int i10 = f19992b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.y
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return z.g0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                f19992b = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f19992b <= 0) {
            f19992b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f19992b;
    }

    private final void g(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.split$default(str2, new String[]{C4240b4.j.f42668b}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) str3.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(str3.subSequence(i10, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            z zVar = f19991a;
            zVar.g(context, "facebook.com");
            zVar.g(context, ".facebook.com");
            zVar.g(context, "https://facebook.com");
            zVar.g(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    private final void h0(Context context) {
        if (Intrinsics.areEqual(f19998h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                f19998h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public static final void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final void i0(Context context) {
        if (f19993c == -1 || System.currentTimeMillis() - f19993c >= 1800000) {
            f19993c = System.currentTimeMillis();
            j0();
            h0(context);
            k0();
            e0();
        }
    }

    public static final String j(String str, String str2) {
        return W(str) ? str2 : str;
    }

    private final void j0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f19996f = displayName;
            String id2 = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id2, "tz.id");
            f19997g = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    private final long k(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    private final void k0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f19994d = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f19994d = k(f19994d);
        } catch (Exception unused) {
        }
    }

    public static final HashSet l(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final void l0(Runnable runnable) {
        try {
            com.facebook.s.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final List m(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jsonArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final void m0(JSONObject params, com.facebook.internal.a aVar, String str, boolean z10, Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        e.b bVar = e.b.ServiceUpdateCompliance;
        if (!e.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", com.facebook.s.l());
        if (aVar != null) {
            if (e.g(bVar)) {
                f19991a.c(params, aVar, str, context);
            }
            if (aVar.j() != null) {
                if (e.g(bVar)) {
                    f19991a.d(params, aVar, context);
                } else {
                    params.put(C4257c4.f42799c, aVar.j());
                }
            }
            if (aVar.h() != null) {
                params.put("advertiser_id", aVar.h());
                params.put("advertiser_tracking_enabled", !aVar.k());
            }
            if (!aVar.k()) {
                String strB = t0.b();
                if (strB.length() != 0) {
                    params.put("ud", strB);
                }
            }
            if (aVar.i() != null) {
                params.put("installer_package", aVar.i());
            }
        }
        v2.j jVarA = v2.j.f105705b.a();
        Object objE = jVarA != null ? jVarA.e("campaign_ids") : null;
        if (objE != null) {
            params.put("campaign_ids", objE);
        }
    }

    public static final Map n(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArrayNames.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = n((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    map.put(string, value);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    public static final void n0(JSONObject params, Context appContext) throws JSONException {
        Locale locale;
        int i10;
        Display display;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f19991a.i0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i12 = packageInfo.versionCode;
            f19999i = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(f19999i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f20000j = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f20000j;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f20000j;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb2.append(country != null ? country : "");
        jSONArray.put(sb2.toString());
        jSONArray.put(f19996f);
        jSONArray.put(f19998h);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
                d10 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i10 = i11;
            i11 = i13;
        } else {
            i10 = 0;
        }
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f19991a.f0());
        jSONArray.put(f19994d);
        jSONArray.put(f19995e);
        jSONArray.put(f19997g);
        params.put("extinfo", jSONArray.toString());
    }

    public static final Map o(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final String o0(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f19991a.Q(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, bytes);
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = bufferedInputStream2.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    i10 += i11;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String p0(String str) {
        if (str == null) {
            return null;
        }
        return f19991a.P("SHA-256", str);
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final boolean r() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    public static final String s(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String strO = com.facebook.s.o();
            if (strO != null) {
                return strO;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String u() {
        Context contextM = com.facebook.s.m();
        if (contextM == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final long x(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = com.facebook.s.m().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j10 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j10;
        } finally {
        }
    }

    public static final Locale y() {
        Locale localeL = L();
        if (localeL != null) {
            return localeL;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    private final String z() {
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        return (accessTokenE == null || accessTokenE.getGraphDomain() == null) ? "facebook" : accessTokenE.getGraphDomain();
    }

    public final String B() {
        return f19997g;
    }

    public final Locale G() {
        return f20000j;
    }

    public final String N() {
        return f19999i;
    }

    public final long v() {
        return f19995e;
    }

    public final String w() {
        return f19998h;
    }
}
