package com.mobilefuse.videoplayer.endcard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastHtmlResource;
import com.mobilefuse.videoplayer.model.VastIFrameResource;
import com.mobilefuse.videoplayer.model.VastResourceType;
import com.mobilefuse.videoplayer.model.VastStaticResource;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u000eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/EndCardView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/app/Activity;", "renderingActivity", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "config", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Landroid/app/Activity;Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;Lcom/mobilefuse/videoplayer/endcard/EndCardListener;)V", "", "showAd", "()V", "Lcom/mobilefuse/sdk/AdRendererListener;", "createAdRendererListener", "()Lcom/mobilefuse/sdk/AdRendererListener;", "triggerClickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "clickThrough", "onClickThrough", "(Lcom/mobilefuse/videoplayer/model/VastClickThrough;)V", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "closeTrigger", "close", "(Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;)V", "cancelAutoCloseTimer", "Lcom/mobilefuse/sdk/rx/Flow;", "", "getResourceHtmlContentFlow", "()Lcom/mobilefuse/sdk/rx/Flow;", "getStaticResourceHtmlContent", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "onComplete", "renderAd", "(Lkotlin/jvm/functions/Function1;)V", "enabledAutoClose", "disableAutoClose", "destroy", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "vastCompanion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adRendererListener", "Lcom/mobilefuse/sdk/AdRendererListener;", "Landroid/view/View;", "adView", "Landroid/view/View;", "clickThroughView", "autoCloseEnabled", "Z", "Ljava/util/Timer;", "autoCloseTimer", "Ljava/util/Timer;", "Landroid/app/Activity;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "getConfig", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "getListener", "()Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
public final class EndCardView extends RelativeLayout {
    private BaseAdRenderer<?> adRenderer;
    private AdRendererListener adRendererListener;
    private View adView;
    private boolean autoCloseEnabled;
    private Timer autoCloseTimer;
    private View clickThroughView;

    @NotNull
    private final EndCardConfig config;

    @NotNull
    private final EndCardListener listener;
    private Activity renderingActivity;
    private final VastCompanion vastCompanion;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VastResourceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[VastResourceType.HTML.ordinal()] = 1;
            iArr[VastResourceType.IFRAME.ordinal()] = 2;
            iArr[VastResourceType.STATIC.ordinal()] = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndCardView(@NotNull Context context, @Nullable Activity activity, @NotNull EndCardConfig config, @NotNull EndCardListener listener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.renderingActivity = activity;
        this.config = config;
        this.listener = listener;
        this.vastCompanion = config.getCompanion();
        setBackgroundColor(0);
    }

    private final void cancelAutoCloseTimer() {
        Timer timer = this.autoCloseTimer;
        if (timer == null) {
            return;
        }
        try {
            timer.cancel();
            this.autoCloseTimer = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close(ViewCloseTrigger closeTrigger) {
        this.listener.onTrackingEvent(this.vastCompanion, VastTrackingEventType.closeLinear);
        this.listener.onClosed(this.vastCompanion, closeTrigger);
        cancelAutoCloseTimer();
    }

    private final AdRendererListener createAdRendererListener() {
        return new AdRendererListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView.createAdRendererListener.1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    EndCardView.this.triggerClickThrough();
                } catch (Throwable th2) {
                    int i10 = EndCardView$createAdRendererListener$1$onAdClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    EndCardView.this.close(ViewCloseTrigger.USER);
                } catch (Throwable th2) {
                    int i10 = EndCardView$createAdRendererListener$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@NotNull RtbLossReason error) {
                Intrinsics.checkNotNullParameter(error, "error");
                EndCardView.this.getListener().onError(VastError.COMPANION_RESOURCE_LOAD_FAILED);
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                try {
                    if (isPreloaded) {
                        EndCardView.this.showAd();
                    } else {
                        EndCardView.this.getListener().onError(VastError.COMPANION_RESOURCE_LOAD_FAILED);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    private final Flow<String> getResourceHtmlContentFlow() {
        final Flow flowFlowSingle = FlowKt.flowSingle((Function0) new Function0<String>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView.getResourceHtmlContentFlow.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                VastBaseResource resource = EndCardView.this.vastCompanion.getResource();
                if (resource == null) {
                    return null;
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[resource.getResourceType().ordinal()];
                if (i10 == 1) {
                    if (resource instanceof VastHtmlResource) {
                        return ((VastHtmlResource) resource).getHtmlContent();
                    }
                    return null;
                }
                if (i10 != 2) {
                    if (i10 == 3) {
                        return EndCardView.this.getStaticResourceHtmlContent();
                    }
                    throw new m();
                }
                if (resource instanceof VastIFrameResource) {
                    return ((VastIFrameResource) resource).getUrl();
                }
                return null;
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$emitOn$1
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
            public final void invoke2(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$emitOn$1.1
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
                        flowFlowSingle.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$.inlined.emitOn.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow2.emit(value);
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
                });
            }
        });
        return FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                invoke2(flowCollector);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                flow.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$getResourceHtmlContentFlow$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow2;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(null));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
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
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getStaticResourceHtmlContent() {
        String url;
        VastStaticResource vastStaticResource = (VastStaticResource) this.vastCompanion.getResource();
        if (vastStaticResource == null || vastStaticResource.getUrl() == null) {
            return null;
        }
        try {
            MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            String specificAssetContentSync = mobileFuseAssetManager.getSpecificAssetContentSync("vast_static_resource.html", context);
            if (specificAssetContentSync != null) {
                String strW = StringsKt.W(specificAssetContentSync, "{RESOURCE_SRC_URL}", vastStaticResource.getUrl(), false, 4, null);
                VastClickThrough clickThrough = this.vastCompanion.getClickThrough();
                if (clickThrough == null || (url = clickThrough.getUrl()) == null) {
                    url = "#";
                }
                return StringsKt.W(strW, "{CLICK_THROUGH}", url, false, 4, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    private final void onClickThrough(VastClickThrough clickThrough) {
        this.listener.onClicked(this.vastCompanion, clickThrough);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAd() throws Throwable {
        VastResourceType resourceType;
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            this.listener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            return;
        }
        VastBaseResource resource = this.vastCompanion.getResource();
        if (resource == null || (resourceType = resource.getResourceType()) == null) {
            this.listener.onError(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            return;
        }
        Activity activity = this.renderingActivity;
        if (activity != null) {
            baseAdRenderer.setRenderingActivity(activity);
        }
        baseAdRenderer.renderAd();
        this.adView = baseAdRenderer.getAdView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.adView, layoutParams);
        if (resourceType == VastResourceType.STATIC) {
            View view = new View(getContext());
            view.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$showAd$$inlined$apply$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.this$0.triggerClickThrough();
                }
            });
            view.setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
            Unit unit = Unit.f93236a;
            this.clickThroughView = view;
            addView(this.clickThroughView, 0, new RelativeLayout.LayoutParams(-1, -1));
        }
        this.listener.onTrackingEvent(this.vastCompanion, VastTrackingEventType.creativeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerClickThrough() {
        VastResourceType resourceType;
        try {
            VastBaseResource resource = this.vastCompanion.getResource();
            if (resource != null && (resourceType = resource.getResourceType()) != null) {
                onClickThrough(resourceType == VastResourceType.STATIC ? this.vastCompanion.getClickThrough() : null);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void destroy() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.renderingActivity = null;
            BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
            if (baseAdRenderer != null) {
                baseAdRenderer.destroy();
            }
            this.adRenderer = null;
            this.adRendererListener = null;
        } catch (Throwable th2) {
            int i10 = EndCardView$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void disableAutoClose() {
        if (this.autoCloseEnabled) {
            this.autoCloseEnabled = false;
            cancelAutoCloseTimer();
        }
    }

    public final void enabledAutoClose() {
        if (this.config.getAutoCloseAllowed().invoke().booleanValue() && !this.autoCloseEnabled && this.config.getAutoCloseDelayMillis() > 0) {
            this.autoCloseEnabled = true;
            Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$enabledAutoClose$$inlined$apply$lambda$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Handler handler = this.this$0.getHandler();
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$enabledAutoClose$$inlined$apply$lambda$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    EndCardView$enabledAutoClose$$inlined$apply$lambda$1.this.this$0.close(ViewCloseTrigger.AUTO_CLOSE);
                                } catch (Throwable th2) {
                                    StabilityHelper.logException(EndCardView$enabledAutoClose$$inlined$apply$lambda$1.this, th2);
                                }
                            }
                        });
                    }
                }
            }, this.config.getAutoCloseDelayMillis());
            Unit unit = Unit.f93236a;
            this.autoCloseTimer = timer;
        }
    }

    @NotNull
    public final EndCardConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final EndCardListener getListener() {
        return this.listener;
    }

    public final void renderAd(@NotNull final Function1<? super Boolean, Unit> onComplete) throws Throwable {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ComponentType componentType = ComponentType.MRAID_AD_RENDERER;
        AdRendererComponent registeredComponent = ComponentRegistrar.getRegisteredComponent(componentType);
        if (registeredComponent == null) {
            DebuggingKt.logError$default(this, "Can't render EndCard. Reason: There is no Ad Renderer Component registered for Component Type: " + componentType, null, 2, null);
            onComplete.invoke(Boolean.FALSE);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] screenSizeAsDp = MediaUtilsKt.getScreenSizeAsDp(context);
        AdRendererConfig.Builder builder = new AdRendererConfig.Builder();
        VideoPlayerSettings.Companion companion = VideoPlayerSettings.INSTANCE;
        AdRendererConfig.Builder configClose = builder.setSdkName(companion.getSdkName()).setSdkVersion(companion.getSdkVersion()).setAdvertisingId(companion.getAdvertisingId()).setLimitTrackingEnabled(companion.isLimitTrackingEnabled()).setAdWidth(screenSizeAsDp[0]).setAdHeight(screenSizeAsDp[1]).setConfigClose(this.config.getCloseConfigResponse());
        ObservableConfig observableConfig = new ObservableConfig();
        observableConfig.setValue(ObservableConfigKey.FORCE_SKIP_SECONDS, Float.valueOf(this.config.getCloseButtonDelaySeconds()));
        observableConfig.setValue(ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP, Boolean.valueOf(this.config.getAllowClickthroughWithoutTap()));
        Unit unit = Unit.f93236a;
        AdRendererConfig.Builder configBuilder = configClose.setObservableConfig(observableConfig).setFullscreenAd(false).setThumbnailSize(this.config.isThumbnailSize());
        if (this.config.isClosable()) {
            Intrinsics.checkNotNullExpressionValue(configBuilder, "configBuilder");
            configBuilder.setCloseButtonEnabled(true);
        }
        this.adRendererListener = createAdRendererListener();
        BaseAdRenderer<?> baseAdRendererCreateInstance = registeredComponent.createInstance(getContext(), configBuilder.build(), this.adRendererListener);
        this.adRenderer = baseAdRendererCreateInstance;
        if (baseAdRendererCreateInstance == null) {
            DebuggingKt.logError$default(this, "Can't render EndCard. Reason: adRenderer instance is a null", null, 2, null);
            onComplete.invoke(Boolean.FALSE);
        } else {
            if (this.vastCompanion.getResource() == null) {
                onComplete.invoke(Boolean.FALSE);
                return;
            }
            final Flow<String> resourceHtmlContentFlow = getResourceHtmlContentFlow();
            final Schedulers schedulers = Schedulers.MAIN;
            FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$renderAd$$inlined$runOn$1
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
                    resourceHtmlContentFlow.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$renderAd$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow;
                            SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$renderAd$.inlined.runOn.1.1.1
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
            }).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.endcard.EndCardView$renderAd$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) throws Throwable {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        String str = (String) ((SuccessResult) result).getValue();
                        if (str == null) {
                            DebuggingKt.logError$default(this.this$0, "Can't render EndCard. Reason: html content is a null", null, 2, null);
                            onComplete.invoke(Boolean.FALSE);
                            return;
                        }
                        BaseAdRenderer baseAdRenderer = this.this$0.adRenderer;
                        if (baseAdRenderer != null) {
                            baseAdRenderer.preloadAd(str);
                            onComplete.invoke(Boolean.TRUE);
                        } else {
                            DebuggingKt.logError$default(this.this$0, "Can't render EndCard. Reason: can't request ad renderer to praload an ad", null, 2, null);
                            onComplete.invoke(Boolean.FALSE);
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
    }
}
