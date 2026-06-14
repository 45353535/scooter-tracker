package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b3 extends h3 {
    public b3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new b3(this, hVar);
    }

    public long r0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f9164a.a(r3.f10344y7)).longValue());
    }

    public long s0() {
        return n7.e(a("bg_color", (String) null));
    }

    public int t0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long u0() {
        return a("viewability_imp_delay_ms", ((Long) this.f9164a.a(x4.f11377n1)).longValue());
    }

    public int v0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean w0() {
        return r0() >= 0;
    }

    public boolean x0() {
        return a("proe", (Boolean) this.f9164a.a(r3.f10308a8)).booleanValue();
    }

    private b3(b3 b3Var, com.applovin.impl.mediation.h hVar) {
        super(b3Var.N(), b3Var.a(), b3Var.g(), hVar, b3Var.f9164a);
    }
}
