package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.AnyThread;
import com.google.common.base.Ascii;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ah extends jq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f272 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f273 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f279;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f280;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f281;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f282;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int f283;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f278 = {159890573, -910063818, -600115476, -2099468554, 1945981542, -1312134860, 24713813, -1411269694, 554228237, -1696758035, -462198900, -119245287, -1212623189, 1696824146, 229495467, -1073258516, 1695204960, 713848315};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f275 = 145;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f274 = 42117;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f277 = 13679;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f276 = 42951;

    public interface a {
        void onEventGenerated(JSONObject jSONObject);
    }

    ah(Context context, ao aoVar, int i10, String str, long j10) {
        super(context, aoVar, j10);
        this.f279 = i10;
        this.f281 = 0;
        this.f283 = 1;
        this.f282 = str;
        HandlerThread handlerThread = new HandlerThread(m4686(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        handlerThread.start();
        this.f280 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ int m4685(ah ahVar) {
        int i10 = f272;
        f273 = (i10 + 7) % 128;
        int i11 = ahVar.f281;
        ahVar.f281 = i11 + 1;
        f273 = (i10 + 3) % 128;
        return i11;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int m4687() {
        int i10 = f272;
        f273 = (i10 + 59) % 128;
        int i11 = this.f281;
        if (i11 != 0) {
            return i11;
        }
        int i12 = i10 + 17;
        f273 = i12 % 128;
        if (i12 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ int m4689(ah ahVar) {
        int i10 = f272 + 83;
        int i11 = i10 % 128;
        f273 = i11;
        int i12 = i10 % 2;
        int i13 = ahVar.f283;
        if (i12 == 0) {
            throw null;
        }
        int i14 = i11 + 1;
        f272 = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ int m4691(ah ahVar) {
        int i10 = (f272 + 125) % 128;
        f273 = i10;
        int i11 = ahVar.f283;
        ahVar.f283 = i11 + 1;
        int i12 = i10 + 121;
        f272 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 90 / 0;
        }
        return i11;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jq
    @AnyThread
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject mo4692(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        long jM7068;
        long jM7066;
        synchronized (this) {
            jM7068 = jx.m7068();
            jM7066 = jx.m7066();
        }
        JSONObject jSONObjectMo4692 = super.mo4692(jSONObject, z10, z11, z12);
        try {
            long jOptLong = jSONObjectMo4692.optLong(ih.f2559);
            jSONObjectMo4692.remove(ih.f2559);
            if (jOptLong != 0) {
                long j10 = jM7066 - (jM7068 - jOptLong);
                jSONObjectMo4692.put(m4686(new int[]{1638472619, -1359028187}, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), jM7068);
                jSONObjectMo4692.put(m4690("뗌⓶ॄ㇘", ExpandableListView.getPackedPositionType(0L) + 3).intern(), jM7066);
                jM7068 = jOptLong;
                jM7066 = j10;
            }
            jSONObjectMo4692.put(m4686(new int[]{-738648929, 1604136994}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3).intern(), jM7068);
            jSONObjectMo4692.put(m4686(new int[]{-355879610, -1461257667}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1).intern(), jM7066);
            jSONObjectMo4692.put(m4690("뗌⓶ꪪ斶", View.combineMeasuredStates(0, 0) + 4).intern(), this.f282);
            jSONObjectMo4692.put(m4686(new int[]{730762364, -520726139}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3).intern(), this.f279);
            jSONObjectMo4692.put(m4690("쥔䆷왅䲈", (ViewConfiguration.getTouchSlop() >> 8) + 3).intern(), m4687());
            if (ar.m4771().mo4772()) {
                jSONObjectMo4692.put(m4690("ꚍ듉凿ꆯ", Color.argb(0, 0, 0, 0) + 4).intern(), true);
            }
            ap apVarMo4783 = ar.m4771().mo4783();
            if (apVarMo4783 != null) {
                String strM4764 = apVarMo4783.m4764();
                if (!TextUtils.isEmpty(strM4764)) {
                    jSONObjectMo4692.put(m4690("␄瀻ॄ㇘", 3 - TextUtils.indexOf("", "", 0, 0)).intern(), strM4764);
                }
            }
            if (z11) {
                m4688(jSONObjectMo4692);
                return jSONObjectMo4692;
            }
        } catch (JSONException e10) {
            k.m7118(m4686(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, TextUtils.indexOf("", "") + 23).intern(), m4690("蟇ꀸ焛ᷛ\udd79灦ᚲ쏗ꃺ霻ඣ亏뺃侶\uf515ꋚ뮱\u0ee9ꄺ⭯뙾辉\ue98f\ue587", 24 - (Process.myPid() >> 22)).intern(), e10);
        }
        return jSONObjectMo4692;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4686(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f278.clone();
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4690(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f275)) ^ ((c11 >>> 5) + f277)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f274) ^ ((c12 + i12) ^ ((c12 << 4) + f276))));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4694(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z10, final a aVar) throws Throwable {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f280.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4

                /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
                private static int f293 = 0;

                /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                private static int f294 = 1;

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static short[] f295 = null;

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f296 = 112;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static byte[] f297 = {2, 17, -19, 1, Ascii.DC4, -20, 0, Ascii.SO, -14, Ascii.DC4, -17, -4, -8, Ascii.FF, -13, 9, 8, 2, -1, -3, 2, 2, -17, -2, -9, -1, 1, Ascii.VT, -5, 5, 10, -17, -4, 0, 0, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f298 = 287820270;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f299 = -1011925419;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m4696(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f3017) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f296;
                            int i14 = i12 + i13;
                            int i15 = i14 == -1 ? 1 : 0;
                            if (i15 != 0) {
                                byte[] bArr = f297;
                                i14 = bArr != null ? (byte) (bArr[f299 + i10] + i13) : (short) (f295[f299 + i10] + i13);
                            }
                            if (i14 > 0) {
                                o.f3018 = ((i10 + i14) - 2) + f299 + i15;
                                o.f3019 = b10;
                                char c10 = (char) (i11 + f298);
                                o.f3021 = c10;
                                sb2.append(c10);
                                o.f3020 = o.f3021;
                                o.f3022 = 1;
                                while (o.f3022 < i14) {
                                    byte[] bArr2 = f297;
                                    if (bArr2 != null) {
                                        int i16 = o.f3018;
                                        o.f3018 = i16 - 1;
                                        o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                    } else {
                                        short[] sArr = f295;
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
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return string;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() throws Exception {
                    if (str.equals(m4696(1011925419 - Drawable.resolveOpacity(0, 0), (short) (Process.myPid() >> 22), (-287820154) - TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") - 98).intern())) {
                        f293 = (f294 + 29) % 128;
                        ah.m4685(ah.this);
                    }
                    int iM4689 = ah.m4689(ah.this);
                    ah.m4691(ah.this);
                    JSONObject jSONObjectM7082 = jz.m7082(jSONObject);
                    jSONObjectM7082.put(m4696((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1011925431, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 287820160, (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 108).intern(), str);
                    jSONObjectM7082.put(m4696(1011925435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 287820169, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-111) - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), iM4689);
                    String strIntern = m4696(1011925435 - TextUtils.indexOf("", "", 0), (short) (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) - 287820154, (byte) (ViewConfiguration.getTouchSlop() >> 8), (-16777319) - Color.rgb(0, 0, 0)).intern();
                    JSONObject jSONObject3 = jSONObject2;
                    if (jSONObject3 != null) {
                        f294 = (f293 + 69) % 128;
                        strIntern = jSONObject3.optString(ih.f2568);
                        String str2 = ih.f2521;
                        jSONObjectM7082.put(str2, jSONObject2.optString(str2, null));
                    }
                    if (TextUtils.isEmpty(strIntern)) {
                        strIntern = m4696(TextUtils.indexOf((CharSequence) "", '0') + 1011925444, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820160, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-108) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                    } else {
                        f294 = (f293 + 23) % 128;
                    }
                    jSONObjectM7082.put(ih.f2566, strIntern);
                    if (!jSONObjectM7082.has(ih.f2567)) {
                        int i10 = f293 + 79;
                        f294 = i10 % 128;
                        if (i10 % 2 == 0) {
                            jSONObjectM7082.put(ih.f2567, strIntern);
                            throw null;
                        }
                        jSONObjectM7082.put(ih.f2567, strIntern);
                    }
                    final JSONObject jSONObjectMo4692 = ah.this.mo4692(jSONObjectM7082, z10, true, str.equals(m4696((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1011925446, (short) (Process.getGidForName("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820154, (byte) ExpandableListView.getPackedPositionType(0L), (-105) - (ViewConfiguration.getTapTimeout() >> 16)).intern()));
                    t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            aVar.onEventGenerated(jSONObjectMo4692);
                        }
                    });
                }
            });
            int i10 = f273 + 117;
            f272 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 10 / 0;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4693(final JSONArray jSONArray, final boolean z10, final a aVar) {
        this.f280.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f284 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f285 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f286 = -5029551146765390489L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m4695(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2043) {
                    try {
                        f.f2041 = i10;
                        char[] cArr2 = new char[cArr.length];
                        f.f2042 = 0;
                        while (true) {
                            int i11 = f.f2042;
                            if (i11 < cArr.length) {
                                cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f286);
                                f.f2042++;
                            } else {
                                str2 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v13 */
            /* JADX WARN: Type inference failed for: r0v2, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r0v7, types: [org.json.JSONObject] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() throws Exception {
                final ?? r02;
                String strIntern;
                JSONArray jSONArray2;
                int i10 = f285 + 19;
                f284 = i10 % 128;
                ?? r03 = i10 % 2;
                try {
                    if (r03 == 0) {
                        JSONObject jSONObjectMo4692 = ah.this.mo4692(null, z10, true, true);
                        strIntern = m4695("\ued02櫖\ue28c穜\uf20f䯷", 34758 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1))).intern();
                        jSONArray2 = jSONArray;
                        r03 = jSONObjectMo4692;
                    } else {
                        JSONObject jSONObjectMo46922 = ah.this.mo4692(null, z10, false, false);
                        strIntern = m4695("\ued02櫖\ue28c穜\uf20f䯷", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34758).intern();
                        jSONArray2 = jSONArray;
                        r03 = jSONObjectMo46922;
                    }
                    r03.put(strIntern, jSONArray2);
                    r02 = r03;
                } catch (JSONException e10) {
                    k.m7118(m4695("\ued26㳪什颢ꪒ\uf47cٜ倱戌跙\udfcf\ue9c3㮭䖔靊ꅏ\uf339ᴑⳣ统袯\uda97\ue497", TextUtils.indexOf("", "", 0) + 53731).intern(), m4695("\ued22ᤆԳㄱ㵙⤘啶䆐䶚禭断釟鷭觷둍ꀟ갡\ud841쑟\uf07aﱖ\ue88dᒱ³", 62482 - ExpandableListView.getPackedPositionChild(0L)).intern(), e10);
                    r02 = r03;
                }
                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        aVar.onEventGenerated(r02);
                    }
                });
            }
        });
        int i10 = f272 + 59;
        f273 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m4688(JSONObject jSONObject) {
        f272 = (f273 + 47) % 128;
        ii iiVarM6951 = jf.m6944().m6951();
        try {
            jSONObject.put(m4690("堲ວｪ\uef12詘⸇滋燆ጮᣆ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8).intern(), jz.m7091(iiVarM6951.m6778(), iiVarM6951.m6777(), iiVarM6951.m6780(), iiVarM6951.m6779()));
            f273 = (f272 + 73) % 128;
        } catch (JSONException e10) {
            k.m7118(m4686(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m4690("衬ᷙ焛ᷛ\udd79灦㽭䐨龯ⅾ뺃侶ↄ돤굃崽慝孔滋燆ܤ䴄慝孔\uf515ꋚ뮱\u0ee9ꄺ⭯", 29 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e10);
        }
    }
}
