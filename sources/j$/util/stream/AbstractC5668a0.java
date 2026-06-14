package j$.util.stream;

import j$.util.C5801y;
import j$.util.Objects;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5668a0 extends AbstractC5667a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.C findAny() {
        return (j$.util.C) A(F.f85025d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C findFirst() {
        return (j$.util.C) A(F.f85024c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new F2(this, EnumC5671a3.f85207q | EnumC5671a3.f85205o);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        A(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        A(new M(intConsumer, true));
    }

    public static Spliterator.OfInt R(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (I3.f85057a) {
            I3.a(AbstractC5667a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC5667a
    public final EnumC5676b3 F() {
        return EnumC5676b3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 C(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC5773v1.A(abstractC5667a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator N(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10) {
        return new C5736n3(abstractC5667a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean E(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        IntConsumer i10;
        boolean zN;
        Spliterator.OfInt ofIntR = R(spliterator);
        if (interfaceC5725l2 instanceof IntConsumer) {
            i10 = (IntConsumer) interfaceC5725l2;
        } else {
            if (I3.f85057a) {
                I3.a(AbstractC5667a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5725l2);
            i10 = new j$.util.I(interfaceC5725l2, 1);
        }
        do {
            zN = interfaceC5725l2.n();
            if (zN) {
                break;
            }
        } while (ofIntR.tryAdvance(i10));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5782x0 G(long j10, IntFunction intFunction) {
        return AbstractC5773v1.K(j10);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final PrimitiveIterator.OfInt iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.e0(ofIntSpliterator);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final Spliterator.OfInt spliterator() {
        return R(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5723l0 asLongStream() {
        return new C5761t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final B asDoubleStream() {
        return new r(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C5747q(this, 0, new D(11), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C5756s(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C5747q(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC5723l0 n() {
        Objects.requireNonNull(null);
        return new C5761t(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final B f() {
        Objects.requireNonNull(null);
        return new r(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) A(new L1(EnumC5676b3.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream v(K k10) {
        Objects.requireNonNull(k10);
        return new U(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, k10, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.C) A(new C5788y1(EnumC5676b3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        return new U(this, EnumC5671a3.f85210t, intPredicate, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new U(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC5779w2.f(this, 0L, j10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC5779w2.f(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i10 = h4.f85276a;
        Objects.requireNonNull(intPredicate);
        return new N3(this, h4.f85276a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i10 = h4.f85276a;
        Objects.requireNonNull(intPredicate);
        return new P3(this, h4.f85277b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) A(new C1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC5685d2) boxed()).distinct().mapToInt(new D(10));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new D(15));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C min() {
        return reduce(new D(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C max() {
        return reduce(new D(16));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B average() {
        long j10 = ((long[]) collect(new D(17), new D(18), new D(19)))[0];
        return j10 > 0 ? new j$.util.B(r0[1] / j10) : j$.util.B.f84772c;
    }

    @Override // j$.util.stream.IntStream
    public final C5801y summaryStatistics() {
        return (C5801y) collect(new j$.time.format.a(11), new D(13), new D(14));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5737o c5737o = new C5737o(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c5737o);
        return A(new A1(EnumC5676b3.INT_VALUE, c5737o, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC5773v1.N(EnumC5757s0.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC5773v1.N(EnumC5757s0.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC5773v1.N(EnumC5757s0.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC5773v1.H((B0) B(new D(9))).d();
    }
}
