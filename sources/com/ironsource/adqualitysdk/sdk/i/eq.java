package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class eq extends eo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2012 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2013 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2011 = {'>', 29252};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2010 = -7149399757008571783L;

    public eq(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6459(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2011[i10 + i12]) ^ (((long) i12) * f2010)) ^ ((long) c10));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2012 + 17;
        f2013 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6459(View.resolveSize(0, 0), (char) (KeyEvent.getMaxKeyCode() << 53), 0 % (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))) : m6459(View.resolveSize(0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1)).intern();
        f2012 = (f2013 + 57) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo6452(int i10) {
        int i11 = f2013;
        int i12 = i11 + 77;
        f2012 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (i10 < 0) {
            return false;
        }
        int i13 = i11 + 107;
        f2012 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
