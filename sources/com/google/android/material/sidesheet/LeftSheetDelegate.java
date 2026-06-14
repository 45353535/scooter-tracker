package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
final class LeftSheetDelegate extends SheetDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f27634a;

    LeftSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f27634a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    float b(int i10) {
        float fE = e();
        return (i10 - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int d() {
        return Math.max(0, this.f27634a.B() + this.f27634a.z());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int e() {
        return (-this.f27634a.v()) - this.f27634a.z();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int f() {
        return this.f27634a.z();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int g() {
        return -this.f27634a.v();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int h(View view) {
        return view.getRight() + this.f27634a.z();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean j(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean k(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean l(float f10, float f11) {
        return SheetUtils.a(f10, f11) && Math.abs(f10) > ((float) this.f27634a.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    boolean m(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f27634a.getHideFriction())) > this.f27634a.y();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f27634a.C()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
