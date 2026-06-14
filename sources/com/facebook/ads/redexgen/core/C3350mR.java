package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3350mR implements InterfaceC2002Cb {
    public static byte[] A03;
    public static String[] A04 = {"3Cx8VuBaAtU", "mtIvitx", "ijtxGWvqwx8wBPOmSGXshyr4piVUOT73", "1A2eWfmauMvQ3z4CiBElgktZxGJ5t0Vj", "NuAYfoZUoES6MxZb2vdyJB2K3PVOnnYD", "gczB0K5G5", "TBGYu08V4AAoblIa0rbrS9oc16PYokVw", "JGtQJ9cae1Y"};
    public GX A00;
    public InterfaceC3286lN A01;
    public final InterfaceC2106Gb A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{80, 89, Ascii.SUB, Ascii.SYN, Ascii.FF, Ascii.NAK, Ascii.GS, 89, Ascii.VT, Ascii.FS, Ascii.CAN, Ascii.GS, 89, 13, 17, Ascii.FS, 89, 10, 13, Ascii.VT, Ascii.FS, Ascii.CAN, Ascii.DC4, 87, 2, 35, 34, 41, 108, 35, 42, 108, 56, 36, 41, 108, 45, 58, 45, 37, 32, 45, 46, 32, 41, 108, 41, 52, 56, 62, 45, 47, 56, 35, 62, Utf8.REPLACEMENT_BYTE, 108, 100};
    }

    static {
        A01();
    }

    public C3350mR(InterfaceC2106Gb interfaceC2106Gb) {
        this.A02 = interfaceC2106Gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5q() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    public final long A7S() {
        if (this.A01 != null) {
            return this.A01.A8f();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AA3(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") com.facebook.ads.redexgen.core.InterfaceC3432nl r16, android.net.Uri r17, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r18, long r19, long r21, com.facebook.ads.redexgen.core.GY r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3350mR.AA3(com.facebook.ads.redexgen.X.nl, android.net.Uri, java.util.Map, long, long, com.facebook.ads.redexgen.X.GY):void");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    public final int AGc(C2124Gt c2124Gt) throws IOException {
        return ((GX) C3M.A01(this.A00)).AGb((InterfaceC3286lN) C3M.A01(this.A01), c2124Gt);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    public final void AGr() {
        if (this.A00 != null) {
            this.A00.AGr();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2002Cb
    public final void AIM(long j10, long j11) {
        ((GX) C3M.A01(this.A00)).AIM(j10, j11);
    }
}
