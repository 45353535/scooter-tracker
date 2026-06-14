package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class dy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1915 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1916;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1919;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private d f1920;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1921;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1918 = {':'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1917 = -4020653531021365266L;

    public enum d {
        f1932,
        f1934,
        f1930,
        f1933,
        f1931,
        f1929,
        f1926,
        f1928;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static long f1922 = 0;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1923 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f1924 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f1927;

        static {
            m6419();
            f1923 = (f1924 + 47) % 128;
        }

        public static d valueOf(String str) {
            int i10 = f1924 + 63;
            f1923 = i10 % 128;
            if (i10 % 2 == 0) {
                return (d) Enum.valueOf(d.class, str);
            }
            Enum.valueOf(d.class, str);
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f1923 = (f1924 + 3) % 128;
            d[] dVarArr = (d[]) values().clone();
            f1923 = (f1924 + 29) % 128;
            return dVarArr;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static void m6419() {
            f1927 = new char[]{'K', 27119, 54029, 15529, 42727, 4096, 31160, 'I', 27118, 54033, 15536, 42748, 4123, 31162, 58351, 19733, 46760, 'O', 27130, 54033, 15532, 42729, 4102, 31155, 58356, 35968, 58669, 24533, 45156, 10805, 40134, 'I', 27108, 54016, 15547, 42735, 4119, 31150, 'D', 27109, 54017, 15548, 42724, 4119, 10707, 16500, 64138, 5411, 36732, 14722, 20515, 12478, 22811, 58344, 3152, 38406};
            f1922 = 5818881436904352170L;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m6420(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1677) {
                try {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.d.f1676 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1676;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f1927[i10 + i12]) ^ (((long) i12) * f1922)) ^ ((long) c10));
                            com.ironsource.adqualitysdk.sdk.i.d.f1676 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    public dy(d dVar, String str, int i10) {
        this.f1920 = dVar;
        this.f1919 = str;
        this.f1921 = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1920);
        sb2.append(m6405(ViewConfiguration.getTapTimeout() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1 - View.resolveSize(0, 0)).intern());
        sb2.append(this.f1919);
        String string = sb2.toString();
        f1916 = (f1915 + 87) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m6406() {
        int i10 = f1915 + 69;
        f1916 = i10 % 128;
        if (i10 % 2 != 0) {
            m6414();
            d dVar = d.f1932;
            throw null;
        }
        if (m6414() == d.f1932) {
            return true;
        }
        int i11 = f1916 + 49;
        f1915 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m6407() {
        int i10 = f1916 + 79;
        f1915 = i10 % 128;
        if (i10 % 2 == 0) {
            m6414();
            d dVar = d.f1932;
            throw null;
        }
        if (m6414() != d.f1934) {
            return false;
        }
        f1916 = (f1915 + 7) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6408() {
        if (m6414() != d.f1926) {
            return false;
        }
        int i10 = (f1916 + 7) % 128;
        f1915 = i10;
        f1916 = (i10 + 29) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6409() {
        f1916 = (f1915 + 77) % 128;
        if (m6414() == d.f1930) {
            f1915 = (f1916 + 59) % 128;
            return true;
        }
        f1915 = (f1916 + 33) % 128;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (m6414() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1929) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (m6414() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1929) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.dy.f1915 = (com.ironsource.adqualitysdk.sdk.i.dy.f1916 + 9) % 128;
     */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6410() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1916
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1915 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r4.m6414()
            com.ironsource.adqualitysdk.sdk.i.dy$d r2 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1929
            r3 = 87
            int r3 = r3 / r1
            if (r0 != r2) goto L2b
            goto L21
        L19:
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r4.m6414()
            com.ironsource.adqualitysdk.sdk.i.dy$d r2 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1929
            if (r0 != r2) goto L2b
        L21:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1916
            int r0 = r0 + 9
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1915 = r0
            r0 = 1
            return r0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dy.m6410():boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m6411() {
        int i10 = f1916 + 21;
        f1915 = i10 % 128;
        if (i10 % 2 == 0) {
            m6414();
            d dVar = d.f1932;
            throw null;
        }
        if (m6414() != d.f1928) {
            return false;
        }
        int i11 = f1916 + 19;
        f1915 = i11 % 128;
        return i11 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m6412() {
        f1915 = (f1916 + 99) % 128;
        if (m6414() == d.f1931) {
            return true;
        }
        int i10 = f1915 + 11;
        f1916 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6413() {
        f1916 = (f1915 + 105) % 128;
        if (!m6417()) {
            f1915 = (f1916 + 73) % 128;
            if (!m6412() && !m6410()) {
                int i10 = f1915 + 19;
                f1916 = i10 % 128;
                if (i10 % 2 != 0) {
                    m6408();
                    throw null;
                }
                if (!m6408()) {
                    return false;
                }
            }
        }
        f1915 = (f1916 + 19) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final d m6414() {
        int i10 = f1916;
        int i11 = i10 + 105;
        f1915 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        d dVar = this.f1920;
        int i12 = i10 + 81;
        f1915 = i12 % 128;
        if (i12 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6415() {
        int i10 = (f1916 + 69) % 128;
        f1915 = i10;
        String str = this.f1919;
        int i11 = i10 + 97;
        f1916 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6416() {
        int i10 = f1916;
        int i11 = this.f1921;
        int i12 = i10 + 107;
        f1915 = i12 % 128;
        if (i12 % 2 != 0) {
            return i11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6418(String str) {
        f1915 = (f1916 + 13) % 128;
        boolean zEquals = this.f1919.equals(str);
        int i10 = f1915 + 95;
        f1916 = i10 % 128;
        if (i10 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6417() {
        f1916 = (f1915 + 71) % 128;
        if (m6414() == d.f1933) {
            int i10 = f1915 + 125;
            f1916 = i10 % 128;
            return i10 % 2 == 0;
        }
        int i11 = f1916 + 27;
        f1915 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6405(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1677) {
            try {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1676 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1918[i10 + i12]) ^ (((long) i12) * f1917)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
