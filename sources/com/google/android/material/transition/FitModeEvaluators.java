package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes9.dex */
class FitModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FitModeEvaluator f28324a = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f10, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f28331f - fitModeResult.f28329d) * f10;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fM = TransitionUtils.m(f13, f15, f11, f12, f10, true);
            float f17 = fM / f13;
            float f18 = fM / f15;
            return new FitModeResult(f17, f18, fM, f14 * f17, fM, f16 * f18);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.f28329d > fitModeResult.f28331f;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FitModeEvaluator f28325b = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f10, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.f28330e - fitModeResult.f28328c) / 2.0f) * f10;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fM = TransitionUtils.m(f14, f16, f11, f12, f10, true);
            float f17 = fM / f14;
            float f18 = fM / f16;
            return new FitModeResult(f17, f18, f13 * f17, fM, f15 * f18, fM);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.f28328c > fitModeResult.f28330e;
        }
    };

    static FitModeEvaluator a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f28324a : f28325b;
        }
        if (i10 == 1) {
            return f28324a;
        }
        if (i10 == 2) {
            return f28325b;
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
