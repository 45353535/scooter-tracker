package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class jpc implements View.OnTouchListener {
    private final int lnr = 10;
    private float mml;
    private float mo;
    private float mzz;
    private final com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f16343ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16344wd;

    public jpc(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, boolean z10) {
        this.qdl = jpcVar;
        this.f16343ud = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mml = motionEvent.getX();
            this.mzz = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.mzz);
        } else if (action == 1) {
            this.mo = motionEvent.getX();
            this.f16344wd = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.f16344wd);
            if (this.f16343ud || (jpcVar2 = this.qdl) == null) {
                float f10 = this.mo - this.mml;
                float f11 = this.f16344wd - this.mzz;
                if (com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs((float) Math.sqrt((f10 * f10) + (f11 * f11)))) > 10.0f && (jpcVar = this.qdl) != null) {
                    jpcVar.qdl();
                }
            } else {
                jpcVar2.qdl();
            }
        }
        return true;
    }
}
