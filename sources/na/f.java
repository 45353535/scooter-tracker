package na;

import java.util.ArrayList;
import java.util.zip.Inflater;
import na.e;
import q9.c0;
import q9.d0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList arrayListF;
        d0 d0Var = new d0(bArr);
        try {
            arrayListF = c(d0Var) ? f(d0Var) : e(d0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e((e.a) arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e((e.a) arrayListF.get(0), (e.a) arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(d0 d0Var) {
        d0Var.X(4);
        int iQ = d0Var.q();
        d0Var.W(0);
        return iQ == 1886547818;
    }

    private static e.a d(d0 d0Var) {
        int iQ = d0Var.q();
        e.a aVar = null;
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            fArr[i10] = d0Var.p();
        }
        int iQ2 = d0Var.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iQ) * 2.0d) / dLog);
        c0 c0Var = new c0(d0Var.e());
        int i11 = 8;
        c0Var.p(d0Var.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iQ2) {
            e.a aVar2 = aVar;
            int i14 = 0;
            while (i14 < 5) {
                int iB = iArr[i14] + b(c0Var.h(iCeil));
                if (iB >= iQ || iB < 0) {
                    return aVar2;
                }
                fArr2[i13] = fArr[iB];
                iArr[i14] = iB;
                i14++;
                i13++;
            }
            i12++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        c0Var.p((c0Var.e() + 7) & (-8));
        int i15 = 32;
        int iH = c0Var.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = c0Var.h(i11);
            int iH3 = c0Var.h(i11);
            int iH4 = c0Var.h(i15);
            if (iH4 > 128000) {
                return aVar3;
            }
            int i17 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < iH4) {
                int iB2 = i19 + b(c0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iQ2) {
                    return aVar3;
                }
                int i20 = i18 * 3;
                int i21 = iB2 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i18 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
                i18++;
                i19 = iB2;
            }
            bVarArr[i16] = new e.b(iH2, fArr3, fArr4, iH3);
            i16++;
            iH = i17;
            i15 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList e(d0 d0Var) {
        if (d0Var.H() != 0) {
            return null;
        }
        d0Var.X(7);
        int iQ = d0Var.q();
        if (iQ == 1684433976) {
            d0 d0Var2 = new d0();
            Inflater inflater = new Inflater(true);
            try {
                if (!o0.B0(d0Var, d0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                d0Var = d0Var2;
            } finally {
                inflater.end();
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(d0Var);
    }

    private static ArrayList f(d0 d0Var) {
        int iQ;
        d0Var.X(8);
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG && (iQ = d0Var.q() + iF) > iF && iQ <= iG) {
            int iQ2 = d0Var.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                d0Var.V(iQ);
                return e(d0Var);
            }
            d0Var.W(iQ);
            iF = iQ;
        }
        return null;
    }

    private static ArrayList g(d0 d0Var) {
        ArrayList arrayList = new ArrayList();
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG) {
            int iQ = d0Var.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (d0Var.q() == 1835365224) {
                e.a aVarD = d(d0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            d0Var.W(iQ);
            iF = iQ;
        }
        return arrayList;
    }
}
