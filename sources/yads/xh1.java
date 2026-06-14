package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh1 f117816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh1 f117817b;

    public xh1(yh1 yh1Var, yh1 yh1Var2) {
        this.f117816a = yh1Var;
        this.f117817b = yh1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh1)) {
            return false;
        }
        xh1 xh1Var = (xh1) obj;
        return Intrinsics.areEqual(this.f117816a, xh1Var.f117816a) && Intrinsics.areEqual(this.f117817b, xh1Var.f117817b);
    }

    public final int hashCode() {
        return this.f117817b.hashCode() + (this.f117816a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f117816a + ", height=" + this.f117817b + ")";
    }
}
