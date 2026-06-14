package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class ez extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2038 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2039 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2040 = 43;

    public ez(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6466(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2040);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        f2039 = (f2038 + 37) % 128;
        String strIntern = m6466("\ufff2\u000e", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, MotionEvent.axisFromString("") + 91).intern();
        int i10 = f2038 + 77;
        f2039 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 74 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo6452(int i10) {
        int i11 = f2038;
        int i12 = i11 + 27;
        f2039 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (i10 == 0) {
            return false;
        }
        int i13 = i11 + 113;
        f2039 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 58 / 0;
        }
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6454(String str, String str2) {
        int i10 = f2038 + 71;
        f2039 = i10 % 128;
        if (i10 % 2 == 0) {
            str.equals(str2);
            throw null;
        }
        if (str.equals(str2)) {
            return false;
        }
        int i11 = f2038 + 121;
        f2039 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6453(Object obj, Object obj2) {
        if (obj != obj2) {
            f2038 = (f2039 + 29) % 128;
            return true;
        }
        f2038 = (f2039 + 81) % 128;
        return false;
    }
}
