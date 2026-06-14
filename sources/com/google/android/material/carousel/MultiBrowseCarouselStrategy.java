package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25901d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25902e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25903c = 0;

    boolean d(Arrangement arrangement, int i10) {
        int iD = arrangement.d() - i10;
        boolean z10 = iD > 0 && (arrangement.f25818c > 0 || arrangement.f25819d > 1);
        while (iD > 0) {
            int i11 = arrangement.f25818c;
            if (i11 > 0) {
                arrangement.f25818c = i11 - 1;
            } else {
                int i12 = arrangement.f25819d;
                if (i12 > 1) {
                    arrangement.f25819d = i12 - 1;
                }
            }
            iD--;
        }
        return z10;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        boolean z10;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f10;
        float fMax = Math.max(getSmallItemSizeMax() + f10, smallItemSizeMin);
        float f11 = containerHeight;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fClamp = MathUtils.clamp((measuredHeight / 3.0f) + f10, smallItemSizeMin + f10, fMax + f10);
        float f12 = (fMin + fClamp) / 2.0f;
        int[] iArrA = f25901d;
        float f13 = 2.0f * smallItemSizeMin;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f25902e;
        if (carousel.getCarouselAlignment() == 1) {
            iArrA = CarouselStrategy.a(iArrA);
            iArrA2 = CarouselStrategy.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (CarouselStrategyHelper.i(iArr) * f12)) - (CarouselStrategyHelper.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fClamp, smallItemSizeMin, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.f25903c = arrangementFindLowestCostArrangement.d();
        boolean zD = d(arrangementFindLowestCostArrangement, carousel.getItemCount());
        int i12 = arrangementFindLowestCostArrangement.f25819d;
        if (i12 == 0 && arrangementFindLowestCostArrangement.f25818c == 0 && f11 > f13) {
            arrangementFindLowestCostArrangement.f25818c = 1;
            z10 = true;
        } else {
            z10 = zD;
        }
        if (z10) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fClamp, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.f25818c}, f12, new int[]{i12}, fMin, new int[]{arrangementFindLowestCostArrangement.f25822g});
        }
        return CarouselStrategyHelper.d(view.getContext(), f14, containerHeight, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i10) {
        if (i10 >= this.f25903c || carousel.getItemCount() < this.f25903c) {
            return i10 >= this.f25903c && carousel.getItemCount() < this.f25903c;
        }
        return true;
    }
}
