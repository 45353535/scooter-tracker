package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class wf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f117443b;

    public wf1() {
        this(0);
    }

    public final void a(long j10) {
        int i10 = this.f117442a;
        long[] jArr = this.f117443b;
        if (i10 == jArr.length) {
            this.f117443b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f117443b;
        int i11 = this.f117442a;
        this.f117442a = i11 + 1;
        jArr2[i11] = j10;
    }

    public wf1(int i10) {
        this.f117443b = new long[32];
    }

    public final long a(int i10) {
        if (i10 >= 0 && i10 < this.f117442a) {
            return this.f117443b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f117442a);
    }

    public final long[] a() {
        return Arrays.copyOf(this.f117443b, this.f117442a);
    }
}
