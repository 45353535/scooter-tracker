package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2691bF implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC2691bF(JR jr) {
        this.A00 = jr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07 != null) {
                this.A00.A07.A9d();
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
