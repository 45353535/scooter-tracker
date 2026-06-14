package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2646aW implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"OcC8Yw10ta4EzUHryW8qF9f8Kw9JuvuB", "8f8LYzxOMmLQdsAhKRfNVONBERHkcGt2", "CzyGp", "2PtxVvqYppmcLS4cwbsjetyeZ5i3nCKD", "x35AdtEajADMGuwsONv03k5bW5eRm", "TNmYMyEiRrCRNh2BAihsQXhXdDRTY", "KzXNDxf0CUBsvqnb9B4FND8KZCDQkeqp", "bZ2905qMAeosph8FN3SjH9j5ipegj0aG"};
    public final /* synthetic */ C2205Jx A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 58, 54, 48, 50};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2646aW(C2205Jx c2205Jx) {
        this.A00 = c2205Jx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 85));
            if (((AbstractC2654ae) this.A00).A06.A0E() != null) {
                ((AbstractC2654ae) this.A00).A06.A0E().ABr();
            }
        } catch (Throwable th2) {
            if (A02[1].charAt(21) != 'O') {
                throw new RuntimeException();
            }
            A02[2] = "i9GBCPULPHC1kq3f4RL3YMSEVPUJV";
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
