package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n10 implements ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f113680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f113681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q10 f113682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zx2 f113684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f113685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f113686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f113687j;

    public n10(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, q10 q10Var, String str, zx2 zx2Var, String str2, int i10, String str3) {
        this.f113678a = arrayList;
        this.f113679b = arrayList2;
        this.f113680c = arrayList3;
        this.f113681d = arrayList4;
        this.f113682e = q10Var;
        this.f113683f = str;
        this.f113684g = zx2Var;
        this.f113685h = str2;
        this.f113686i = i10;
        this.f113687j = str3;
    }

    @Override // yads.ah3
    public final Map a() {
        List<k53> list = this.f113681d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (k53 k53Var : list) {
            String str = k53Var.f112597a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(k53Var.f112598b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n10)) {
            return false;
        }
        n10 n10Var = (n10) obj;
        return Intrinsics.areEqual(this.f113678a, n10Var.f113678a) && Intrinsics.areEqual(this.f113679b, n10Var.f113679b) && Intrinsics.areEqual(this.f113680c, n10Var.f113680c) && Intrinsics.areEqual(this.f113681d, n10Var.f113681d) && Intrinsics.areEqual(this.f113682e, n10Var.f113682e) && Intrinsics.areEqual(this.f113683f, n10Var.f113683f) && Intrinsics.areEqual(this.f113684g, n10Var.f113684g) && Intrinsics.areEqual(this.f113685h, n10Var.f113685h) && this.f113686i == n10Var.f113686i && Intrinsics.areEqual(this.f113687j, n10Var.f113687j);
    }

    public final int hashCode() {
        int iA = cb.a(this.f113681d, cb.a(this.f113680c, cb.a(this.f113679b, this.f113678a.hashCode() * 31, 31), 31), 31);
        q10 q10Var = this.f113682e;
        int iHashCode = (iA + (q10Var == null ? 0 : q10Var.hashCode())) * 31;
        String str = this.f113683f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zx2 zx2Var = this.f113684g;
        int iHashCode3 = (iHashCode2 + (zx2Var == null ? 0 : zx2Var.hashCode())) * 31;
        String str2 = this.f113685h;
        int iA2 = bb3.a(this.f113686i, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f113687j;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.f113678a + ", interactiveCreativeFiles=" + this.f113679b + ", icons=" + this.f113680c + ", trackingEventsList=" + this.f113681d + ", creativeExtensions=" + this.f113682e + ", clickThroughUrl=" + this.f113683f + ", skipOffset=" + this.f113684g + ", id=" + this.f113685h + ", durationMillis=" + this.f113686i + ", adParameters=" + this.f113687j + ")";
    }
}
