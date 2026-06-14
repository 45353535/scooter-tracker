package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* JADX INFO: loaded from: classes10.dex */
public final class fd extends eg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2060 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2061 = 63693;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2062 = 41695;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2063 = 10911;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2064 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2065 = 62374;

    public fd(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6470(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2062)) ^ ((c11 >>> 5) + f2061)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2065) ^ ((c12 + i12) ^ ((c12 << 4) + f2063))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2064 + 5;
        f2060 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6470("䅘颖", Color.blue(1) + 1) : m6470("䅘颖", 1 - Color.blue(0))).intern();
        f2060 = (f2064 + 41) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        dr drVarM6434 = m6444().m6434(duVar, cqVar);
        dr drVarM64342 = m6445().m6434(duVar, cqVar);
        if ((drVarM6434.m6377() instanceof String) || (drVarM64342.m6377() instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(drVarM6434.m6377());
            sb2.append(drVarM64342.m6377());
            return new dr(sb2.toString());
        }
        Number numberM6378 = drVarM6434.m6378();
        Number numberM63782 = drVarM64342.m6378();
        if (!(numberM6378 instanceof Double)) {
            int i10 = f2064 + 51;
            f2060 = i10 % 128;
            if (i10 % 2 == 0) {
                boolean z10 = numberM63782 instanceof Double;
                throw null;
            }
            if (!(numberM63782 instanceof Double)) {
                return ((numberM6378 instanceof Long) || (numberM63782 instanceof Long)) ? new dr(Long.valueOf(numberM6378.longValue() + numberM63782.longValue())) : new dr(Integer.valueOf(numberM6378.intValue() + numberM63782.intValue()));
            }
        }
        dr drVar = new dr(Double.valueOf(numberM6378.doubleValue() + numberM63782.doubleValue()));
        f2064 = (f2060 + 45) % 128;
        return drVar;
    }
}
