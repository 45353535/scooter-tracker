package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class hx<T> extends cz implements cl, hv<T> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2438 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2439 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field f2440;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hv f2441;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map f2442;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f2443;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Collection f2444;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2437 = {'@', 136, 139, 129, 'v', 128, 135, 129, 'e', 195, 195, 188, 178, 189, 199, 196, '3', 'f', 'l', '`', 'W', 'h', ':', 'q', 'i', 'k', 'i', 'X', 'b', 'l', 'f', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', '^', '['};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f2436 = {880806038, -1346773498, 393884870, 1928313090, -1158234337, 2087444272, -1142299011, -1576855235, -2025666139, -1576528800, -891045724, 435791960, 1629575653, -1385996207, -571437608, 532789962, 1203766405, -134582387};

    hx(Field field, Object obj, hv hvVar) {
        this.f2440 = field;
        this.f2443 = obj;
        this.f2441 = hvVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private hv m6652() {
        int i10 = f2439;
        hv hvVar = this.f2441;
        f2438 = (i10 + 113) % 128;
        return hvVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Collection m6653() {
        int i10 = f2438 + 87;
        int i11 = i10 % 128;
        f2439 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        Collection collection = this.f2444;
        f2438 = (i11 + 31) % 128;
        return collection;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Object m6654() {
        int i10 = f2439;
        Object obj = this.f2443;
        f2438 = (i10 + 73) % 128;
        return obj;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map m6655() {
        Map map;
        int i10 = f2439;
        int i11 = i10 + 79;
        f2438 = i11 % 128;
        if (i11 % 2 != 0) {
            map = this.f2442;
            int i12 = 80 / 0;
        } else {
            map = this.f2442;
        }
        f2438 = (i10 + 45) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f2444 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f2444 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 39;
        com.ironsource.adqualitysdk.sdk.i.hx.f2439 = r1 % 128;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6656() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2439
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2438 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L15
            java.util.Collection r0 = r4.f2444
            r3 = 65
            int r3 = r3 / r2
            if (r0 == 0) goto L28
            goto L19
        L15:
            java.util.Collection r0 = r4.f2444
            if (r0 == 0) goto L28
        L19:
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2439 = r0
            int r1 = r1 % 2
            r0 = 1
            if (r1 != 0) goto L27
            r1 = 48
            int r1 = r1 / r2
        L27:
            return r0
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.m6656():boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6659(T t10) {
        f2439 = (f2438 + 71) % 128;
        if (!m6661()) {
            return;
        }
        int i10 = f2439 + 19;
        f2438 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2440.set(this.f2443, t10);
            } else {
                this.f2440.set(this.f2443, t10);
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m6660() {
        int i10 = (f2439 + 105) % 128;
        f2438 = i10;
        if (this.f2442 == null) {
            return false;
        }
        f2439 = (i10 + 89) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m6661() {
        int i10 = f2438 + 97;
        int i11 = i10 % 128;
        f2439 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f2440 != null) {
            return true;
        }
        int i12 = i11 + 63;
        f2438 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return (T) r2.f2440.get(r2.f2443);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (m6656() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (m6660() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = (T) r2.f2443;
        com.ironsource.adqualitysdk.sdk.i.hx.f2438 = (com.ironsource.adqualitysdk.sdk.i.hx.f2439 + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m6661() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m6661() != false) goto L21;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T mo6642() {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2438
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2439 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = r2.m6661()
            r1 = 53
            int r1 = r1 / 0
            if (r0 == 0) goto L26
            goto L1d
        L17:
            boolean r0 = r2.m6661()
            if (r0 == 0) goto L26
        L1d:
            java.lang.reflect.Field r0 = r2.f2440     // Catch: java.lang.Exception -> L33
            java.lang.Object r1 = r2.f2443     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L33
            return r0
        L26:
            boolean r0 = r2.m6656()
            if (r0 != 0) goto L35
            boolean r0 = r2.m6660()
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            java.lang.Object r0 = r2.f2443
            int r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2439
            int r1 = r1 + 35
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2438 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo6642():java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r9, java.util.List<java.lang.Object> r10, com.ironsource.adqualitysdk.sdk.i.ch r11) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    hx(Collection collection, Object obj, hv hvVar) {
        this.f2444 = collection;
        this.f2443 = obj;
        this.f2441 = hvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﻛ */
    public final Field mo6641() {
        int i10 = f2438;
        int i11 = i10 + 101;
        f2439 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        Field field = this.f2440;
        f2439 = (i10 + 55) % 128;
        return field;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6658(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2437, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    hx(Map map, Object obj, hv hvVar) {
        this.f2442 = map;
        this.f2443 = obj;
        this.f2441 = hvVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6657(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2436.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
