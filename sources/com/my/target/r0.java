package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public class r0 extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientDrawable f60696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60697b;

    public r0(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11) {
        a(i10, i11, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f60696a.setBounds(getPaddingLeft() - this.f60697b, getPaddingTop(), getWidth(), getHeight());
        this.f60696a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth() + (this.f60697b * 2), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f60696a.setColor(i10);
        invalidate();
    }

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i10, int i11, int i12) {
        this.f60696a.setStroke(i10, i11);
        this.f60696a.setCornerRadius(i12);
        invalidate();
    }

    public r0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f60696a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.f60697b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }
}
