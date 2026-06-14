package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib3 implements ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f111941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f111942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb3 f111943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f111945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f111948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ui3 f111949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f111950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f111951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final om3 f111952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f111953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f111954o;

    public ib3(boolean z10, ArrayList arrayList, LinkedHashMap linkedHashMap, rb3 rb3Var, String str, String str2, String str3, String str4, String str5, ui3 ui3Var, Integer num, String str6, om3 om3Var, ArrayList arrayList2, Map map) {
        this.f111940a = z10;
        this.f111941b = arrayList;
        this.f111942c = linkedHashMap;
        this.f111943d = rb3Var;
        this.f111944e = str;
        this.f111945f = str2;
        this.f111946g = str3;
        this.f111947h = str4;
        this.f111948i = str5;
        this.f111949j = ui3Var;
        this.f111950k = num;
        this.f111951l = str6;
        this.f111952m = om3Var;
        this.f111953n = arrayList2;
        this.f111954o = map;
    }

    @Override // yads.ah3
    public final Map a() {
        return this.f111954o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3Var = (ib3) obj;
        return this.f111940a == ib3Var.f111940a && Intrinsics.areEqual(this.f111941b, ib3Var.f111941b) && Intrinsics.areEqual(this.f111942c, ib3Var.f111942c) && Intrinsics.areEqual(this.f111943d, ib3Var.f111943d) && Intrinsics.areEqual(this.f111944e, ib3Var.f111944e) && Intrinsics.areEqual(this.f111945f, ib3Var.f111945f) && Intrinsics.areEqual(this.f111946g, ib3Var.f111946g) && Intrinsics.areEqual(this.f111947h, ib3Var.f111947h) && Intrinsics.areEqual(this.f111948i, ib3Var.f111948i) && Intrinsics.areEqual(this.f111949j, ib3Var.f111949j) && Intrinsics.areEqual(this.f111950k, ib3Var.f111950k) && Intrinsics.areEqual(this.f111951l, ib3Var.f111951l) && Intrinsics.areEqual(this.f111952m, ib3Var.f111952m) && Intrinsics.areEqual(this.f111953n, ib3Var.f111953n) && Intrinsics.areEqual(this.f111954o, ib3Var.f111954o);
    }

    public final int hashCode() {
        int iHashCode = (this.f111943d.hashCode() + ((this.f111942c.hashCode() + cb.a(this.f111941b, androidx.compose.foundation.c.a(this.f111940a) * 31, 31)) * 31)) * 31;
        String str = this.f111944e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111945f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f111946g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f111947h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f111948i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ui3 ui3Var = this.f111949j;
        int iHashCode7 = (iHashCode6 + (ui3Var == null ? 0 : ui3Var.f116669a.hashCode())) * 31;
        Integer num = this.f111950k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f111951l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        om3 om3Var = this.f111952m;
        return this.f111954o.hashCode() + cb.a(this.f111953n, (iHashCode9 + (om3Var != null ? om3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.f111940a + ", creatives=" + this.f111941b + ", rawTrackingEvents=" + this.f111942c + ", videoAdExtensions=" + this.f111943d + ", adSystem=" + this.f111944e + ", adTitle=" + this.f111945f + ", description=" + this.f111946g + ", survey=" + this.f111947h + ", vastAdTagUri=" + this.f111948i + ", viewableImpression=" + this.f111949j + ", sequence=" + this.f111950k + ", id=" + this.f111951l + ", wrapperConfiguration=" + this.f111952m + ", adVerifications=" + this.f111953n + ", trackingEvents=" + this.f111954o + ")";
    }
}
