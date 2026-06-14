package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.cn;
import com.ironsource.adqualitysdk.sdk.i.hy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class cp {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1406;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f1407;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hy.c f1408;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cn f1409;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hy m5921(ia iaVar) {
        return this.f1408.m6713(iaVar, this.f1407, this.f1406);
    }

    public static class e extends cz implements cl {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1410 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1411 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f1412 = 6;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1413 = {'s', 'e', 't', 'M', 'i', 'n', 'D', 'p', 'h', 'F', 'o', 'r', 'S', 'u', 'C', 'l', 'a', 'c', 'W', 'k', 'R', 'f', 'w', 'I', 'A', 'y', 'O', 'b', 'j', 'g', 'm', 'v', 'x', 'z', '{', '|'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1414 = 57;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cn.e f1415;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cp f1416;

        public e(List<String> list, int i10) {
            cp cpVar = new cp();
            this.f1416 = cpVar;
            cpVar.f1408 = new hy.c();
            this.f1416.f1407 = list;
            this.f1416.f1406 = i10;
            this.f1415 = new cn.e();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cp m5922() {
            f1410 = (f1411 + 37) % 128;
            this.f1416.f1409 = this.f1415.m5908();
            cp cpVar = this.f1416;
            f1411 = (f1410 + 91) % 128;
            return cpVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5924(String str, int i10, boolean z10, int i11, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (b.f730) {
                try {
                    char[] cArr2 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i13 = b.f728;
                        if (i13 >= i10) {
                            break;
                        }
                        b.f729 = cArr[i13];
                        cArr2[b.f728] = (char) (b.f729 + i12);
                        int i14 = b.f728;
                        cArr2[i14] = (char) (cArr2[i14] - f1414);
                        b.f728 = i14 + 1;
                    }
                    if (i11 > 0) {
                        b.f731 = i11;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = b.f731;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = b.f731;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        b.f728 = 0;
                        while (true) {
                            int i17 = b.f728;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            b.f728 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02f4  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo5100(java.lang.String r22, java.util.List<java.lang.Object> r23, com.ironsource.adqualitysdk.sdk.i.ch r24) {
            /*
                Method dump skipped, instruction units count: 1334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cp.e.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m5923(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f1413;
                    char c10 = f1412;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        g.f2158 = 0;
                        while (true) {
                            int i11 = g.f2158;
                            if (i11 >= i10) {
                                break;
                            }
                            g.f2157 = cArr[i11];
                            g.f2155 = cArr[g.f2158 + 1];
                            if (g.f2157 == g.f2155) {
                                cArr3[g.f2158] = (char) (g.f2157 - b10);
                                cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                            } else {
                                g.f2156 = g.f2157 / c10;
                                g.f2154 = g.f2157 % c10;
                                g.f2159 = g.f2155 / c10;
                                g.f2152 = g.f2155 % c10;
                                if (g.f2154 == g.f2152) {
                                    g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                    g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                    int i12 = (g.f2156 * c10) + g.f2154;
                                    int i13 = (g.f2159 * c10) + g.f2152;
                                    int i14 = g.f2158;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (g.f2156 == g.f2159) {
                                    g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                    g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                    int i15 = (g.f2156 * c10) + g.f2154;
                                    int i16 = (g.f2159 * c10) + g.f2152;
                                    int i17 = g.f2158;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (g.f2156 * c10) + g.f2152;
                                    int i19 = (g.f2159 * c10) + g.f2154;
                                    int i20 = g.f2158;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            g.f2158 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cn m5920() {
        return this.f1409;
    }
}
