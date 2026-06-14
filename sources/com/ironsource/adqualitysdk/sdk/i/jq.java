package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jq {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2891 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2892 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f2897;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ao f2898;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2899;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2895 = {560015763, -1637534075, 358875218, -499087391, 267206748, -894947113, 1087370866, -1851623726, -1130539560, -1575727853, 652837420, -1455967352, 1272368776, -1203552935, 561813547, -477894532, 808745976, 1037421749};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2896 = 6590275788837649902L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2894 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2893 = 0;

    public jq(Context context, ao aoVar, long j10) {
        this.f2899 = context;
        this.f2898 = aoVar;
        this.f2897 = j10;
        new gq(context);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7000(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2896) ^ ((long) f2894)) ^ ((long) f2893));
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
    private static String m7001(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2895.clone();
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

    /* JADX INFO: renamed from: ﻛ */
    public JSONObject mo4692(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        char cAlpha;
        int touchSlop;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectM7082 = jz.m7082(jSONObject);
        jSONObjectM7082.put(m7001(new int[]{-1903688972, 807734697, 2093336317, -1136632161}, 6 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), this.f2898.m4758());
        String strM4752 = this.f2898.m4752();
        if (!TextUtils.isEmpty(strM4752)) {
            int i10 = f2892 + 33;
            f2891 = i10 % 128;
            if (i10 % 2 != 0) {
                cAlpha = (char) (12908 % Color.alpha(1));
                touchSlop = ViewConfiguration.getTouchSlop() * 83;
            } else {
                cAlpha = (char) (6985 - Color.alpha(0));
                touchSlop = ViewConfiguration.getTouchSlop() >> 8;
            }
            jSONObjectM7082.put(m7000("ﰹ涶哞鋓", cAlpha, "緮얆峩孵", touchSlop, "캨୮䦺谛").intern(), strM4752);
        }
        if (z11) {
            if (this.f2897 > 0) {
                jSONObjectM7082.put(m7001(new int[]{-37238834, -540492409}, 3 - TextUtils.lastIndexOf("", '0')).intern(), this.f2897);
                f2892 = (f2891 + 17) % 128;
            }
            jSONObjectM7082.put(m7000("\ue447䚖ṅ\udbd0ὖ", (char) (29087 - Color.blue(0)), "緮얆峩孵", (ViewConfiguration.getEdgeSlop() >> 16) - 322550831, "퇩왃鿬≱").intern(), this.f2898.m4761());
            jSONObjectM7082.put(m7000("ፅᕳ蝖", (char) (29735 - View.MeasureSpec.getMode(0)), "緮얆峩孵", Color.argb(0, 0, 0, 0) - 1490574273, "㽻➤➧♴").intern(), this.f2898.m4749());
            jSONObjectM7082.put(m7001(new int[]{-2001151772, 776393905}, 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), this.f2898.m4755());
            jSONObjectM7082.put(m7000("밹ﳀ", (char) (View.combineMeasuredStates(0, 0) + 44579), "緮얆峩孵", TextUtils.getCapsMode("", 0, 0), "\uf52d⇔⍚ឮ").intern(), this.f2898.m4751());
            jSONObjectM7082.put(m7000("ጦ쐔", (char) (ExpandableListView.getPackedPositionGroup(0L) + 14574), "緮얆峩孵", Color.argb(0, 0, 0, 0), "죱킲\ueee2⠸").intern(), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM7082.put(m7000("詠瑃灁ｯ\ude23", (char) (12824 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "緮얆峩孵", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 65810775, "坔\uec31᠃欲").intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM7082.put(m7000("睙", (char) (Color.rgb(0, 0, 0) + 16841250), "緮얆峩孵", 130645582 - (ViewConfiguration.getScrollBarSize() >> 8), "丮쥾∇ᗺ").intern(), jy.m7073());
            jSONObjectM7082.put(m7000("ꔆ곿斬霮\ue376", (char) (64322 - View.MeasureSpec.getSize(0)), "緮얆峩孵", 210847552 - Color.rgb(0, 0, 0), "䃷酇䈍퇻").intern(), Build.MODEL);
            jSONObjectM7082.put(m7001(new int[]{537788049, -557575313, 1711073744, -479079709, -257765739, -1899052793}, (ViewConfiguration.getTapTimeout() >> 16) + 12).intern(), Build.MANUFACTURER);
            jSONObjectM7082.put(m7000("\uf82a蘞\ued9d\udfc1뷍᪨\ue579\ue7f3", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "緮얆峩孵", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), "ǃ裡캏鲎").intern(), m7000("\ue1c1∀\udbf4ꊲ뙶愋疗", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "緮얆峩孵", (-919546004) - ImageFormat.getBitsPerPixel(0), "洗プ蛉ꉸ").intern());
            jSONObjectM7082.put(m7001(new int[]{-11691153, 81772996}, 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), jw.m7044());
            jy.m7076(this.f2899, jSONObjectM7082);
            jw.m7064(this.f2899, jSONObjectM7082);
            jw.m7056(this.f2899, jSONObjectM7082, z12);
            jw.m7057(jSONObjectM7082);
            jw.m7061(jSONObjectM7082);
            jSONObjectM7082.put(m7001(new int[]{-965784280, 1609581352}, 4 - TextUtils.getOffsetAfter("", 0)).intern(), z10);
            jw.m7050(this.f2899, jSONObjectM7082);
            jw.m7052(jSONObjectM7082);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f2898.m4748());
                jSONObject2.remove(m7000("싆ⷲ覇꜆\uef08儬‘\ude83둗퍖煚夜ﾨ", (char) (TextUtils.getTrimmedLength("") + 835), "緮얆峩孵", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1062258665, "ᣔ꼸䏀搃").intern());
                if (jSONObject2.length() > 0) {
                    jSONObjectM7082.putOpt(m7000("᛫뵏\ue82f\uf223", (char) (51451 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "緮얆峩孵", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "쪷ꤖﳿ\ue5c8").intern(), jSONObject2);
                    return jSONObjectM7082;
                }
            } catch (Exception e10) {
                k.m7118(m7001(new int[]{1190831468, 1593391752, -648804728, 1034087798, -1299263525, 428843720, 69590982, 1701559079, 1667928449, 1579499698, -1058709322, 111222535, 114763877, 1378412563}, TextUtils.indexOf((CharSequence) "", '0', 0) + 26).intern(), m7000("㱍訢믺휴巋마萁\udfbeၠ델礰䙊띊㍔⒜ꐳ⊼훘\uec8e㦄⩒墪탲㊭໔턖㦎\uf606㖫浍㌭퇹篌ẝ춵鎸", (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "緮얆峩孵", TextUtils.indexOf("", ""), "酚퇇ྏ࿋").intern(), e10);
            }
        }
        return jSONObjectM7082;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ao m7002() {
        int i10 = (f2892 + 103) % 128;
        f2891 = i10;
        ao aoVar = this.f2898;
        int i11 = i10 + 91;
        f2892 = i11 % 128;
        if (i11 % 2 != 0) {
            return aoVar;
        }
        throw null;
    }
}
