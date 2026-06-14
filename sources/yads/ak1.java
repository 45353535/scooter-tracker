package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ak1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wj1 f108705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj1 f108706b;

    public ak1(wj1 wj1Var, wj1 wj1Var2) {
        this.f108705a = wj1Var;
        this.f108706b = wj1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return Intrinsics.areEqual(this.f108705a, ak1Var.f108705a) && Intrinsics.areEqual(this.f108706b, ak1Var.f108706b);
    }

    public final int hashCode() {
        int iHashCode = this.f108705a.hashCode() * 31;
        wj1 wj1Var = this.f108706b;
        return iHashCode + (wj1Var == null ? 0 : wj1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.f108705a + ", fallback=" + this.f108706b + ")";
    }
}
