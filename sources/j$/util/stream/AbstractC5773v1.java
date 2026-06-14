package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5773v1 implements G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f85374a = new X0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V0 f85375b = new V0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f85376c = new W0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U0 f85377d = new U0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f85378e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f85379f = new long[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double[] f85380g = new double[0];

    public abstract Q1 Q();

    @Override // j$.util.stream.G3
    public /* synthetic */ int d() {
        return 0;
    }

    public static j$.time.format.r J(Function function) {
        j$.time.format.r rVar = new j$.time.format.r(8);
        rVar.f84654b = function;
        return rVar;
    }

    public static j$.util.concurrent.s P(EnumC5757s0 enumC5757s0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC5757s0);
        return new j$.util.concurrent.s(EnumC5676b3.REFERENCE, enumC5757s0, new j$.util.concurrent.s(6, enumC5757s0, predicate));
    }

    public static Y0 E(EnumC5676b3 enumC5676b3) {
        int i10 = G0.f85033a[enumC5676b3.ordinal()];
        if (i10 == 1) {
            return f85374a;
        }
        if (i10 == 2) {
            return f85375b;
        }
        if (i10 == 3) {
            return f85376c;
        }
        if (i10 == 4) {
            return f85377d;
        }
        throw new IllegalStateException("Unknown shape " + enumC5676b3);
    }

    public static j$.util.concurrent.s N(EnumC5757s0 enumC5757s0, IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        Objects.requireNonNull(enumC5757s0);
        return new j$.util.concurrent.s(EnumC5676b3.INT_VALUE, enumC5757s0, new j$.util.concurrent.s(5, enumC5757s0, intPredicate));
    }

    public static F0 w(F0 f02, long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == f02.count()) {
            return f02;
        }
        Spliterator spliterator = f02.spliterator();
        long j12 = j11 - j10;
        InterfaceC5782x0 interfaceC5782x0X = x(j12, intFunction);
        interfaceC5782x0X.l(j12);
        for (int i10 = 0; i10 < j10 && spliterator.tryAdvance(new C5673b0(1)); i10++) {
        }
        if (j11 == f02.count()) {
            spliterator.forEachRemaining(interfaceC5782x0X);
        } else {
            for (int i11 = 0; i11 < j12 && spliterator.tryAdvance(interfaceC5782x0X); i11++) {
            }
        }
        interfaceC5782x0X.k();
        return interfaceC5782x0X.a();
    }

    public static H0 C(EnumC5676b3 enumC5676b3, F0 f02, F0 f03) {
        int i10 = G0.f85033a[enumC5676b3.ordinal()];
        if (i10 == 1) {
            return new Q0(f02, f03);
        }
        if (i10 == 2) {
            return new N0((B0) f02, (B0) f03);
        }
        if (i10 == 3) {
            return new O0((D0) f02, (D0) f03);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC5676b3);
        }
        return new M0((InterfaceC5792z0) f02, (InterfaceC5792z0) f03);
    }

    public static j$.util.concurrent.s O(EnumC5757s0 enumC5757s0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5757s0);
        return new j$.util.concurrent.s(EnumC5676b3.LONG_VALUE, enumC5757s0, new C5728m0(enumC5757s0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.s M(EnumC5757s0 enumC5757s0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC5757s0);
        return new j$.util.concurrent.s(EnumC5676b3.DOUBLE_VALUE, enumC5757s0, new C5728m0(enumC5757s0, 1));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC5782x0 x(long j10, IntFunction intFunction) {
        if (j10 >= 0 && j10 < 2147483639) {
            return new Z0(j10, intFunction);
        }
        return new C5753r1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC5715j2 interfaceC5715j2, Integer num) {
        if (I3.f85057a) {
            I3.a(interfaceC5715j2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC5715j2.accept(num.intValue());
    }

    public static void i(InterfaceC5720k2 interfaceC5720k2, Long l10) {
        if (I3.f85057a) {
            I3.a(interfaceC5720k2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC5720k2.accept(l10.longValue());
    }

    public static InterfaceC5772v0 K(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new C5679c1();
        }
        return new C5674b1(j10);
    }

    public static void e(InterfaceC5710i2 interfaceC5710i2, Double d10) {
        if (I3.f85057a) {
            I3.a(interfaceC5710i2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC5710i2.accept(d10.doubleValue());
    }

    public static InterfaceC5777w0 L(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new C5724l1();
        }
        return new C5719k1(j10);
    }

    public static Object[] m(E0 e02, IntFunction intFunction) {
        if (I3.f85057a) {
            I3.a(e02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e02.count());
        e02.i(objArr, 0);
        return objArr;
    }

    public static InterfaceC5767u0 D(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new T0();
        }
        return new S0(j10);
    }

    public static F0 y(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long jD = abstractC5667a.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(16384)) {
            K k10 = new K();
            k10.f85069a = intFunction;
            F0 f02 = (F0) new K0(abstractC5667a, spliterator, k10, new C5673b0(9), 3).invoke();
            return z10 ? F(f02, intFunction) : f02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jD);
        new C5744p1(spliterator, abstractC5667a, objArr).invoke();
        return new I0(objArr);
    }

    public static void r(B0 b02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b02.e((IntConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(b02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) b02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void o(B0 b02, Integer[] numArr, int i10) {
        if (I3.f85057a) {
            I3.a(b02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) b02.d();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static B0 u(B0 b02, long j10, long j11) {
        if (j10 == 0 && j11 == b02.count()) {
            return b02;
        }
        long j12 = j11 - j10;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) b02.spliterator();
        InterfaceC5772v0 interfaceC5772v0K = K(j12);
        interfaceC5772v0K.l(j12);
        for (int i10 = 0; i10 < j10 && ofInt.tryAdvance((IntConsumer) new A0(0)); i10++) {
        }
        if (j11 == b02.count()) {
            ofInt.forEachRemaining((IntConsumer) interfaceC5772v0K);
        } else {
            for (int i11 = 0; i11 < j12 && ofInt.tryAdvance((IntConsumer) interfaceC5772v0K); i11++) {
            }
        }
        interfaceC5772v0K.k();
        return interfaceC5772v0K.a();
    }

    public static B0 A(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10) {
        long jD = abstractC5667a.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b02 = (B0) new K0(abstractC5667a, spliterator, new C5673b0(5), new C5673b0(6), 1).invoke();
            return z10 ? H(b02) : b02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jD];
        new C5734n1(spliterator, abstractC5667a, iArr).invoke();
        return new C5669a1(iArr);
    }

    public static D0 B(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10) {
        long jD = abstractC5667a.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d02 = (D0) new K0(abstractC5667a, spliterator, new C5673b0(7), new C5673b0(8), 2).invoke();
            return z10 ? I(d02) : d02;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jD];
        new C5739o1(spliterator, abstractC5667a, jArr).invoke();
        return new C5714j1(jArr);
    }

    public static void s(D0 d02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d02.e((LongConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(d02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Y) d02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(D0 d02, Long[] lArr, int i10) {
        if (I3.f85057a) {
            I3.a(d02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d02.d();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static D0 v(D0 d02, long j10, long j11) {
        if (j10 == 0 && j11 == d02.count()) {
            return d02;
        }
        long j12 = j11 - j10;
        j$.util.Y y10 = (j$.util.Y) d02.spliterator();
        InterfaceC5777w0 interfaceC5777w0L = L(j12);
        interfaceC5777w0L.l(j12);
        for (int i10 = 0; i10 < j10 && y10.tryAdvance((LongConsumer) new C0(0)); i10++) {
        }
        if (j11 == d02.count()) {
            y10.forEachRemaining((LongConsumer) interfaceC5777w0L);
        } else {
            for (int i11 = 0; i11 < j12 && y10.tryAdvance((LongConsumer) interfaceC5777w0L); i11++) {
            }
        }
        interfaceC5777w0L.k();
        return interfaceC5777w0L.a();
    }

    public static InterfaceC5792z0 z(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10) {
        long jD = abstractC5667a.D(spliterator);
        if (jD < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC5792z0 interfaceC5792z0 = (InterfaceC5792z0) new K0(abstractC5667a, spliterator, new C5673b0(3), new C5673b0(4), 0).invoke();
            return z10 ? G(interfaceC5792z0) : interfaceC5792z0;
        }
        if (jD >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jD];
        new C5729m1(spliterator, abstractC5667a, dArr).invoke();
        return new R0(dArr);
    }

    public static F0 F(F0 f02, IntFunction intFunction) {
        if (f02.q() <= 0) {
            return f02;
        }
        long jCount = f02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C5768u1(f02, objArr, 1).invoke();
        return new I0(objArr);
    }

    public static void q(InterfaceC5792z0 interfaceC5792z0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC5792z0.e((DoubleConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(interfaceC5792z0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.T) interfaceC5792z0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static B0 H(B0 b02) {
        if (b02.q() <= 0) {
            return b02;
        }
        long jCount = b02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C5763t1(b02, iArr, 0).invoke();
        return new C5669a1(iArr);
    }

    public static void n(InterfaceC5792z0 interfaceC5792z0, Double[] dArr, int i10) {
        if (I3.f85057a) {
            I3.a(interfaceC5792z0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC5792z0.d();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    public static InterfaceC5792z0 t(InterfaceC5792z0 interfaceC5792z0, long j10, long j11) {
        if (j10 == 0 && j11 == interfaceC5792z0.count()) {
            return interfaceC5792z0;
        }
        long j12 = j11 - j10;
        j$.util.T t10 = (j$.util.T) interfaceC5792z0.spliterator();
        InterfaceC5767u0 interfaceC5767u0D = D(j12);
        interfaceC5767u0D.l(j12);
        for (int i10 = 0; i10 < j10 && t10.tryAdvance((DoubleConsumer) new C5787y0(0)); i10++) {
        }
        if (j11 == interfaceC5792z0.count()) {
            t10.forEachRemaining((DoubleConsumer) interfaceC5767u0D);
        } else {
            for (int i11 = 0; i11 < j12 && t10.tryAdvance((DoubleConsumer) interfaceC5767u0D); i11++) {
            }
        }
        interfaceC5767u0D.k();
        return interfaceC5767u0D.a();
    }

    public static D0 I(D0 d02) {
        if (d02.q() <= 0) {
            return d02;
        }
        long jCount = d02.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C5758s1(d02, jArr, 0).invoke();
        return new C5714j1(jArr);
    }

    public static InterfaceC5792z0 G(InterfaceC5792z0 interfaceC5792z0) {
        if (interfaceC5792z0.q() <= 0) {
            return interfaceC5792z0;
        }
        long jCount = interfaceC5792z0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C5758s1(interfaceC5792z0, dArr, 0).invoke();
        return new R0(dArr);
    }

    @Override // j$.util.stream.G3
    public Object b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        Q1 q1Q = Q();
        abstractC5667a.O(spliterator, q1Q);
        return q1Q.get();
    }

    @Override // j$.util.stream.G3
    public Object c(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return ((Q1) new X1(this, abstractC5667a, spliterator).invoke()).get();
    }
}
