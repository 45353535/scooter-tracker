package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class hd extends hb<View.OnClickListener> implements View.OnClickListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2322 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2323 = {'O', 'n', 'C', 'l', 'i', 'c', 'k', 'L', 's', 't', 'e', 'r', 'D', 'o', 'a', 'E', ' ', 'm', 'T', 'b', 'P', 'Q', 'R', 'S', 'U'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2324 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2325 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private d f2326;

    public interface d {
        /* JADX INFO: renamed from: ﾒ */
        void mo6122(hd hdVar, View view);
    }

    public hd(View.OnClickListener onClickListener, d dVar) {
        super(onClickListener);
        this.f2326 = dVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6534(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2323;
                char c10 = f2324;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2158 = 0;
                    while (true) {
                        int i11 = g.f2158;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2157 = cArr[i11];
                        g.f2155 = cArr[g.f2158 + 1];
                        if (g.f2157 == g.f2155) {
                            cArr3[g.f2158] = (char) (g.f2157 - b10);
                            cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                        } else {
                            g.f2156 = g.f2157 / c10;
                            g.f2154 = g.f2157 % c10;
                            g.f2159 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            if (g.f2154 == g.f2152) {
                                g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                int i12 = (g.f2156 * c10) + g.f2154;
                                int i13 = (g.f2159 * c10) + g.f2152;
                                int i14 = g.f2158;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2156 == g.f2159) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                int i15 = (g.f2156 * c10) + g.f2154;
                                int i16 = (g.f2159 * c10) + g.f2152;
                                int i17 = g.f2158;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2156 * c10) + g.f2152;
                                int i19 = (g.f2159 * c10) + g.f2154;
                                int i20 = g.f2158;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2158 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f2326.mo6122(this, view);
        } catch (Throwable th2) {
            kd.m7160(m6534("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0003\t\u0005\u000e\u0000\u000b\f\r\u000f\n\u000e\f\u0013\u000e\u000e\f", ImageFormat.getBitsPerPixel(0) + 25, (byte) (1 - Color.argb(0, 0, 0, 0))).intern(), m6534("\u0010\n\f\u000e\u0010\u0015\u0000\u0002\u0011\u0012\u0013\u000f\t\u0002\t\u0005\u000b\u0000\u000b\f\u0012\u000b\u0002\u0003\u0004\u0000\u0006\u0007", 27 - ExpandableListView.getPackedPositionChild(0L), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31)).intern(), th2, false);
        }
        if (mo5030() != null) {
            f2322 = (f2325 + 71) % 128;
            mo5030().onClick(view);
            f2322 = (f2325 + 125) % 128;
        }
    }
}
