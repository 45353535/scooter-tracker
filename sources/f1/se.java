package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6 f71097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg f71098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.a f71099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f71101e;

    public se(i6 appRequest, dg dgVar, g1.a aVar, long j10, long j11) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f71097a = appRequest;
        this.f71098b = dgVar;
        this.f71099c = aVar;
        this.f71100d = j10;
        this.f71101e = j11;
    }

    public final dg a() {
        return this.f71098b;
    }

    public final g1.a b() {
        return this.f71099c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return Intrinsics.areEqual(this.f71097a, seVar.f71097a) && Intrinsics.areEqual(this.f71098b, seVar.f71098b) && Intrinsics.areEqual(this.f71099c, seVar.f71099c) && this.f71100d == seVar.f71100d && this.f71101e == seVar.f71101e;
    }

    public int hashCode() {
        int iHashCode = this.f71097a.hashCode() * 31;
        dg dgVar = this.f71098b;
        int iHashCode2 = (iHashCode + (dgVar == null ? 0 : dgVar.hashCode())) * 31;
        g1.a aVar = this.f71099c;
        return ((((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + androidx.collection.b.a(this.f71100d)) * 31) + androidx.collection.b.a(this.f71101e);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f71097a + ", adUnit=" + this.f71098b + ", error=" + this.f71099c + ", requestResponseCodeNs=" + this.f71100d + ", readDataNs=" + this.f71101e + ")";
    }

    public /* synthetic */ se(i6 i6Var, dg dgVar, g1.a aVar, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6Var, (i10 & 2) != 0 ? null : dgVar, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? 0L : j10, (i10 & 16) != 0 ? 0L : j11);
    }
}
