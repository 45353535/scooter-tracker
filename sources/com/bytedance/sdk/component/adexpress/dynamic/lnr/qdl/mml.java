package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements View.OnTouchListener {
    private boolean jpc;
    private float lnr;
    private float mml;
    private float mo;
    private boolean mzz = true;
    private float qdl;
    private boolean rq;
    private int to;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16347ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16348wd;

    public mml(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i10, boolean z10) {
        this.tvp = jpcVar;
        this.to = i10;
        this.rq = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar2;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.f16347ud = motionEvent.getY();
            this.mo = motionEvent.getY();
            this.mzz = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f16348wd = y10;
                if (Math.abs(y10 - this.mo) > 10.0f) {
                    this.jpc = true;
                }
                this.mml = motionEvent.getX();
                this.lnr = motionEvent.getY();
                if (Math.abs(this.mml - this.qdl) > 8.0f || Math.abs(this.lnr - this.f16347ud) > 8.0f) {
                    this.mzz = false;
                }
            }
        } else {
            if (!this.jpc && !this.mzz) {
                return false;
            }
            if (this.rq || (jpcVar3 = this.tvp) == null) {
                int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(this.f16348wd - this.mo));
                if (this.f16348wd - this.mo < 0.0f && iUd > this.to && (jpcVar2 = this.tvp) != null) {
                    jpcVar2.qdl();
                } else if (this.mzz && (jpcVar = this.tvp) != null) {
                    jpcVar.qdl();
                }
            } else {
                jpcVar3.qdl();
            }
        }
        return true;
    }
}
