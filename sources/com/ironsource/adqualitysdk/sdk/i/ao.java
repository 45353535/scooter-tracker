package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ao {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f362 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f363 = 64155;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f364 = 18699;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f365 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f366 = 45928;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f367 = 14739;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f370;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f372 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f371 = m4745("\uea90﵉蓐⥨\uf44a驹뛺깯", 6 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f373 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f374 = "";

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f375 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, String> f368 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f369 = false;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final void m4746() {
        int i10 = (f362 + 119) % 128;
        f365 = i10;
        this.f369 = true;
        f362 = (i10 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m4747() {
        int i10 = f362 + 113;
        f365 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f369;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m4748() {
        Map<String, String> map;
        int i10 = f365;
        int i11 = i10 + 41;
        f362 = i11 % 128;
        if (i11 % 2 != 0) {
            map = this.f368;
            int i12 = 57 / 0;
        } else {
            map = this.f368;
        }
        f362 = (i10 + 117) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m4749() {
        int i10 = f365 + 53;
        int i11 = i10 % 128;
        f362 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f370;
        int i12 = i11 + 101;
        f365 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 93 / 0;
        }
        return iSAdQualityDeviceIdType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m4750(String str) {
        int i10 = f365;
        this.f371 = str;
        f362 = (i10 + 97) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4753(String str) {
        int i10 = f362 + 25;
        f365 = i10 % 128;
        int i11 = i10 % 2;
        this.f372 = str;
        if (i11 == 0) {
            int i12 = 87 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m4755() {
        String str;
        int i10 = (f365 + 101) % 128;
        f362 = i10;
        str = this.f371;
        int i11 = i10 + 23;
        f365 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4758() {
        int i10 = f365 + 59;
        int i11 = i10 % 128;
        f362 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f372;
        f365 = (i11 + 1) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m4760(boolean z10) {
        int i10 = f362 + 25;
        f365 = i10 % 128;
        int i11 = i10 % 2;
        this.f373 = z10;
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m4751() {
        int i10 = f362 + 87;
        f365 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f373;
        }
        int i11 = 52 / 0;
        return this.f373;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m4752() {
        int i10 = f365;
        String str = this.f374;
        f362 = (i10 + 95) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4756(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i10 = f362 + 95;
        f365 = i10 % 128;
        int i11 = i10 % 2;
        this.f370 = iSAdQualityDeviceIdType;
        if (i11 == 0) {
            int i12 = 13 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4759(String str) {
        int i10 = f362 + 67;
        f365 = i10 % 128;
        int i11 = i10 % 2;
        this.f374 = str;
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4761() {
        boolean z10;
        int i10 = f362 + 85;
        int i11 = i10 % 128;
        f365 = i11;
        if (i10 % 2 == 0) {
            z10 = this.f375;
            int i12 = 75 / 0;
        } else {
            z10 = this.f375;
        }
        int i13 = i11 + 61;
        f362 = i13 % 128;
        if (i13 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4745(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f364)) ^ ((c11 >>> 5) + f363)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f366) ^ ((c12 + i12) ^ ((c12 << 4) + f367))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4754(boolean z10) {
        int i10 = f365;
        this.f375 = z10;
        int i11 = i10 + 55;
        f362 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4757(Map<String, String> map) {
        int i10 = (f365 + 9) % 128;
        f362 = i10;
        this.f368 = map;
        f365 = (i10 + 109) % 128;
    }
}
