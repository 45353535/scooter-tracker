package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f70686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f70688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f70689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f70690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f70691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f70692k;

    public ne(int i10, int i11, int i12, int i13, float f10, String str, int i14, String deviceType, String str2, String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.f70682a = i10;
        this.f70683b = i11;
        this.f70684c = i12;
        this.f70685d = i13;
        this.f70686e = f10;
        this.f70687f = str;
        this.f70688g = i14;
        this.f70689h = deviceType;
        this.f70690i = str2;
        this.f70691j = str3;
        this.f70692k = z10;
    }

    public final int a() {
        return this.f70683b;
    }

    public final String b() {
        return this.f70689h;
    }

    public final int c() {
        return this.f70682a;
    }

    public final String d() {
        return this.f70687f;
    }

    public final int e() {
        return this.f70685d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj;
        return this.f70682a == neVar.f70682a && this.f70683b == neVar.f70683b && this.f70684c == neVar.f70684c && this.f70685d == neVar.f70685d && Float.compare(this.f70686e, neVar.f70686e) == 0 && Intrinsics.areEqual(this.f70687f, neVar.f70687f) && this.f70688g == neVar.f70688g && Intrinsics.areEqual(this.f70689h, neVar.f70689h) && Intrinsics.areEqual(this.f70690i, neVar.f70690i) && Intrinsics.areEqual(this.f70691j, neVar.f70691j) && this.f70692k == neVar.f70692k;
    }

    public final int f() {
        return this.f70688g;
    }

    public final String g() {
        return this.f70690i;
    }

    public final float h() {
        return this.f70686e;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((this.f70682a * 31) + this.f70683b) * 31) + this.f70684c) * 31) + this.f70685d) * 31) + Float.floatToIntBits(this.f70686e)) * 31;
        String str = this.f70687f;
        int iHashCode = (((((iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31) + this.f70688g) * 31) + this.f70689h.hashCode()) * 31;
        String str2 = this.f70690i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70691j;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + androidx.compose.foundation.c.a(this.f70692k);
    }

    public final String i() {
        return this.f70691j;
    }

    public final int j() {
        return this.f70684c;
    }

    public final boolean k() {
        return this.f70692k;
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.f70682a + ", deviceHeight=" + this.f70683b + ", width=" + this.f70684c + ", height=" + this.f70685d + ", scale=" + this.f70686e + ", dpi=" + this.f70687f + ", ortbDeviceType=" + this.f70688g + ", deviceType=" + this.f70689h + ", packageName=" + this.f70690i + ", versionName=" + this.f70691j + ", isPortrait=" + this.f70692k + ")";
    }

    public /* synthetic */ ne(int i10, int i11, int i12, int i13, float f10, String str, int i14, String str2, String str3, String str4, boolean z10, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i10, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0.0f : f10, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? k.f70223a : i14, (i15 & 128) != 0 ? "phone" : str2, (i15 & 256) != 0 ? null : str3, (i15 & 512) != 0 ? null : str4, (i15 & 1024) != 0 ? true : z10);
    }
}
