package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a70 extends f70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108589b;

    public a70(String str) {
        super("Ad Units", 0);
        this.f108589b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a70) && Intrinsics.areEqual(this.f108589b, ((a70) obj).f108589b);
    }

    public final int hashCode() {
        return this.f108589b.hashCode();
    }

    public final String toString() {
        return "AdUnit(unitId=" + this.f108589b + ")";
    }
}
