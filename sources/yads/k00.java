package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t00 f112529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00 f112530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00 f112531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m00 f112532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a10 f112533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f112534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f112535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f112536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f112537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f112538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f112539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f112540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f112541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f112542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f112543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f112544p;

    public k00(t00 t00Var, m00 m00Var, m00 m00Var2, m00 m00Var3, a10 a10Var, String str, String str2, String str3, String str4, String str5, Float f10, String str6, String str7, String str8, String str9, boolean z10) {
        this.f112529a = t00Var;
        this.f112530b = m00Var;
        this.f112531c = m00Var2;
        this.f112532d = m00Var3;
        this.f112533e = a10Var;
        this.f112534f = str;
        this.f112535g = str2;
        this.f112536h = str3;
        this.f112537i = str4;
        this.f112538j = str5;
        this.f112539k = f10;
        this.f112540l = str6;
        this.f112541m = str7;
        this.f112542n = str8;
        this.f112543o = str9;
        this.f112544p = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return Intrinsics.areEqual(this.f112529a, k00Var.f112529a) && Intrinsics.areEqual(this.f112530b, k00Var.f112530b) && Intrinsics.areEqual(this.f112531c, k00Var.f112531c) && Intrinsics.areEqual(this.f112532d, k00Var.f112532d) && Intrinsics.areEqual(this.f112533e, k00Var.f112533e) && Intrinsics.areEqual(this.f112534f, k00Var.f112534f) && Intrinsics.areEqual(this.f112535g, k00Var.f112535g) && Intrinsics.areEqual(this.f112536h, k00Var.f112536h) && Intrinsics.areEqual(this.f112537i, k00Var.f112537i) && Intrinsics.areEqual(this.f112538j, k00Var.f112538j) && Intrinsics.areEqual((Object) this.f112539k, (Object) k00Var.f112539k) && Intrinsics.areEqual(this.f112540l, k00Var.f112540l) && Intrinsics.areEqual(this.f112541m, k00Var.f112541m) && Intrinsics.areEqual(this.f112542n, k00Var.f112542n) && Intrinsics.areEqual(this.f112543o, k00Var.f112543o) && this.f112544p == k00Var.f112544p;
    }

    public final int hashCode() {
        t00 t00Var = this.f112529a;
        int iFloatToIntBits = (t00Var == null ? 0 : Float.floatToIntBits(t00Var.f116004a)) * 31;
        m00 m00Var = this.f112530b;
        int iHashCode = (iFloatToIntBits + (m00Var == null ? 0 : m00Var.hashCode())) * 31;
        m00 m00Var2 = this.f112531c;
        int iHashCode2 = (iHashCode + (m00Var2 == null ? 0 : m00Var2.hashCode())) * 31;
        m00 m00Var3 = this.f112532d;
        int iHashCode3 = (iHashCode2 + (m00Var3 == null ? 0 : m00Var3.hashCode())) * 31;
        a10 a10Var = this.f112533e;
        int iHashCode4 = (iHashCode3 + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        String str = this.f112534f;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112535g;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f112536h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f112537i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f112538j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f112539k;
        int iHashCode10 = (iHashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str6 = this.f112540l;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f112541m;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f112542n;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f112543o;
        return androidx.compose.foundation.c.a(this.f112544p) + ((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreNativeAdAssets(media=" + this.f112529a + ", favicon=" + this.f112530b + ", icon=" + this.f112531c + ", image=" + this.f112532d + ", closeButton=" + this.f112533e + ", age=" + this.f112534f + ", body=" + this.f112535g + ", callToAction=" + this.f112536h + ", domain=" + this.f112537i + ", price=" + this.f112538j + ", rating=" + this.f112539k + ", reviewCount=" + this.f112540l + ", sponsored=" + this.f112541m + ", title=" + this.f112542n + ", warning=" + this.f112543o + ", feedbackAvailable=" + this.f112544p + ")";
    }
}
