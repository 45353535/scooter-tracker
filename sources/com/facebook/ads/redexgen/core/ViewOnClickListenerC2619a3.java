package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2619a3 implements View.OnClickListener {
    public final /* synthetic */ KG A00;

    public ViewOnClickListenerC2619a3(KG kg2) {
        this.A00 = kg2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
        }
    }
}
