package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* JADX INFO: loaded from: classes9.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements CircularRevealWidget {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CircularRevealHelper f26014b;

    public CircularRevealCoordinatorLayout(@NonNull Context context) {
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
        this.f26014b.buildCircularRevealCache();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.f26014b.destroyCircularRevealCache();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f26014b;
        if (circularRevealHelper != null) {
            circularRevealHelper.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f26014b.getCircularRevealOverlayDrawable();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.f26014b.getCircularRevealScrimColor();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.f26014b.getRevealInfo();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f26014b;
        return circularRevealHelper != null ? circularRevealHelper.isOpaque() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f26014b.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int i10) {
        this.f26014b.setCircularRevealScrimColor(i10);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        this.f26014b.setRevealInfo(revealInfo);
    }

    public CircularRevealCoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26014b = new CircularRevealHelper(this);
    }
}
