package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f85004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f85008e;

    public abstract Spliterator c(Spliterator spliterator);

    public C3(Spliterator spliterator, long j10, long j11) {
        this.f85004a = spliterator;
        this.f85005b = j11 < 0;
        this.f85007d = j11 >= 0 ? j11 : 0L;
        this.f85006c = 128;
        this.f85008e = new AtomicLong(j11 >= 0 ? j10 + j11 : j10);
    }

    public C3(Spliterator spliterator, C3 c32) {
        this.f85004a = spliterator;
        this.f85005b = c32.f85005b;
        this.f85008e = c32.f85008e;
        this.f85007d = c32.f85007d;
        this.f85006c = c32.f85006c;
    }

    public final long b(long j10) {
        AtomicLong atomicLong;
        long j11;
        boolean z10;
        long jMin;
        do {
            atomicLong = this.f85008e;
            j11 = atomicLong.get();
            z10 = this.f85005b;
            if (j11 != 0) {
                jMin = Math.min(j11, j10);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z10) {
                    return j10;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j11, j11 - jMin));
        if (z10) {
            return Math.max(j10 - jMin, 0L);
        }
        long j12 = this.f85007d;
        return j11 > j12 ? Math.max(jMin - (j11 - j12), 0L) : jMin;
    }

    public final B3 d() {
        if (this.f85008e.get() > 0) {
            return B3.MAYBE_MORE;
        }
        return this.f85005b ? B3.UNLIMITED : B3.NO_MORE;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m7822trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f85008e.get() == 0 || (spliteratorTrySplit = this.f85004a.trySplit()) == null) {
            return null;
        }
        return c(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f85004a.estimateSize();
    }

    public final int characteristics() {
        return this.f85004a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.b0 m7825trySplit() {
        return (j$.util.b0) m7822trySplit();
    }

    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) m7822trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Y m7824trySplit() {
        return (j$.util.Y) m7822trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.T m7823trySplit() {
        return (j$.util.T) m7822trySplit();
    }
}
