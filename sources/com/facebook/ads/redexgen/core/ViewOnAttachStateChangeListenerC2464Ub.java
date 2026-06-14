package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC2464Ub implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UZ A00;
    public final /* synthetic */ C2463Ua A01;

    public ViewOnAttachStateChangeListenerC2464Ub(C2463Ua c2463Ua, UZ uz) {
        this.A01 = c2463Ua;
        this.A00 = uz;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
