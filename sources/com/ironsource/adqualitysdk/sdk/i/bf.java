package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bf extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f808 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f810;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f809 = {'E', 33080, 685, 33824, 1428, 34571, 2176};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f807 = -4211819825991155338L;

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo5099() {
        int i10 = (f810 + 51) % 128;
        f808 = i10;
        f810 = (i10 + 71) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        f810 = (f808 + 9) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f810 = (f808 + 117) % 128;
        String strIntern = m5109(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.indexOf("", "", 0), (KeyEvent.getMaxKeyCode() >> 16) + 7).intern();
        f808 = (f810 + 61) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    final Class mo5026(String str) {
        int i10 = f810 + 75;
        f808 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5109(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f809[i10 + i12]) ^ (((long) i12) * f807)) ^ ((long) c10));
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
}
