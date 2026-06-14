package j$.util.concurrent;

import j$.util.AbstractC5650b;
import j$.util.T;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f84894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f84895d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public u(long j10, long j11, double d10, double d11) {
        this.f84892a = j10;
        this.f84893b = j11;
        this.f84894c = d10;
        this.f84895d = d11;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u trySplit() {
        long j10 = this.f84892a;
        long j11 = (this.f84893b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f84892a = j11;
        return new u(j10, j11, this.f84894c, this.f84895d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84893b - this.f84892a;
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f84892a;
        if (j10 >= this.f84893b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f84894c, this.f84895d));
        this.f84892a = j10 + 1;
        return true;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f84892a;
        long j11 = this.f84893b;
        if (j10 < j11) {
            this.f84892a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f84894c, this.f84895d));
                j10++;
            } while (j10 < j11);
        }
    }
}
