package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f118661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v43[] f118662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f118663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][][] f118664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v43 f118665f;

    public zg1(int[] iArr, v43[] v43VarArr, int[] iArr2, int[][][] iArr3, v43 v43Var) {
        this.f118661b = iArr;
        this.f118662c = v43VarArr;
        this.f118664e = iArr3;
        this.f118663d = iArr2;
        this.f118665f = v43Var;
        this.f118660a = iArr.length;
    }

    public final int a(int i10, int i11) {
        int i12 = this.f118662c[i10].a(i11).f116494b;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f118664e[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        int iMin = 16;
        int i16 = 0;
        String str = null;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f118662c[i10].a(i11).f116497e[iArrCopyOf[i13]].f118398m;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !w83.a(str, str2);
            }
            iMin = Math.min(iMin, this.f118664e[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.f118663d[i10]) : iMin;
    }
}
