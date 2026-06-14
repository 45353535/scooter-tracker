package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ja {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2700 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2701 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2702 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2703 = {'C', 'a', 'c', 'h', 'e', 'S', 't', 'o', 'r', 'g', ' ', '(', ')', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final je f2704;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2705;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f2706;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f2707;

    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        void mo4677(List<jb> list);
    }

    public interface d {
        /* JADX INFO: renamed from: ﻐ */
        void mo4674(int i10);
    }

    public ja(String str, String str2, je jeVar) {
        this(str, str2, jeVar, (byte) 0);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6866(ja jaVar, String str) {
        f2701 = (f2700 + 9) % 128;
        String strM6872 = jaVar.m6872(str);
        f2701 = (f2700 + 85) % 128;
        return strM6872;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6869(ja jaVar) {
        f2700 = (f2701 + 9) % 128;
        String strM6868 = jaVar.m6868();
        f2701 = (f2700 + 37) % 128;
        return strM6868;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ int m6873(ja jaVar) {
        int i10 = f2701 + 43;
        f2700 = i10 % 128;
        return i10 % 2 != 0 ? 26738 : 10000;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ je m6874(ja jaVar) {
        int i10 = f2700 + 125;
        int i11 = i10 % 128;
        f2701 = i11;
        int i12 = i10 % 2;
        je jeVar = jaVar.f2704;
        if (i12 == 0) {
            throw null;
        }
        f2700 = (i11 + 45) % 128;
        return jeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m6876(final int i10, final a aVar) {
        je.m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2728 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2729 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f2730 = 5;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f2731 = {'*', 'p', 'o', 's', 't', 'D', 'a', 'u', 'i', 'd', 'C', 'c', 'h', 'e', 'S', 'r', 'g', 'l', 'n', '\'', ' ', 'v', '.', ':', '+'};

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4928(Throwable th2) {
                super.mo4928(th2);
                t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        aVar.mo4677(new ArrayList());
                    }
                });
                f2728 = (f2729 + 49) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                final ArrayList arrayList = new ArrayList();
                for (String str : ja.m6874(ja.this).m6928(ja.m6866(ja.this, m6882(C4240b4.j.f42672d, -ExpandableListView.getPackedPositionChild(0L), (byte) (ExpandableListView.getPackedPositionChild(0L) + 50)).intern()), i10).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        arrayList.add(new jb(jSONObject.getJSONObject(m6882("\u0002\u0003\u0004\u0000\u0006\u0007\u0001\t", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (byte) (View.getDefaultSize(0, 0) + 79)).intern()), jSONObject.optString(m6882("ÅÅ\t\u0005", View.getDefaultSize(0, 0) + 4, (byte) (79 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())));
                        f2729 = (f2728 + 69) % 128;
                    } catch (Exception unused) {
                        String strM6869 = ja.m6869(ja.this);
                        String strIntern = m6882("\u000b\u0005\f\r\u000e\n\u0000\u0003\u0010\u0005\u0012\u000b", 12 - Color.red(0), (byte) (TextUtils.getTrimmedLength("") + 51)).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m6882("\f\u0000\f\u0016\b\u0013\u0018\t\u0015\n\u0012\n\t\u0001\n\u0017\u0010\u000b\f\r\u000e\b\u0017\n\u0017\u000b\u0013\u0003\u0017\u0015\u0004\u0000\u0012\u0005\u0013\u0011\u0015\u0016\u0007\u0010\b\f\u0018\u0015", 44 - ExpandableListView.getPackedPositionGroup(0L), (byte) (3 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern());
                        sb2.append(str);
                        k.m7103(strM6869, strIntern, sb2.toString(), true);
                    }
                }
                t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        aVar.mo4677(arrayList);
                    }
                });
                f2728 = (f2729 + 73) % 128;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6882(String str, int i11, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f2731;
                        char c10 = f2730;
                        char[] cArr3 = new char[i11];
                        if (i11 % 2 != 0) {
                            i11--;
                            cArr3[i11] = (char) (cArr[i11] - b10);
                        }
                        if (i11 > 1) {
                            g.f2158 = 0;
                            while (true) {
                                int i12 = g.f2158;
                                if (i12 >= i11) {
                                    break;
                                }
                                g.f2157 = cArr[i12];
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
                                        int i13 = (g.f2156 * c10) + g.f2154;
                                        int i14 = (g.f2159 * c10) + g.f2152;
                                        int i15 = g.f2158;
                                        cArr3[i15] = cArr2[i13];
                                        cArr3[i15 + 1] = cArr2[i14];
                                    } else if (g.f2156 == g.f2159) {
                                        g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                        g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                        int i16 = (g.f2156 * c10) + g.f2154;
                                        int i17 = (g.f2159 * c10) + g.f2152;
                                        int i18 = g.f2158;
                                        cArr3[i18] = cArr2[i16];
                                        cArr3[i18 + 1] = cArr2[i17];
                                    } else {
                                        int i19 = (g.f2156 * c10) + g.f2152;
                                        int i20 = (g.f2159 * c10) + g.f2154;
                                        int i21 = g.f2158;
                                        cArr3[i21] = cArr2[i19];
                                        cArr3[i21 + 1] = cArr2[i20];
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
        });
        int i11 = f2701 + 91;
        f2700 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private ja(String str, String str2, je jeVar, byte b10) {
        this.f2707 = str2;
        this.f2706 = 10000;
        this.f2705 = str;
        this.f2704 = jeVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jb m6867(JSONObject jSONObject) {
        jb jbVar = new jb(jSONObject);
        f2700 = (f2701 + 69) % 128;
        return jbVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6871(jb jbVar) {
        int i10 = f2700 + 87;
        f2701 = i10 % 128;
        int i11 = i10 % 2;
        String strM6872 = m6872(jbVar.m6884());
        if (i11 == 0) {
            int i12 = 43 / 0;
        }
        f2701 = (f2700 + 103) % 128;
        return strM6872;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6875(ja jaVar, jb jbVar) {
        int i10 = f2700 + 81;
        f2701 = i10 % 128;
        int i11 = i10 % 2;
        String strM6871 = jaVar.m6871(jbVar);
        if (i11 == 0) {
            int i12 = 66 / 0;
        }
        return strM6871;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6877(final d dVar) {
        je.m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2708 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2711;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f2710 = {'*'};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f2709 = -6446053649878059917L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6880(int i10, char c10, int i11) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1677) {
                    try {
                        char[] cArr = new char[i11];
                        com.ironsource.adqualitysdk.sdk.i.d.f1676 = 0;
                        while (true) {
                            int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1676;
                            if (i12 < i11) {
                                cArr[i12] = (char) ((((long) f2710[i10 + i12]) ^ (((long) i12) * f2709)) ^ ((long) c10));
                                com.ironsource.adqualitysdk.sdk.i.d.f1676 = i12 + 1;
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
                final int iM6927 = ja.m6874(ja.this).m6927(ja.m6866(ja.this, m6880(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -TextUtils.lastIndexOf("", '0', 0)).intern()));
                t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        dVar.mo4674(iM6927);
                    }
                });
                f2708 = (f2711 + 105) % 128;
            }
        });
        int i10 = f2700 + 17;
        f2701 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6868() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6870("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0000\b\u0005\u000b\b", 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (96 - TextUtils.indexOf("", ""))).intern());
        sb2.append(this.f2705);
        sb2.append(m6870("\u009a", 1 - View.resolveSizeAndState(0, 0, 0), (byte) (113 - TextUtils.getTrimmedLength(""))).intern());
        String string = sb2.toString();
        f2700 = (f2701 + 121) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6872(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2707);
        sb2.append(str);
        String string = sb2.toString();
        int i10 = f2701 + 29;
        f2700 = i10 % 128;
        if (i10 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6878(final jb jbVar, final ir irVar) {
        je.m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static short[] f2716 = null;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f2717 = {-77, -66, 98, 106, 83, 103, 95, -123, 82, 97, 105, 102, -126, -33, -67, -86, -89, -76, -97, -5, 90, -81, -75, -14, 83, -64, -90, -9, 103, -86, -78, -101, -81, -89, -83, -1, 88, -69, -86, -13, 88, -7, 101, -71, -54, -49, -85, 105, -81, -85, -18, 89, -74, -11, 89, -74, -83, -64, -63, 8, 83, SignedBytes.MAX_POWER_OF_TWO, 61, 74, 53, -111, -5, 59, 71, 67, 71, 68, 96};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2718 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2719 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2720 = 983354943;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2721 = 78;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2722 = 541533712;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m6881(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (o.f3017) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f2721;
                        int i14 = i12 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f2717;
                            i14 = bArr != null ? (byte) (bArr[f2722 + i10] + i13) : (short) (f2716[f2722 + i10] + i13);
                        }
                        if (i14 > 0) {
                            o.f3018 = ((i10 + i14) - 2) + f2722 + i15;
                            o.f3019 = b10;
                            char c10 = (char) (i11 + f2720);
                            o.f3021 = c10;
                            sb2.append(c10);
                            o.f3020 = o.f3021;
                            o.f3022 = 1;
                            while (o.f3022 < i14) {
                                byte[] bArr2 = f2717;
                                if (bArr2 != null) {
                                    int i16 = o.f3018;
                                    o.f3018 = i16 - 1;
                                    o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                                } else {
                                    short[] sArr = f2716;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                f2718 = (f2719 + 27) % 128;
                if (ja.m6874(ja.this).m6927(ja.m6866(ja.this, m6881((-558310928) - Color.rgb(0, 0, 0), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 40), (-983354902) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 79).intern())) <= ja.m6873(ja.this)) {
                    String strM6875 = ja.m6875(ja.this, jbVar);
                    if (TextUtils.isEmpty(strM6875)) {
                        f2719 = (f2718 + 47) % 128;
                        k.m7103(ja.m6869(ja.this), m6881(KeyEvent.normalizeMetaState(0) - 541533711, (short) ((-100) - (Process.myTid() >> 22)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 983354877, (byte) KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) - 79).intern(), m6881((-541533699) - ExpandableListView.getPackedPositionType(0L), (short) (View.resolveSize(0, 0) + 84), (-983354859) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) - 79).intern(), true);
                        return;
                    } else {
                        try {
                            String string = jbVar.m6886().toString();
                            f2719 = (f2718 + 107) % 128;
                            k.m7111(ja.m6869(ja.this), m6881((-541533711) - TextUtils.indexOf("", "", 0), (short) (TextUtils.indexOf("", "", 0) - 100), (-983354876) - Color.alpha(0), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 79).intern(), m6881((-541533654) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((-66) - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) - 983354876, (byte) Color.blue(0), (-79) - (KeyEvent.getMaxKeyCode() >> 16)).intern(), string, true);
                            ja.m6874(ja.this).m6926(strM6875, string);
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                }
                ir irVar2 = irVar;
                if (irVar2 != null) {
                    t.m7288(irVar2);
                }
            }
        });
        int i10 = f2700 + 73;
        f2701 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6879(final jb jbVar) {
        je.m6918().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                ja.m6874(ja.this).m6922(ja.m6875(ja.this, jbVar));
            }
        });
        f2701 = (f2700 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6870(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f2703;
                char c10 = f2702;
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
