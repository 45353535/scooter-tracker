package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ne2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f113843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f113844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oa0 f113845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f113846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f113847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f113848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f113849i;

    public ne2(String str, String str2, Map map, Integer num, oa0 oa0Var, List list, List list2, String str3, String str4) {
        this.f113841a = str;
        this.f113842b = str2;
        this.f113843c = map;
        this.f113844d = num;
        this.f113845e = oa0Var;
        this.f113846f = list;
        this.f113847g = list2;
        this.f113848h = str3;
        this.f113849i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne2)) {
            return false;
        }
        ne2 ne2Var = (ne2) obj;
        return Intrinsics.areEqual(this.f113841a, ne2Var.f113841a) && Intrinsics.areEqual(this.f113842b, ne2Var.f113842b) && Intrinsics.areEqual(this.f113843c, ne2Var.f113843c) && Intrinsics.areEqual(this.f113844d, ne2Var.f113844d) && this.f113845e == ne2Var.f113845e && Intrinsics.areEqual(this.f113846f, ne2Var.f113846f) && Intrinsics.areEqual(this.f113847g, ne2Var.f113847g) && Intrinsics.areEqual(this.f113848h, ne2Var.f113848h) && Intrinsics.areEqual(this.f113849i, ne2Var.f113849i);
    }

    public final int hashCode() {
        int iA = j4.a(this.f113842b, this.f113841a.hashCode() * 31, 31);
        Map map = this.f113843c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f113844d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        oa0 oa0Var = this.f113845e;
        int iHashCode3 = (iHashCode2 + (oa0Var == null ? 0 : oa0Var.hashCode())) * 31;
        List list = this.f113846f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f113847g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f113848h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113849i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.f113841a + ", url=" + this.f113842b + ", extras=" + this.f113843c + ", flags=" + this.f113844d + ", launchMode=" + this.f113845e + ", trackingUrls=" + this.f113846f + ", fallbackTrackingUrls=" + this.f113847g + ", deeplinkType=" + this.f113848h + ", className=" + this.f113849i + ")";
    }
}
