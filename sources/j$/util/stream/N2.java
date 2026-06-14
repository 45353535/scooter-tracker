package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class N2 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f85105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W2 f85106f;

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

    public N2(W2 w22, int i10, int i11, int i12, int i13) {
        this.f85106f = w22;
        this.f85101a = i10;
        this.f85102b = i11;
        this.f85103c = i12;
        this.f85104d = i13;
        Object[][] objArr = w22.f85161f;
        this.f85105e = objArr == null ? w22.f85160e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f85101a;
        int i11 = this.f85104d;
        int i12 = this.f85102b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f85103c);
        }
        long[] jArr = this.f85106f.f85227d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f85103c);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f85101a;
        int i11 = this.f85102b;
        if (i10 >= i11 && (i10 != i11 || this.f85103c >= this.f85104d)) {
            return false;
        }
        Object[] objArr = this.f85105e;
        int i12 = this.f85103c;
        this.f85103c = i12 + 1;
        consumer.p(objArr[i12]);
        if (this.f85103c == this.f85105e.length) {
            this.f85103c = 0;
            int i13 = this.f85101a + 1;
            this.f85101a = i13;
            Object[][] objArr2 = this.f85106f.f85161f;
            if (objArr2 != null && i13 <= i11) {
                this.f85105e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        W2 w22;
        Objects.requireNonNull(consumer);
        int i10 = this.f85101a;
        int i11 = this.f85104d;
        int i12 = this.f85102b;
        if (i10 < i12 || (i10 == i12 && this.f85103c < i11)) {
            int i13 = this.f85103c;
            while (true) {
                w22 = this.f85106f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = w22.f85161f[i10];
                while (i13 < objArr.length) {
                    consumer.p(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f85101a == i12 ? this.f85105e : w22.f85161f[i12];
            while (i13 < i11) {
                consumer.p(objArr2[i13]);
                i13++;
            }
            this.f85101a = i12;
            this.f85103c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f85101a;
        int i11 = this.f85102b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f85103c;
            W2 w22 = this.f85106f;
            N2 n22 = new N2(w22, i10, i12, i13, w22.f85161f[i12].length);
            this.f85101a = i11;
            this.f85103c = 0;
            this.f85105e = w22.f85161f[i11];
            return n22;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f85103c;
        int i15 = (this.f85104d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        Object[] objArr = this.f85105e;
        int i16 = i14 + i15;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i14, i16);
        j$.util.h0 h0Var = new j$.util.h0(objArr, i14, i16, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
        this.f85103c += i15;
        return h0Var;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
