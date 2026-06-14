package j$.util;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5665q implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f84972a;

    public C5665q(Spliterator spliterator) {
        this.f84972a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f84972a.tryAdvance(new j$.time.format.r(1, consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f84972a.forEachRemaining(new j$.time.format.r(1, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f84972a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new C5665q(spliteratorTrySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84972a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f84972a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84972a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i10) {
        return this.f84972a.hasCharacteristics(i10);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f84972a.getComparator();
    }
}
