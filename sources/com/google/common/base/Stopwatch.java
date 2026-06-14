package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Stopwatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ticker f28958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28961d;

    /* JADX INFO: renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28962a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f28962a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28962a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28962a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28962a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28962a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28962a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28962a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    Stopwatch() {
        this.f28958a = Ticker.systemTicker();
    }

    private static String a(TimeUnit timeUnit) {
        switch (AnonymousClass1.f28962a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    private long c() {
        return this.f28959b ? (this.f28958a.read() - this.f28961d) + this.f28960c : this.f28960c;
    }

    public static Stopwatch createStarted() {
        return new Stopwatch().start();
    }

    public static Stopwatch createUnstarted() {
        return new Stopwatch();
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(c(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f28959b;
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
        this.f28960c = 0L;
        this.f28959b = false;
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
        Preconditions.checkState(!this.f28959b, "This stopwatch is already running.");
        this.f28959b = true;
        this.f28961d = this.f28958a.read();
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
        long j10 = this.f28958a.read();
        Preconditions.checkState(this.f28959b, "This stopwatch is already stopped.");
        this.f28959b = false;
        this.f28960c += j10 - this.f28961d;
        return this;
    }

    public String toString() {
        long jC = c();
        TimeUnit timeUnitB = b(jC);
        return Platform.c(jC / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }

    public static Stopwatch createStarted(Ticker ticker) {
        return new Stopwatch(ticker).start();
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
        return new Stopwatch(ticker);
    }

    Stopwatch(Ticker ticker) {
        this.f28958a = (Ticker) Preconditions.checkNotNull(ticker, "ticker");
    }
}
