package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class ts1 {

    @NotNull
    public static final ss1 Companion = new ss1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ys1 f116354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bt1 f116355b;

    public /* synthetic */ ts1(int i10, ys1 ys1Var, bt1 bt1Var) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, rs1.f115564a.getDescriptor());
        }
        this.f116354a = ys1Var;
        this.f116355b = bt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts1)) {
            return false;
        }
        ts1 ts1Var = (ts1) obj;
        return Intrinsics.areEqual(this.f116354a, ts1Var.f116354a) && Intrinsics.areEqual(this.f116355b, ts1Var.f116355b);
    }

    public final int hashCode() {
        int iHashCode = this.f116354a.hashCode() * 31;
        bt1 bt1Var = this.f116355b;
        return iHashCode + (bt1Var == null ? 0 : bt1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f116354a + ", response=" + this.f116355b + ")";
    }

    public ts1(ys1 ys1Var, bt1 bt1Var) {
        this.f116354a = ys1Var;
        this.f116355b = bt1Var;
    }
}
