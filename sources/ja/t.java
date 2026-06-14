package ja;

import android.util.Pair;
import ga.f0;
import ga.m1;
import io.bidmachine.media3.exoplayer.j2;
import j$.util.Objects;
import java.util.Arrays;
import n9.e0;
import n9.f0;
import q9.o0;
import u9.j0;
import u9.k0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f85685c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f85686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f85687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f85688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m1[] f85689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f85690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f85691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final m1 f85692g;

        a(String[] strArr, int[] iArr, m1[] m1VarArr, int[] iArr2, int[][][] iArr3, m1 m1Var) {
            this.f85687b = strArr;
            this.f85688c = iArr;
            this.f85689d = m1VarArr;
            this.f85691f = iArr3;
            this.f85690e = iArr2;
            this.f85692g = m1Var;
            this.f85686a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f85689d[i10].b(i11).f95294a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f85689d[i10].b(i11).a(iArr[i12]).f80561o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, j0.e(this.f85691f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f85690e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f85691f[i10][i11][i12];
        }

        public int d() {
            return this.f85686a;
        }

        public int e(int i10) {
            return this.f85688c[i10];
        }

        public m1 f(int i10) {
            return this.f85689d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return j0.h(c(i10, i11, i12));
        }

        public m1 h() {
            return this.f85692g;
        }
    }

    private static int n(j2[] j2VarArr, f0 f0Var, int[] iArr, boolean z10) {
        int length = j2VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < j2VarArr.length; i11++) {
            j2 j2Var = j2VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < f0Var.f95294a; i12++) {
                iMax = Math.max(iMax, j0.h(j2Var.a(f0Var.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] o(j2 j2Var, f0 f0Var) {
        int[] iArr = new int[f0Var.f95294a];
        for (int i10 = 0; i10 < f0Var.f95294a; i10++) {
            iArr[i10] = j2Var.a(f0Var.a(i10));
        }
        return iArr;
    }

    private static int[] p(j2[] j2VarArr) {
        int length = j2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = j2VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // ja.w
    public final void i(Object obj) {
        this.f85685c = (a) obj;
    }

    @Override // ja.w
    public final x k(j2[] j2VarArr, m1 m1Var, f0.b bVar, e0 e0Var) {
        int[] iArr = new int[j2VarArr.length + 1];
        int length = j2VarArr.length + 1;
        n9.f0[][] f0VarArr = new n9.f0[length][];
        int[][][] iArr2 = new int[j2VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = m1Var.f72380a;
            f0VarArr[i10] = new n9.f0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(j2VarArr);
        for (int i12 = 0; i12 < m1Var.f72380a; i12++) {
            n9.f0 f0VarB = m1Var.b(i12);
            int iN = n(j2VarArr, f0VarB, iArr, f0VarB.f95296c == 5);
            int[] iArrO = iN == j2VarArr.length ? new int[f0VarB.f95294a] : o(j2VarArr[iN], f0VarB);
            int i13 = iArr[iN];
            f0VarArr[iN][i13] = f0VarB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        m1[] m1VarArr = new m1[j2VarArr.length];
        String[] strArr = new String[j2VarArr.length];
        int[] iArr3 = new int[j2VarArr.length];
        for (int i14 = 0; i14 < j2VarArr.length; i14++) {
            int i15 = iArr[i14];
            m1VarArr[i14] = new m1((n9.f0[]) o0.V0(f0VarArr[i14], i15));
            iArr2[i14] = (int[][]) o0.V0(iArr2[i14], i15);
            strArr[i14] = j2VarArr[i14].getName();
            iArr3[i14] = j2VarArr[i14].getTrackType();
        }
        a aVar = new a(strArr, iArr3, m1VarArr, iArrP, iArr2, new m1((n9.f0[]) o0.V0(f0VarArr[j2VarArr.length], iArr[j2VarArr.length])));
        Pair pairQ = q(aVar, iArr2, iArrP, bVar, e0Var);
        return new x((k0[]) pairQ.first, (r[]) pairQ.second, v.a(aVar, (u[]) pairQ.second), aVar);
    }

    protected abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, f0.b bVar, e0 e0Var);
}
