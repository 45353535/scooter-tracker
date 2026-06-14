package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f84973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84976d;

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

    public q0(long[] jArr, int i10, int i11, int i12) {
        this.f84973a = jArr;
        this.f84974b = i10;
        this.f84975c = i11;
        this.f84976d = i12 | 16448;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Y trySplit() {
        int i10 = this.f84974b;
        int i11 = (this.f84975c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f84974b = i11;
        return new q0(this.f84973a, i10, i11, this.f84976d);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i10;
        longConsumer.getClass();
        long[] jArr = this.f84973a;
        int length = jArr.length;
        int i11 = this.f84975c;
        if (length < i11 || (i10 = this.f84974b) < 0) {
            return;
        }
        this.f84974b = i11;
        if (i10 < i11) {
            do {
                longConsumer.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i10 = this.f84974b;
        if (i10 < 0 || i10 >= this.f84975c) {
            return false;
        }
        this.f84974b = i10 + 1;
        longConsumer.accept(this.f84973a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84975c - this.f84974b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84976d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
