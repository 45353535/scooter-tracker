package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114179c;

    public o30(String str, String str2, String str3) {
        this.f114177a = str;
        this.f114178b = str2;
        this.f114179c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o30)) {
            return false;
        }
        o30 o30Var = (o30) obj;
        return Intrinsics.areEqual(this.f114177a, o30Var.f114177a) && Intrinsics.areEqual(this.f114178b, o30Var.f114178b) && Intrinsics.areEqual(this.f114179c, o30Var.f114179c);
    }

    public final int hashCode() {
        String str = this.f114177a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f114178b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f114179c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.f114177a + ", appReviewStatus=" + this.f114178b + ", appAdsTxt=" + this.f114179c + ")";
    }
}
