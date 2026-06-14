package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hc;
import com.ironsource.adqualitysdk.sdk.i.hd;
import com.ironsource.adqualitysdk.sdk.i.he;
import com.ironsource.adqualitysdk.sdk.i.hf;
import com.ironsource.adqualitysdk.sdk.i.hh;
import com.ironsource.adqualitysdk.sdk.i.hj;
import com.ironsource.adqualitysdk.sdk.i.ka;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cw extends cz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1556 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1557 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1558 = 33475;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1559;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1560 = {':', 139, 162, 160, 160, 'y', 'q', 154, 155, 147, 154, 158, 155, 154, 's', 'f', 137, 148, 150, 149, 136, 142, 150, 157, 159, 155, 144, 142, 139, 139, 154, 154, 141, 138, 158, 163, 156, 153, 153, 155, ':', 's', 'n', 'Z', 'X', 'f', 'j', 'g', 'd', 'U', '[', 't', 'r', 't', 'm', 'V', ']', '^', '7', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '[', '[', 'k', 'i', 'i', '9', 'k', 'm', 'o', 'g', 'd', 'd', '[', 'c', 's', 'j', 'b', 'c', 'b', 'h', 'p', 'Z', '1', 'C', 'j', 'k', 'n', 'j', 'c', 'k', 'j', 'A', 'I', 'p', 'p', 'r', '[', '0', 'b', 'c', 'g', 'g', 'f', 'R', '4', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1561;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static WebChromeClient m6083(List<Object> list) {
        f1561 = (f1556 + 17) % 128;
        WebChromeClient webChromeClientM7186 = ki.m7186((WebView) cz.m6139(list, 0, WebView.class));
        f1561 = (f1556 + 17) % 128;
        return webChromeClientM7186;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static WebViewClient m6084(List<Object> list) {
        f1561 = (f1556 + 21) % 128;
        WebViewClient webViewClientM7195 = ki.m7195((WebView) cz.m6139(list, 0, WebView.class));
        f1556 = (f1561 + 75) % 128;
        return webViewClientM7195;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static js m6085(List<Object> list) {
        f1561 = (f1556 + 5) % 128;
        js jsVarM7005 = js.m7005((WebView) cz.m6139(list, 0, WebView.class), m6098(new int[]{109, 9, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern());
        int i10 = f1556 + 39;
        f1561 = i10 % 128;
        if (i10 % 2 == 0) {
            return jsVarM7005;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static boolean m6086(List<Object> list) {
        int i10 = f1561 + 81;
        f1556 = i10 % 128;
        int i11 = i10 % 2;
        return ka.m7120(cz.m6139(list, 0, Object.class));
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static Object m6087(List<Object> list) {
        hg hgVar;
        int i10 = f1556 + 7;
        f1561 = i10 % 128;
        if (i10 % 2 == 0 ? (hgVar = (hg) cz.m6139(list, 0, hg.class)) == null : (hgVar = (hg) cz.m6139(list, 0, hg.class)) == null) {
            f1556 = (f1561 + 35) % 128;
            return null;
        }
        Object objMo5030 = hgVar.mo5030();
        f1556 = (f1561 + 83) % 128;
        return objMo5030;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static Object m6088(List<Object> list) {
        f1561 = (f1556 + 29) % 128;
        ((js) cz.m6139(list, 0, js.class)).m7007();
        f1556 = (f1561 + 3) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static Object m6089(List<Object> list) {
        f1556 = (f1561 + 103) % 128;
        ((js) cz.m6139(list, 0, js.class)).m7011();
        f1556 = (f1561 + 39) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static View.OnTouchListener m6090(List<Object> list) {
        int i10 = f1561 + 11;
        f1556 = i10 % 128;
        int i11 = i10 % 2;
        return ju.m7025((View) cz.m6139(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m6092(List<Object> list) {
        f1561 = (f1556 + 91) % 128;
        jd.m6903().m6911((io) cz.m6139(list, 0, io.class));
        int i10 = f1556 + 41;
        f1561 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ List m6093(List list, Object[] objArr) {
        f1556 = (f1561 + 13) % 128;
        List<Object> listM6096 = m6096(list, objArr);
        int i10 = f1561 + 39;
        f1556 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM6096;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m6100(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            final boolean zM6094 = m6094(list, 2);
            cqVar2 = cqVar;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static char[] f1630 = {'E', 'r', 'o', ' ', 'i', 'n', 'O', 'L', 'a', 'y', 'u', 't', 'C', 'h', 'g', 'e', 's', 'd', 'F', 'G', 'H', 'I', 'J', 'K', 'M'};

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f1631 = 1;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char f1632 = 5;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f1633;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m6126(String str, int i10, byte b10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (g.f2153) {
                            try {
                                char[] cArr2 = f1630;
                                char c10 = f1632;
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

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        f1631 = (f1633 + 73) % 128;
                        try {
                            final List<Object> listM6093 = cw.m6093(listM6141, new Object[]{this, view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)});
                            if (zM6094) {
                                dsVar.m6385(duVar, cqVar2, listM6093);
                                return;
                            }
                            t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4.5
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4564() {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    dsVar.m6385(duVar, cqVar2, listM6093);
                                }
                            });
                            int i18 = f1633 + 25;
                            f1631 = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i19 = 41 / 0;
                            }
                        } catch (Throwable th2) {
                            String strM5971 = cqVar2.m5971();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m6126("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0001\b\u0006\b\t\u0005\u0000\f\f\r\u0012\r\t\n\u0011\u0005\u0001\u0013\n\u0010\n\u0014\u0002\u0004\u0000\t\u0013\u0001\u0012\u0010g", 39 - TextUtils.indexOf("", ""), (byte) (70 - Process.getGidForName(""))).intern());
                            sb2.append(dsVar.m6386());
                            co.m5911(strM5971, sb2.toString(), th2);
                        }
                    }
                };
                f1561 = (f1556 + 11) % 128;
                return onLayoutChangeListener;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6098(new int[]{40, 37, 0, 33}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r0 r2
  0x0048: PHI (r0v5 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v10 android.media.MediaPlayer) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r2v3 com.ironsource.adqualitysdk.sdk.i.hf$b) = (r2v2 com.ironsource.adqualitysdk.sdk.i.hf$b), (r2v6 com.ironsource.adqualitysdk.sdk.i.hf$b) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r0 r2
  0x0037: PHI (r0v8 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v10 android.media.MediaPlayer) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r2v4 com.ironsource.adqualitysdk.sdk.i.hf$b) = (r2v2 com.ironsource.adqualitysdk.sdk.i.hf$b), (r2v6 com.ironsource.adqualitysdk.sdk.i.hf$b) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6103(java.util.List<java.lang.Object> r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1556
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1561 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hf$b> r2 = com.ironsource.adqualitysdk.sdk.i.hf.b.class
            java.lang.Class<android.media.MediaPlayer> r3 = android.media.MediaPlayer.class
            r4 = 0
            if (r0 == 0) goto L24
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.hf$b r2 = (com.ironsource.adqualitysdk.sdk.i.hf.b) r2
            boolean r6 = m6094(r6, r1)
            if (r6 == 0) goto L37
            goto L48
        L24:
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            r3 = 1
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.hf$b r2 = (com.ironsource.adqualitysdk.sdk.i.hf.b) r2
            boolean r6 = m6094(r6, r1)
            if (r6 != 0) goto L48
        L37:
            com.ironsource.adqualitysdk.sdk.i.cw$8 r6 = new com.ironsource.adqualitysdk.sdk.i.cw$8
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.ju.m7028(r0, r6)
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1561
            int r6 = r6 + 55
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1556 = r6
            goto L4b
        L48:
            com.ironsource.adqualitysdk.sdk.i.ju.m7028(r0, r2)
        L4b:
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1556
            int r6 = r6 + 45
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1561 = r0
            int r6 = r6 % r1
            r0 = 0
            if (r6 != 0) goto L58
            return r0
        L58:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cw.m6103(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m6104(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
            try {
                hf.b bVar = new hf.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.hf.b
                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    public final void mo6124(hf hfVar, MediaPlayer mediaPlayer) {
                        dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, hfVar, mediaPlayer}));
                    }
                };
                int i10 = f1561 + 99;
                f1556 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 28 / 0;
                }
                return bVar;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6095("滛綴⒵峀콈ꃲ￤㶜\uda1d沌ᬞᓥ폳璤摦ቴ㭼霜\uf0f7ǩᘧ㴘ꔝ流ⴢ顶\u2067ꄝ\u0cff햼ꑡ섟뺇쒰霟\uf332ᛕ沪꺌埦ゝ씴뫜ꂎ鐼\uefe3", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0), "䃎ザ㭜퓓").intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m6106(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        final ds dsVar;
        final List<Object> listM6141;
        try {
            dsVar = (ds) cz.m6139(list, 0, ds.class);
            listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
        } catch (Exception e10) {
            e = e10;
            cqVar2 = cqVar;
        }
        try {
            hj.c cVar = new hj.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.18
                @Override // com.ironsource.adqualitysdk.sdk.i.hj.c
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo6125(hj hjVar, MediaPlayer mediaPlayer) {
                    dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, hjVar, mediaPlayer}));
                }
            };
            f1556 = (f1561 + 53) % 128;
            return cVar;
        } catch (Exception e11) {
            e = e11;
            co.m5911(cqVar2.m5971(), m6095("\ue224叓쳘\uf0e5叀Ђ䷴ꔒ⛔팈鯽᧽쯶\uece1ᶷ\udff7閭흥⚿ɡᬅ臦䞠ᷱ鼌똕㘈❘ꍗꖀǡ킶䉹갥뀀\uf38c⯗ᄎ㏁훞⧿蚂盂냸\udec9鏰䕤頰", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "ኼ䍹鱗뫳").intern(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final io m6108(final cq cqVar, List<Object> list, final du duVar) {
        final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i10 = f1561 + 3;
            f1556 = i10 % 128;
            int i11 = i10 % 2;
            arrayList.addAll((Collection) cz.m6139(list, 1, List.class));
        }
        if (dsVar != null) {
            return new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.5
                @Override // com.ironsource.adqualitysdk.sdk.i.io
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo6127() {
                    arrayList.add(0, this);
                    dsVar.m6385(duVar, cqVar, arrayList);
                    arrayList.remove(0);
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m6113(List<Object> list) {
        f1561 = (f1556 + 7) % 128;
        View view = (View) cz.m6139(list, 0, View.class);
        final hd.d dVar = (hd.d) cz.m6139(list, 1, hd.d.class);
        if (!(!m6094(list, 2))) {
            ju.m7029(view, dVar);
            f1556 = (f1561 + 101) % 128;
        } else {
            ju.m7029(view, new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.14
                @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo6122(final hd hdVar, final View view2) {
                    t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.14.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            dVar.mo6122(hdVar, view2);
                        }
                    });
                }
            });
        }
        int i10 = f1561 + 49;
        f1556 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m6115(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
            try {
                hd.d dVar = new hd.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.9
                    @Override // com.ironsource.adqualitysdk.sdk.i.hd.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo6122(hd hdVar, View view) {
                        dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, hdVar, view}));
                    }
                };
                int i10 = f1556 + 113;
                f1561 = i10 % 128;
                if (i10 % 2 == 0) {
                    return dVar;
                }
                throw null;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6095("ﻖ胅厬슼廴찯Ჴ퉕懜幙Ɔ퀂漃ᇚ\uf024캹⛠䞾ඥ\uf652謐ꪠ䯍柵婢雪뭲꣩Ԍܵ\udc86当웺鈰", (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", ViewConfiguration.getLongPressTimeout() >> 16, "Կ鍻ꮪඹ").intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ju.m7033(r0, new com.ironsource.adqualitysdk.sdk.i.cw.AnonymousClass12());
        com.ironsource.adqualitysdk.sdk.i.cw.f1561 = (com.ironsource.adqualitysdk.sdk.i.cw.f1556 + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (m6094(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (m6094(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.cw.f1556 = (com.ironsource.adqualitysdk.sdk.i.cw.f1561 + 93) % 128;
        com.ironsource.adqualitysdk.sdk.i.ju.m7033(r0, r2);
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6111(java.util.List<java.lang.Object> r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cw.f1561
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1556 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hh$c> r2 = com.ironsource.adqualitysdk.sdk.i.hh.c.class
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r4 = 1
            if (r0 != 0) goto L24
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r3)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.hh$c r2 = (com.ironsource.adqualitysdk.sdk.i.hh.c) r2
            boolean r6 = m6094(r6, r1)
            if (r6 == 0) goto L43
            goto L37
        L24:
            r0 = 0
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r0, r3)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.i.cz.m6139(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.hh$c r2 = (com.ironsource.adqualitysdk.sdk.i.hh.c) r2
            boolean r6 = m6094(r6, r1)
            if (r6 == 0) goto L43
        L37:
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1561
            int r6 = r6 + 93
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1556 = r6
            com.ironsource.adqualitysdk.sdk.i.ju.m7033(r0, r2)
            goto L53
        L43:
            com.ironsource.adqualitysdk.sdk.i.cw$12 r6 = new com.ironsource.adqualitysdk.sdk.i.cw$12
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.ju.m7033(r0, r6)
            int r6 = com.ironsource.adqualitysdk.sdk.i.cw.f1556
            int r6 = r6 + 123
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.cw.f1561 = r6
        L53:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cw.m6111(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m6099(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final ds dsVar2 = (ds) cz.m6139(list, 1, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 2);
            final boolean zM6094 = m6094(list, 3);
            cqVar2 = cqVar;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1

                    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                    private static int f1562 = 0;

                    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                    private static boolean f1563 = true;

                    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                    private static int f1564 = 1;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static boolean f1565 = true;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static char[] f1566 = {362, 407, 404, 325, 398, 403, 372, 358, 409, 390, 392, 397, 376, 394, 360, 396, 369, 408, 393};

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f1567 = 293;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m6116(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                        Object bytes = str2;
                        if (str2 != null) {
                            bytes = str2.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (m.f3012) {
                            try {
                                char[] cArr2 = f1566;
                                int i11 = f1567;
                                if (f1563) {
                                    int length = bArr.length;
                                    m.f3014 = length;
                                    char[] cArr3 = new char[length];
                                    m.f3013 = 0;
                                    while (m.f3013 < m.f3014) {
                                        int i12 = m.f3013;
                                        int i13 = m.f3014 - 1;
                                        int i14 = m.f3013;
                                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                        m.f3013 = i14 + 1;
                                    }
                                    return new String(cArr3);
                                }
                                if (f1565) {
                                    int length2 = cArr.length;
                                    m.f3014 = length2;
                                    char[] cArr4 = new char[length2];
                                    m.f3013 = 0;
                                    while (m.f3013 < m.f3014) {
                                        int i15 = m.f3013;
                                        int i16 = m.f3014 - 1;
                                        int i17 = m.f3013;
                                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                        m.f3013 = i17 + 1;
                                    }
                                    return new String(cArr4);
                                }
                                int length3 = iArr.length;
                                m.f3014 = length3;
                                char[] cArr5 = new char[length3];
                                m.f3013 = 0;
                                while (m.f3013 < m.f3014) {
                                    int i18 = m.f3013;
                                    int i19 = m.f3014 - 1;
                                    int i20 = m.f3013;
                                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                                    m.f3013 = i20 + 1;
                                }
                                return new String(cArr5);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private void m6117(final ds dsVar3, View view) {
                        f1564 = (f1562 + 49) % 128;
                        try {
                            final List<Object> listM6093 = cw.m6093(listM6141, new Object[]{this, view});
                            if (!zM6094) {
                                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo4564() {
                                        ds dsVar4 = dsVar3;
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        dsVar4.m6385(duVar, cqVar2, listM6093);
                                    }
                                });
                                f1562 = (f1564 + 13) % 128;
                                return;
                            }
                            int i10 = f1564 + 67;
                            f1562 = i10 % 128;
                            if (i10 % 2 == 0) {
                                dsVar3.m6385(duVar, cqVar2, listM6093);
                            } else {
                                dsVar3.m6385(duVar, cqVar2, listM6093);
                                throw null;
                            }
                        } catch (Throwable th2) {
                            String strM5971 = cqVar2.m5971();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m6116(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u0084\u008e\u0093\u0085\u0092\u0086\u0085\u0084\u0082\u008e\u0086\u008e\u0089\u0092\u0085\u0091\u008e\u0090\u0086\u008a\u008c\u008f\u008e\u0089\u008a\u0089\u008d\u008c\u008b\u008a\u0089\u0089\u0088\u0086\u0087\u0084\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
                            sb2.append(dsVar3.m6386());
                            co.m5911(strM5971, sb2.toString(), th2);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        f1562 = (f1564 + 75) % 128;
                        m6117(dsVar, view);
                        int i10 = f1564 + 111;
                        f1562 = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        f1564 = (f1562 + 11) % 128;
                        m6117(dsVar2, view);
                        f1564 = (f1562 + 109) % 128;
                    }
                };
                int i10 = f1556 + 63;
                f1561 = i10 % 128;
                if (i10 % 2 == 0) {
                    return onAttachStateChangeListener;
                }
                throw null;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6095("㬃䕸\ud8b1沆팽睮퓑\ueafd勒獩쵦뇈熏챍\u0bdaꘛ픧\uf240᚜헵옉蟧\uda5cKⓣ\uecd6랇膪材袓⋳⠅蔋灔蟲턛\ud989\uf69e䠦嶈녢蜕", (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 18406), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0), "銐魉\ue679鵇").intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m6109(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
            try {
                hh.c cVar = new hh.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.13
                    @Override // com.ironsource.adqualitysdk.sdk.i.hh.c
                    /* JADX INFO: renamed from: ｋ */
                    public final boolean mo6121(hh hhVar, View view, MotionEvent motionEvent) {
                        return dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, hhVar, view, motionEvent})).m6379();
                    }
                };
                int i10 = f1561 + 7;
                f1556 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 0 / 0;
                }
                return cVar;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6095("飏\udd55\ude01\u202b咭ꏦ쀅䔃\uec00蕒\uf1dd㺼塥撃❳楒\udf85\ueb64\ud90b佳耲玓嵹꺸仂믟焚栎碴丽㽭ꌈ櫨쭜", (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", Color.blue(0), "꽎潿쇕\ude67").intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View.OnClickListener m6097(List<Object> list) {
        f1561 = (f1556 + 75) % 128;
        View.OnClickListener onClickListenerM7030 = ju.m7030((View) cz.m6139(list, 0, View.class));
        int i10 = f1556 + 45;
        f1561 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
        return onClickListenerM7030;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m6105(List<Object> list) {
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m6139(list, 0, MediaPlayer.class);
        final hj.c cVar = (hj.c) cz.m6139(list, 1, hj.c.class);
        if (m6094(list, 2)) {
            f1561 = (f1556 + 55) % 128;
            ju.m7032(mediaPlayer, cVar);
            return null;
        }
        ju.m7032(mediaPlayer, new hj.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.hj.c
            /* JADX INFO: renamed from: ｋ */
            public final void mo6125(final hj hjVar, final MediaPlayer mediaPlayer2) {
                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        cVar.mo6125(hjVar, mediaPlayer2);
                    }
                });
            }
        });
        f1561 = (f1556 + 81) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m6107(List<Object> list) {
        f1556 = (f1561 + 67) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m6139(list, 0, MediaPlayer.class);
        final hc.c cVar = (hc.c) cz.m6139(list, 1, hc.c.class);
        if (!m6094(list, 2)) {
            ju.m7035(mediaPlayer, new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7
                @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                /* JADX INFO: renamed from: ﻐ */
                public final boolean mo6123(final hc hcVar, final MediaPlayer mediaPlayer2, final int i10, final int i11) {
                    t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            cVar.mo6123(hcVar, mediaPlayer2, i10, i11);
                        }
                    });
                    return false;
                }
            });
            return null;
        }
        int i10 = f1561 + 7;
        f1556 = i10 % 128;
        if (i10 % 2 != 0) {
            ju.m7035(mediaPlayer, cVar);
            return null;
        }
        ju.m7035(mediaPlayer, cVar);
        int i11 = 41 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m6091(List<Object> list) {
        int i10 = f1556 + 117;
        f1561 = i10 % 128;
        jd.m6903().m6913((io) cz.m6139(list, i10 % 2 != 0 ? 1 : 0, io.class));
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m6101(List<Object> list) {
        f1556 = (f1561 + 91) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cz.m6139(list, 0, MediaPlayer.class);
        final he.a aVar = (he.a) cz.m6139(list, 1, he.a.class);
        if (m6094(list, 2)) {
            f1561 = (f1556 + 115) % 128;
            ju.m7036(mediaPlayer, aVar);
        } else {
            ju.m7036(mediaPlayer, new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3
                @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                /* JADX INFO: renamed from: ﻐ */
                public final void mo6120(final he heVar, final MediaPlayer mediaPlayer2) {
                    t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            aVar.mo6120(heVar, mediaPlayer2);
                        }
                    });
                }
            });
        }
        int i10 = f1561 + 81;
        f1556 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 33 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m6112(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
            try {
                hc.c cVar = new hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.15
                    @Override // com.ironsource.adqualitysdk.sdk.i.hc.c
                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    public final boolean mo6123(hc hcVar, MediaPlayer mediaPlayer, int i10, int i11) {
                        return dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, hcVar, mediaPlayer, Integer.valueOf(i10), Integer.valueOf(i11)})).m6379();
                    }
                };
                int i10 = f1561 + 79;
                f1556 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 40 / 0;
                }
                return cVar;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6098(new int[]{0, 40, 48, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m6114(final cq cqVar, List<Object> list) {
        final String simpleName;
        final boolean zBooleanValue = false;
        Class cls = (Class) cz.m6139(list, 0, Class.class);
        Object objM6139 = cz.m6139(list, 1, Object.class);
        if (list.size() > 2) {
            f1561 = (f1556 + 117) % 128;
            zBooleanValue = ((Boolean) cz.m6139(list, 2, Boolean.class)).booleanValue();
        }
        if (list.size() > 3) {
            f1556 = (f1561 + 123) % 128;
            simpleName = (String) cz.m6139(list, 3, String.class);
        } else {
            simpleName = cls.getSimpleName();
        }
        return ka.m7121(cls, objM6139, new ka.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.10

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1578 = 109;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1579 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static boolean f1580 = true;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1581 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static boolean f1582 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f1583 = {155, 178, 223, 220, 141, 214, 219, 227, 216, 212, 218, 210, 225, 213, 209, 217, 224};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6118(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (m.f3012) {
                    try {
                        char[] cArr2 = f1583;
                        int i11 = f1578;
                        if (f1580) {
                            int length = bArr.length;
                            m.f3014 = length;
                            char[] cArr3 = new char[length];
                            m.f3013 = 0;
                            while (m.f3013 < m.f3014) {
                                int i12 = m.f3013;
                                int i13 = m.f3014 - 1;
                                int i14 = m.f3013;
                                cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                m.f3013 = i14 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f1582) {
                            int length2 = cArr.length;
                            m.f3014 = length2;
                            char[] cArr4 = new char[length2];
                            m.f3013 = 0;
                            while (m.f3013 < m.f3014) {
                                int i15 = m.f3013;
                                int i16 = m.f3014 - 1;
                                int i17 = m.f3013;
                                cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                m.f3013 = i17 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        m.f3014 = length3;
                        char[] cArr5 = new char[length3];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i18 = m.f3013;
                            int i19 = m.f3014 - 1;
                            int i20 = m.f3013;
                            cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                            m.f3013 = i20 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ka.e
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo6119(Object obj, Method method, Object[] objArr) {
                f1579 = (f1581 + 71) % 128;
                if (method != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(simpleName);
                        sb2.append(m6118(null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, "\u0081").intern());
                        sb2.append(method.getName());
                        String string = sb2.toString();
                        List<Object> listM6093 = cw.m6093(objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(hg) obj});
                        ArrayList arrayList = new ArrayList();
                        if (zBooleanValue) {
                            int i10 = f1581 + 25;
                            f1579 = i10 % 128;
                            if (i10 % 2 != 0) {
                                arrayList.add(listM6093);
                                throw null;
                            }
                            arrayList.add(listM6093);
                            listM6093 = arrayList;
                        }
                        cqVar.m5972().mo5832(string, listM6093);
                    } catch (Exception e10) {
                        String strM5971 = cqVar.m5971();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m6118(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0085\u008a\u0087\u0086\u0089\u0084\u0088\u0087\u0086\u0085\u0083\u0084\u0083\u0083\u0082").intern());
                        sb3.append(method.getName());
                        sb3.append(m6118(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0085\u0087\u0084\u0085\u008f\u0084\u008e\u008d\u008c\u008b\u0085").intern());
                        sb3.append(simpleName);
                        sb3.append(m6118(null, View.MeasureSpec.getMode(0) + 127, null, "\u0083\u008c\u0087\u008c\u008d\u0091\u0086\u0090\u0085").intern());
                        co.m5911(strM5971, sb3.toString(), e10);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m6102(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        try {
            final ds dsVar = (ds) cz.m6139(list, 0, ds.class);
            final List<Object> listM6141 = cz.m6141(list, 1);
            final boolean zM6094 = m6094(list, 2);
            cqVar2 = cqVar;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6
                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    static /* synthetic */ void m6128(AnonymousClass6 anonymousClass6, ds dsVar2, du duVar2, cq cqVar3, List list2, Context context, Intent intent) {
                        dsVar2.m6385(duVar2, cqVar3, cw.m6093(list2, new Object[]{anonymousClass6, context, intent}));
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (zM6094) {
                            dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, context, intent}));
                        } else {
                            t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo4564() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    AnonymousClass6.m6128(anonymousClass6, dsVar, duVar, cqVar2, listM6141, context, intent);
                                }
                            });
                        }
                    }
                };
                int i10 = f1556 + 91;
                f1561 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 87 / 0;
                }
                return broadcastReceiver;
            } catch (Exception e10) {
                e = e10;
                co.m5911(cqVar2.m5971(), m6098(new int[]{77, 32, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            cqVar2 = cqVar;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m6110(cq cqVar, List<Object> list, final du duVar) {
        final cq cqVar2;
        final ds dsVar;
        final List<Object> listM6141;
        try {
            dsVar = (ds) cz.m6139(list, 0, ds.class);
            listM6141 = cz.m6141(list, 1);
            cqVar2 = cqVar;
        } catch (Exception e10) {
            e = e10;
            cqVar2 = cqVar;
        }
        try {
            he.a aVar = new he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.11
                @Override // com.ironsource.adqualitysdk.sdk.i.he.a
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo6120(he heVar, MediaPlayer mediaPlayer) {
                    dsVar.m6385(duVar, cqVar2, cw.m6093(listM6141, new Object[]{this, heVar, mediaPlayer}));
                }
            };
            f1561 = (f1556 + 113) % 128;
            return aVar;
        } catch (Exception e11) {
            e = e11;
            co.m5911(cqVar2.m5971(), m6095("핝\uf069蚿Ỵ죡\ue1c4粒⇎⍉粞雥ⶸ꩸\ue05d☳♣㚈뒭俟梨巏鴂쒠뒧Ἠ撣鮦⥲\u1ccf\uf3b5㖺\uef14類新ت﹠襯ở偱瓮Ｋ䟟ꤑ⃭", (char) (48125 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumFlingVelocity() >> 16, "㈢㊘ﺸ皻").intern(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<Object> m6096(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            int i10 = f1556 + 83;
            f1561 = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList.addAll(list);
                throw null;
            }
            arrayList.addAll(list);
        }
        f1561 = (f1556 + 23) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6094(List<Object> list, int i10) {
        f1556 = (f1561 + 61) % 128;
        if (list.size() <= i10) {
            return false;
        }
        f1561 = (f1556 + 83) % 128;
        return ((Boolean) cz.m6139(list, i10, Boolean.class)).booleanValue();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6095(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1557) ^ ((long) f1559)) ^ ((long) f1558));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6098(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1560, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
