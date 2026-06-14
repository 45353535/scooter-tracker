package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5708i0 extends AbstractC5667a implements InterfaceC5723l0 {
    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.D findAny() {
        return (j$.util.D) A(G.f85032d);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.D findFirst() {
        return (j$.util.D) A(G.f85031c);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 sorted() {
        return new G2(this, EnumC5671a3.f85207q | EnumC5671a3.f85205o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        A(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        A(new N(longConsumer, true));
    }

    public static j$.util.Y R(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (I3.f85057a) {
            I3.a(AbstractC5667a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC5667a
    public final EnumC5676b3 F() {
        return EnumC5676b3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 C(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC5773v1.B(abstractC5667a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator N(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10) {
        return new C5746p3(abstractC5667a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean E(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        LongConsumer l10;
        boolean zN;
        j$.util.Y yR = R(spliterator);
        if (interfaceC5725l2 instanceof LongConsumer) {
            l10 = (LongConsumer) interfaceC5725l2;
        } else {
            if (I3.f85057a) {
                I3.a(AbstractC5667a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5725l2);
            l10 = new j$.util.L(interfaceC5725l2, 1);
        }
        do {
            zN = interfaceC5725l2.n();
            if (zN) {
                break;
            }
        } while (yR.tryAdvance(l10));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5782x0 G(long j10, IntFunction intFunction) {
        return AbstractC5773v1.L(j10);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final j$.util.O iterator() {
        j$.util.Y ySpliterator = spliterator();
        Objects.requireNonNull(ySpliterator);
        return new j$.util.f0(ySpliterator);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final j$.util.Y spliterator() {
        return R(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final B asDoubleStream() {
        return new r(this, EnumC5671a3.f85204n, 5);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final Stream boxed() {
        return new C5747q(this, 0, new D(25), 2);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 b() {
        Objects.requireNonNull(null);
        return new C5761t(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 3);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C5747q(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C5756s(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 3);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final B l() {
        Objects.requireNonNull(null);
        return new r(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 6);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 a(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new C5693f0(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 0);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 d() {
        Objects.requireNonNull(null);
        return new C5761t(this, EnumC5671a3.f85210t, 5);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C5693f0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC5779w2.g(this, 0L, j10);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC5779w2.g(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 c() {
        int i10 = h4.f85276a;
        Objects.requireNonNull(null);
        return new G2(this, h4.f85276a, 1);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 e() {
        int i10 = h4.f85276a;
        Objects.requireNonNull(null);
        return new S3(this, h4.f85277b, 0);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 distinct() {
        return ((AbstractC5685d2) boxed()).distinct().mapToLong(new D(22));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final long sum() {
        return reduce(0L, new C5673b0(0));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.D min() {
        return reduce(new D(21));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.D max() {
        return reduce(new D(29));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.B average() {
        long j10 = ((long[]) collect(new D(26), new D(27), new D(28)))[0];
        return j10 > 0 ? new j$.util.B(r0[1] / j10) : j$.util.B.f84772c;
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) A(new C5778w1(EnumC5676b3.LONG_VALUE, longBinaryOperator, j10))).longValue();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new j$.time.format.a(12), new D(20), new D(23));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5737o c5737o = new C5737o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c5737o);
        return A(new A1(EnumC5676b3.LONG_VALUE, c5737o, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final boolean q() {
        return ((Boolean) A(AbstractC5773v1.O(EnumC5757s0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.D reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.D) A(new C5788y1(EnumC5676b3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final boolean s() {
        return ((Boolean) A(AbstractC5773v1.O(EnumC5757s0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final boolean g() {
        return ((Boolean) A(AbstractC5773v1.O(EnumC5757s0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final long[] toArray() {
        return (long[]) AbstractC5773v1.I((D0) B(new D(24))).d();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final long count() {
        return ((Long) A(new C1(0))).longValue();
    }
}
