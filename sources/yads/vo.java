package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz f117135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx2 f117136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f117137c;

    public vo(qz qzVar, mx2 mx2Var, Map map) {
        this.f117135a = qzVar;
        this.f117136b = mx2Var;
        this.f117137c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f117135a == voVar.f117135a && Intrinsics.areEqual(this.f117136b, voVar.f117136b) && Intrinsics.areEqual(this.f117137c, voVar.f117137c);
    }

    public final int hashCode() {
        qz qzVar = this.f117135a;
        int iHashCode = (qzVar == null ? 0 : qzVar.hashCode()) * 31;
        mx2 mx2Var = this.f117136b;
        return this.f117137c.hashCode() + ((iHashCode + (mx2Var != null ? mx2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BidderTokenRequestData(adType=" + this.f117135a + ", sizeInfo=" + this.f117136b + ", parameters=" + this.f117137c + ")";
    }
}
