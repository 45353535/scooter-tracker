package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rg3 f111137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d31 f111138c;

    public gb3(List list, rg3 rg3Var, d31 d31Var) {
        this.f111136a = list;
        this.f111137b = rg3Var;
        this.f111138c = d31Var;
    }

    public final xb3 a() {
        return (xb3) CollectionsKt.first(this.f111136a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb3)) {
            return false;
        }
        gb3 gb3Var = (gb3) obj;
        return Intrinsics.areEqual(this.f111136a, gb3Var.f111136a) && Intrinsics.areEqual(this.f111137b, gb3Var.f111137b) && Intrinsics.areEqual(this.f111138c, gb3Var.f111138c);
    }

    public final int hashCode() {
        int iHashCode = this.f111136a.hashCode() * 31;
        rg3 rg3Var = this.f111137b;
        int iHashCode2 = (iHashCode + (rg3Var == null ? 0 : rg3Var.hashCode())) * 31;
        d31 d31Var = this.f111138c;
        return iHashCode2 + (d31Var != null ? d31Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f111136a + ", videoSettings=" + this.f111137b + ", preview=" + this.f111138c + ")";
    }
}
