package com.google.android.material.transition;

/* JADX INFO: loaded from: classes9.dex */
class FadeModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FadeModeEvaluator f28301a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.a(255, TransitionUtils.n(0, 255, f11, f12, f10));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FadeModeEvaluator f28302b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.b(TransitionUtils.n(255, 0, f11, f12, f10), 255);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FadeModeEvaluator f28303c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            return FadeModeResult.b(TransitionUtils.n(255, 0, f11, f12, f10), TransitionUtils.n(0, 255, f11, f12, f10));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FadeModeEvaluator f28304d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f10, float f11, float f12, float f13) {
            float f14 = ((f12 - f11) * f13) + f11;
            return FadeModeResult.b(TransitionUtils.n(255, 0, f11, f14, f10), TransitionUtils.n(0, 255, f14, f12, f10));
        }
    };

    static FadeModeEvaluator a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f28301a : f28302b;
        }
        if (i10 == 1) {
            return z10 ? f28302b : f28301a;
        }
        if (i10 == 2) {
            return f28303c;
        }
        if (i10 == 3) {
            return f28304d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
