package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes9.dex */
abstract class HideViewOnScrollDelegate {
    HideViewOnScrollDelegate() {
    }

    abstract int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int b();

    abstract int c();

    abstract ViewPropertyAnimator d(View view, int i10);

    abstract void e(View view, int i10, int i11);

    abstract void f(View view, int i10);
}
