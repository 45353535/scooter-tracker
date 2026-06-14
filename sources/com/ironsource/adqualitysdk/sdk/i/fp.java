package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class fp extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2094 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2095 = {2085519999, -1492139473, -2131290940, -103849443, -346232063, -359406762, -506696262, -279161228, -1325656340, 700295684, 1084709065, -103633191, -1702726020, -1371910201, -939529046, 1266276969, -735262711, -177359590};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2096 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ed f2097;

    public fp(ed edVar) {
        this.f2097 = edVar;
    }

    public boolean equals(Object obj) {
        f2094 = (f2096 + 5) % 128;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fp fpVar = (fp) obj;
            ed edVar = this.f2097;
            if (edVar != null) {
                int i10 = f2096 + 67;
                f2094 = i10 % 128;
                int i11 = i10 % 2;
                ed edVar2 = fpVar.f2097;
                if (i11 == 0) {
                    return edVar.equals(edVar2);
                }
                edVar.equals(edVar2);
                throw null;
            }
            if (fpVar.f2097 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = f2096;
        f2094 = (i10 + 77) % 128;
        ed edVar = this.f2097;
        if (edVar == null) {
            return 0;
        }
        f2094 = (i10 + 77) % 128;
        return edVar.hashCode();
    }

    public String toString() {
        f2094 = (f2096 + 23) % 128;
        if (this.f2097 == null) {
            String strIntern = m6480(new int[]{623252030, -1246887880}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
            f2094 = (f2096 + 51) % 128;
            return strIntern;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2097);
        sb2.append(m6480(new int[]{623252030, -1246887880}, TextUtils.getOffsetBefore("", 0) + 1).intern());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final ed m6481() {
        int i10 = f2096 + 97;
        int i11 = i10 % 128;
        f2094 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        ed edVar = this.f2097;
        int i12 = i11 + 105;
        f2096 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 69 / 0;
        }
        return edVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public dr mo6475(du duVar, cq cqVar) {
        ed edVar = this.f2097;
        if (edVar != null) {
            int i10 = f2096 + 51;
            f2094 = i10 % 128;
            if (i10 % 2 == 0) {
                return edVar.m6434(duVar, cqVar);
            }
            int i11 = 84 / 0;
            return edVar.m6434(duVar, cqVar);
        }
        dr drVar = new dr(null);
        int i12 = f2096 + 69;
        f2094 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 84 / 0;
        }
        return drVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6480(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2095.clone();
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
