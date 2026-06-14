package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class T7 implements S7 {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C3116iN A00;
    public final /* synthetic */ C2363Qc A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.FS, 55, Utf8.REPLACEMENT_BYTE, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, Utf8.REPLACEMENT_BYTE, 55, 4};
    }

    static {
        A01();
    }

    public T7(C2363Qc c2363Qc, C3116iN c3116iN, boolean z10) {
        this.A01 = c2363Qc;
        this.A00 = c3116iN;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 111);
        this.A01.A0c.A0F().A3F(XG.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0G != null) {
            this.A01.A0G.ADB(V1.A01(adErrorType, strA00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        this.A01.A0a = this.A00;
        if (this.A02 && this.A01.A0A != null) {
            this.A01.A0A.A0L();
        }
        if (this.A01.A0G != null) {
            if (this.A01.A0E.equals(EnumC2474Ul.A04) && !this.A01.A0r()) {
                this.A01.A0G.AEB();
            }
            if (this.A02) {
                C2363Qc c2363Qc = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    if (U7.A1n(c2363Qc.A0c) && this.A01.A10() != null && this.A01.A10().A1Y()) {
                        this.A01.A0M = AbstractC2732bu.A01(this.A01.A0c, this.A01.A10(), 4, new T8(this));
                        return;
                    } else {
                        C2363Qc c2363Qc2 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            c2363Qc2.A0G.ACH();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
