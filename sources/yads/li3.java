package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class li3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113108b;

    public li3(int i10, String str) {
        this.f113107a = str;
        this.f113108b = i10;
    }

    public final String a() {
        return this.f113107a;
    }

    public final int b() {
        return this.f113108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li3)) {
            return false;
        }
        li3 li3Var = (li3) obj;
        return Intrinsics.areEqual(this.f113107a, li3Var.f113107a) && this.f113108b == li3Var.f113108b;
    }

    public final int hashCode() {
        return this.f113108b + (this.f113107a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f113107a + ", screenOrientation=" + this.f113108b + ")";
    }
}
