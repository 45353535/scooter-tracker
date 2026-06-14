package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class InterpolateOnScrollPositionChangeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f27463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MaterialShapeDrawable f27464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScrollView f27465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f27466d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f27467e = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f27468f = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper.1
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    };

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.f27463a = view;
        this.f27464b = materialShapeDrawable;
        this.f27465c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f27465c = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.f27464b = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f27468f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f27468f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f27465c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f27465c.getLocationInWindow(this.f27466d);
        this.f27465c.getChildAt(0).getLocationInWindow(this.f27467e);
        int top = (this.f27463a.getTop() - this.f27466d[1]) + this.f27467e[1];
        int height = this.f27463a.getHeight();
        int height2 = this.f27465c.getHeight();
        if (top < 0) {
            this.f27464b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f27463a.invalidate();
            return;
        }
        if (top + height > height2) {
            this.f27464b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((r0 - height2) / height))));
            this.f27463a.invalidate();
        } else if (this.f27464b.getInterpolation() != 1.0f) {
            this.f27464b.setInterpolation(1.0f);
            this.f27463a.invalidate();
        }
    }
}
