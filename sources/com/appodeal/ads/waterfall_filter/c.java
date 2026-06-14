package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.i0;
import com.appodeal.ads.segments.l0;
import com.appodeal.ads.segments.s0;
import com.appodeal.ads.te;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdType f15213a;

    public c(AdType adType) {
        this.f15213a = adType;
    }

    @Override // com.appodeal.ads.waterfall_filter.e
    public final void a(ArrayList arrayList, te teVar) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        if (arrayList == null) {
            Log.log(LogConstants.KEY_SDK, "ProcessWaterfall", "Waterfall JSON is null or empty");
            return;
        }
        i0 i0Var = s0.g().f14484b;
        AdType adType = this.f15213a;
        i0Var.getClass();
        try {
            String strA = l0.a(adType);
            try {
                jSONObjectOptJSONObject = i0Var.f14479a.optJSONObject("overridden_ecpm");
            } catch (Exception e10) {
                Log.log(e10);
            }
            if (jSONObjectOptJSONObject != null) {
                jSONObject = new JSONObject();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has(strA)) {
                        jSONObject.put(next, jSONObjectOptJSONObject2.optDouble(strA));
                    }
                }
            } else {
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = i0Var.f14479a.optJSONObject("price_floor");
            double dOptDouble = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optDouble(l0.a(adType), -1.0d) : -1.0d;
            HashSet hashSet = new HashSet();
            if (jSONObject != null) {
                Iterator<String> itKeys2 = jSONObject.keys();
                while (itKeys2.hasNext()) {
                    hashSet.add(itKeys2.next());
                }
            }
            i0Var.b(arrayList, adType);
            i0.d(arrayList, hashSet, jSONObject);
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((JSONObject) it.next()).optDouble("ecpm", 0.0d) < dOptDouble) {
                        it.remove();
                    }
                }
            } catch (Exception e11) {
                Log.log(e11);
            }
            i0.c(arrayList, hashSet);
        } catch (Exception e12) {
            Log.log(e12);
        }
    }
}
