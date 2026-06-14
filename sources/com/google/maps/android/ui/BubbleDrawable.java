package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.google.maps.android.R;

/* JADX INFO: loaded from: classes9.dex */
class BubbleDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f34066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f34067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34068c = -1;

    public BubbleDrawable(Context context) {
        this.f34067b = ContextCompat.getDrawable(context, R.drawable.amu_bubble_mask);
        this.f34066a = ContextCompat.getDrawable(context, R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f34067b.draw(canvas);
        canvas.drawColor(this.f34068c, PorterDuff.Mode.SRC_IN);
        this.f34066a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f34067b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f34067b.setBounds(i10, i11, i12, i13);
        this.f34066a.setBounds(i10, i11, i12, i13);
    }

    public void setColor(int i10) {
        this.f34068c = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f34067b.setBounds(rect);
        this.f34066a.setBounds(rect);
    }
}
