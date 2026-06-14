package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2630aG implements View.OnClickListener {
    public final /* synthetic */ C2632aI A00;

    public ViewOnClickListenerC2630aG(C2632aI c2632aI) {
        this.A00 = c2632aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
