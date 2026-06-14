package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f118859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f118860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bn2 f118861g;

    public zw0(String str, String str2, String str3, String str4, List list, Map map, bn2 bn2Var) {
        this.f118855a = str;
        this.f118856b = str2;
        this.f118857c = str3;
        this.f118858d = str4;
        this.f118859e = list;
        this.f118860f = map;
        this.f118861g = bn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw0)) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return Intrinsics.areEqual(this.f118855a, zw0Var.f118855a) && Intrinsics.areEqual(this.f118856b, zw0Var.f118856b) && Intrinsics.areEqual(this.f118857c, zw0Var.f118857c) && Intrinsics.areEqual(this.f118858d, zw0Var.f118858d) && Intrinsics.areEqual(this.f118859e, zw0Var.f118859e) && Intrinsics.areEqual(this.f118860f, zw0Var.f118860f) && this.f118861g == zw0Var.f118861g;
    }

    public final int hashCode() {
        int iHashCode = this.f118855a.hashCode() * 31;
        String str = this.f118856b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f118857c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f118858d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f118859e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f118860f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        bn2 bn2Var = this.f118861g;
        return iHashCode6 + (bn2Var != null ? bn2Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.f118855a + ", age=" + this.f118856b + ", gender=" + this.f118857c + ", contextQuery=" + this.f118858d + ", contextTags=" + this.f118859e + ", parameters=" + this.f118860f + ", preferredTheme=" + this.f118861g + ")";
    }
}
