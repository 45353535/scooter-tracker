package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C18395e extends AbstractC2204Jw {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 71);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C18395e(C2658ai c2658ai, boolean z10) {
        super(c2658ai, true);
        this.A01 = z10;
        this.A00 = c2658ai.A02();
        A1R();
        if (this.A01) {
            addView(c2658ai.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c2658ai.A06());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC2654ae.A07, 0, AbstractC2654ae.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        C2518Wg c2518WgA02 = this.A09.A02(getAdDataBundle());
        c2658ai.A06().A0H().A00(c2518WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A09);
        if (this.A00 != null) {
            if (c2518WgA02.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1W(view);
                    }
                });
            } else if (U7.A1I(getAdContextWrapper())) {
                AbstractC2608Zs.A00(this.A00, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2660ak(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A0C() {
        return this.A01 && super.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A0D() {
        return this.A01 && super.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2204Jw, com.facebook.ads.redexgen.core.AbstractC2654ae
    public final void A1G(C2274Mp c2274Mp, String str, double d10, Bundle bundle) {
        super.A1G(c2274Mp, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            int mediaHeight = (int) (((double) (A04 - (AbstractC2654ae.A07 * 2))) / d10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i10 = AbstractC2654ae.A07;
            int mediaHeight2 = AbstractC2654ae.A07;
            layoutParams.setMargins(i10, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A1M() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2204Jw
    public final AbstractC2611Zv A1P(C2658ai c2658ai, C2274Mp c2274Mp, String str) {
        return new C2206Jy(c2658ai.A06(), getCtaButton(), AbstractC2204Jw.A0H, c2274Mp.A0I().A00() == EnumC2279Mu.A05, getColors(), c2274Mp.A0J().A06(), str, c2658ai.A07(), c2658ai.A0D(), c2658ai.A0G(), c2658ai.A0A(), c2658ai.A05());
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A00(0, 5, 11));
    }
}
