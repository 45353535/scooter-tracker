package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public class R2 extends V2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.V2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i10 < i11) {
            intConsumer.accept(iArr[i10]);
            i10++;
        }
    }

    @Override // j$.util.stream.V2
    public final int t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (I3.f85057a) {
                I3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC5650b.b((Q2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    public final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.V2
    public final Object c(int i10) {
        return new int[i10];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i10) {
        x();
        int[] iArr = (int[]) this.f85154e;
        int i11 = this.f85225b;
        this.f85225b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.e0(ofIntSpliterator);
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new Q2(this, 0, this.f85226c, 0, this.f85225b);
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f85226c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f85226c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
