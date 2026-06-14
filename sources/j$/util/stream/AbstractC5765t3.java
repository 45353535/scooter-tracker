package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5765t3 extends AbstractC5775v3 implements j$.util.b0 {
    public abstract Object b();

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC5765t3(j$.util.b0 b0Var, long j10, long j11) {
        super(b0Var, j10, j11, 0L, Math.min(b0Var.estimateSize(), j11));
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
        long j11 = this.f85391e;
        long j12 = this.f85387a;
        if (j12 >= j11) {
            return false;
        }
        while (true) {
            j10 = this.f85390d;
            if (j12 <= j10) {
                break;
            }
            ((j$.util.b0) this.f85389c).tryAdvance(b());
            this.f85390d++;
        }
        if (j10 >= this.f85391e) {
            return false;
        }
        this.f85390d = j10 + 1;
        return ((j$.util.b0) this.f85389c).tryAdvance(obj);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f85391e;
        long j11 = this.f85387a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f85390d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && ((j$.util.b0) this.f85389c).estimateSize() + j12 <= this.f85388b) {
            ((j$.util.b0) this.f85389c).forEachRemaining(obj);
            this.f85390d = this.f85391e;
            return;
        }
        while (j11 > this.f85390d) {
            ((j$.util.b0) this.f85389c).tryAdvance(b());
            this.f85390d++;
        }
        while (this.f85390d < this.f85391e) {
            ((j$.util.b0) this.f85389c).tryAdvance(obj);
            this.f85390d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
