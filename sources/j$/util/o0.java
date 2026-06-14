package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrimitiveIterator.OfInt f84962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f84964c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84965d;

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

    public o0(PrimitiveIterator.OfInt ofInt, int i10) {
        this.f84962a = ofInt;
        this.f84963b = i10 & (-16449);
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        long j10 = this.f84964c;
        if (j10 <= 1) {
            return null;
        }
        PrimitiveIterator.OfInt ofInt = this.f84962a;
        if (!ofInt.hasNext()) {
            return null;
        }
        int i10 = this.f84965d + 1024;
        if (i10 > j10) {
            i10 = (int) j10;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        int[] iArr = new int[i10];
        int i11 = 0;
        do {
            iArr[i11] = ofInt.nextInt();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (ofInt.hasNext());
        this.f84965d = i11;
        long j11 = this.f84964c;
        if (j11 != Long.MAX_VALUE) {
            this.f84964c = j11 - ((long) i11);
        }
        return new n0(iArr, 0, i11, this.f84963b);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        this.f84962a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        PrimitiveIterator.OfInt ofInt = this.f84962a;
        if (!ofInt.hasNext()) {
            return false;
        }
        intConsumer.accept(ofInt.nextInt());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84964c;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84963b;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
