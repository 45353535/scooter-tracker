package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.lnr.tvp;
import com.taurusx.tax.ui.CircularProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements View.OnTouchListener {
    private long lnr;
    private boolean mml;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mo;
    private tvp mzz;
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16354ud;

    public ud(tvp tvpVar, com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar) {
        this.mzz = tvpVar;
        this.mo = jpcVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lnr = System.currentTimeMillis();
            this.qdl = motionEvent.getX();
            this.f16354ud = motionEvent.getY();
            this.mzz.mzz();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.qdl) >= com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), 10.0f) || Math.abs(y10 - this.f16354ud) >= com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), 10.0f)) {
                    this.mml = true;
                    this.mzz.mo();
                }
            }
        } else {
            if (this.mml) {
                return false;
            }
            if (System.currentTimeMillis() - this.lnr >= CircularProgressBar.E) {
                com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar = this.mo;
                if (jpcVar != null) {
                    jpcVar.qdl();
                }
            } else {
                this.mzz.mo();
            }
        }
        return true;
    }
}
