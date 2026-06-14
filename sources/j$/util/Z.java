package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfPrimitive f84818a;

    public /* synthetic */ Z(Spliterator.OfPrimitive ofPrimitive) {
        this.f84818a = ofPrimitive;
    }

    public static /* synthetic */ b0 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof a0 ? ((a0) ofPrimitive).f84822a : ofPrimitive instanceof Spliterator.OfDouble ? Q.a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? U.a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? W.a((Spliterator.OfLong) ofPrimitive) : new Z(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84818a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f84818a;
        if (obj instanceof Z) {
            obj = ((Z) obj).f84818a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84818a.estimateSize();
    }

    @Override // j$.util.b0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84818a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84818a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84818a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84818a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84818a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84818a.hashCode();
    }

    @Override // j$.util.b0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f84818a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84818a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return c0.a(this.f84818a.trySplit());
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final /* synthetic */ b0 trySplit() {
        return a(this.f84818a.trySplit());
    }
}
