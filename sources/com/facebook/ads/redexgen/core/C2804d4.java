package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2804d4 {
    public KE A00;
    public final C2271Ml A01;
    public final C2281Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C2820dL A05;
    public final C2463Ua A06;
    public static final int A09 = (int) (AbstractC2523Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC2523Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC2523Wl.A02 * 8.0f);

    public C2804d4(C2820dL c2820dL, US us, AbstractC3095hy abstractC3095hy) {
        this.A05 = c2820dL;
        this.A06 = new C2463Ua(abstractC3095hy.A25(), us);
        this.A01 = abstractC3095hy.A1z();
        this.A02 = abstractC3095hy.A20().A0I();
        this.A04 = abstractC3095hy.A23();
        this.A03 = abstractC3095hy.A20().A0K();
    }

    private View A00(KE ke2) {
        C2640aQ c2640aQ = new C2640aQ(this.A05, this.A01.A01(), true, false, false);
        c2640aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c2640aQ.setAlignment(17);
        C2634aK c2634aK = new C2634aK(this.A05);
        XP.A0K(c2634aK, 0);
        c2634aK.setRadius(50);
        new KZ(c2634aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2634aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2640aQ, layoutParams);
        if (ke2 != null) {
            XP.A0H(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        return linearLayout;
    }

    private C18676g A01() {
        C18676g c18676g = new C18676g(this.A05);
        c18676g.setLayoutManager(new C3000gI(this.A05, 0, false));
        c18676g.setAdapter(new C2054Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c18676g;
    }

    private final EnumC2803d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC2803d3.A03;
        }
        return EnumC2803d3.A02;
    }

    public final Pair<EnumC2803d3, View> A03(KE ke2) {
        View viewA01;
        this.A00 = ke2;
        EnumC2803d3 enumC2803d3A02 = A02();
        switch (C2802d2.A00[enumC2803d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC2465Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC2803d3A02, viewA01);
    }
}
