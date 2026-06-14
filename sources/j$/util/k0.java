package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractC5650b implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.AbstractC5650b, j$.util.T, j$.util.b0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC5650b, j$.util.T, j$.util.b0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ b0 trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }
}
