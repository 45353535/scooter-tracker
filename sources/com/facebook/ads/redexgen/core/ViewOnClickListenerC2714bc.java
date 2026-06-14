package com.facebook.ads.redexgen.core;

import android.view.View;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2714bc implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5Q A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 69, 86, 75, 81, 87, 65, 72, 123, 71, 69, 86, SignedBytes.MAX_POWER_OF_TWO};
    }

    public ViewOnClickListenerC2714bc(C5Q c5q) {
        this.A00 = c5q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 13, 120));
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
