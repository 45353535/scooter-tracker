package com.mobilefuse.sdk.storyboard.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.ui.Animations;
import com.mobilefuse.sdk.ui.GestureDetectionKt;
import com.mobilefuse.sdk.ui.RoundedCornerLinearLayout;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.taurusx.tax.g.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0017J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0017J\u0019\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010\u0017R\u001c\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bA\u0010@R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bB\u0010@R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "ctx", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "response", "Lcom/mobilefuse/sdk/AdRendererConfig;", "config", "Lcom/mobilefuse/sdk/AdRendererListener;", "adRendererListener", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "admClickInfoProvider", "Lkotlin/Function0;", "", "onDestroy", "onStartShowing", "onCompleteHiding", "Lkotlin/Function1;", "", "onRendered", "<init>", "(Landroid/content/Context;Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "createGesture", "()V", "swipeDown", "setupContainer", "renderAd", "hideView", "showAd", "showView", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", a.f66078s, "onInterceptTouchEvent", "destroy", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "", "OVERLAY_WIDTH", "I", "OVERLAY_HEIGHT", "MARGIN_BOTTOM", "Landroid/widget/LinearLayout;", "container", "Landroid/widget/LinearLayout;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "getResponse", "()Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "Lcom/mobilefuse/sdk/AdRendererConfig;", "getConfig", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "Lcom/mobilefuse/sdk/AdRendererListener;", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "Lkotlin/jvm/functions/Function0;", "getOnDestroy", "()Lkotlin/jvm/functions/Function0;", "getOnStartShowing", "getOnCompleteHiding", "Lkotlin/jvm/functions/Function1;", "getOnRendered", "()Lkotlin/jvm/functions/Function1;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
public final class OverlayView extends RelativeLayout {
    private final int MARGIN_BOTTOM;
    private final int OVERLAY_HEIGHT;
    private final int OVERLAY_WIDTH;
    private BaseAdRenderer<?> adRenderer;
    private final AdRendererListener adRendererListener;
    private final AdmClickInfoProvider admClickInfoProvider;

    @Nullable
    private final AdRendererConfig config;
    private LinearLayout container;

    @NotNull
    private final Context ctx;
    private GestureDetector gestureDetector;

    @Nullable
    private final Function0<Unit> onCompleteHiding;

    @NotNull
    private final Function0<Unit> onDestroy;

    @NotNull
    private final Function1<Boolean, Unit> onRendered;

    @Nullable
    private final Function0<Unit> onStartShowing;

    @NotNull
    private final OverlayResponse response;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.storyboard.overlay.OverlayView$createGesture$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class AnonymousClass1 extends y implements Function0<Unit> {
        AnonymousClass1(OverlayView overlayView) {
            super(0, overlayView, OverlayView.class, "swipeDown", "swipeDown()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OverlayView) this.receiver).swipeDown();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OverlayView(Context context, OverlayResponse overlayResponse, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener, AdmClickInfoProvider admClickInfoProvider, Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 function12;
        Function0 function04;
        admClickInfoProvider = (i10 & 16) != 0 ? null : admClickInfoProvider;
        function02 = (i10 & 64) != 0 ? null : function02;
        if ((i10 & 128) != 0) {
            function12 = function1;
            function04 = null;
        } else {
            function12 = function1;
            function04 = function03;
        }
        this(context, overlayResponse, adRendererConfig, adRendererListener, admClickInfoProvider, function0, function02, function04, function12);
    }

    private final void createGesture() {
        if (this.response.getDismissible()) {
            this.gestureDetector = GestureDetectionKt.createGestureDetector$default(this.ctx, new AnonymousClass1(this), null, null, null, 28, null);
        }
    }

    private final void renderAd() throws Throwable {
        ComponentType componentType = ComponentType.MRAID_AD_RENDERER;
        AdRendererComponent registeredComponent = ComponentRegistrar.getRegisteredComponent(componentType);
        if (registeredComponent == null) {
            DebuggingKt.logError$default(this, "Unable to render: There is no Ad Renderer Component registered for Component Type: " + componentType, null, 2, null);
            this.onRendered.invoke(Boolean.FALSE);
            return;
        }
        BaseAdRenderer<?> baseAdRendererCreateInstance = registeredComponent.createInstance(getContext(), this.config, this.adRendererListener);
        this.adRenderer = baseAdRendererCreateInstance;
        if (baseAdRendererCreateInstance == null) {
            DebuggingKt.logError$default(this, "Unable to render: adRenderer instance is null", null, 2, null);
            this.onRendered.invoke(Boolean.FALSE);
            return;
        }
        if (baseAdRendererCreateInstance != null) {
            baseAdRendererCreateInstance.preloadAd(this.response.getAdm());
        }
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.admClickInfoProvider = this.admClickInfoProvider;
        }
    }

    private final void setupContainer() {
        try {
            int iConvertDpToPx = Utils.convertDpToPx(this.ctx, this.OVERLAY_WIDTH);
            int iConvertDpToPx2 = Utils.convertDpToPx(this.ctx, this.OVERLAY_HEIGHT);
            int iConvertDpToPx3 = Utils.convertDpToPx(this.ctx, this.MARGIN_BOTTOM);
            setClipChildren(false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iConvertDpToPx, iConvertDpToPx2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            setLayoutParams(layoutParams);
            RoundedCornerLinearLayout roundedCornerLinearLayout = new RoundedCornerLinearLayout(this.ctx, null, 0, Utils.convertDpToPx(r6, 20), 6, null);
            roundedCornerLinearLayout.setOrientation(1);
            roundedCornerLinearLayout.setGravity(17);
            Unit unit = Unit.f93236a;
            this.container = roundedCornerLinearLayout;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(0, 0, 0, iConvertDpToPx3);
            LinearLayout linearLayout = this.container;
            if (linearLayout != null) {
                linearLayout.setLayoutParams(layoutParams2);
            }
            setVisibility(4);
            setClickable(true);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            this.onRendered.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeDown() {
        LinearLayout linearLayout = this.container;
        if (linearLayout != null) {
            Animations.INSTANCE.swipeDownAnimation(linearLayout, 500L, new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayView$swipeDown$$inlined$let$lambda$1
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
                    this.this$0.post(new Runnable() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayView$swipeDown$$inlined$let$lambda$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function0<Unit> onCompleteHiding = OverlayView$swipeDown$$inlined$let$lambda$1.this.this$0.getOnCompleteHiding();
                            if (onCompleteHiding != null) {
                                onCompleteHiding.invoke();
                            }
                            OverlayView$swipeDown$$inlined$let$lambda$1.this.this$0.getOnDestroy().invoke();
                        }
                    });
                }
            });
        }
    }

    public final void destroy() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            baseAdRenderer.destroy();
        }
        this.adRenderer = null;
        this.container = null;
    }

    @Nullable
    public final AdRendererConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Nullable
    public final Function0<Unit> getOnCompleteHiding() {
        return this.onCompleteHiding;
    }

    @NotNull
    public final Function0<Unit> getOnDestroy() {
        return this.onDestroy;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnRendered() {
        return this.onRendered;
    }

    @Nullable
    public final Function0<Unit> getOnStartShowing() {
        return this.onStartShowing;
    }

    @NotNull
    public final OverlayResponse getResponse() {
        return this.response;
    }

    public final void hideView() {
        swipeDown();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(ev);
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event == null) {
            return false;
        }
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    public final void showAd() throws Throwable {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            return;
        }
        if (baseAdRenderer != null) {
            baseAdRenderer.renderAd();
        }
        LinearLayout linearLayout = this.container;
        if (linearLayout != null) {
            BaseAdRenderer<?> baseAdRenderer2 = this.adRenderer;
            linearLayout.addView(baseAdRenderer2 != null ? baseAdRenderer2.getAdView() : null);
        }
        addView(this.container);
    }

    public final void showView() {
        post(new Runnable() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayView.showView.1
            @Override // java.lang.Runnable
            public final void run() {
                Function0<Unit> onStartShowing = OverlayView.this.getOnStartShowing();
                if (onStartShowing != null) {
                    onStartShowing.invoke();
                }
                Animations.swipeUpAnimation$default(Animations.INSTANCE, OverlayView.this, 500L, null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayView.showView.1.1
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
                        OverlayView.this.setVisibility(0);
                    }
                }, 4, null);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OverlayView(@NotNull Context ctx, @NotNull OverlayResponse response, @Nullable AdRendererConfig adRendererConfig, @NotNull AdRendererListener adRendererListener, @Nullable AdmClickInfoProvider admClickInfoProvider, @NotNull Function0<Unit> onDestroy, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull Function1<? super Boolean, Unit> onRendered) throws Throwable {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(adRendererListener, "adRendererListener");
        Intrinsics.checkNotNullParameter(onDestroy, "onDestroy");
        Intrinsics.checkNotNullParameter(onRendered, "onRendered");
        this.ctx = ctx;
        this.response = response;
        this.config = adRendererConfig;
        this.adRendererListener = adRendererListener;
        this.admClickInfoProvider = admClickInfoProvider;
        this.onDestroy = onDestroy;
        this.onStartShowing = function0;
        this.onCompleteHiding = function02;
        this.onRendered = onRendered;
        this.OVERLAY_WIDTH = 300;
        this.OVERLAY_HEIGHT = 100;
        this.MARGIN_BOTTOM = 25;
        createGesture();
        setupContainer();
        renderAd();
    }
}
