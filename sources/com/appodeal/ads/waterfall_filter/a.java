package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.h2;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.te;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.z6;
import com.ironsource.N6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f15203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AdType f15204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15205g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15208j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15202d = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15206h = System.currentTimeMillis();

    public a(JSONObject jSONObject, AdType adType) {
        ArrayList arrayList = this.f15214a;
        arrayList.clear();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("precache");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getJSONObject(i10));
                } catch (Exception e10) {
                    Log.log(e10);
                }
            }
        }
        ArrayList arrayList2 = this.f15215b;
        arrayList2.clear();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                try {
                    arrayList2.add(jSONArrayOptJSONArray2.getJSONObject(i11));
                } catch (Exception e11) {
                    Log.log(e11);
                }
            }
        }
        this.f15216c.clear();
        Iterator it = this.f15214a.iterator();
        while (it.hasNext()) {
            try {
                ((JSONObject) it.next()).put("is_precache", true);
            } catch (JSONException e12) {
                Log.log(e12);
            }
        }
        this.f15216c.addAll(this.f15214a);
        this.f15216c.addAll(this.f15215b);
        this.f15204f = adType;
        this.f15205g = jSONObject.optString("main_id");
        this.f15208j = jSONObject.optLong("afd", 0L);
        this.f15207i = jSONObject.optLong("waterfall_cache_timeout", 0L);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(N6.E1);
        this.f15202d.add(new c(adType));
        this.f15202d.add(new b(jSONArrayOptJSONArray3));
        d dVar = new d();
        ArrayList arrayList3 = this.f15214a;
        ArrayList arrayList4 = dVar.f15214a;
        if (arrayList3 != null) {
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        ArrayList arrayList5 = this.f15215b;
        ArrayList arrayList6 = dVar.f15215b;
        if (arrayList5 != null) {
            arrayList6.clear();
            arrayList6.addAll(arrayList5);
        }
        ArrayList arrayList7 = dVar.f15216c;
        ArrayList arrayList8 = this.f15216c;
        if (arrayList8 != null) {
            arrayList7.clear();
            arrayList7.addAll(arrayList8);
        }
        this.f15203e = dVar;
    }

    public final void a(te teVar) {
        int i10;
        String str;
        int i11 = 3;
        int i12 = 2;
        d dVar = new d();
        ArrayList arrayList = this.f15214a;
        ArrayList arrayList2 = dVar.f15214a;
        if (arrayList != null) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = this.f15215b;
        ArrayList arrayList4 = dVar.f15215b;
        if (arrayList3 != null) {
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        ArrayList arrayList5 = dVar.f15216c;
        ArrayList arrayList6 = this.f15216c;
        if (arrayList6 != null) {
            arrayList5.clear();
            arrayList5.addAll(arrayList6);
        }
        this.f15203e = dVar;
        Iterator it = this.f15202d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this.f15203e.f15216c, teVar);
        }
        d dVar2 = this.f15203e;
        dVar2.f15214a.clear();
        dVar2.f15215b.clear();
        for (JSONObject jSONObject : dVar2.f15216c) {
            if (jSONObject.optBoolean("is_precache")) {
                dVar2.f15214a.add(jSONObject);
            } else {
                dVar2.f15215b.add(jSONObject);
            }
        }
        String displayName = this.f15204f.getDisplayName();
        d dVar3 = this.f15203e;
        ArrayList arrayList7 = dVar3.f15214a;
        ArrayList arrayList8 = dVar3.f15215b;
        if (h2.L() == Log.LogLevel.none) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z6.d(displayName) + " waterfall:");
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            ArrayList<JSONObject> arrayList9 = new ArrayList(arrayList7);
            sb2.append("\n  Precache:\n    ");
            for (JSONObject jSONObject2 : arrayList9) {
                if (jSONObject2.has("name")) {
                    Locale locale = Locale.ENGLISH;
                    String strD = z6.d(jSONObject2.optString("name"));
                    String strD2 = z6.d(jSONObject2.optString("status"));
                    Double dValueOf = Double.valueOf(jSONObject2.optDouble("ecpm", 0.0d));
                    Object[] objArr = new Object[i11];
                    objArr[0] = strD;
                    objArr[1] = strD2;
                    objArr[2] = dValueOf;
                    sb2.append(String.format(locale, "%s (%s), eCPM: %.2f; ", objArr));
                } else {
                    sb2.append(String.format(Locale.ENGLISH, "%s, eCPM: %.2f; ", z6.d(jSONObject2.optString("status")), Double.valueOf(jSONObject2.optDouble("ecpm", 0.0d))));
                    i11 = 3;
                }
            }
        }
        if (arrayList8 == null || arrayList8.isEmpty()) {
            sb2.append("\n  Ads: Empty");
        } else {
            ArrayList<JSONObject> arrayList10 = new ArrayList(arrayList8);
            sb2.append("\n  Ads:");
            int i13 = 100;
            int length = 100;
            for (JSONObject jSONObject3 : arrayList10) {
                if (length >= i13) {
                    sb2.append("\n    ");
                    length = 0;
                }
                if (jSONObject3.has("name")) {
                    Locale locale2 = Locale.ENGLISH;
                    String strD3 = z6.d(jSONObject3.optString("name"));
                    String strD4 = z6.d(jSONObject3.optString("status"));
                    Double dValueOf2 = Double.valueOf(jSONObject3.optDouble("ecpm", 0.0d));
                    int i14 = i12;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = strD3;
                    objArr2[1] = strD4;
                    objArr2[i14] = dValueOf2;
                    str = String.format(locale2, "%s (%s), eCPM: %.2f; ", objArr2);
                    i10 = i14;
                } else {
                    int i15 = i12;
                    Locale locale3 = Locale.ENGLISH;
                    String strD5 = z6.d(jSONObject3.optString("status"));
                    Double dValueOf3 = Double.valueOf(jSONObject3.optDouble("ecpm", 0.0d));
                    i10 = i15;
                    Object[] objArr3 = new Object[i10];
                    objArr3[0] = strD5;
                    objArr3[1] = dValueOf3;
                    str = String.format(locale3, "%s, eCPM: %.2f; ", objArr3);
                }
                sb2.append(str);
                length += str.length();
                i12 = i10;
                i13 = 100;
            }
        }
        Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_DUMP, sb2.toString());
    }
}
