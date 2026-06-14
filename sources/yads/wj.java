package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f117481a = w83.c("OpusHead");

    public static rj a(int i10, w92 w92Var) {
        w92Var.e(i10 + 12);
        w92Var.e(w92Var.f117357b + 1);
        a(w92Var);
        w92Var.e(w92Var.f117357b + 2);
        int iM = w92Var.m();
        if ((iM & 128) != 0) {
            w92Var.e(w92Var.f117357b + 2);
        }
        if ((iM & 64) != 0) {
            w92Var.e(w92Var.f117357b + w92Var.m());
        }
        if ((iM & 32) != 0) {
            w92Var.e(w92Var.f117357b + 2);
        }
        w92Var.e(w92Var.f117357b + 1);
        a(w92Var);
        String strA = tr1.a(w92Var.m());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new rj(strA, null, -1L, -1L);
        }
        w92Var.e(w92Var.f117357b + 4);
        long jN = w92Var.n();
        long jN2 = w92Var.n();
        w92Var.e(w92Var.f117357b + 1);
        int iA = a(w92Var);
        byte[] bArr = new byte[iA];
        w92Var.a(bArr, 0, iA);
        return new rj(strA, bArr, jN2 > 0 ? jN2 : -1L, jN > 0 ? jN : -1L);
    }

    public static int a(w92 w92Var) {
        int iM = w92Var.m();
        int i10 = iM & 127;
        while ((iM & 128) == 128) {
            iM = w92Var.m();
            i10 = (i10 << 7) | (iM & 127);
        }
        return i10;
    }

    public static Pair a(int i10, int i11, w92 w92Var) throws ba2 {
        Integer num;
        s43 s43Var;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = w92Var.f117357b;
        while (i14 - i10 < i11) {
            w92Var.e(i14);
            int iB = w92Var.b();
            bp0.a("childAtomSize must be positive", iB > 0);
            if (w92Var.b() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strA = null;
                while (i15 - i14 < iB) {
                    w92Var.e(i15);
                    int iB2 = w92Var.b();
                    int iB3 = w92Var.b();
                    if (iB3 == 1718775137) {
                        numValueOf = Integer.valueOf(w92Var.b());
                    } else if (iB3 == 1935894637) {
                        w92Var.e(w92Var.f117357b + 4);
                        strA = w92Var.a(4, st.f115925c);
                    } else if (iB3 == 1935894633) {
                        i17 = i15;
                        i16 = iB2;
                    }
                    i15 += iB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    bp0.a("frma atom is mandatory", numValueOf != null);
                    bp0.a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = numValueOf;
                            s43Var = null;
                            break;
                        }
                        w92Var.e(i18);
                        int iB4 = w92Var.b();
                        if (w92Var.b() == 1952804451) {
                            int iB5 = (w92Var.b() >> 24) & 255;
                            w92Var.e(w92Var.f117357b + 1);
                            if (iB5 == 0) {
                                w92Var.e(w92Var.f117357b + 1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iM = w92Var.m();
                                i12 = iM & 15;
                                i13 = (iM & 240) >> 4;
                            }
                            if (w92Var.m() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iM2 = w92Var.m();
                            byte[] bArr2 = new byte[16];
                            w92Var.a(bArr2, 0, 16);
                            if (z10 && iM2 == 0) {
                                int iM3 = w92Var.m();
                                byte[] bArr3 = new byte[iM3];
                                w92Var.a(bArr3, 0, iM3);
                                bArr = bArr3;
                            }
                            num = num2;
                            s43Var = new s43(z10, strA, iM2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iB4;
                        }
                    }
                    bp0.a("tenc atom is mandatory", s43Var != null);
                    int i19 = w83.f117341a;
                    pairCreate = Pair.create(num, s43Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iB;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06aa A[PHI: r32 r33 r34
  0x06aa: PHI (r32v8 java.util.List) = 
  (r32v6 java.util.List)
  (r32v9 java.util.List)
  (r32v9 java.util.List)
  (r32v9 java.util.List)
  (r32v9 java.util.List)
  (r32v13 java.util.List)
 binds: [B:322:0x066a, B:300:0x05e9, B:289:0x0572, B:280:0x0531, B:273:0x04ef, B:255:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x06aa: PHI (r33v8 int) = (r33v5 int), (r33v9 int), (r33v9 int), (r33v9 int), (r33v9 int), (r33v13 int) binds: [B:322:0x066a, B:300:0x05e9, B:289:0x0572, B:280:0x0531, B:273:0x04ef, B:255:0x045e] A[DONT_GENERATE, DONT_INLINE]
  0x06aa: PHI (r34v11 java.lang.String) = 
  (r34v6 java.lang.String)
  (r34v12 java.lang.String)
  (r34v12 java.lang.String)
  (r34v12 java.lang.String)
  (r34v16 java.lang.String)
  (r34v19 java.lang.String)
 binds: [B:322:0x066a, B:300:0x05e9, B:289:0x0572, B:280:0x0531, B:273:0x04ef, B:255:0x045e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.tj a(yads.w92 r50, int r51, int r52, java.lang.String r53, yads.fj0 r54, boolean r55) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 3049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wj.a(yads.w92, int, int, java.lang.String, yads.fj0, boolean):yads.tj");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(yads.nj r54, yads.lx0 r55, long r56, yads.fj0 r58, boolean r59, boolean r60, yads.ix0 r61) {
        /*
            Method dump skipped, instruction units count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wj.a(yads.nj, yads.lx0, long, yads.fj0, boolean, boolean, yads.ix0):java.util.ArrayList");
    }
}
