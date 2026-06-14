package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ht {
    public static void a(long j10, w92 w92Var, z43[] z43VarArr) {
        int i10;
        while (true) {
            if (w92Var.f117358c - w92Var.f117357b <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (w92Var.f117358c - w92Var.f117357b == 0) {
                    i10 = -1;
                    break;
                }
                int iM = w92Var.m();
                i11 += iM;
                if (iM != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (w92Var.f117358c - w92Var.f117357b == 0) {
                    i12 = -1;
                    break;
                }
                int iM2 = w92Var.m();
                i12 += iM2;
                if (iM2 != 255) {
                    break;
                }
            }
            int i13 = w92Var.f117357b;
            int i14 = i13 + i12;
            if (i12 == -1 || i12 > w92Var.f117358c - i13) {
                uf1.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i14 = w92Var.f117358c;
            } else if (i10 == 4 && i12 >= 8) {
                int iM3 = w92Var.m();
                int iR = w92Var.r();
                int iB = iR == 49 ? w92Var.b() : 0;
                int iM4 = w92Var.m();
                if (iR == 47) {
                    w92Var.e(w92Var.f117357b + 1);
                }
                boolean z10 = iM3 == 181 && (iR == 49 || iR == 47) && iM4 == 3;
                if (iR == 49) {
                    z10 &= iB == 1195456820;
                }
                if (z10) {
                    b(j10, w92Var, z43VarArr);
                }
            }
            w92Var.e(i14);
        }
    }

    public static void b(long j10, w92 w92Var, z43[] z43VarArr) {
        long j11;
        int iM = w92Var.m();
        if ((iM & 64) != 0) {
            w92Var.e(w92Var.f117357b + 1);
            int i10 = (iM & 31) * 3;
            int i11 = w92Var.f117357b;
            int length = z43VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                z43 z43Var = z43VarArr[i12];
                w92Var.e(i11);
                z43Var.a(i10, w92Var);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    z43Var.a(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
