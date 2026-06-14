package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr2 f113727b;

    public n43(String str, fr2 fr2Var) {
        this.f113726a = str;
        this.f113727b = fr2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n43)) {
            return false;
        }
        n43 n43Var = (n43) obj;
        return Intrinsics.areEqual(this.f113726a, n43Var.f113726a) && this.f113727b == n43Var.f113727b;
    }

    public final int hashCode() {
        String str = this.f113726a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        fr2 fr2Var = this.f113727b;
        return iHashCode + (fr2Var != null ? fr2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.f113726a + ", stubReason=" + this.f113727b + ")";
    }
}
