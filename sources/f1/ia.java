package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f70113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70114c;

    public ia(String url, q0 clickPreference, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        this.f70112a = url;
        this.f70113b = clickPreference;
        this.f70114c = z10;
    }

    public static /* synthetic */ ia b(ia iaVar, String str, q0 q0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iaVar.f70112a;
        }
        if ((i10 & 2) != 0) {
            q0Var = iaVar.f70113b;
        }
        if ((i10 & 4) != 0) {
            z10 = iaVar.f70114c;
        }
        return iaVar.c(str, q0Var, z10);
    }

    public final q0 a() {
        return this.f70113b;
    }

    public final ia c(String url, q0 clickPreference, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clickPreference, "clickPreference");
        return new ia(url, clickPreference, z10);
    }

    public final String d() {
        return this.f70112a;
    }

    public final boolean e() {
        return this.f70114c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return Intrinsics.areEqual(this.f70112a, iaVar.f70112a) && this.f70113b == iaVar.f70113b && this.f70114c == iaVar.f70114c;
    }

    public int hashCode() {
        return (((this.f70112a.hashCode() * 31) + this.f70113b.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f70114c);
    }

    public String toString() {
        return "UrlArgs(url=" + this.f70112a + ", clickPreference=" + this.f70113b + ", userGesture=" + this.f70114c + ")";
    }
}
