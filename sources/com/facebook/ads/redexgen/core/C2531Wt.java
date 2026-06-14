package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2531Wt implements SS {
    public static C2531Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC2419Sh A03;
    public TP A04;
    public InterfaceC2467Ue A05;
    public InterfaceC1990Bn A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{Ascii.SI, 13, 13, Ascii.DC2, 13, 17, Ascii.SO, 58, 13, Ascii.US, 45, 45, 35, 41, 40, -38, Ascii.RS, Ascii.ESC, 46, Ascii.ESC, -38, 35, 40, 35, 46, 35, Ascii.ESC, 38, 35, 52, Ascii.US, Ascii.RS, Ascii.FS, Ascii.SI, Ascii.SUB, Ascii.EM, Ascii.FS, Ascii.RS, -3, Ascii.SI, Ascii.GS, Ascii.GS, 19, Ascii.EM, Ascii.CAN, -18, Ascii.VT, Ascii.RS, Ascii.VT, -13, Ascii.CAN, 19, Ascii.RS, 19, Ascii.VT, Ascii.SYN, 19, 36, Ascii.SI, Ascii.SO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C2794cu c2794cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2794cu);
        this.A06 = A05(c2794cu, this.A03, A03(c2794cu));
        A09(c2794cu, A00(c2794cu, this.A06));
        A0A(c2794cu, this.A06);
        A0B(c2794cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    public static InterfaceC2396Rj A00(C2794cu c2794cu, InterfaceC1990Bn interfaceC1990Bn) {
        if (!U7.A1m(c2794cu) || interfaceC1990Bn == null) {
            return null;
        }
        return AbstractC2397Rk.A00().A00(interfaceC1990Bn);
    }

    public static InterfaceC2419Sh A01(C2794cu c2794cu) {
        return AbstractC2420Si.A00().A00(c2794cu, new YJ());
    }

    public static synchronized C2531Wt A02() {
        if (A07 == null) {
            A07 = new C2531Wt();
        }
        return A07;
    }

    public static InterfaceC2899ed A03(C2794cu c2794cu) {
        if (!U7.A1i(c2794cu)) {
            return null;
        }
        return C2917ev.A01(c2794cu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.SS
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC1990Bn A97() {
        return this.A06;
    }

    public static InterfaceC1990Bn A05(C2794cu c2794cu, InterfaceC2419Sh interfaceC2419Sh, InterfaceC2899ed interfaceC2899ed) {
        if (!U7.A2e(c2794cu) || interfaceC2899ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2939fI.A00().A00(c2794cu, interfaceC2419Sh, interfaceC2899ed, VZ.A04(c2794cu), new X8(new VR(c2794cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c2794cu)), null, null, new C3052hB()), c2794cu), C2937fG.A00().A00());
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C2794cu c2794cu, InterfaceC2396Rj interfaceC2396Rj) {
        if (!U7.A1m(c2794cu) || interfaceC2396Rj == null) {
            return;
        }
        AbstractC2394Rh.A00().A00(interfaceC2396Rj, c2794cu);
    }

    public static void A0A(C2794cu c2794cu, InterfaceC1990Bn interfaceC1990Bn) {
        if (!U7.A0m(c2794cu) || interfaceC1990Bn == null) {
            return;
        }
        new S4(c2794cu, interfaceC1990Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2794cu c2794cu, InterfaceC1990Bn interfaceC1990Bn) {
        if (interfaceC1990Bn == null) {
            return;
        }
        UB.A00(c2794cu, interfaceC1990Bn);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final US A6f(C2794cu c2794cu) {
        return VG.A01(c2794cu);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SR A6w(SQ sq) {
        if (this.A02 == null) {
            this.A02 = new XI(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SJ A78() {
        if (this.A01 == null) {
            this.A01 = new C2843di();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2419Sh A7d(SQ sq) {
        if (this.A03 == null) {
            this.A03 = A01(sq.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2432Su A7f(SQ sq) {
        return new C2593Zd(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized ST A7p(final SQ sq) {
        return new YI(sq) { // from class: com.facebook.ads.redexgen.X.6K
            @Override // com.facebook.ads.redexgen.core.ST
            public final boolean A9e() {
                return CM.A09();
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ABq() {
                TK.A06(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACE() {
                TK.A07(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACe(C2794cu c2794cu) {
                AbstractC2296Nl.A01(c2794cu);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized LL A84(SQ sq) {
        if (!U7.A13(sq)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = LM.A00().A00(new YH(sq));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SV A8q(SQ sq) {
        return new XN(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final C2794cu A8r(Context context) {
        C2794cu sdkContext = SP.A00();
        if (sdkContext == null) {
            C2794cu sdkContext2 = new C2794cu(context, this);
            SP.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2467Ue A8s(C2794cu c2794cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c2794cu);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized TP A8y() {
        if (this.A04 == null) {
            this.A04 = new TP();
            A08();
        }
        return this.A04;
    }
}
