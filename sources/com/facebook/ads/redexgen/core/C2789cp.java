package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2789cp extends FrameLayout {
    public static final int A08 = (int) (AbstractC2523Wl.A02 * 16.0f);
    public C18595y A00;
    public EG A01;
    public C17913i A02;
    public D1 A03;
    public C17722p A04;
    public C2R A05;
    public final C2820dL A06;
    public final C2463Ua A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(US us, String str, Map<String, String> map) {
        A02();
        this.A02 = new C17913i(this.A06, us, this.A00, str, null, map);
        if (U7.A1v(this.A06)) {
            this.A01 = new EG(this.A06, us, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C2789cp(C2820dL c2820dL, C2463Ua c2463Ua) {
        super(c2820dL);
        this.A07 = c2463Ua;
        this.A06 = c2820dL;
        setUpView(c2820dL);
    }

    public final void A01() {
        A0l(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC2443Tf abstractC2443Tf) {
        getEventBus().A05(abstractC2443Tf);
    }

    public final void A05(EnumC2836db enumC2836db) {
        A0h(enumC2836db, 13);
    }

    public final boolean A06() {
        return A0s();
    }

    public E1 getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C2820dL c2820dL) {
        A0b();
        this.A04 = new C17722p(c2820dL);
        A0i(this.A04);
        this.A03 = new D1(c2820dL, this.A07);
        A0i(new C3D(c2820dL));
        A0i(this.A03);
        this.A05 = new C2R(c2820dL, true, this.A07);
        A0i(this.A05);
        A0i(new D4(this.A05, EnumC2851dr.A02, true, true));
        if (!A0n()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.5y] */
    private void setUpVideo(final C2820dL c2820dL) {
        this.A00 = new E1(c2820dL) { // from class: com.facebook.ads.redexgen.X.5y
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i10, int i11) {
                int newWidthSpec = View.MeasureSpec.getMode(i10);
                if (newWidthSpec == 1073741824) {
                    i11 = i10;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i11);
                    if (newWidthSpec2 == 1073741824) {
                        i10 = i11;
                    }
                }
                super.onMeasure(i10, i11);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        XP.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC2788co(this));
    }

    private void setUpView(C2820dL c2820dL) {
        setUpVideo(c2820dL);
        setUpPlugins(c2820dL);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f10) {
        setVolume(f10);
        this.A03.A09();
    }
}
