package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5770u3 extends AbstractC5775v3 implements Spliterator {
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

    public C5770u3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11, 0L, Math.min(spliterator.estimateSize(), j11));
    }

    @Override // j$.util.stream.AbstractC5775v3
    public final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new C5770u3(spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
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
            this.f85389c.tryAdvance(new C5673b0(14));
            this.f85390d++;
        }
        if (j10 >= this.f85391e) {
            return false;
        }
        this.f85390d = j10 + 1;
        return this.f85389c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f85391e;
        long j11 = this.f85387a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f85390d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && this.f85389c.estimateSize() + j12 <= this.f85388b) {
            this.f85389c.forEachRemaining(consumer);
            this.f85390d = this.f85391e;
            return;
        }
        while (j11 > this.f85390d) {
            this.f85389c.tryAdvance(new C5673b0(15));
            this.f85390d++;
        }
        while (this.f85390d < this.f85391e) {
            this.f85389c.tryAdvance(consumer);
            this.f85390d++;
        }
    }
}
