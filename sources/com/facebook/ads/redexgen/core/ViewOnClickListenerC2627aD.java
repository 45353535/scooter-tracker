package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2627aD implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C18425h A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{61, 48, 43, 44, 54};
    }

    public ViewOnClickListenerC2627aD(C18425h c18425h) {
        this.A00 = c18425h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 111));
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
