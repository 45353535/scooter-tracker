package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends w<View, Activity> {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f3235 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3236 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3237 = 186;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f3238;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jl f3243;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f3244;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private it f3245;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Map<WebView, aa> f3246 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Map<View, z> f3242 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f3240 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private c f3241 = new c();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final List<View> f3239 = new ArrayList();

    public class c {

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f3261 = 1;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static char f3263 = 6;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static int f3265;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private boolean f3268;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3272;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3273;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3274;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3275;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3276;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3277;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3278;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3279;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3280;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3281;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static char[] f3266 = {'a', 'd', 'V', 'i', 'e', 'w', 'C', 'l', 's', 'N', 'm', 'P', 'c', 'k', 'g', 'j', 'T', 'o', 'I', 'n', 't', 'u', 'W', 'b', 'h', 'r', 'f', 'x', 'S', 'A', 'E', 'v', 'J', 'p', 'K', 'q'};

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static char[] f3262 = {'u', 35898, 6391, 42124, 12609, 48399, 18912, 54678, 25133, 61158, 31385, 1871, 37637, 8144, 43920, 14387, 'i', 35898, 6364, 42170, 12624, 48388, 18880, 54682, 25097, 61173, 'u', 35898, 6391, 42142, 12636, 48409, 18884, 54686, 25090, 61154, 'p', 35899, 6397, 42168, 12609, 48414, 18885, 54697, 25121, 61172, 31405, 1872, 37667, 8155, 43955, 14374, 50425, 20663, 56694, 26883, 62918, 33176, 3623, 39659, 'v', 35872, 6391, 42156, 12653, 48393, 18885, 'a', 35882, 6374, 42162, 12626, 48388, 18882, 54678, 25133, 61154, 31374, 1868, 37669, 8146, 43920, 14376, 50402, 20668, 'v', 35872, 6391, 42156, 12631, 48441, 18905, 54710, 25135, 61183, 31413, 1873, 37641};

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static long f3264 = 7741231407589067849L;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<Integer> f3267 = new ArrayList();

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f3269 = new ArrayList();

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private List<String> f3271 = new ArrayList();

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<String> f3270 = new ArrayList();

        public c() {
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        static /* synthetic */ String m7403(c cVar) {
            int i10 = (f3265 + 17) % 128;
            f3261 = i10;
            String str = cVar.f3278;
            int i11 = i10 + 51;
            f3265 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 34 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        static /* synthetic */ boolean m7404(c cVar) {
            int i10 = f3261;
            f3265 = (i10 + 43) % 128;
            boolean z10 = cVar.f3273;
            f3265 = (i10 + 59) % 128;
            return z10;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        static /* synthetic */ boolean m7405(c cVar) {
            int i10 = (f3261 + 49) % 128;
            f3265 = i10;
            boolean z10 = cVar.f3280;
            int i11 = i10 + 121;
            f3261 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        static /* synthetic */ boolean m7406(c cVar) {
            int i10 = f3261 + 79;
            f3265 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = cVar.f3275;
            if (i11 != 0) {
                int i12 = 6 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        static /* synthetic */ List m7407(c cVar) {
            int i10 = (f3265 + 111) % 128;
            f3261 = i10;
            List<String> list = cVar.f3270;
            int i11 = i10 + 59;
            f3265 = i11 % 128;
            if (i11 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        static /* synthetic */ String m7409(c cVar) {
            int i10 = f3265 + 67;
            int i11 = i10 % 128;
            f3261 = i11;
            int i12 = i10 % 2;
            String str = cVar.f3281;
            if (i12 == 0) {
                throw null;
            }
            f3265 = (i11 + 39) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        static /* synthetic */ boolean m7411(c cVar) {
            int i10 = f3261;
            f3265 = (i10 + 119) % 128;
            boolean z10 = cVar.f3272;
            f3265 = (i10 + 1) % 128;
            return z10;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        static /* synthetic */ String m7412(c cVar) {
            int i10 = f3261;
            f3265 = (i10 + 1) % 128;
            String str = cVar.f3277;
            f3265 = (i10 + 115) % 128;
            return str;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        static /* synthetic */ boolean m7413(c cVar) {
            int i10 = f3265 + 37;
            f3261 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = cVar.f3276;
            if (i11 == 0) {
                int i12 = 70 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        static /* synthetic */ boolean m7414(c cVar) {
            int i10 = f3265 + 75;
            f3261 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = cVar.f3268;
            if (i11 == 0) {
                int i12 = 49 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ List m7418(c cVar) {
            int i10 = f3265 + 55;
            f3261 = i10 % 128;
            int i11 = i10 % 2;
            List<Integer> list = cVar.f3267;
            if (i11 == 0) {
                int i12 = 62 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ List m7422(c cVar) {
            int i10 = f3261;
            int i11 = i10 + 25;
            f3265 = i11 % 128;
            int i12 = i11 % 2;
            List<String> list = cVar.f3269;
            if (i12 != 0) {
                int i13 = 52 / 0;
            }
            f3265 = (i10 + 65) % 128;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ List m7425(c cVar) {
            int i10 = f3265 + 85;
            f3261 = i10 % 128;
            int i11 = i10 % 2;
            List<String> list = cVar.f3271;
            if (i11 == 0) {
                int i12 = 34 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ boolean m7429(c cVar) {
            int i10 = (f3265 + 87) % 128;
            f3261 = i10;
            boolean z10 = cVar.f3274;
            int i11 = i10 + 73;
            f3265 = i11 % 128;
            if (i11 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ String m7434(c cVar) {
            int i10 = f3265 + 77;
            f3261 = i10 % 128;
            int i11 = i10 % 2;
            String str = cVar.f3279;
            if (i11 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private c m7408(boolean z10) {
            int i10 = f3261;
            this.f3268 = z10;
            f3265 = (i10 + 59) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private c m7410(boolean z10) {
            int i10 = (f3265 + 73) % 128;
            f3261 = i10;
            this.f3275 = z10;
            f3265 = (i10 + 1) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7415(String str) {
            int i10 = f3265;
            this.f3279 = str;
            f3261 = (i10 + 91) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m7419(String str) {
            int i10 = (f3265 + 71) % 128;
            f3261 = i10;
            this.f3277 = str;
            f3265 = (i10 + 103) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m7424(boolean z10) {
            int i10 = f3261;
            int i11 = i10 + 37;
            f3265 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f3272 = z10;
                throw null;
            }
            this.f3272 = z10;
            int i12 = i10 + 47;
            f3265 = i12 % 128;
            if (i12 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7426(String str) {
            int i10 = (f3261 + 47) % 128;
            f3265 = i10;
            this.f3281 = str;
            int i11 = i10 + 35;
            f3261 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 15 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7430(String str) {
            int i10 = f3261 + 51;
            f3265 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f3278 = str;
                return this;
            }
            this.f3278 = str;
            int i11 = 65 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7417(boolean z10) {
            int i10 = f3261;
            int i11 = i10 + 65;
            f3265 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f3273 = z10;
                int i12 = i10 + 69;
                f3265 = i12 % 128;
                if (i12 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f3273 = z10;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m7420(boolean z10) {
            int i10 = f3261 + 59;
            f3265 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f3274 = z10;
                int i11 = 34 / 0;
                return this;
            }
            this.f3274 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7428(boolean z10) {
            int i10 = (f3261 + 3) % 128;
            f3265 = i10;
            this.f3280 = z10;
            int i11 = i10 + 43;
            f3261 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public c(JSONObject jSONObject) {
            m7415(jSONObject.optString(m7421("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0006\t\n\u0004\u0006u", KeyEvent.normalizeMetaState(0) + 15, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 16)).intern()));
            m7419(jSONObject.optString(m7421("\u0001\u0002\u0003\u0004\u0005\u0000\u0006\u0005\r\u000e\u0002\f\u008b", 12 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()));
            m7426(jSONObject.optString(m7421("\u000e\t\u0011\f\u0013\u0014\u0010\u0003\u000e\u0012", 10 - Drawable.resolveOpacity(0, 0), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27)).intern()));
            m7428(jSONObject.optBoolean(m7433(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((Process.getThreadPriority(0) + 20) >> 6), 16 - (Process.myTid() >> 22)).intern()));
            jSONObject.optBoolean(m7421("\u0014\t\n\u001c\u0005\u0016\f\u001e\u001d\r\u0010\n\u0007\b\u0004\u0005\u0014\u0015", KeyEvent.normalizeMetaState(0) + 18, (byte) (51 - TextUtils.indexOf("", ""))).intern());
            m7430(jSONObject.optString(m7421("\u0013\u001b\b\u0006\u001c\u0001\u001b\u0002É", MotionEvent.axisFromString("") + 10, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 82)).intern()));
            m7424(jSONObject.optBoolean(m7433(Color.argb(0, 0, 0, 0) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 10).intern()));
            m7432(jSONObject.optBoolean(m7421("\u001d\u000e\u0018\r\n\"\u0001\u0016\u0005\u0019§§\u001f \u0001\u0016\u001a\u000e", 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59)).intern()));
            m7420(jSONObject.optBoolean(m7421("\u001c\u0001\u000f\u0012\u001a\u0007\u0001!Û", 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (TextUtils.lastIndexOf("", '0') + 119)).intern()));
            m7417(jSONObject.optBoolean(m7421("\u0014\t\u0002\"\u0001\u001e\u0002\u0006\r\u0018\t\u0003«", 13 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (55 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), true));
            m7410(jSONObject.optBoolean(m7433(Gravity.getAbsoluteGravity(0, 0) + 26, (char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()));
            m7408(jSONObject.optBoolean(m7433(36 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 24).intern(), true));
            m7423(jz.m7088(jSONObject.optJSONArray(m7433((ViewConfiguration.getTouchSlop() >> 8) + 60, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - TextUtils.lastIndexOf("", '0', 0)).intern())));
            m7431(jz.m7088(jSONObject.optJSONArray(m7433(67 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 18 - ExpandableListView.getPackedPositionGroup(0L)).intern())));
            m7427(jz.m7088(jSONObject.optJSONArray(m7433((-16777131) - Color.rgb(0, 0, 0), (char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 13).intern())));
            m7416(jz.m7088(jSONObject.optJSONArray(m7421("\r\u0006\u0002\u0006\n\u0002\n\u000e\u0010#||\u0087", (Process.myPid() >> 22) + 13, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 23)).intern())));
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7432(boolean z10) {
            int i10 = (f3265 + 97) % 128;
            f3261 = i10;
            this.f3276 = z10;
            f3265 = (i10 + 73) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m7423(List<Integer> list) {
            if (list != null) {
                int i10 = f3265 + 39;
                f3261 = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f3267 = list;
                    int i11 = 74 / 0;
                } else {
                    this.f3267 = list;
                }
            }
            f3265 = (f3261 + 125) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m7427(List<String> list) {
            int i10 = f3265 + 107;
            int i11 = i10 % 128;
            f3261 = i11;
            if (i10 % 2 != 0) {
                if (list != null) {
                    this.f3271 = list;
                }
                int i12 = i11 + 103;
                f3265 = i12 % 128;
                if (i12 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m7421(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f3266;
                    char c10 = f3263;
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m7431(List<String> list) {
            int i10 = f3265;
            int i11 = i10 + 23;
            f3261 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (list != null) {
                int i12 = i10 + 3;
                f3261 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f3269 = list;
                    int i13 = 47 / 0;
                    return this;
                }
                this.f3269 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m7416(List<String> list) {
            int i10 = (f3265 + 57) % 128;
            f3261 = i10;
            if (list != null) {
                this.f3270 = list;
                f3265 = (i10 + 65) % 128;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m7433(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1677) {
                try {
                    char[] cArr = new char[i11];
                    d.f1676 = 0;
                    while (true) {
                        int i12 = d.f1676;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f3262[i10 + i12]) ^ (((long) i12) * f3264)) ^ ((long) c10));
                            d.f1676 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    z(JSONObject jSONObject, it itVar) {
        m7401(jSONObject, itVar);
        m7390();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ List m7383(z zVar) {
        int i10 = (f3236 + 111) % 128;
        f3235 = i10;
        List<View> list = zVar.f3239;
        int i11 = i10 + 17;
        f3236 = i11 % 128;
        if (i11 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ c m7387(z zVar) {
        int i10 = f3236 + 39;
        f3235 = i10 % 128;
        int i11 = i10 % 2;
        c cVar = zVar.f3241;
        if (i11 == 0) {
            return cVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ Map m7389(z zVar) {
        int i10 = f3236;
        f3235 = (i10 + 27) % 128;
        Map<View, View.OnLayoutChangeListener> map = zVar.f3240;
        f3235 = (i10 + 91) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ View.OnLayoutChangeListener m7393(z zVar) {
        int i10 = f3236;
        f3235 = (i10 + 125) % 128;
        View.OnLayoutChangeListener onLayoutChangeListener = zVar.f3244;
        f3235 = (i10 + 93) % 128;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Class m7397(z zVar) {
        int i10 = f3236;
        int i11 = i10 + 33;
        f3235 = i11 % 128;
        int i12 = i11 % 2;
        Class cls = zVar.f3238;
        if (i12 != 0) {
            throw null;
        }
        f3235 = (i10 + 27) % 128;
        return cls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7382() {
        int i10 = (f3236 + 71) % 128;
        f3235 = i10;
        f3236 = (i10 + 33) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7391(z zVar, List list) {
        f3236 = (f3235 + 101) % 128;
        zVar.m7385((List<View>) list);
        int i10 = f3235 + 39;
        f3236 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final void m7399() {
        m7339((r) null);
        ji.m6955().m6963(this.f3243);
        HashSet hashSet = new HashSet(this.f3240.keySet());
        this.f3240.clear();
        Iterator it = hashSet.iterator();
        int i10 = f3235 + 65;
        while (true) {
            f3236 = i10 % 128;
            if (!it.hasNext()) {
                return;
            }
            ((View) it.next()).removeOnLayoutChangeListener(this.f3244);
            i10 = f3235 + 105;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    protected final /* synthetic */ String mo4551(Activity activity) {
        f3235 = (f3236 + 69) % 128;
        String strM7382 = m7382();
        int i10 = f3236 + 11;
        f3235 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM7382;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m7401(JSONObject jSONObject, it itVar) {
        this.f3241 = new c(jSONObject);
        this.f3245 = itVar;
        int i10 = f3236 + 57;
        f3235 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m7385(List<View> list) {
        f3235 = (f3236 + 37) % 128;
        int i10 = 0;
        while (i10 < list.size()) {
            int i11 = f3236 + 47;
            f3235 = i11 % 128;
            if (i11 % 2 != 0) {
                m7388(list.get(i10), this.f3241);
                i10 += 81;
            } else {
                m7388(list.get(i10), this.f3241);
                i10++;
            }
        }
        f3236 = (f3235 + 19) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7390() {
        this.f3244 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.z.4

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f3253 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f3254 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f3255 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f3256 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3257 = {323, 342, 338, 356, 302, 337, 352, 309, 334, 347, 345, 351, 306, 348, 269, 313, 358, 354, 353, 304, 341, 340};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3258 = 237;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m7402(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f3257;
                        int i11 = f3258;
                        if (f3255) {
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
                        if (f3256) {
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = f3253 + 121;
                f3254 = i18 % 128;
                try {
                    if (i18 % 2 != 0) {
                        z.this.m7400(view);
                        throw null;
                    }
                    z.this.m7400(view);
                    f3254 = (f3253 + 107) % 128;
                } catch (Throwable th2) {
                    kd.m7160(m7402(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u008c\u0083\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7402(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0083\u0096\u008a\u0089\u0095\u0094\u0093\u0092\u008e\u0091\u0089\u0090\u008a\u008e\u008f\u008a\u0082\u008f\u008c\u008e\u008c\u008c\u008d").intern(), th2, false);
                }
            }
        };
        this.f3243 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.z.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4573(View view) {
                view.removeOnLayoutChangeListener(z.m7393(z.this));
                z.m7389(z.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4577(View view) {
                view.addOnLayoutChangeListener(z.m7393(z.this));
                z.m7389(z.this).put(view, z.m7393(z.this));
            }
        };
        ji.m6955().m6962(this.f3243);
        f3236 = (f3235 + 103) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m7395(Activity activity, View view, Class cls, boolean z10, List list, List list2, List list3) {
        f3236 = (f3235 + 57) % 128;
        m7384(activity, view, cls, z10, list, list2, list3);
        int i10 = f3235 + 43;
        f3236 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<WebView, Activity> m7396() {
        bb.e eVar = new bb.e() { // from class: com.ironsource.adqualitysdk.sdk.i.z.5
            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo5991(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo5991(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo5994(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo5994(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo4550(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo4550(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6000(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo6000(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo4555(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo4555(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo5992(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo5992(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo5997(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo5997(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6001(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo6001(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i10 = f3235 + 37;
        f3236 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m7400(final View view) {
        try {
            if (this.f3238 == null) {
                int i10 = f3236 + 119;
                f3235 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f3238 = Class.forName(c.m7434(this.f3241));
                    throw null;
                }
                this.f3238 = Class.forName(c.m7434(this.f3241));
            }
            final Activity activityMo6965 = jj.m6964().mo6965();
            if (activityMo6965 == null) {
                return;
            }
            if (!c.m7422(this.f3241).isEmpty()) {
                f3236 = (f3235 + 117) % 128;
                Activity activityM7178 = ke.m7178(view);
                if (activityM7178 != null) {
                    f3235 = (f3236 + 73) % 128;
                    if (c.m7422(this.f3241).contains(activityM7178.getClass().getName())) {
                        return;
                    }
                }
            }
            t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    z.m7383(z.this).clear();
                    z.m7395(activityMo6965, view, z.m7397(z.this), c.m7429(z.m7387(z.this)), c.m7418(z.m7387(z.this)), c.m7425(z.m7387(z.this)), z.m7383(z.this));
                    if (ke.m7173(view, z.m7397(z.this), null, c.m7418(z.m7387(z.this)), c.m7425(z.m7387(z.this)))) {
                        z.m7383(z.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(z.m7383(z.this));
                    if (c.m7414(z.m7387(z.this))) {
                        t.m7281(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo4564() {
                                z.m7391(z.this, arrayList);
                            }
                        });
                    } else {
                        z.m7391(z.this, arrayList);
                    }
                }
            });
        } catch (Throwable th2) {
            String strIntern = m7398(14 - TextUtils.getTrimmedLength(""), 285 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 12, "\u0001\u000b\ufffe￥\u0010\u0001\uffde\u0014\u0002\u0006\ufff3\u000f\u0002\t", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7398(19 - TextUtils.lastIndexOf("", '0'), AndroidCharacter.getMirror('0') + 233, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0015\u0006\b\uffc1\u0013\u0010\u0013\u0013￦\uffc1\u0014\u0014\u0002\r\u0004\uffc1\b\u000f\n\u0015", true).intern());
            sb2.append(c.m7434(this.f3241));
            sb2.append(m7398(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 222 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1, "￼￼\t", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
            m7399();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7398(int i10, int i11, int i12, String str, boolean z10) {
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
                    cArr2[b.f728] = (char) (b.f729 + i11);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f3237);
                    b.f728 = i14 + 1;
                }
                if (i12 > 0) {
                    b.f731 = i12;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <E extends View> void m7384(Activity activity, View view, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        int i10 = f3235 + 39;
        f3236 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (view != null) {
            ke.m7182(view, cls, false, z10, list, list2, list3);
            f3236 = (f3235 + 73) % 128;
        } else {
            ke.m7176(activity, cls, z10, list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m7392(View view) {
        int i10 = f3235 + 45;
        f3236 = i10 % 128;
        if (i10 % 2 != 0) {
            if (this.f3245 == null) {
                return true;
            }
            if (!m7386(view, c.m7407(this.f3241))) {
                return false;
            }
            int i11 = f3236 + 27;
            f3235 = i11 % 128;
            if (i11 % 2 == 0) {
                return this.f3245.mo5987(view);
            }
            this.f3245.mo5987(view);
            throw null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m7388(View view, c cVar) {
        if (m7392(view)) {
            if (c.m7411(cVar)) {
                int i10 = f3236 + 71;
                f3235 = i10 % 128;
                if (i10 % 2 == 0) {
                    if (this.f3242.get(view) == null) {
                        this.f3242.put(view, this);
                        mo4550(new JSONObject(), view, null);
                        int i11 = f3235 + 81;
                        f3236 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 8 / 0;
                            return;
                        }
                        return;
                    }
                    if (c.m7413(cVar)) {
                        mo4550(new JSONObject(), view, null);
                        return;
                    }
                    return;
                }
                this.f3242.get(view);
                throw null;
            }
            ArrayList<WebView> arrayList = new ArrayList();
            ke.m7182(view, WebView.class, false, c.m7429(cVar), c.m7418(cVar), c.m7425(cVar), arrayList);
            if (view instanceof WebView) {
                arrayList.add((WebView) view);
            }
            for (WebView webView : arrayList) {
                f3236 = (f3235 + 37) % 128;
                if (this.f3242.get(webView) == null && webView.getClass().getName().startsWith(c.m7412(cVar))) {
                    ab abVar = new ab();
                    this.f3246.put(webView, abVar);
                    abVar.m4549(c.m7409(cVar), TextUtils.isEmpty(c.m7403(cVar)) ? null : Arrays.asList(c.m7403(cVar).split(m7398((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 230 - Drawable.resolveOpacity(0, 0), 1 - KeyEvent.keyCodeFromString(""), "\u0000", false).intern())), c.m7404(cVar), c.m7405(cVar), c.m7406(cVar));
                    abVar.m7339(m7396());
                    abVar.m4552(webView);
                    abVar.m4553(Integer.toHexString(webView.hashCode()));
                    this.f3242.put(webView, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m7386(View view, List<String> list) {
        f3235 = (f3236 + 91) % 128;
        if (list == null || list.isEmpty()) {
            return true;
        }
        f3235 = (f3236 + 121) % 128;
        String name = view.getClass().getPackage().getName();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            f3235 = (f3236 + 71) % 128;
            String strM7394 = m7394(it.next());
            if (!TextUtils.isEmpty(strM7394)) {
                f3236 = (f3235 + 119) % 128;
                if (name.startsWith(strM7394)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7394(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List listAsList = Arrays.asList(str.split(m7398(TextUtils.indexOf((CharSequence) "", '0') + 4, (ViewConfiguration.getTouchSlop() >> 8) + 262, (ViewConfiguration.getScrollBarSize() >> 8) + 2, "￢\u000f\u0011", true).intern()));
        if (listAsList.size() > 3) {
            String strJoin = TextUtils.join(m7398(View.MeasureSpec.getMode(0) + 1, 232 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "\u0000", true).intern(), listAsList.subList(0, 3));
            f3236 = (f3235 + 113) % 128;
            return strJoin;
        }
        f3235 = (f3236 + 35) % 128;
        return str;
    }
}
