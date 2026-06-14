package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vj1 f117485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f117487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f117488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f117489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f117490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f117491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f117492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f117493k;

    public wj1(String str, String str2, vj1 vj1Var, String str3, String str4, Float f10, int i10, int i11, int i12, String str5) {
        this.f117483a = str;
        this.f117484b = str2;
        this.f117485c = vj1Var;
        this.f117486d = str3;
        this.f117487e = str4;
        this.f117488f = f10;
        this.f117489g = i10;
        this.f117490h = i11;
        this.f117491i = i12;
        this.f117492j = str5;
        this.f117493k = Intrinsics.areEqual(str5, "VPAID");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj1)) {
            return false;
        }
        wj1 wj1Var = (wj1) obj;
        return Intrinsics.areEqual(this.f117483a, wj1Var.f117483a) && Intrinsics.areEqual(this.f117484b, wj1Var.f117484b) && this.f117485c == wj1Var.f117485c && Intrinsics.areEqual(this.f117486d, wj1Var.f117486d) && Intrinsics.areEqual(this.f117487e, wj1Var.f117487e) && Intrinsics.areEqual((Object) this.f117488f, (Object) wj1Var.f117488f) && this.f117489g == wj1Var.f117489g && this.f117490h == wj1Var.f117490h && this.f117491i == wj1Var.f117491i && Intrinsics.areEqual(this.f117492j, wj1Var.f117492j);
    }

    public final int hashCode() {
        int iHashCode = this.f117483a.hashCode() * 31;
        String str = this.f117484b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        vj1 vj1Var = this.f117485c;
        int iHashCode3 = (iHashCode2 + (vj1Var == null ? 0 : vj1Var.hashCode())) * 31;
        String str2 = this.f117486d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117487e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.f117488f;
        int iA = bb3.a(this.f117491i, bb3.a(this.f117490h, bb3.a(this.f117489g, (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f117492j;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.f117483a + ", id=" + this.f117484b + ", deliveryMethod=" + this.f117485c + ", mimeType=" + this.f117486d + ", codec=" + this.f117487e + ", vmafMetric=" + this.f117488f + ", height=" + this.f117489g + ", width=" + this.f117490h + ", bitrate=" + this.f117491i + ", apiFramework=" + this.f117492j + ")";
    }
}
