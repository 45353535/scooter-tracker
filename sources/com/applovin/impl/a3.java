package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f8215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f8219f;

    public a3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, h hVar) {
        this.f8214a = str;
        this.f8215b = maxAdFormat;
        this.f8216c = map;
        this.f8217d = map2;
        this.f8218e = map3;
        this.f8219f = hVar;
    }

    protected boolean a(Object obj) {
        return obj instanceof a3;
    }

    public String b() {
        return this.f8214a;
    }

    public Map c() {
        return this.f8218e;
    }

    public Map d() {
        return this.f8217d;
    }

    public Map e() {
        return this.f8216c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        if (!a3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = a3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = a3Var.a();
        if (maxAdFormatA != null ? !maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 != null) {
            return false;
        }
        Map mapE = e();
        Map mapE2 = a3Var.e();
        if (mapE != null ? !mapE.equals(mapE2) : mapE2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = a3Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = a3Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        h hVarF = f();
        h hVarF2 = a3Var.f();
        return hVarF != null ? hVarF.equals(hVarF2) : hVarF2 == null;
    }

    public h f() {
        return this.f8219f;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatA == null ? 43 : maxAdFormatA.hashCode());
        Map mapE = e();
        int iHashCode3 = (iHashCode2 * 59) + (mapE == null ? 43 : mapE.hashCode());
        Map mapD = d();
        int iHashCode4 = (iHashCode3 * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int iHashCode5 = (iHashCode4 * 59) + (mapC == null ? 43 : mapC.hashCode());
        h hVarF = f();
        return (iHashCode5 * 59) + (hVarF != null ? hVarF.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + b() + ", adFormat=" + a() + ")";
    }

    public MaxAdFormat a() {
        return this.f8215b;
    }
}
