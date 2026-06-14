package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f26693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f26694c;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
        this.f26694c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f26693b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f26693b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @NonNull
    public float[] getCornerRadii() {
        return this.f26694c;
    }

    public void resetClipBoundsAndCornerRadii() {
        this.f26693b = null;
        this.f26694c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void updateClipBoundsAndCornerRadii(@NonNull Rect rect, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void updateCornerRadii(@NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public void updateClipBoundsAndCornerRadii(float f10, float f11, float f12, float f13, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(new RectF(f10, f11, f12, f13), fArr);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26694c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void updateClipBoundsAndCornerRadii(@NonNull RectF rectF, @NonNull float[] fArr) {
        if (this.f26693b == null) {
            this.f26693b = new Path();
        }
        this.f26694c = fArr;
        this.f26693b.reset();
        this.f26693b.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.f26693b.close();
        invalidate();
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26694c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
