package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eg2 implements jo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110366c;

    public eg2(zw0 zw0Var, Object obj, long j10) {
        this.f110364a = zw0Var;
        this.f110365b = obj;
        this.f110366c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg2)) {
            return false;
        }
        eg2 eg2Var = (eg2) obj;
        return Intrinsics.areEqual(this.f110364a, eg2Var.f110364a) && Intrinsics.areEqual(this.f110365b, eg2Var.f110365b) && this.f110366c == eg2Var.f110366c;
    }

    public final int hashCode() {
        Object obj = this.f110364a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f110365b;
        return androidx.collection.b.a(this.f110366c) + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedItem(params=" + this.f110364a + ", item=" + this.f110365b + ", expiresAtTimestampMillis=" + this.f110366c + ")";
    }
}
