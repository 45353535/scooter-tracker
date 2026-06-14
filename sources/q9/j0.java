package q9;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f98805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f98806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f98808d = new ThreadLocal();

    public j0(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return o0.c1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return o0.c1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f98805a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.e((Long) this.f98808d.get())).longValue();
                }
                this.f98806b = jLongValue - j10;
                notifyAll();
            }
            this.f98807c = j10;
            return j10 + this.f98806b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f98807c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f98807c;
        if (j11 != -9223372036854775807L) {
            long jK = k(j11);
            long j12 = jK / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            j10 += (j12 + 1) * 8589934592L;
            if (j13 >= jK) {
                j10 = j13;
            }
        }
        return a(h(j10));
    }

    public synchronized long d() {
        long j10;
        j10 = this.f98805a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f98807c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f98806b : d();
    }

    public synchronized long f() {
        return this.f98806b;
    }

    public synchronized boolean g() {
        return this.f98806b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f98805a = j10;
        this.f98806b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f98807c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) {
        try {
            a.g(this.f98805a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f98808d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        a.g(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
