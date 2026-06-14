package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f116198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rd f116199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116200c;

    public td(rd rdVar, rd rdVar2, boolean z10) {
        this.f116198a = rdVar;
        this.f116199b = rdVar2;
        this.f116200c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return Intrinsics.areEqual(this.f116198a, tdVar.f116198a) && Intrinsics.areEqual(this.f116199b, tdVar.f116199b) && this.f116200c == tdVar.f116200c;
    }

    public final int hashCode() {
        rd rdVar = this.f116198a;
        int iHashCode = (rdVar == null ? 0 : rdVar.hashCode()) * 31;
        rd rdVar2 = this.f116199b;
        return androidx.compose.foundation.c.a(this.f116200c) + ((iHashCode + (rdVar2 != null ? rdVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f116198a + ", hmsAdvertisingInfo=" + this.f116199b + ", gmsAdvertisingReset=" + this.f116200c + ")";
    }
}
