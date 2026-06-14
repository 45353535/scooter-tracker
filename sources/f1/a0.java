package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f69352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f69353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f69354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gd f69355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f69356i;

    public a0(String location, String adId, String to, String cgn, String creative, Float f10, Float f11, gd impressionMediaType, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(impressionMediaType, "impressionMediaType");
        this.f69348a = location;
        this.f69349b = adId;
        this.f69350c = to;
        this.f69351d = cgn;
        this.f69352e = creative;
        this.f69353f = f10;
        this.f69354g = f11;
        this.f69355h = impressionMediaType;
        this.f69356i = bool;
    }

    public final String a() {
        return this.f69349b;
    }

    public final String b() {
        return this.f69351d;
    }

    public final String c() {
        return this.f69352e;
    }

    public final gd d() {
        return this.f69355h;
    }

    public final String e() {
        return this.f69348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f69348a, a0Var.f69348a) && Intrinsics.areEqual(this.f69349b, a0Var.f69349b) && Intrinsics.areEqual(this.f69350c, a0Var.f69350c) && Intrinsics.areEqual(this.f69351d, a0Var.f69351d) && Intrinsics.areEqual(this.f69352e, a0Var.f69352e) && Intrinsics.areEqual((Object) this.f69353f, (Object) a0Var.f69353f) && Intrinsics.areEqual((Object) this.f69354g, (Object) a0Var.f69354g) && this.f69355h == a0Var.f69355h && Intrinsics.areEqual(this.f69356i, a0Var.f69356i);
    }

    public final Boolean f() {
        return this.f69356i;
    }

    public final String g() {
        return this.f69350c;
    }

    public final Float h() {
        return this.f69354g;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f69348a.hashCode() * 31) + this.f69349b.hashCode()) * 31) + this.f69350c.hashCode()) * 31) + this.f69351d.hashCode()) * 31) + this.f69352e.hashCode()) * 31;
        Float f10 = this.f69353f;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f69354g;
        int iHashCode3 = (((iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31) + this.f69355h.hashCode()) * 31;
        Boolean bool = this.f69356i;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Float i() {
        return this.f69353f;
    }

    public String toString() {
        return "ClickParams(location=" + this.f69348a + ", adId=" + this.f69349b + ", to=" + this.f69350c + ", cgn=" + this.f69351d + ", creative=" + this.f69352e + ", videoPosition=" + this.f69353f + ", videoDuration=" + this.f69354g + ", impressionMediaType=" + this.f69355h + ", retargetReinstall=" + this.f69356i + ")";
    }
}
