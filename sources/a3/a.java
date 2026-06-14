package a3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3773b;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f3772a = name;
        this.f3773b = z10;
    }

    public final String a() {
        return this.f3772a;
    }

    public final boolean b() {
        return this.f3773b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f3772a, aVar.f3772a) && this.f3773b == aVar.f3773b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f3772a.hashCode() * 31;
        boolean z10 = this.f3773b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f3772a + ", value=" + this.f3773b + ')';
    }
}
