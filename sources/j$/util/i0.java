package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f84949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84952d;

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

    public i0(double[] dArr, int i10, int i11, int i12) {
        this.f84949a = dArr;
        this.f84950b = i10;
        this.f84951c = i11;
        this.f84952d = i12 | 16448;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final T trySplit() {
        int i10 = this.f84950b;
        int i11 = (this.f84951c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f84950b = i11;
        return new i0(this.f84949a, i10, i11, this.f84952d);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i10;
        doubleConsumer.getClass();
        double[] dArr = this.f84949a;
        int length = dArr.length;
        int i11 = this.f84951c;
        if (length < i11 || (i10 = this.f84950b) < 0) {
            return;
        }
        this.f84950b = i11;
        if (i10 < i11) {
            do {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i10 = this.f84950b;
        if (i10 < 0 || i10 >= this.f84951c) {
            return false;
        }
        this.f84950b = i10 + 1;
        doubleConsumer.accept(this.f84949a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84951c - this.f84950b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84952d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
