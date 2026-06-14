package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class kd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2991 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2992 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static WeakReference<az> f2993 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2994 = 44;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7160(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f2991 + 51;
        f2992 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m7167(str, str2, th2, z10, true);
            } else {
                m7167(str, str2, th2, z10, false);
            }
            int i11 = f2991 + 125;
            f2992 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 54 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7161(az azVar) {
        f2993 = new WeakReference<>(azVar);
        f2992 = (f2991 + 47) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7167(String str, String str2, Throwable th2, boolean z10, boolean z11) {
        f2992 = (f2991 + 41) % 128;
        try {
            m7168(str, str2, th2, z10, z11, false);
            f2991 = (f2992 + 9) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Throwable m7169(Throwable th2) {
        while (th2.getCause() != null) {
            int i10 = f2992 + 69;
            f2991 = i10 % 128;
            if (i10 % 2 == 0) {
                th2.getCause();
                throw null;
            }
            th2 = th2.getCause();
        }
        return th2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7163(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10) {
        int i10 = f2991 + 85;
        f2992 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m7170(str, str2, str3, th2, jSONObject, false, false, z10);
            } else {
                m7170(str, str2, str3, th2, jSONObject, true, false, z10);
            }
            f2991 = (f2992 + 29) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7168(String str, String str2, Throwable th2, boolean z10, boolean z11, boolean z12) {
        int i10 = f2992;
        f2991 = (i10 + 43) % 128;
        try {
            if (z10) {
                f2991 = (i10 + 3) % 128;
                k.m7116(str, str2, z12);
                if (th2 != null) {
                    int i11 = f2992 + 49;
                    f2991 = i11 % 128;
                    k.m7112(str, (i11 % 2 == 0 ? m7164("￤ￚ\u0013\f\t\u0001\u0014\u0005", 126 >>> Color.green(1), true, 0 / Color.argb(1, 1, 0, 1), (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 18229) : m7164("￤ￚ\u0013\f\t\u0001\u0014\u0005", 8 - Color.green(0), true, Color.argb(0, 0, 0, 0) + 1, 140 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern(), th2, z12);
                }
            } else {
                k.m7112(str, str2, th2, z12);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7164("\u0006\u0003\u0002\u0004\fￛ\ufff5\u0013\u0002\u0004", 10 - KeyEvent.getDeadChar(0, 0), false, 6 - (ViewConfiguration.getPressedStateDuration() >> 16), 139 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            sb2.append(str);
            m7170(str, str2, sb2.toString(), th2, null, false, z11, z12);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7162(String str, String str2, String str3, String str4) {
        f2991 = (f2992 + 97) % 128;
        try {
            m7165(str, str2, str3, str4);
            f2992 = (f2991 + 69) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7171(String str, String str2, String str3, Throwable th2, boolean z10) {
        f2991 = (f2992 + 57) % 128;
        try {
            m7170(str, str2, str3, th2, null, false, false, false);
            int i10 = f2992 + 71;
            f2991 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m7170(String str, String str2, String str3, Throwable th2, JSONObject jSONObject, boolean z10, boolean z11, boolean z12) {
        String str4;
        f2992 = (f2991 + 59) % 128;
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m7164("\u0000", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, Color.rgb(0, 0, 0) + 16777217, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 103).intern());
                sb2.append(str);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(m7164("\uffdfￗￗ\u001c\u001b&\u001a", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, true, 2 - TextUtils.getTrimmedLength(""), 117 - View.combineMeasuredStates(0, 0)).intern());
                sb3.append(string);
                sb3.append(m7164("\u0000", '1' - AndroidCharacter.getMirror('0'), true, -TextUtils.lastIndexOf("", '0'), 86 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
                k.m7112(str, sb3.toString(), th2, z12);
                f2992 = (f2991 + 63) % 128;
                str4 = string;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str3;
        }
        az azVar = f2993.get();
        if (azVar != null) {
            azVar.m5052(str, str2, str4, Log.getStackTraceString(th2), jSONObject, z11);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7166(String str, String str2, String str3, Throwable th2) {
        int i10 = f2992 + 17;
        f2991 = i10 % 128;
        int i11 = i10 % 2;
        try {
            m7171(str, str2, str3, th2, false);
            int i12 = f2992 + 121;
            f2991 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m7165(String str, String str2, String str3, String str4) {
        int i10;
        String string = "";
        try {
            if (TextUtils.isEmpty(str3)) {
                int i11 = f2991 + 107;
                f2992 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m7164("\u0000", 1 - Color.blue(0), true, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            sb2.append(str);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m7164("\f\u0017\u000bￃ￨\u0015\u0015\u0012\u0015ￃ\u001a", 10 - Process.getGidForName(""), false, 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777079) - Color.rgb(0, 0, 0)).intern());
            sb3.append(string2);
            sb3.append(m7164("\u0006\u0004\u0013\r\b\uffbfￍ\r\u000e\b\u0013\u0000\u0011", TextUtils.getCapsMode("", 0, 0) + 13, true, 6 - TextUtils.getTrimmedLength(""), Color.alpha(0) + 141).intern());
            k.m7116(str, sb3.toString(), false);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            if (str4 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m7164("\u0000", Color.alpha(0) + 1, true, Color.alpha(0) + 1, View.getDefaultSize(0, 0) + 54).intern());
                sb5.append(str4);
                string = sb5.toString();
                i10 = f2992 + 51;
            } else {
                i10 = f2992 + 109;
            }
            f2991 = i10 % 128;
            sb4.append(string);
            k.m7116(str, sb4.toString(), false);
            az azVar = f2993.get();
            if (azVar != null) {
                azVar.m5056(str, str2, string2, str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m7164(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2994);
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
