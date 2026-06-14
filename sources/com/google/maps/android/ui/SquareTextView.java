package com.google.maps.android.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"AppCompatCustomView"})
public class SquareTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34080c;

    public SquareTextView(Context context) {
        super(context);
        this.f34079b = 0;
        this.f34080c = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f34080c / 2, this.f34079b / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f34079b = measuredWidth - measuredHeight;
            this.f34080c = 0;
        } else {
            this.f34079b = 0;
            this.f34080c = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34079b = 0;
        this.f34080c = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34079b = 0;
        this.f34080c = 0;
    }
}
