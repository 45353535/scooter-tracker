package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116864c;

    public v30(String str, String str2, String str3) {
        this.f116862a = str;
        this.f116863b = str2;
        this.f116864c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v30)) {
            return false;
        }
        v30 v30Var = (v30) obj;
        return Intrinsics.areEqual(this.f116862a, v30Var.f116862a) && Intrinsics.areEqual(this.f116863b, v30Var.f116863b) && Intrinsics.areEqual(this.f116864c, v30Var.f116864c);
    }

    public final int hashCode() {
        return this.f116864c.hashCode() + j4.a(this.f116863b, this.f116862a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f116862a + ", format=" + this.f116863b + ", adUnitId=" + this.f116864c + ")";
    }
}
