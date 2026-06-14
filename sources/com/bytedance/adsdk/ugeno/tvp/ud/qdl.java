package com.bytedance.adsdk.ugeno.tvp.ud;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.mml;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends FrameLayout {
    private mml qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Map<Integer, exu> f16248ud;

    public qdl(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, exu> map = this.f16248ud;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mml mmlVar2 = this.qdl;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        mml mmlVar2 = this.qdl;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void qdl(mml mmlVar) {
        this.qdl = mmlVar;
    }

    public void setEventMap(Map<Integer, exu> map) {
        this.f16248ud = map;
    }
}
