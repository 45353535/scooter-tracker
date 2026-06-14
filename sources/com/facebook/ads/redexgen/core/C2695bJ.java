package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2695bJ extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final KE A02;
    public static final int A05 = (int) (AbstractC2523Wl.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC2523Wl.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC2523Wl.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC2523Wl.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC2523Wl.A02 * 4.0f);

    public C2695bJ(C2820dL c2820dL, KE ke2, AbstractC3095hy abstractC3095hy, US us, InterfaceC2551Xn interfaceC2551Xn, C2893eX c2893eX, XH xh2, C2283My c2283My, InterfaceC2620a4 interfaceC2620a4) {
        super(c2820dL);
        this.A00 = c2283My.A09(true);
        this.A01 = new RelativeLayout(c2820dL);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2820dL, abstractC3095hy.A20().A0J().A04());
        if (ke2 == null) {
            this.A02 = new KE(c2820dL, abstractC3095hy.A0r(), (C2283My) null, us, interfaceC2551Xn, c2893eX, xh2, abstractC3095hy.A21());
        } else {
            this.A02 = ke2;
        }
        A03();
        this.A02.setCta(abstractC3095hy.A20().A0J(), abstractC3095hy.A25(), new HashMap(), interfaceC2620a4);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C2820dL c2820dL, View view) {
        ImageView imageView = new ImageView(c2820dL);
        imageView.setImageBitmap(XY.A01(XX.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2820dL c2820dL, String str) {
        Button button = new Button(c2820dL);
        XP.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        XP.A0M(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c2820dL, button);
    }

    public final ME A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC3095hy abstractC3095hy, AbstractC2550Xm abstractC2550Xm) {
        this.A02.A0F(abstractC3095hy, abstractC2550Xm);
    }

    public void setCta(C2284Mz c2284Mz, String str, HashMap<String, String> extras, InterfaceC2620a4 interfaceC2620a4) {
        this.A02.setCta(c2284Mz, str, extras, interfaceC2620a4);
    }
}
