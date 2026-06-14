package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f117670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f117671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9 f117672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es2 f117673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jz1 f117674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f117675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ze0 f117676g;

    public x1(t9 t9Var, c4 c4Var, x9 x9Var, es2 es2Var, jz1 jz1Var, int i10, ze0 ze0Var) {
        this.f117670a = t9Var;
        this.f117671b = c4Var;
        this.f117672c = x9Var;
        this.f117673d = es2Var;
        this.f117674e = jz1Var;
        this.f117675f = i10;
        this.f117676g = ze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.areEqual(this.f117670a, x1Var.f117670a) && Intrinsics.areEqual(this.f117671b, x1Var.f117671b) && Intrinsics.areEqual(this.f117672c, x1Var.f117672c) && Intrinsics.areEqual(this.f117673d, x1Var.f117673d) && Intrinsics.areEqual(this.f117674e, x1Var.f117674e) && this.f117675f == x1Var.f117675f && Intrinsics.areEqual(this.f117676g, x1Var.f117676g);
    }

    public final int hashCode() {
        int iHashCode = (this.f117673d.hashCode() + ((this.f117672c.hashCode() + ((this.f117671b.hashCode() + (this.f117670a.hashCode() * 31)) * 31)) * 31)) * 31;
        jz1 jz1Var = this.f117674e;
        int iA = bb3.a(this.f117675f, (iHashCode + (jz1Var == null ? 0 : jz1Var.hashCode())) * 31, 31);
        ze0 ze0Var = this.f117676g;
        return iA + (ze0Var != null ? ze0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.f117670a + ", adConfiguration=" + this.f117671b + ", adResultReceiver=" + this.f117672c + ", sdkEnvironmentModule=" + this.f117673d + ", nativeAd=" + this.f117674e + ", requestedOrientation=" + this.f117675f + ", delegatedActivityLaunchInfo=" + this.f117676g + ")";
    }

    public /* synthetic */ x1(t9 t9Var, c4 c4Var, x9 x9Var, es2 es2Var, jz1 jz1Var, int i10, ze0 ze0Var, int i11) {
        this(t9Var, c4Var, x9Var, es2Var, (i11 & 16) != 0 ? null : jz1Var, (i11 & 32) != 0 ? 0 : i10, (i11 & 64) != 0 ? null : ze0Var);
    }
}
