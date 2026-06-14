package com.mobilefuse.sdk.ad.rendering.omniad.container;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedSizeModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.EmptyScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0012H\u0016J\u0018\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020,H\u0016J\b\u00103\u001a\u00020*H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00064"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/container/InAppContainer;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "activity", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "scaleAnimationEnabled", "", "(Landroid/app/Activity;Landroid/view/View;Z)V", "getActivity", "()Landroid/app/Activity;", "getContentView", "()Landroid/view/View;", "currentPosition", "Landroid/graphics/Point;", "getCurrentPosition", "()Landroid/graphics/Point;", "currentScale", "", "getCurrentScale", "()F", "currentSize", "getCurrentSize", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedPositionModifier;", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedPositionModifier;", "defaultScaleModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "getDefaultScaleModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedSizeModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/AnimatedSizeModifier;", "floatingContainer", "Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "getFloatingContainer", "()Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "getScaleAnimationEnabled", "()Z", "changePosition", "", "x", "", "y", "changeScale", "scale", "changeSize", "width", "height", "destroy", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class InAppContainer implements OmniAdContainer {

    @NotNull
    private final Activity activity;

    @NotNull
    private final View contentView;

    @NotNull
    private final AnimatedPositionModifier defaultPositionModifier;

    @NotNull
    private final ScaleModifier defaultScaleModifier;

    @NotNull
    private final AnimatedSizeModifier defaultSizeModifier;

    @NotNull
    private final FloatingContainer floatingContainer;
    private final boolean scaleAnimationEnabled;

    public InAppContainer(@NotNull Activity activity, @NotNull View contentView, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.activity = activity;
        this.contentView = contentView;
        this.scaleAnimationEnabled = z10;
        this.floatingContainer = new FloatingContainer(activity);
        this.defaultPositionModifier = new AnimatedPositionModifier(this, 0L, null, 6, null);
        this.defaultSizeModifier = new AnimatedSizeModifier(this, 0L, null, 6, null);
        this.defaultScaleModifier = z10 ? new AnimatedScaleModifier(this, 0L, null, 6, null) : new EmptyScaleModifier(this);
        getFloatingContainer().addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        View rootView = decorView.getRootView();
        if (rootView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) rootView).addView(getFloatingContainer());
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void changePosition(int x10, int y10) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().setX(x10);
            getFloatingContainer().setY(y10);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void changeScale(float scale) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().setScaleX(scale);
            getFloatingContainer().setScaleY(scale);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void changeSize(int width, int height) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            ViewGroup.LayoutParams layoutParams = getFloatingContainer().getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            getFloatingContainer().setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getFloatingContainer().removeAllViews();
            ViewParent parent = getFloatingContainer().getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(getFloatingContainer());
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

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final View getContentView() {
        return this.contentView;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentPosition() {
        return new Point((int) getFloatingContainer().getX(), (int) getFloatingContainer().getY());
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public float getCurrentScale() {
        return getFloatingContainer().getScaleX();
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentSize() {
        return new Point(getFloatingContainer().getWidth(), getFloatingContainer().getHeight());
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public ScaleModifier getDefaultScaleModifier() {
        return this.defaultScaleModifier;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public FloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    public final boolean getScaleAnimationEnabled() {
        return this.scaleAnimationEnabled;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public AnimatedPositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public AnimatedSizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }
}
