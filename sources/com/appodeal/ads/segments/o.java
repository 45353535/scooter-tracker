package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.jc;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.te;
import com.appodeal.ads.utils.Log;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f14492i = new o(-1, "default", new JSONObject());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f14493j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f14496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r[] f14497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14499f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.r f14500g = com.appodeal.ads.utils.session.r.f15109b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.appodeal.ads.storage.e0 f14501h = com.appodeal.ads.storage.e0.f14799b;

    public o(int i10, String str, JSONObject jSONObject) {
        this.f14494a = i10;
        this.f14495b = str;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        this.f14496c = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f14497d = g0.d(jSONObject);
        String strOptString = jSONObject.optString("match_rule", "");
        int[] iArrB = jc.b(2);
        int length = iArrB.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            int i13 = iArrB[i12];
            if (a.a(i13).equalsIgnoreCase(strOptString)) {
                i11 = i13;
                break;
            }
            i12++;
        }
        this.f14498e = i11;
    }

    public static o a(JSONObject jSONObject) {
        try {
            return new o(jSONObject.getInt("id"), jSONObject.getString("name"), jSONObject);
        } catch (Throwable th2) {
            Log.log(th2);
            return null;
        }
    }

    public static boolean e(AdType adType) {
        return adType == AdType.Interstitial || adType == AdType.Rewarded;
    }

    public final JSONArray b() {
        com.appodeal.ads.storage.e0 e0Var = this.f14501h;
        int i10 = this.f14494a;
        com.appodeal.ads.storage.a0 a0Var = e0Var.f14800a;
        a0Var.getClass();
        String string = a0Var.c(com.appodeal.ads.storage.d.f14789d).getString(String.valueOf(i10), "");
        return (string == null || string.isEmpty()) ? new JSONArray() : new JSONArray(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.content.Context r20, com.appodeal.ads.modules.common.internal.adtype.AdType r21, double r22) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.segments.o.c(android.content.Context, com.appodeal.ads.modules.common.internal.adtype.AdType, double):boolean");
    }

    public final boolean d(Context context, AdType adType, te teVar) {
        return c(context, adType, teVar != null ? teVar.f14907s : 0.0d);
    }

    public final String toString() {
        return this.f14496c.toString();
    }
}
