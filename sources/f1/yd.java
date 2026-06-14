package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6 f71677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f71679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f71680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k2 f71681e;

    public yd(i6 appRequest, boolean z10, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f71677a = appRequest;
        this.f71678b = z10;
        this.f71679c = num;
        this.f71680d = num2;
        this.f71681e = new k2();
    }

    public final i6 a() {
        return this.f71677a;
    }

    public final Integer b() {
        return this.f71679c;
    }

    public final Integer c() {
        return this.f71680d;
    }

    public final k2 d() {
        return this.f71681e;
    }

    public final boolean e() {
        return this.f71678b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return Intrinsics.areEqual(this.f71677a, ydVar.f71677a) && this.f71678b == ydVar.f71678b && Intrinsics.areEqual(this.f71679c, ydVar.f71679c) && Intrinsics.areEqual(this.f71680d, ydVar.f71680d);
    }

    public int hashCode() {
        int iHashCode = ((this.f71677a.hashCode() * 31) + androidx.compose.foundation.c.a(this.f71678b)) * 31;
        Integer num = this.f71679c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f71680d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f71677a + ", isCacheRequest=" + this.f71678b + ", bannerHeight=" + this.f71679c + ", bannerWidth=" + this.f71680d + ")";
    }
}
