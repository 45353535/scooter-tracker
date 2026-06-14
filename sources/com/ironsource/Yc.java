package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42181a = "com.google.market";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42182b = "com.android.vending";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42183c = "isInstalled";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f42184d = "Yc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f42185e = new a();

    class a extends ArrayList<String> {
        a() {
            add("com.android.vending");
            add(Yc.f42181a);
        }
    }

    class b extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42186a;

        b(boolean z10) throws JSONException {
            this.f42186a = z10;
            put("isInstalled", z10);
        }
    }

    private enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{Yc.f42181a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Map<String, c> f42192h = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f42195b;

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f42192h.put(str, cVar);
                }
            }
        }

        c(int i10, String[] strArr) {
            this.f42194a = i10;
            this.f42195b = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(f42192h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f42195b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f42194a;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f42185e);
    }

    public static String b(Context context) {
        Iterator<String> it = f42185e.iterator();
        while (it.hasNext()) {
            String strA = a(context, it.next());
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        return "";
    }

    private static ArrayList<String> c(Context context) {
        List<ApplicationInfo> listH = Ib.U().i().H(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listH) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer d(Context context) {
        JSONObject jSONObjectA = a(context, (ArrayList<String>) c.b());
        int iPow = 0;
        for (c cVar : c.values()) {
            String[] strArrD = cVar.d();
            int length = strArrD.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(strArrD[i10]);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (((double) iPow) + Math.pow(2.0d, r5.c() - 1));
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iPow);
    }

    public static boolean e(Context context) {
        JSONObject jSONObjectA = a(context);
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> arrayListC = c(context);
            for (String str : arrayList) {
                jSONObject.put(str, a(arrayListC.contains(str.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Log.d(f42184d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z10) throws JSONException {
        return new b(z10);
    }
}
