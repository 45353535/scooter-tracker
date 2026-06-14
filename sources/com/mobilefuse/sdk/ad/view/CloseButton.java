package com.mobilefuse.sdk.ad.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.C4329g8;
import com.ironsource.C4424m2;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.PositionType;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.mraid.R;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0011\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0015R0\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u00109\u001a\u00020.2\u0006\u0010#\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\"\u0010G\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R*\u0010J\u001a\u00020.2\u0006\u0010#\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=R\u0016\u0010M\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010[R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\\R\u0011\u0010^\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b]\u0010;¨\u0006_"}, d2 = {"Lcom/mobilefuse/sdk/ad/view/CloseButton;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "interactionSizeDp", "resId", "Lkotlin/Function0;", "", "onClosableAction", "onCloseAction", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "closeConfig", "", "uiAdm", "<init>", "(Landroid/content/Context;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/mobilefuse/sdk/CloseConfigResponse;Ljava/lang/String;)V", "com/mobilefuse/sdk/ad/view/CloseButton$createWebView$1", "createWebView", "()Lcom/mobilefuse/sdk/ad/view/CloseButton$createWebView$1;", "onWebViewRenderGone", "()V", "js", "callJsBridgeCmd", "(Ljava/lang/String;)V", "clearDelayedTasks", "doShow", "addWebView", "applyThumbnailMode", "destroyWebView", "applyOffset", "Landroid/widget/RelativeLayout$LayoutParams;", "createCloseConfigLayoutParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "", "value", "updateThumbnailModeDims", "(F)I", "", "delayMillis", "showWithDelay", "(J)V", C4424m2.f43623v, MenuActionType.HIDE, "destroy", "Lkotlin/Function1;", "", "onVisibilityChange", "Lkotlin/jvm/functions/Function1;", "getOnVisibilityChange", "()Lkotlin/jvm/functions/Function1;", "setOnVisibilityChange", "(Lkotlin/jvm/functions/Function1;)V", "interactionSizePx", "I", "getInteractionSizePx", "()I", "isTransparent", "Z", "()Z", "setTransparent", "(Z)V", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/view/View;", "closeZone", "Landroid/view/View;", "closeBtnDelaySeconds", "F", "closeBtnDelaySecondsLeft", "countdownMode", "getCountdownMode", "setCountdownMode", "thumbnailMode", "getThumbnailMode", "setThumbnailMode", "closeZoneActivationRequestTimestamp", "J", "Ljava/lang/Runnable;", "activateCloseZoneTask", "Ljava/lang/Runnable;", "closeConfigPx", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigPx", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "setCloseConfigPx", "(Lcom/mobilefuse/sdk/CloseConfigResponse;)V", "DEFAULT_TRANSLATION", "getDEFAULT_TRANSLATION", "()F", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", C4329g8.f43166k, "visible", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
public final class CloseButton extends RelativeLayout {
    private final float DEFAULT_TRANSLATION;
    private final Runnable activateCloseZoneTask;
    private float closeBtnDelaySeconds;
    private float closeBtnDelaySecondsLeft;
    private final CloseConfigResponse closeConfig;

    @Nullable
    private CloseConfigResponse closeConfigPx;
    private View closeZone;
    private long closeZoneActivationRequestTimestamp;
    private boolean countdownMode;
    private final int interactionSizeDp;
    private final int interactionSizePx;
    private boolean isTransparent;
    private final Function0<Unit> onClosableAction;
    private final Function0<Unit> onCloseAction;

    @Nullable
    private Function1<? super Boolean, Unit> onVisibilityChange;
    private boolean thumbnailMode;
    private final String uiAdm;
    private WebView webView;

    public CloseButton(@NotNull Context context, int i10, int i11, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        this(context, i10, i11, function0, function02, null, null, 96, null);
    }

    private final void addWebView() {
        ViewGroup.LayoutParams layoutParams;
        if (this.closeConfigPx == null || (layoutParams = createCloseConfigLayoutParams()) == null) {
            int i10 = this.interactionSizePx;
            layoutParams = new ViewGroup.LayoutParams(i10, i10);
        }
        C46771 c46771CreateWebView = createWebView();
        this.webView = c46771CreateWebView;
        c46771CreateWebView.setVisibility(this.isTransparent ? 8 : 0);
        addView(c46771CreateWebView, layoutParams);
    }

    private final void applyOffset() {
        float fFloatValue = this.DEFAULT_TRANSLATION;
        int i10 = -1;
        float fFloatValue2 = (-1) * fFloatValue;
        CloseConfigResponse closeConfigResponse = this.closeConfig;
        if (closeConfigResponse != null) {
            int i11 = (closeConfigResponse.getPos() == PositionType.tr || closeConfigResponse.getPos() == PositionType.br) ? -1 : 1;
            if (closeConfigResponse.getPos() != PositionType.bl && closeConfigResponse.getPos() != PositionType.br) {
                i10 = 1;
            }
            Float xOffset = closeConfigResponse.getXOffset();
            fFloatValue2 = (xOffset != null ? xOffset.floatValue() : this.DEFAULT_TRANSLATION) * i11;
            Float yOffset = closeConfigResponse.getYOffset();
            fFloatValue = (yOffset != null ? yOffset.floatValue() : this.DEFAULT_TRANSLATION) * i10;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setTranslationX(DimConversionsKt.dpToPx(fFloatValue2, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        setTranslationY(DimConversionsKt.dpToPx(fFloatValue, context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyThumbnailMode() {
        int iIntValue;
        Integer numValueOf;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            callJsBridgeCmd("setThumbnailMode(" + this.thumbnailMode + ");");
            View view = this.closeZone;
            if (view != null) {
                CloseConfigResponse closeConfigResponse = this.closeConfigPx;
                Integer numValueOf2 = closeConfigResponse != null ? Integer.valueOf((int) closeConfigResponse.getWidth()) : null;
                CloseConfigResponse closeConfigResponse2 = this.closeConfigPx;
                Integer numValueOf3 = closeConfigResponse2 != null ? Integer.valueOf((int) closeConfigResponse2.getHeight()) : null;
                if (this.thumbnailMode) {
                    CloseConfigResponse closeConfigResponse3 = this.closeConfig;
                    numValueOf2 = closeConfigResponse3 != null ? Integer.valueOf(updateThumbnailModeDims(closeConfigResponse3.getWidth())) : null;
                    CloseConfigResponse closeConfigResponse4 = this.closeConfig;
                    numValueOf = closeConfigResponse4 != null ? Integer.valueOf(updateThumbnailModeDims(closeConfigResponse4.getHeight())) : null;
                    iIntValue = updateThumbnailModeDims(this.interactionSizeDp);
                } else {
                    Integer num = numValueOf3;
                    iIntValue = this.interactionSizePx;
                    numValueOf = num;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                view.getLayoutParams().width = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
                layoutParams2.height = iIntValue;
                view.setLayoutParams(layoutParams);
            }
        } catch (Throwable th2) {
            int i10 = CloseButton$applyThumbnailMode$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ObsoleteSdkInt"})
    public final void callJsBridgeCmd(final String js) {
        if (this.webView == null) {
            return;
        }
        SchedulersKt.getGlobalHandler().post(new Runnable() { // from class: com.mobilefuse.sdk.ad.view.CloseButton.callJsBridgeCmd.1
            @Override // java.lang.Runnable
            public final void run() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    String str = "closeButton." + js;
                    WebView webView = CloseButton.this.webView;
                    if (webView != null) {
                        webView.evaluateJavascript(str, null);
                    }
                } catch (Throwable th2) {
                    int i10 = CloseButton$callJsBridgeCmd$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
        });
    }

    private final void clearDelayedTasks() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.closeZoneActivationRequestTimestamp = 0L;
            SchedulersKt.getGlobalHandler().removeCallbacks(this.activateCloseZoneTask);
        } catch (Throwable th2) {
            int i10 = CloseButton$clearDelayedTasks$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final RelativeLayout.LayoutParams createCloseConfigLayoutParams() {
        CloseConfigResponse closeConfigResponse = this.closeConfigPx;
        int width = closeConfigResponse != null ? (int) closeConfigResponse.getWidth() : 50;
        CloseConfigResponse closeConfigResponse2 = this.closeConfigPx;
        return new RelativeLayout.LayoutParams(width, closeConfigResponse2 != null ? (int) closeConfigResponse2.getHeight() : 50);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.webkit.WebView, com.mobilefuse.sdk.ad.view.CloseButton$createWebView$1] */
    @SuppressLint({"SetJavaScriptEnabled"})
    private final C46771 createWebView() {
        final ?? r02 = new WebView(getContext()) { // from class: com.mobilefuse.sdk.ad.view.CloseButton.createWebView.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
                return false;
            }
        };
        WebSettings settings = r02.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = r02.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "settings");
        settings2.setAllowContentAccess(true);
        r02.setBackgroundColor(Color.argb(0, 255, 255, 255));
        r02.setLayerType(2, null);
        String str = this.uiAdm;
        if (str != null) {
            r02.loadDataWithBaseURL("file:///android_asset/mobilefuse/", str, "text/html", "UTF-8", null);
        } else {
            final Flow<String> specificAssetAbsolutePathFlow = MobileFuseAssetManager.INSTANCE.getSpecificAssetAbsolutePathFlow("mraid_controls.html");
            final Schedulers schedulers = Schedulers.MAIN;
            FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super String> flow) {
                    Intrinsics.checkNotNullParameter(flow, "$this$flow");
                    specificAssetAbsolutePathFlow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow;
                            SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$.inlined.runOn.1.1.1
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
                                    flowCollector.emit(value);
                                }
                            });
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t10) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t10);
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$$special$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        String str2 = (String) ((SuccessResult) result).getValue();
                        if (str2 != null) {
                            loadUrl(str2);
                        } else {
                            DebuggingKt.logError$default(r02, "Can´t load asset file. getSpecificAssetAbsolutePath returned null", null, 2, null);
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t10) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                }
            });
        }
        r02.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$createWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    HttpRequestTracker.logHttpRequest(url);
                } catch (Throwable th2) {
                    int i10 = CloseButton$createWebView$2$3$onLoadResource$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
                super.onLoadResource(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.this$0.callJsBridgeCmd("setCountdownMode(" + this.this$0.getCountdownMode() + ");");
                    this.this$0.applyThumbnailMode();
                    this.this$0.callJsBridgeCmd("show(" + this.this$0.closeBtnDelaySecondsLeft + ");");
                } catch (Throwable th2) {
                    int i10 = CloseButton$createWebView$2$3$onPageFinished$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                DebuggingKt.logDebug(this, "WebView Render Process has gone. Add a new web view.", "Close Button");
                this.this$0.onWebViewRenderGone();
                return true;
            }
        });
        return r02;
    }

    private final void destroyWebView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            WebView webView = this.webView;
            if (webView != null) {
                ViewParent parent = webView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
            }
            this.webView = null;
        } catch (Throwable th2) {
            int i10 = CloseButton$destroyWebView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final void doShow() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            clearDelayedTasks();
            this.closeZoneActivationRequestTimestamp = System.currentTimeMillis();
            addWebView();
            setVisibility(0);
            Function1<? super Boolean, Unit> function1 = this.onVisibilityChange;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            int i10 = CloseButton$doShow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWebViewRenderGone() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyWebView();
            if (getVisibility() != 0) {
                return;
            }
            this.closeBtnDelaySecondsLeft = (float) Math.rint(Math.max(0.0f, this.closeBtnDelaySeconds - ((System.currentTimeMillis() - this.closeZoneActivationRequestTimestamp) / 1000.0f)));
            addWebView();
        } catch (Throwable th2) {
            int i10 = CloseButton$onWebViewRenderGone$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final int updateThumbnailModeDims(float value) {
        float f10 = value - 10;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return DimConversionsKt.dpToPx(f10, context);
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            destroyWebView();
        } catch (Throwable th2) {
            int i10 = CloseButton$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigPx() {
        return this.closeConfigPx;
    }

    public final boolean getCountdownMode() {
        return this.countdownMode;
    }

    public final float getDEFAULT_TRANSLATION() {
        return this.DEFAULT_TRANSLATION;
    }

    public final int getInteractionSizePx() {
        return this.interactionSizePx;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnVisibilityChange() {
        return this.onVisibilityChange;
    }

    public final boolean getThumbnailMode() {
        return this.thumbnailMode;
    }

    public final void hide() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            clearDelayedTasks();
            setVisibility(4);
            Function1<? super Boolean, Unit> function1 = this.onVisibilityChange;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            WebView webView = this.webView;
            if (webView != null) {
                ViewParent parent = webView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
            }
        } catch (Throwable th2) {
            int i10 = CloseButton$hide$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: renamed from: isTransparent, reason: from getter */
    public final boolean getIsTransparent() {
        return this.isTransparent;
    }

    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    public final void setCloseConfigPx(@Nullable CloseConfigResponse closeConfigResponse) {
        this.closeConfigPx = closeConfigResponse;
    }

    public final void setCountdownMode(boolean z10) {
        this.countdownMode = z10;
    }

    public final void setOnVisibilityChange(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onVisibilityChange = function1;
    }

    public final void setThumbnailMode(boolean z10) {
        this.thumbnailMode = z10;
        applyThumbnailMode();
    }

    public final void setTransparent(boolean z10) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.isTransparent = z10;
            if (z10) {
                WebView webView = this.webView;
                if (webView != null) {
                    webView.setVisibility(8);
                    return;
                }
                return;
            }
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
        } catch (Throwable th2) {
            int i10 = CloseButton$isTransparent$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void show() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.closeBtnDelaySeconds = 0.0f;
            this.closeBtnDelaySecondsLeft = 0.0f;
            doShow();
            this.activateCloseZoneTask.run();
        } catch (Throwable th2) {
            int i10 = CloseButton$show$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void showWithDelay(long delayMillis) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        float f10 = delayMillis / 1000.0f;
        try {
            this.closeBtnDelaySeconds = f10;
            this.closeBtnDelaySecondsLeft = f10;
            doShow();
            SchedulersKt.getGlobalHandler().postDelayed(this.activateCloseZoneTask, delayMillis);
        } catch (Throwable th2) {
            int i10 = CloseButton$showWithDelay$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public CloseButton(@NotNull Context context, int i10, int i11, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable CloseConfigResponse closeConfigResponse) {
        this(context, i10, i11, function0, function02, closeConfigResponse, null, 64, null);
    }

    public CloseButton(@NotNull Context context, int i10, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        this(context, i10, 0, function0, function02, null, null, 100, null);
    }

    public CloseButton(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        this(context, 0, 0, function0, function02, null, null, 102, null);
    }

    public /* synthetic */ CloseButton(Context context, int i10, int i11, Function0 function0, Function0 function02, CloseConfigResponse closeConfigResponse, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 60 : i10, (i12 & 4) != 0 ? R.id.closeBtn : i11, function0, function02, (i12 & 32) != 0 ? null : closeConfigResponse, (i12 & 64) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseButton(@NotNull Context context, int i10, int i11, @NotNull Function0<Unit> onClosableAction, @NotNull Function0<Unit> onCloseAction, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String str) {
        CloseConfigResponse closeConfigResponse2;
        CloseConfigResponse closeConfigResponseCopy$default;
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClosableAction, "onClosableAction");
        Intrinsics.checkNotNullParameter(onCloseAction, "onCloseAction");
        this.interactionSizeDp = i10;
        this.onClosableAction = onClosableAction;
        this.onCloseAction = onCloseAction;
        this.closeConfig = closeConfigResponse;
        this.uiAdm = str;
        this.isTransparent = true;
        this.countdownMode = true;
        this.activateCloseZoneTask = new Runnable() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$activateCloseZoneTask$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.onClosableAction.invoke();
                View view = this.this$0.closeZone;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.sdk.ad.view.CloseButton$activateCloseZoneTask$1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            CloseButton$activateCloseZoneTask$1.this.this$0.onCloseAction.invoke();
                        }
                    });
                }
            }
        };
        this.DEFAULT_TRANSLATION = 5.0f;
        setId(i11);
        setVisibility(8);
        if (closeConfigResponse != null) {
            closeConfigResponse2 = closeConfigResponse;
            closeConfigResponseCopy$default = CloseConfigResponse.copy$default(closeConfigResponse2, null, DimConversionsKt.dpToPx(closeConfigResponse.getWidth(), context), DimConversionsKt.dpToPx(closeConfigResponse.getHeight(), context), null, null, 25, null);
        } else {
            closeConfigResponse2 = closeConfigResponse;
            closeConfigResponseCopy$default = null;
        }
        this.closeConfigPx = closeConfigResponseCopy$default;
        int iDpToPx = DimConversionsKt.dpToPx(i10, context);
        this.interactionSizePx = iDpToPx;
        if (closeConfigResponse2 != null && this.closeConfigPx != null) {
            layoutParams = createCloseConfigLayoutParams();
        } else {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        View view = new View(context);
        addView(view, layoutParams);
        Unit unit = Unit.f93236a;
        this.closeZone = view;
        applyOffset();
    }
}
