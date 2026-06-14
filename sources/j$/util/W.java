package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class W implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfLong f84816a;

    public /* synthetic */ W(Spliterator.OfLong ofLong) {
        this.f84816a = ofLong;
    }

    public static /* synthetic */ Y a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof X ? ((X) ofLong).f84817a : new W(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84816a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f84816a;
        if (obj instanceof W) {
            obj = ((W) obj).f84816a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84816a.estimateSize();
    }

    @Override // j$.util.b0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84816a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84816a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Y
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f84816a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84816a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84816a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84816a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84816a.hashCode();
    }

    @Override // j$.util.b0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f84816a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84816a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Y
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f84816a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return c0.a(this.f84816a.trySplit());
    }

    @Override // j$.util.Y, j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ Y trySplit() {
        return a(this.f84816a.trySplit());
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ b0 trySplit() {
        return Z.a(this.f84816a.trySplit());
    }
}
