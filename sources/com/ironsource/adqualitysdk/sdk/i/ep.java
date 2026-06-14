package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class ep extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2007 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2008 = 113;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2009;

    public ep(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6458(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2008);
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
        f2007 = (f2009 + 117) % 128;
        String strIntern = m6458("\u0000", AndroidCharacter.getMirror('0') - '/', true, 1 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0) + 160).intern();
        int i10 = f2009 + 71;
        f2007 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo6456(Number number, Number number2) {
        int i10 = f2009;
        int i11 = i10 + 25;
        f2007 = i11 % 128;
        if (i11 % 2 == 0) {
            boolean z10 = number instanceof Double;
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            Double dValueOf = Double.valueOf(number.doubleValue() / number2.doubleValue());
            int i12 = f2009 + 31;
            f2007 = i12 % 128;
            if (i12 % 2 != 0) {
                return dValueOf;
            }
            throw null;
        }
        if (!(number instanceof Long)) {
            f2007 = (i10 + 83) % 128;
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() / number2.intValue());
            }
        }
        Long lValueOf = Long.valueOf(number.longValue() / number2.longValue());
        f2009 = (f2007 + 69) % 128;
        return lValueOf;
    }
}
