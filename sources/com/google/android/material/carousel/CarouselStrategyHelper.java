package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes9.dex */
final class CarouselStrategyHelper {
    static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static KeylineState c(Context context, float f10, int i10, Arrangement arrangement) {
        float f11;
        float f12;
        float fMin = Math.min(f(context) + f10, arrangement.f25821f);
        float f13 = fMin / 2.0f;
        float f14 = 0.0f - f13;
        float fB = b(0.0f, arrangement.f25817b, arrangement.f25818c);
        float fJ = j(0.0f, a(fB, arrangement.f25817b, (int) Math.floor(arrangement.f25818c / 2.0f)), arrangement.f25817b, arrangement.f25818c);
        float fB2 = b(fJ, arrangement.f25820e, arrangement.f25819d);
        float fJ2 = j(fJ, a(fB2, arrangement.f25820e, (int) Math.floor(arrangement.f25819d / 2.0f)), arrangement.f25820e, arrangement.f25819d);
        float fB3 = b(fJ2, arrangement.f25821f, arrangement.f25822g);
        float fJ3 = j(fJ2, a(fB3, arrangement.f25821f, arrangement.f25822g), arrangement.f25821f, arrangement.f25822g);
        float fB4 = b(fJ3, arrangement.f25820e, arrangement.f25819d);
        float fB5 = b(j(fJ3, a(fB4, arrangement.f25820e, (int) Math.ceil(arrangement.f25819d / 2.0f)), arrangement.f25820e, arrangement.f25819d), arrangement.f25817b, arrangement.f25818c);
        float f15 = i10 + f13;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.f25821f, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.f25817b, arrangement.f25821f, f10);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.f25820e, arrangement.f25821f, f10);
        KeylineState.Builder builderAddAnchorKeyline = new KeylineState.Builder(arrangement.f25821f, i10).addAnchorKeyline(f14, childMaskPercentage, fMin);
        if (arrangement.f25818c > 0) {
            f11 = 2.0f;
            f12 = childMaskPercentage;
            builderAddAnchorKeyline.addKeylineRange(fB, childMaskPercentage2, arrangement.f25817b, (int) Math.floor(r7 / 2.0f));
        } else {
            f11 = 2.0f;
            f12 = childMaskPercentage;
        }
        if (arrangement.f25819d > 0) {
            builderAddAnchorKeyline.addKeylineRange(fB2, childMaskPercentage3, arrangement.f25820e, (int) Math.floor(r4 / f11));
        }
        builderAddAnchorKeyline.addKeylineRange(fB3, 0.0f, arrangement.f25821f, arrangement.f25822g, true);
        if (arrangement.f25819d > 0) {
            builderAddAnchorKeyline.addKeylineRange(fB4, childMaskPercentage3, arrangement.f25820e, (int) Math.ceil(r4 / f11));
        }
        if (arrangement.f25818c > 0) {
            builderAddAnchorKeyline.addKeylineRange(fB5, childMaskPercentage2, arrangement.f25817b, (int) Math.ceil(r0 / f11));
        }
        builderAddAnchorKeyline.addAnchorKeyline(f15, f12, fMin);
        return builderAddAnchorKeyline.build();
    }

    static KeylineState d(Context context, float f10, int i10, Arrangement arrangement, int i11) {
        return i11 == 1 ? c(context, f10, i10, arrangement) : e(context, f10, i10, arrangement);
    }

    static KeylineState e(Context context, float f10, int i10, Arrangement arrangement) {
        float fMin = Math.min(f(context) + f10, arrangement.f25821f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, arrangement.f25821f, arrangement.f25822g);
        float fJ = j(0.0f, a(fB, arrangement.f25821f, arrangement.f25822g), arrangement.f25821f, arrangement.f25822g);
        float fB2 = b(fJ, arrangement.f25820e, arrangement.f25819d);
        float fB3 = b(j(fJ, fB2, arrangement.f25820e, arrangement.f25819d), arrangement.f25817b, arrangement.f25818c);
        float f13 = i10 + f11;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, arrangement.f25821f, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.f25817b, arrangement.f25821f, f10);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.f25820e, arrangement.f25821f, f10);
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(arrangement.f25821f, i10).addAnchorKeyline(f12, childMaskPercentage, fMin).addKeylineRange(fB, 0.0f, arrangement.f25821f, arrangement.f25822g, true);
        if (arrangement.f25819d > 0) {
            builderAddKeylineRange.addKeyline(fB2, childMaskPercentage3, arrangement.f25820e);
        }
        int i11 = arrangement.f25818c;
        if (i11 > 0) {
            builderAddKeylineRange.addKeylineRange(fB3, childMaskPercentage2, arrangement.f25817b, i11);
        }
        builderAddKeylineRange.addAnchorKeyline(f13, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    static float f(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    static float g(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    static float h(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
