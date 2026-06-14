package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends AbstractC5650b implements Y {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
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
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.AbstractC5650b, j$.util.T, j$.util.b0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Y trySplit() {
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

    @Override // j$.util.Y
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return false;
    }

    @Override // j$.util.Y
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
    }
}
