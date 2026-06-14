package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2158Ic {
    public static byte[] A05;
    public static String[] A06 = {"OUufb3XpwzKYnlflZdZ6sRl07O4y2xde", "sKTdS4Xom3soESmXE0UV17qKIdPOParu", "kk23Dr8l3bATGrEguhsdZQtf", "3jRjB5CH7VItg40f0wyJnaKmLrgr1NBM", "BH8vD2JIXWvofCU6hHaybnU4mVSHqFOc", "vohsQcTTzwLv029o6bcJNqcBVW1DxWoo", "Jn5KmPxuP80vuetXL26eN8MkgXOAz5Tn", "UdULkD"};
    public int A00;
    public final H1 A01;
    public final H2 A02;
    public final C2168Im A03;
    public final C2171Ip A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].charAt(29) == strArr[4].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "SmGAr1wQXpWbqjnIPPUcEk3V";
            strArr2[7] = "BndLoX";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
            i13++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-20, 0, -17, -12, -6, -70, -1, -3, 0, -16, -72, -13, -17};
    }

    static {
        A01();
    }

    public C2158Ic(C2168Im c2168Im, C2171Ip c2171Ip, H1 h12) {
        H2 h22;
        this.A03 = c2168Im;
        this.A04 = c2171Ip;
        this.A01 = h12;
        if (A00(0, 13, 34).equals(c2168Im.A07.A0W)) {
            h22 = new H2();
        } else {
            h22 = null;
        }
        this.A02 = h22;
    }
}
