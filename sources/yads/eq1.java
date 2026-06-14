package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq1 f110436b;

    public eq1(String str, dq1 dq1Var) {
        this.f110435a = str;
        this.f110436b = dq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq1)) {
            return false;
        }
        eq1 eq1Var = (eq1) obj;
        return Intrinsics.areEqual(this.f110435a, eq1Var.f110435a) && this.f110436b == eq1Var.f110436b;
    }

    public final int hashCode() {
        return this.f110436b.hashCode() + (this.f110435a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.f110435a + ", type=" + this.f110436b + ")";
    }
}
