package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk f110302b;

    public ec(String str, bk bkVar) {
        this.f110301a = str;
        this.f110302b = bkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return Intrinsics.areEqual(this.f110301a, ecVar.f110301a) && Intrinsics.areEqual(this.f110302b, ecVar.f110302b);
    }

    public final int hashCode() {
        String str = this.f110301a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        bk bkVar = this.f110302b;
        return iHashCode + (bkVar != null ? bkVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInfo(skuId=" + this.f110301a + ", attributes=" + this.f110302b + ")";
    }
}
