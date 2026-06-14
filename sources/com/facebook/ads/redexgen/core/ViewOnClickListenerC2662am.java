package com.facebook.ads.redexgen.core;

import android.view.View;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2662am implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C18385d A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, SignedBytes.MAX_POWER_OF_TWO, 77, 76, 70};
    }

    public ViewOnClickListenerC2662am(C18385d c18385d) {
        this.A00 = c18385d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 48));
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
