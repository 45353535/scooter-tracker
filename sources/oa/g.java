package oa;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    public static void a(long j10, q9.d0 d0Var, s0[] s0VarArr) {
        while (true) {
            if (d0Var.a() <= 1) {
                return;
            }
            int iC = c(d0Var);
            int iC2 = c(d0Var);
            int iF = d0Var.f() + iC2;
            if (iC2 == -1 || iC2 > d0Var.a()) {
                q9.u.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = d0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = d0Var.H();
                int iP = d0Var.P();
                int iQ = iP == 49 ? d0Var.q() : 0;
                int iH2 = d0Var.H();
                if (iP == 47) {
                    d0Var.X(1);
                }
                boolean z10 = iH == 181 && (iP == 49 || iP == 47) && iH2 == 3;
                if (iP == 49) {
                    z10 &= iQ == 1195456820;
                }
                if (z10) {
                    b(j10, d0Var, s0VarArr);
                }
            }
            d0Var.W(iF);
        }
    }

    public static void b(long j10, q9.d0 d0Var, s0[] s0VarArr) {
        int iH = d0Var.H();
        if ((iH & 64) != 0) {
            d0Var.X(1);
            int i10 = (iH & 31) * 3;
            int iF = d0Var.f();
            for (s0 s0Var : s0VarArr) {
                d0Var.W(iF);
                s0Var.c(d0Var, i10);
                q9.a.g(j10 != -9223372036854775807L);
                s0Var.e(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(q9.d0 d0Var) {
        int i10 = 0;
        while (d0Var.a() != 0) {
            int iH = d0Var.H();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }
}
