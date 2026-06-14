package com.mobilefuse.sdk.ad.rendering.omniad.view;

import android.R;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/view/ViewRenderingPixels;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "androidContentView", "Landroid/view/ViewGroup;", "bottomPixel", "Landroid/view/View;", "rootView", "topPixel", "addPixels", "", "invalidateLayout", "removePixels", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class ViewRenderingPixels {
    private final ViewGroup androidContentView;
    private final View bottomPixel;
    private final ViewGroup rootView;
    private final View topPixel;

    public ViewRenderingPixels(@NotNull Activity activity) {
        View decorView;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.topPixel = new View(activity);
        this.bottomPixel = new View(activity);
        Window window = activity.getWindow();
        View rootView = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView();
        ViewGroup viewGroup = (ViewGroup) (rootView instanceof ViewGroup ? rootView : null);
        this.rootView = viewGroup;
        this.androidContentView = viewGroup != null ? (ViewGroup) viewGroup.findViewById(R.id.content) : null;
    }

    public final void addPixels() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup viewGroup = this.rootView;
            if (viewGroup == null) {
                return;
            }
            this.topPixel.setBackgroundColor(11141120);
            viewGroup.addView(this.topPixel, new RelativeLayout.LayoutParams(1, 1));
            this.bottomPixel.setBackgroundColor(11141120);
            viewGroup.addView(this.bottomPixel, new RelativeLayout.LayoutParams(1, 1));
            invalidateLayout();
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void invalidateLayout() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup viewGroup = this.androidContentView;
            if (viewGroup == null) {
                return;
            }
            Rect rect = new Rect();
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
            this.topPixel.setY(0.0f);
            this.bottomPixel.setX(rect.right - 1);
            this.bottomPixel.setY(rect.bottom - 1);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void removePixels() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewParent parent = this.topPixel.getParent();
            ViewParent viewParent = null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.topPixel);
            }
            ViewParent parent2 = this.bottomPixel.getParent();
            if (parent2 instanceof ViewGroup) {
                viewParent = parent2;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.bottomPixel);
            }
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }
}
