package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
abstract class CarouselOrientationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f25848a;

    private static CarouselOrientationHelper a(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f10 = rectF2.left;
                float f11 = rectF3.left;
                if (f10 < f11 && rectF2.right > f11) {
                    float f12 = f11 - f10;
                    rectF.left += f12;
                    rectF2.left += f12;
                }
                float f13 = rectF2.right;
                float f14 = rectF3.right;
                if (f13 <= f14 || rectF2.left >= f14) {
                    return;
                }
                float f15 = f13 - f14;
                rectF.right = Math.max(rectF.right - f15, rectF.left);
                rectF2.right = Math.max(rectF2.right - f15, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int d() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int e() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int f() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int g() {
                return carouselLayoutManager.M() ? f() : e();
            }

            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f10, float f11, float f12, float f13) {
                return new RectF(f13, 0.0f, f11 - f13, f10);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int h() {
                return carouselLayoutManager.getPaddingTop();
            }

            int i(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i10, int i11) {
                int iH = h();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i10, iH, i11, iH + i(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.right = fFloor;
                    rectF.left = Math.min(rectF.left, fFloor);
                }
                if (rectF2.left >= rectF3.right) {
                    float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.left = fCeil;
                    rectF.right = Math.max(fCeil, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f10, float f11) {
                view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
            }
        };
    }

    static CarouselOrientationHelper b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static CarouselOrientationHelper c(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f10 = rectF2.top;
                float f11 = rectF3.top;
                if (f10 < f11 && rectF2.bottom > f11) {
                    float f12 = f11 - f10;
                    rectF.top += f12;
                    rectF3.top += f12;
                }
                float f13 = rectF2.bottom;
                float f14 = rectF3.bottom;
                if (f13 <= f14 || rectF2.top >= f14) {
                    return;
                }
                float f15 = f13 - f14;
                rectF.bottom = Math.max(rectF.bottom - f15, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f15, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int d() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int e() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int f() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int g() {
                return h();
            }

            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f10, float f11, float f12, float f13) {
                return new RectF(0.0f, f12, f11, f10 - f12);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int h() {
                return 0;
            }

            int i(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i10, int i11) {
                int iE = e();
                carouselLayoutManager.layoutDecoratedWithMargins(view, iE, i10, iE + i(view), i11);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.bottom = fFloor;
                    rectF.top = Math.min(rectF.top, fFloor);
                }
                if (rectF2.top >= rectF3.bottom) {
                    float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.top = fCeil;
                    rectF.bottom = Math.max(fCeil, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f10, float f11) {
                view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
            }
        };
    }

    abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract int d();

    abstract int e();

    abstract int f();

    abstract int g();

    abstract RectF getMaskRect(float f10, float f11, float f12, float f13);

    abstract int h();

    abstract void layoutDecoratedWithMargins(View view, int i10, int i11);

    abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void offsetChild(View view, Rect rect, float f10, float f11);

    private CarouselOrientationHelper(int i10) {
        this.f25848a = i10;
    }
}
