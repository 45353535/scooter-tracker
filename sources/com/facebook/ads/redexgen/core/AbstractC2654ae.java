package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2654ae extends RelativeLayout {
    public C2283My A00;
    public boolean A01;
    public final C2820dL A02;
    public final US A03;
    public final KE A04;
    public final C2640aQ A05;
    public final C2658ai A06;
    public static final int A07 = (int) (AbstractC2523Wl.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC2523Wl.A02 * 28.0f);
    public static final int A0B = (int) (AbstractC2523Wl.A02 * 2.0f);
    public static final int A0E = (int) (AbstractC2523Wl.A02 * 4.0f);
    public static final int A0I = (int) (AbstractC2523Wl.A02 * 8.0f);
    public static final int A09 = (int) (AbstractC2523Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC2523Wl.A02 * 16.0f);
    public static final int A0C = (int) (AbstractC2523Wl.A02 * 20.0f);
    public static final int A0D = (int) (AbstractC2523Wl.A02 * 24.0f);
    public static final int A0F = (int) (AbstractC2523Wl.A02 * 44.0f);
    public static final int A0G = (int) (AbstractC2523Wl.A02 * 48.0f);
    public static final int A0H = (int) (AbstractC2523Wl.A02 * 64.0f);
    public static final int A0J = (int) (AbstractC2523Wl.A02 * 32.0f);

    public abstract boolean A1M();

    public AbstractC2654ae(C2658ai c2658ai, boolean z10) {
        C2283My c2283MyA00;
        super(c2658ai.A06());
        this.A06 = c2658ai;
        this.A02 = c2658ai.A06();
        this.A03 = c2658ai.A07();
        if (c2658ai.A00() == 1) {
            c2283MyA00 = c2658ai.A05().A1z().A01();
        } else {
            c2283MyA00 = c2658ai.A05().A1z().A00();
        }
        this.A00 = c2283MyA00;
        this.A01 = z10;
        this.A04 = new KE(c2658ai.A06(), c2658ai.A05(), this.A00, c2658ai.A07(), c2658ai.A0D(), c2658ai.A0G(), c2658ai.A0A(), c2658ai.A09());
        this.A04.setRoundedCornersEnabled(A01());
        this.A04.setViewShowsOverMedia(A0C());
        XP.A0E(1001, this.A04);
        this.A05 = new C2640aQ(this.A02, this.A00, this.A01, A02(), A0D());
        XP.A0I(this.A05);
    }

    public final ImageView A00(C2820dL c2820dL, AbstractC3095hy abstractC3095hy, C2463Ua c2463Ua, Z5 z52, InterfaceC2551Xn interfaceC2551Xn, Handler handler) {
        ImageView imageViewA01 = Z9.A01(c2820dL, c2463Ua, abstractC3095hy, z52, interfaceC2551Xn, handler);
        XP.A0I(imageViewA01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0A, 0, 0, A0A);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        imageViewA01.setLayoutParams(layoutParams);
        return imageViewA01;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public final boolean A03() {
        return this.A06.A05().A1m() || this.A06.A05().A1o();
    }

    public boolean A0C() {
        return true;
    }

    public boolean A0D() {
        return true;
    }

    public ME A1A(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1B() {
    }

    public void A1C() {
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G(C2274Mp c2274Mp, String str, double d10, Bundle bundle) {
        this.A05.A04(c2274Mp.A0I().A0E(), c2274Mp.A0I().A04(), null, false, !A1M() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c2274Mp.A0J(), str, new HashMap());
    }

    public void A1H(C17863d c17863d) {
    }

    public void A1I(DO r12) {
    }

    public void A1J(C3Q c3q, int i10) {
    }

    public boolean A1K() {
        return false;
    }

    public boolean A1L() {
        return true;
    }

    public boolean A1N(boolean z10) {
        return false;
    }

    public C2820dL getAdContextWrapper() {
        return this.A02;
    }

    public US getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C2283My getColors() {
        return this.A00;
    }

    public KE getCtaButton() {
        return this.A04;
    }

    public C2640aQ getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C2283My c2283MyA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c2283MyA00 = this.A06.A05().A1z().A01();
        } else {
            c2283MyA00 = this.A06.A05().A1z().A00();
        }
        this.A00 = c2283MyA00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(MF mf2) {
        getCtaButton().getCtaActionHelper().A07(mf2);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z10) {
    }
}
