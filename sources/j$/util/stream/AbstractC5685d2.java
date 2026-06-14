package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5685d2 extends AbstractC5667a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new H2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C5732n(this, EnumC5671a3.f85203m | EnumC5671a3.f85210t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) A(H.f85039d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) A(H.f85038c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new H2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return A(new A1(EnumC5676b3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return A(new A1(EnumC5676b3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        A(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        A(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC5667a
    public final EnumC5676b3 F() {
        return EnumC5676b3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) A(new C5788y1(EnumC5676b3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC5667a
    public final F0 C(AbstractC5667a abstractC5667a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC5773v1.y(abstractC5667a, spliterator, z10, intFunction);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final Spliterator N(AbstractC5667a abstractC5667a, Supplier supplier, boolean z10) {
        return new E3(abstractC5667a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC5667a
    public final boolean E(Spliterator spliterator, InterfaceC5725l2 interfaceC5725l2) {
        boolean zN;
        do {
            zN = interfaceC5725l2.n();
            if (zN) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC5725l2));
        return zN;
    }

    @Override // j$.util.stream.AbstractC5667a
    public final InterfaceC5782x0 G(long j10, IntFunction intFunction) {
        return AbstractC5773v1.x(j10, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C5747q(this, EnumC5671a3.f85210t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C5747q(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new U(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, toIntFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return A(new A1(EnumC5676b3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5723l0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C5693f0(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final B mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C5771v(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) A(new C1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream a(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new C5747q(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream o(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new U(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 4);
    }

    @Override // j$.util.stream.Stream
    public final B m(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new C5771v(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object t(Collector collector) {
        Collector collector2;
        Object objA;
        if (!this.f85180a.f85190k || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (EnumC5671a3.ORDERED.n(this.f85185f) && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            objA = A(new H1(EnumC5676b3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            objA = collector.supplier().get();
            forEach(new j$.util.concurrent.s(8, collector.accumulator(), objA));
            collector2 = collector;
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objA : collector2.finisher().apply(objA);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC5723l0 j(j$.time.format.r rVar) {
        Objects.requireNonNull(rVar);
        return new C5693f0(this, EnumC5671a3.f85206p | EnumC5671a3.f85204n | EnumC5671a3.f85210t, rVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C5747q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return AbstractC5779w2.h(this, 0L, j10);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : AbstractC5779w2.h(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i10 = h4.f85276a;
        Objects.requireNonNull(predicate);
        return new J3(this, h4.f85276a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i10 = h4.f85276a;
        Objects.requireNonNull(predicate);
        return new L3(this, h4.f85277b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC5773v1.F(B(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C5673b0(10));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC5773v1.P(EnumC5757s0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC5773v1.P(EnumC5757s0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC5773v1.P(EnumC5757s0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
