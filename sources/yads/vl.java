package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117055d;

    public vl(String str, String str2, String str3, String str4) {
        this.f117052a = str;
        this.f117053b = str2;
        this.f117054c = str3;
        this.f117055d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        return Intrinsics.areEqual(this.f117052a, vlVar.f117052a) && Intrinsics.areEqual(this.f117053b, vlVar.f117053b) && Intrinsics.areEqual(this.f117054c, vlVar.f117054c) && Intrinsics.areEqual(this.f117055d, vlVar.f117055d);
    }

    public final int hashCode() {
        String str = this.f117052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117053b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117054c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f117055d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundColors(top=" + this.f117052a + ", right=" + this.f117053b + ", left=" + this.f117054c + ", bottom=" + this.f117055d + ")";
    }
}
