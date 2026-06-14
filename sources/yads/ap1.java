package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ap1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108747b;

    public ap1(String str, String str2) {
        this.f108746a = str;
        this.f108747b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1)) {
            return false;
        }
        ap1 ap1Var = (ap1) obj;
        return Intrinsics.areEqual(this.f108746a, ap1Var.f108746a) && Intrinsics.areEqual(this.f108747b, ap1Var.f108747b);
    }

    public final int hashCode() {
        return this.f108747b.hashCode() + (this.f108746a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationAdapterSignature(format=" + this.f108746a + ", className=" + this.f108747b + ")";
    }
}
