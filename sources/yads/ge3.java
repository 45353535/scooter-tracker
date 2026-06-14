package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ge3 extends ie3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb3 f111171a;

    public ge3(pb3 pb3Var) {
        super(0);
        this.f111171a = pb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge3) && Intrinsics.areEqual(this.f111171a, ((ge3) obj).f111171a);
    }

    public final int hashCode() {
        return this.f111171a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f111171a + ")";
    }
}
