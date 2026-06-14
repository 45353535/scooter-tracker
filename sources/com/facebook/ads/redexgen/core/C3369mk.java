package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3369mk implements InterfaceC1974Aw {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, Ascii.ESC, Ascii.GS, Ascii.VT, Ascii.FF, Ascii.ESC, 83, Ascii.SO, Ascii.DC2, Ascii.US, 7, Ascii.FS, Ascii.US, Ascii.GS, Ascii.NAK, 10, Ascii.NAK, Ascii.CAN, Ascii.EM, 19, 83, Ascii.GS, 10, Ascii.US};
    }

    public C3369mk() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1974Aw
    public final int A7H() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1974Aw
    public final MediaCodecInfo A7I(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1974Aw
    public final boolean AAI(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1974Aw
    public final boolean AAJ(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1974Aw
    public final boolean AIK() {
        return false;
    }
}
