package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MY extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC3132id A00;
    public MX A01;
    public C2820dL A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, Ascii.SI, 71, SignedBytes.MAX_POWER_OF_TWO, 66, 68, 67, 78, 78, 74, Ascii.SI, SignedBytes.MAX_POWER_OF_TWO, 69, 82, Ascii.SI, 67, SignedBytes.MAX_POWER_OF_TWO, 79, 79, 68, 83, Ascii.SI, 66, 77, 72, 66, 74, 68, 69};
    }

    public MY(C2820dL c2820dL, String str, InterfaceC3132id interfaceC3132id, MX mx) {
        this.A02 = c2820dL;
        this.A03 = str;
        this.A01 = mx;
        this.A00 = interfaceC3132id;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ACb(this.A00);
        }
    }
}
