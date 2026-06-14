package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes9.dex */
class ViewOffsetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f25406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25411f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25412g = true;

    public ViewOffsetHelper(View view) {
        this.f25406a = view;
    }

    void a() {
        View view = this.f25406a;
        ViewCompat.offsetTopAndBottom(view, this.f25409d - (view.getTop() - this.f25407b));
        View view2 = this.f25406a;
        ViewCompat.offsetLeftAndRight(view2, this.f25410e - (view2.getLeft() - this.f25408c));
    }

    void b() {
        this.f25407b = this.f25406a.getTop();
        this.f25408c = this.f25406a.getLeft();
    }

    public int getLayoutLeft() {
        return this.f25408c;
    }

    public int getLayoutTop() {
        return this.f25407b;
    }

    public int getLeftAndRightOffset() {
        return this.f25410e;
    }

    public int getTopAndBottomOffset() {
        return this.f25409d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.f25412g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.f25411f;
    }

    public void setHorizontalOffsetEnabled(boolean z10) {
        this.f25412g = z10;
    }

    public boolean setLeftAndRightOffset(int i10) {
        if (!this.f25412g || this.f25410e == i10) {
            return false;
        }
        this.f25410e = i10;
        a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i10) {
        if (!this.f25411f || this.f25409d == i10) {
            return false;
        }
        this.f25409d = i10;
        a();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z10) {
        this.f25411f = z10;
    }
}
