package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.y;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends y<Activity> implements jg {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f3120 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f3121 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f3122;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3123;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f3124;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3125;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3126;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f3127;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private a f3128;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3129;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3130;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3131;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f3132;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3133;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jg f3134;

    public class a extends y.c {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static short[] f3166 = null;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f3167 = 1;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static int f3168 = 0;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3169 = 1045909691;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f3170 = -595238911;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3172 = 115;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3173 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3174;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3175;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3176;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f3177;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static byte[] f3171 = {-101, -8, Ascii.FF, 19, -43, 5, Ascii.VT, -13, 13, -11, 17, 34, -35, 3, -106, Ascii.ESC, -46, Ascii.DC2, -4, 19, -12, -3, -18, -98, -11, -9, 37, -37, 5, Ascii.VT, -13, 13, -11, 17, 34, -51, 17, 2, -23, 19, -105, 17, -2, -5, -4, 37, -38, Ascii.ESC, -31, 9, -106, Ascii.SI, 3, 1, -13, 34, -28, -6, -3, -99, 6, 9, -4, -3, 41, -52, Ascii.DC2, -4, 19, -12, -3, Ascii.SO, -14, -14, -2, -97, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, -31, -3, Ascii.SO, -14, -14, -2, -105, 41, -23, -17, -2, -4, 51, -32, -14, -2, -106, 1, 4, Ascii.US, -30, Ascii.US, -33, 3, 4};

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private static char f3165 = 6;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static char[] f3164 = {'w', 'e', 'b', 'V', 'i', 'C', 'l', 'a', 's', 'N', 'm', 'P', 'r', 'f', 'x', 'c', 't', 'k', 'o', 'D', 'y', ',', 'u', 'W', 'H', 'h', 'J', 'v', 'p', 'M', 'I', 'n', 'T', 'g', 'z', '{'};

        public a(u uVar, JSONObject jSONObject) {
            int i10;
            List<String> listAsList;
            m7332(jSONObject.optString(m7328((short) ExpandableListView.getPackedPositionType(0L), (-1045909691) - KeyEvent.normalizeMetaState(0), Color.blue(0) - 116, 595239009 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) View.MeasureSpec.getMode(0)).intern()));
            m7325(jSONObject.optString(m7333((byte) (67 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0007\b¶¶\n\b\u0007\u0004\u0006\u0011\u0007\u0013\u0002\u0010", 22 - TextUtils.indexOf("", "")).intern()));
            m7331(jSONObject.optInt(m7328((short) TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1045909677, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 115, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 595239029, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), -1));
            m7323(jSONObject.optBoolean(m7328((short) (MotionEvent.axisFromString("") + 1), (-1062686884) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 117, 595239012 - Gravity.getAbsoluteGravity(0, 0), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern()));
            m7322(jSONObject.optBoolean(m7333((byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50), "\t\r\u0011\u0004\b\u0007\b\u0000\t\r\u000e\u000b\u0006\u0015\u0019\u0007\u0007\b«", 19 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
            m7376(jSONObject.optString(m7328((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1045909651) - TextUtils.indexOf("", ""), (-116) - TextUtils.indexOf("", ""), 595239017 - TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()));
            if (TextUtils.isEmpty(jSONObject.optString(m7328((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) - 1045909641, View.MeasureSpec.getMode(0) - 116, 595239027 - MotionEvent.axisFromString(""), (byte) ExpandableListView.getPackedPositionType(0L)).intern()))) {
                listAsList = null;
                i10 = 595239028;
            } else {
                i10 = 595239028;
                listAsList = Arrays.asList(jSONObject.optString(m7328((short) View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) - 1045909641, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 116, 595239028 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).split(m7333((byte) (TextUtils.indexOf("", "") + 69), CampaignEx.JSON_KEY_AD_Q, View.resolveSize(0, 0) + 1).intern()));
            }
            m7377(listAsList);
            m7378(jSONObject.optBoolean(m7333((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 105), "\u0014\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001\u0019\u0006\u0007\u001a", TextUtils.indexOf("", "", 0) + 14).intern()));
            m7381(jSONObject.optBoolean(m7333((byte) (110 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0014\n\u0002\u0019\t\u0019\b\t\u0010\r\n\"â", (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern(), true));
            m7374(!TextUtils.isEmpty(jSONObject.optString(m7328((short) (KeyEvent.getMaxKeyCode() >> 16), (-1045909651) - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + (-115), (ViewConfiguration.getPressedStateDuration() >> 16) + 595239017, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) || jSONObject.optBoolean(m7328((short) ((-1) - Process.getGidForName("")), MotionEvent.axisFromString("") + (-1045909631), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + (-117), i10 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getScrollBarSize() >> 8)).intern()) || jSONObject.optBoolean(m7328((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + (-1045909616), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + (-117), 595239027 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (Process.myTid() >> 22)).intern()));
            m7380(jSONObject.optBoolean(m7328((short) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1045909632, (-116) - (KeyEvent.getMaxKeyCode() >> 16), i10 - TextUtils.getOffsetAfter("", 0), (byte) Color.blue(0)).intern()));
            m7373(jSONObject.optBoolean(m7328((short) ExpandableListView.getPackedPositionType(0L), (-1045909599) - ((byte) KeyEvent.getModifierMetaStateMask()), Color.rgb(0, 0, 0) + 16777100, TextUtils.indexOf((CharSequence) "", '0') + 595239029, (byte) TextUtils.indexOf("", "", 0, 0)).intern()));
            m7375(jSONObject.optBoolean(m7333((byte) (Color.blue(0) + 125), "\u0014\n\u0005\u0019\u0012\n\u0016\n\u0018\n\u0005\u0013\u0002\u0003\u0004\u0005\u0002\u0001ð", 19 - TextUtils.indexOf("", "")).intern()));
            m7371(jSONObject.optBoolean(m7333((byte) (Color.red(0) + 80), "\u0010\u001c\n\f\n\"\u0007\u0000\u001f \n\u000e\r\u0001\r\u0003Ã", TextUtils.getTrimmedLength("") + 17).intern()));
            m7372(jSONObject.optBoolean(m7328((short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.red(0) - 1045909588, ExpandableListView.getPackedPositionChild(0L) - 115, 595239016 - ExpandableListView.getPackedPositionType(0L), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern()));
            m7379(jz.m7088(jSONObject.optJSONArray(m7333((byte) (TextUtils.lastIndexOf("", '0') + 113), "\u001c\u0003\u0002\u0001\u000e\u0002\u0018\u0000\" \u0018\u0012Õ", TextUtils.indexOf((CharSequence) "", '0', 0) + 14).intern())));
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private a m7322(boolean z10) {
            int i10 = f3167;
            this.f3173 = z10;
            f3168 = (i10 + 33) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private a m7323(boolean z10) {
            int i10 = f3168 + 73;
            int i11 = i10 % 128;
            f3167 = i11;
            if (i10 % 2 == 0) {
                this.f3175 = z10;
                throw null;
            }
            this.f3175 = z10;
            f3168 = (i11 + 79) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ boolean m7324(a aVar) {
            int i10 = f3168;
            f3167 = (i10 + 99) % 128;
            boolean z10 = aVar.f3175;
            int i11 = i10 + 37;
            f3167 = i11 % 128;
            if (i11 % 2 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ boolean m7326(a aVar) {
            int i10 = f3167;
            int i11 = i10 + 39;
            f3168 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = aVar.f3173;
            if (i12 != 0) {
                throw null;
            }
            f3168 = (i10 + 67) % 128;
            return z10;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static /* synthetic */ String m7327(a aVar) {
            int i10 = f3168 + 43;
            int i11 = i10 % 128;
            f3167 = i11;
            int i12 = i10 % 2;
            String str = aVar.f3174;
            if (i12 == 0) {
                throw null;
            }
            int i13 = i11 + 59;
            f3168 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 77 / 0;
            }
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ String m7329(a aVar) {
            int i10 = (f3167 + 73) % 128;
            f3168 = i10;
            String str = aVar.f3176;
            int i11 = i10 + 79;
            f3167 = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static /* synthetic */ int m7330(a aVar) {
            int i10 = (f3168 + 19) % 128;
            f3167 = i10;
            int i11 = aVar.f3177;
            int i12 = i10 + 31;
            f3168 = i12 % 128;
            if (i12 % 2 == 0) {
                return i11;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m7325(String str) {
            int i10 = f3168 + 55;
            f3167 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f3176 = str;
                return this;
            }
            this.f3176 = str;
            int i11 = 32 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m7328(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f3172;
                    int i14 = i11 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f3171;
                        i14 = bArr != null ? (byte) (bArr[f3169 + i10] + i13) : (short) (f3166[f3169 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f3169 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i12 + f3170);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f3171;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f3166;
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
        private a m7332(String str) {
            int i10 = f3168 + 87;
            f3167 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f3174 = str;
                return this;
            }
            this.f3174 = str;
            int i11 = 26 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m7331(int i10) {
            int i11 = (f3167 + 49) % 128;
            f3168 = i11;
            this.f3177 = i10;
            f3167 = (i11 + 41) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m7333(byte b10, String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2153) {
                try {
                    char[] cArr2 = f3164;
                    char c10 = f3165;
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
    }

    static {
        m7295();
        f3127 = m7306((short) (TextUtils.indexOf("", "") - 101), View.resolveSizeAndState(0, 0, 0) + 1587075894, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 88, (-829340426) - (KeyEvent.getMaxKeyCode() >> 16), (byte) View.MeasureSpec.getMode(0)).intern();
        int i10 = f3123 + 87;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    u(JSONObject jSONObject, is isVar) {
        super(isVar);
        this.f3131 = false;
        this.f3133 = false;
        this.f3129 = false;
        this.f3130 = false;
        m7320(jSONObject);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ String m7290() {
        int i10 = f3121;
        String str = f3127;
        f3123 = (i10 + 121) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m7292(u uVar) {
        int i10 = f3121 + 45;
        f3123 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = uVar.f3129;
        if (i11 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private jg m7293() {
        int i10 = f3121;
        jg jgVar = this.f3134;
        int i11 = i10 + 45;
        f3123 = i11 % 128;
        if (i11 % 2 == 0) {
            return jgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    static void m7295() {
        f3126 = -1587075845;
        f3125 = 87;
        f3124 = 829340525;
        f3120 = new byte[]{-70, -115, 121, -120, 118, -115, -103, 100, -93, 72, -123, -117, 115, -115, 117, -111, -94, -55, 61, 35, 86, 83, 96, -95, 8, 82, -85, 19, 77, 96, 105, 54, 92, 120, 54, 98, -101, Ascii.DLE, 80, 92, 92, 87, 90, -104, 5, 90, 84, 87, -124, -48, 92, 109, 108, 122, 84, -120, 120, 40, 108, 86, -86, 40, 108, 86, 95, 106, 112, 98, 112, 81, 105, 114, 104, -104, 46, 103, 86, 98, 107, 97, 106, 100, 98, 110, -96, 38, 99, 113};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Class m7296(u uVar, Class cls) {
        int i10 = (f3123 + 89) % 128;
        f3121 = i10;
        uVar.f3132 = cls;
        int i11 = i10 + 79;
        f3123 = i11 % 128;
        if (i11 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ a m7300(u uVar) {
        int i10 = (f3121 + 125) % 128;
        f3123 = i10;
        a aVar = uVar.f3128;
        f3121 = (i10 + 87) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7308() {
        int i10 = (f3123 + 27) % 128;
        f3121 = i10;
        int i11 = i10 + 31;
        f3123 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m7302(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).onActivityCreated(activity, bundle);
                    u.m7308();
                    u.m7301(u.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        u.m7305(u.this, false);
                        return;
                    }
                    u.m7305(u.this, bundle2.getBoolean(u.m7290()));
                    if (u.m7309(u.this)) {
                        u.m7301(u.this, true);
                    }
                    u.m7310(u.this, true);
                }
            }
        });
        f3121 = (f3123 + 99) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m7302(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            u.m7311(u.this).onActivityDestroyed(activity);
                        }
                    });
                    if (u.m7297(u.this) && u.m7309(u.this) && activity.isFinishing()) {
                        u.this.m7318(activity);
                    }
                }
            }
        });
        f3121 = (f3123 + 19) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).onActivityPaused(activity);
                }
            }
        });
        int i10 = f3121 + 105;
        f3123 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m7302(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            u.m7311(u.this).onActivityResumed(activity);
                        }
                    });
                    u.m7298(u.this, false);
                    u.m7301(u.this, true);
                    if ((!u.m7309(u.this) || u.m7303(u.this)) && !activity.isFinishing()) {
                        u uVar = u.this;
                        Activity activity2 = activity;
                        uVar.m7316(activity2, u.m7312(activity2));
                    }
                    u.m7310(u.this, false);
                }
            }
        });
        int i10 = f3123 + 119;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m7302(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(u.m7290(), u.m7309(u.this));
                    }
                    u.m7298(u.this, true);
                }
            }
        });
        f3121 = (f3123 + 79) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).onActivityStarted(activity);
                }
            }
        });
        f3123 = (f3121 + 121) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m7302(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.9.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            u.m7311(u.this).onActivityStopped(activity);
                        }
                    });
                    if (u.m7297(u.this) && !u.m7292(u.this) && activity.isFinishing()) {
                        u.this.m7318(activity);
                    }
                }
            }
        });
        int i10 = f3123 + 99;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final /* synthetic */ void mo7317(Activity activity, String str) {
        f3123 = (f3121 + 61) % 128;
        m7316(activity, str);
        int i10 = f3121 + 125;
        f3123 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    final /* synthetic */ View mo4579(Activity activity) {
        int i10 = f3121 + 17;
        f3123 = i10 % 128;
        Activity activity2 = activity;
        if (i10 % 2 != 0) {
            m7299(activity2);
            throw null;
        }
        View viewM7299 = m7299(activity2);
        f3121 = (f3123 + 107) % 128;
        return viewM7299;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.u.a.m7324(r3.f3128) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.u.f3121 = (com.ironsource.adqualitysdk.sdk.i.u.f3123 + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r3.f3132.equals(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3.f3132.isAssignableFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.u.a.m7324(r3.f3128) != false) goto L11;
     */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m7291(android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r0 = r3.f3132
            r1 = 0
            if (r0 == 0) goto L3e
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3123
            int r0 = r0 + 123
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3121 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L20
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3128
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m7324(r0)
            r2 = 4
            int r2 = r2 / r1
            if (r0 == 0) goto L37
            goto L28
        L20:
            com.ironsource.adqualitysdk.sdk.i.u$a r0 = r3.f3128
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.u.a.m7324(r0)
            if (r0 == 0) goto L37
        L28:
            int r0 = com.ironsource.adqualitysdk.sdk.i.u.f3123
            int r0 = r0 + 35
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3121 = r0
            java.lang.Class r0 = r3.f3132
            boolean r4 = r0.equals(r4)
            return r4
        L37:
            java.lang.Class r0 = r3.f3132
            boolean r4 = r0.isAssignableFrom(r4)
            return r4
        L3e:
            int r4 = com.ironsource.adqualitysdk.sdk.i.u.f3121
            int r4 = r4 + 83
            int r0 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.u.f3123 = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L4d
            r4 = 34
            int r4 = r4 / r1
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.u.m7291(android.app.Activity):boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m7294(Activity activity) {
        f3123 = (f3121 + 71) % 128;
        String hexString = Integer.toHexString(activity.hashCode());
        f3121 = (f3123 + 103) % 128;
        return hexString;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m7303(u uVar) {
        int i10 = f3121 + 89;
        f3123 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = uVar.f3130;
        if (i11 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7309(u uVar) {
        int i10 = f3123 + 11;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = uVar.f3131;
        if (i11 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ jg m7311(u uVar) {
        f3123 = (f3121 + 7) % 128;
        jg jgVarM7293 = uVar.m7293();
        f3123 = (f3121 + 65) % 128;
        return jgVarM7293;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ */
    final /* synthetic */ void mo4574(Activity activity, List list) {
        int i10 = f3123 + 43;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        m7307(activity, (List<WebView>) list);
        if (i11 == 0) {
            int i12 = 81 / 0;
        }
        f3121 = (f3123 + 75) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final /* synthetic */ void mo7315(Activity activity) {
        f3121 = (f3123 + 11) % 128;
        m7318(activity);
        int i10 = f3123 + 33;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m7297(u uVar) {
        int i10 = (f3123 + 111) % 128;
        f3121 = i10;
        boolean z10 = uVar.f3133;
        int i11 = i10 + 17;
        f3123 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m7301(u uVar, boolean z10) {
        int i10 = f3123 + 125;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        uVar.f3133 = z10;
        if (i11 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m7304(u uVar, Activity activity) {
        int i10 = f3123 + 43;
        f3121 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM7291 = uVar.m7291(activity);
        if (i11 == 0) {
            int i12 = 56 / 0;
        }
        return zM7291;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7310(u uVar, boolean z10) {
        int i10 = (f3123 + 117) % 128;
        f3121 = i10;
        uVar.f3130 = z10;
        f3123 = (i10 + 103) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    static /* synthetic */ String m7312(Activity activity) {
        f3121 = (f3123 + 51) % 128;
        String strM7294 = m7294(activity);
        f3123 = (f3121 + 117) % 128;
        return strM7294;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m7298(u uVar, boolean z10) {
        int i10 = f3123;
        int i11 = i10 + 53;
        f3121 = i11 % 128;
        int i12 = i11 % 2;
        uVar.f3129 = z10;
        if (i12 == 0) {
            throw null;
        }
        f3121 = (i10 + 35) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m7305(u uVar, boolean z10) {
        int i10 = (f3123 + 51) % 128;
        f3121 = i10;
        uVar.f3131 = z10;
        f3123 = (i10 + 107) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m7307(Activity activity, List<WebView> list) {
        int i10 = f3121 + 17;
        f3123 = i10 % 128;
        if (i10 % 2 != 0) {
            ke.m7175(activity, WebView.class, a.m7330(this.f3128), a.m7329(this.f3128), true, false, null, this.f3128.f3233, list);
        } else {
            ke.m7175(activity, WebView.class, a.m7330(this.f3128), a.m7329(this.f3128), false, false, null, this.f3128.f3233, list);
        }
        int i11 = f3123 + 69;
        f3121 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 9 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m7314() {
        f3121 = (f3123 + 71) % 128;
        m7339((r) null);
        m7319((jg) null);
        jj.m6964().m6966(this);
        int i10 = f3123 + 33;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m7320(JSONObject jSONObject) {
        a aVar = new a(this, jSONObject);
        m7357(aVar);
        this.f3128 = aVar;
        t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f3144 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3146;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3145 = {'A', 2420, 4698, 6956, 9258, 11546, 14078, 16344, 18681, 20907, 23214, 25500, 28026, 30287, 32558, 34876, 37122, 'E', 2405, 4700, 6954, 9262, 11603, 14054, 16328, 18635, 20923, 23171, 25491, 28029, 30277, 32549, 34937, 37124, 39656, 41918, 44240, 46522, 48774, 51092, 53605, 55899, 58143, 60473, 62731, 65188, 19265, 16972};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f3143 = 3863225799229114647L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m7321(char c10, int i10, int i11) {
                String str;
                synchronized (d.f1677) {
                    try {
                        char[] cArr = new char[i10];
                        d.f1676 = 0;
                        while (true) {
                            int i12 = d.f1676;
                            if (i12 < i10) {
                                cArr[i12] = (char) ((((long) f3145[i11 + i12]) ^ (((long) i12) * f3143)) ^ ((long) c10));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                try {
                    u uVar = u.this;
                    u.m7296(uVar, Class.forName(a.m7327(u.m7300(uVar))));
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            u.this.m7313();
                        }
                    });
                    f3144 = (f3146 + 57) % 128;
                } catch (ClassNotFoundException e10) {
                    String strIntern = m7321((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 16 - Process.getGidForName(""), KeyEvent.keyCodeFromString("")).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m7321((char) Drawable.resolveOpacity(0, 0), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 16 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                    sb2.append(a.m7327(u.m7300(u.this)));
                    sb2.append(m7321((char) ((ViewConfiguration.getTouchSlop() >> 8) + 19323), (ViewConfiguration.getEdgeSlop() >> 16) + 2, 46 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                    sb2.append(e10.getLocalizedMessage());
                    k.m7098(strIntern, sb2.toString());
                }
            }
        });
        f3123 = (f3121 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m7313() {
        f3123 = (f3121 + 19) % 128;
        jj.m6964().m6967(this);
        f3123 = (f3121 + 25) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ */
    final r<WebView, Activity> mo4578() {
        int i10 = f3121 + 79;
        f3123 = i10 % 128;
        if (i10 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final void m7318(Activity activity) {
        f3121 = (f3123 + 91) % 128;
        super.mo7315(activity);
        this.f3131 = false;
        int i10 = f3121 + 61;
        f3123 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ﻐ */
    public final void mo4672(final Activity activity) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).mo4672(activity);
                }
            }
        });
        int i10 = f3123 + 103;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jg
    /* JADX INFO: renamed from: ｋ */
    public final void mo4673(final Activity activity) {
        t.m7283(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                if (u.m7304(u.this, activity)) {
                    u.m7311(u.this).mo4673(activity);
                }
            }
        });
        int i10 = f3123 + 85;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m7302(ir irVar) {
        f3121 = (f3123 + 33) % 128;
        if (!a.m7326(this.f3128)) {
            t.m7281(irVar);
            return;
        }
        f3121 = (f3123 + 71) % 128;
        t.m7288(irVar);
        int i10 = f3123 + 9;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m7299(Activity activity) {
        f3123 = (f3121 + 9) % 128;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i10 = f3123 + 69;
        f3121 = i10 % 128;
        if (i10 % 2 != 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7306(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f3125;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f3120;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f3126 + i10] + i13);
                    } else {
                        i14 = (short) (f3122[f3126 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f3126 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i12 + f3124);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f3120;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f3122;
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
    public final void m7319(jg jgVar) {
        int i10 = f3121 + 73;
        f3123 = i10 % 128;
        int i11 = i10 % 2;
        this.f3134 = jgVar;
        if (i11 != 0) {
            int i12 = 5 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ */
    final aa mo4580() {
        ab abVar = new ab();
        int i10 = f3123 + 49;
        f3121 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 96 / 0;
        }
        return abVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: avoid collision after fix types in other method and contains not printable characters */
    final void m7316(Activity activity, String str) {
        f3123 = (f3121 + 57) % 128;
        if (!this.f3131) {
            this.f3131 = true;
            super.mo7317(activity, str);
            int i10 = f3121 + 19;
            f3123 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ih.f2516, true);
        } catch (JSONException e10) {
            String strIntern = m7306((short) ((-128) - Drawable.resolveOpacity(0, 0)), View.resolveSize(0, 0) + 1587075845, TextUtils.getOffsetBefore("", 0) - 88, (-829340460) - Color.green(0), (byte) View.MeasureSpec.getSize(0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7306((short) ((ViewConfiguration.getScrollBarSize() >> 8) - 87), 1587075862 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 88, (-829340456) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) View.combineMeasuredStates(0, 0)).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
        }
        super.m7358(jSONObject, activity, str);
    }
}
