package com.appodeal.ads.networking.binders;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f14056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final JSONObject f14060i;

    public j(String str, String str2, int i10, String placementName, Double d10, String str3, String str4, String str5, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f14052a = str;
        this.f14053b = str2;
        this.f14054c = i10;
        this.f14055d = placementName;
        this.f14056e = d10;
        this.f14057f = str3;
        this.f14058g = str4;
        this.f14059h = str5;
        this.f14060i = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f14052a, jVar.f14052a) && Intrinsics.areEqual(this.f14053b, jVar.f14053b) && this.f14054c == jVar.f14054c && Intrinsics.areEqual(this.f14055d, jVar.f14055d) && Intrinsics.areEqual((Object) this.f14056e, (Object) jVar.f14056e) && Intrinsics.areEqual(this.f14057f, jVar.f14057f) && Intrinsics.areEqual(this.f14058g, jVar.f14058g) && Intrinsics.areEqual(this.f14059h, jVar.f14059h) && Intrinsics.areEqual(this.f14060i, jVar.f14060i);
    }

    public final int hashCode() {
        String str = this.f14052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14053b;
        int iA = com.appodeal.ads.initializing.f.a(this.f14055d, (this.f14054c + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        Double d10 = this.f14056e;
        int iHashCode2 = (iA + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str3 = this.f14057f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14058g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14059h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        JSONObject jSONObject = this.f14060i;
        return iHashCode5 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        return "Revenue(unitName=" + this.f14052a + ", networkName=" + this.f14053b + ", placementId=" + this.f14054c + ", placementName=" + this.f14055d + ", revenue=" + this.f14056e + ", currency=" + this.f14057f + ", precision=" + this.f14058g + ", demandSource=" + this.f14059h + ", ext=" + this.f14060i + ")";
    }
}
