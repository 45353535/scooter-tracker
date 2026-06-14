package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class P2 extends V2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.V2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i10 < i11) {
            doubleConsumer.accept(dArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.V2
    public final int t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e((DoubleConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC5650b.a((O2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    public final Object[] w() {
        return new double[8][];
    }

    @Override // j$.util.stream.V2
    public final Object c(int i10) {
        return new double[i10];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        x();
        double[] dArr = (double[]) this.f85154e;
        int i10 = this.f85225b;
        this.f85225b = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.T tSpliterator = spliterator();
        Objects.requireNonNull(tSpliterator);
        return new j$.util.g0(tSpliterator);
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.T spliterator() {
        return new O2(this, 0, this.f85226c, 0, this.f85225b);
    }

    public final String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f85226c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f85226c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
