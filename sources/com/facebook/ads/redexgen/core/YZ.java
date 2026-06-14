package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C2566Yc A00;

    public YZ(C2566Yc c2566Yc) {
        this.A00 = c2566Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4v();
            } else {
                this.A00.A04.A4w();
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
