package com.facebook.ads.redexgen.core;

import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC3550q2 A00;
    public InterfaceC3539pp A01;
    public C3526pb A02;
    public final InterfaceC3540pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC3539pp A03 = new A9(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC3550q2 interfaceC3550q2, InterfaceC3540pq interfaceC3540pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC3550q2;
        this.A04 = interfaceC3540pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    private void A05(AbstractC3542ps abstractC3542ps, InterfaceC3547px interfaceC3547px, A6 a62) {
        this.A02 = C3526pb.A00(this.A05, abstractC3542ps, interfaceC3547px, a62);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C3548q0 c3548q0) {
        C3526pb c3526pb = this.A02;
        if (c3526pb != null && dspViewableNode != null) {
            if (this.A05.A00 && c3548q0 != null) {
                c3526pb.A04(dspViewableNode, c3548q0);
            } else {
                c3526pb.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C3548q0 c3548q0, C3544pu c3544pu) {
        C3526pb c3526pb = this.A02;
        if (c3526pb != null && dspViewableNode != null && c3544pu != null) {
            if (this.A05.A00 && c3548q0 != null) {
                c3544pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c3544pu.A08 + c3548q0;
                c3526pb.A05(dspViewableNode, c3548q0, c3544pu);
            } else {
                c3526pb.A06(dspViewableNode, c3544pu);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C3544pu<?, ?> c3544pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c3544pu);
    }

    public final void A0A(AbstractC3542ps abstractC3542ps, View view) {
        if (abstractC3542ps != null && view != null) {
            A05(abstractC3542ps, new AA(view, this.A00), new C1H(null));
        }
    }
}
