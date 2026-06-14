package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl2 f113720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl2 f113721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl2 f113722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xl2 f113723d;

    public n41(xl2 xl2Var, xl2 xl2Var2, xl2 xl2Var3, xl2 xl2Var4) {
        this.f113720a = xl2Var;
        this.f113721b = xl2Var2;
        this.f113722c = xl2Var3;
        this.f113723d = xl2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n41)) {
            return false;
        }
        n41 n41Var = (n41) obj;
        return this.f113720a == n41Var.f113720a && this.f113721b == n41Var.f113721b && this.f113722c == n41Var.f113722c && this.f113723d == n41Var.f113723d;
    }

    public final int hashCode() {
        return this.f113723d.hashCode() + ((this.f113722c.hashCode() + ((this.f113721b.hashCode() + (this.f113720a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f113720a + ", impressionTrackingStartReportType=" + this.f113721b + ", impressionTrackingFailureReportType=" + this.f113722c + ", forcedImpressionTrackingFailureReportType=" + this.f113723d + ")";
    }
}
