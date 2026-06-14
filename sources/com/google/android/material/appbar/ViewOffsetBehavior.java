package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewOffsetHelper f25403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25405d;

    public ViewOffsetBehavior() {
        this.f25404c = 0;
        this.f25405d = 0;
    }

    protected void a(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.onLayoutChild(view, i10);
    }

    public int getLeftAndRightOffset() {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        return viewOffsetHelper != null && viewOffsetHelper.isHorizontalOffsetEnabled();
    }

    public boolean isVerticalOffsetEnabled() {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        return viewOffsetHelper != null && viewOffsetHelper.isVerticalOffsetEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        a(coordinatorLayout, v10, i10);
        if (this.f25403b == null) {
            this.f25403b = new ViewOffsetHelper(v10);
        }
        this.f25403b.b();
        this.f25403b.a();
        int i11 = this.f25404c;
        if (i11 != 0) {
            this.f25403b.setTopAndBottomOffset(i11);
            this.f25404c = 0;
        }
        int i12 = this.f25405d;
        if (i12 == 0) {
            return true;
        }
        this.f25403b.setLeftAndRightOffset(i12);
        this.f25405d = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z10) {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setHorizontalOffsetEnabled(z10);
        }
    }

    public boolean setLeftAndRightOffset(int i10) {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setLeftAndRightOffset(i10);
        }
        this.f25405d = i10;
        return false;
    }

    public boolean setTopAndBottomOffset(int i10) {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.setTopAndBottomOffset(i10);
        }
        this.f25404c = i10;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z10) {
        ViewOffsetHelper viewOffsetHelper = this.f25403b;
        if (viewOffsetHelper != null) {
            viewOffsetHelper.setVerticalOffsetEnabled(z10);
        }
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25404c = 0;
        this.f25405d = 0;
    }
}
