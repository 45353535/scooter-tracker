package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2581Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C2571Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC2581Yr(LU lu, C2571Yh c2571Yh, O6 o62) {
        this.A02 = lu;
        this.A01 = c2571Yh;
        this.A00 = o62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
