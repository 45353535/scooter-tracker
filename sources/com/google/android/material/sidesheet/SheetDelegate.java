package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
abstract class SheetDelegate {
    SheetDelegate() {
    }

    abstract int a(ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract float b(int i10);

    abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int d();

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int getParentInnerEdge(CoordinatorLayout coordinatorLayout);

    abstract int h(View view);

    abstract int i();

    abstract boolean j(float f10);

    abstract boolean k(View view);

    abstract boolean l(float f10, float f11);

    abstract boolean m(View view, float f10);

    abstract void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10);

    abstract void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);
}
