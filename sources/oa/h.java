package oa;

import java.util.Arrays;
import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f96547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f96548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f96549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f96550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f96551f;

    public h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f96547b = iArr;
        this.f96548c = jArr;
        this.f96549d = jArr2;
        this.f96550e = jArr3;
        int length = iArr.length;
        this.f96546a = length;
        if (length > 0) {
            this.f96551f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f96551f = 0L;
        }
    }

    public int a(long j10) {
        return q9.o0.h(this.f96550e, j10, true, true);
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96551f;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        int iA = a(j10);
        n0 n0Var = new n0(this.f96550e[iA], this.f96548c[iA]);
        if (n0Var.f96613a >= j10 || iA == this.f96546a - 1) {
            return new m0.a(n0Var);
        }
        int i10 = iA + 1;
        return new m0.a(n0Var, new n0(this.f96550e[i10], this.f96548c[i10]));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f96546a + ", sizes=" + Arrays.toString(this.f96547b) + ", offsets=" + Arrays.toString(this.f96548c) + ", timeUs=" + Arrays.toString(this.f96550e) + ", durationsUs=" + Arrays.toString(this.f96549d) + ")";
    }
}
