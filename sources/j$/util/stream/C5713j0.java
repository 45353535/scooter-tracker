package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5713j0 implements InterfaceC5723l0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f85288a;

    public /* synthetic */ C5713j0(LongStream longStream) {
        this.f85288a = longStream;
    }

    public static /* synthetic */ InterfaceC5723l0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C5718k0 ? ((C5718k0) longStream).f85300a : new C5713j0(longStream);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ B asDoubleStream() {
        return C5791z.k(this.f85288a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.B average() {
        return AbstractC5650b.j(this.f85288a.average());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 b() {
        return k(this.f85288a.map(null));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ Stream boxed() {
        return X2.k(this.f85288a.boxed());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 c() {
        return k(this.f85288a.takeWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f85288a.close();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f85288a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ long count() {
        return this.f85288a.count();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 d() {
        return k(this.f85288a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 distinct() {
        return k(this.f85288a.distinct());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 e() {
        return k(this.f85288a.dropWhile(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f85288a;
        if (obj instanceof C5713j0) {
            obj = ((C5713j0) obj).f85288a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.D findAny() {
        return AbstractC5650b.l(this.f85288a.findAny());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.D findFirst() {
        return AbstractC5650b.l(this.f85288a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f85288a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f85288a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ boolean g() {
        return this.f85288a.noneMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85288a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ boolean isParallel() {
        return this.f85288a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5723l0, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ j$.util.O iterator() {
        ?? it = this.f85288a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.N ? ((j$.util.N) it).f84797a : new j$.util.M(it);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Iterator iterator() {
        return this.f85288a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ B l() {
        return C5791z.k(this.f85288a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 limit(long j10) {
        return k(this.f85288a.limit(j10));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return X2.k(this.f85288a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.D max() {
        return AbstractC5650b.l(this.f85288a.max());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.D min() {
        return AbstractC5650b.l(this.f85288a.min());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g onClose(Runnable runnable) {
        return C5687e.k(this.f85288a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g parallel() {
        return C5687e.k(this.f85288a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5723l0, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5723l0 parallel() {
        return k(this.f85288a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 peek(LongConsumer longConsumer) {
        return k(this.f85288a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ boolean q() {
        return this.f85288a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f85288a.reduce(j10, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ j$.util.D reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC5650b.l(this.f85288a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ boolean s() {
        return this.f85288a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g sequential() {
        return C5687e.k(this.f85288a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5723l0, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5723l0 sequential() {
        return k(this.f85288a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 skip(long j10) {
        return k(this.f85288a.skip(j10));
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ InterfaceC5723l0 sorted() {
        return k(this.f85288a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.f85288a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC5723l0, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ j$.util.Y spliterator() {
        return j$.util.W.a(this.f85288a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ long sum() {
        return this.f85288a.sum();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ long[] toArray() {
        return this.f85288a.toArray();
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f85288a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g unordered() {
        return C5687e.k(this.f85288a.unordered());
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final j$.util.A summaryStatistics() {
        this.f85288a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC5723l0
    public final InterfaceC5723l0 a(j$.time.format.r rVar) {
        LongStream longStream = this.f85288a;
        j$.time.format.r rVar2 = new j$.time.format.r(9);
        rVar2.f84654b = rVar;
        return k(longStream.flatMap(rVar2));
    }
}
