package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f70514b;

    public n2(String url, Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f70513a = url;
        this.f70514b = bool;
    }

    public final Boolean a() {
        return this.f70514b;
    }

    public final String b() {
        return this.f70513a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return Intrinsics.areEqual(this.f70513a, n2Var.f70513a) && Intrinsics.areEqual(this.f70514b, n2Var.f70514b);
    }

    public int hashCode() {
        int iHashCode = this.f70513a.hashCode() * 31;
        Boolean bool = this.f70514b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.f70513a + ", shouldDismiss=" + this.f70514b + ")";
    }
}
