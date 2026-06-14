package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f56629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f56630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f56631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f56632d;

    public s0(Integer num, n0 n0Var, l0 l0Var, r0 r0Var) {
        this.f56629a = num;
        this.f56630b = n0Var;
        this.f56631c = l0Var;
        this.f56632d = r0Var;
    }

    public final Integer a() {
        return this.f56629a;
    }

    public final l0 b() {
        return this.f56631c;
    }

    public final n0 c() {
        return this.f56630b;
    }

    public final r0 d() {
        return this.f56632d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(this.f56629a, s0Var.f56629a) && Intrinsics.areEqual(this.f56630b, s0Var.f56630b) && Intrinsics.areEqual(this.f56631c, s0Var.f56631c) && Intrinsics.areEqual(this.f56632d, s0Var.f56632d);
    }

    public int hashCode() {
        Integer num = this.f56629a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        n0 n0Var = this.f56630b;
        int iHashCode2 = (iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        l0 l0Var = this.f56631c;
        int iHashCode3 = (iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        r0 r0Var = this.f56632d;
        return iHashCode3 + (r0Var != null ? r0Var.hashCode() : 0);
    }

    public String toString() {
        return "DECRenderingData(appNameFontSize=" + this.f56629a + ", decCTA=" + this.f56630b + ", decAppIcon=" + this.f56631c + ", decRating=" + this.f56632d + ')';
    }
}
