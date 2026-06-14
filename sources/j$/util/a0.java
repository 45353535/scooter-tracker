package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f84822a;

    public /* synthetic */ a0(b0 b0Var) {
        this.f84822a = b0Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var instanceof Z ? ((Z) b0Var).f84818a : b0Var instanceof T ? S.a((T) b0Var) : b0Var instanceof Spliterator.OfInt ? V.a((Spliterator.OfInt) b0Var) : b0Var instanceof Y ? X.a((Y) b0Var) : new a0(b0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f84822a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        b0 b0Var = this.f84822a;
        if (obj instanceof a0) {
            obj = ((a0) obj).f84822a;
        }
        return b0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f84822a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84822a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84822a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f84822a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f84822a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f84822a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f84822a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f84822a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f84822a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f84822a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f84822a.trySplit());
    }
}
