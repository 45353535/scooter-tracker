package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0002\b\u0002J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3520pL {
    public static byte[] A00;
    public static String[] A01 = {"e7AwhByPjRPUw6TPvHQ97hdZd1", "BA53CFSFXKNaueAmPJEc9hkRINMpWiHX", "eg", "BOBLIBOzzfVObnmt242WmA3oiPmYKJxA", "5X54btT7YSWi6fK", "vwsHu7ibsWkpW0OsiHz", "pfFn7t8nBopYri9", CampaignEx.JSON_KEY_AD_K};
    public static final C3520pL A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "yY0Pcbq111zueav";
            strArr2[6] = "lktBBxSgK8ahxIm";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.ESC, Ascii.US, 4, Ascii.FS, Ascii.EM, Ascii.RS, 94, 37, Ascii.RS, Ascii.EM, 4};
    }

    static {
        A01();
        A02 = new C3520pL();
    }

    public final String toString() {
        return A00(0, 11, 33);
    }
}
