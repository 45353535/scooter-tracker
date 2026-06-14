package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1 f113569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z32 f113570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y52 f113571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w52 f113572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jy1 f113573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s12 f113574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g02 f113575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final es2 f113576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rw1 f113577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ta f113578j;

    public mp(dx1 dx1Var, xz1 xz1Var, y52 y52Var, w52 w52Var, jy1 jy1Var, s12 s12Var, g02 g02Var, es2 es2Var, rw1 rw1Var, ta taVar) {
        this.f113569a = dx1Var;
        this.f113570b = xz1Var;
        this.f113571c = y52Var;
        this.f113572d = w52Var;
        this.f113573e = jy1Var;
        this.f113574f = s12Var;
        this.f113575g = g02Var;
        this.f113576h = es2Var;
        this.f113577i = rw1Var;
        this.f113578j = taVar;
    }

    public final ta a() {
        return this.f113578j;
    }

    public final g02 b() {
        return this.f113575g;
    }

    public final s12 c() {
        return this.f113574f;
    }

    public final dx1 d() {
        return this.f113569a;
    }

    public final jy1 e() {
        return this.f113573e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return Intrinsics.areEqual(this.f113569a, mpVar.f113569a) && Intrinsics.areEqual(this.f113570b, mpVar.f113570b) && Intrinsics.areEqual(this.f113571c, mpVar.f113571c) && Intrinsics.areEqual(this.f113572d, mpVar.f113572d) && Intrinsics.areEqual(this.f113573e, mpVar.f113573e) && Intrinsics.areEqual(this.f113574f, mpVar.f113574f) && Intrinsics.areEqual(this.f113575g, mpVar.f113575g) && Intrinsics.areEqual(this.f113576h, mpVar.f113576h) && Intrinsics.areEqual(this.f113577i, mpVar.f113577i) && this.f113578j == mpVar.f113578j;
    }

    public final rw1 f() {
        return this.f113577i;
    }

    public final z32 g() {
        return this.f113570b;
    }

    public final w52 h() {
        return this.f113572d;
    }

    public final int hashCode() {
        int iHashCode = (this.f113576h.hashCode() + ((this.f113575g.hashCode() + ((this.f113574f.hashCode() + ((this.f113573e.hashCode() + ((this.f113572d.hashCode() + ((this.f113571c.hashCode() + ((this.f113570b.hashCode() + (this.f113569a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        rw1 rw1Var = this.f113577i;
        return this.f113578j.hashCode() + ((iHashCode + (rw1Var == null ? 0 : rw1Var.hashCode())) * 31);
    }

    public final y52 i() {
        return this.f113571c;
    }

    public final es2 j() {
        return this.f113576h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f113569a + ", nativeValidator=" + this.f113570b + ", nativeVisualBlock=" + this.f113571c + ", nativeViewRenderer=" + this.f113572d + ", nativeAdFactoriesProvider=" + this.f113573e + ", forceImpressionConfigurator=" + this.f113574f + ", adViewRenderingValidator=" + this.f113575g + ", sdkEnvironmentModule=" + this.f113576h + ", nativeData=" + this.f113577i + ", adStructureType=" + this.f113578j + ")";
    }
}
