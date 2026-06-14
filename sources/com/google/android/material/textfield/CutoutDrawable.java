package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
class CutoutDrawable extends MaterialShapeDrawable {
    CutoutDrawableState K;

    private static class ImplApi18 extends CutoutDrawable {
        ImplApi18(CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void u(Canvas canvas) {
            if (this.K.f27935x.isEmpty()) {
                super.u(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.K.f27935x);
            } else {
                canvas.clipRect(this.K.f27935x, Region.Op.DIFFERENCE);
            }
            super.u(canvas);
            canvas.restore();
        }
    }

    static CutoutDrawable M(ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return N(new CutoutDrawableState(shapeAppearanceModel, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CutoutDrawable N(CutoutDrawableState cutoutDrawableState) {
        return new ImplApi18(cutoutDrawableState);
    }

    boolean O() {
        return !this.K.f27935x.isEmpty();
    }

    void P() {
        Q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void Q(float f10, float f11, float f12, float f13) {
        if (f10 == this.K.f27935x.left && f11 == this.K.f27935x.top && f12 == this.K.f27935x.right && f13 == this.K.f27935x.bottom) {
            return;
        }
        this.K.f27935x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void R(RectF rectF) {
        Q(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.K = new CutoutDrawableState(this.K);
        return this;
    }

    private static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f27935x;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            CutoutDrawable cutoutDrawableN = CutoutDrawable.N(this);
            cutoutDrawableN.invalidateSelf();
            return cutoutDrawableN;
        }

        private CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel, null);
            this.f27935x = rectF;
        }

        private CutoutDrawableState(CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.f27935x = cutoutDrawableState.f27935x;
        }
    }

    private CutoutDrawable(CutoutDrawableState cutoutDrawableState) {
        super(cutoutDrawableState);
        this.K = cutoutDrawableState;
    }
}
