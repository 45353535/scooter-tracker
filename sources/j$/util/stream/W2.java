package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class W2 extends AbstractC5677c implements Consumer, Iterable, j$.lang.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f85160e = new Object[1 << 4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[][] f85161f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final void s(long j10) {
        long length;
        int i10 = this.f85226c;
        if (i10 == 0) {
            length = this.f85160e.length;
        } else {
            length = this.f85227d[i10] + ((long) this.f85161f[i10].length);
        }
        if (j10 > length) {
            if (this.f85161f == null) {
                Object[][] objArr = new Object[8][];
                this.f85161f = objArr;
                this.f85227d = new long[8];
                objArr[0] = this.f85160e;
            }
            int i11 = i10 + 1;
            while (j10 > length) {
                Object[][] objArr2 = this.f85161f;
                if (i11 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f85161f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f85227d = Arrays.copyOf(this.f85227d, length2);
                }
                int iMin = this.f85224a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                Object[][] objArr3 = this.f85161f;
                objArr3[i11] = new Object[i12];
                long[] jArr = this.f85227d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) objArr3[i13].length);
                length += (long) i12;
                i11++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC5677c
    public final void clear() {
        Object[][] objArr = this.f85161f;
        if (objArr != null) {
            this.f85160e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f85160e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f85161f = null;
            this.f85227d = null;
        } else {
            for (int i11 = 0; i11 < this.f85225b; i11++) {
                this.f85160e[i11] = null;
            }
        }
        this.f85225b = 0;
        this.f85226c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d0(spliterator);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f85226c; i10++) {
            for (Object obj : this.f85161f[i10]) {
                consumer.p(obj);
            }
        }
        for (int i11 = 0; i11 < this.f85225b; i11++) {
            consumer.p(this.f85160e[i11]);
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void p(Object obj) {
        long length;
        int i10 = this.f85225b;
        Object[] objArr = this.f85160e;
        if (i10 == objArr.length) {
            if (this.f85161f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f85161f = objArr2;
                this.f85227d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f85226c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f85161f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i11].length) + this.f85227d[i11];
                }
                s(length + 1);
            }
            this.f85225b = 0;
            int i13 = this.f85226c + 1;
            this.f85226c = i13;
            this.f85160e = this.f85161f[i13];
        }
        Object[] objArr4 = this.f85160e;
        int i14 = this.f85225b;
        this.f85225b = i14 + 1;
        objArr4[i14] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new j$.time.format.r(11, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new N2(this, 0, this.f85226c, 0, this.f85225b);
    }
}
