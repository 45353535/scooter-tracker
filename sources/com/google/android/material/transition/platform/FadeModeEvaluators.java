package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
class FadeModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FadeModeEvaluator f28439a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.a(255, TransitionUtils.o(0, 255, f11, f12, f10));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FadeModeEvaluator f28440b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.b(TransitionUtils.o(255, 0, f11, f12, f10), 255);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FadeModeEvaluator f28441c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.b(TransitionUtils.o(255, 0, f11, f12, f10), TransitionUtils.o(0, 255, f11, f12, f10));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FadeModeEvaluator f28442d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return FadeModeResult.b(TransitionUtils.o(255, 0, f11, f14, f10), TransitionUtils.o(0, 255, f14, f12, f10));
        }
    };

    static FadeModeEvaluator a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f28439a : f28440b;
        }
        if (i10 == 1) {
            return z10 ? f28440b : f28439a;
        }
        if (i10 == 2) {
            return f28441c;
        }
        if (i10 == 3) {
            return f28442d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
