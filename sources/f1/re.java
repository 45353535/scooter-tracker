package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf f70998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f70999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f71000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71002e;

    public re(bf adType, Integer num, Integer num2, String str, int i10) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f70998a = adType;
        this.f70999b = num;
        this.f71000c = num2;
        this.f71001d = str;
        this.f71002e = i10;
    }

    public final bf a() {
        return this.f70998a;
    }

    public final Integer b() {
        return this.f70999b;
    }

    public final int c() {
        return this.f71002e;
    }

    public final String d() {
        return this.f71001d;
    }

    public final Integer e() {
        return this.f71000c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return Intrinsics.areEqual(this.f70998a, reVar.f70998a) && Intrinsics.areEqual(this.f70999b, reVar.f70999b) && Intrinsics.areEqual(this.f71000c, reVar.f71000c) && Intrinsics.areEqual(this.f71001d, reVar.f71001d) && this.f71002e == reVar.f71002e;
    }

    public int hashCode() {
        int iHashCode = this.f70998a.hashCode() * 31;
        Integer num = this.f70999b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f71000c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f71001d;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f71002e;
    }

    public String toString() {
        return "AdParameters(adType=" + this.f70998a + ", height=" + this.f70999b + ", width=" + this.f71000c + ", location=" + this.f71001d + ", impDepth=" + this.f71002e + ")";
    }
}
