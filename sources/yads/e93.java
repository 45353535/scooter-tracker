package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e93 implements h93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d93 f110267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110269c;

    public e93(d93 d93Var, String str, String str2) {
        this.f110267a = d93Var;
        this.f110268b = str;
        this.f110269c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e93)) {
            return false;
        }
        e93 e93Var = (e93) obj;
        return this.f110267a == e93Var.f110267a && Intrinsics.areEqual(this.f110268b, e93Var.f110268b) && Intrinsics.areEqual(this.f110269c, e93Var.f110269c);
    }

    public final int hashCode() {
        int iHashCode = this.f110267a.hashCode() * 31;
        String str = this.f110268b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110269c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(status=" + this.f110267a + ", assetName=" + this.f110268b + ", description=" + this.f110269c + ")";
    }
}
