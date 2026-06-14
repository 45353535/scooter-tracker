package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f110346a;

    public ee(td tdVar) {
        this.f110346a = tdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee) && Intrinsics.areEqual(this.f110346a, ((ee) obj).f110346a);
    }

    public final int hashCode() {
        return this.f110346a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f110346a + ")";
    }
}
