package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.C5801y;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public interface IntStream extends InterfaceC5697g {
    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    B asDoubleStream();

    InterfaceC5723l0 asLongStream();

    j$.util.B average();

    IntStream b();

    Stream boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    IntStream distinct();

    IntStream dropWhile(IntPredicate intPredicate);

    B f();

    IntStream filter(IntPredicate intPredicate);

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    @Override // j$.util.stream.InterfaceC5697g
    PrimitiveIterator.OfInt iterator();

    IntStream limit(long j10);

    Stream mapToObj(IntFunction intFunction);

    j$.util.C max();

    j$.util.C min();

    InterfaceC5723l0 n();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // j$.util.stream.InterfaceC5697g
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    int reduce(int i10, IntBinaryOperator intBinaryOperator);

    j$.util.C reduce(IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.InterfaceC5697g
    IntStream sequential();

    IntStream skip(long j10);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC5697g
    Spliterator.OfInt spliterator();

    int sum();

    C5801y summaryStatistics();

    IntStream takeWhile(IntPredicate intPredicate);

    int[] toArray();

    IntStream v(K k10);

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        public /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f85058a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.allMatch(intPredicate);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.anyMatch(intPredicate);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return A.k(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C5718k0.k(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC5650b.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws Exception {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.dropWhile(intPredicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.filter(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC5650b.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC5650b.o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            PrimitiveIterator.OfInt it = IntStream.this.iterator();
            if (it == null) {
                return null;
            }
            return it instanceof j$.util.J ? ((j$.util.J) it).f84792a : new j$.util.K(it);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j10) {
            return convert(IntStream.this.limit(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.b());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return A.k(IntStream.this.f());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C5718k0.k(IntStream.this.n());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC5650b.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC5650b.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.noneMatch(intPredicate);
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C5692f.k(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C5692f.k(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i10, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5650b.o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C5692f.k(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j10) {
            return convert(IntStream.this.skip(j10));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator() {
            return j$.util.V.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Spliterator<Integer> spliterator2() {
            return Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.takeWhile(intPredicate));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C5692f.k(IntStream.this.unordered());
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            K k10 = new K();
            k10.f85069a = intFunction;
            return convert(intStream.v(k10));
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.stream.IntStream f85058a;

        public /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f85058a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return this.f85058a.allMatch(intPredicate);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return this.f85058a.anyMatch(intPredicate);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ B asDoubleStream() {
            return C5791z.k(this.f85058a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5723l0 asLongStream() {
            return C5713j0.k(this.f85058a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.B average() {
            return AbstractC5650b.j(this.f85058a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream b() {
            return convert(this.f85058a.map(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return X2.k(this.f85058a.boxed());
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f85058a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f85058a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f85058a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f85058a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream dropWhile(IntPredicate intPredicate) {
            return convert(this.f85058a.dropWhile(intPredicate));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f85058a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f85058a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ B f() {
            return C5791z.k(this.f85058a.mapToDouble(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream filter(IntPredicate intPredicate) {
            return convert(this.f85058a.filter(intPredicate));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C findAny() {
            return AbstractC5650b.k(this.f85058a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C findFirst() {
            return AbstractC5650b.k(this.f85058a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f85058a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f85058a.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return this.f85058a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ boolean isParallel() {
            return this.f85058a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5697g
        public final /* synthetic */ PrimitiveIterator.OfInt iterator() {
            ?? it = this.f85058a.iterator();
            if (it == 0) {
                return null;
            }
            return it instanceof j$.util.K ? ((j$.util.K) it).f84793a : new j$.util.J(it);
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ Iterator iterator() {
            return this.f85058a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j10) {
            return convert(this.f85058a.limit(j10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return X2.k(this.f85058a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C max() {
            return AbstractC5650b.k(this.f85058a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C min() {
            return AbstractC5650b.k(this.f85058a.min());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC5723l0 n() {
            return C5713j0.k(this.f85058a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return this.f85058a.noneMatch(intPredicate);
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ InterfaceC5697g onClose(Runnable runnable) {
            return C5687e.k(this.f85058a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5697g
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f85058a.parallel());
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ InterfaceC5697g parallel() {
            return C5687e.k(this.f85058a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f85058a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return this.f85058a.reduce(i10, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC5650b.k(this.f85058a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5697g
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f85058a.sequential());
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ InterfaceC5697g sequential() {
            return C5687e.k(this.f85058a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j10) {
            return convert(this.f85058a.skip(j10));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f85058a.sorted());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC5697g
        public final /* synthetic */ Spliterator.OfInt spliterator() {
            return j$.util.U.a(this.f85058a.spliterator());
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.c0.a(this.f85058a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f85058a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream takeWhile(IntPredicate intPredicate) {
            return convert(this.f85058a.takeWhile(intPredicate));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f85058a.toArray();
        }

        @Override // j$.util.stream.InterfaceC5697g
        public final /* synthetic */ InterfaceC5697g unordered() {
            return C5687e.k(this.f85058a.unordered());
        }

        @Override // j$.util.stream.IntStream
        public final C5801y summaryStatistics() {
            this.f85058a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final IntStream v(K k10) {
            java.util.stream.IntStream intStream = this.f85058a;
            K k11 = new K();
            k11.f85069a = k10;
            return convert(intStream.flatMap(k11));
        }
    }
}
