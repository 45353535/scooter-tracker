package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class ExpandableWidgetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f26518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26519b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26520c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f26518a = (View) expandableWidget;
    }

    private void a() {
        ViewParent parent = this.f26518a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f26518a);
        }
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.f26520c;
    }

    public boolean isExpanded() {
        return this.f26519b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.f26519b = bundle.getBoolean("expanded", false);
        this.f26520c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f26519b) {
            a();
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f26519b);
        bundle.putInt("expandedComponentIdHint", this.f26520c);
        return bundle;
    }

    public boolean setExpanded(boolean z10) {
        if (this.f26519b == z10) {
            return false;
        }
        this.f26519b = z10;
        a();
        return true;
    }

    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.f26520c = i10;
    }
}
