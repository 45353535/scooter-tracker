package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoAd;

/* JADX INFO: loaded from: classes10.dex */
public final class cc extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1269 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1270 = {'I', 'V', 'i', 'd', 'e', 'o', 'P', 'l', 'a', 'y', 'r', 'L', 's', 't', 'n', 'S', 'A', 'C', 'c', 'k', 'w', 'u', 'm', 'W', 'b', 'T', 'M', 'R', 'p', 'f', 'B', 'E', 'v', 'J', 'K', 'N'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1271 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1272 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1273;

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static SAInterface m5739() {
        int i10 = f1269 + 13;
        f1273 = i10 % 128;
        if (i10 % 2 == 0) {
            return SAVideoAd.getListener();
        }
        SAVideoAd.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ SAInterface m5740() {
        int i10 = f1269 + 89;
        f1273 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5739();
        }
        m5739();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5743(SAAd sAAd) {
        int i10 = f1273 + 13;
        f1269 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5744(sAAd);
        }
        m5744(sAAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5745(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1273 + 63;
        f1269 = i10 % 128;
        int i11 = i10 % 2;
        m5746(sABannerAd, sAInterface);
        if (i11 == 0) {
            int i12 = 30 / 0;
        }
        int i13 = f1269 + 63;
        f1273 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5746(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1269 + 97;
        f1273 = i10 % 128;
        int i11 = i10 % 2;
        sABannerAd.setListener(sAInterface);
        if (i11 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5742("\t\u0002\u0016\u000b\u0001\u000e\u0001\u001c\u0003#\u0011\u0000\u009e", 12 - ExpandableListView.getPackedPositionChild(0L), (byte) (47 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cc.m5743((SAAd) list.get(0));
            }
        });
        map.put(m5741("\u0002\u0000\u000f\ufff1\u0004\uffff\u0000\nￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r", 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 105).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cc.m5740();
            }
        });
        map.put(m5741("\u000b\f�\u0006�\n\u000b�\fￚ\ufff9\u0006\u0006�\n￤\u0001", KeyEvent.getDeadChar(0, 0) + 17, false, View.resolveSizeAndState(0, 0, 0) + 6, KeyEvent.keyCodeFromString("") + 109).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                cc.m5745((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        f1269 = (f1273 + 25) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d9  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m5744(SAAd sAAd) {
        f1269 = (f1273 + 11) % 128;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        f1269 = (f1273 + 17) % 128;
        return jSONObjectWriteToJson;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        String sDKVersionNumber;
        int i10 = f1273 + 109;
        f1269 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
                int i11 = 82 / 0;
            } else {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
            }
            int i12 = f1273 + 81;
            f1269 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 53 / 0;
            }
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return hu.m6637().m6639().m6739(SAVersion.class, m5741("\uffdd\fￚ\u000b\u0013ￓ\r\u000b\u0013\n\u000b\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, false, 6 - (ViewConfiguration.getTouchSlop() >> 8), 85 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5742(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f1270;
                char c10 = f1272;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5741(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1271);
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
}
