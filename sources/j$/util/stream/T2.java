package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class T2 extends V2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.V2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i10 < i11) {
            longConsumer.accept(jArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.V2
    public final int t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC5650b.c((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    public final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.V2
    public final Object c(int i10) {
        return new long[i10];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j10) {
        x();
        long[] jArr = (long[]) this.f85154e;
        int i10 = this.f85225b;
        this.f85225b = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Y ySpliterator = spliterator();
        Objects.requireNonNull(ySpliterator);
        return new j$.util.f0(ySpliterator);
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.Y spliterator() {
        return new S2(this, 0, this.f85226c, 0, this.f85225b);
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f85226c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f85226c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
