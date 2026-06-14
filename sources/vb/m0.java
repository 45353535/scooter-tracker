package vb;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m0 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(q9.d0 d0Var, int i10, int i11) {
        d0Var.W(i10);
        if (d0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iQ = d0Var.q();
        if ((8388608 & iQ) != 0 || ((2096896 & iQ) >> 8) != i11 || (iQ & 32) == 0 || d0Var.H() < 7 || d0Var.a() < 7 || (d0Var.H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        d0Var.l(bArr, 0, 6);
        return d(bArr);
    }

    private static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
