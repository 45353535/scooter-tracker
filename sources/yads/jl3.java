package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jl3 implements ll3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru1 f112383a;

    public jl3(ru1 ru1Var) {
        this.f112383a = ru1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl3) && Intrinsics.areEqual(this.f112383a, ((jl3) obj).f112383a);
    }

    public final int hashCode() {
        ru1 ru1Var = this.f112383a;
        if (ru1Var == null) {
            return 0;
        }
        return ru1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.f112383a + ")";
    }
}
