package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;

/* JADX INFO: loaded from: classes10.dex */
public final class ek extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1996 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1997 = -7844717107484358526L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1998 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1999;

    public ek(String str, dm dmVar) {
        super(dmVar);
        this.f1999 = dz.m6421(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6450(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1997);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        int i10 = f1996;
        f1998 = (i10 + 103) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i11 = i10 + 33;
        f1998 = i11 % 128;
        if (i11 % 2 == 0) {
            obj.getClass();
            throw null;
        }
        if (ek.class != obj.getClass()) {
            return false;
        }
        return this.f1999.equals(((ek) obj).f1999);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r5.f1999.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r2 = r2 + 113;
        com.ironsource.adqualitysdk.sdk.i.ek.f1998 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5.f1999 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.f1999 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ek.f1996 = (r0 + 81) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ek.f1998
            int r1 = r0 + 59
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1996 = r2
            int r1 = r1 % 2
            r3 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r5.f1999
            r4 = 15
            int r4 = r4 / r3
            if (r1 == 0) goto L26
            goto L19
        L15:
            java.lang.String r1 = r5.f1999
            if (r1 == 0) goto L26
        L19:
            int r0 = r0 + 81
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1996 = r0
            java.lang.String r0 = r5.f1999
            int r0 = r0.hashCode()
            return r0
        L26:
            int r2 = r2 + 113
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ek.f1998 = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L31
            return r3
        L31:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ek.hashCode():int");
    }

    public final String toString() {
        f1998 = (f1996 + 33) % 128;
        String strM6451 = m6451();
        f1998 = (f1996 + 119) % 128;
        return strM6451;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6451() {
        int i10 = (f1998 + 39) % 128;
        f1996 = i10;
        String str = this.f1999;
        int i11 = i10 + 125;
        f1998 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 49 / 0;
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        try {
            return new dr(duVar.m6399(m6451()));
        } catch (Exception e10) {
            ds dsVarM5975 = cqVar.m5975(m6451());
            if (dsVarM5975 != null) {
                dr drVar = new dr(dsVarM5975);
                f1998 = (f1996 + 69) % 128;
                return drVar;
            }
            String strM5971 = cqVar.m5971();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6450("ࣇ왇閞擈㈬ı킭꿵絛䲁ᯑ\ue93e롢瞠䛮ᑜ\ue3d2닀耤彧⺼\ufde4쭋骀槃✲\uf67a엯", 52918 - ImageFormat.getBitsPerPixel(0)).intern());
            sb2.append(this);
            sb2.append(m6435());
            co.m5911(strM5971, sb2.toString(), e10);
            dr drVar2 = new dr(null);
            f1996 = (f1998 + 77) % 128;
            return drVar2;
        }
    }
}
