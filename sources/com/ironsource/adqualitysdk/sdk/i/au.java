package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class au extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f586 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f587 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f588 = 2051739644234859278L;

    public au(ax axVar) {
        m4808(axVar);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m4934() {
        f586 = (f587 + 35) % 128;
        boolean zOptBoolean = m4805().optBoolean(m4933("蟰螗፣裾通躁鎻\u1af2", Drawable.resolveOpacity(0, 0)).intern(), true);
        int i10 = f587 + 51;
        f586 = i10 % 128;
        if (i10 % 2 == 0) {
            return zOptBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m4935() {
        int i10 = f587 + 113;
        f586 = i10 % 128;
        if (i10 % 2 != 0) {
            m4806().m4959();
            throw null;
        }
        List<String> listM4959 = m4806().m4959();
        f586 = (f587 + 79) % 128;
        return listM4959;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m4936() {
        f586 = (f587 + 53) % 128;
        boolean zOptBoolean = m4805().optBoolean(m4933("䓜䒻눍␣ㅴ≉♷꼾", ViewConfiguration.getPressedStateDuration() >> 16).intern(), true);
        int i10 = f586 + 103;
        f587 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
        }
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m4937() {
        int i10 = f587 + 79;
        f586 = i10 % 128;
        if (i10 % 2 == 0) {
            return m4806().m4957();
        }
        m4806().m4957();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m4938() {
        int i10 = f587 + 47;
        f586 = i10 % 128;
        if (i10 % 2 == 0) {
            return m4806().m4962();
        }
        int i11 = 37 / 0;
        return m4806().m4962();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m4939() {
        f586 = (f587 + 21) % 128;
        int iM4960 = m4806().m4960();
        f587 = (f586 + 1) % 128;
        return iM4960;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4933(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f588, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f588));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
