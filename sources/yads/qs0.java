package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115143b;

    public qs0(String str, String str2) {
        this.f115142a = str;
        this.f115143b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs0)) {
            return false;
        }
        qs0 qs0Var = (qs0) obj;
        return Intrinsics.areEqual(this.f115142a, qs0Var.f115142a) && Intrinsics.areEqual(this.f115143b, qs0Var.f115143b);
    }

    public final int hashCode() {
        return this.f115143b.hashCode() + (this.f115142a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(title=" + this.f115142a + ", url=" + this.f115143b + ")";
    }
}
