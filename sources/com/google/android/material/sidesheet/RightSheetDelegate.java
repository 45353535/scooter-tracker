package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
final class RightSheetDelegate extends SheetDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f27635a;

    RightSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f27635a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int d() {
        return Math.max(0, (e() - this.f27635a.v()) - this.f27635a.z());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int e() {
        return this.f27635a.C();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int f() {
        return this.f27635a.C();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int h(View view) {
        return view.getLeft() - this.f27635a.z();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean j(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean k(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean l(float f10, float f11) {
        return SheetUtils.a(f10, f11) && Math.abs(f10) > ((float) this.f27635a.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean m(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f27635a.getHideFriction())) > this.f27635a.y();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iC = this.f27635a.C();
        if (i10 <= iC) {
            marginLayoutParams.rightMargin = iC - i10;
        }
    }
}
