package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f111499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f111500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7 f111501c;

    public h7(long j10, i7 i7Var, j7 j7Var) {
        this.f111499a = j10;
        this.f111500b = i7Var;
        this.f111501c = j7Var;
    }

    public final long a() {
        return this.f111499a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return this.f111499a == h7Var.f111499a && Intrinsics.areEqual(this.f111500b, h7Var.f111500b) && this.f111501c == h7Var.f111501c;
    }

    public final int hashCode() {
        int iA = androidx.collection.b.a(this.f111499a) * 31;
        i7 i7Var = this.f111500b;
        int iHashCode = (iA + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        j7 j7Var = this.f111501c;
        return iHashCode + (j7Var != null ? j7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f111499a + ", skip=" + this.f111500b + ", transitionPolicy=" + this.f111501c + ")";
    }
}
