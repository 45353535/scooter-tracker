package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f70088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dg f70089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f70090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70091g;

    public i6(int i10, String location, String str, a aVar, dg dgVar, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70085a = i10;
        this.f70086b = location;
        this.f70087c = str;
        this.f70088d = aVar;
        this.f70089e = dgVar;
        this.f70090f = z10;
        this.f70091g = z11;
    }

    public final dg a() {
        return this.f70089e;
    }

    public final void b(a aVar) {
        this.f70088d = aVar;
    }

    public final void c(dg dgVar) {
        this.f70089e = dgVar;
    }

    public final void d(String str) {
        this.f70087c = str;
    }

    public final void e(boolean z10) {
        this.f70090f = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return this.f70085a == i6Var.f70085a && Intrinsics.areEqual(this.f70086b, i6Var.f70086b) && Intrinsics.areEqual(this.f70087c, i6Var.f70087c) && Intrinsics.areEqual(this.f70088d, i6Var.f70088d) && Intrinsics.areEqual(this.f70089e, i6Var.f70089e) && this.f70090f == i6Var.f70090f && this.f70091g == i6Var.f70091g;
    }

    public final a f() {
        return this.f70088d;
    }

    public final void g(boolean z10) {
        this.f70091g = z10;
    }

    public final String h() {
        return this.f70087c;
    }

    public int hashCode() {
        int iHashCode = ((this.f70085a * 31) + this.f70086b.hashCode()) * 31;
        String str = this.f70087c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f70088d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dg dgVar = this.f70089e;
        return ((((iHashCode3 + (dgVar != null ? dgVar.hashCode() : 0)) * 31) + androidx.compose.foundation.c.a(this.f70090f)) * 31) + androidx.compose.foundation.c.a(this.f70091g);
    }

    public final String i() {
        return this.f70086b;
    }

    public final boolean j() {
        return this.f70091g;
    }

    public String toString() {
        return "AppRequest(id=" + this.f70085a + ", location=" + this.f70086b + ", bidResponse=" + this.f70087c + ", bannerData=" + this.f70088d + ", adUnit=" + this.f70089e + ", isTrackedCache=" + this.f70090f + ", isTrackedShow=" + this.f70091g + ")";
    }

    public /* synthetic */ i6(int i10, String str, String str2, a aVar, dg dgVar, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? null : dgVar, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? false : z11);
    }
}
