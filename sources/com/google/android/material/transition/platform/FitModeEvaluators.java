package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
class FitModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FitModeEvaluator f28462a = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f10, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f28469f - fitModeResult.f28467d) * f10;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = TransitionUtils.n(f13, f15, f11, f12, f10, true);
            float f17 = fN / f13;
            float f18 = fN / f15;
            return new FitModeResult(f17, f18, fN, f14 * f17, fN, f16 * f18);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.f28467d > fitModeResult.f28469f;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FitModeEvaluator f28463b = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f10, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.f28468e - fitModeResult.f28466c) / 2.0f) * f10;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fN = TransitionUtils.n(f14, f16, f11, f12, f10, true);
            float f17 = fN / f14;
            float f18 = fN / f16;
            return new FitModeResult(f17, f18, f13 * f17, fN, f15 * f18, fN);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.f28466c > fitModeResult.f28468e;
        }
    };

    static FitModeEvaluator a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f28462a : f28463b;
        }
        if (i10 == 1) {
            return f28462a;
        }
        if (i10 == 2) {
            return f28463b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i10);
    }

    private static boolean b(boolean z10, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        return z10 ? (fHeight2 * fWidth) / fWidth2 >= fHeight : (fWidth2 * fHeight) / fWidth >= fHeight2;
    }
}
