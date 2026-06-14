package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class kk1 implements oq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kk1 f112729g = new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nq f112730h = new nq() { // from class: yads.ih
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return kk1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f112731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f112732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f112733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f112734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f112735f;

    public kk1(long j10, long j11, long j12, float f10, float f11) {
        this.f112731b = j10;
        this.f112732c = j11;
        this.f112733d = j12;
        this.f112734e = f10;
        this.f112735f = f11;
    }

    public static kk1 a(Bundle bundle) {
        return new kk1(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return this.f112731b == kk1Var.f112731b && this.f112732c == kk1Var.f112732c && this.f112733d == kk1Var.f112733d && this.f112734e == kk1Var.f112734e && this.f112735f == kk1Var.f112735f;
    }

    public final int hashCode() {
        long j10 = this.f112731b;
        long j11 = this.f112732c;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f112733d;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f112734e;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f112735f;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
