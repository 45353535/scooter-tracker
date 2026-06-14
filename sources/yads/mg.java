package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113463c;

    public mg(String str, String str2, String str3) {
        this.f113461a = str;
        this.f113462b = str2;
        this.f113463c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        return Intrinsics.areEqual(this.f113461a, mgVar.f113461a) && Intrinsics.areEqual(this.f113462b, mgVar.f113462b) && Intrinsics.areEqual(this.f113463c, mgVar.f113463c);
    }

    public final int hashCode() {
        String str = this.f113461a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113462b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f113463c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaIdentifiers(adGetUrl=" + this.f113461a + ", deviceId=" + this.f113462b + ", uuid=" + this.f113463c + ")";
    }
}
