package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5775v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f85389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85391e;

    public abstract Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public AbstractC5775v3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f85389c = spliterator;
        this.f85387a = j10;
        this.f85388b = j11;
        this.f85390d = j12;
        this.f85391e = j13;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m7826trySplit() {
        long j10 = this.f85391e;
        if (this.f85387a >= j10 || this.f85390d >= j10) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f85389c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f85390d;
            long jMin = Math.min(jEstimateSize, this.f85388b);
            long j11 = this.f85387a;
            if (j11 >= jMin) {
                this.f85390d = jMin;
            } else {
                long j12 = this.f85388b;
                if (jMin >= j12) {
                    this.f85389c = spliteratorTrySplit;
                    this.f85391e = jMin;
                } else {
                    long j13 = this.f85390d;
                    if (j13 >= j11 && jEstimateSize <= j12) {
                        this.f85390d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f85390d = jMin;
                    return a(spliteratorTrySplit, j11, j12, j13, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j10 = this.f85391e;
        long j11 = this.f85387a;
        if (j11 < j10) {
            return j10 - Math.max(j11, this.f85390d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f85389c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m7829trySplit() {
        return (j$.util.b0) m7826trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m7826trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m7828trySplit() {
        return (j$.util.Y) m7826trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.T m7827trySplit() {
        return (j$.util.T) m7826trySplit();
    }
}
