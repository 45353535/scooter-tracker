package com.appodeal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AppEvent;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class va extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rect f15154d = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f15155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.OnLayoutChangeListener f15156c;

    public va(Context context) {
        super(context);
        this.f15155b = new Rect();
        this.f15156c = new View.OnLayoutChangeListener() { // from class: com.appodeal.ads.ta
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f14875b.a(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        setFitsSystemWindows(true);
    }

    public final void a(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (h2.f13373g == null || h2.f13374h == null) {
            return;
        }
        Log.debug("ViewAdRenderer", "bringToFront", "container " + this + " parent: " + view);
        bringToFront();
    }

    public boolean b() {
        return true;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Rect rect;
        DisplayCutout displayCutout;
        if (!db.f13251m) {
            return windowInsets;
        }
        if (windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetRight() == 0 && windowInsets.getSystemWindowInsetBottom() == 0) {
            rect = f15154d;
        } else {
            this.f15155b.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                Rect rect2 = this.f15155b;
                rect2.left = Math.max(rect2.left, displayCutout.getSafeInsetLeft());
                Rect rect3 = this.f15155b;
                rect3.top = Math.max(rect3.top, displayCutout.getSafeInsetTop());
                Rect rect4 = this.f15155b;
                rect4.right = Math.max(rect4.right, displayCutout.getSafeInsetRight());
                Rect rect5 = this.f15155b;
                rect5.bottom = Math.max(rect5.bottom, displayCutout.getSafeInsetBottom());
            }
            rect = this.f15155b;
            if (b()) {
                Rect rect6 = this.f15155b;
                int iMax = Math.max(rect6.left, rect6.right);
                rect6.right = iMax;
                rect6.left = iMax;
            }
        }
        fitSystemWindows(rect);
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (h2.f13373g != null && h2.f13374h != null) {
                Object parent = getParent();
                if (parent instanceof View) {
                    Log.debug("ViewAdRenderer", "addOnLayoutChangeListener", "container " + this + " parent: " + parent);
                    ((View) parent).addOnLayoutChangeListener(this.f15156c);
                }
            }
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.sa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppEvent.AdViewAttach.INSTANCE;
                }
            });
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (h2.f13373g != null && h2.f13374h != null) {
                Object parent = getParent();
                if (parent instanceof View) {
                    Log.debug("ViewAdRenderer", "removeOnLayoutChangeListener", "container " + this + " parent: " + parent);
                    ((View) parent).removeOnLayoutChangeListener(this.f15156c);
                }
            }
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ua
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppEvent.AdViewDetach.INSTANCE;
                }
            });
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            requestApplyInsets();
        }
    }
}
