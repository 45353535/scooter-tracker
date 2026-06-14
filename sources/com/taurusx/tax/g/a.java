package com.taurusx.tax.g;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66072a = "dk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66073c = "av";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Context f66074f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66075g = "csv";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66076n = "dv";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66077o = "ek";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66078s = "ev";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66079t = "csk";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66080w = "a.json";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66081y = "ak";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66082z = "config";

    public static String a() {
        return z(f66074f, f66077o);
    }

    public static String c() {
        return z(f66074f, f66075g);
    }

    public static String n() {
        return z(f66074f, f66078s);
    }

    public static String o() {
        return z(f66074f, f66072a);
    }

    public static String s() {
        return z(f66074f, f66076n);
    }

    public static String w() {
        return z(f66074f, "av");
    }

    public static String y() {
        return z(f66074f, f66079t);
    }

    public static void z(Context context) {
        String strW;
        f66074f = context;
        try {
            JSONArray jSONArray = new JSONObject(y.z(context, f66080w)).getJSONArray("a");
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                iArr[i10] = jSONArray.getInt(i10);
            }
            if (length > 8) {
                byte[] bArr = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    bArr[i11] = (byte) iArr[i11];
                }
                strW = c.w(bArr);
            } else {
                strW = "";
            }
            JSONObject jSONObject = new JSONObject(strW);
            String strOptString = jSONObject.optString(f66081y, "");
            String strOptString2 = jSONObject.optString("av", "");
            String strOptString3 = jSONObject.optString(f66077o, "");
            String strOptString4 = jSONObject.optString(f66078s, "");
            String strOptString5 = jSONObject.optString(f66072a, "");
            String strOptString6 = jSONObject.optString(f66076n, "");
            String strOptString7 = jSONObject.optString(f66079t, "");
            String strOptString8 = jSONObject.optString(f66075g, "");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                b.z().z(context, b.f66086a, f66081y, strOptString);
                b.z().z(context, b.f66086a, "av", strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                b.z().z(context, b.f66086a, f66077o, strOptString3);
                b.z().z(context, b.f66086a, f66078s, strOptString4);
            }
            if (!TextUtils.isEmpty(strOptString5) && !TextUtils.isEmpty(strOptString6)) {
                b.z().z(context, b.f66086a, f66072a, strOptString5);
                b.z().z(context, b.f66086a, f66076n, strOptString6);
            }
            if (TextUtils.isEmpty(strOptString7) || TextUtils.isEmpty(strOptString8)) {
                return;
            }
            b.z().z(context, b.f66086a, f66079t, strOptString5);
            b.z().z(context, b.f66086a, f66075g, strOptString6);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String z() {
        return z(f66074f, f66081y);
    }

    public static String z(Context context, String str) {
        String strW = b.z().w(context, b.f66086a, str);
        if (!TextUtils.isEmpty(strW)) {
            return strW;
        }
        z(context);
        return b.z().w(context, b.f66086a, str);
    }

    public static byte[] z(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (z(str.charAt(i11 + 1)) | (z(str.charAt(i11)) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("length must be even!");
    }

    public static int z(char c10) {
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < '0' || c10 > '9') {
            throw new IllegalArgumentException("must be hex!");
        }
        return c10 - '0';
    }
}
