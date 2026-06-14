package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e90 extends o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110266c;

    public e90(String str, String str2, String str3) {
        super(0);
        this.f110264a = str;
        this.f110265b = str2;
        this.f110266c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e90)) {
            return false;
        }
        e90 e90Var = (e90) obj;
        return Intrinsics.areEqual(this.f110264a, e90Var.f110264a) && Intrinsics.areEqual(this.f110265b, e90Var.f110265b) && Intrinsics.areEqual(this.f110266c, e90Var.f110266c);
    }

    public final int hashCode() {
        return this.f110266c.hashCode() + j4.a(this.f110265b, this.f110264a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnit(name=" + this.f110264a + ", format=" + this.f110265b + ", id=" + this.f110266c + ")";
    }
}
