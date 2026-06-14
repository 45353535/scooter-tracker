package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5649a implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f84819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84821c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C5649a(java.util.List list) {
        this.f84819a = list;
        this.f84820b = 0;
        this.f84821c = -1;
    }

    public C5649a(C5649a c5649a, int i10, int i11) {
        this.f84819a = c5649a.f84819a;
        this.f84820b = i10;
        this.f84821c = i11;
    }

    public final int a() {
        int i10 = this.f84821c;
        if (i10 >= 0) {
            return i10;
        }
        int size = this.f84819a.size();
        this.f84821c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i10 = this.f84820b;
        int i11 = (iA + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f84820b = i11;
        return new C5649a(this, i10, i11);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i10 = this.f84820b;
        if (i10 >= iA) {
            return false;
        }
        this.f84820b = i10 + 1;
        try {
            consumer.accept(this.f84819a.get(i10));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int iA = a();
        this.f84820b = iA;
        for (int i10 = this.f84820b; i10 < iA; i10++) {
            try {
                consumer.accept(this.f84819a.get(i10));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f84820b;
    }
}
