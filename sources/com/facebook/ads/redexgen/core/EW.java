package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EW extends C2635aL {
    public final ImageView A00;
    public final C2820dL A01;

    public EW(C2820dL c2820dL) {
        super(c2820dL);
        this.A01 = c2820dL;
        setRadius(30);
        this.A00 = new ImageView(c2820dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C2603Zn c2603Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC2604Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.facebook.ads.redexgen.core.InterfaceC2604Zo
            public final void ADT(C2603Zn c2603Zn) {
                this.A00.A00(c2603Zn);
            }
        });
    }
}
