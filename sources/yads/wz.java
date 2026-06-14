package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117649b;

    public wz(String str, String str2) {
        this.f117648a = str;
        this.f117649b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        return Intrinsics.areEqual(this.f117648a, wzVar.f117648a) && Intrinsics.areEqual(this.f117649b, wzVar.f117649b);
    }

    public final int hashCode() {
        String str = this.f117648a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117649b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CoreCreative(creativeId=" + this.f117648a + ", campaignId=" + this.f117649b + ")";
    }
}
