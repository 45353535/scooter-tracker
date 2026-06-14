package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdTouchService;", "", "Landroid/app/Activity;", "activity", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "omniAdContainer", "Landroid/graphics/Point;", "sizeDp", "", "marginDp", "Lkotlin/Function3;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/TouchEventType;", "", "touchCallback", "<init>", "(Landroid/app/Activity;Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;Landroid/graphics/Point;ILkotlin/jvm/functions/Function3;)V", "", "x", "y", "type", "onTouchEvent", "(FFLcom/mobilefuse/sdk/ad/rendering/omniad/service/TouchEventType;)V", "destroy", "()V", "", "dragEnabled", "Z", "getDragEnabled", "()Z", "setDragEnabled", "(Z)V", "value", "touchInteractionEnabled", "getTouchInteractionEnabled", "setTouchInteractionEnabled", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "Landroid/graphics/Point;", "getSizeDp", "()Landroid/graphics/Point;", "I", "getMarginDp", "()I", "Lkotlin/jvm/functions/Function3;", "getTouchCallback", "()Lkotlin/jvm/functions/Function3;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class OmniAdTouchService {

    @NotNull
    private final Activity activity;
    private boolean dragEnabled;
    private final int marginDp;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    @NotNull
    private final Point sizeDp;

    @NotNull
    private final Function3<Integer, Integer, TouchEventType, Unit> touchCallback;
    private boolean touchInteractionEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public OmniAdTouchService(@NotNull Activity activity, @NotNull OmniAdContainer omniAdContainer, @NotNull Point sizeDp, int i10, @NotNull Function3<? super Integer, ? super Integer, ? super TouchEventType, Unit> touchCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(sizeDp, "sizeDp");
        Intrinsics.checkNotNullParameter(touchCallback, "touchCallback");
        this.activity = activity;
        this.omniAdContainer = omniAdContainer;
        this.sizeDp = sizeDp;
        this.marginDp = i10;
        this.touchCallback = touchCallback;
        this.dragEnabled = true;
        this.touchInteractionEnabled = true;
        omniAdContainer.getFloatingContainer().setFloatingTouchListener(new View.OnTouchListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService.1
            private final int adHeightPx;
            private final int adWidthPx;

            @NotNull
            private final ViewGroup androidContentView;

            @NotNull
            private final FloatingContainer floatingContainer;
            private final int margin;
            private float offsetX;
            private float offsetY;
            private float orgX;
            private float orgY;

            @NotNull
            private final ViewGroup rootView;
            private boolean wasAnyMoveSinceDownEvent;

            {
                Window window = OmniAdTouchService.this.getActivity().getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                View decorView = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                View rootView = decorView.getRootView();
                if (rootView == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                ViewGroup viewGroup = (ViewGroup) rootView;
                this.rootView = viewGroup;
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                this.androidContentView = (ViewGroup) viewFindViewById;
                this.adWidthPx = DimConversionsKt.dpToPx(OmniAdTouchService.this.getSizeDp().x, (Context) OmniAdTouchService.this.getActivity());
                this.adHeightPx = DimConversionsKt.dpToPx(OmniAdTouchService.this.getSizeDp().y, (Context) OmniAdTouchService.this.getActivity());
                this.margin = DimConversionsKt.dpToPx(OmniAdTouchService.this.getMarginDp(), (Context) OmniAdTouchService.this.getActivity());
                this.floatingContainer = OmniAdTouchService.this.getOmniAdContainer().getFloatingContainer();
            }

            public final int getAdHeightPx() {
                return this.adHeightPx;
            }

            public final int getAdWidthPx() {
                return this.adWidthPx;
            }

            @NotNull
            public final ViewGroup getAndroidContentView() {
                return this.androidContentView;
            }

            @NotNull
            public final FloatingContainer getFloatingContainer() {
                return this.floatingContainer;
            }

            public final int getMargin() {
                return this.margin;
            }

            public final float getOffsetX() {
                return this.offsetX;
            }

            public final float getOffsetY() {
                return this.offsetY;
            }

            public final float getOrgX() {
                return this.orgX;
            }

            public final float getOrgY() {
                return this.orgY;
            }

            @NotNull
            public final ViewGroup getRootView() {
                return this.rootView;
            }

            public final boolean getWasAnyMoveSinceDownEvent() {
                return this.wasAnyMoveSinceDownEvent;
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(@NotNull View v10, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(v10, "v");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!OmniAdTouchService.this.getDragEnabled()) {
                    return true;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    this.androidContentView.getLocationOnScreen(iArr);
                    this.androidContentView.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
                    int action = event.getAction();
                    if (action == 0) {
                        this.wasAnyMoveSinceDownEvent = false;
                        this.orgX = event.getX();
                        this.orgY = event.getY();
                        OmniAdTouchService omniAdTouchService = OmniAdTouchService.this;
                        float f10 = this.orgX;
                        omniAdTouchService.onTouchEvent(f10, f10, TouchEventType.TOUCH_DOWN);
                    } else if (action == 1) {
                        Point currentPosition = OmniAdTouchService.this.getOmniAdContainer().getCurrentPosition();
                        float f11 = currentPosition.x;
                        float f12 = currentPosition.y;
                        int i11 = rect.left;
                        int i12 = this.margin;
                        float fWidth = f11 < ((float) ((i12 * 5) + i11)) ? i11 + i12 : f11;
                        int i13 = rect.top;
                        float fHeight = f12 < ((float) ((i12 * 5) + i13)) ? i13 + i12 : f12;
                        if (f11 + this.adWidthPx > (i11 + rect.width()) - (this.margin * 5)) {
                            fWidth = ((rect.left + rect.width()) - this.adWidthPx) - this.margin;
                        }
                        if (f12 + this.adHeightPx > (rect.top + rect.height()) - (this.margin * 5)) {
                            fHeight = ((rect.top + rect.height()) - this.adHeightPx) - this.margin;
                        }
                        OmniAdTouchService.this.onTouchEvent(fWidth, fHeight, TouchEventType.TOUCH_UP);
                    } else if (action == 2) {
                        this.offsetX = event.getRawX() - this.orgX;
                        this.offsetY = event.getRawY() - this.orgY;
                        this.floatingContainer.getLocationOnScreen(new int[2]);
                        float fWidth2 = this.offsetX;
                        float fHeight2 = this.offsetY;
                        int i14 = rect.left;
                        if (fWidth2 < i14) {
                            fWidth2 = i14;
                        }
                        int i15 = rect.top;
                        if (fHeight2 < i15) {
                            fHeight2 = i15;
                        }
                        if (this.adWidthPx + fWidth2 > i14 + rect.width()) {
                            fWidth2 = (rect.left + rect.width()) - this.adWidthPx;
                        }
                        if (this.adHeightPx + fHeight2 > rect.top + rect.height()) {
                            fHeight2 = (rect.top + rect.height()) - this.adHeightPx;
                        }
                        OmniAdTouchService.this.onTouchEvent(fWidth2, fHeight2, TouchEventType.DRAG);
                    }
                    return true;
                } catch (Throwable th2) {
                    int i16 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i16 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i16 != 2) {
                        throw new m();
                    }
                    return true;
                }
            }

            public final void setOffsetX(float f10) {
                this.offsetX = f10;
            }

            public final void setOffsetY(float f10) {
                this.offsetY = f10;
            }

            public final void setOrgX(float f10) {
                this.orgX = f10;
            }

            public final void setOrgY(float f10) {
                this.orgY = f10;
            }

            public final void setWasAnyMoveSinceDownEvent(boolean z10) {
                this.wasAnyMoveSinceDownEvent = z10;
            }
        });
    }

    public final void destroy() {
        this.omniAdContainer.getFloatingContainer().setFloatingTouchListener(null);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    public final int getMarginDp() {
        return this.marginDp;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final Point getSizeDp() {
        return this.sizeDp;
    }

    @NotNull
    public final Function3<Integer, Integer, TouchEventType, Unit> getTouchCallback() {
        return this.touchCallback;
    }

    public final boolean getTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    public final void onTouchEvent(float x10, float y10, @NotNull TouchEventType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.touchCallback.invoke(Integer.valueOf((int) x10), Integer.valueOf((int) y10), type);
    }

    public final void setDragEnabled(boolean z10) {
        this.dragEnabled = z10;
    }

    public final void setTouchInteractionEnabled(boolean z10) {
        this.touchInteractionEnabled = z10;
        this.omniAdContainer.getFloatingContainer().setTouchInteractionEnabled(z10);
    }

    public /* synthetic */ OmniAdTouchService(Activity activity, OmniAdContainer omniAdContainer, Point point, int i10, Function3 function3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, omniAdContainer, point, (i11 & 8) != 0 ? 10 : i10, function3);
    }
}
