package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.C5800x;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5791z implements B, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f85406a;

    public /* synthetic */ C5791z(DoubleStream doubleStream) {
        this.f85406a = doubleStream;
    }

    public static /* synthetic */ B k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof A ? ((A) doubleStream).f84983a : new C5791z(doubleStream);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B average() {
        return AbstractC5650b.j(this.f85406a.average());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B b() {
        return k(this.f85406a.map(null));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Stream boxed() {
        return X2.k(this.f85406a.boxed());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B c() {
        return k(this.f85406a.takeWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f85406a.close();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f85406a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ long count() {
        return this.f85406a.count();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B d() {
        return k(this.f85406a.filter(null));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B distinct() {
        return k(this.f85406a.distinct());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B e() {
        return k(this.f85406a.dropWhile(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f85406a;
        if (obj instanceof C5791z) {
            obj = ((C5791z) obj).f85406a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC5650b.j(this.f85406a.findAny());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC5650b.j(this.f85406a.findFirst());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f85406a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f85406a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean h() {
        return this.f85406a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f85406a.hashCode();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ InterfaceC5723l0 i() {
        return C5713j0.k(this.f85406a.mapToLong(null));
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ boolean isParallel() {
        return this.f85406a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.B, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ j$.util.H iterator() {
        ?? it = this.f85406a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.G ? ((j$.util.G) it).f84789a : new j$.util.F(it);
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Iterator iterator() {
        return this.f85406a.iterator();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B limit(long j10) {
        return k(this.f85406a.limit(j10));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return X2.k(this.f85406a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B max() {
        return AbstractC5650b.j(this.f85406a.max());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B min() {
        return AbstractC5650b.j(this.f85406a.min());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g onClose(Runnable runnable) {
        return C5687e.k(this.f85406a.onClose(runnable));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean p() {
        return this.f85406a.anyMatch(null);
    }

    @Override // j$.util.stream.B, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ B parallel() {
        return k(this.f85406a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g parallel() {
        return C5687e.k(this.f85406a.parallel());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B peek(DoubleConsumer doubleConsumer) {
        return k(this.f85406a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ IntStream r() {
        return IntStream.VivifiedWrapper.convert(this.f85406a.mapToInt(null));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f85406a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC5650b.j(this.f85406a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.B, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ B sequential() {
        return k(this.f85406a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g sequential() {
        return C5687e.k(this.f85406a.sequential());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B skip(long j10) {
        return k(this.f85406a.skip(j10));
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ B sorted() {
        return k(this.f85406a.sorted());
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.f85406a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.B, j$.util.stream.InterfaceC5697g
    public final /* synthetic */ j$.util.T spliterator() {
        return j$.util.Q.a(this.f85406a.spliterator());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double sum() {
        return this.f85406a.sum();
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ double[] toArray() {
        return this.f85406a.toArray();
    }

    @Override // j$.util.stream.InterfaceC5697g
    public final /* synthetic */ InterfaceC5697g unordered() {
        return C5687e.k(this.f85406a.unordered());
    }

    @Override // j$.util.stream.B
    public final /* synthetic */ boolean w() {
        return this.f85406a.noneMatch(null);
    }

    @Override // j$.util.stream.B
    public final C5800x summaryStatistics() {
        this.f85406a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.B
    public final B a(j$.time.format.r rVar) {
        DoubleStream doubleStream = this.f85406a;
        j$.time.format.r rVar2 = new j$.time.format.r(7);
        rVar2.f84654b = rVar;
        return k(doubleStream.flatMap(rVar2));
    }
}
