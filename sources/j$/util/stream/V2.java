package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class V2 extends AbstractC5677c implements Iterable, j$.lang.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f85154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f85155f;

    public abstract Object c(int i10);

    public abstract void s(Object obj, int i10, int i11, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract int t(Object obj);

    public abstract Object[] w();

    public V2(int i10) {
        super(i10);
        this.f85154e = c(1 << this.f85224a);
    }

    public V2() {
        this.f85154e = c(16);
    }

    public final void v(long j10) {
        long jT;
        int i10 = this.f85226c;
        if (i10 == 0) {
            jT = t(this.f85154e);
        } else {
            jT = ((long) t(this.f85155f[i10])) + this.f85227d[i10];
        }
        if (j10 > jT) {
            if (this.f85155f == null) {
                Object[] objArrW = w();
                this.f85155f = objArrW;
                this.f85227d = new long[8];
                objArrW[0] = this.f85154e;
            }
            int i11 = this.f85226c + 1;
            while (j10 > jT) {
                Object[] objArr = this.f85155f;
                if (i11 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f85155f = Arrays.copyOf(objArr, length);
                    this.f85227d = Arrays.copyOf(this.f85227d, length);
                }
                int iMin = this.f85224a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                this.f85155f[i11] = c(i12);
                long[] jArr = this.f85227d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) t(this.f85155f[i13]));
                jT += (long) i12;
                i11++;
            }
        }
    }

    public final int u(long j10) {
        if (this.f85226c == 0) {
            if (j10 < this.f85225b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        for (int i10 = 0; i10 <= this.f85226c; i10++) {
            if (j10 < this.f85227d[i10] + ((long) t(this.f85155f[i10]))) {
                return i10;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j10));
    }

    public void r(int i10, Object obj) {
        long j10 = i10;
        long jCount = count() + j10;
        if (jCount > t(obj) || jCount < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f85226c == 0) {
            System.arraycopy(this.f85154e, 0, obj, i10, this.f85225b);
            return;
        }
        for (int i11 = 0; i11 < this.f85226c; i11++) {
            Object obj2 = this.f85155f[i11];
            System.arraycopy(obj2, 0, obj, i10, t(obj2));
            i10 += t(this.f85155f[i11]);
        }
        int i12 = this.f85225b;
        if (i12 > 0) {
            System.arraycopy(this.f85154e, 0, obj, i10, i12);
        }
    }

    public Object d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        r(0, objC);
        return objC;
    }

    public final void x() {
        long jT;
        if (this.f85225b == t(this.f85154e)) {
            if (this.f85155f == null) {
                Object[] objArrW = w();
                this.f85155f = objArrW;
                this.f85227d = new long[8];
                objArrW[0] = this.f85154e;
            }
            int i10 = this.f85226c;
            int i11 = i10 + 1;
            Object[] objArr = this.f85155f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    jT = t(this.f85154e);
                } else {
                    jT = ((long) t(objArr[i10])) + this.f85227d[i10];
                }
                v(jT + 1);
            }
            this.f85225b = 0;
            int i12 = this.f85226c + 1;
            this.f85226c = i12;
            this.f85154e = this.f85155f[i12];
        }
    }

    @Override // j$.util.stream.AbstractC5677c
    public final void clear() {
        Object[] objArr = this.f85155f;
        if (objArr != null) {
            this.f85154e = objArr[0];
            this.f85155f = null;
            this.f85227d = null;
        }
        this.f85225b = 0;
        this.f85226c = 0;
    }

    public void e(Object obj) {
        for (int i10 = 0; i10 < this.f85226c; i10++) {
            Object obj2 = this.f85155f[i10];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f85154e, 0, this.f85225b, obj);
    }
}
