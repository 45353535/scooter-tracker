package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class as2 implements cs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oj3 f108769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy f108770b;

    public as2(oj3 oj3Var, jy jyVar) {
        this.f108769a = oj3Var;
        this.f108770b = jyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as2)) {
            return false;
        }
        as2 as2Var = (as2) obj;
        return Intrinsics.areEqual(this.f108769a, as2Var.f108769a) && this.f108770b == as2Var.f108770b;
    }

    public final int hashCode() {
        return this.f108770b.hashCode() + (this.f108769a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f108769a + ", configurationSource=" + this.f108770b + ")";
    }
}
