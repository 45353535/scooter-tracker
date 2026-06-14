package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2202Ju extends AbstractC2654ae implements Wf {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC3095hy A00;
    public final C2519Wh A01;
    public final InterfaceC2551Xn A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{SignedBytes.MAX_POWER_OF_TWO, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public C2202Ju(C2658ai c2658ai, boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        super(c2658ai, true);
        this.A02 = c2658ai.A0D();
        this.A00 = c2658ai.A05();
        RelativeLayout relativeLayout = new RelativeLayout(c2658ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        XP.A0P(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c2658ai.A06());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        XP.A0I(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC2654ae.A07, 0, AbstractC2654ae.A07, AbstractC2654ae.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams4.setMargins(z10 ? AbstractC2654ae.A07 : 0, z10 ? 0 : AbstractC2654ae.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = C2519Wh.A00(c2658ai.A06(), this.A00, this);
        C2518Wg c2518WgA02 = this.A01.A02(this.A00);
        c2658ai.A06().A0H().A00(c2518WgA02.A01);
        if (c2658ai.A0I() && !z10) {
            C2786cm c2786cm = new C2786cm(c2658ai.A06());
            c2786cm.setPageDetails(c2658ai.A05().A23());
            int iA05 = this.A06.A05().A1z().A00().A05(true);
            c2786cm.A02(iA05, iA05);
            XP.A0E(1007, c2786cm);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC2654ae.A07, 0, 0);
            linearLayout.addView(c2786cm, layoutParams6);
            if (U7.A18(c2658ai.A06())) {
                c2786cm.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0F(c2658ai.A05(), c2658ai.A0C());
        View viewA02 = c2658ai.A02();
        if (viewA02 != null && (c2518WgA02.A00 || U7.A1I(getAdContextWrapper()))) {
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c2658ai.A06());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (c2518WgA02.A00) {
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1O(view);
                    }
                });
            } else {
                AbstractC2608Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2651ab(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (U7.A17(c2658ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c2658ai.A0C() != null) {
                c2658ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final void A1G(C2274Mp c2274Mp, String str, double d10, Bundle bundle) {
        super.A1G(c2274Mp, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A1M() {
        return true;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
