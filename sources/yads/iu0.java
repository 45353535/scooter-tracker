package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iu0 {
    public static mu0 a(w92 w92Var) {
        w92Var.e(w92Var.f117357b + 1);
        int iO = w92Var.o();
        long j10 = ((long) w92Var.f117357b) + ((long) iO);
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jI = w92Var.i();
            if (jI == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jI;
            jArrCopyOf2[i11] = w92Var.i();
            w92Var.e(w92Var.f117357b + 2);
            i11++;
        }
        int i12 = w92Var.f117357b;
        w92Var.e(i12 + ((int) (j10 - ((long) i12))));
        return new mu0(jArrCopyOf, jArrCopyOf2);
    }
}
