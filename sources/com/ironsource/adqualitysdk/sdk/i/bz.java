package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bz extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1205 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1206 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1207 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1208 = 291822268;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1209 = {-55, -64, 8, 49, -50, 47, -54, 8, 1, -9, 8, -2, -53, -2, 3, -8, -1, 44, -49, Ascii.SI, -2, -11, 17, 13, -37, 44, -52, -1, 6, -10, 1, 13, Ascii.SI, -30, Ascii.SI, -2, -11, 17, 13, -37, 44, -51, 5, Ascii.VT, -13, 13, -11, 17, 34, -51, Ascii.SI, -2, -11, 17, 13, -37, 44, -30, 5, Ascii.VT, -13, 13, -11, 17, 34, -51, Ascii.SI, -2, -11, 17, 13, -37, 44, Ascii.US, -64, -1, 2, 0, -2, Ascii.FF, 53, -70, Ascii.SI, -2, -11, 17, -19, 70, -75, Ascii.FF, Utf8.REPLACEMENT_BYTE, -63, -2, Ascii.FF, -58, -19, 19, Ascii.GS, -43, 10, 1, -5, 19, -58, -19, 19, Ascii.GS, -43, 6, 5, -17, 52, -49, 35, -43, Ascii.VT, -8, -11, Ascii.VT, -11, 1, 1, 13, -15, 6, 37, -28, -14, Ascii.DC2, Ascii.US, -53, 35, -43, Ascii.VT, -8, -11, Ascii.VT, -11, 1, 1, 13, -15, 6, 37, -57, 35, -35, -1, 1, -14, 17, -22, Ascii.DC2, 19, -49, 13, -9, 9, -15, 1, 10, Ascii.GS, -24, 35, -35, -1, 1, -14, 17, -22, Ascii.DC2, 19, -55, Ascii.DC2, -4, 19, -30, Ascii.SI, -2, -11, 17, 13, -37, 44, -61, -21, 17, Ascii.SYN, -17, 35, -47, 13, -9, 9, -15, 1, 10, Ascii.GS, -43, Ascii.DC2, -4, 19, -30, Ascii.SI, -2, -11, 17, 13, -37, 44};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1210 = 29;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1211 = -279939345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1212 = 67;

    public bz(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5650(Reward reward) {
        int i10 = f1205;
        int i11 = i10 + 99;
        f1206 = i11 % 128;
        int i12 = i11 % 2;
        String str = reward.type;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 85;
        f1206 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 51 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5651(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1210);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5652(Reward reward) {
        int i10 = f1205 + 25;
        f1206 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5650(reward);
        }
        m5650(reward);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5651("￫\r\ufffe\u0000\ufffe\t\u0012￭�\u000b\ufffa\u0010\ufffe", 13 - (Process.myPid() >> 22), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 132 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return bz.m5652((Reward) list.get(0));
            }
        });
        f1206 = (f1205 + 125) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1205 = (f1206 + 5) % 128;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m5651("\b\u0000\u0001\ufffb\u0005\u0004\ufff7", 7 - Color.blue(0), true, View.getDefaultSize(0, 0) + 1, 107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).get(null);
                f1206 = (f1205 + 81) % 128;
                return str;
            } catch (Exception unused) {
                return hu.m6637().m6639().m6739(MyTargetVersion.class, m5649(Gravity.getAbsoluteGravity(0, 0) + 279939345, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 291822175, (byte) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) - 68).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bz.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5649(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1212;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1209;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1211 + i10] + i13);
                    } else {
                        i14 = (short) (f1207[f1211 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1211 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1208);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1209;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1207;
                            int i17 = o.f3018;
                            o.f3018 = i17 - 1;
                            o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                        }
                        sb2.append(o.f3021);
                        o.f3020 = o.f3021;
                        o.f3022++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
