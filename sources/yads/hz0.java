package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f111808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f111809d;

    public hz0(List list, int i10, float f10, String str) {
        this.f111806a = list;
        this.f111807b = i10;
        this.f111808c = f10;
        this.f111809d = str;
    }

    public static hz0 a(w92 w92Var) throws ba2 {
        boolean z10;
        int i10;
        boolean z11 = true;
        try {
            w92Var.e(w92Var.f117357b + 21);
            int iM = w92Var.m() & 3;
            int iM2 = w92Var.m();
            int i11 = w92Var.f117357b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < iM2; i14++) {
                w92Var.e(w92Var.f117357b + 1);
                int iR = w92Var.r();
                for (int i15 = 0; i15 < iR; i15++) {
                    int iR2 = w92Var.r();
                    i13 += iR2 + 4;
                    w92Var.e(w92Var.f117357b + iR2);
                }
            }
            w92Var.e(i11);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String strA = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < iM2) {
                int iM3 = w92Var.m() & 127;
                int iR3 = w92Var.r();
                int i18 = i12;
                while (i18 < iR3) {
                    int iR4 = w92Var.r();
                    z10 = z11;
                    try {
                        System.arraycopy(pw1.f114801a, i12, bArr, i17, 4);
                        int i19 = i17 + 4;
                        System.arraycopy(w92Var.f117356a, w92Var.f117357b, bArr, i19, iR4);
                        if (iM3 == 33 && i18 == 0) {
                            mw1 mw1VarA = pw1.a(bArr, i19, i19 + iR4);
                            f10 = mw1VarA.f113629g;
                            i10 = iM;
                            strA = tw.a(mw1VarA.f113623a, mw1VarA.f113624b, mw1VarA.f113625c, mw1VarA.f113626d, mw1VarA.f113627e, mw1VarA.f113628f);
                        } else {
                            i10 = iM;
                        }
                        i17 = i19 + iR4;
                        w92Var.e(w92Var.f117357b + iR4);
                        i18++;
                        z11 = z10;
                        iM = i10;
                        i12 = 0;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        e = e10;
                        boolean z12 = z10;
                        throw new ba2("Error parsing HEVC config", e, z12, z12 ? 1 : 0);
                    }
                }
                i16++;
                i12 = 0;
            }
            z10 = z11;
            return new hz0(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            z10 = z11;
        }
    }
}
