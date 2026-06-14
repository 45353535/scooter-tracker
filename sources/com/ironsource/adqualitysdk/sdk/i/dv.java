package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes10.dex */
public final class dv extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1900 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1901 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1904;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1903 = {'.', 18393, 36632, 55119, 7835, 26321};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1902 = 8917081582990215098L;

    public dv(String str, dm dmVar) {
        super(dmVar);
        this.f1904 = dz.m6421(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6400(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1903[i10 + i12]) ^ (((long) i12) * f1902)) ^ ((long) c10));
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i10 = f1900 + 13;
            f1901 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (dv.class == obj.getClass()) {
                dv dvVar = (dv) obj;
                String str = this.f1904;
                if (str == null) {
                    return dvVar.f1904 == null;
                }
                int i11 = f1901 + 53;
                f1900 = i11 % 128;
                int i12 = i11 % 2;
                boolean zEquals = str.equals(dvVar.f1904);
                if (i12 != 0) {
                    int i13 = 33 / 0;
                }
                return zEquals;
            }
        }
        f1900 = (f1901 + 111) % 128;
        return false;
    }

    public final int hashCode() {
        String str = this.f1904;
        if (str == null) {
            return 0;
        }
        f1901 = (f1900 + 101) % 128;
        int iHashCode = str.hashCode();
        int i10 = f1900 + 77;
        f1901 = i10 % 128;
        if (i10 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f1900 + 95;
        f1901 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1904;
        }
        int i11 = 34 / 0;
        return this.f1904;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr mo6401(du duVar, cq cqVar) {
        dr drVar = new dr(cqVar.m5981().m5102(kc.m7152(this.f1904, m6400((-1) - MotionEvent.axisFromString(""), (char) Color.blue(0), MotionEvent.axisFromString("") + 7).intern())));
        f1900 = (f1901 + 17) % 128;
        return drVar;
    }
}
