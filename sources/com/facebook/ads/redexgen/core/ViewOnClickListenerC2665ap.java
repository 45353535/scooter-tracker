package com.facebook.ads.redexgen.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2665ap implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"QT04eFLa9mjEfMLd", "wn7Oy4ZvyPX", "JdVOIkh1rweljXiNlmOrPPxbj76ouIw4", "8", "HoYvJWyWnzW9xQrMEDuDE8k", "", "4NNWhWDRRxnZXe7GAIP6Nv2mv9IaX8G8", "Hy00I9bleYebYRTE8UzaGRkCp9A9i8E3"};
    public final /* synthetic */ C2197Jp A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.SUB, Ascii.RS, Ascii.DC2, Ascii.CAN, Ascii.SYN};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2665ap(C2197Jp c2197Jp) {
        this.A00 = c2197Jp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 69));
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
            String[] strArr = A02;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "gqn3ITnmd8SVLq3knr5xxRJ0pveQ6sYL";
            strArr2[7] = "MdUyII5PUBg9MBmNc1g4VKtuuD0LDq6P";
        }
    }
}
