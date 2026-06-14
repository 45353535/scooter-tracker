package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC2606Zq implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC2607Zr A00;

    public ViewOnTouchListenerC2606Zq(ViewOnClickListenerC2607Zr viewOnClickListenerC2607Zr) {
        this.A00 = viewOnClickListenerC2607Zr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
