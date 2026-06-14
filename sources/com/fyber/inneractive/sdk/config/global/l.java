package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4455ne;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20392a = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static l a(JSONObject jSONObject) throws JSONException {
        int i10 = 1;
        l lVar = new l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
        int i11 = 0;
        int i12 = 0;
        while (i12 < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
            q qVar = new q();
            qVar.f20395b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                qVar.f20394a = new o(jSONObjectOptJSONObject);
            } else {
                Object[] objArr = new Object[i10];
                objArr[i11] = qVar.f20395b;
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C4455ne.f44465d);
            if (jSONArrayOptJSONArray2 != null) {
                int i13 = i11;
                while (i13 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i13);
                    b bVar = new b();
                    bVar.f20366a = jSONObject3.getString("id");
                    bVar.f20367b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    int i14 = i11;
                    while (i14 < jSONArray.length()) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i14);
                        k kVar = new k();
                        int i15 = i10;
                        kVar.f20390b = jSONObject4.getString("id");
                        kVar.f20391c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            kVar.f20394a = new o(jSONObjectOptJSONObject2);
                        }
                        bVar.f20368c.add(kVar);
                        i14++;
                        i10 = i15 == true ? 1 : 0;
                    }
                    boolean z10 = i10;
                    b.a(bVar, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE), z10);
                    b.a(bVar, jSONObject3.optJSONObject(POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE), false);
                    qVar.f20396c.put(bVar.f20366a, bVar);
                    i13 += z10 ? 1 : 0;
                    i10 = z10 ? 1 : 0;
                    i11 = 0;
                }
            }
            int i16 = i11;
            int i17 = i10;
            lVar.f20392a.put(qVar.f20395b, qVar);
            i12 += i17 == true ? 1 : 0;
            i10 = i17 == true ? 1 : 0;
            i11 = i16;
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f20392a.equals(((l) obj).f20392a);
    }

    public final int hashCode() {
        return this.f20392a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f20392a.values());
    }
}
