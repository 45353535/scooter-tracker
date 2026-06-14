package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* JADX INFO: loaded from: classes9.dex */
public class CircularRevealGridLayout extends GridLayout implements CircularRevealWidget {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CircularRevealHelper f26001b;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
        this.f26001b.buildCircularRevealCache();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.f26001b.destroyCircularRevealCache();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public void draw(@NonNull Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f26001b;
        if (circularRevealHelper != null) {
            circularRevealHelper.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f26001b.getCircularRevealOverlayDrawable();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.f26001b.getCircularRevealScrimColor();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.f26001b.getRevealInfo();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f26001b;
        return circularRevealHelper != null ? circularRevealHelper.isOpaque() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f26001b.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int i10) {
        this.f26001b.setCircularRevealScrimColor(i10);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        this.f26001b.setRevealInfo(revealInfo);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26001b = new CircularRevealHelper(this);
    }
}
