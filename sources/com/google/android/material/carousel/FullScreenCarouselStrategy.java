package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        int i10;
        int i11;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f10 = i10 + i11;
        float f11 = containerHeight;
        return CarouselStrategyHelper.e(view.getContext(), f10, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f11 + f10, f11), 1, f11));
    }
}
