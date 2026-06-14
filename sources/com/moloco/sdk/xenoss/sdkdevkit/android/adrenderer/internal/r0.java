package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f56624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56628e;

    public r0(Float f10, String foregroundColor, String backgroundColor, int i10, int i11) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f56624a = f10;
        this.f56625b = foregroundColor;
        this.f56626c = backgroundColor;
        this.f56627d = i10;
        this.f56628e = i11;
    }

    public final String a() {
        return this.f56626c;
    }

    public final int b() {
        return this.f56628e;
    }

    public final String c() {
        return this.f56625b;
    }

    public final int d() {
        return this.f56627d;
    }

    public final Float e() {
        return this.f56624a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual((Object) this.f56624a, (Object) r0Var.f56624a) && Intrinsics.areEqual(this.f56625b, r0Var.f56625b) && Intrinsics.areEqual(this.f56626c, r0Var.f56626c) && this.f56627d == r0Var.f56627d && this.f56628e == r0Var.f56628e;
    }

    public int hashCode() {
        Float f10 = this.f56624a;
        return ((((((((f10 == null ? 0 : f10.hashCode()) * 31) + this.f56625b.hashCode()) * 31) + this.f56626c.hashCode()) * 31) + this.f56627d) * 31) + this.f56628e;
    }

    public String toString() {
        return "DECRating(value=" + this.f56624a + ", foregroundColor=" + this.f56625b + ", backgroundColor=" + this.f56626c + ", size=" + this.f56627d + ", fontSize=" + this.f56628e + ')';
    }
}
