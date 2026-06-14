package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f25392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f25393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25395h;

    public HeaderScrollingViewBehavior() {
        this.f25392e = new Rect();
        this.f25393f = new Rect();
        this.f25394g = 0;
    }

    private static int g(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void a(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewB = b(coordinatorLayout.getDependencies(view));
        if (viewB == null) {
            super.a(coordinatorLayout, view, i10);
            this.f25394g = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.f25392e;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, viewB.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((coordinatorLayout.getHeight() + viewB.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f25393f;
        Gravity.apply(g(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iC = c(viewB);
        view.layout(rect2.left, rect2.top - iC, rect2.right, rect2.bottom - iC);
        this.f25394g = rect2.top - viewB.getBottom();
    }

    abstract View b(List list);

    final int c(View view) {
        if (this.f25395h == 0) {
            return 0;
        }
        float fD = d(view);
        int i10 = this.f25395h;
        return MathUtils.clamp((int) (fD * i10), 0, i10);
    }

    float d(View view) {
        return 1.0f;
    }

    int e(View view) {
        return view.getMeasuredHeight();
    }

    final int f() {
        return this.f25394g;
    }

    public final int getOverlayTop() {
        return this.f25395h;
    }

    protected boolean h() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        View viewB;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewB = b(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewB.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iE = size + e(viewB);
        int measuredHeight = viewB.getMeasuredHeight();
        if (h()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iE -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iE, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public final void setOverlayTop(int i10) {
        this.f25395h = i10;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25392e = new Rect();
        this.f25393f = new Rect();
        this.f25394g = 0;
    }
}
