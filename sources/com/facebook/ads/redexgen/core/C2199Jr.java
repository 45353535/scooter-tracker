package com.facebook.ads.redexgen.core;

import android.text.Layout;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2199Jr {
    public static byte[] A0J;
    public static String[] A0K = {"Usxox1Jpg4zI1D26A46628IJoKVIfDOb", "DJj4Y7Lf5wmbgFbmipnyENDrbENW0zBu", "xAirbBVx6sN", "JUHzrsF6PskbrsOcxUQeRZ6EJgAR84BH", "g21uR390", "sct5cBRRGNi", "fSzYgZjiZ3zjw2rk03FKz0970uetzuqd", "YzsQQs1"};
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public C2188Jg A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0J = new byte[]{-24, 7, 9, 17, 13, Ascii.CAN, Ascii.NAK, Ascii.ESC, Ascii.DC4, 10, -58, 9, Ascii.NAK, Ascii.DC2, Ascii.NAK, Ascii.CAN, -58, Ascii.SO, 7, Ascii.EM, -58, Ascii.DC4, Ascii.NAK, Ascii.SUB, -58, 8, Ascii.VT, Ascii.VT, Ascii.DC4, -58, 10, Ascii.VT, Ascii.FF, Ascii.SI, Ascii.DC4, Ascii.VT, 10, -44, -27, Ascii.SO, 13, 19, -65, 2, Ascii.SO, Ascii.VT, Ascii.SO, 17, -65, 7, 0, Ascii.DC2, -65, 13, Ascii.SO, 19, -65, 1, 4, 4, 13, -65, 3, 4, 5, 8, 13, 4, 3, -51};
    }

    static {
        A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.core.C2199Jr A00(com.facebook.ads.redexgen.core.C2199Jr r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2199Jr.A00(com.facebook.ads.redexgen.X.Jr, boolean):com.facebook.ads.redexgen.X.Jr");
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final int A05() {
        if (this.A0H) {
            return this.A02;
        }
        throw new IllegalStateException(A01(0, 38, 55));
    }

    public final int A06() {
        if (this.A0I) {
            return this.A04;
        }
        throw new IllegalStateException(A01(38, 32, 48));
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A08;
    }

    public final int A09() {
        return this.A09;
    }

    public final int A0A() {
        if (this.A03 == -1 && this.A06 == -1) {
            return -1;
        }
        int i10 = (this.A03 == 1 ? 1 : 0) | (this.A06 == 1 ? 2 : 0);
        String[] strArr = A0K;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "pc7acbLDMjB";
        strArr2[5] = "xuQHQFUerHu";
        return i10;
    }

    public final Layout.Alignment A0B() {
        return this.A0C;
    }

    public final Layout.Alignment A0C() {
        return this.A0D;
    }

    public final C2188Jg A0D() {
        return this.A0E;
    }

    public final C2199Jr A0E(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C2199Jr A0F(float f10) {
        this.A01 = f10;
        return this;
    }

    public final C2199Jr A0G(int i10) {
        this.A02 = i10;
        this.A0H = true;
        return this;
    }

    public final C2199Jr A0H(int i10) {
        this.A04 = i10;
        this.A0I = true;
        return this;
    }

    public final C2199Jr A0I(int i10) {
        this.A05 = i10;
        return this;
    }

    public final C2199Jr A0J(int i10) {
        this.A08 = i10;
        return this;
    }

    public final C2199Jr A0K(int i10) {
        this.A09 = i10;
        return this;
    }

    public final C2199Jr A0L(Layout.Alignment alignment) {
        this.A0C = alignment;
        return this;
    }

    public final C2199Jr A0M(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C2199Jr A0N(C2188Jg c2188Jg) {
        this.A0E = c2188Jg;
        return this;
    }

    public final C2199Jr A0O(C2199Jr c2199Jr) {
        return A00(c2199Jr, true);
    }

    public final C2199Jr A0P(String str) {
        this.A0F = str;
        return this;
    }

    public final C2199Jr A0Q(String str) {
        this.A0G = str;
        return this;
    }

    public final C2199Jr A0R(boolean z10) {
        this.A03 = z10 ? 1 : 0;
        return this;
    }

    public final C2199Jr A0S(boolean z10) {
        this.A06 = z10 ? 1 : 0;
        return this;
    }

    public final C2199Jr A0T(boolean z10) {
        this.A07 = z10 ? 1 : 0;
        return this;
    }

    public final C2199Jr A0U(boolean z10) {
        this.A0A = z10 ? 1 : 0;
        return this;
    }

    public final C2199Jr A0V(boolean z10) {
        this.A0B = z10 ? 1 : 0;
        return this;
    }

    public final String A0W() {
        return this.A0F;
    }

    public final String A0X() {
        return this.A0G;
    }

    public final boolean A0Y() {
        return this.A0A == 1;
    }

    public final boolean A0Z() {
        return this.A0H;
    }

    public final boolean A0a() {
        return this.A0I;
    }

    public final boolean A0b() {
        return this.A07 == 1;
    }

    public final boolean A0c() {
        return this.A0B == 1;
    }
}
