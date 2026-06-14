package j$.util.concurrent;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84899d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.b(this, consumer);
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
        return AbstractC5650b.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v(long j10, long j11, int i10, int i11) {
        this.f84896a = j10;
        this.f84897b = j11;
        this.f84898c = i10;
        this.f84899d = i11;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v trySplit() {
        long j10 = this.f84896a;
        long j11 = (this.f84897b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f84896a = j11;
        return new v(j10, j11, this.f84898c, this.f84899d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84897b - this.f84896a;
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f84896a;
        if (j10 >= this.f84897b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f84898c, this.f84899d));
        this.f84896a = j10 + 1;
        return true;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f84896a;
        long j11 = this.f84897b;
        if (j10 < j11) {
            this.f84896a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f84898c, this.f84899d));
                j10++;
            } while (j10 < j11);
        }
    }
}
