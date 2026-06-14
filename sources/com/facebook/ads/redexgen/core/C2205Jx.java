package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2205Jx extends AbstractC2654ae implements Wf {
    public static String[] A0E = {"CRyUSCOowkTfoe8xXMA5e17hdMg", "WkFBEVgF0nyPchlhdBM9PAwmOGJ", "zSHiyACtWS1MQDlmmeiywmMfEBCYqg8r", "a6voQfhnzW62WB0803n3akdQXSWLA", "ESev22IS7ntvGAjOW6Y11JRWDyKuDF5b", "qYjSUGFL2zXSYltHWao95ysggj7pRI", "zEaDWfefMQybHYLhUDvoHIQpUffGUNEN", "lLaoJShXnQXOT6Cok4oNwdKWfBYo0"};
    public static final int A0F = (int) (AbstractC2523Wl.A02 * 80.0f);
    public float A00;
    public C2810dA A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final View A05;
    public final RelativeLayout A06;
    public final RelativeLayout A07;
    public final AbstractC3095hy A08;
    public final AbstractC2550Xm A09;
    public final InterfaceC2551Xn A0A;
    public final KL A0B;
    public final AtomicBoolean A0C;
    public final C2519Wh A0D;

    public C2205Jx(C2658ai c2658ai) {
        super(c2658ai, true);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = false;
        this.A0C = new AtomicBoolean(false);
        this.A02 = true;
        this.A0A = c2658ai.A0D();
        this.A09 = c2658ai.A0C();
        this.A08 = c2658ai.A05();
        this.A0D = C2519Wh.A00(c2658ai.A06(), this.A08, this);
        this.A07 = new RelativeLayout(c2658ai.A06());
        this.A0B = A00(c2658ai, this.A08.A20(), this.A08.A0r());
        this.A06 = new RelativeLayout(c2658ai.A06());
        XP.A0I(this.A06);
        XP.A0I(this.A07);
        this.A05 = c2658ai.A02();
        A04();
        this.A07.addView(this.A06, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A07, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC2641aR.A00(c2658ai.A06(), this.A07, this.A08.A20().A0H().A08());
        this.A0B.setInfo(this.A08.A20().A0I(), this.A08.A20().A0J(), this.A08.A25(), this.A08.A23().A01(), null, null);
        A03();
        super.A06.A06().A0F().AJw(AbstractC2514Wa.A00(this.A00), getResources().getConfiguration().orientation, false, true, MH.A0C(super.A06.A04()));
    }

    private KL A00(C2658ai c2658ai, C2274Mp c2274Mp, String str) {
        KL adDetailsView;
        this.A00 = new SF(c2658ai.A06()).A0M(c2274Mp.A0H().A08());
        if (A08(this.A00)) {
            adDetailsView = new C18515q(c2658ai.A06(), getCtaButton(), A0F, false, getColors(), str, c2658ai.A07(), c2658ai.A0D(), c2658ai.A0G(), c2658ai.A0A(), c2658ai.A05(), c2658ai.A0F(), c2658ai.A08(), false);
        } else if (A09(this.A00)) {
            adDetailsView = new C18505p(c2658ai.A06(), getCtaButton(), A0F, false, getColors(), str, c2658ai.A07(), c2658ai.A0D(), c2658ai.A0G(), c2658ai.A0A(), c2658ai.A05(), c2658ai.A0F(), c2658ai.A08(), false);
        } else {
            adDetailsView = new C18525r(c2658ai.A06(), getCtaButton(), A0F, false, getColors(), str, c2658ai.A07(), c2658ai.A0D(), c2658ai.A0G(), c2658ai.A0A(), c2658ai.A05(), c2658ai.A0F(), c2658ai.A08(), false);
        }
        if (c2658ai.A0H() != null) {
            adDetailsView.setChainedAdInfo(c2658ai.A0H());
        }
        return adDetailsView;
    }

    private void A01() {
        C2670au c2670au = new C2670au(super.A06.A06(), this.A08, super.A06.A08(), this.A04, super.A06.A0D());
        c2670au.A0D(false);
        addView(c2670au.A09(getCtaButton()));
    }

    private void A02() {
        XP.A0Z(this.A0B);
        if (!this.A08.A20().A0K().A02().isEmpty()) {
            this.A01 = new C2810dA(super.A06.A06(), this.A08, this.A0A, getCtaButton(), this.A04, super.A06.A08());
            this.A01.A0a(false);
            addView(this.A01.A0T(), new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        A01();
    }

    private void A03() {
        XP.A0H(this.A0B);
        addView(this.A0B, new RelativeLayout.LayoutParams(-1, -1));
        this.A0B.setVisibility(0);
        A05(getResources().getConfiguration().orientation);
        this.A0B.A0q(getResources().getConfiguration().orientation);
        this.A0B.bringToFront();
    }

    private void A04() {
        if (this.A05 == null) {
            return;
        }
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        XP.A0I(this.A05);
        C2518Wg c2518WgA02 = this.A0D.A02(this.A08);
        super.A06.A06().A0H().A00(c2518WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0D);
        if (c2518WgA02.A00) {
            this.A05.setOnClickListener(new ViewOnClickListenerC2646aW(this));
        } else {
            if (!U7.A1I(getAdContextWrapper())) {
                return;
            }
            AbstractC2608Zs.A00(this.A05, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC2647aX(this));
        }
    }

    private void A05(int i10) {
        A06(i10);
        A07(i10, this.A07, this.A06);
    }

    private void A06(int i10) {
        if (this.A05 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i10 == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (A09(this.A00)) {
                layoutParams.addRule(13);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A05.setLayoutParams(layoutParams);
    }

    private final void A07(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if ((this.A0B instanceof C18525r) || (this.A0B instanceof C18515q)) {
            XP.A0H(this.A0B);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0B.setLayoutParams(layoutParams);
                String[] strArr = A0E;
                if (strArr[0].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0E[6] = "EmhBF28Af3az5oL74X7a9tytdWpdYPgl";
                viewGroup.addView(this.A0B);
            } else {
                addView(this.A0B, layoutParams);
            }
        }
        this.A0B.A0h(i10);
        this.A0B.A0s(viewGroup, relativeLayout, i10);
    }

    public static boolean A08(float f10) {
        return f10 <= 0.7f;
    }

    public static boolean A09(float f10) {
        return f10 >= 1.2f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final ME A1A(String str) {
        return this.A0B.getCTAButton().A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final void A1B() {
        super.A1B();
        this.A04.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final void A1G(C2274Mp c2274Mp, String str, double d10, Bundle bundle) {
        super.A1G(c2274Mp, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A1K() {
        return this.A08.A20().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public final boolean A1N(boolean z10) {
        if (this.A08.A20().A0V() && !this.A0C.get()) {
            A1O();
            return true;
        }
        return false;
    }

    public final void A1O() {
        this.A0C.set(true);
        XP.A0Z(this.A06, this.A0B, this.A07);
        XP.A0J(this.A09);
        XP.A0R(this);
        A02();
        this.A02 = true;
        if (super.A06.A0E() != null) {
            super.A06.A0E().AFE(true);
            if (this.A09 != null && this.A08.A20().A0K().A00() > 0) {
                this.A02 = false;
                if (this.A08.A2G()) {
                    this.A09.setToolbarActionMode(8);
                } else {
                    this.A09.setToolbarActionMode(2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2648aY(this), this.A08.A20().A0K().A00());
            }
        }
    }

    public final boolean A1P() {
        return this.A0C.get();
    }

    public final boolean A1Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public int getCloseButtonStyle() {
        if (this.A03) {
            if (this.A08.A2G()) {
                return 8;
            }
            return 2;
        }
        if (A1K() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A0C.get()) {
            this.A01.A0W(configuration.orientation);
            String[] strArr = A0E;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0E[6] = "qGsvoGIijzM6smaTEa50KnvmYJop2SBn";
            return;
        }
        A05(configuration.orientation);
    }
}
