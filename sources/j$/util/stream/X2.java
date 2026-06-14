package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class X2 implements Stream, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f85163a;

    public /* synthetic */ X2(java.util.stream.Stream stream) {
        this.f85163a = stream;
    }

    public static /* synthetic */ Stream k(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new X2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream a(j$.time.format.r rVar) {
        return k(this.f85163a.flatMap(AbstractC5773v1.J(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f85163a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f85163a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f85163a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f85163a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f85163a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return k(this.f85163a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return k(this.f85163a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f85163a;
        if (obj instanceof X2) {
            obj = ((X2) obj).f85163a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return k(this.f85163a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return AbstractC5650b.i(this.f85163a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return AbstractC5650b.i(this.f85163a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f85163a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f85163a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85163a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ boolean isParallel() {
        return this.f85163a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Iterator iterator() {
        return this.f85163a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5723l0 j(j$.time.format.r rVar) {
        return C5713j0.k(this.f85163a.flatMapToLong(AbstractC5773v1.J(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j10) {
        return k(this.f85163a.limit(j10));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ B m(j$.time.format.r rVar) {
        return C5791z.k(this.f85163a.flatMapToDouble(AbstractC5773v1.J(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return k(this.f85163a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ B mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C5791z.k(this.f85163a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f85163a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC5723l0 mapToLong(ToLongFunction toLongFunction) {
        return C5713j0.k(this.f85163a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC5650b.i(this.f85163a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC5650b.i(this.f85163a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f85163a.noneMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream o(j$.time.format.r rVar) {
        return IntStream.VivifiedWrapper.convert(this.f85163a.flatMapToInt(AbstractC5773v1.J(rVar)));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g onClose(Runnable runnable) {
        return C5687e.k(this.f85163a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g parallel() {
        return C5687e.k(this.f85163a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return k(this.f85163a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC5650b.i(this.f85163a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f85163a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f85163a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g sequential() {
        return C5687e.k(this.f85163a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j10) {
        return k(this.f85163a.skip(j10));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return k(this.f85163a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return k(this.f85163a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.f85163a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object t(Collector collector) {
        return this.f85163a.collect(collector == null ? null : collector instanceof C5702h ? ((C5702h) collector).f85272a : new C5707i(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return k(this.f85163a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f85163a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f85163a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.f85163a.toList();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g unordered() {
        return C5687e.k(this.f85163a.unordered());
    }
}
