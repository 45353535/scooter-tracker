package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f56177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f56178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f56179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r0 f56180i;

    public k0(String str, String str2, String str3, String str4, String str5, Integer num, n0 n0Var, l0 l0Var, r0 r0Var) {
        this.f56172a = str;
        this.f56173b = str2;
        this.f56174c = str3;
        this.f56175d = str4;
        this.f56176e = str5;
        this.f56177f = num;
        this.f56178g = n0Var;
        this.f56179h = l0Var;
        this.f56180i = r0Var;
    }

    public static /* synthetic */ k0 a(k0 k0Var, String str, String str2, String str3, String str4, String str5, Integer num, n0 n0Var, l0 l0Var, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = k0Var.f56172a;
        }
        if ((i10 & 2) != 0) {
            str2 = k0Var.f56173b;
        }
        if ((i10 & 4) != 0) {
            str3 = k0Var.f56174c;
        }
        if ((i10 & 8) != 0) {
            str4 = k0Var.f56175d;
        }
        if ((i10 & 16) != 0) {
            str5 = k0Var.f56176e;
        }
        if ((i10 & 32) != 0) {
            num = k0Var.f56177f;
        }
        if ((i10 & 64) != 0) {
            n0Var = k0Var.f56178g;
        }
        if ((i10 & 128) != 0) {
            l0Var = k0Var.f56179h;
        }
        if ((i10 & 256) != 0) {
            r0Var = k0Var.f56180i;
        }
        l0 l0Var2 = l0Var;
        r0 r0Var2 = r0Var;
        Integer num2 = num;
        n0 n0Var2 = n0Var;
        String str6 = str5;
        String str7 = str3;
        return k0Var.b(str, str2, str7, str4, str6, num2, n0Var2, l0Var2, r0Var2);
    }

    public final k0 b(String str, String str2, String str3, String str4, String str5, Integer num, n0 n0Var, l0 l0Var, r0 r0Var) {
        return new k0(str, str2, str3, str4, str5, num, n0Var, l0Var, r0Var);
    }

    public final String c() {
        return this.f56172a;
    }

    public final Integer d() {
        return this.f56177f;
    }

    public final String e() {
        return this.f56174c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.areEqual(this.f56172a, k0Var.f56172a) && Intrinsics.areEqual(this.f56173b, k0Var.f56173b) && Intrinsics.areEqual(this.f56174c, k0Var.f56174c) && Intrinsics.areEqual(this.f56175d, k0Var.f56175d) && Intrinsics.areEqual(this.f56176e, k0Var.f56176e) && Intrinsics.areEqual(this.f56177f, k0Var.f56177f) && Intrinsics.areEqual(this.f56178g, k0Var.f56178g) && Intrinsics.areEqual(this.f56179h, k0Var.f56179h) && Intrinsics.areEqual(this.f56180i, k0Var.f56180i);
    }

    public final String f() {
        return this.f56173b;
    }

    public final l0 g() {
        return this.f56179h;
    }

    public final n0 h() {
        return this.f56178g;
    }

    public int hashCode() {
        String str = this.f56172a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56173b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56174c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56175d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56176e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f56177f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        n0 n0Var = this.f56178g;
        int iHashCode7 = (iHashCode6 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        l0 l0Var = this.f56179h;
        int iHashCode8 = (iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        r0 r0Var = this.f56180i;
        return iHashCode8 + (r0Var != null ? r0Var.hashCode() : 0);
    }

    public final r0 i() {
        return this.f56180i;
    }

    public final String j() {
        return this.f56175d;
    }

    public final String k() {
        return this.f56176e;
    }

    public String toString() {
        return "DEC(appName=" + this.f56172a + ", ctaUrl=" + this.f56173b + ", ctaTrackingUrl=" + this.f56174c + ", impressionTrackingUrl=" + this.f56175d + ", skipToDECTrackingUrl=" + this.f56176e + ", appNameFontSize=" + this.f56177f + ", decCta=" + this.f56178g + ", decAppIcon=" + this.f56179h + ", decRating=" + this.f56180i + ')';
    }
}
