package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public class RotationLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34078b;

    public RotationLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f34078b;
        if (i10 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i10 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i10 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12 = this.f34078b;
        if (i12 != 1 && i12 != 3) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, i11);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i10) {
        this.f34078b = ((i10 + 360) % 360) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
