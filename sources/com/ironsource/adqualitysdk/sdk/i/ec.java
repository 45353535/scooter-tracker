package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class ec extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1950 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1953;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1954;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed f1955;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1952 = {48760};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1951 = 7388121727780528165L;

    public ec(ed edVar, String str, dm dmVar) {
        super(dmVar);
        this.f1955 = edVar;
        this.f1954 = str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6430(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1952[i10 + i12]) ^ (((long) i12) * f1951)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto Lc
            int r6 = com.ironsource.adqualitysdk.sdk.i.ec.f1953
            int r6 = r6 + 109
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1950 = r6
            return r0
        Lc:
            r1 = 0
            if (r6 == 0) goto L50
            int r2 = com.ironsource.adqualitysdk.sdk.i.ec.f1950
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1953 = r3
            int r2 = r2 % 2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ec> r3 = com.ironsource.adqualitysdk.sdk.i.ec.class
            if (r2 == 0) goto L27
            java.lang.Class r2 = r6.getClass()
            r4 = 28
            int r4 = r4 / r1
            if (r3 == r2) goto L2e
            goto L50
        L27:
            java.lang.Class r2 = r6.getClass()
            if (r3 == r2) goto L2e
            goto L50
        L2e:
            com.ironsource.adqualitysdk.sdk.i.ec r6 = (com.ironsource.adqualitysdk.sdk.i.ec) r6
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f1955
            if (r2 == 0) goto L3d
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r6.f1955
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L41
        L3d:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r6.f1955
            if (r2 == 0) goto L42
        L41:
            return r1
        L42:
            java.lang.String r2 = r5.f1954
            java.lang.String r6 = r6.f1954
            if (r2 == 0) goto L4d
            boolean r6 = r2.equals(r6)
            return r6
        L4d:
            if (r6 != 0) goto L50
            return r0
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ec.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        ed edVar = this.f1955;
        int iHashCode2 = 0;
        if (edVar != null) {
            iHashCode = edVar.hashCode();
        } else {
            f1953 = (f1950 + 11) % 128;
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        String str = this.f1954;
        if (str != null) {
            iHashCode2 = str.hashCode();
            f1953 = (f1950 + 111) % 128;
        } else {
            f1950 = (f1953 + 43) % 128;
        }
        return i10 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1955.toString());
        sb2.append(m6430(ViewConfiguration.getPressedStateDuration() >> 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48726), KeyEvent.keyCodeFromString("") + 1).intern());
        sb2.append(this.f1954);
        String string = sb2.toString();
        int i10 = f1953 + 117;
        f1950 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(r3.getClass().getDeclaredField(r2.f1954).get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.dr(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.dr(((com.ironsource.adqualitysdk.sdk.i.cq) r3).m5975(r2.f1954));
        com.ironsource.adqualitysdk.sdk.i.ec.f1950 = (com.ironsource.adqualitysdk.sdk.i.ec.f1953 + 77) % 128;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.i.dr mo6401(com.ironsource.adqualitysdk.sdk.i.du r3, com.ironsource.adqualitysdk.sdk.i.cq r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ec.f1953
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1950 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1f
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r2.f1955
            com.ironsource.adqualitysdk.sdk.i.dr r3 = r0.m6434(r3, r4)
            java.lang.Object r3 = r3.m6377()
            boolean r4 = r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq
            r0 = 72
            int r0 = r0 / 0
            if (r4 == 0) goto L43
            goto L2d
        L1f:
            com.ironsource.adqualitysdk.sdk.i.ed r0 = r2.f1955
            com.ironsource.adqualitysdk.sdk.i.dr r3 = r0.m6434(r3, r4)
            java.lang.Object r3 = r3.m6377()
            boolean r4 = r3 instanceof com.ironsource.adqualitysdk.sdk.i.cq
            if (r4 == 0) goto L43
        L2d:
            com.ironsource.adqualitysdk.sdk.i.dr r4 = new com.ironsource.adqualitysdk.sdk.i.dr
            com.ironsource.adqualitysdk.sdk.i.cq r3 = (com.ironsource.adqualitysdk.sdk.i.cq) r3
            java.lang.String r0 = r2.f1954
            com.ironsource.adqualitysdk.sdk.i.ds r3 = r3.m5975(r0)
            r4.<init>(r3)
            int r3 = com.ironsource.adqualitysdk.sdk.i.ec.f1953
            int r3 = r3 + 77
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ec.f1950 = r3
            return r4
        L43:
            com.ironsource.adqualitysdk.sdk.i.dr r4 = new com.ironsource.adqualitysdk.sdk.i.dr     // Catch: java.lang.Exception -> L57
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = r2.f1954     // Catch: java.lang.Exception -> L57
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L57
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L57
            r4.<init>(r3)     // Catch: java.lang.Exception -> L57
            return r4
        L57:
            com.ironsource.adqualitysdk.sdk.i.dr r3 = new com.ironsource.adqualitysdk.sdk.i.dr
            r4 = 0
            r3.<init>(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ec.mo6401(com.ironsource.adqualitysdk.sdk.i.du, com.ironsource.adqualitysdk.sdk.i.cq):com.ironsource.adqualitysdk.sdk.i.dr");
    }
}
