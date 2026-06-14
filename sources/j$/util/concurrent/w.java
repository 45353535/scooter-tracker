package j$.util.concurrent;

import j$.util.AbstractC5650b;
import j$.util.Y;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f84903d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
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
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j10, long j11, long j12, long j13) {
        this.f84900a = j10;
        this.f84901b = j11;
        this.f84902c = j12;
        this.f84903d = j13;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j10 = this.f84900a;
        long j11 = (this.f84901b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f84900a = j11;
        return new w(j10, j11, this.f84902c, this.f84903d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84901b - this.f84900a;
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f84900a;
        if (j10 >= this.f84901b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f84902c, this.f84903d));
        this.f84900a = j10 + 1;
        return true;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f84900a;
        long j11 = this.f84901b;
        if (j10 < j11) {
            this.f84900a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.c(this.f84902c, this.f84903d));
                j10++;
            } while (j10 < j11);
        }
    }
}
