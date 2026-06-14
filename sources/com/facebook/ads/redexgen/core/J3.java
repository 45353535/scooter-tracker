package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC2604Zo {
    public final /* synthetic */ C2174Is A00;

    public J3(C2174Is c2174Is) {
        this.A00 = c2174Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2604Zo
    public final void ADT(C2603Zn c2603Zn) {
        if (this.A00.A02 != null && c2603Zn.A00() != null) {
            this.A00.A02.setImageBitmap(c2603Zn.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
