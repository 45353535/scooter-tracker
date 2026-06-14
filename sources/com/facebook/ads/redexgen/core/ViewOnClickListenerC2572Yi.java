package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2572Yi implements View.OnClickListener {
    public final /* synthetic */ LV A00;

    public ViewOnClickListenerC2572Yi(LV lv) {
        this.A00 = lv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A4w();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
