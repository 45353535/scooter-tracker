package com.facebook.ads.redexgen.core;

import android.view.View;
import com.taurusx.tax.ui.CircularProgressBar;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2615Zz implements View.OnClickListener {
    public final /* synthetic */ KL A00;

    public ViewOnClickListenerC2615Zz(KL kl) {
        this.A00 = kl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0H.getVisibility() != 8) {
                this.A00.A0U();
                this.A00.A0F.removeCallbacks(this.A00.A0V);
                this.A00.A0p(8);
            } else {
                this.A00.A0p(0);
                this.A00.A0F.postDelayed(this.A00.A0V, CircularProgressBar.E);
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
