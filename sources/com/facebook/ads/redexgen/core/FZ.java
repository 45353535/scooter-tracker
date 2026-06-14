package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FZ extends AbstractRunnableC2507Vt {
    public static byte[] A02;
    public static String[] A03 = {"dab4fRnX0jwVtTCdppjyxAzmLS4bXJsv", "tx88Rmris0qAnIQYPQwCDQk09feKvYvd", "zx5uuvDAcytcTb9ViP21DGr2Ir", "iFOXUW5dAcR78ORAksMxLEmjU8chlyrY", "cH6E6XWheDX0I5qudQa8gCuUDMH3DwGR", "ZrH1xVhvr", "HcVkU72Pv92AZpKffx9OD1kZyJiX0ZmG", "FRYXqcD3MsRMpqiQBVhoHwYMYH2ko3dl"};
    public final /* synthetic */ C18003r A00;
    public final /* synthetic */ C3Q A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].charAt(20) == 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "mmZKkJ0qdyfdoCPbfy2YKuwlL3WBbVIn";
            strArr[0] = "dwlf7VAy7NoW0pl9cb0nbAZtUrVGpkqt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-8, 43, Ascii.FS, Ascii.FS, Ascii.ESC, 40, Ascii.US, 36, Ascii.GS, -42, Ascii.US, 36, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.US, 36, Ascii.US, 42, Ascii.ESC, 34, 47};
    }

    static {
        A01();
    }

    public FZ(C18003r c18003r, C3Q c3q) {
        this.A00 = c18003r;
        this.A01 = c3q;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2507Vt
    public final void A07() {
        if (this.A00.A0L.getState() == EnumC2890eU.A02 && this.A00.A0L.getCurrentPositionInMillis() == A00()) {
            this.A00.A0R(A00(0, 22, 125));
        }
    }
}
