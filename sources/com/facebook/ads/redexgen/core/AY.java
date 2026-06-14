package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AY extends Exception {
    public static byte[] A05;
    public final AR A00;
    public final AY A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, Ascii.FF, 49, Ascii.DLE, Ascii.SYN, Ascii.SUB, 17, Ascii.DLE, 7, 85, Ascii.FS, Ascii.ESC, Ascii.FS, 1, 85, 19, Ascii.DC4, Ascii.FS, Ascii.EM, Ascii.DLE, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, SignedBytes.MAX_POWER_OF_TWO, 72, 77, 68, 69, Ascii.ESC, 1, 122, Utf8.REPLACEMENT_BYTE, 78, 66, Ascii.GS, 17, 19, 80, Ascii.CAN, Ascii.US, Ascii.GS, Ascii.ESC, Ascii.FS, 17, 17, Ascii.NAK, 80, Ascii.US, Ascii.SUB, 13, 80, Ascii.US, Ascii.DLE, Ascii.SUB, Ascii.FF, 17, Ascii.ETB, Ascii.SUB, 6, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, 77, 80, Ascii.ESC, 6, 17, Ascii.SO, Ascii.DC2, Ascii.US, 7, Ascii.ESC, Ascii.FF, 80, 19, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, Ascii.GS, 17, Ascii.SUB, Ascii.ESC, Ascii.GS, 80, 51, Ascii.ESC, Ascii.SUB, Ascii.ETB, Ascii.US, 61, 17, Ascii.SUB, Ascii.ESC, Ascii.GS, 44, Ascii.ESC, Ascii.DLE, Ascii.SUB, Ascii.ESC, Ascii.FF, Ascii.ESC, Ascii.FF, 33, 36, 47, 45, Ascii.NAK};
    }

    public AY(C3497or c3497or, Throwable th2, boolean z10, int i10) {
        this(A03(23, 22, 80) + i10 + A03(45, 3, 19) + c3497or, th2, c3497or.A0W, z10, null, A02(i10), null);
    }

    public AY(C3497or c3497or, Throwable th2, boolean z10, AR ar) {
        this(A03(2, 21, 4) + ar.A03 + A03(0, 2, 93) + c3497or, th2, c3497or.A0W, z10, ar, AbstractC18094a.A02 >= 21 ? A04(th2) : null, null);
    }

    public AY(String str, Throwable th2, String str2, boolean z10, AR ar, String str3, AY ay) {
        super(str, th2);
        this.A03 = str2;
        this.A04 = z10;
        this.A00 = ar;
        this.A02 = str3;
        this.A01 = ay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AY A00(AY ay) {
        return new AY(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ay);
    }

    public static String A02(int i10) {
        String strA03 = i10 < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb2 = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb2.append(sign).append(strA03).append(Math.abs(i10)).toString();
    }

    public static String A04(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
