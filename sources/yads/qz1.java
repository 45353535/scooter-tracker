package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i5 f115235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f115236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f115237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f115238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f115239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zv2 f115240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a7 f115241j;

    public qz1(List list, List list2, List list3, i5 i5Var, Map map, List list4, List list5, String str, zv2 zv2Var, a7 a7Var) {
        this.f115232a = list;
        this.f115233b = list2;
        this.f115234c = list3;
        this.f115235d = i5Var;
        this.f115236e = map;
        this.f115237f = list4;
        this.f115238g = list5;
        this.f115239h = str;
        this.f115240i = zv2Var;
        this.f115241j = a7Var;
    }

    public final List a() {
        return this.f115237f;
    }

    public final zv2 b() {
        return this.f115240i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1Var = (qz1) obj;
        return Intrinsics.areEqual(this.f115232a, qz1Var.f115232a) && Intrinsics.areEqual(this.f115233b, qz1Var.f115233b) && Intrinsics.areEqual(this.f115234c, qz1Var.f115234c) && Intrinsics.areEqual(this.f115235d, qz1Var.f115235d) && Intrinsics.areEqual(this.f115236e, qz1Var.f115236e) && Intrinsics.areEqual(this.f115237f, qz1Var.f115237f) && Intrinsics.areEqual(this.f115238g, qz1Var.f115238g) && Intrinsics.areEqual(this.f115239h, qz1Var.f115239h) && Intrinsics.areEqual(this.f115240i, qz1Var.f115240i) && Intrinsics.areEqual(this.f115241j, qz1Var.f115241j);
    }

    public final int hashCode() {
        int iA = cb.a(this.f115234c, cb.a(this.f115233b, this.f115232a.hashCode() * 31, 31), 31);
        i5 i5Var = this.f115235d;
        int iA2 = cb.a(this.f115238g, cb.a(this.f115237f, (this.f115236e.hashCode() + ((iA + (i5Var == null ? 0 : i5Var.f111860b.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f115239h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        zv2 zv2Var = this.f115240i;
        int iHashCode2 = (iHashCode + (zv2Var == null ? 0 : zv2Var.hashCode())) * 31;
        a7 a7Var = this.f115241j;
        return iHashCode2 + (a7Var != null ? a7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f115232a + ", assets=" + this.f115233b + ", renderTrackingUrls=" + this.f115234c + ", impressionData=" + this.f115235d + ", properties=" + this.f115236e + ", divKitDesigns=" + this.f115237f + ", showNotices=" + this.f115238g + ", version=" + this.f115239h + ", settings=" + this.f115240i + ", adPod=" + this.f115241j + ")";
    }
}
