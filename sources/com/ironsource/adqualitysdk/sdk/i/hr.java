package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class hr extends hp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f2409;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2410;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2411;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<Class> f2412;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2413 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2414;

    public static class c extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2415 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2416 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2417 = {'s', 'e', 't', 'R', 'u', 'r', 'n', 'T', 'y', 'p', 'o', 'F', 'i', 'd', 'k', 'M', 'h', 'a', 'f', 'E', 'x', 'c', 'l', 'v', 'w'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2418 = 4017479574797664034L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2419 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr f2420 = new hr();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6606(Class cls) {
            f2415 = (f2416 + 93) % 128;
            this.f2420.f2413.add(cls);
            f2416 = (f2415 + 1) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m6609(Class cls) {
            int i10 = f2415 + 33;
            f2416 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2420.f2409 = cls;
                throw null;
            }
            this.f2420.f2409 = cls;
            int i11 = f2416 + 85;
            f2415 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6613(boolean z10) {
            int i10 = f2416 + 55;
            f2415 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2420.f2411 = z10;
                int i11 = 36 / 0;
            } else {
                this.f2420.f2411 = z10;
            }
            f2415 = (f2416 + 63) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m6614(int i10) {
            int i11 = f2416 + 5;
            f2415 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f2420.f2414 = i10;
                return this;
            }
            this.f2420.f2414 = i10;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hr m6616() {
            int i10 = f2416;
            hr hrVar = this.f2420;
            int i11 = i10 + 45;
            f2415 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 92 / 0;
            }
            return hrVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6617(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f2417;
                    char c10 = f2419;
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

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6607(List<Class> list) {
            int i10 = f2416 + 89;
            f2415 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2420.f2412 = list;
                int i11 = f2415 + 1;
                f2416 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 39 / 0;
                }
                return this;
            }
            this.f2420.f2412 = list;
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m6615(boolean z10, int i10) {
            int i11 = (f2415 + 37) % 128;
            f2416 = i11;
            hr hrVar = this.f2420;
            hrVar.f2400 = z10;
            hrVar.f2402 = i10;
            f2415 = (i11 + 35) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m6608(int i10) {
            int i11 = f2416;
            f2415 = (i11 + 67) % 128;
            hr hrVar = this.f2420;
            hrVar.f2399 = i10 | hrVar.f2399;
            f2415 = (i11 + 99) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6612(int i10) {
            int i11 = (f2416 + 77) % 128;
            f2415 = i11;
            hr hrVar = this.f2420;
            hrVar.f2401 = i10 | hrVar.f2401;
            int i12 = i11 + 53;
            f2416 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m6605(int i10) {
            int i11 = f2415 + 75;
            f2416 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f2420.f2410 = i10;
                f2416 = (f2415 + 71) % 128;
                return this;
            }
            this.f2420.f2410 = i10;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6610(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f2418, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2418));
                            h.f2309++;
                        } else {
                            str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m6611() {
            f2415 = (f2416 + 115) % 128;
            this.f2420.mo6566();
            int i10 = f2416 + 123;
            f2415 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo5100(java.lang.String r10, java.util.List<java.lang.Object> r11, com.ironsource.adqualitysdk.sdk.i.ch r12) {
            /*
                Method dump skipped, instruction units count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hr.c.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }
    }

    public hr() {
        mo6566();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public final int m6599() {
        return this.f2410;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m6600() {
        return this.f2412;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6601() {
        return this.f2411;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m6602() {
        return this.f2414;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m6603() {
        return this.f2409;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m6604() {
        return this.f2413;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ */
    protected final void mo6566() {
        super.mo6566();
        this.f2409 = null;
        this.f2414 = 0;
        this.f2411 = true;
        this.f2413.clear();
        this.f2412 = null;
        this.f2410 = -1;
    }
}
