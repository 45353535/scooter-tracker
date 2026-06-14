package j$.util.concurrent;

import j$.util.r0;
import j$.util.stream.A;
import j$.util.stream.C5698g0;
import j$.util.stream.C5718k0;
import j$.util.stream.C5776w;
import j$.util.stream.EnumC5671a3;
import j$.util.stream.IntStream;
import j$.util.stream.StreamSupport;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84850c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f84844d = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f84845e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f84846f = new t();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLong f84847g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ ThreadLocalRandom(int i10) {
        this();
    }

    public static int e(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f84850c = true;
    }

    public static final void d() {
        int iAddAndGet = f84845e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jF = f(f84847g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f84846f.get();
        threadLocalRandom.f84848a = jF;
        threadLocalRandom.f84849b = iAddAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f84846f.get();
        if (threadLocalRandom.f84849b == 0) {
            d();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.f84850c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j10 = this.f84848a - 7046029254386353131L;
        this.f84848a = j10;
        return j10;
    }

    @Override // java.util.Random
    public final int next(int i10) {
        return nextInt() >>> (32 - i10);
    }

    public final long c(long j10, long j11) {
        long jF = f(g());
        if (j10 >= j11) {
            return jF;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (jF & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = jF >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                jF = f(g());
            }
        } else {
            while (true) {
                if (jF >= j10 && jF < j11) {
                    return jF;
                }
                jF = f(g());
            }
        }
    }

    public final int b(int i10, int i11) {
        int iE = e(g());
        if (i10 >= i11) {
            return iE;
        }
        int i12 = i11 - i10;
        int i13 = i12 - 1;
        if ((i12 & i13) == 0) {
            return (iE & i13) + i10;
        }
        if (i12 > 0) {
            int iE2 = iE >>> 1;
            while (true) {
                int i14 = iE2 + i13;
                int i15 = iE2 % i12;
                if (i14 - i15 >= 0) {
                    return i15 + i10;
                }
                iE2 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (iE >= i10 && iE < i11) {
                    return iE;
                }
                iE = e(g());
            }
        }
    }

    public final double a(double d10, double d11) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return dNextLong;
        }
        double d12 = ((d11 - d10) * dNextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    @Override // java.util.Random
    public int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iE = e(g());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return iE & i11;
        }
        while (true) {
            int i12 = iE >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            iE = e(g());
        }
    }

    public int nextInt(int i10, int i11) {
        if (i10 >= i11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i10, i11);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public long nextLong(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jF = f(g());
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return jF & j11;
        }
        while (true) {
            long j12 = jF >>> 1;
            long j13 = j12 + j11;
            long j14 = j12 % j10;
            if (j13 - j14 >= 0) {
                return j14;
            }
            jF = f(g());
        }
    }

    public long nextLong(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j10, j11);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dF = (f(g()) >>> 11) * 1.1102230246251565E-16d * d10;
        return dF < d10 ? dF : Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1);
    }

    public final double nextDouble(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d10, d11);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return e(g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (e(g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f84844d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j10) {
        if (j10 >= 0) {
            return IntStream.Wrapper.convert(StreamSupport.intStream(new v(0L, j10, Integer.MAX_VALUE, 0), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        return IntStream.Wrapper.convert(StreamSupport.intStream(new v(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j10, int i10, int i11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i10 < i11) {
            return IntStream.Wrapper.convert(StreamSupport.intStream(new v(0L, j10, i10, i11), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return IntStream.Wrapper.convert(StreamSupport.intStream(new v(0L, Long.MAX_VALUE, i10, i11), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        w wVar = new w(0L, j10, Long.MAX_VALUE, 0L);
        return C5718k0.k(new C5698g0(wVar, EnumC5671a3.m(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        w wVar = new w(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L);
        return C5718k0.k(new C5698g0(wVar, EnumC5671a3.m(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j11 >= j12) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, j10, j11, j12);
        return C5718k0.k(new C5698g0(wVar, EnumC5671a3.m(wVar), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        w wVar = new w(0L, Long.MAX_VALUE, j10, j11);
        return C5718k0.k(new C5698g0(wVar, EnumC5671a3.m(wVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        u uVar = new u(0L, j10, Double.MAX_VALUE, 0.0d);
        return A.k(new C5776w(uVar, EnumC5671a3.m(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        u uVar = new u(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d);
        return A.k(new C5776w(uVar, EnumC5671a3.m(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        u uVar = new u(0L, j10, d10, d11);
        return A.k(new C5776w(uVar, EnumC5671a3.m(uVar), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 >= d11) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        u uVar = new u(0L, Long.MAX_VALUE, d10, d11);
        return A.k(new C5776w(uVar, EnumC5671a3.m(uVar), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new r0(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j10 = ((long) seed[0]) & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (((long) seed[i10]) & 255);
            }
            f84847g.set(j10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f84848a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
