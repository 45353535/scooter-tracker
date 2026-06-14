package j$.util.concurrent;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends o implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f84854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84855j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    public f(k[] kVarArr, int i10, int i11, int i12, long j10, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i10, i11, i12);
        this.f84854i = concurrentHashMap;
        this.f84855j = j10;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f84876f;
        int i11 = this.f84877g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        k[] kVarArr = this.f84871a;
        this.f84877g = i12;
        long j10 = this.f84855j >>> 1;
        this.f84855j = j10;
        return new f(kVarArr, this.f84878h, i12, i11, j10, this.f84854i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            k kVarA = a();
            if (kVarA == null) {
                return;
            } else {
                consumer.p(new j(kVarA.f84864b, kVarA.f84865c, this.f84854i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        k kVarA = a();
        if (kVarA == null) {
            return false;
        }
        consumer.p(new j(kVarA.f84864b, kVarA.f84865c, this.f84854i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f84855j;
    }
}
