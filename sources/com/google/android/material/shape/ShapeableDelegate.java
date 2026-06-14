package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ShapeableDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ShapeAppearanceModel f27598c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f27596a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f27597b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RectF f27599d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f27600e = new Path();

    private boolean b() {
        RectF rectF = this.f27599d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    @NonNull
    public static ShapeableDelegate create(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(view) : new ShapeableDelegateV22(view);
    }

    private void d() {
        if (!b() || this.f27598c == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.f27598c, 1.0f, this.f27599d, this.f27600e);
    }

    abstract void a(View view);

    abstract boolean c();

    public boolean isForceCompatClippingEnabled() {
        return this.f27596a;
    }

    public void maybeClip(@NonNull Canvas canvas, @NonNull CanvasCompat.CanvasOperation canvasOperation) {
        if (!c() || this.f27600e.isEmpty()) {
            canvasOperation.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f27600e);
        canvasOperation.run(canvas);
        canvas.restore();
    }

    public void onMaskChanged(@NonNull View view, @NonNull RectF rectF) {
        this.f27599d = rectF;
        d();
        a(view);
    }

    public void onShapeAppearanceChanged(@NonNull View view, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f27598c = shapeAppearanceModel;
        d();
        a(view);
    }

    public void setForceCompatClippingEnabled(@NonNull View view, boolean z10) {
        if (z10 != this.f27596a) {
            this.f27596a = z10;
            a(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@NonNull View view, boolean z10) {
        this.f27597b = z10;
        a(view);
    }
}
