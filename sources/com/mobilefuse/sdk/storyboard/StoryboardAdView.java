package com.mobilefuse.sdk.storyboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.AdRendererType;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.StoryboardListener;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.omid.OmidService;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0002J\u0006\u0010+\u001a\u00020*J\u0013\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0000¢\u0006\u0002\b-J\u000f\u0010.\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0002\b0J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020*J\b\u00105\u001a\u00020*H\u0002J\u0006\u00106\u001a\u00020*J\u000e\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020 R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdView;", "Landroid/widget/RelativeLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "renderingActivity", "Landroid/app/Activity;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", "admResponse", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "storyboardListener", "Lcom/mobilefuse/sdk/StoryboardListener;", "(Landroid/content/Context;Landroid/app/Activity;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;Lcom/mobilefuse/sdk/StoryboardListener;)V", "adRenderer", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "adView", "Landroid/view/View;", "getAdmResponse", "()Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "component", "Lcom/mobilefuse/sdk/component/AdRendererComponent;", "getConfig", "()Lcom/mobilefuse/sdk/AdRendererConfig;", "containsOverlay", "", "getContainsOverlay", "()Z", "setContainsOverlay", "(Z)V", "isValidToShow", "setValidToShow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "getListener", "()Lcom/mobilefuse/sdk/AdRendererListener;", "setListener", "(Lcom/mobilefuse/sdk/AdRendererListener;)V", "getStoryboardListener", "()Lcom/mobilefuse/sdk/StoryboardListener;", "appendView", "Lcom/mobilefuse/sdk/exception/Either;", "", "", "destroy", "getAdRenderer", "getAdRenderer$mobilefuse_sdk_core_release", "getCurrentAdmClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release", "preload", "adm", "", "prepareRenderer", "setMraidListener", "showAd", "updateListener", "listenerUpdated", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
public final class StoryboardAdView extends RelativeLayout {
    private BaseAdRenderer<?> adRenderer;
    private View adView;

    @NotNull
    private final StoryboardAdmResponse admResponse;
    private AdRendererComponent component;

    @NotNull
    private final AdRendererConfig config;
    private boolean containsOverlay;
    private boolean isValidToShow;

    @Nullable
    private AdRendererListener listener;
    private Activity renderingActivity;

    @NotNull
    private final StoryboardListener storyboardListener;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdmMediaType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdmMediaType.BANNER.ordinal()] = 1;
            iArr[AdmMediaType.VIDEO.ordinal()] = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryboardAdView(@NotNull Context context, @Nullable Activity activity, @NotNull AdRendererConfig config, @NotNull StoryboardAdmResponse admResponse, @NotNull StoryboardListener storyboardListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        Intrinsics.checkNotNullParameter(storyboardListener, "storyboardListener");
        this.renderingActivity = activity;
        this.config = config;
        this.admResponse = admResponse;
        this.storyboardListener = storyboardListener;
        setBackgroundColor(0);
    }

    private final Either<Throwable, Unit> appendView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
            this.adView = baseAdRenderer != null ? baseAdRenderer.getAdView() : null;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.adView, layoutParams);
            return new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (StoryboardAdView$appendView$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return new ErrorResult(th2);
        }
    }

    private final void setMraidListener() {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null || !(baseAdRenderer instanceof MraidAdRenderer)) {
            return;
        }
        ((MraidAdRenderer) baseAdRenderer).setJsBridgeCallListener(new MraidAdRenderer.JsBridgeCallListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1
            @Override // com.mobilefuse.sdk.mraid.MraidAdRenderer.JsBridgeCallListener
            @NotNull
            public Map<String, Boolean> getMraidSupportsList() {
                return MapsKt.mapOf(TuplesKt.to("overlay", Boolean.TRUE), TuplesKt.to("productStoreView", Boolean.FALSE));
            }

            @Override // com.mobilefuse.sdk.mraid.MraidAdRenderer.JsBridgeCallListener
            public boolean onBridgeCall(@Nullable final Uri callUri) {
                String it;
                if (callUri != null && (it = callUri.getHost()) != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (it.length() <= 0) {
                        it = null;
                    }
                    if (it != null) {
                        Intrinsics.checkNotNullExpressionValue(it, "callUri?.host?.takeIf { …Empty() } ?: return false");
                        Function0 function0 = (Function0) MapsKt.mapOf(TuplesKt.to("showOverlay", new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1.1
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
                                StoryboardAdView$setMraidListener$$inlined$run$lambda$1.this.this$0.getStoryboardListener().showOverlay(callUri);
                            }
                        }), TuplesKt.to("hideOverlay", new Function0<Unit>() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdView$setMraidListener$$inlined$run$lambda$1.2
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
                                StoryboardAdView$setMraidListener$$inlined$run$lambda$1.this.this$0.getStoryboardListener().hideOverlay();
                            }
                        })).get(it);
                        if (function0 != null) {
                            function0.invoke();
                            return true;
                        }
                    }
                }
                return false;
            }
        });
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
        } catch (Throwable th2) {
            int i10 = StoryboardAdView$destroy$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Nullable
    public final BaseAdRenderer<?> getAdRenderer$mobilefuse_sdk_core_release() {
        return this.adRenderer;
    }

    @NotNull
    public final StoryboardAdmResponse getAdmResponse() {
        return this.admResponse;
    }

    @NotNull
    public final AdRendererConfig getConfig() {
        return this.config;
    }

    public final boolean getContainsOverlay() {
        return this.containsOverlay;
    }

    @Nullable
    public final AdmClickInfoProvider getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release() {
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null) {
            return baseAdRenderer.admClickInfoProvider;
        }
        return null;
    }

    @Nullable
    public final AdRendererListener getListener() {
        return this.listener;
    }

    @NotNull
    public final StoryboardListener getStoryboardListener() {
        return this.storyboardListener;
    }

    /* JADX INFO: renamed from: isValidToShow, reason: from getter */
    public final boolean getIsValidToShow() {
        return this.isValidToShow;
    }

    public final void preload(@NotNull String adm) throws Throwable {
        Intrinsics.checkNotNullParameter(adm, "adm");
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer != null && this.component != null) {
            if (baseAdRenderer != null) {
                baseAdRenderer.preloadAd(adm);
            }
        } else {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onPreloadStatusChange(false);
            }
        }
    }

    public final void prepareRenderer() throws Throwable {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.admResponse.getType().ordinal()];
        if (i10 == 1) {
            AdRendererComponent registeredComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.MRAID_AD_RENDERER);
            this.component = registeredComponent;
            this.adRenderer = registeredComponent != null ? registeredComponent.createInstance(getContext(), this.config, this.listener) : null;
            setMraidListener();
            BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
            if (baseAdRenderer != null) {
                baseAdRenderer.setOmidBridge(OmidService.createOmidBridge(AdRendererType.MRAID));
            }
        } else if (i10 == 2) {
            AdRendererComponent registeredComponent2 = ComponentRegistrar.getRegisteredComponent(ComponentType.VAST_AD_RENDERER);
            this.component = registeredComponent2;
            BaseAdRenderer<?> baseAdRendererCreateInstance = registeredComponent2 != null ? registeredComponent2.createInstance(getContext(), this.config, this.listener) : null;
            this.adRenderer = baseAdRendererCreateInstance;
            if (baseAdRendererCreateInstance != null) {
                baseAdRendererCreateInstance.setOmidBridge(OmidService.createOmidBridge(AdRendererType.VAST));
            }
        }
        if (this.component == null) {
            DebuggingKt.logError$default(this, "Can't render. Ad Renderer Component registered", null, 2, null);
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                return;
            }
            return;
        }
        if (this.adRenderer == null) {
            DebuggingKt.logError$default(this, "Can't render. adRenderer instance is null", null, 2, null);
            AdRendererListener adRendererListener2 = this.listener;
            if (adRendererListener2 != null) {
                adRendererListener2.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
            }
        }
    }

    public final void setContainsOverlay(boolean z10) {
        this.containsOverlay = z10;
    }

    public final void setListener(@Nullable AdRendererListener adRendererListener) {
        this.listener = adRendererListener;
    }

    public final void setValidToShow(boolean z10) {
        this.isValidToShow = z10;
    }

    public final void showAd() throws Throwable {
        Activity activity;
        BaseAdRenderer<?> baseAdRenderer = this.adRenderer;
        if (baseAdRenderer == null) {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
                return;
            }
            return;
        }
        if (baseAdRenderer != null && (activity = this.renderingActivity) != null) {
            baseAdRenderer.setRenderingActivity(activity);
        }
        BaseAdRenderer<?> baseAdRenderer2 = this.adRenderer;
        if (baseAdRenderer2 != null) {
            baseAdRenderer2.renderAd();
        }
        appendView();
    }

    public final void updateListener(@NotNull AdRendererListener listenerUpdated) {
        Intrinsics.checkNotNullParameter(listenerUpdated, "listenerUpdated");
        this.listener = listenerUpdated;
    }
}
