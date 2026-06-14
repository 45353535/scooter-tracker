package com.facebook.ads.redexgen.core;

import androidx.media3.common.PlaybackException;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization
public enum EnumC2245Ll {
    A05,
    A04,
    A06,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.VT, Ascii.DLE, Ascii.VT, Ascii.SYN, 33, Ascii.NAK, 7, 9, Ascii.SI, 7, Ascii.DLE, Ascii.SYN, -27, -31, -42, -18, -41, -42, -40, -32, -39, -37, -50, -49, -50, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}
