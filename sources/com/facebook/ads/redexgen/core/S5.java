package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S5 {
    public static byte[] A00;
    public static String[] A01 = {"OKQe8hXRO9IjIcE", "fZKFXGCnlijKRnd4C4GIjN8U9jomZ", "zd2g3FUlSdy4niS", "DQ1eYrU0vgUbRV2buV2T3UhVrDT8jNOj", "Q6rIf3Izbhrm2WD", "9gkLXGbOvBYKsW5YBwzKkub2Nn3K8ZPa", "2O7yMssiHcBFdM45gqp1TjJS", "Fkq1E5"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[3].charAt(10) == 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "GMwx2CjIRojg5Fd";
            strArr[4] = "kdR397QSXvrHcnb";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 100);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{74, 92, 119, 77, 80, 92, 90, 73, 91, Ascii.CAN, Ascii.DC4, Ascii.SYN, 85, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.RS, Ascii.EM, Ascii.DC4, Ascii.DC4, Ascii.DLE, 85, Ascii.SUB, Ascii.US, 8, 85, Ascii.DC2, Ascii.NAK, Ascii.SI, Ascii.RS, 9, Ascii.NAK, Ascii.SUB, Ascii.ETB, 85, Ascii.EM, Ascii.SI, Ascii.RS, 3, Ascii.SI, 9, Ascii.SUB, 8};
    }

    static {
        A02();
    }

    public static SharedPreferences A00(SQ sq) {
        return sq.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 31), sq), 0);
    }

    public final String A03(SQ sq) {
        return A00(sq).getString(A01(0, 9, 76), null);
    }

    public final void A04(SQ sq, String str) {
        SharedPreferences btSP = A00(sq);
        btSP.edit().putString(A01(0, 9, 76), str).apply();
    }
}
