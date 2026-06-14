package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6 f69693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69694b;

    public e1(f6 advertisingIDState, String str) {
        Intrinsics.checkNotNullParameter(advertisingIDState, "advertisingIDState");
        this.f69693a = advertisingIDState;
        this.f69694b = str;
    }

    public final String a() {
        return this.f69694b;
    }

    public final f6 b() {
        return this.f69693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f69693a == e1Var.f69693a && Intrinsics.areEqual(this.f69694b, e1Var.f69694b);
    }

    public int hashCode() {
        int iHashCode = this.f69693a.hashCode() * 31;
        String str = this.f69694b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f69693a + ", advertisingID=" + this.f69694b + ")";
    }
}
