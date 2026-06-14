package com.appodeal.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f13879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f13880b;

    public f(Context context, AttributeSet attributeSet, int i10) {
        FrameLayout innerContainer = new FrameLayout(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(innerContainer, "innerContainer");
        super(context, attributeSet, i10);
        this.f13879a = innerContainer;
        super.addView(innerContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (Intrinsics.areEqual(child, this.f13879a)) {
            super.addView(child);
        } else {
            this.f13879a.addView(child);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f13879a.bringChildToFront(child);
    }

    public final void configureContainer(@NotNull ViewGroup adContainer) {
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        ViewParent parent = adContainer.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(adContainer);
        }
        ViewGroup viewGroup2 = this.f13880b;
        if (viewGroup2 != null) {
            super.removeView(viewGroup2);
            this.f13880b = null;
        }
        super.addView(adContainer, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f13880b = adContainer;
    }

    public final void deconfigureContainer() {
        if (this.f13880b != null) {
            FrameLayout frameLayout = this.f13879a;
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
            ViewGroup viewGroup2 = this.f13880b;
            if (viewGroup2 != null) {
                super.removeView(viewGroup2);
                this.f13880b = null;
            }
            super.addView(this.f13879a, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @NotNull
    public final FrameLayout getInnerContainer() {
        super.removeView(this.f13879a);
        FrameLayout frameLayout = this.f13879a;
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        this.f13879a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.f13879a;
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.f13879a.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup viewGroup = this.f13880b;
        if (child != viewGroup) {
            this.f13879a.removeView(child);
        } else if (viewGroup != null) {
            super.removeView(viewGroup);
            this.f13880b = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (!Intrinsics.areEqual(child, this.f13879a)) {
            this.f13879a.addView(child, i10);
        } else {
            super.addView(child, i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i10, int i11) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (!Intrinsics.areEqual(child, this.f13879a)) {
            this.f13879a.addView(child, i10, i11);
        } else {
            super.addView(child, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@NotNull View child, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!Intrinsics.areEqual(child, this.f13879a)) {
            this.f13879a.addView(child, params);
        } else {
            super.addView(child, params);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i10, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!Intrinsics.areEqual(child, this.f13879a)) {
            this.f13879a.addView(child, i10, params);
        } else {
            super.addView(child, i10, params);
        }
    }
}
