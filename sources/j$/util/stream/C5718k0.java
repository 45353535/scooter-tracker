package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5718k0 implements LongStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5723l0 f85300a;

    public /* synthetic */ C5718k0(InterfaceC5723l0 interfaceC5723l0) {
        this.f85300a = interfaceC5723l0;
    }

    public static /* synthetic */ LongStream k(InterfaceC5723l0 interfaceC5723l0) {
        if (interfaceC5723l0 == null) {
            return null;
        }
        return interfaceC5723l0 instanceof C5713j0 ? ((C5713j0) interfaceC5723l0).f85288a : new C5718k0(interfaceC5723l0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f85300a.s();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f85300a.q();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return A.k(this.f85300a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC5650b.n(this.f85300a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(this.f85300a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f85300a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f85300a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f85300a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return k(this.f85300a.distinct());
    }

    public final /* synthetic */ LongStream dropWhile(LongPredicate longPredicate) {
        return k(this.f85300a.e());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5723l0 interfaceC5723l0 = this.f85300a;
        if (obj instanceof C5718k0) {
            obj = ((C5718k0) obj).f85300a;
        }
        return interfaceC5723l0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return k(this.f85300a.d());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return AbstractC5650b.p(this.f85300a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return AbstractC5650b.p(this.f85300a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f85300a.forEach(longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f85300a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85300a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f85300a.isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Long> iterator() {
        return this.f85300a.iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Long> iterator2() {
        j$.util.O it = this.f85300a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof j$.util.M ? ((j$.util.M) it).f84796a : new j$.util.N(it);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j10) {
        return k(this.f85300a.limit(j10));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return k(this.f85300a.b());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return A.k(this.f85300a.l());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f85300a.u());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return Stream.Wrapper.convert(this.f85300a.mapToObj(longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return AbstractC5650b.p(this.f85300a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return AbstractC5650b.p(this.f85300a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f85300a.g();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C5692f.k(this.f85300a.onClose(runnable));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C5692f.k(this.f85300a.parallel());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return k(this.f85300a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return k(this.f85300a.peek(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f85300a.reduce(j10, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC5650b.p(this.f85300a.reduce(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C5692f.k(this.f85300a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return k(this.f85300a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j10) {
        return k(this.f85300a.skip(j10));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return k(this.f85300a.sorted());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return j$.util.X.a(this.f85300a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return Spliterator.Wrapper.convert(this.f85300a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f85300a.sum();
    }

    public final /* synthetic */ LongStream takeWhile(LongPredicate longPredicate) {
        return k(this.f85300a.c());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f85300a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C5692f.k(this.f85300a.unordered());
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        this.f85300a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        InterfaceC5723l0 interfaceC5723l0 = this.f85300a;
        j$.time.format.r rVar = new j$.time.format.r(9);
        rVar.f84654b = longFunction;
        return k(interfaceC5723l0.a(rVar));
    }
}
