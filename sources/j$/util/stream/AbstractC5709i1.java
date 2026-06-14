package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5709i1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F0 f85279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f85281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f85282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayDeque f85283e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC5709i1(F0 f02) {
        this.f85279a = f02;
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iQ = this.f85279a.q();
        while (true) {
            iQ--;
            if (iQ < this.f85280b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f85279a.b(iQ));
        }
    }

    public static F0 a(ArrayDeque arrayDeque) {
        while (true) {
            F0 f02 = (F0) arrayDeque.pollFirst();
            if (f02 == null) {
                return null;
            }
            if (f02.q() != 0) {
                for (int iQ = f02.q() - 1; iQ >= 0; iQ--) {
                    arrayDeque.addFirst(f02.b(iQ));
                }
            } else if (f02.count() > 0) {
                return f02;
            }
        }
    }

    public final boolean c() {
        if (this.f85279a == null) {
            return false;
        }
        if (this.f85282d != null) {
            return true;
        }
        Spliterator spliterator = this.f85281c;
        if (spliterator == null) {
            ArrayDeque arrayDequeB = b();
            this.f85283e = arrayDequeB;
            F0 f0A = a(arrayDequeB);
            if (f0A != null) {
                this.f85282d = f0A.spliterator();
                return true;
            }
            this.f85279a = null;
            return false;
        }
        this.f85282d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        F0 f02 = this.f85279a;
        if (f02 == null || this.f85282d != null) {
            return null;
        }
        Spliterator spliterator = this.f85281c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f85280b < f02.q() - 1) {
            F0 f03 = this.f85279a;
            int i10 = this.f85280b;
            this.f85280b = i10 + 1;
            return f03.b(i10).spliterator();
        }
        F0 f0B = this.f85279a.b(this.f85280b);
        this.f85279a = f0B;
        if (f0B.q() == 0) {
            Spliterator spliterator2 = this.f85279a.spliterator();
            this.f85281c = spliterator2;
            return spliterator2.trySplit();
        }
        F0 f04 = this.f85279a;
        this.f85280b = 1;
        return f04.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f85279a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f85281c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f85280b; i10 < this.f85279a.q(); i10++) {
            jCount += this.f85279a.b(i10).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        return (j$.util.b0) trySplit();
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
}
