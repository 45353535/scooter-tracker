package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(22)
class ShapeableDelegateV22 extends ShapeableDelegate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27601f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27602g = 0.0f;

    ShapeableDelegateV22(View view) {
        g(view);
    }

    private float f() {
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel = this.f27598c;
        if (shapeAppearanceModel == null || (rectF = this.f27599d) == null) {
            return 0.0f;
        }
        return shapeAppearanceModel.f27538f.getCornerSize(rectF);
    }

    @DoNotInline
    private void g(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV22.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                ShapeableDelegateV22 shapeableDelegateV22 = ShapeableDelegateV22.this;
                if (shapeableDelegateV22.f27598c == null || shapeableDelegateV22.f27599d.isEmpty()) {
                    return;
                }
                ShapeableDelegateV22 shapeableDelegateV222 = ShapeableDelegateV22.this;
                RectF rectF = shapeableDelegateV222.f27599d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, shapeableDelegateV222.f27602g);
            }
        });
    }

    private boolean h() {
        ShapeAppearanceModel shapeAppearanceModel;
        if (this.f27599d.isEmpty() || (shapeAppearanceModel = this.f27598c) == null) {
            return false;
        }
        return shapeAppearanceModel.isRoundRect(this.f27599d);
    }

    private boolean i() {
        ShapeAppearanceModel shapeAppearanceModel;
        if (!this.f27599d.isEmpty() && (shapeAppearanceModel = this.f27598c) != null && this.f27597b && !shapeAppearanceModel.isRoundRect(this.f27599d) && j(this.f27598c)) {
            float cornerSize = this.f27598c.getTopLeftCornerSize().getCornerSize(this.f27599d);
            float cornerSize2 = this.f27598c.getTopRightCornerSize().getCornerSize(this.f27599d);
            float cornerSize3 = this.f27598c.getBottomLeftCornerSize().getCornerSize(this.f27599d);
            float cornerSize4 = this.f27598c.getBottomRightCornerSize().getCornerSize(this.f27599d);
            if (cornerSize == 0.0f && cornerSize3 == 0.0f && cornerSize2 == cornerSize4) {
                RectF rectF = this.f27599d;
                rectF.set(rectF.left - cornerSize2, rectF.top, rectF.right, rectF.bottom);
                this.f27602g = cornerSize2;
                return true;
            }
            if (cornerSize == 0.0f && cornerSize2 == 0.0f && cornerSize3 == cornerSize4) {
                RectF rectF2 = this.f27599d;
                rectF2.set(rectF2.left, rectF2.top - cornerSize3, rectF2.right, rectF2.bottom);
                this.f27602g = cornerSize3;
                return true;
            }
            if (cornerSize2 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize3) {
                RectF rectF3 = this.f27599d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + cornerSize, rectF3.bottom);
                this.f27602g = cornerSize;
                return true;
            }
            if (cornerSize3 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize2) {
                RectF rectF4 = this.f27599d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + cornerSize);
                this.f27602g = cornerSize;
                return true;
            }
        }
        return false;
    }

    private static boolean j(ShapeAppearanceModel shapeAppearanceModel) {
        return (shapeAppearanceModel.getTopLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getTopRightCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getBottomLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel.getBottomRightCorner() instanceof RoundedCornerTreatment);
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void a(View view) {
        this.f27602g = f();
        this.f27601f = h() || i();
        view.setClipToOutline(!c());
        if (c()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean c() {
        return !this.f27601f || this.f27596a;
    }
}
