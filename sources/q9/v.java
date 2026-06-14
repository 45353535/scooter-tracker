package q9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f98882b;

    public v() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f98881a;
        long[] jArr = this.f98882b;
        if (i10 == jArr.length) {
            this.f98882b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f98882b;
        int i11 = this.f98881a;
        this.f98881a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f98881a + jArr.length;
        long[] jArr2 = this.f98882b;
        if (length > jArr2.length) {
            this.f98882b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f98882b, this.f98881a, jArr.length);
        this.f98881a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f98881a) {
            return this.f98882b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f98881a);
    }

    public int d() {
        return this.f98881a;
    }

    public v(int i10) {
        this.f98882b = new long[i10];
    }
}
