package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes9.dex */
final class HideBottomViewOnScrollDelegate extends HideViewOnScrollDelegate {
    HideBottomViewOnScrollDelegate() {
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    int b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    int c() {
        return 1;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    ViewPropertyAnimator d(View view, int i10) {
        return view.animate().translationY(i10);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    void e(View view, int i10, int i11) {
        view.setTranslationY(i10 + i11);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    void f(View view, int i10) {
        view.setTranslationY(i10);
    }
}
