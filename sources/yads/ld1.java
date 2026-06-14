package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ld1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f113046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f113047b;

    public ld1(Integer num, Integer num2) {
        this.f113046a = num;
        this.f113047b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld1)) {
            return false;
        }
        ld1 ld1Var = (ld1) obj;
        return Intrinsics.areEqual(this.f113046a, ld1Var.f113046a) && Intrinsics.areEqual(this.f113047b, ld1Var.f113047b);
    }

    public final int hashCode() {
        Integer num = this.f113046a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f113047b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f113046a + ", height=" + this.f113047b + ")";
    }
}
