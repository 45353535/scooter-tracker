package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fk1 implements oq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nq f110744g = new nq() { // from class: yads.q6
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return fk1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f110747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f110748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f110749f;

    public fk1(ek1 ek1Var) {
        this.f110745b = ek1Var.f110392a;
        this.f110746c = ek1Var.f110393b;
        this.f110747d = ek1Var.f110394c;
        this.f110748e = ek1Var.f110395d;
        this.f110749f = ek1Var.f110396e;
    }

    public static gk1 a(Bundle bundle) {
        ek1 ek1Var = new ek1();
        long j10 = bundle.getLong(Integer.toString(0, 36), 0L);
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        ek1Var.f110392a = j10;
        long j11 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE && j11 < 0) {
            throw new IllegalArgumentException();
        }
        ek1Var.f110393b = j11;
        ek1Var.f110394c = bundle.getBoolean(Integer.toString(2, 36), false);
        ek1Var.f110395d = bundle.getBoolean(Integer.toString(3, 36), false);
        ek1Var.f110396e = bundle.getBoolean(Integer.toString(4, 36), false);
        return new gk1(ek1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        return this.f110745b == fk1Var.f110745b && this.f110746c == fk1Var.f110746c && this.f110747d == fk1Var.f110747d && this.f110748e == fk1Var.f110748e && this.f110749f == fk1Var.f110749f;
    }

    public final int hashCode() {
        long j10 = this.f110745b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f110746c;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f110747d ? 1 : 0)) * 31) + (this.f110748e ? 1 : 0)) * 31) + (this.f110749f ? 1 : 0);
    }
}
