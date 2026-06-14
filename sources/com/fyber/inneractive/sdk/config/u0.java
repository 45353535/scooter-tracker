package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f20501a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f20502b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f20503c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "pausePct", this.f20501a);
        c1.a(jSONObject, "playPct", this.f20502b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f20503c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        c1.a(jSONObject, com.taurusx.tax.f.z.f66061c, jSONArray);
        return jSONObject;
    }
}
