package io.bidmachine.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;
import ga.f0;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.b f81227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f81231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f81232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f81233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f81234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f81235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f81236j;

    n1(f0.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        q9.a.a(!z14 || z12);
        q9.a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        q9.a.a(z15);
        this.f81227a = bVar;
        this.f81228b = j10;
        this.f81229c = j11;
        this.f81230d = j12;
        this.f81231e = j13;
        this.f81232f = z10;
        this.f81233g = z11;
        this.f81234h = z12;
        this.f81235i = z13;
        this.f81236j = z14;
    }

    public n1 a(long j10) {
        return j10 == this.f81229c ? this : new n1(this.f81227a, this.f81228b, j10, this.f81230d, this.f81231e, this.f81232f, this.f81233g, this.f81234h, this.f81235i, this.f81236j);
    }

    public n1 b(long j10) {
        return j10 == this.f81228b ? this : new n1(this.f81227a, j10, this.f81229c, this.f81230d, this.f81231e, this.f81232f, this.f81233g, this.f81234h, this.f81235i, this.f81236j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f81228b == n1Var.f81228b && this.f81229c == n1Var.f81229c && this.f81230d == n1Var.f81230d && this.f81231e == n1Var.f81231e && this.f81232f == n1Var.f81232f && this.f81233g == n1Var.f81233g && this.f81234h == n1Var.f81234h && this.f81235i == n1Var.f81235i && this.f81236j == n1Var.f81236j && Objects.equals(this.f81227a, n1Var.f81227a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f81227a.hashCode()) * 31) + ((int) this.f81228b)) * 31) + ((int) this.f81229c)) * 31) + ((int) this.f81230d)) * 31) + ((int) this.f81231e)) * 31) + (this.f81232f ? 1 : 0)) * 31) + (this.f81233g ? 1 : 0)) * 31) + (this.f81234h ? 1 : 0)) * 31) + (this.f81235i ? 1 : 0)) * 31) + (this.f81236j ? 1 : 0);
    }
}
