package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.X3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f10269a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f10270b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f10271c = {15, 13};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f10272d = {20};

    public static boolean a(int i10) {
        return i10 < 200 || i10 >= 300;
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11376n0), str, kVar);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap();
        String str = (String) kVar.a(x4.f11340j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) kVar.a(x4.f11355k5)).booleanValue()) {
            map.put("api_key", kVar.i0());
        }
        map.putAll(n7.a(kVar.A().e()));
        return map;
    }

    public static String d(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11368m0), "4.0/ad", kVar);
    }

    public static String e(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11359l0), "4.0/ad", kVar);
    }

    public static Long f(com.applovin.impl.sdk.k kVar) {
        q0.d dVarA = kVar.w().a();
        if (dVarA == null) {
            return null;
        }
        double dC = n7.c(dVarA.b());
        double d10 = n7.d(dVarA.a());
        if (d10 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dC / d10));
    }

    public static String g(com.applovin.impl.sdk.k kVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.k.o());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return X3.f42018b;
            }
            if (type == 0) {
                return a(subtype, f10269a) ? "2g" : a(subtype, f10270b) ? X3.f42017a : a(subtype, f10271c) ? "4g" : a(subtype, f10272d) ? "5g" : DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY;
            }
        }
        return "unknown";
    }

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11384o0), str, kVar);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.b(z4.H, string);
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.k kVar) {
        kVar.t().a(jSONObject, z10);
    }

    public static void a(int i10, com.applovin.impl.sdk.k kVar) {
        if (i10 == 401) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "SDK key \"" + kVar.i0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i10 == 418) {
            kVar.o0().a(x4.f11295e, Boolean.TRUE);
            kVar.o0().e();
        } else if (i10 >= 400 && i10 < 500) {
            if (((Boolean) kVar.a(x4.f11313g)).booleanValue()) {
                kVar.T0();
            }
        } else if (i10 == -1 && ((Boolean) kVar.a(x4.f11313g)).booleanValue()) {
            kVar.T0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    y4 y4VarO0 = kVar.o0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    y4VarO0.a(jSONObject2);
                    y4VarO0.e();
                    String strB = x4.J6.b();
                    if (JsonUtils.valueExists(jSONObject2, strB)) {
                        a5.b(z4.J, JsonUtils.getBoolean(jSONObject2, strB, Boolean.FALSE), com.applovin.impl.sdk.k.o());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e10) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("ConnectionUtils", "Unable to parse settings out of API response", e10);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11359l0), ((Boolean) kVar.a(x4.f11326h3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (kVar != null) {
            return str + str2;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    a5.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) kVar.a(x4.F6)).booleanValue()) {
                a5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.k kVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(x4.f11264a3)).intValue()];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(x4.f11368m0), ((Boolean) kVar.a(x4.f11326h3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }
}
