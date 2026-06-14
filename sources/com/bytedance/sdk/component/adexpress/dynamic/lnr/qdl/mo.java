package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements View.OnTouchListener {
    private static int lnr = 10;
    private boolean mml;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mzz;
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16349ud;

    public mo(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar) {
        this.mzz = jpcVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.f16349ud = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.qdl) >= lnr || Math.abs(y10 - this.f16349ud) >= lnr) {
                    this.mml = true;
                }
            } else if (action == 3) {
                this.mml = false;
            }
        } else {
            if (this.mml) {
                this.mml = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.qdl) >= lnr || Math.abs(y11 - this.f16349ud) >= lnr) {
                this.mml = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar = this.mzz;
                if (jpcVar != null) {
                    jpcVar.qdl();
                }
            }
        }
        return true;
    }
}
