package oa;

/* JADX INFO: loaded from: classes12.dex */
public abstract class y {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f96675a;
    }

    private static boolean a(q9.d0 d0Var, b0 b0Var, int i10) {
        int iJ = j(d0Var, i10);
        return iJ != -1 && iJ <= b0Var.f96465b;
    }

    private static boolean b(q9.d0 d0Var, int i10) {
        return d0Var.H() == q9.o0.y(d0Var.e(), i10, d0Var.f() - 1, 0);
    }

    private static boolean c(q9.d0 d0Var, b0 b0Var, boolean z10, a aVar) {
        try {
            long jQ = d0Var.Q();
            if (!z10) {
                jQ *= (long) b0Var.f96465b;
            }
            aVar.f96675a = jQ;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(q9.d0 d0Var, b0 b0Var, int i10, a aVar) {
        int iF = d0Var.f();
        long J = d0Var.J();
        long j10 = J >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) (15 & (J >> 4)), b0Var) && f((int) ((J >> 1) & 7), b0Var) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(d0Var, b0Var, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(d0Var, b0Var, (int) ((J >> 12) & 15)) && e(d0Var, b0Var, (int) ((J >> 8) & 15)) && b(d0Var, iF);
    }

    private static boolean e(q9.d0 d0Var, b0 b0Var, int i10) {
        int i11 = b0Var.f96468e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == b0Var.f96469f;
        }
        if (i10 == 12) {
            return d0Var.H() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iP = d0Var.P();
            if (i10 == 14) {
                iP *= 10;
            }
            if (iP == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, b0 b0Var) {
        return i10 == 0 || i10 == b0Var.f96472i;
    }

    private static boolean g(int i10, b0 b0Var) {
        return i10 <= 7 ? i10 == b0Var.f96470g - 1 : i10 <= 10 && b0Var.f96470g == 2;
    }

    public static boolean h(s sVar, b0 b0Var, int i10, a aVar) {
        long peekPosition = sVar.getPeekPosition();
        byte[] bArr = new byte[2];
        sVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            sVar.resetPeekPosition();
            sVar.advancePeekPosition((int) (peekPosition - sVar.getPosition()));
            return false;
        }
        q9.d0 d0Var = new q9.d0(16);
        System.arraycopy(bArr, 0, d0Var.e(), 0, 2);
        d0Var.V(u.c(sVar, d0Var.e(), 2, 14));
        sVar.resetPeekPosition();
        sVar.advancePeekPosition((int) (peekPosition - sVar.getPosition()));
        return d(d0Var, b0Var, i10, aVar);
    }

    public static long i(s sVar, b0 b0Var) throws n9.x {
        sVar.resetPeekPosition();
        sVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        sVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        sVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        q9.d0 d0Var = new q9.d0(i10);
        d0Var.V(u.c(sVar, d0Var.e(), 0, i10));
        sVar.resetPeekPosition();
        a aVar = new a();
        if (c(d0Var, b0Var, z10, aVar)) {
            return aVar.f96675a;
        }
        throw n9.x.a(null, null);
    }

    public static int j(q9.d0 d0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return d0Var.H() + 1;
            case 7:
                return d0Var.P() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
