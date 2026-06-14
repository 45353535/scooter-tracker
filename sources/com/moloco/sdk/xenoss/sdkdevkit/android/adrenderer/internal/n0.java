package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f56541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f56543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f56544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0 f56545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56547g;

    public n0(Integer num, String str, Integer num2, Integer num3, m0 m0Var, String str2, String str3) {
        this.f56541a = num;
        this.f56542b = str;
        this.f56543c = num2;
        this.f56544d = num3;
        this.f56545e = m0Var;
        this.f56546f = str2;
        this.f56547g = str3;
    }

    public final String a() {
        return this.f56547g;
    }

    public final m0 b() {
        return this.f56545e;
    }

    public final Integer c() {
        return this.f56543c;
    }

    public final String d() {
        return this.f56542b;
    }

    public final Integer e() {
        return this.f56544d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.areEqual(this.f56541a, n0Var.f56541a) && Intrinsics.areEqual(this.f56542b, n0Var.f56542b) && Intrinsics.areEqual(this.f56543c, n0Var.f56543c) && Intrinsics.areEqual(this.f56544d, n0Var.f56544d) && Intrinsics.areEqual(this.f56545e, n0Var.f56545e) && Intrinsics.areEqual(this.f56546f, n0Var.f56546f) && Intrinsics.areEqual(this.f56547g, n0Var.f56547g);
    }

    public final String f() {
        return this.f56546f;
    }

    public final Integer g() {
        return this.f56541a;
    }

    public int hashCode() {
        Integer num = this.f56541a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f56542b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f56543c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f56544d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        m0 m0Var = this.f56545e;
        int iHashCode5 = (iHashCode4 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str2 = this.f56546f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56547g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DECCta(verticalSpacing=" + this.f56541a + ", ctaText=" + this.f56542b + ", buttonWidth=" + this.f56543c + ", fontSize=" + this.f56544d + ", border=" + this.f56545e + ", foregroundColor=" + this.f56546f + ", backgroundColor=" + this.f56547g + ')';
    }
}
