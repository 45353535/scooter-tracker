package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f110256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Location f110257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f110258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f110260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bn2 f110261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f110262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f110263l;

    public e9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, bn2 bn2Var, boolean z10, String str7) {
        this.f110252a = str;
        this.f110253b = str2;
        this.f110254c = str3;
        this.f110255d = str4;
        this.f110256e = list;
        this.f110257f = location;
        this.f110258g = map;
        this.f110259h = str5;
        this.f110260i = str6;
        this.f110261j = bn2Var;
        this.f110262k = z10;
        this.f110263l = str7;
    }

    public static e9 a(e9 e9Var, Map map, String str, int i10) {
        String str2 = e9Var.f110252a;
        String str3 = e9Var.f110253b;
        String str4 = e9Var.f110254c;
        String str5 = e9Var.f110255d;
        List list = e9Var.f110256e;
        Location location = e9Var.f110257f;
        if ((i10 & 64) != 0) {
            map = e9Var.f110258g;
        }
        return new e9(str2, str3, str4, str5, list, location, map, e9Var.f110259h, e9Var.f110260i, e9Var.f110261j, e9Var.f110262k, (i10 & 2048) != 0 ? e9Var.f110263l : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return Intrinsics.areEqual(this.f110252a, e9Var.f110252a) && Intrinsics.areEqual(this.f110253b, e9Var.f110253b) && Intrinsics.areEqual(this.f110254c, e9Var.f110254c) && Intrinsics.areEqual(this.f110255d, e9Var.f110255d) && Intrinsics.areEqual(this.f110256e, e9Var.f110256e) && Intrinsics.areEqual(this.f110257f, e9Var.f110257f) && Intrinsics.areEqual(this.f110258g, e9Var.f110258g) && Intrinsics.areEqual(this.f110259h, e9Var.f110259h) && Intrinsics.areEqual(this.f110260i, e9Var.f110260i) && this.f110261j == e9Var.f110261j && this.f110262k == e9Var.f110262k && Intrinsics.areEqual(this.f110263l, e9Var.f110263l);
    }

    public final int hashCode() {
        int iHashCode = this.f110252a.hashCode() * 31;
        String str = this.f110253b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110254c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110255d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f110256e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f110257f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.f110258g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f110259h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f110260i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        bn2 bn2Var = this.f110261j;
        int iA = (androidx.compose.foundation.c.a(this.f110262k) + ((iHashCode9 + (bn2Var == null ? 0 : bn2Var.hashCode())) * 31)) * 31;
        String str6 = this.f110263l;
        return iA + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequestData(adUnitId=" + this.f110252a + ", age=" + this.f110253b + ", gender=" + this.f110254c + ", contextQuery=" + this.f110255d + ", contextTags=" + this.f110256e + ", location=" + this.f110257f + ", parameters=" + this.f110258g + ", openBiddingData=" + this.f110259h + ", readyResponse=" + this.f110260i + ", preferredTheme=" + this.f110261j + ", shouldLoadImagesAutomatically=" + this.f110262k + ", preloadType=" + this.f110263l + ")";
    }
}
