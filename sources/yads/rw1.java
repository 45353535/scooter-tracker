package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn2 f115623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f115624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f115625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f115626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final td1 f115627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i5 f115628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qt0 f115629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qt0 f115630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f115631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f115632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ec f115633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f115634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f115635m;

    public rw1(xn2 xn2Var, List list, String str, String str2, td1 td1Var, i5 i5Var, qt0 qt0Var, qt0 qt0Var2, List list2, List list3, ec ecVar, String str3, String str4) {
        this.f115623a = xn2Var;
        this.f115624b = list;
        this.f115625c = str;
        this.f115626d = str2;
        this.f115627e = td1Var;
        this.f115628f = i5Var;
        this.f115629g = qt0Var;
        this.f115630h = qt0Var2;
        this.f115631i = list2;
        this.f115632j = list3;
        this.f115633k = ecVar;
        this.f115634l = str3;
        this.f115635m = str4;
    }

    public final td1 a() {
        return this.f115627e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1)) {
            return false;
        }
        rw1 rw1Var = (rw1) obj;
        return this.f115623a == rw1Var.f115623a && Intrinsics.areEqual(this.f115624b, rw1Var.f115624b) && Intrinsics.areEqual(this.f115625c, rw1Var.f115625c) && Intrinsics.areEqual(this.f115626d, rw1Var.f115626d) && Intrinsics.areEqual(this.f115627e, rw1Var.f115627e) && Intrinsics.areEqual(this.f115628f, rw1Var.f115628f) && Intrinsics.areEqual(this.f115629g, rw1Var.f115629g) && Intrinsics.areEqual(this.f115630h, rw1Var.f115630h) && Intrinsics.areEqual(this.f115631i, rw1Var.f115631i) && Intrinsics.areEqual(this.f115632j, rw1Var.f115632j) && Intrinsics.areEqual(this.f115633k, rw1Var.f115633k) && Intrinsics.areEqual(this.f115634l, rw1Var.f115634l) && Intrinsics.areEqual(this.f115635m, rw1Var.f115635m);
    }

    public final int hashCode() {
        int iA = cb.a(this.f115624b, this.f115623a.hashCode() * 31, 31);
        String str = this.f115625c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115626d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        td1 td1Var = this.f115627e;
        int iHashCode3 = (iHashCode2 + (td1Var == null ? 0 : td1Var.hashCode())) * 31;
        i5 i5Var = this.f115628f;
        int iHashCode4 = (iHashCode3 + (i5Var == null ? 0 : i5Var.f111860b.hashCode())) * 31;
        qt0 qt0Var = this.f115629g;
        int iHashCode5 = (iHashCode4 + (qt0Var == null ? 0 : qt0Var.f115153a.hashCode())) * 31;
        qt0 qt0Var2 = this.f115630h;
        int iA2 = cb.a(this.f115632j, cb.a(this.f115631i, (iHashCode5 + (qt0Var2 == null ? 0 : qt0Var2.f115153a.hashCode())) * 31, 31), 31);
        ec ecVar = this.f115633k;
        int iHashCode6 = (iA2 + (ecVar == null ? 0 : ecVar.hashCode())) * 31;
        String str3 = this.f115634l;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f115635m;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.f115623a + ", assets=" + this.f115624b + ", adId=" + this.f115625c + ", info=" + this.f115626d + ", link=" + this.f115627e + ", impressionData=" + this.f115628f + ", hideConditions=" + this.f115629g + ", showConditions=" + this.f115630h + ", renderTrackingUrls=" + this.f115631i + ", showNotices=" + this.f115632j + ", additionalInfo=" + this.f115633k + ", creativeId=" + this.f115634l + ", campaignId=" + this.f115635m + ")";
    }
}
