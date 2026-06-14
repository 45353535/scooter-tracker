package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class jc {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2743 = {'\'', 23, '2', 'i', 'g', '*', 'n', 137, 138, 146, 151, 148, 143, 145, '2', 'J', 'R', 'r'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2744 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2745 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2746;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2747;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2748;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2749;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2750;

    public static class b extends d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final String f2751;

        public b(String str, String str2, String str3) {
            super(str, str2);
            this.f2751 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6897() {
            return m6893(this.f2751);
        }
    }

    public static class c extends e {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final String f2752;

        public c(String str, String str2, String str3) {
            super(str, str2);
            this.f2752 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6897() {
            return m6893(this.f2752);
        }
    }

    public static class d extends jc {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static short[] f2753 = null;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static byte[] f2754 = {-107, -8, -1, Ascii.FF, -103, -11, 9, 55, -64, -1, -4, 9};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2755 = 123424552;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2756 = 111;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2757 = -29444390;

        public d(String str, String str2) {
            super(str, m6898((-123424552) - TextUtils.getTrimmedLength(""), (short) View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 29444489, (byte) TextUtils.getCapsMode("", 0, 0), (-112) - View.resolveSize(0, 0)).intern(), str2, m6898(KeyEvent.getDeadChar(0, 0) - 123424548, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 29444497, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (KeyEvent.getMaxKeyCode() >> 16) - 112).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6898(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2756;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2754;
                        i14 = bArr != null ? (byte) (bArr[f2755 + i10] + i13) : (short) (f2753[f2755 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f2755 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i11 + f2757);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f2754;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f2753;
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

    public static class e extends jc {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2758 = 7164907263120509370L;

        public e(String str, String str2) {
            super(str, m6899("\u09d9躾܂龕", 34667 - Color.argb(0, 0, 0, 0)).intern(), str2, m6899("\u09d0㠤樏鰓츠\uf07e≚咢", 12780 - ImageFormat.getBitsPerPixel(0)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m6899(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f2758);
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
    }

    /* synthetic */ jc(String str, String str2, String str3, String str4, byte b10) {
        this(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m6887() {
        int i10 = f2744 + 13;
        f2745 = i10 % 128;
        if (i10 % 2 == 0) {
            ar.m4771().mo4786();
            throw null;
        }
        String strMo4786 = ar.m4771().mo4786();
        int i11 = f2744 + 97;
        f2745 = i11 % 128;
        if (i11 % 2 != 0) {
            return strMo4786;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6888() {
        f2744 = (f2745 + 33) % 128;
        String strIntern = m6891(new int[]{5, 9, 38, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", true).intern();
        String strM6887 = m6887();
        if (!this.f2750) {
            return strIntern;
        }
        int i10 = f2744 + 11;
        f2745 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(strM6887);
            throw null;
        }
        if (TextUtils.isEmpty(strM6887)) {
            return strIntern;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strIntern);
        sb2.append(m6891(new int[]{14, 4, 0, 1}, "\u0001\u0000\u0001\u0000", true).intern());
        sb2.append(strM6887);
        sb2.append(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6889() {
        int i10 = f2744 + 81;
        int i11 = i10 % 128;
        f2745 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f2747;
        f2744 = (i11 + 59) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6890() {
        String str;
        int i10 = f2744 + 65;
        int i11 = i10 % 128;
        f2745 = i11;
        if (i10 % 2 == 0) {
            str = this.f2746;
            int i12 = 73 / 0;
        } else {
            str = this.f2746;
        }
        int i13 = i11 + 115;
        f2744 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    protected final String m6892() {
        int i10 = f2745;
        String str = this.f2748;
        f2744 = (i10 + 21) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6894() {
        f2744 = (f2745 + 67) % 128;
        String strReplace = mo6897().replace(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern(), m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        f2744 = (f2745 + 21) % 128;
        return strReplace;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    protected final String m6895() {
        int i10 = f2745;
        String str = this.f2749;
        f2744 = (i10 + 23) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6896() {
        int i10 = f2745 + 111;
        f2744 = i10 % 128;
        this.f2750 = i10 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo6897() {
        String strM6888 = m6888();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM6888);
        sb2.append(this.f2748);
        sb2.append(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(this.f2746);
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6891(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(this.f2749);
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(this.f2747);
        String string = sb2.toString();
        int i10 = f2744 + 3;
        f2745 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return string;
    }

    private jc(String str, String str2, String str3, String str4) {
        this.f2748 = str;
        this.f2746 = str2;
        this.f2749 = str3;
        this.f2747 = str4;
        this.f2750 = true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6891(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2743, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    protected final String m6893(String str) {
        String strM6888 = m6888();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM6888);
        sb2.append(m6892());
        sb2.append(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(m6891(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(str);
        sb2.append(m6891(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(m6890());
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6891(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6895());
        sb2.append(m6891(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6889());
        String string = sb2.toString();
        int i10 = f2744 + 47;
        f2745 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 1 / 0;
        }
        return string;
    }
}
