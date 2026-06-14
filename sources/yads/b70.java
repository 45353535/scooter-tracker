package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b70 extends f70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l90 f108918b;

    public b70(l90 l90Var) {
        super(l90Var.c(), 0);
        this.f108918b = l90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b70) && Intrinsics.areEqual(this.f108918b, ((b70) obj).f108918b);
    }

    public final int hashCode() {
        return this.f108918b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.f108918b + ")";
    }
}
