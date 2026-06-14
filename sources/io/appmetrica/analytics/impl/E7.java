package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class E7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75729b;

    public E7(int i10, long j10) {
        this.f75728a = j10;
        this.f75729b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e72 = (E7) obj;
        return this.f75728a == e72.f75728a && this.f75729b == e72.f75729b;
    }

    public final int hashCode() {
        return this.f75729b + (androidx.collection.b.a(this.f75728a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f75728a + ", exponent=" + this.f75729b + ')';
    }
}
