package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class p0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f84967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f84968b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f84970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84971e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC5650b.e(this, i10);
    }

    public p0(java.util.Collection collection, int i10) {
        this.f84967a = collection;
        this.f84969c = (i10 & 4096) == 0 ? i10 | 16448 : i10;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f84968b;
        if (it == null) {
            java.util.Collection collection = this.f84967a;
            Iterator it2 = collection.iterator();
            this.f84968b = it2;
            size = collection.size();
            this.f84970d = size;
            it = it2;
        } else {
            size = this.f84970d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f84971e + 1024;
        if (i10 > size) {
            i10 = (int) size;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f84971e = i11;
        long j10 = this.f84970d;
        if (j10 != Long.MAX_VALUE) {
            this.f84970d = j10 - ((long) i11);
        }
        return new h0(objArr, 0, i11, this.f84969c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f84968b;
        if (it == null) {
            Iterator it2 = this.f84967a.iterator();
            this.f84968b = it2;
            this.f84970d = r0.size();
            it = it2;
        }
        AbstractC5650b.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f84968b == null) {
            this.f84968b = this.f84967a.iterator();
            this.f84970d = r0.size();
        }
        if (!this.f84968b.hasNext()) {
            return false;
        }
        consumer.accept(this.f84968b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f84968b == null) {
            java.util.Collection collection = this.f84967a;
            this.f84968b = collection.iterator();
            long size = collection.size();
            this.f84970d = size;
            return size;
        }
        return this.f84970d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f84969c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (AbstractC5650b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
