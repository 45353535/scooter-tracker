package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q80 implements t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l90 f114890a;

    public q80(l90 l90Var) {
        this.f114890a = l90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q80) && Intrinsics.areEqual(this.f114890a, ((q80) obj).f114890a);
    }

    public final int hashCode() {
        return this.f114890a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.f114890a + ")";
    }
}
