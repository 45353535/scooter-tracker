package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110637b;

    public f8(boolean z10, int i10) {
        this.f110636a = i10;
        this.f110637b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f110636a == f8Var.f110636a && this.f110637b == f8Var.f110637b;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f110637b) + (this.f110636a * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f110636a + ", disabled=" + this.f110637b + ")";
    }
}
