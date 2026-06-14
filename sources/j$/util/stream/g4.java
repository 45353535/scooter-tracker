package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g4 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f85268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f85269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85271d;

    public abstract Spliterator c(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public g4(Spliterator spliterator) {
        this.f85270c = true;
        this.f85268a = spliterator;
        this.f85269b = new AtomicBoolean();
    }

    public g4(Spliterator spliterator, g4 g4Var) {
        this.f85270c = true;
        this.f85268a = spliterator;
        g4Var.getClass();
        this.f85269b = g4Var.f85269b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f85268a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f85268a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f85268a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f85268a.trySplit();
        if (spliteratorTrySplit != null) {
            return c(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean b() {
        return (this.f85271d == 0 && this.f85269b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
    }
}
