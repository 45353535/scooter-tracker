package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a73 {
    public static long a(int i10, int i11, w92 w92Var) {
        w92Var.e(i10);
        if (w92Var.f117358c - w92Var.f117357b < 5) {
            return -9223372036854775807L;
        }
        int iB = w92Var.b();
        if ((8388608 & iB) != 0 || ((2096896 & iB) >> 8) != i11 || (iB & 32) == 0 || w92Var.m() < 7 || w92Var.f117358c - w92Var.f117357b < 7 || (w92Var.m() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        w92Var.a(bArr, 0, 6);
        return ((255 & ((long) bArr[4])) >> 7) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1);
    }
}
