package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class HeroCarouselStrategy extends CarouselStrategy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25858d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25859e = {0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25860c = 0;

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f10;
        float fMax = Math.max(getSmallItemSizeMax() + f10, smallItemSizeMin);
        float f11 = containerHeight;
        float fMin = Math.min(measuredWidth + f10, f11);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f10, smallItemSizeMin + f10, fMax + f10);
        float f12 = (fMin + fClamp) / 2.0f;
        int i10 = 0;
        int[] iArr = f11 < 2.0f * smallItemSizeMin ? new int[]{0} : f25858d;
        int iMax = (int) Math.max(1.0d, Math.floor((f11 - (CarouselStrategyHelper.i(r1) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f11 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i11 = 0; i11 < iCeil; i11++) {
            iArr2[i11] = iMax + i11;
        }
        int i12 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fClamp, smallItemSizeMin, fMax, i12 != 0 ? CarouselStrategy.a(iArr) : iArr, f12, i12 != 0 ? CarouselStrategy.a(f25859e) : f25859e, fMin, iArr2);
        this.f25860c = arrangementFindLowestCostArrangement.d();
        if (arrangementFindLowestCostArrangement.d() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fClamp, smallItemSizeMin, fMax, iArr, f12, f25859e, fMin, iArr2);
        } else {
            i10 = i12;
        }
        return CarouselStrategyHelper.d(view.getContext(), f10, containerHeight, arrangementFindLowestCostArrangement, i10);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i10) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i10 < this.f25860c && carousel.getItemCount() >= this.f25860c) || (i10 >= this.f25860c && carousel.getItemCount() < this.f25860c);
        }
        return false;
    }
}
