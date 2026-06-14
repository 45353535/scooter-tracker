package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class X implements Spliterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f84817a;

    public /* synthetic */ X(Y y10) {
        this.f84817a = y10;
    }

    public static /* synthetic */ Spliterator.OfLong a(Y y10) {
        if (y10 == null) {
            return null;
        }
        return y10 instanceof W ? ((W) y10).f84816a : new X(y10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84817a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Y y10 = this.f84817a;
        if (obj instanceof X) {
            obj = ((X) obj).f84817a;
        }
        return y10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84817a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f84817a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84817a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f84817a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84817a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84817a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84817a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84817a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f84817a.tryAdvance((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84817a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f84817a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return a(this.f84817a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a0.a(this.f84817a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f84817a.trySplit());
    }
}
