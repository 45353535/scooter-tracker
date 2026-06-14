package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx2 f111183b;

    public gg2(String str, kx2 kx2Var) {
        this.f111182a = str;
        this.f111183b = kx2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg2)) {
            return false;
        }
        gg2 gg2Var = (gg2) obj;
        return Intrinsics.areEqual(this.f111182a, gg2Var.f111182a) && Intrinsics.areEqual(this.f111183b, gg2Var.f111183b);
    }

    public final int hashCode() {
        return this.f111183b.hashCode() + (this.f111182a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.f111182a + ", size=" + this.f111183b + ")";
    }
}
