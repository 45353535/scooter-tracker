package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class el1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl1 f110409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f110413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f110414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f110415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f110416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f110417i;

    public el1(kl1 kl1Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        fi.a(!z13 || z11);
        fi.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        fi.a(z14);
        this.f110409a = kl1Var;
        this.f110410b = j10;
        this.f110411c = j11;
        this.f110412d = j12;
        this.f110413e = j13;
        this.f110414f = z10;
        this.f110415g = z11;
        this.f110416h = z12;
        this.f110417i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && el1.class == obj.getClass()) {
            el1 el1Var = (el1) obj;
            if (this.f110410b == el1Var.f110410b && this.f110411c == el1Var.f110411c && this.f110412d == el1Var.f110412d && this.f110413e == el1Var.f110413e && this.f110414f == el1Var.f110414f && this.f110415g == el1Var.f110415g && this.f110416h == el1Var.f110416h && this.f110417i == el1Var.f110417i && w83.a(this.f110409a, el1Var.f110409a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f110409a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f110410b)) * 31) + ((int) this.f110411c)) * 31) + ((int) this.f110412d)) * 31) + ((int) this.f110413e)) * 31) + (this.f110414f ? 1 : 0)) * 31) + (this.f110415g ? 1 : 0)) * 31) + (this.f110416h ? 1 : 0)) * 31) + (this.f110417i ? 1 : 0);
    }
}
