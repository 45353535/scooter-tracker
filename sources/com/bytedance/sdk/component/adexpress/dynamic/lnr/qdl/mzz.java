package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements View.OnTouchListener {
    private boolean lnr;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mml;
    private int mzz;
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16350ud;

    public mzz(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i10) {
        this.mml = jpcVar;
        this.mzz = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f16350ud = y10;
                if (Math.abs(y10 - this.qdl) > 10.0f) {
                    this.lnr = true;
                }
            }
        } else {
            if (!this.lnr) {
                return false;
            }
            int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(this.f16350ud - this.qdl));
            if (this.f16350ud - this.qdl < 0.0f && iUd > this.mzz && (jpcVar = this.mml) != null) {
                jpcVar.qdl();
                this.qdl = 0.0f;
                this.f16350ud = 0.0f;
                this.lnr = false;
            }
        }
        return true;
    }
}
