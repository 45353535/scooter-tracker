package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hs2 implements js2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4 f111773a;

    public hs2(k4 k4Var) {
        this.f111773a = k4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs2) && Intrinsics.areEqual(this.f111773a, ((hs2) obj).f111773a);
    }

    public final int hashCode() {
        return this.f111773a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f111773a + ")";
    }
}
