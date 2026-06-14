package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ir implements Runnable {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2614 = 6555269478949392688L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2615 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2616;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6807(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2614);
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

    @Override // java.lang.Runnable
    public final void run() {
        f2616 = (f2615 + 121) % 128;
        try {
            mo4564();
            int i10 = f2616 + 107;
            f2615 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            try {
                mo4928(th2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public void mo4928(Throwable th2) {
        String strIntern = m6807("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21929 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6807("ᅵറ⦤䐆悎鼯믫홻\uf288ᅘഢ⦠䐧悔齚", Color.argb(0, 0, 0, 0) + 7283).intern());
        sb2.append(getClass().getName());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m6807("ᅳ諭☳쉐羇᭭", View.MeasureSpec.getSize(0) + 39857).intern());
        sb3.append(getClass().getName());
        sb3.append(m6807("ᄙ", TextUtils.getOffsetBefore("", 0) + 40627).intern());
        kd.m7166(strIntern, string, sb3.toString(), th2);
        String strIntern2 = m6807("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21929 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m6807("ᅵറ⦤䐆悎鼯믫홻\uf288ᅘഢ⦠䐧悔齚", 7282 - TextUtils.lastIndexOf("", '0', 0)).intern());
        sb4.append(getClass().getName());
        k.m7098(strIntern2, sb4.toString());
        k.m7118(m6807("ᅤ䓛먱ᆪ䟲봘႔䛚밖Ꭿ䧋뼑ኰ䣀", 21928 - TextUtils.lastIndexOf("", '0', 0)).intern(), m6807("ᅴȖ㟂⢘展焓拑韟", 4930 - TextUtils.lastIndexOf("", '0', 0)).intern(), th2);
        int i10 = f2616 + 111;
        f2615 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract void mo4564() throws Exception;
}
