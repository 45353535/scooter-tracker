package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U2 implements j$.util.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f85150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V2 f85151f;

    public abstract void a(int i10, Object obj, Object obj2);

    public abstract j$.util.b0 b(Object obj, int i10, int i11);

    public abstract j$.util.b0 c(int i10, int i11, int i12, int i13);

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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public U2(V2 v22, int i10, int i11, int i12, int i13) {
        this.f85151f = v22;
        this.f85146a = i10;
        this.f85147b = i11;
        this.f85148c = i12;
        this.f85149d = i13;
        Object[] objArr = v22.f85155f;
        this.f85150e = objArr == null ? v22.f85154e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f85146a;
        int i11 = this.f85149d;
        int i12 = this.f85147b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f85148c);
        }
        long[] jArr = this.f85151f.f85227d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f85148c);
    }

    @Override // j$.util.b0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f85146a;
        int i11 = this.f85147b;
        if (i10 >= i11 && (i10 != i11 || this.f85148c >= this.f85149d)) {
            return false;
        }
        Object obj2 = this.f85150e;
        int i12 = this.f85148c;
        this.f85148c = i12 + 1;
        a(i12, obj2, obj);
        int i13 = this.f85148c;
        Object obj3 = this.f85150e;
        V2 v22 = this.f85151f;
        if (i13 == v22.t(obj3)) {
            this.f85148c = 0;
            int i14 = this.f85146a + 1;
            this.f85146a = i14;
            Object[] objArr = v22.f85155f;
            if (objArr != null && i14 <= i11) {
                this.f85150e = objArr[i14];
            }
        }
        return true;
    }

    @Override // j$.util.b0
    public final void forEachRemaining(Object obj) {
        V2 v22;
        Objects.requireNonNull(obj);
        int i10 = this.f85146a;
        int i11 = this.f85149d;
        int i12 = this.f85147b;
        if (i10 < i12 || (i10 == i12 && this.f85148c < i11)) {
            int i13 = this.f85148c;
            while (true) {
                v22 = this.f85151f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = v22.f85155f[i10];
                v22.s(obj2, i13, v22.t(obj2), obj);
                i10++;
                i13 = 0;
            }
            v22.s(this.f85146a == i12 ? this.f85150e : v22.f85155f[i12], i13, i11, obj);
            this.f85146a = i12;
            this.f85148c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.b0 trySplit() {
        int i10 = this.f85146a;
        int i11 = this.f85147b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f85148c;
            V2 v22 = this.f85151f;
            j$.util.b0 b0VarC = c(i10, i12, i13, v22.t(v22.f85155f[i12]));
            this.f85146a = i11;
            this.f85148c = 0;
            this.f85150e = v22.f85155f[i11];
            return b0VarC;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f85148c;
        int i15 = (this.f85149d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.b0 b0VarB = b(this.f85150e, i14, i15);
        this.f85148c += i15;
        return b0VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Y trySplit() {
        return (j$.util.Y) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) trySplit();
    }
}
