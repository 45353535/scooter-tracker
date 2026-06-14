package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f84827a;

    public /* synthetic */ c0(java.util.Spliterator spliterator) {
        this.f84827a = spliterator;
    }

    public static /* synthetic */ Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? Z.a((Spliterator.OfPrimitive) spliterator) : new c0(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84827a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator spliterator = this.f84827a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f84827a;
        }
        return spliterator.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84827a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84827a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84827a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84827a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84827a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84827a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84827a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return a(this.f84827a.trySplit());
    }
}
