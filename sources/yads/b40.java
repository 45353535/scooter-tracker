package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b40 implements c40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x90 f108902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108903b;

    public b40(x90 x90Var, List list) {
        this.f108902a = x90Var;
        this.f108903b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return Intrinsics.areEqual(this.f108902a, b40Var.f108902a) && Intrinsics.areEqual(this.f108903b, b40Var.f108903b);
    }

    public final int hashCode() {
        x90 x90Var = this.f108902a;
        return this.f108903b.hashCode() + ((x90Var == null ? 0 : x90Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.f108902a + ", cpmFloors=" + this.f108903b + ")";
    }
}
