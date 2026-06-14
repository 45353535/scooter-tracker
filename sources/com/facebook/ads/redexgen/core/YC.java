package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YC implements View.OnClickListener {
    public final /* synthetic */ C2236Lc A00;

    public YC(C2236Lc c2236Lc) {
        this.A00 = c2236Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0N.A04(UZ.A07, null);
            this.A00.A0Q.A4b(this.A00.A0R.A7o());
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
