package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f114134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k32 f114135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o32 f114136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm2 f114137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f114138e;

    public nz1(e9 e9Var, k32 k32Var, oz1 oz1Var, int i10) {
        o32 o32Var = o32.f114180c;
        this.f114134a = e9Var;
        this.f114135b = k32Var;
        this.f114136c = o32Var;
        this.f114137d = oz1Var;
        this.f114138e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        return Intrinsics.areEqual(this.f114134a, nz1Var.f114134a) && this.f114135b == nz1Var.f114135b && this.f114136c == nz1Var.f114136c && Intrinsics.areEqual(this.f114137d, nz1Var.f114137d) && this.f114138e == nz1Var.f114138e;
    }

    public final int hashCode() {
        return this.f114138e + ((this.f114137d.hashCode() + ((this.f114136c.hashCode() + ((this.f114135b.hashCode() + (this.f114134a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f114134a + ", nativeResponseType=" + this.f114135b + ", sourceType=" + this.f114136c + ", requestPolicy=" + this.f114137d + ", adsCount=" + this.f114138e + ")";
    }
}
