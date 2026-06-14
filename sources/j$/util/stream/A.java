package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements DoubleStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f84983a;

    public /* synthetic */ A(B b10) {
        this.f84983a = b10;
    }

    public static /* synthetic */ DoubleStream k(B b10) {
        if (b10 == null) {
            return null;
        }
        return b10 instanceof C5791z ? ((C5791z) b10).f85406a : new A(b10);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f84983a.h();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f84983a.p();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble average() {
        return AbstractC5650b.n(this.f84983a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(this.f84983a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f84983a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f84983a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.f84983a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return k(this.f84983a.distinct());
    }

    public final /* synthetic */ DoubleStream dropWhile(DoublePredicate doublePredicate) {
        return k(this.f84983a.e());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        B b10 = this.f84983a;
        if (obj instanceof A) {
            obj = ((A) obj).f84983a;
        }
        return b10.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return k(this.f84983a.d());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findAny() {
        return AbstractC5650b.n(this.f84983a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble findFirst() {
        return AbstractC5650b.n(this.f84983a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f84983a.forEach(doubleConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f84983a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84983a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f84983a.isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Iterator<Double> iterator() {
        return this.f84983a.iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Double> iterator2() {
        j$.util.H it = this.f84983a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof j$.util.F ? ((j$.util.F) it).f84788a : new j$.util.G(it);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j10) {
        return k(this.f84983a.limit(j10));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return k(this.f84983a.b());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f84983a.r());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C5718k0.k(this.f84983a.i());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return Stream.Wrapper.convert(this.f84983a.mapToObj(doubleFunction));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble max() {
        return AbstractC5650b.n(this.f84983a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble min() {
        return AbstractC5650b.n(this.f84983a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f84983a.w();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C5692f.k(this.f84983a.onClose(runnable));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C5692f.k(this.f84983a.parallel());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return k(this.f84983a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return k(this.f84983a.peek(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f84983a.reduce(d10, doubleBinaryOperator);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC5650b.n(this.f84983a.reduce(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C5692f.k(this.f84983a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return k(this.f84983a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j10) {
        return k(this.f84983a.skip(j10));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return k(this.f84983a.sorted());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return j$.util.S.a(this.f84983a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return Spliterator.Wrapper.convert(this.f84983a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.f84983a.sum();
    }

    public final /* synthetic */ DoubleStream takeWhile(DoublePredicate doublePredicate) {
        return k(this.f84983a.c());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.f84983a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C5692f.k(this.f84983a.unordered());
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        this.f84983a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        B b10 = this.f84983a;
        j$.time.format.r rVar = new j$.time.format.r(7);
        rVar.f84654b = doubleFunction;
        return k(b10.a(rVar));
    }
}
