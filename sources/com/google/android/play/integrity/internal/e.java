package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes9.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28784b;

    e(int i10, long j10) {
        this.f28783a = i10;
        this.f28784b = j10;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f28783a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f28784b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f28783a == fVar.a() && this.f28784b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28784b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f28783a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f28783a + ", eventTimestamp=" + this.f28784b + "}";
    }
}
