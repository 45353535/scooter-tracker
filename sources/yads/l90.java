package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l90 extends o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k80 f113006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d50 f113007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f113008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f113010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f113011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f113012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p40 f113013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f113014k;

    public l90(String str, String str2, k80 k80Var, d50 d50Var, String str3, String str4, String str5, List list, List list2, p40 p40Var, String str6) {
        super(0);
        this.f113004a = str;
        this.f113005b = str2;
        this.f113006c = k80Var;
        this.f113007d = d50Var;
        this.f113008e = str3;
        this.f113009f = str4;
        this.f113010g = str5;
        this.f113011h = list;
        this.f113012i = list2;
        this.f113013j = p40Var;
        this.f113014k = str6;
    }

    public final String a() {
        return this.f113009f;
    }

    public final List b() {
        return this.f113012i;
    }

    public final String c() {
        return this.f113004a;
    }

    public final String d() {
        return this.f113010g;
    }

    public final List e() {
        return this.f113011h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        return Intrinsics.areEqual(this.f113004a, l90Var.f113004a) && Intrinsics.areEqual(this.f113005b, l90Var.f113005b) && Intrinsics.areEqual(this.f113006c, l90Var.f113006c) && Intrinsics.areEqual(this.f113007d, l90Var.f113007d) && Intrinsics.areEqual(this.f113008e, l90Var.f113008e) && Intrinsics.areEqual(this.f113009f, l90Var.f113009f) && Intrinsics.areEqual(this.f113010g, l90Var.f113010g) && Intrinsics.areEqual(this.f113011h, l90Var.f113011h) && Intrinsics.areEqual(this.f113012i, l90Var.f113012i) && this.f113013j == l90Var.f113013j && Intrinsics.areEqual(this.f113014k, l90Var.f113014k);
    }

    public final p40 f() {
        return this.f113013j;
    }

    public final int hashCode() {
        int iHashCode = this.f113004a.hashCode() * 31;
        String str = this.f113005b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k80 k80Var = this.f113006c;
        int iHashCode3 = (this.f113007d.hashCode() + ((iHashCode2 + (k80Var == null ? 0 : k80Var.hashCode())) * 31)) * 31;
        String str2 = this.f113008e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f113009f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f113010g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f113011h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f113012i;
        int iHashCode8 = (this.f113013j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.f113014k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "MediationAdapter(name=" + this.f113004a + ", logoUrl=" + this.f113005b + ", infoFirst=" + this.f113006c + ", infoSecond=" + this.f113007d + ", waringMessage=" + this.f113008e + ", adUnitId=" + this.f113009f + ", networkAdUnitIdName=" + this.f113010g + ", parameters=" + this.f113011h + ", cpmFloors=" + this.f113012i + ", type=" + this.f113013j + ", sdk=" + this.f113014k + ")";
    }

    public /* synthetic */ l90(String str, String str2, k80 k80Var, d50 d50Var, String str3, String str4, String str5, List list, List list2, p40 p40Var, String str6, int i10) {
        this(str, str2, k80Var, d50Var, str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? p40.f114549e : p40Var, (i10 & 1024) != 0 ? null : str6);
    }
}
