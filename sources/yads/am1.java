package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class am1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai1 f108719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb3 f108720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108721c;

    public am1(ai1 ai1Var, gb3 gb3Var, List list) {
        this.f108719a = ai1Var;
        this.f108720b = gb3Var;
        this.f108721c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return Intrinsics.areEqual(this.f108719a, am1Var.f108719a) && Intrinsics.areEqual(this.f108720b, am1Var.f108720b) && Intrinsics.areEqual(this.f108721c, am1Var.f108721c);
    }

    public final int hashCode() {
        ai1 ai1Var = this.f108719a;
        int iHashCode = (ai1Var == null ? 0 : ai1Var.hashCode()) * 31;
        gb3 gb3Var = this.f108720b;
        int iHashCode2 = (iHashCode + (gb3Var == null ? 0 : gb3Var.hashCode())) * 31;
        List list = this.f108721c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.f108719a + ", video=" + this.f108720b + ", imageValues=" + this.f108721c + ")";
    }
}
