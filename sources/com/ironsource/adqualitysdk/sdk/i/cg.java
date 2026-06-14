package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class cg extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1335 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1337 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1338 = 219010939;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1339 = 51;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f1340 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1341 = -561393916;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1342 = {5, Ascii.VT, -13, 13, -11, 17, 34, -51, Ascii.VT, -5, Ascii.EM, -15, 35, -9, -10, 5, Ascii.VT, -13, 13, -11, 17, 34, -51, 6, 9, -15, 6, -1, 44, -7, -10, 13, -7, 8, -10, 13, Ascii.EM, -38, -1, 6, -11, 17, 34, 13, -7, 8, -10, 13, Ascii.EM, -38, -1, 6, -11, 17, 34, 19, -73, Ascii.DC2, -4, -13, 72, -54, -5, 8, -17, 5, Utf8.REPLACEMENT_BYTE, -75, 10, 5, -6, Ascii.SI, -19, 70, -63, -2, Ascii.FF, 13, -14, -4, 8, -3, 48, 13, -14, -4, 8, -3, 48, Ascii.DC4, -73, Ascii.DC2, -4, -13, 72, -54, -5, 8, -17, 5, Utf8.REPLACEMENT_BYTE, -75, 10, 5, -6, Ascii.SI, -19, 70, -63, -2, Ascii.FF, Ascii.DC2, -4, 19, -14, -5, 8, -17, 37, Ascii.DC2, -4, 19, -12, -3, Ascii.SO, 13, -10, 13, -9, 9, -15, 1, 10, Ascii.GS, -35, 10, 1, -5, 19, Ascii.FF, -10, 13, -9, 9, -15, 1, 10, Ascii.GS, -43, Ascii.DC2, -4, 19, -12, -3, Ascii.SO, -29, Ascii.VT, -5, Ascii.EM, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, Ascii.GS, -35, 10, 1, -5, 19, -30, Ascii.VT, -5, Ascii.EM, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, Ascii.GS, -35, 10, 1, -5, 19, -30, 6, 9, -8, 8, 2, 2, -11, Ascii.FS, 6, -10, -2, 3, -5, -9, 48, -17, 9, -42, Ascii.VT, -5, Ascii.EM, -15, 35, -9, -10, Ascii.SYN, -11, 9, -13, 0, -3, 50, -7, -10, 6, 9, -8, 8, 2, 2, -11, Ascii.FS, 6, -10, Ascii.DC2, -4, 19, -12, -3, Ascii.SO, -29, Ascii.VT, -3, -4, Ascii.GS, 9, -10, -8, Ascii.FF, 19, -38, 6, 9, -8, 8, 2, 2, -11, Ascii.FS, -36, Ascii.SI, -2, 13, -9, 9, -15, 1, 10, Ascii.GS, -40, Ascii.SI, -2, 13, -9, 9, -15, 1, 10, Ascii.GS, -35, 10, 1, -5, 19, -30, Ascii.SI, -2, -6, Ascii.GS, -31, 1, Ascii.DC2, Ascii.NAK, -40, Ascii.SI, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f1336 = {-1432428120, 1280577410, -107498678, 997033691, -930604812, -1387762407, -736079987, 282835398, -325445394, -224666713, -614510409, -1510484538, -879457680, 250479336, -2004751562, -44591585, 1884384770, -1870984509};

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static TJPlacementVideoListener m5814(TJPlacement tJPlacement) {
        int i10 = f1337 + 57;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        f1337 = (f1335 + 37) % 128;
        return videoListener;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5815(TJPlacementData tJPlacementData) {
        f1337 = (f1335 + 21) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i10 = f1337 + 41;
        f1335 = i10 % 128;
        if (i10 % 2 != 0) {
            return httpResponse;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m5818(TJSplitWebView tJSplitWebView) {
        int i10 = f1337 + 85;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        String strM5824 = m5824(tJSplitWebView);
        if (i11 == 0) {
            int i12 = 21 / 0;
        }
        return strM5824;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementVideoListener m5822(TJPlacement tJPlacement) {
        f1337 = (f1335 + 29) % 128;
        TJPlacementVideoListener tJPlacementVideoListenerM5814 = m5814(tJPlacement);
        int i10 = f1335 + 1;
        f1337 = i10 % 128;
        if (i10 % 2 == 0) {
            return tJPlacementVideoListenerM5814;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5825(TJPlacement tJPlacement) {
        f1335 = (f1337 + 111) % 128;
        String strM5816 = m5816(tJPlacement);
        f1337 = (f1335 + 47) % 128;
        return strM5816;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementListener m5828(TJPlacement tJPlacement) {
        f1337 = (f1335 + 107) % 128;
        TJPlacementListener tJPlacementListenerM5820 = m5820(tJPlacement);
        int i10 = f1335 + 51;
        f1337 = i10 % 128;
        if (i10 % 2 == 0) {
            return tJPlacementListenerM5820;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        String version;
        int i10 = f1335 + 51;
        f1337 = i10 % 128;
        if (i10 % 2 != 0) {
            version = Tapjoy.getVersion();
            int i11 = 58 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i12 = f1335 + 1;
        f1337 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 80 / 0;
        }
        return version;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m5819(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f1337 = (f1335 + 111) % 128;
        m5827(tJPlacement, tJPlacementVideoListener);
        f1337 = (f1335 + 61) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5821(TJPlacementData tJPlacementData) {
        f1335 = (f1337 + 121) % 128;
        String placementName = tJPlacementData.getPlacementName();
        int i10 = f1335 + 37;
        f1337 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 14 / 0;
        }
        return placementName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m5823(TJPlacementData tJPlacementData) {
        int i10 = f1337 + 97;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        String strM5821 = m5821(tJPlacementData);
        if (i11 == 0) {
            int i12 = 4 / 0;
        }
        return strM5821;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m5826(TJPlacementData tJPlacementData) {
        f1335 = (f1337 + 25) % 128;
        String strM5817 = m5817(tJPlacementData);
        int i10 = f1335 + 53;
        f1337 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 19 / 0;
        }
        return strM5817;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m5830(TJPlacementData tJPlacementData) {
        int i10 = f1335 + 65;
        f1337 = i10 % 128;
        if (i10 % 2 != 0) {
            m5815(tJPlacementData);
            throw null;
        }
        String strM5815 = m5815(tJPlacementData);
        f1335 = (f1337 + 47) % 128;
        return strM5815;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static TJPlacementListener m5820(TJPlacement tJPlacement) {
        f1335 = (f1337 + 95) % 128;
        TJPlacementListener listener = tJPlacement.getListener();
        f1335 = (f1337 + 69) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5824(TJSplitWebView tJSplitWebView) {
        f1337 = (f1335 + 7) % 128;
        String lastUrl = tJSplitWebView.getLastUrl();
        int i10 = f1335 + 103;
        f1337 = i10 % 128;
        if (i10 % 2 == 0) {
            return lastUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5827(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1337 + 73;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5829((ViewConfiguration.getEdgeSlop() >> 16) - 219010686, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 561394018 - ImageFormat.getBitsPerPixel(0), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-35) - Color.alpha(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5823((TJPlacementData) list.get(0));
            }
        });
        map.put(m5831(new int[]{-1958801393, 1536172740, -1552717910, -419449448}, TextUtils.indexOf("", "", 0) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5826((TJPlacementData) list.get(0));
            }
        });
        map.put(m5831(new int[]{347814129, 1202057100, 1999056273, 1158179549, -1225331947, 429344231, 1204208215, -1379957247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5830((TJPlacementData) list.get(0));
            }
        });
        map.put(m5831(new int[]{592326598, -1191627709, 961209126, 2091488041}, 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5825((TJPlacement) list.get(0));
            }
        });
        map.put(m5829((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 219010671, (short) View.combineMeasuredStates(0, 0), 561394019 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) - 40).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5828((TJPlacement) list.get(0));
            }
        });
        map.put(m5829((-219010661) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) TextUtils.getCapsMode("", 0, 0), 561394019 - KeyEvent.getDeadChar(0, 0), (byte) KeyEvent.getDeadChar(0, 0), (-35) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5822((TJPlacement) list.get(0));
            }
        });
        map.put(m5831(new int[]{396982242, 1913312082, -2005820419, 1074999625, 1079795563, 14035280, 2007860748, -41227398}, Color.green(0) + 16).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                cg.m5819((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m5829((-219010646) - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 561394019, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (-41) - KeyEvent.normalizeMetaState(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                return cg.m5818((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1335 + 3;
        f1337 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x020d  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cg.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5817(TJPlacementData tJPlacementData) {
        f1335 = (f1337 + 115) % 128;
        String url = tJPlacementData.getUrl();
        int i10 = f1335 + 9;
        f1337 = i10 % 128;
        if (i10 % 2 == 0) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5816(TJPlacement tJPlacement) {
        f1335 = (f1337 + 93) % 128;
        String name = tJPlacement.getName();
        f1337 = (f1335 + 17) % 128;
        return name;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5829(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1339;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1342;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1338 + i10] + i13);
                    } else {
                        i14 = (short) (f1340[f1338 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1338 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1341);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1342;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1340;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5831(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1336.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
