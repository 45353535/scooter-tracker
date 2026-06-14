package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi3 f111599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld1 f111600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh1 f111601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f111602d;

    public hi3(gi3 gi3Var, ld1 ld1Var, xh1 xh1Var, Map map) {
        this.f111599a = gi3Var;
        this.f111600b = ld1Var;
        this.f111601c = xh1Var;
        this.f111602d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi3)) {
            return false;
        }
        hi3 hi3Var = (hi3) obj;
        return Intrinsics.areEqual(this.f111599a, hi3Var.f111599a) && Intrinsics.areEqual(this.f111600b, hi3Var.f111600b) && Intrinsics.areEqual(this.f111601c, hi3Var.f111601c) && Intrinsics.areEqual(this.f111602d, hi3Var.f111602d);
    }

    public final int hashCode() {
        return this.f111602d.hashCode() + ((this.f111601c.hashCode() + ((this.f111600b.hashCode() + (this.f111599a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f111599a + ", layoutParams=" + this.f111600b + ", measured=" + this.f111601c + ", additionalInfo=" + this.f111602d + ")";
    }
}
