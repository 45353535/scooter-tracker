package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yt implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f118374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f118375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f118376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f118377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f118378f;

    public yt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f118374b = iArr;
        this.f118375c = jArr;
        this.f118376d = jArr2;
        this.f118377e = jArr3;
        int length = iArr.length;
        this.f118373a = length;
        if (length <= 0) {
            this.f118378f = 0L;
        } else {
            int i10 = length - 1;
            this.f118378f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f118378f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f118373a + ", sizes=" + Arrays.toString(this.f118374b) + ", offsets=" + Arrays.toString(this.f118375c) + ", timeUs=" + Arrays.toString(this.f118377e) + ", durationsUs=" + Arrays.toString(this.f118376d) + ")";
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        int iB = w83.b(this.f118377e, j10, true);
        long[] jArr = this.f118377e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f118375c;
        pu2 pu2Var = new pu2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f118373a - 1) {
            return new lu2(pu2Var, pu2Var);
        }
        int i10 = iB + 1;
        return new lu2(pu2Var, new pu2(jArr[i10], jArr2[i10]));
    }
}
