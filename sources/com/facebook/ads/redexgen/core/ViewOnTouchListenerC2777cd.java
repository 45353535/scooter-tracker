package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC2777cd implements View.OnTouchListener {
    public final /* synthetic */ C18003r A00;

    public ViewOnTouchListenerC2777cd(C18003r c18003r) {
        this.A00 = c18003r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getX() >= this.A00.A0H.getX() && motionEvent.getX() <= this.A00.A0H.getX() + this.A00.A0H.getWidth() && motionEvent.getY() >= this.A00.A0H.getY() && motionEvent.getY() <= this.A00.A0H.getY() + this.A00.A0H.getHeight()) {
            if (this.A00.A03 != null) {
                this.A00.A03.dispatchTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
