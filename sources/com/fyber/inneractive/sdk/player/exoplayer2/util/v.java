package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f23160c = -9223372036854775807L;

    public v(long j10) {
        c(j10);
    }

    public final long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f23160c != -9223372036854775807L) {
            this.f23160c = j10;
        } else {
            long j11 = this.f23158a;
            if (j11 != Long.MAX_VALUE) {
                this.f23159b = j11 - j10;
            }
            synchronized (this) {
                this.f23160c = j10;
                notifyAll();
            }
        }
        return j10 + this.f23159b;
    }

    public final long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f23160c != -9223372036854775807L) {
            long j11 = (this.f23160c * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - j11) < Math.abs(j10 - j11)) {
                j10 = j13;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized void c(long j10) {
        if (this.f23160c != -9223372036854775807L) {
            throw new IllegalStateException();
        }
        this.f23158a = j10;
    }
}
