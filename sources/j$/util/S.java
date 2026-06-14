package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class S implements Spliterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f84802a;

    public /* synthetic */ S(T t10) {
        this.f84802a = t10;
    }

    public static /* synthetic */ Spliterator.OfDouble a(T t10) {
        if (t10 == null) {
            return null;
        }
        return t10 instanceof Q ? ((Q) t10).f84801a : new S(t10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84802a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        T t10 = this.f84802a;
        if (obj instanceof S) {
            obj = ((S) obj).f84802a;
        }
        return t10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84802a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f84802a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84802a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f84802a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84802a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84802a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84802a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84802a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f84802a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84802a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f84802a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return a(this.f84802a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a0.a(this.f84802a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f84802a.trySplit());
    }
}
