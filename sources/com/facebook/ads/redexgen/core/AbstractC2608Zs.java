package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2608Zs {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC2607Zr viewOnClickListenerC2607Zr = new ViewOnClickListenerC2607Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2607Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC2606Zq(viewOnClickListenerC2607Zr));
        }
    }
}
