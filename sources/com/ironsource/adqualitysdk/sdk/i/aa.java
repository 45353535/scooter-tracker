package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aa<T> extends w<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f93 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f94 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f95 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f96 = {-72, 113, -124, -66, 120, -121, 120, -114, 114, -65, -54, 62, -49, 49, -54, -34, 35, -28, 13, -43, 59, -44, 51, 58, -55, -58, -79, -74, 66, -74, 106, UnsignedBytes.MAX_POWER_OF_TWO, -80, 73, -71, 87, 90, -111, -80, 0, -3, 74, 6, -31, 76, -78, 79, 98, -76, 9, -27, -16, -3, -63, 37, -37, 53, -116, 113, 49, -51, 61, -56, -57, 54, -113, 102, -53, 53, -56, -27};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f97 = 1306129093;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f98 = 673858351;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f99 = 81;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, js> f100 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<jk> f101 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jp f102;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f103;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f104;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f105;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private js f106;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f107;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aa$3, reason: invalid class name */
    final class AnonymousClass3 implements jk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f108 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f111 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f113 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f115 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f116 = 14;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f114 = {129, 130, 'p', 'q', 'o', 's', 'r', 'u', 'e', 'd', 'w', 133, 'O', 'V', '|', 'z', 128, 'S', '}', '.', 132, 'x'};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f109 = -6702392760180083472L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f110 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f112 = 0;

        AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ void m4556(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z10) {
            int i10 = f108 + 55;
            f111 = i10 % 128;
            int i11 = i10 % 2;
            anonymousClass3.m4557(webView, str, z10);
            if (i11 != 0) {
                int i12 = 86 / 0;
            }
            f108 = (f111 + 111) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m4557(final WebView webView, final String str, final boolean z10) {
            t.m7281(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo4546 = aa.this.mo4546(webView);
                    t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f126 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f127 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static long f128 = 51974363563975081L;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m4565(String str2, int i10) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (h.f2308) {
                                try {
                                    char[] cArrM6531 = h.m6531(f128, cArr, i10);
                                    h.f2309 = 4;
                                    while (true) {
                                        int i11 = h.f2309;
                                        if (i11 < cArrM6531.length) {
                                            h.f2307 = i11 - 4;
                                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f128));
                                            h.f2309++;
                                        } else {
                                            str3 = new String(cArrM6531, 4, cArrM6531.length - 4);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ih.f2550, str);
                                jSONObject.put(ih.f2551, m4565("\udf94\udfe3눟폀\uef77ⱆ붗", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                                jSONObject.put(ih.f2563, originalUrl);
                                if (z10) {
                                    f127 = (f126 + 105) % 128;
                                    jSONObject.put(ih.f2560, true);
                                }
                                f127 = (f126 + 45) % 128;
                            } catch (JSONException e10) {
                                String strIntern = m4565("\u191f᥈軳\uef3f᭤\ud854\ue8ef챂鿒ܗ釕果ᐳ膆ࢯ\ufe6f誗᫆輏瓗", 1 - (Process.myTid() >> 22)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m4565("孊嬏탬넷ﵥ㹅荤\ua7f0\udd9c奚矐ఝ噧\udfa7\ueeab闚죈䓅楛ὴ䆶쵧\ue3c4預艹뎀媰憰糼㢌핏", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                sb2.append(e10.getLocalizedMessage());
                                k.m7098(strIntern, sb2.toString());
                            }
                            C04453 c04453 = C04453.this;
                            aa aaVar = aa.this;
                            aaVar.mo6001(jSONObject, webView, aa.m4541(aaVar), objMo4546);
                        }
                    });
                }
            });
            f108 = (f111 + 27) % 128;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4559(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f114;
                    int i11 = f116;
                    if (f115) {
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
                    if (f113) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo4562(WebView webView, String str, String str2) {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m4559(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                f108 = (f111 + 109) % 128;
                aa.m4533(aa.this, webView);
                return;
            }
            if (strSubstring.equals(m4558("Ⲥ턿\ue4bbა꺭㽪", (char) (ExpandableListView.getPackedPositionChild(0L) + 59468), "\uf4f0ꁐ克ꋼ", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "楬怕䯷珨").intern())) {
                JSONObject jSONObjectM4535 = aa.m4535(strSubstring2);
                aa aaVar = aa.this;
                aaVar.m4554(jSONObjectM4535, webView, aaVar.mo4546(webView));
                return;
            }
            if (strSubstring.equals(m4559(null, 127 - View.resolveSize(0, 0), null, "\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                int i10 = f111 + 113;
                f108 = i10 % 128;
                if (i10 % 2 != 0) {
                    JSONObject jSONObjectM45352 = aa.m4535(strSubstring2);
                    aa aaVar2 = aa.this;
                    aaVar2.mo5992(jSONObjectM45352, webView, aa.m4541(aaVar2), aa.this.mo4546(webView));
                    return;
                } else {
                    JSONObject jSONObjectM45353 = aa.m4535(strSubstring2);
                    aa aaVar3 = aa.this;
                    aaVar3.mo5992(jSONObjectM45353, webView, aa.m4541(aaVar3), aa.this.mo4546(webView));
                    int i11 = 39 / 0;
                    return;
                }
            }
            if (!strSubstring.equals(m4559(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0084\u0085\u0084\u0083\u0082\u0081").intern())) {
                if (strSubstring.equals(m4559(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0087\u0085\u0084\u0083\u0082\u0081").intern())) {
                    f108 = (f111 + 59) % 128;
                    JSONObject jSONObjectM45354 = aa.m4535(strSubstring2);
                    kd.m7162(jSONObjectM45354.optString(m4559(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0088\u0085\u0082").intern()), jSONObjectM45354.optString(m4558("흹ꀂ䘩몚㍖", (char) (49468 - ((byte) KeyEvent.getModifierMetaStateMask())), "\uf4f0ꁐ克ꋼ", 1031845588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "픝肶㴽濁").intern()), jSONObjectM45354.optString(m4558("ﱅ\ud835ƻ攬ﵣ桯", (char) (Color.argb(0, 0, 0, 0) + 1886), "\uf4f0ꁐ克ꋼ", (-1) - MotionEvent.axisFromString(""), "顭谐廪萇").intern()), jSONObjectM45354.optString(m4558("髂鿻懄쩮\uf4ae", (char) (50576 - Color.red(0)), "\uf4f0ꁐ克ꋼ", (-1758873904) - View.MeasureSpec.getSize(0), "킥⦶邗\uf8c5").intern()));
                    return;
                }
                return;
            }
            int i12 = f111 + 27;
            f108 = i12 % 128;
            if (i12 % 2 != 0) {
                JSONObject jSONObjectM45355 = aa.m4535(strSubstring2);
                jSONObjectM45355.remove(ih.f2559);
                aa aaVar4 = aa.this;
                aaVar4.mo6000(jSONObjectM45355, webView, aaVar4.mo4546(webView));
                return;
            }
            JSONObject jSONObjectM45356 = aa.m4535(strSubstring2);
            jSONObjectM45356.remove(ih.f2559);
            aa aaVar5 = aa.this;
            aaVar5.mo6000(jSONObjectM45356, webView, aaVar5.mo4546(webView));
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void mo4563(final WebView webView, final String str, final boolean z10) {
            t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo4564() {
                    if (aa.m4540(aa.this)) {
                        if (aa.m4534(aa.this) == null || aa.m4534(aa.this).isEmpty()) {
                            AnonymousClass3.m4556(AnonymousClass3.this, webView, str, z10);
                            return;
                        }
                        Iterator it = aa.m4534(aa.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m4556(AnonymousClass3.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            f111 = (f108 + 59) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo4560(WebView webView) {
            f108 = (f111 + 65) % 128;
            aa.m4533(aa.this, webView);
            f111 = (f108 + 79) % 128;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m4558(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f109) ^ ((long) f110)) ^ ((long) f112));
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo4561(WebView webView, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ih.f2561, str);
                jSONObject.put(ih.f2558, ih.f2555);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ih.f2562, jSONObject);
                aa aaVar = aa.this;
                aaVar.mo5997(jSONObject2, webView, this, aaVar.mo4546(webView));
                f111 = (f108 + 93) % 128;
            } catch (Exception e10) {
                kd.m7160(m4559(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0091\u0086\u0090\u0087\u008f\u0085\u008e\u0087\u008d\u008c\u0086\u008b\u008a\u0083\u0086\u0089").intern(), m4559(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u008f\u0093\u0081\u0096\u0094\u0082\u008f\u0086\u0095\u0086\u0094\u0084\u0084\u008c\u0094\u0088\u008f\u008b\u0082\u0085\u0086\u0091\u0084\u0094\u0091\u0093\u0091\u0091\u0092").intern(), e10, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m4533(aa aaVar, WebView webView) {
        int i10 = f94 + 41;
        f95 = i10 % 128;
        int i11 = i10 % 2;
        aaVar.m4538(webView);
        if (i11 != 0) {
            throw null;
        }
        f95 = (f94 + 45) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ List m4534(aa aaVar) {
        int i10 = (f94 + 109) % 128;
        f95 = i10;
        List<String> list = aaVar.f105;
        f94 = (i10 + 111) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ bb.e m4541(aa aaVar) {
        f94 = (f95 + 65) % 128;
        bb.e eVarM4543 = aaVar.m4543();
        f94 = (f95 + 125) % 128;
        return eVarM4543;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        WebView webView;
        try {
            if (view instanceof WebView) {
                int i18 = f94 + 45;
                f95 = i18 % 128;
                if (i18 % 2 != 0) {
                    webView = (WebView) view;
                    int i19 = 55 / 0;
                    if (!this.f100.containsKey(webView)) {
                        return;
                    }
                } else {
                    webView = (WebView) view;
                    if (!this.f100.containsKey(webView)) {
                        return;
                    }
                }
                m4538(webView);
                f94 = (f95 + 29) % 128;
            }
        } catch (Throwable th2) {
            kd.m7160(m4537((-673858342) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1306129007) - TextUtils.lastIndexOf("", '0'), (byte) ((-57) - Color.blue(0)), TextUtils.indexOf("", "", 0, 0) - 82).intern(), m4537(Color.alpha(0) - 673858326, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1306129024) - TextUtils.getCapsMode("", 0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 80), (-82) - (Process.myTid() >> 22)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    abstract T mo4546(WebView webView);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo4550(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f95 + 101;
        f94 = i10 % 128;
        int i11 = i10 % 2;
        m4554(jSONObject, (WebView) obj, obj2);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ void mo4555(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f95 + 29;
        f94 = i10 % 128;
        int i11 = i10 % 2;
        m4536(jSONObject, (WebView) obj, obj2);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f94 + 109;
        f95 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m4535(String str) {
        int i10 = f94 + 7;
        f95 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM4544 = m4544(str);
        if (i11 != 0) {
            int i12 = 64 / 0;
        }
        return jSONObjectM4544;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m4540(aa aaVar) {
        int i10 = f94;
        f95 = (i10 + 59) % 128;
        boolean z10 = aaVar.f103;
        f95 = (i10 + 59) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bb.e m4543() {
        js jsVar = this.f106;
        if (jsVar != null) {
            f95 = (f94 + 49) % 128;
            bb.e eVarM7010 = jsVar.m7010();
            f94 = (f95 + 123) % 128;
            return eVarM7010;
        }
        int i10 = f95 + 27;
        f94 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m4545() {
        int i10 = f94;
        f95 = (i10 + 79) % 128;
        js jsVar = this.f106;
        if (jsVar == null) {
            return null;
        }
        int i11 = i10 + 97;
        f95 = i11 % 128;
        if (i11 % 2 == 0) {
            return jsVar.m7012();
        }
        jsVar.m7012();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4552(WebView webView) {
        int i10 = f95 + 117;
        f94 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
            if (webView == null) {
                return;
            }
        } else if (webView == null) {
            return;
        }
        if (this.f100.containsKey(webView)) {
            return;
        }
        f94 = (f95 + 111) % 128;
        js jsVarM7005 = js.m7005(webView, m4537(View.resolveSizeAndState(0, 0, 0) - 673858351, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1306128996, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 113), TextUtils.getOffsetBefore("", 0) - 82).intern());
        if (this.f106 == null) {
            this.f106 = jsVarM7005;
            f94 = (f95 + 83) % 128;
        }
        this.f100.put(webView, jsVarM7005);
        jk jkVarM4542 = m4542();
        this.f101.add(jkVarM4542);
        jsVarM7005.m7008(jkVarM4542);
        m4538(webView);
        webView.addOnLayoutChangeListener(this);
        f94 = (f95 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m4547(List<WebView> list) {
        int i10 = f94 + 83;
        f95 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
            if (list == null) {
                return;
            }
        } else if (list == null) {
            return;
        }
        Iterator<WebView> it = list.iterator();
        f94 = (f95 + 99) % 128;
        while (it.hasNext()) {
            m4552(it.next());
            f95 = (f94 + 3) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m4549(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f107 = z10;
        this.f102 = new jp(str, z12);
        this.f103 = z11;
        this.f105 = list;
        int i10 = f95 + 11;
        f94 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m4532(WebView webView) {
        int i10 = f95 + 29;
        f94 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f102.m6999(webView);
            throw null;
        }
        this.f102.m6999(webView);
        f95 = (f94 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m4544(String str) {
        f95 = (f94 + 21) % 128;
        try {
            String strDecode = URLDecoder.decode(str, m4537((-673858303) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-1) - MotionEvent.axisFromString("")), TextUtils.getTrimmedLength("") - 1306129008, (byte) (2 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 83).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return new JSONObject(strDecode);
            }
        } catch (Exception e10) {
            k.m7118(m4537((ViewConfiguration.getFadingEdgeLength() >> 16) - 673858342, (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1306129006) - Color.blue(0), (byte) ((-58) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) - 81).intern(), m4537((-673858298) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0')), (-1306129024) - TextUtils.getTrimmedLength(""), (byte) ((-57) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 81).intern(), e10);
        }
        JSONObject jSONObject = new JSONObject();
        f95 = (f94 + 67) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4548() {
        for (WebView webView : this.f100.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            js jsVar = this.f100.get(webView);
            Iterator<jk> it = this.f101.iterator();
            while (it.hasNext()) {
                int i10 = f94 + 41;
                f95 = i10 % 128;
                if (i10 % 2 == 0) {
                    jsVar.m7013(it.next());
                } else {
                    jsVar.m7013(it.next());
                    throw null;
                }
            }
            f94 = (f95 + 15) % 128;
        }
        this.f101.clear();
        this.f106 = null;
        this.f100.clear();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m4536(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f95 + 103;
        f94 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObject.remove(ih.f2559);
            super.mo4555(jSONObject, webView, t10);
            f94 = (f95 + 109) % 128;
        } else {
            jSONObject.remove(ih.f2559);
            super.mo4555(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jk m4542() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        f94 = (f95 + 67) % 128;
        return anonymousClass3;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4553(String str) {
        int i10 = (f94 + 91) % 128;
        f95 = i10;
        this.f104 = str;
        int i11 = i10 + 63;
        f94 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo4551(T t10) {
        int i10 = f94;
        String str = this.f104;
        f95 = (i10 + 105) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m4554(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f94 + 59;
        f95 = i10 % 128;
        if (i10 % 2 == 0) {
            m4539(jSONObject, webView);
            super.mo4550(jSONObject, webView, t10);
        } else {
            m4539(jSONObject, webView);
            super.mo4550(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m4538(WebView webView) {
        int i10 = f94 + 111;
        f95 = i10 % 128;
        if (i10 % 2 == 0) {
            js jsVar = this.f100.get(webView);
            if (this.f107 && !(!jsVar.m7009())) {
                if (!ki.m7201(webView)) {
                    jsVar.m7011();
                }
                m4532(webView);
            }
            int i11 = f95 + 1;
            f94 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f100.get(webView);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m4539(JSONObject jSONObject, WebView webView) {
        boolean z10;
        if (webView != null) {
            f95 = (f94 + 9) % 128;
            try {
                String str = ih.f2522;
                if (webView.getWindowToken() != null) {
                    z10 = true;
                } else {
                    f95 = (f94 + 31) % 128;
                    z10 = false;
                }
                jSONObject.put(str, z10);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4537(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f99;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f96;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f98 + i10] + i13);
                    } else {
                        i14 = (short) (f93[f98 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f98 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f97);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f96;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f93;
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
