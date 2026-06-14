package q9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f98797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f98798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98800d;

    public i0() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f98799c;
        int i11 = this.f98800d;
        Object[] objArr = this.f98798b;
        int length = (i10 + i11) % objArr.length;
        this.f98797a[length] = j10;
        objArr[length] = obj;
        this.f98800d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f98800d > 0) {
            if (j10 <= this.f98797a[((this.f98799c + r0) - 1) % this.f98798b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f98798b.length;
        if (this.f98800d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f98799c;
        int i12 = length - i11;
        System.arraycopy(this.f98797a, i11, jArr, 0, i12);
        System.arraycopy(this.f98798b, this.f98799c, objArrF, 0, i12);
        int i13 = this.f98799c;
        if (i13 > 0) {
            System.arraycopy(this.f98797a, 0, jArr, i12, i13);
            System.arraycopy(this.f98798b, 0, objArrF, i12, this.f98799c);
        }
        this.f98797a = jArr;
        this.f98798b = objArrF;
        this.f98799c = 0;
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object h(long j10, boolean z10) {
        Object objK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f98800d > 0) {
            long j12 = j10 - this.f98797a[this.f98799c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objK = k();
            j11 = j12;
        }
        return objK;
    }

    private Object k() {
        a.g(this.f98800d > 0);
        Object[] objArr = this.f98798b;
        int i10 = this.f98799c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f98799c = (i10 + 1) % objArr.length;
        this.f98800d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f98799c = 0;
        this.f98800d = 0;
        Arrays.fill(this.f98798b, (Object) null);
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public synchronized Object i() {
        return this.f98800d == 0 ? null : k();
    }

    public synchronized Object j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f98800d;
    }

    public i0(int i10) {
        this.f98797a = new long[i10];
        this.f98798b = f(i10);
    }
}
