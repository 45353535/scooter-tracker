package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class U implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f84814a;

    public /* synthetic */ U(Spliterator.OfInt ofInt) {
        this.f84814a = ofInt;
    }

    public static /* synthetic */ Spliterator.OfInt a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof V ? ((V) ofInt).f84815a : new U(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84814a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f84814a;
        if (obj instanceof U) {
            obj = ((U) obj).f84814a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84814a.estimateSize();
    }

    @Override // j$.util.b0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84814a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84814a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f84814a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84814a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84814a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84814a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84814a.hashCode();
    }

    @Override // j$.util.b0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f84814a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84814a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f84814a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return a(this.f84814a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return c0.a(this.f84814a.trySplit());
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ b0 trySplit() {
        return Z.a(this.f84814a.trySplit());
    }
}
