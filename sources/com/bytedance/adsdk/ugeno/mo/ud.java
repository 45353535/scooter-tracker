package com.bytedance.adsdk.ugeno.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl<com.bytedance.adsdk.ugeno.ud.lnr> {
    private com.bytedance.adsdk.ugeno.mml mml;

    public ud(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml mmlVar) {
        this.mml = mmlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mo.qdl
    public View to(int i10) {
        return ((com.bytedance.adsdk.ugeno.ud.lnr) this.qdl.get(i10)).rq();
    }
}
