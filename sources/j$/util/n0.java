package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f84957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84960d;

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

    public n0(int[] iArr, int i10, int i11, int i12) {
        this.f84957a = iArr;
        this.f84958b = i10;
        this.f84959c = i11;
        this.f84960d = i12 | 16448;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i10 = this.f84958b;
        int i11 = (this.f84959c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f84958b = i11;
        return new n0(this.f84957a, i10, i11, this.f84960d);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        intConsumer.getClass();
        int[] iArr = this.f84957a;
        int length = iArr.length;
        int i11 = this.f84959c;
        if (length < i11 || (i10 = this.f84958b) < 0) {
            return;
        }
        this.f84958b = i11;
        if (i10 < i11) {
            do {
                intConsumer.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i10 = this.f84958b;
        if (i10 < 0 || i10 >= this.f84959c) {
            return false;
        }
        this.f84958b = i10 + 1;
        intConsumer.accept(this.f84957a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84959c - this.f84958b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84960d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
