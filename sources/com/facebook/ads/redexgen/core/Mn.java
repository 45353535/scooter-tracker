package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Mn extends AbstractC2611Zv {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC2523Wl.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC2523Wl.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC2523Wl.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC2523Wl.A02 * 4.0f);

    public Mn(C2820dL c2820dL, int i10, C2283My c2283My, boolean z10, String str, US us, InterfaceC2551Xn interfaceC2551Xn, C2893eX c2893eX, XH xh2, N3 n32) {
        super(c2820dL, null, i10, c2283My, z10, str, us, interfaceC2551Xn, c2893eX, xh2, n32, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC2611Zv.A0B);
        linearLayout.addView(this.A00, AbstractC2611Zv.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        XP.A0W(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2611Zv
    public final void A0g() {
        super.A0g();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2611Zv
    public final void A0h(int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2611Zv
    public void setInfo(C2281Mw c2281Mw, C2284Mz c2284Mz, String str, String str2, InterfaceC2533Wv interfaceC2533Wv, InterfaceC2620a4 interfaceC2620a4) {
        super.setInfo(c2281Mw, c2284Mz, str, str2, interfaceC2533Wv, interfaceC2620a4);
        this.A01.setText(c2281Mw.A0F());
        this.A00.setText(c2281Mw.A0E());
        if (TextUtils.isEmpty(c2284Mz.A04())) {
            XP.A0F(this.A08);
        }
    }
}
