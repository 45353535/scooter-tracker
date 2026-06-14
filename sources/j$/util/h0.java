package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f84940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84943d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    public h0(Object[] objArr, int i10, int i11, int i12) {
        this.f84940a = objArr;
        this.f84941b = i10;
        this.f84942c = i11;
        this.f84943d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f84941b;
        int i11 = (this.f84942c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f84941b = i11;
        return new h0(this.f84940a, i10, i11, this.f84943d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f84940a;
        int length = objArr.length;
        int i11 = this.f84942c;
        if (length < i11 || (i10 = this.f84941b) < 0) {
            return;
        }
        this.f84941b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f84941b;
        if (i10 < 0 || i10 >= this.f84942c) {
            return false;
        }
        this.f84941b = i10 + 1;
        consumer.accept(this.f84940a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84942c - this.f84941b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84943d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
