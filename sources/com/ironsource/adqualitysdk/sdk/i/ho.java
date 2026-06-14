package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.adqualitysdk.sdk.i.hp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ho extends hp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2387;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<Class> f2388 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2389;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Class f2390;

    public ho() {
        super.mo6566();
        this.f2390 = null;
        this.f2387 = 0;
        this.f2389 = true;
        this.f2388.clear();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6561() {
        return this.f2389;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m6562() {
        return this.f2387;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m6563() {
        return this.f2390;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m6564() {
        return this.f2388;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6565(Class cls) {
        this.f2390 = cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    protected final void mo6566() {
        super.mo6566();
        this.f2390 = null;
        this.f2387 = 0;
        this.f2389 = true;
        this.f2388.clear();
    }

    public static class a extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2391 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2392 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f2393 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2394 = {5, 42, -39, -1, Ascii.VT, -57, 51, 41, 43, -7, 60, -45, 46, 2, -51, 58, -59, 62, -31, Ascii.DC4, -59, 60, 58, 10, Ascii.FF, Ascii.SO, -36, Ascii.EM, -24, -5, Ascii.DLE, -54, 42, -6, -48, 39, -4, 8, -24, 5, Ascii.VT, 13, -4, Ascii.DC2, -12, -12, 8, -40, 39, -26, Ascii.FS, -4, -16, 1, -2, 0, -8, 8, -33, Ascii.DC4, -3, -2, 13, -97, 113, -105, -105, 117, -83, 72, -123, Ascii.DEL, -97, -109, 98, -99, 99, -101, 107, -68, 119, -98, -99, 10, -126, -112, 119, -117, 115, -113, 119, 121, -96, 103, -89, 99, -121, 115, -109, 126, 112, 7, -52, 60, 62, 56, 33, -27, 36, -48, -54, -56, Ascii.SUB, -49, Utf8.REPLACEMENT_BYTE, 60, -3, SignedBytes.MAX_POWER_OF_TWO, -67, 65, -68, -3, -78, 73, -66, 89};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2395 = -661123836;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2396 = 8;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2397 = 1533351683;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ho f2398 = new ho();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m6567(int i10) {
            f2392 = (f2391 + 95) % 128;
            this.f2398.f2387 = i10;
            int i11 = f2391 + 95;
            f2392 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6572(boolean z10) {
            f2392 = (f2391 + 53) % 128;
            this.f2398.f2389 = z10;
            int i10 = f2392 + 25;
            f2391 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final a m6573(int i10) {
            int i11 = (f2392 + 57) % 128;
            f2391 = i11;
            ho hoVar = this.f2398;
            hoVar.f2399 = i10 | hoVar.f2399;
            int i12 = i11 + 27;
            f2392 = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m6575(Class cls) {
            f2392 = (f2391 + 35) % 128;
            this.f2398.f2390 = cls;
            int i10 = f2391 + 91;
            f2392 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m6568(boolean z10, int i10) {
            int i11 = f2392 + 15;
            f2391 = i11 % 128;
            if (i11 % 2 != 0) {
                ho hoVar = this.f2398;
                hoVar.f2400 = z10;
                hoVar.f2402 = i10;
                int i12 = 18 / 0;
                return this;
            }
            ho hoVar2 = this.f2398;
            hoVar2.f2400 = z10;
            hoVar2.f2402 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6571(Class cls) {
            int i10 = f2391 + 79;
            f2392 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2398.f2388.add(cls);
                int i11 = f2392 + 107;
                f2391 = i11 % 128;
                if (i11 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f2398.f2388.add(cls);
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo5100(String str, List<Object> list, ch chVar) {
            byte b10;
            int iIntValue = -1;
            switch (str.hashCode()) {
                case -1347544616:
                    if (!str.equals(m6569((KeyEvent.getMaxKeyCode() >> 16) + 661123859, (short) View.MeasureSpec.getSize(0), (-1533351568) - View.getDefaultSize(0, 0), (byte) (TextUtils.indexOf("", "") - 7), (-9) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        f2392 = (f2391 + 45) % 128;
                        b10 = 2;
                    }
                    break;
                case -923635536:
                    b10 = !str.equals(m6569(661123835 - TextUtils.indexOf((CharSequence) "", '0'), (short) TextUtils.getCapsMode("", 0, 0), (-1533351568) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (TextUtils.indexOf("", "", 0) - 36), (-9) - View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 0;
                    break;
                case -216533736:
                    if (!str.equals(m6569(661123849 - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getTapTimeout() >> 16), (-1550128784) - Color.rgb(0, 0, 0), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 62), (-9) - Drawable.resolveOpacity(0, 0)).intern())) {
                        b10 = -1;
                    } else {
                        f2391 = (f2392 + 69) % 128;
                        b10 = 1;
                    }
                    break;
                case 94094958:
                    if (!str.equals(m6569(((Process.getThreadPriority(0) + 20) >> 6) + 661123957, (short) (AndroidCharacter.getMirror('0') - '0'), (-1533351585) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0L) + 75), Color.alpha(0) - 9).intern())) {
                        b10 = -1;
                    } else {
                        f2391 = (f2392 + 97) % 128;
                        b10 = 8;
                    }
                    break;
                case 108404047:
                    b10 = !str.equals(m6569((ViewConfiguration.getLongPressTimeout() >> 16) + 661123952, (short) (Process.myPid() >> 22), (-1533351569) - TextUtils.indexOf("", ""), (byte) (KeyEvent.keyCodeFromString("") + 79), (-10) - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case 387034026:
                    if (!str.equals(m6569(661123920 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) TextUtils.getTrimmedLength(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1533351568, (byte) (TextUtils.indexOf("", "", 0, 0) - 126), (-9) - TextUtils.indexOf("", "")).intern())) {
                        b10 = -1;
                    } else {
                        f2391 = (f2392 + 41) % 128;
                        b10 = 5;
                    }
                    break;
                case 391966482:
                    b10 = !str.equals(m6569(661123877 - Color.green(0), (short) TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1533351587, (byte) ((-3) - (KeyEvent.getMaxKeyCode() >> 16)), (-9) - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? (byte) -1 : (byte) 3;
                    break;
                case 1067445448:
                    if (!str.equals(m6569((ViewConfiguration.getEdgeSlop() >> 16) + 661123937, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1533351585) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (TextUtils.getTrimmedLength("") + 63), View.resolveSizeAndState(0, 0, 0) - 9).intern())) {
                        b10 = -1;
                    } else {
                        f2392 = (f2391 + 59) % 128;
                        b10 = 6;
                    }
                    break;
                case 1423210564:
                    if (!str.equals(m6569(661123897 - ExpandableListView.getPackedPositionChild(0L), (short) View.MeasureSpec.getSize(0), (-1533351587) - TextUtils.lastIndexOf("", '0'), (byte) ((-98) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.normalizeMetaState(0) - 9).intern())) {
                        b10 = -1;
                    } else {
                        f2391 = (f2392 + 59) % 128;
                        b10 = 4;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return m6575((Class) cz.m6139(list, 0, Class.class));
                case 1:
                    return m6567(((Integer) cz.m6139(list, 0, Integer.class)).intValue());
                case 2:
                    return m6572(((Boolean) cz.m6139(list, 0, Boolean.class)).booleanValue());
                case 3:
                    return m6574(((Integer) cz.m6139(list, 0, Integer.class)).intValue());
                case 4:
                    return m6573(((Integer) cz.m6139(list, 0, Integer.class)).intValue());
                case 5:
                    boolean zBooleanValue = ((Boolean) cz.m6139(list, 0, Boolean.class)).booleanValue();
                    if (list.size() > 1) {
                        int i10 = f2391 + 7;
                        f2392 = i10 % 128;
                        int i11 = i10 % 2;
                        iIntValue = ((Integer) cz.m6139(list, 1, Integer.class)).intValue();
                    }
                    return m6568(zBooleanValue, iIntValue);
                case 6:
                    return m6571((Class) cz.m6139(list, 0, Class.class));
                case 7:
                    return m6570();
                case 8:
                    ho hoVarM6576 = m6576();
                    int i12 = f2391 + 53;
                    f2392 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 41 / 0;
                    }
                    return hoVarM6576;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m6574(int i10) {
            ho hoVar;
            int i11;
            int i12 = f2391 + 3;
            f2392 = i12 % 128;
            if (i12 % 2 == 0) {
                hoVar = this.f2398;
                i11 = i10 ^ hoVar.f2401;
            } else {
                hoVar = this.f2398;
                i11 = i10 | hoVar.f2401;
            }
            hoVar.f2401 = i11;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m6576() {
            int i10 = f2391;
            int i11 = i10 + 15;
            f2392 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            ho hoVar = this.f2398;
            f2392 = (i10 + 105) % 128;
            return hoVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m6570() {
            f2391 = (f2392 + 33) % 128;
            this.f2398.mo6566();
            int i10 = f2392 + 45;
            f2391 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6569(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2396;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2394;
                        if (bArr != null) {
                            i14 = (byte) (bArr[f2395 + i10] + i13);
                        } else {
                            i14 = (short) (f2393[f2395 + i10] + i13);
                        }
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f2395 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i11 + f2397);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f2394;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f2393;
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
}
