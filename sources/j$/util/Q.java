package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfDouble f84801a;

    public /* synthetic */ Q(Spliterator.OfDouble ofDouble) {
        this.f84801a = ofDouble;
    }

    public static /* synthetic */ T a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof S ? ((S) ofDouble).f84802a : new Q(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84801a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f84801a;
        if (obj instanceof Q) {
            obj = ((Q) obj).f84801a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84801a.estimateSize();
    }

    @Override // j$.util.b0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84801a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84801a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.T
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f84801a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84801a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84801a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84801a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84801a.hashCode();
    }

    @Override // j$.util.b0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f84801a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84801a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.T
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f84801a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return c0.a(this.f84801a.trySplit());
    }

    @Override // j$.util.T, j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ T trySplit() {
        return a(this.f84801a.trySplit());
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ b0 trySplit() {
        return Z.a(this.f84801a.trySplit());
    }
}
