package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class hv0 {

    @NotNull
    public static final gv0 Companion = new gv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv0 f111779a;

    public /* synthetic */ hv0(int i10, pv0 pv0Var) {
        if (1 != (i10 & 1)) {
            yg.e2.a(i10, 1, fv0.f110934a.getDescriptor());
        }
        this.f111779a = pv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv0) && Intrinsics.areEqual(this.f111779a, ((hv0) obj).f111779a);
    }

    public final int hashCode() {
        pv0 pv0Var = this.f111779a;
        if (pv0Var == null) {
            return 0;
        }
        return pv0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.f111779a + ")";
    }
}
