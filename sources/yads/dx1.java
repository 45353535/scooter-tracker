package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz1 f110104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9 f110105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4 f110106c;

    public dx1(t9 t9Var, c4 c4Var, qz1 qz1Var) {
        this.f110104a = qz1Var;
        this.f110105b = t9Var;
        this.f110106c = c4Var;
    }

    public final c4 a() {
        return this.f110106c;
    }

    public final t9 b() {
        return this.f110105b;
    }

    public final qz1 c() {
        return this.f110104a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx1)) {
            return false;
        }
        dx1 dx1Var = (dx1) obj;
        return Intrinsics.areEqual(this.f110104a, dx1Var.f110104a) && Intrinsics.areEqual(this.f110105b, dx1Var.f110105b) && Intrinsics.areEqual(this.f110106c, dx1Var.f110106c);
    }

    public final int hashCode() {
        return this.f110106c.hashCode() + ((this.f110105b.hashCode() + (this.f110104a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.f110104a + ", adResponse=" + this.f110105b + ", adConfiguration=" + this.f110106c + ")";
    }
}
