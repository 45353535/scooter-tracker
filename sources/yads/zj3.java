package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class zj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f118721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118724d;

    public zj3(byte[] bArr) {
        this.f118721a = bArr;
        this.f118722b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f118721a[this.f118723c] & 255) >> this.f118724d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f118723c + i11;
        this.f118723c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f118724d;
        this.f118724d = i13;
        if (i13 > 7) {
            this.f118723c = i12 + 1;
            this.f118724d = i13 - 8;
        }
        int i14 = this.f118723c;
        if (i14 >= 0) {
            int i15 = this.f118722b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f118724d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i10) {
        int i11 = this.f118723c;
        int iMin = Math.min(i10, 8 - this.f118724d);
        int i12 = i11 + 1;
        int i13 = ((this.f118721a[i11] & 255) >> this.f118724d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f118721a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
