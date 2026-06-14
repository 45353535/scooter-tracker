package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
class FadeModeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f28443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f28444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f28445c;

    private FadeModeResult(int i10, int i11, boolean z10) {
        this.f28443a = i10;
        this.f28444b = i11;
        this.f28445c = z10;
    }

    static FadeModeResult a(int i10, int i11) {
        return new FadeModeResult(i10, i11, true);
    }

    static FadeModeResult b(int i10, int i11) {
        return new FadeModeResult(i10, i11, false);
    }
}
