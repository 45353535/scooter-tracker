package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class l43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f112967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f112968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f112969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f112970d = new ThreadLocal();

    public l43(long j10) {
        c(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f112968b == -9223372036854775807L) {
                long jLongValue = this.f112967a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f112970d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f112968b = jLongValue - j10;
                notifyAll();
            }
            this.f112969c = j10;
            return j10 + this.f112968b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f112969c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(long j10) {
        this.f112967a = j10;
        this.f112968b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f112969c = -9223372036854775807L;
    }

    public final synchronized long b() {
        return this.f112968b;
    }

    public final synchronized long a() {
        long j10;
        j10 = this.f112967a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }
}
