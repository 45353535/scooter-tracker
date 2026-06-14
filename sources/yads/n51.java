package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113732c;

    public n51(int i10, int i11, String str) {
        this.f113730a = str;
        this.f113731b = i10;
        this.f113732c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n51)) {
            return false;
        }
        n51 n51Var = (n51) obj;
        return Intrinsics.areEqual(this.f113730a, n51Var.f113730a) && this.f113731b == n51Var.f113731b && this.f113732c == n51Var.f113732c;
    }

    public final int hashCode() {
        return this.f113732c + bb3.a(this.f113731b, this.f113730a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InstalledPackage(name=" + this.f113730a + ", minVersion=" + this.f113731b + ", maxVersion=" + this.f113732c + ")";
    }
}
