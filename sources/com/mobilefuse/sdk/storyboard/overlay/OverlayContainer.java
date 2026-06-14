package com.mobilefuse.sdk.storyboard.overlay;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.taurusx.tax.f.y;
import java.net.URLDecoder;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J%\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\nH\u0002J\u0006\u0010&\u001a\u00020\nJ\b\u0010'\u001a\u0004\u0018\u00010\u0017J\u0006\u0010(\u001a\u00020\nJ\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer;", "", "ctx", "Landroid/content/Context;", "response", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "parentConfig", "Lcom/mobilefuse/sdk/AdRendererConfig;", "onStartShowing", "Lkotlin/Function0;", "", "onCompleteHiding", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;Lcom/mobilefuse/sdk/AdRendererConfig;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;)V", "config", "getConfig$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "setConfig$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/AdRendererConfig;)V", "dismissTimer", "Ljava/util/Timer;", "overlayView", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayView;", "getResponse", "()Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "setResponse", "(Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;)V", "showTimer", "createAdRendererListener", "Lcom/mobilefuse/sdk/AdRendererListener;", "createConfigObj", "createTimer", "specificValue", "", "specificAction", "createTimer$mobilefuse_sdk_core_release", "createView", "dismissOverlay", "getView", "hideOverlay", "onRendered", "success", "", "removeView", "showOverlay", "showOverlayTimer", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class OverlayContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final AdmClickInfoProvider admClickInfoProvider;

    @Nullable
    private AdRendererConfig config;
    private final Context ctx;
    private Timer dismissTimer;
    private final Function0<Unit> onCompleteHiding;
    private final Function0<Unit> onStartShowing;
    private OverlayView overlayView;
    private final AdRendererConfig parentConfig;

    @NotNull
    private OverlayResponse response;
    private Timer showTimer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer$Companion;", "", "()V", "parseOverlay", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "jsonObject", "Lorg/json/JSONObject;", "response", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ OverlayResponse parseOverlay$default(Companion companion, JSONObject jSONObject, OverlayResponse overlayResponse, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                overlayResponse = null;
            }
            return companion.parseOverlay(jSONObject, overlayResponse);
        }

        @Nullable
        public final OverlayResponse parseOverlay(@NotNull JSONObject jsonObject, @Nullable OverlayResponse response) {
            String str;
            Float showDelay;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                AdmMediaType type = OverlayResponse.INSTANCE.getType(jsonObject.optString("type", "mraid"));
                if (type == null) {
                    return null;
                }
                String strOptString = jsonObject.optString("adm");
                if (Intrinsics.areEqual(strOptString, "")) {
                    strOptString = null;
                }
                if (strOptString != null && (adm = URLDecoder.decode(strOptString, "UTF-8")) != null) {
                    str = adm;
                } else if (response != null) {
                    String adm = response.getAdm();
                    str = adm;
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                float fOptDouble = (float) jsonObject.optDouble("show_delay", (response == null || (showDelay = response.getShowDelay()) == null) ? 0.0d : showDelay.floatValue());
                boolean zOptBoolean = jsonObject.optBoolean(POBCTAOverlayData.KEY_CTA_DISMISSIBLE, response != null ? response.getDismissible() : false);
                Float fValueOf = Float.valueOf((float) jsonObject.optDouble("dismiss_delay"));
                if (Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                if (fValueOf == null) {
                    fValueOf = response != null ? response.getDismissDelay() : null;
                }
                return new OverlayResponse(type, str, zOptBoolean, Float.valueOf(fOptDouble), Float.valueOf(fValueOf != null ? fValueOf.floatValue() : (float) 0.0d));
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class C46981 extends kotlin.jvm.internal.y implements Function0<Unit> {
        C46981(OverlayContainer overlayContainer) {
            super(0, overlayContainer, OverlayContainer.class, "removeView", "removeView()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OverlayContainer) this.receiver).removeView();
        }
    }

    public OverlayContainer(@NotNull Context ctx, @NotNull OverlayResponse response, @NotNull AdRendererConfig parentConfig, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable AdmClickInfoProvider admClickInfoProvider) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(parentConfig, "parentConfig");
        this.ctx = ctx;
        this.response = response;
        this.parentConfig = parentConfig;
        this.onStartShowing = function0;
        this.onCompleteHiding = function02;
        this.admClickInfoProvider = admClickInfoProvider;
        createConfigObj();
        createView();
    }

    private final AdRendererListener createAdRendererListener() {
        return new AdRendererListener() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.createAdRendererListener.1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    OverlayView overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.hideView();
                    }
                    OverlayContainer.this.overlayView = null;
                } catch (Throwable th2) {
                    int i10 = OverlayContainer$createAdRendererListener$1$onAdClosed$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() {
                OverlayContainer.this.dismissOverlay();
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@NotNull RtbLossReason error) {
                Intrinsics.checkNotNullParameter(error, "error");
                DebuggingKt.logError$default(this, "Overlay error: " + error.name(), null, 2, null);
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) {
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) {
                try {
                    if (!isPreloaded) {
                        OverlayContainer.this.onRendered(false);
                        return;
                    }
                    OverlayContainer.this.onRendered(true);
                    OverlayView overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.showAd();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    private final void createConfigObj() {
        this.config = new AdRendererConfig.Builder().setSdkName(this.parentConfig.getSdkName()).setSdkVersion(this.parentConfig.getSdkVersion()).setAdvertisingId(this.parentConfig.getAdvertisingId()).setLimitTrackingEnabled(this.parentConfig.isLimitTrackingEnabled()).setAdInstanceId(this.parentConfig.getAdInstanceId()).setSubjectToCoppa(this.parentConfig.isSubjectToCoppa()).setTestMode(this.parentConfig.isTestMode()).setFullscreenAd(false).setCloseButtonEnabled(false).setThumbnailSize(this.parentConfig.isThumbnailSize()).setTransparentBackground(this.parentConfig.isTransparentBackground()).setDeviceIp(this.parentConfig.getDeviceIp()).setExtendedAdType(this.parentConfig.getExtendedAdType()).setObservableConfig(this.parentConfig.getObservableConfig()).build();
    }

    private final void createView() {
        this.overlayView = new OverlayView(this.ctx, this.response, this.config, createAdRendererListener(), this.admClickInfoProvider, new C46981(this), new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.createView.2
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
                Function0 function0 = OverlayContainer.this.onStartShowing;
                if (function0 != null) {
                }
            }
        }, new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.createView.3
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
                Function0 function0 = OverlayContainer.this.onCompleteHiding;
                if (function0 != null) {
                }
            }
        }, new Function1<Boolean, Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.createView.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                OverlayContainer.this.onRendered(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRendered(boolean success) {
        if (success) {
            return;
        }
        DebuggingKt.logError$default(this, "There was an error rendering the overlay", null, 2, null);
    }

    @VisibleForTesting
    @Nullable
    public final Timer createTimer$mobilefuse_sdk_core_release(final long specificValue, @NotNull final Function0<Unit> specificAction) {
        Intrinsics.checkNotNullParameter(specificAction, "specificAction");
        try {
            final Handler handler = Utils.getHandler();
            Intrinsics.checkNotNullExpressionValue(handler, "getHandler()");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createTimer$$inlined$apply$lambda$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    handler.post(new Runnable() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer$createTimer$$inlined$apply$lambda$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                specificAction.invoke();
                            } catch (Throwable th2) {
                                StabilityHelper.logException(OverlayContainer$createTimer$$inlined$apply$lambda$1.this, th2);
                            }
                        }
                    });
                }
            }, specificValue);
            return timer;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return null;
        }
    }

    public final void dismissOverlay() {
        Float dismissDelay;
        if (this.response.getDismissDelay() == null) {
            return;
        }
        Float dismissDelay2 = this.response.getDismissDelay();
        if ((dismissDelay2 == null || dismissDelay2.floatValue() > 0) && (dismissDelay = this.response.getDismissDelay()) != null) {
            this.dismissTimer = createTimer$mobilefuse_sdk_core_release(((long) dismissDelay.floatValue()) * 1000, new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.dismissOverlay.2
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
                    OverlayView overlayView = OverlayContainer.this.overlayView;
                    if (overlayView != null) {
                        overlayView.hideView();
                    }
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getConfig$mobilefuse_sdk_core_release, reason: from getter */
    public final AdRendererConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final OverlayResponse getResponse() {
        return this.response;
    }

    @Nullable
    /* JADX INFO: renamed from: getView, reason: from getter */
    public final OverlayView getOverlayView() {
        return this.overlayView;
    }

    public final void hideOverlay() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.hideView();
        }
    }

    public final void removeView() {
        OverlayView overlayView = this.overlayView;
        ViewParent parent = overlayView != null ? overlayView.getParent() : null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.overlayView);
        }
        Timer timer = this.dismissTimer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.showTimer;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.dismissTimer = null;
        this.showTimer = null;
        OverlayView overlayView2 = this.overlayView;
        if (overlayView2 != null) {
            overlayView2.destroy();
        }
    }

    public final void setConfig$mobilefuse_sdk_core_release(@Nullable AdRendererConfig adRendererConfig) {
        this.config = adRendererConfig;
    }

    public final void setResponse(@NotNull OverlayResponse overlayResponse) {
        Intrinsics.checkNotNullParameter(overlayResponse, "<set-?>");
        this.response = overlayResponse;
    }

    public final void showOverlay() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.showView();
        }
    }

    public final void showOverlayTimer() {
        Float showDelay;
        if (this.response.getShowDelay() == null || (showDelay = this.response.getShowDelay()) == null) {
            return;
        }
        this.showTimer = createTimer$mobilefuse_sdk_core_release(((long) showDelay.floatValue()) * 1000, new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.overlay.OverlayContainer.showOverlayTimer.1
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
                OverlayView overlayView = OverlayContainer.this.overlayView;
                if (overlayView != null) {
                    overlayView.showView();
                }
            }
        });
    }

    public /* synthetic */ OverlayContainer(Context context, OverlayResponse overlayResponse, AdRendererConfig adRendererConfig, Function0 function0, Function0 function02, AdmClickInfoProvider admClickInfoProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, overlayResponse, adRendererConfig, (i10 & 8) != 0 ? null : function0, (i10 & 16) != 0 ? null : function02, (i10 & 32) != 0 ? null : admClickInfoProvider);
    }
}
