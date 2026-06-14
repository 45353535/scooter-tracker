package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3113 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3114 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3115;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3116;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Handler f3117;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Handler f3118;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f3119;

    static {
        m7287();
        f3117 = new Handler(Looper.getMainLooper());
        f3118 = m7280();
        int i10 = f3113 + 31;
        f3114 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7279(ir irVar) {
        f3114 = (f3113 + 73) % 128;
        if (!m7285()) {
            irVar.run();
            f3114 = (f3113 + 67) % 128;
        } else {
            f3114 = (f3113 + 101) % 128;
            m7283(irVar);
            f3113 = (f3114 + 65) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7281(ir irVar) {
        int i10 = f3114 + 55;
        f3113 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m7289().post(irVar);
            } else {
                m7289().post(irVar);
                throw null;
            }
        } catch (Error unused) {
            k.m7116(m7286((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), m7286((char) (64347 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "㪢얫\ue410\udca9下᠅梨을\ue080\uf5d5\udcbd\udfde瞏篢ꈤ곅\ue9faℏ籌䣙\uf8a0蒧☠䛡茮唦戸ݾ뗾", "ꀴ\uf8de寊\uddfb", "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) - 889659743).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7283(ir irVar) {
        f3114 = (f3113 + 111) % 128;
        try {
            m7278().post(irVar);
            int i10 = f3113 + 103;
            f3114 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Error unused) {
            k.m7116(m7286((char) View.resolveSizeAndState(0, 0, 0), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m7286((char) (ViewConfiguration.getScrollBarSize() >> 8), "\u07b7嬻⳯ხ徖眫侀ȅ巀댮◑皒ꉞ\ue407䶉Ĉ㰂\uf10e\udb4e➳\ue6e0⯶≑Ἲ·⇳ﴴ㏓菙낫拪湐\u0adf\uf2c1災螵", "\uf7f7\uf418赙߸", "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "")).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m7287() {
        f3116 = 0L;
        f3119 = 0;
        f3115 = (char) 35452;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m7289() {
        int i10 = (f3114 + 91) % 128;
        f3113 = i10;
        Handler handler = f3117;
        int i11 = i10 + 41;
        f3114 = i11 % 128;
        if (i11 % 2 != 0) {
            return handler;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7288(ir irVar) {
        int i10 = f3114 + 57;
        f3113 = i10 % 128;
        if (i10 % 2 != 0) {
            m7285();
            throw null;
        }
        if (m7285()) {
            irVar.run();
            return;
        }
        m7281(irVar);
        int i11 = f3114 + 59;
        f3113 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7282(ir irVar, long j10) {
        f3113 = (f3114 + 111) % 128;
        try {
            m7289().postDelayed(irVar, j10);
            int i10 = f3114 + 99;
            f3113 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 96 / 0;
            }
        } catch (Error unused) {
            k.m7116(m7286((char) KeyEvent.getDeadChar(0, 0), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", Color.alpha(0)).intern(), m7286((char) (AndroidCharacter.getMirror('0') - '0'), "禯娺ၢስ㎬酣\uf6fa湲\uf1b4죙嗸彄齂旪\ueae5孾舸峙災韢\uea9aၖ\ua956\ud98a늩\ue3e4⣲ፗ㊆靜᪆\uaaca⯸폭㌎猒ꓼ", "䂔捰\uf32fᓏ", "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) + 795045953).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7284(ir irVar, long j10) {
        int i10 = f3113 + 117;
        f3114 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m7278().postDelayed(irVar, j10);
                f3113 = (f3114 + 123) % 128;
            } else {
                m7278().postDelayed(irVar, j10);
                throw null;
            }
        } catch (Error unused) {
            k.m7116(m7286((char) (ViewConfiguration.getFadingEdgeLength() >> 16), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0)).intern(), m7286((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u07b7嬻⳯ხ徖眫侀ȅ巀댮◑皒ꉞ\ue407䶉Ĉ㰂\uf10e\udb4e➳\ue6e0⯶≑Ἲ·⇳ﴴ㏓菙낫拪湐\u0adf\uf2c1災螵", "\uf7f7\uf418赙߸", "\u0000\u0000\u0000\u0000", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m7278() {
        int i10 = f3113 + 85;
        f3114 = i10 % 128;
        if (i10 % 2 != 0) {
            return f3118;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Handler m7280() {
        try {
            HandlerThread handlerThread = new HandlerThread(m7286((char) View.MeasureSpec.getSize(0), "䮗튄稺켉캤緑䄝벭㏙\ud7fc", "ﰕ瞺\ud97dﻴ", "\u0000\u0000\u0000\u0000", TextUtils.getOffsetAfter("", 0)).intern());
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    handlerThread.start();
                    return new Handler(handlerThread.getLooper());
                } catch (Error unused) {
                    k.m7116(m7286((char) (Process.getGidForName("") + 1), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16).intern(), m7286((char) TextUtils.indexOf("", "", 0, 0), "ꭴ몹務ᦉ㬉꼜葊ꖊꭰᕾ棑顓\ud89c뾷졻癪⊝䗶䁁疦삓륔｛癡駒缿썹槪ᾱ펇\uf898㼅鑇껨\u2d72儆㾖⚄⌼ꛣ骾꿿겿遵㒕п\uf257냡", "\ueaa3\u086dㆴꎲ", "\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), true);
                }
            }
            f3113 = (f3114 + 111) % 128;
        } catch (Error unused2) {
            k.m7116(m7286((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "꒴\uedd4쏊ᙞ讅윒\uf2f4專\ue01e\uab1d佰눻", "옫㟒❋昍", "\u0000\u0000\u0000\u0000", (Process.getThreadPriority(0) + 20) >> 6).intern(), m7286((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "ⶫ厄깊ꃵದ䅚⬎ท䷬鮗퍾꺛\udb2bᆛﰃ\uf37d痧彏庪숋\uf750吻\uf09d㫌모脕ㆼ\udc5b㱤䗱椇鳺粸硁焘", "油⌭㐔䷆", "\u0000\u0000\u0000\u0000", 337849708 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), true);
        }
        int i11 = f3114 + 85;
        f3113 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        int i12 = 55 / 0;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7286(char c10, String str, String str2, String str3, int i10) {
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
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f3116) ^ ((long) f3119)) ^ ((long) f3115));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m7285() {
        int i10 = f3113 + 45;
        f3114 = i10 % 128;
        if (i10 % 2 == 0) {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        int i11 = f3113 + 123;
        f3114 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
