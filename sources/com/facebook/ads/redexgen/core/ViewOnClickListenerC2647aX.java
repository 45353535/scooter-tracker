package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2647aX implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2205Jx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 70, 74, 76, 78};
    }

    public ViewOnClickListenerC2647aX(C2205Jx c2205Jx) {
        this.A00 = c2205Jx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 46));
            if (((AbstractC2654ae) this.A00).A06.A0E() != null) {
                ((AbstractC2654ae) this.A00).A06.A0E().ABr();
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
