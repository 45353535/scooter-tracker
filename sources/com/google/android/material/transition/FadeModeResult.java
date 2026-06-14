package com.google.android.material.transition;

/* JADX INFO: loaded from: classes9.dex */
class FadeModeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f28305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f28306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f28307c;

    private FadeModeResult(int i10, int i11, boolean z10) {
        this.f28305a = i10;
        this.f28306b = i11;
        this.f28307c = z10;
    }

    static FadeModeResult a(int i10, int i11) {
        return new FadeModeResult(i10, i11, true);
    }

    static FadeModeResult b(int i10, int i11) {
        return new FadeModeResult(i10, i11, false);
    }
}
