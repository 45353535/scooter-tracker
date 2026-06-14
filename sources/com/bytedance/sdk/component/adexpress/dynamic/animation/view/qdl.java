package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends TextView implements IAnimation {
    private float lnr;
    private float mml;
    private float mzz;
    lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16305ud;

    public qdl(Context context) {
        super(context);
        this.qdl = new lnr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f16305ud;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.mzz;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.qdl.qdl(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.qdl.qdl(this, i10, i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.mml = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.f16305ud = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.lnr = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.mzz = f10;
        this.qdl.qdl(this, f10);
    }
}
