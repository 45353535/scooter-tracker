package ib;

import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class r {
    private static int a(int i10, d0 d0Var, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && d0Var.a() >= 8 && d0Var.f() + 8 <= i11) {
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ >= 12 && iQ2 == 1936877170) {
                return d0Var.I();
            }
        }
        return -2147483647;
    }

    public static n9.v b(d0 d0Var, int i10) {
        d0Var.X(12);
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1935766900) {
                if (iQ < 16) {
                    return null;
                }
                d0Var.X(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iH = d0Var.H();
                    int iH2 = d0Var.H();
                    if (iH == 0) {
                        i11 = iH2;
                    } else if (iH == 1) {
                        i12 = iH2;
                    }
                }
                int iA = a(i11, d0Var, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new n9.v(new db.d(iA, i12));
            }
            d0Var.W(iF + iQ);
        }
        return null;
    }
}
