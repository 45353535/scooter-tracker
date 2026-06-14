package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import io.bidmachine.BidMachine;

/* JADX INFO: loaded from: classes10.dex */
public final class gh extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2197 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2198 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2199 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2200 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2201 = 25212;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bl blVar = new bl(mo6489());
        f2200 = (f2197 + 111) % 128;
        return blVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        char offsetBefore;
        int capsMode;
        int i10 = f2200 + 75;
        f2197 = i10 % 128;
        if (i10 % 2 != 0) {
            offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            capsMode = TextUtils.getCapsMode("", 0, 1);
        } else {
            offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            capsMode = TextUtils.getCapsMode("", 0, 0);
        }
        String strIntern = m6505("\ud9bf줰\uf65b躄\u1af8忎\uf76aנ\ue32d뛭\ue14aⵎ\ue782㯚珄踖뗘ꫩ毭㌰﷼ᷙ厍筢", offsetBefore, "\u0000\u0000\u0000\u0000", capsMode, "충汧₳䉠").intern();
        int i11 = f2200 + 109;
        f2197 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2197 + 23;
        f2200 = i10 % 128;
        if (i10 % 2 != 0) {
            return BidMachine.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        char cRgb;
        int gidForName;
        int i10 = f2200 + 117;
        f2197 = i10 % 128;
        if (i10 % 2 != 0) {
            cRgb = (char) (ViewCompat.MEASURED_STATE_MASK >> Color.rgb(0, 1, 0));
            gidForName = 1 << Process.getGidForName("");
        } else {
            cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            gidForName = Process.getGidForName("") + 1;
        }
        String strIntern = m6505("⇃㟴悹릁稃綠푉㕫\ua83a⫲", cRgb, "\u0000\u0000\u0000\u0000", gidForName, "ꯡ\uf611暇픇").intern();
        f2200 = (f2197 + 83) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6505(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2199) ^ ((long) f2198)) ^ ((long) f2201));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
