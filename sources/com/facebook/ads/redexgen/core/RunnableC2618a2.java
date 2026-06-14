package com.facebook.ads.redexgen.core;

import android.animation.ObjectAnimator;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC2618a2 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C18515q A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.FF, 1, Ascii.GS, 5, Ascii.FF};
    }

    public RunnableC2618a2(C18515q c18515q) {
        this.A00 = c18515q;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA00 = A00(0, 5, 64);
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0T.A0F().AJx();
            ObjectAnimator.ofFloat(this.A00.A0Q, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC2611Zv) this.A00).A09, strA00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C2617a1(this));
            duration.start();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
