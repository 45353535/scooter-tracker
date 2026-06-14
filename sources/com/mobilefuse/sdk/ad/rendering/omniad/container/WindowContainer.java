package com.mobilefuse.sdk.ad.rendering.omniad.container;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.EmptyScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticSizeModifier;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.internal.Callback;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 <2\u00020\u0001:\u0001<B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0016J\u0010\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u0011H\u0016J\u0018\u00107\u001a\u0002012\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u000203H\u0016J\b\u0010:\u001a\u000201H\u0016J\b\u0010;\u001a\u000201H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006="}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/container/WindowContainer;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "activity", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "initSizePx", "Landroid/graphics/Point;", "(Landroid/app/Activity;Landroid/view/View;Landroid/graphics/Point;)V", "getActivity", "()Landroid/app/Activity;", "getContentView", "()Landroid/view/View;", "currentPosition", "getCurrentPosition", "()Landroid/graphics/Point;", "currentScale", "", "getCurrentScale", "()F", "currentSize", "getCurrentSize", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/StaticPositionModifier;", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/StaticPositionModifier;", "defaultScaleModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/EmptyScaleModifier;", "getDefaultScaleModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/EmptyScaleModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/StaticSizeModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/StaticSizeModifier;", "floatingContainer", "Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "getFloatingContainer", "()Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;", "rect", "Landroid/graphics/Rect;", "windowContainer", "Landroid/widget/FrameLayout;", "windowManager", "Landroid/view/WindowManager;", "windowParams", "Landroid/view/WindowManager$LayoutParams;", "getWindowParams", "()Landroid/view/WindowManager$LayoutParams;", "changePosition", "", "x", "", "y", "changeScale", "scale", "changeSize", "width", "height", "destroy", "updateWindowLayout", y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class WindowContainer implements OmniAdContainer {
    public static final boolean DISABLE_WINDOW_DEFAULT_ANIMATIONS = true;

    @NotNull
    private final Activity activity;

    @NotNull
    private final View contentView;

    @NotNull
    private final StaticPositionModifier defaultPositionModifier;

    @NotNull
    private final EmptyScaleModifier defaultScaleModifier;

    @NotNull
    private final StaticSizeModifier defaultSizeModifier;

    @NotNull
    private final FloatingContainer floatingContainer;
    private Rect rect;
    private final FrameLayout windowContainer;
    private final WindowManager windowManager;

    public WindowContainer(@NotNull Activity activity, @NotNull View contentView, @NotNull Point initSizePx) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(initSizePx, "initSizePx");
        this.activity = activity;
        this.contentView = contentView;
        this.floatingContainer = new FloatingContainer(activity);
        this.defaultPositionModifier = new StaticPositionModifier(this);
        this.defaultSizeModifier = new StaticSizeModifier(this);
        this.defaultScaleModifier = new EmptyScaleModifier(this);
        Object systemService = activity.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        this.windowManager = windowManager;
        FrameLayout frameLayout = new FrameLayout(activity.getApplicationContext()) { // from class: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Window window = WindowContainer.this.getActivity().getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                    View decorView = window.getDecorView();
                    Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                    decorView.getRootView().dispatchKeyEvent(event);
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
                return true;
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
                Intrinsics.checkNotNullParameter(ev, "ev");
                if (WindowContainer.this.getFloatingContainer().isTouchInteractionEnabled()) {
                    return super.dispatchTouchEvent(ev);
                }
                return false;
            }
        };
        this.windowContainer = frameLayout;
        getFloatingContainer().addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(initSizePx.x, initSizePx.y, 1002, 16777760, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 0;
        WindowContainerKt.disableWindowDefaultAnimations(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.addView(getFloatingContainer(), layoutParams2);
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        frameLayout.setSystemUiVisibility(decorView.getSystemUiVisibility());
        windowManager.addView(frameLayout, layoutParams);
        getFloatingContainer().setOnTouchInteractionEnabledChanged(new Callback() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.container.WindowContainer.2
            @Override // com.mobilefuse.sdk.internal.Callback
            public final void call(Boolean enabled) {
                if (((AnonymousClass1) WindowContainer.this.windowContainer).getParent() == null) {
                    return;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    ViewGroup.LayoutParams layoutParams3 = ((AnonymousClass1) WindowContainer.this.windowContainer).getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                    }
                    WindowManager.LayoutParams layoutParams4 = (WindowManager.LayoutParams) layoutParams3;
                    Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
                    if (enabled.booleanValue()) {
                        layoutParams4.flags &= -17;
                    } else {
                        layoutParams4.flags |= 16;
                    }
                    WindowContainer.this.windowManager.updateViewLayout(WindowContainer.this.windowContainer, layoutParams4);
                } catch (Throwable th2) {
                    int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
        });
        this.rect = new Rect();
    }

    private final WindowManager.LayoutParams getWindowParams() {
        ViewGroup.LayoutParams layoutParams = this.windowContainer.getLayoutParams();
        if (layoutParams != null) {
            return (WindowManager.LayoutParams) layoutParams;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    private final void updateWindowLayout() {
        if (this.windowContainer.getParent() == null) {
            return;
        }
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WindowManager.LayoutParams windowParams = getWindowParams();
            Rect rect = this.rect;
            windowParams.x = rect.left;
            windowParams.y = rect.top;
            windowParams.width = rect.right;
            windowParams.height = rect.bottom;
            this.windowManager.updateViewLayout(this.windowContainer, windowParams);
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
    public void changePosition(int x10, int y10) {
        Rect rect = this.rect;
        rect.left = x10;
        rect.top = y10;
        updateWindowLayout();
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void changeScale(float scale) {
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public void changeSize(int width, int height) {
        Rect rect = this.rect;
        rect.right = width;
        rect.bottom = height;
        updateWindowLayout();
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
            if (this.windowContainer.getParent() != null) {
                this.windowManager.removeView(this.windowContainer);
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
        WindowManager.LayoutParams windowParams = getWindowParams();
        return new Point(windowParams.x, windowParams.y);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    public float getCurrentScale() {
        return 1.0f;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public Point getCurrentSize() {
        WindowManager.LayoutParams windowParams = getWindowParams();
        return new Point(windowParams.width, windowParams.height);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public FloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public StaticPositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public EmptyScaleModifier getDefaultScaleModifier() {
        return this.defaultScaleModifier;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer
    @NotNull
    public StaticSizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    public /* synthetic */ WindowContainer(Activity activity, View view, Point point, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, view, (i10 & 4) != 0 ? new Point(200, 200) : point);
    }
}
