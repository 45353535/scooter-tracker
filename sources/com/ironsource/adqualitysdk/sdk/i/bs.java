package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.Moloco;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bs extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1041 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1042 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1043 = {'M', 'o', 'l', 'c', 'I', 'n', 'i', 't', 'P', 'a', 'r', 'm', 's', 'A', 'd', 'S', 'h', 'w', 'L', 'e', '.', 'k', 'p', 'u', 'b', 'B', 'v', 'y', 'x', 'g', 'N', 'O', 'Q', 'R', 'T', 'U'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1044 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1045 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1046 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1047 = 4595;

    public bs(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ Object m5421() {
        int i10 = f1042 + 7;
        f1041 = i10 % 128;
        if (i10 % 2 != 0) {
            m5422();
            throw null;
        }
        Object objM5422 = m5422();
        int i11 = f1041 + 89;
        f1042 = i11 % 128;
        if (i11 % 2 != 0) {
            return objM5422;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m5422() {
        int i10 = f1042 + 89;
        f1041 = i10 % 128;
        if (i10 % 2 == 0) {
            return Moloco.INSTANCE;
        }
        Moloco moloco = Moloco.INSTANCE;
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ BannerAdShowListener m5424(Banner banner) {
        f1042 = (f1041 + 41) % 128;
        BannerAdShowListener bannerAdShowListenerM5423 = m5423(banner);
        int i10 = f1041 + 87;
        f1042 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
        return bannerAdShowListenerM5423;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m5426(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1042 = (f1041 + 1) % 128;
        banner.setAdShowListener(bannerAdShowListener);
        f1042 = (f1041 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m5428(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1041 = (f1042 + 87) % 128;
        m5426(banner, bannerAdShowListener);
        int i10 = f1042 + 117;
        f1041 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5425("\u0019\u0017\u0006\u0001\u0002\u0003\u0002\u0004\u0003\r\u000f\u0014\u0005\u0000\r\u0006\u000b\u0003\u0001\u0015", View.MeasureSpec.getSize(0) + 20, (byte) (View.resolveSize(0, 0) + 103)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bs.m5421();
            }
        });
        map.put(m5425("\u0019\u0017\r\u001f\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0010\r\u0004\f\u0017\f\u0012\r\u0019\u0001\u0017\u009d", 22 - MotionEvent.axisFromString(""), (byte) (43 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bs.m5424((Banner) list.get(0));
            }
        });
        map.put(m5425("\r\u0012\r\u001f\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0010\r\u0004\f\u0017\f\u0012\r\u0019\u0001\u0017Ô", 22 - ExpandableListView.getPackedPositionChild(0L), (byte) (Color.alpha(0) + 98)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bs.m5428((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f1042 = (f1041 + 23) % 128;
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bs.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5425(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f1043;
                char c10 = f1046;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5427(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1045) ^ ((long) f1044)) ^ ((long) f1047));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1042 = (f1041 + 7) % 128;
        try {
            String strM6739 = hu.m6637().m6639().m6739(BuildConfig.class, m5427("懃៍帵輎즑쎩䐪䘴맖嵿楇", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", 1991789381 - (KeyEvent.getMaxKeyCode() >> 16), "䔑롋⡶刬").intern());
            f1041 = (f1042 + 121) % 128;
            return strM6739;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerAdShowListener m5423(Banner banner) {
        f1042 = (f1041 + 69) % 128;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        f1042 = (f1041 + 61) % 128;
        return adShowListener;
    }
}
