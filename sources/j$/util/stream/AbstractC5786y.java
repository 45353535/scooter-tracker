package j$.util.stream;

import j$.util.C5800x;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5786y extends AbstractC5667a implements B {
    @Override // j$.util.stream.B
    public final j$.util.B findAny() {
        return (j$.util.B) A(E.f85020d);
    }

    @Override // j$.util.stream.B
    public final j$.util.B findFirst() {
        return (j$.util.B) A(E.f85019c);
    }

    @Override // j$.util.stream.B
    public final B sorted() {
        return new E2(this, EnumC5671a3.f85207q | EnumC5671a3.f85205o, 0);
    }

    public static j$.util.T R(Spliterator spliterator) {
        if (spliterator instanceof j$.util.T) {
            return (j$.util.T) spliterator;
        }
        if (I3.f85057a) {
            I3.a(AbstractC5667a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        A(new L(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        A(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC5667a
    public final EnumC5676b3 F() {
        return EnumC5676b3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 C(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC5773v1.z(abstractC5667a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator N(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10) {
        return new C5726l3(abstractC5667a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean E(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        DoubleConsumer e10;
        boolean zN;
        j$.util.T tR = R(spliterator);
        if (interfaceC5725l2 instanceof DoubleConsumer) {
            e10 = (DoubleConsumer) interfaceC5725l2;
        } else {
            if (I3.f85057a) {
                I3.a(AbstractC5667a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC5725l2);
            e10 = new j$.util.E(interfaceC5725l2, 1);
        }
        do {
            zN = interfaceC5725l2.n();
            if (zN) {
                break;
            }
        } while (tR.tryAdvance(e10));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5782x0 G(long j10, IntFunction intFunction) {
        return AbstractC5773v1.D(j10);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final j$.util.H iterator() {
        j$.util.T tSpliterator = spliterator();
        Objects.requireNonNull(tSpliterator);
        return new j$.util.g0(tSpliterator);
    }

    @Override // j$.util.stream.AbstractC5667a, j$.util.stream.InterfaceC5697g
    public final j$.util.T spliterator() {
        return R(super.spliterator());
    }

    @Override // j$.util.stream.B
    public final Stream boxed() {
        return new C5747q(this, 0, new j$.time.format.a(24), 0);
    }

    @Override // j$.util.stream.B
    public final B b() {
        Objects.requireNonNull(null);
        return new r(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 0);
    }

    @Override // j$.util.stream.B
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C5747q(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, doubleFunction, 0);
    }

    @Override // j$.util.stream.B
    public final IntStream r() {
        Objects.requireNonNull(null);
        return new C5756s(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 0);
    }

    @Override // j$.util.stream.B
    public final InterfaceC5723l0 i() {
        Objects.requireNonNull(null);
        return new C5761t(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, 0);
    }

    @Override // j$.util.stream.B
    public final B a(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new C5771v(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 0);
    }

    @Override // j$.util.stream.B
    public final B d() {
        Objects.requireNonNull(null);
        return new r(this, EnumC5671a3.f85210t, 2);
    }

    @Override // j$.util.stream.B
    public final B peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C5771v(this, doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final B limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC5779w2.e(this, 0L, j10);
    }

    @Override // j$.util.stream.B
    public final B skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC5779w2.e(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.B
    public final B c() {
        int i10 = h4.f85276a;
        Objects.requireNonNull(null);
        return new E2(this, h4.f85276a, 1);
    }

    @Override // j$.util.stream.B
    public final B e() {
        int i10 = h4.f85276a;
        Objects.requireNonNull(null);
        return new V3(this, h4.f85277b, 0);
    }

    @Override // j$.util.stream.B
    public final B distinct() {
        return ((AbstractC5685d2) boxed()).distinct().mapToDouble(new j$.time.format.a(25));
    }

    @Override // j$.util.stream.B
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.format.a(28), new j$.time.format.a(29), new j$.time.format.a(17));
        Set set = Collectors.f85010a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // j$.util.stream.B
    public final j$.util.B min() {
        return reduce(new j$.time.format.a(18));
    }

    @Override // j$.util.stream.B
    public final j$.util.B max() {
        return reduce(new j$.time.format.a(27));
    }

    @Override // j$.util.stream.B
    public final j$.util.B average() {
        double[] dArr = (double[]) collect(new j$.time.format.a(19), new j$.time.format.a(20), new j$.time.format.a(21));
        if (dArr[2] <= 0.0d) {
            return j$.util.B.f84772c;
        }
        Set set = Collectors.f85010a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return new j$.util.B(d10 / dArr[2]);
    }

    @Override // j$.util.stream.B
    public final C5800x summaryStatistics() {
        return (C5800x) collect(new j$.time.format.a(10), new j$.time.format.a(22), new j$.time.format.a(23));
    }

    @Override // j$.util.stream.B
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C5737o c5737o = new C5737o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c5737o);
        return A(new A1(EnumC5676b3.DOUBLE_VALUE, c5737o, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.B
    public final boolean p() {
        return ((Boolean) A(AbstractC5773v1.M(EnumC5757s0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final boolean h() {
        return ((Boolean) A(AbstractC5773v1.M(EnumC5757s0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final boolean w() {
        return ((Boolean) A(AbstractC5773v1.M(EnumC5757s0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final double[] toArray() {
        return (double[]) AbstractC5773v1.G((InterfaceC5792z0) B(new j$.time.format.a(26))).d();
    }

    @Override // j$.util.stream.B
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) A(new E1(EnumC5676b3.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.B
    public final j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.B) A(new C5788y1(EnumC5676b3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.B
    public final long count() {
        return ((Long) A(new C1(1))).longValue();
    }
}
