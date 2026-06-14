package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final AtomicLong f84323d = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f84324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f84325c;

    public z() {
        this(d(), d());
    }

    private static long d() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f84323d;
            j10 = atomicLong.get();
            long j12 = (j10 >> 12) ^ j10;
            long j13 = j12 ^ (j12 << 25);
            j11 = (j13 ^ (j13 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    public void g(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            this.f84324b = (this.f84324b * 6364136223846793005L) + this.f84325c;
            bArr[i10] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    public double h() {
        long j10 = this.f84324b * 6364136223846793005L;
        long j11 = this.f84325c;
        long j12 = j10 + j11;
        long j13 = (((j12 >>> 22) ^ j12) >>> ((int) ((j12 >>> 61) + 22))) & 4294967295L;
        this.f84324b = (j12 * 6364136223846793005L) + j11;
        return (((j13 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public void i(long j10, long j11) {
        long j12 = (j11 << 1) | 1;
        this.f84325c = j12;
        this.f84324b = j12 + j10;
    }

    public z(long j10, long j11) {
        i(j10, j11);
    }
}
