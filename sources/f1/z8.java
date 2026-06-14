package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f71779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f71780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg f71782d;

    public z8(Integer num, Integer num2, String str, fg openRTBConnectionType) {
        Intrinsics.checkNotNullParameter(openRTBConnectionType, "openRTBConnectionType");
        this.f71779a = num;
        this.f71780b = num2;
        this.f71781c = str;
        this.f71782d = openRTBConnectionType;
    }

    public final Integer a() {
        return this.f71779a;
    }

    public final Integer b() {
        return this.f71780b;
    }

    public final String c() {
        return this.f71781c;
    }

    public final fg d() {
        return this.f71782d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return Intrinsics.areEqual(this.f71779a, z8Var.f71779a) && Intrinsics.areEqual(this.f71780b, z8Var.f71780b) && Intrinsics.areEqual(this.f71781c, z8Var.f71781c) && this.f71782d == z8Var.f71782d;
    }

    public int hashCode() {
        Integer num = this.f71779a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f71780b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f71781c;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f71782d.hashCode();
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f71779a + ", connectionTypeFromActiveNetwork=" + this.f71780b + ", detailedConnectionType=" + this.f71781c + ", openRTBConnectionType=" + this.f71782d + ")";
    }
}
