package com.mobilefuse.sdk.ad.rendering.omniad;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainerFactoryKt;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.AnimatedPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticPositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticSizeModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorServiceKt;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdFullscreenService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService;
import com.mobilefuse.sdk.ad.rendering.omniad.service.TouchEventType;
import com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixels;
import com.mobilefuse.sdk.ad.rendering.omniad.view.ViewRenderingPixelsKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0003H\u0014J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0014J\u001c\u00101\u001a\u00020*2\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020*05J\b\u00106\u001a\u00020*H\u0014R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/ThumbnailAdController;", "Lcom/mobilefuse/sdk/ad/rendering/ExtendedController;", "renderingActivity", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "sizeDp", "Landroid/graphics/Point;", "(Landroid/app/Activity;Landroid/view/View;Landroid/graphics/Point;)V", "value", "", "anchor", "getAnchor", "()I", "setAnchor", "(I)V", "anchorService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;", "animatedPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "defaultPositionModifier", "defaultScaleModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "fullscreenService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdFullscreenService;", "marginDp", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "propertyService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "getRenderingActivity", "()Landroid/app/Activity;", "sizePx", "staticPositionModifier", "staticSizeModifier", "touchService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdTouchService;", "viewRenderingPixels", "Lcom/mobilefuse/sdk/ad/rendering/omniad/view/ViewRenderingPixels;", "bindContentImpl", "", "adContent", "activity", "getExtendedAdType", "Lcom/mobilefuse/sdk/ExtendedAdType;", "invalidateLayout", "onAdCloseRequested", "requestFullscreenChange", "changeToFullscreen", "", "completeAction", "Lkotlin/Function0;", "unbindContentImpl", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
public final class ThumbnailAdController extends ExtendedController {
    private final OmniAdAnchorService anchorService;
    private final PositionModifier animatedPositionModifier;
    private final View contentView;
    private final PositionModifier defaultPositionModifier;
    private final ScaleModifier defaultScaleModifier;
    private final SizeModifier defaultSizeModifier;
    private final OmniAdFullscreenService fullscreenService;
    private final int marginDp;
    private final OmniAdContainer omniAdContainer;
    private final OmniAdPropertyService propertyService;

    @NotNull
    private final Activity renderingActivity;
    private final Point sizeDp;
    private final Point sizePx;
    private final PositionModifier staticPositionModifier;
    private final SizeModifier staticSizeModifier;
    private OmniAdTouchService touchService;
    private ViewRenderingPixels viewRenderingPixels;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TouchEventType.DRAG.ordinal()] = 1;
            iArr[TouchEventType.TOUCH_UP.ordinal()] = 2;
            iArr[TouchEventType.TOUCH_DOWN.ordinal()] = 3;
        }
    }

    public ThumbnailAdController(@NotNull Activity renderingActivity, @NotNull View contentView, @NotNull Point sizeDp) {
        Intrinsics.checkNotNullParameter(renderingActivity, "renderingActivity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(sizeDp, "sizeDp");
        this.renderingActivity = renderingActivity;
        this.contentView = contentView;
        this.sizeDp = sizeDp;
        Point pointDpToPx = DimConversionsKt.dpToPx(sizeDp, renderingActivity);
        this.sizePx = pointDpToPx;
        this.marginDp = 10;
        OmniAdContainer omniAdContainerCreateOmniAdContainer = OmniAdContainerFactoryKt.createOmniAdContainer(renderingActivity, contentView);
        this.omniAdContainer = omniAdContainerCreateOmniAdContainer;
        this.animatedPositionModifier = new AnimatedPositionModifier(omniAdContainerCreateOmniAdContainer, 0L, null, 6, null);
        StaticPositionModifier staticPositionModifier = new StaticPositionModifier(omniAdContainerCreateOmniAdContainer);
        this.staticPositionModifier = staticPositionModifier;
        StaticSizeModifier staticSizeModifier = new StaticSizeModifier(omniAdContainerCreateOmniAdContainer);
        this.staticSizeModifier = staticSizeModifier;
        PositionModifier defaultPositionModifier = omniAdContainerCreateOmniAdContainer.getDefaultPositionModifier();
        this.defaultPositionModifier = defaultPositionModifier;
        SizeModifier defaultSizeModifier = omniAdContainerCreateOmniAdContainer.getDefaultSizeModifier();
        this.defaultSizeModifier = defaultSizeModifier;
        this.defaultScaleModifier = omniAdContainerCreateOmniAdContainer.getDefaultScaleModifier();
        OmniAdPropertyService omniAdPropertyService = new OmniAdPropertyService(renderingActivity, pointDpToPx, omniAdContainerCreateOmniAdContainer, defaultPositionModifier, defaultSizeModifier);
        this.propertyService = omniAdPropertyService;
        this.fullscreenService = new OmniAdFullscreenService(omniAdPropertyService, defaultPositionModifier, defaultSizeModifier);
        OmniAdAnchorService omniAdAnchorService = new OmniAdAnchorService(omniAdPropertyService, 10, 3);
        this.anchorService = omniAdAnchorService;
        this.touchService = new OmniAdTouchService(renderingActivity, omniAdContainerCreateOmniAdContainer, sizeDp, 10, new Function3<Integer, Integer, TouchEventType, Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.ThumbnailAdController.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, TouchEventType touchEventType) {
                invoke(num.intValue(), num2.intValue(), touchEventType);
                return Unit.f93236a;
            }

            public final void invoke(int i10, int i11, @NotNull TouchEventType touchType) {
                Intrinsics.checkNotNullParameter(touchType, "touchType");
                int i12 = WhenMappings.$EnumSwitchMapping$0[touchType.ordinal()];
                if (i12 == 1) {
                    OmniAdPropertyService.changePosition$default(ThumbnailAdController.this.propertyService, i10, i11, ThumbnailAdController.this.staticPositionModifier, null, 8, null);
                    return;
                }
                if (i12 == 2) {
                    OmniAdPropertyService.changePosition$default(ThumbnailAdController.this.propertyService, i10, i11, ThumbnailAdController.this.animatedPositionModifier, null, 8, null);
                    OmniAdPropertyService.changeScale$default(ThumbnailAdController.this.propertyService, 1.0f, ThumbnailAdController.this.defaultScaleModifier, null, 4, null);
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    OmniAdPropertyService.changeScale$default(ThumbnailAdController.this.propertyService, 1.2f, ThumbnailAdController.this.defaultScaleModifier, null, 4, null);
                }
            }
        });
        OmniAdPropertyService.changeSize$default(omniAdPropertyService, pointDpToPx.x, pointDpToPx.y, staticSizeModifier, null, 8, null);
        OmniAdAnchorService.changePositionToAnchor$default(omniAdAnchorService, staticPositionModifier, null, 2, null);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void bindContentImpl(@NotNull View adContent, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(adContent, "adContent");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.viewRenderingPixels = ViewRenderingPixelsKt.createViewRenderingPixels(activity);
    }

    public final int getAnchor() {
        return this.anchorService.getAnchor();
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    @NotNull
    public ExtendedAdType getExtendedAdType() {
        return VastAdRenderer.VastExtendedAdType.THUMBNAIL;
    }

    @NotNull
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    public void invalidateLayout() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            super.invalidateLayout();
            ViewRenderingPixels viewRenderingPixels = this.viewRenderingPixels;
            if (viewRenderingPixels != null) {
                viewRenderingPixels.invalidateLayout();
            }
            this.fullscreenService.invalidateLayout(OmniAdAnchorServiceKt.getAnchorPosition(this.anchorService), this.staticPositionModifier, this.staticSizeModifier);
        } catch (Throwable th2) {
            int i10 = ThumbnailAdController$invalidateLayout$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void onAdCloseRequested() {
    }

    public final void requestFullscreenChange(boolean changeToFullscreen, @NotNull final Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        if (!changeToFullscreen) {
            OmniAdFullscreenService.exitFullscreen$default(this.fullscreenService, null, null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.ThumbnailAdController.requestFullscreenChange.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ThumbnailAdController.this.touchService.setDragEnabled(true);
                    completeAction.invoke();
                }
            }, 3, null);
        } else {
            this.touchService.setDragEnabled(false);
            OmniAdFullscreenService.enterFullscreen$default(this.fullscreenService, null, null, completeAction, 3, null);
        }
    }

    public final void setAnchor(int i10) {
        this.anchorService.setAnchor(i10);
    }

    @Override // com.mobilefuse.sdk.ad.rendering.ExtendedController
    protected void unbindContentImpl() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.omniAdContainer.destroy();
            ViewRenderingPixels viewRenderingPixels = this.viewRenderingPixels;
            if (viewRenderingPixels != null) {
                viewRenderingPixels.removePixels();
            }
            this.viewRenderingPixels = null;
        } catch (Throwable th2) {
            int i10 = ThumbnailAdController$unbindContentImpl$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }
}
