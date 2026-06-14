package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes9.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private float d(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = 0.85f * f11;
        if (fMax > f13) {
            fMax = Math.max(f13, f12 * 1.2f);
        }
        return Math.min(f11, fMax);
    }

    private KeylineState e(int i10, float f10, float f11, int i11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f11);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f11, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f12, f11, f10);
        float f15 = f12 / 2.0f;
        float f16 = (f14 + 0.0f) - f15;
        float f17 = f16 + f15;
        float f18 = fMin / 2.0f;
        float f19 = (i11 * f11) + f17;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f11, i10).addAnchorKeyline((f16 - f15) - f18, childMaskPercentage, fMin).addKeyline(f16, childMaskPercentage2, f12, false).addKeylineRange((f11 / 2.0f) + f17, 0.0f, f11, i11, true);
        builderAddKeylineRange.addKeyline(f15 + f19, childMaskPercentage2, f12, false);
        builderAddKeylineRange.addAnchorKeyline(f19 + f12 + f18, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState f(Context context, float f10, int i10, float f11, int i11, float f12, int i12, float f13) {
        float fMin = Math.min(f13, f11);
        float fMax = Math.max(fMin, 0.5f * f12);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f11, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f11, f10);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f12, f11, f10);
        float f14 = (i11 * f11) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f11, i10).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f11 / 2.0f, 0.0f, f11, i11, true);
        if (i12 > 0) {
            float f15 = (f12 / 2.0f) + f14;
            f14 += f12;
            builderAddKeylineRange.addKeyline(f15, childMaskPercentage3, f12, false);
        }
        builderAddKeylineRange.addAnchorKeyline(f14 + (CarouselStrategyHelper.f(context) / 2.0f), childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    CarouselStrategy.StrategyType b() {
        return CarouselStrategy.StrategyType.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = measuredHeight;
        float f12 = f10;
        float f13 = f11 + f12;
        float f14 = CarouselStrategyHelper.f(view.getContext()) + f12;
        float f15 = CarouselStrategyHelper.f(view.getContext()) + f12;
        int iMax = Math.max(1, (int) Math.floor(r1 / f13));
        float f16 = containerWidth - (iMax * f13);
        if (carousel.getCarouselAlignment() == 1) {
            float f17 = f16 / 2.0f;
            return e(containerWidth, f12, f13, iMax, Math.max(Math.min(3.0f * f17, f13), getSmallItemSizeMin() + f12), f15, f17);
        }
        int i10 = 1;
        if (f16 <= 0.0f) {
            i10 = 0;
        }
        return f(view.getContext(), f12, containerWidth, f13, iMax, d(f14, f13, f16), i10, f15);
    }
}
