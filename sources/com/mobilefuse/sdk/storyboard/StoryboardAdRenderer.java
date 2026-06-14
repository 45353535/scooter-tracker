package com.mobilefuse.sdk.storyboard;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.StoryboardListener;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.storyboard.overlay.OverlayContainer;
import com.mobilefuse.sdk.storyboard.overlay.OverlayResponse;
import com.mobilefuse.sdk.storyboard.overlay.OverlayView;
import com.mobilefuse.sdk.vast.VastAdRenderer;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\u0012\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020\u0015H\u0002J\b\u00103\u001a\u00020\u0015H\u0014J\b\u00104\u001a\u00020\u0015H\u0002J\b\u00105\u001a\u00020\u0015H\u0002J\b\u00106\u001a\u00020\u0015H\u0002J\u0018\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u0015H\u0002J\b\u00109\u001a\u00020\u0015H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderer;", "Lcom/mobilefuse/sdk/BaseAdRenderer;", "Lcom/mobilefuse/sdk/storyboard/StoryboardOmidBridge;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", "(Landroid/content/Context;Lcom/mobilefuse/sdk/AdRendererConfig;Lcom/mobilefuse/sdk/AdRendererListener;)V", "currentPage", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdView;", "errorCounter", "", "listAdRenders", "", "loadedAdsCounter", "overlayContainer", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayContainer;", "renderedAdsCounter", "addOverlayView", "", "appendAdView", "createAdRenderListener", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "createContainer", "createOverlayContainer", "admResponse", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "parentConfig", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "createOverlayContainer$mobilefuse_sdk_core_release", "createStoryboardAdView", "createStoryboardAdView$mobilefuse_sdk_core_release", "createStoryboardListener", "Lcom/mobilefuse/sdk/StoryboardListener;", "destroy", "destroyCurrentRender", "getAdView", "Landroid/view/View;", "getOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "handleAdmInfoProvider", "isLastIndex", "", "onRenderError", "preloadAdmImpl", "adm", "", "registerOverlayAsOmidFriendlyObstruction", "renderAdmImpl", "saveCurrentPageAdmInfoProvider", "showAdRender", "unregisterOverlayAsOmidFriendlyObstruction", "updateConfigForPage", "updateCurrentPageAdmInfoProvider", "verifyPreloadEvent", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class StoryboardAdRenderer extends BaseAdRenderer<StoryboardOmidBridge> {
    private StoryboardAdView currentPage;
    private int errorCounter;
    private final List<StoryboardAdView> listAdRenders;
    private int loadedAdsCounter;
    private OverlayContainer overlayContainer;
    private int renderedAdsCounter;

    public StoryboardAdRenderer(@Nullable Context context, @Nullable AdRendererConfig adRendererConfig, @Nullable AdRendererListener adRendererListener) {
        super(context, adRendererConfig, adRendererListener);
        this.listAdRenders = new ArrayList();
        createContainer();
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$0(ClassGen.java:366)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.collect(Unknown Source)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:367)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:329)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
     */
    public static final /* synthetic */ void access$unregisterOverlayAsOmidFriendlyObstruction(StoryboardAdRenderer storyboardAdRenderer) {
        storyboardAdRenderer.unregisterOverlayAsOmidFriendlyObstruction();
    }

    private final void addOverlayView() {
        StoryboardAdView storyboardAdView;
        StoryboardAdmResponse admResponse;
        StoryboardAdView storyboardAdView2;
        AdRendererConfig config;
        AdRendererContainer adRendererContainer;
        StoryboardAdView storyboardAdView3 = this.currentPage;
        if (storyboardAdView3 != null) {
            if (!storyboardAdView3.getContainsOverlay()) {
                storyboardAdView3 = null;
            }
            if (storyboardAdView3 == null || (storyboardAdView = this.currentPage) == null || (admResponse = storyboardAdView.getAdmResponse()) == null || (storyboardAdView2 = this.currentPage) == null || (config = storyboardAdView2.getConfig()) == null) {
                return;
            }
            createOverlayContainer$mobilefuse_sdk_core_release(admResponse, config, this.admClickInfoProvider);
            OverlayContainer overlayContainer = this.overlayContainer;
            if (overlayContainer == null || (adRendererContainer = this.contentContainer) == null) {
                return;
            }
            adRendererContainer.addView(overlayContainer != null ? overlayContainer.getOverlayView() : null);
        }
    }

    private final void appendAdView() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                adRendererContainer.addView(this.currentPage);
            }
            AdRendererContainer adRendererContainer2 = this.contentContainer;
            if (adRendererContainer2 != null) {
                adRendererContainer2.setClipChildren(false);
            }
        } catch (Throwable th2) {
            int i10 = StoryboardAdRenderer$appendAdView$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final AdRendererListener createAdRenderListener(final StoryboardAdView view) {
        return new AdRendererListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer.createAdRenderListener.1
            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClicked(@Nullable String url) throws Throwable {
                AdRendererListener adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                if (adRendererListener != null) {
                    adRendererListener.onAdClicked(url);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdClosed() throws Throwable {
                if (StoryboardAdRenderer.this.renderedAdsCounter <= StoryboardAdRenderer.this.listAdRenders.size() - 1) {
                    StoryboardAdRenderer.this.showAdRender();
                    return;
                }
                AdRendererListener adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                if (adRendererListener != null) {
                    adRendererListener.onAdClosed();
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdImpression() throws Throwable {
                OverlayContainer overlayContainer;
                AdRendererListener adRendererListener;
                if (StoryboardAdRenderer.this.renderedAdsCounter == 1 && (adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener) != null) {
                    adRendererListener.onAdImpression();
                }
                if (StoryboardAdRenderer.this.overlayContainer == null || (overlayContainer = StoryboardAdRenderer.this.overlayContainer) == null) {
                    return;
                }
                overlayContainer.showOverlayTimer();
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onAdRuntimeError(@Nullable RtbLossReason error) throws Throwable {
                view.setValidToShow(false);
                StoryboardAdRenderer.this.loadedAdsCounter++;
                StoryboardAdRenderer.this.errorCounter++;
                if (StoryboardAdRenderer.this.errorCounter != StoryboardAdRenderer.this.listAdRenders.size()) {
                    StoryboardAdRenderer.this.verifyPreloadEvent();
                    return;
                }
                AdRendererListener adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                if (adRendererListener != null) {
                    adRendererListener.onAdRuntimeError(error);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onFullscreenChanged(boolean isFullscreen) throws Throwable {
                AdRendererListener adRendererListener = ((BaseAdRenderer) StoryboardAdRenderer.this).listener;
                if (adRendererListener != null) {
                    adRendererListener.onFullscreenChanged(isFullscreen);
                }
            }

            @Override // com.mobilefuse.sdk.AdRendererListener
            public void onPreloadStatusChange(boolean isPreloaded) throws Throwable {
                StoryboardAdRenderer.this.loadedAdsCounter++;
                view.setValidToShow(isPreloaded);
                if (!isPreloaded) {
                    StoryboardAdRenderer.this.errorCounter++;
                }
                StoryboardAdRenderer.this.verifyPreloadEvent();
            }
        };
    }

    private final void createContainer() {
        try {
            if (this.contentContainer != null) {
                return;
            }
            AdRendererContainer adRendererContainer = new AdRendererContainer(this.context);
            adRendererContainer.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            Unit unit = Unit.f93236a;
            this.contentContainer = adRendererContainer;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final StoryboardListener createStoryboardListener() {
        return new StoryboardListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer.createStoryboardListener.1
            @Override // com.mobilefuse.sdk.StoryboardListener
            public void hideOverlay() {
                OverlayContainer overlayContainer = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer != null) {
                    overlayContainer.hideOverlay();
                }
            }

            @Override // com.mobilefuse.sdk.StoryboardListener
            public void showOverlay(@NotNull Uri uri) {
                OverlayView view;
                AdRendererConfig config;
                Intrinsics.checkNotNullParameter(uri, "uri");
                String queryParameter = uri.getQueryParameter("overlay");
                if (queryParameter == null || Intrinsics.areEqual(queryParameter, "undefined")) {
                    OverlayContainer overlayContainer = StoryboardAdRenderer.this.overlayContainer;
                    if (overlayContainer != null) {
                        overlayContainer.showOverlay();
                        return;
                    }
                    return;
                }
                OverlayContainer overlayContainer2 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer2 != null) {
                    overlayContainer2.removeView();
                }
                JSONObject jSONObject = new JSONObject(queryParameter);
                StoryboardAdRenderer storyboardAdRenderer = StoryboardAdRenderer.this;
                StoryboardAdView storyboardAdView = storyboardAdRenderer.currentPage;
                OverlayContainer overlayContainer3 = null;
                if (storyboardAdView != null && (config = storyboardAdView.getConfig()) != null) {
                    OverlayContainer.Companion companion = OverlayContainer.INSTANCE;
                    OverlayContainer overlayContainer4 = StoryboardAdRenderer.this.overlayContainer;
                    OverlayResponse overlay = companion.parseOverlay(jSONObject, overlayContainer4 != null ? overlayContainer4.getResponse() : null);
                    if (overlay != null) {
                        Context context = ((BaseAdRenderer) StoryboardAdRenderer.this).context;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        overlayContainer3 = new OverlayContainer(context, overlay, config, new StoryboardAdRenderer$createStoryboardListener$1$showOverlay$1$1$1(StoryboardAdRenderer.this), new StoryboardAdRenderer$createStoryboardListener$1$showOverlay$1$1$2(StoryboardAdRenderer.this), StoryboardAdRenderer.this.admClickInfoProvider);
                    }
                }
                storyboardAdRenderer.overlayContainer = overlayContainer3;
                OverlayContainer overlayContainer5 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer5 == null || (view = overlayContainer5.getOverlayView()) == null) {
                    return;
                }
                AdRendererContainer adRendererContainer = ((BaseAdRenderer) StoryboardAdRenderer.this).contentContainer;
                if (adRendererContainer != null) {
                    adRendererContainer.addView(view);
                }
                OverlayContainer overlayContainer6 = StoryboardAdRenderer.this.overlayContainer;
                if (overlayContainer6 != null) {
                    overlayContainer6.showOverlay();
                }
            }
        };
    }

    private final void destroyCurrentRender() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            OverlayContainer overlayContainer = this.overlayContainer;
            if (overlayContainer != null) {
                if (overlayContainer != null) {
                    overlayContainer.removeView();
                }
                this.overlayContainer = null;
            }
            AdRendererContainer adRendererContainer = this.contentContainer;
            if (adRendererContainer != null) {
                adRendererContainer.removeAllViews();
            }
            StoryboardAdView storyboardAdView = this.currentPage;
            if (storyboardAdView != null) {
                storyboardAdView.destroy();
            }
            this.currentPage = null;
        } catch (Throwable th2) {
            int i10 = StoryboardAdRenderer$destroyCurrentRender$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    private final void handleAdmInfoProvider() {
        StoryboardAdView storyboardAdView = this.currentPage;
        BaseAdRenderer<?> adRenderer$mobilefuse_sdk_core_release = storyboardAdView != null ? storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release() : null;
        if (this.admClickInfoProvider == null && (adRenderer$mobilefuse_sdk_core_release instanceof VastAdRenderer)) {
            saveCurrentPageAdmInfoProvider();
        } else if (adRenderer$mobilefuse_sdk_core_release instanceof MraidAdRenderer) {
            updateCurrentPageAdmInfoProvider();
        }
    }

    private final boolean isLastIndex() {
        return this.loadedAdsCounter == this.listAdRenders.size();
    }

    private final void onRenderError() throws Throwable {
        if (this.renderedAdsCounter < this.listAdRenders.size()) {
            showAdRender();
            return;
        }
        AdRendererListener adRendererListener = this.listener;
        if (adRendererListener != null) {
            adRendererListener.onAdClosed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerOverlayAsOmidFriendlyObstruction() {
        OverlayView view;
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<?> adRenderer$mobilefuse_sdk_core_release;
        OverlayContainer overlayContainer = this.overlayContainer;
        if (overlayContainer == null || (view = overlayContainer.getOverlayView()) == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.registerExternalFriendlyObstruction(view);
    }

    private final void saveCurrentPageAdmInfoProvider() {
        try {
            if (this.admClickInfoProvider == null) {
                StoryboardAdView storyboardAdView = this.currentPage;
                this.admClickInfoProvider = storyboardAdView != null ? storyboardAdView.getCurrentAdmClickInfoProvider$mobilefuse_sdk_core_release() : null;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAdRender() throws Throwable {
        try {
            if (this.contentContainer != null && this.currentPage != null) {
                destroyCurrentRender();
            }
            StoryboardAdView storyboardAdView = this.listAdRenders.get(this.renderedAdsCounter);
            StoryboardAdView storyboardAdView2 = storyboardAdView;
            this.currentPage = storyboardAdView2;
            this.renderedAdsCounter++;
            if (storyboardAdView == null) {
                onRenderError();
                return;
            }
            if (storyboardAdView2 == null || !storyboardAdView2.getIsValidToShow()) {
                onRenderError();
                return;
            }
            appendAdView();
            handleAdmInfoProvider();
            StoryboardAdView storyboardAdView3 = this.currentPage;
            if (storyboardAdView3 != null) {
                storyboardAdView3.showAd();
            }
            addOverlayView();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INTERNAL_ERROR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterOverlayAsOmidFriendlyObstruction() {
        OverlayView view;
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<?> adRenderer$mobilefuse_sdk_core_release;
        OverlayContainer overlayContainer = this.overlayContainer;
        if (overlayContainer == null || (view = overlayContainer.getOverlayView()) == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.unregisterExternalFriendlyObstruction(view);
    }

    private final AdRendererConfig updateConfigForPage(AdRendererConfig config, StoryboardAdmResponse admResponse) {
        try {
            ObservableConfig observableConfig = config.getObservableConfig();
            AdRendererConfig.Builder uiAdm = new AdRendererConfig.Builder().setSdkName(config.getSdkName()).setSdkVersion(config.getSdkVersion()).setAdvertisingId(config.getAdvertisingId()).setLimitTrackingEnabled(config.isLimitTrackingEnabled()).setAdHeight(config.getAdHeight()).setAdWidth(config.getAdWidth()).setAdInstanceId(config.getAdInstanceId()).setSubjectToCoppa(config.isSubjectToCoppa()).setTestMode(config.isTestMode()).setFullscreenAd(config.isFullscreenAd()).setCloseButtonEnabled(config.isCloseButtonEnabled()).setThumbnailSize(config.isThumbnailSize()).setTransparentBackground(config.isTransparentBackground()).setDeviceIp(config.getDeviceIp()).setExtendedAdType(config.getExtendedAdType()).setConfigClose(admResponse.getCloseConfigResponse()).setUiAdm(admResponse.getUiAdm());
            ObservableConfig observableConfig2 = new ObservableConfig();
            observableConfig2.setValue(ObservableConfigKey.ADM_CLICK_INFO_ENABLED, Boolean.TRUE);
            ObservableConfigKey observableConfigKey = ObservableConfigKey.FORCE_SKIP_SECONDS;
            Object forceSkipSeconds = admResponse.getForceSkipSeconds();
            if (forceSkipSeconds == null) {
                forceSkipSeconds = observableConfig.getValue(observableConfigKey);
            }
            observableConfig2.setValue(observableConfigKey, forceSkipSeconds);
            ObservableConfigKey observableConfigKey2 = ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR;
            Object clickBehavior = admResponse.getClickBehavior();
            if (clickBehavior == null) {
                clickBehavior = observableConfig.getValue(observableConfigKey2);
            }
            observableConfig2.setValue(observableConfigKey2, clickBehavior);
            ObservableConfigKey observableConfigKey3 = ObservableConfigKey.MAX_END_CARDS;
            Object maxEndCards = admResponse.getMaxEndCards();
            if (maxEndCards == null) {
                maxEndCards = observableConfig.getValue(observableConfigKey3);
            }
            observableConfig2.setValue(observableConfigKey3, maxEndCards);
            ObservableConfigKey observableConfigKey4 = ObservableConfigKey.MUTED;
            Object muted = admResponse.getMuted();
            if (muted == null) {
                muted = observableConfig.getValue(observableConfigKey4);
            }
            observableConfig2.setValue(observableConfigKey4, muted);
            ObservableConfigKey observableConfigKey5 = ObservableConfigKey.BLOCK_SKIP_SECONDS;
            Object blockSkipSeconds = admResponse.getBlockSkipSeconds();
            if (blockSkipSeconds == null) {
                blockSkipSeconds = observableConfig.getValue(observableConfigKey5);
            }
            observableConfig2.setValue(observableConfigKey5, blockSkipSeconds);
            ObservableConfigKey observableConfigKey6 = ObservableConfigKey.END_CARD_CLOSE_SECONDS;
            Object endCardCloseSeconds = admResponse.getEndCardCloseSeconds();
            if (endCardCloseSeconds == null) {
                endCardCloseSeconds = observableConfig.getValue(observableConfigKey6);
            }
            observableConfig2.setValue(observableConfigKey6, endCardCloseSeconds);
            ObservableConfigKey observableConfigKey7 = ObservableConfigKey.PUBLISHER_MUTED;
            Object value = observableConfig.getValue(observableConfigKey7);
            if (value != null) {
                observableConfig2.setValue(observableConfigKey7, value);
            }
            ObservableConfigKey observableConfigKey8 = ObservableConfigKey.AWAITING_MUTED;
            Object value2 = observableConfig.getValue(observableConfigKey8);
            if (value2 != null) {
                observableConfig2.setValue(observableConfigKey8, value2);
            }
            ObservableConfigKey observableConfigKey9 = ObservableConfigKey.MUTE_ENABLED;
            Object value3 = observableConfig.getValue(observableConfigKey9);
            if (value3 != null) {
                observableConfig2.setValue(observableConfigKey9, value3);
            }
            ObservableConfigKey observableConfigKey10 = ObservableConfigKey.VIDEO_STREAM_ENABLED;
            Object value4 = observableConfig.getValue(observableConfigKey10);
            if (value4 != null) {
                observableConfig2.setValue(observableConfigKey10, value4);
            }
            ObservableConfigKey observableConfigKey11 = ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP;
            Object value5 = observableConfig.getValue(observableConfigKey11);
            if (value5 != null) {
                observableConfig2.setValue(observableConfigKey11, value5);
            }
            Unit unit = Unit.f93236a;
            AdRendererConfig adRendererConfigBuild = uiAdm.setObservableConfig(observableConfig2).build();
            Intrinsics.checkNotNullExpressionValue(adRendererConfigBuild, "AdRendererConfig.Builder…\n                .build()");
            return adRendererConfigBuild;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            AdRendererConfig adRendererConfigBuild2 = new AdRendererConfig.Builder().build();
            Intrinsics.checkNotNullExpressionValue(adRendererConfigBuild2, "AdRendererConfig.Builder().build()");
            return adRendererConfigBuild2;
        }
    }

    private final void updateCurrentPageAdmInfoProvider() {
        StoryboardAdView storyboardAdView;
        BaseAdRenderer<?> adRenderer$mobilefuse_sdk_core_release;
        if (this.admClickInfoProvider == null || (storyboardAdView = this.currentPage) == null || (adRenderer$mobilefuse_sdk_core_release = storyboardAdView.getAdRenderer$mobilefuse_sdk_core_release()) == null) {
            return;
        }
        adRenderer$mobilefuse_sdk_core_release.admClickInfoProvider = this.admClickInfoProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyPreloadEvent() throws Throwable {
        if (isLastIndex()) {
            boolean z10 = this.errorCounter < this.listAdRenders.size();
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onPreloadStatusChange(z10);
            }
        }
    }

    @VisibleForTesting
    public final void createOverlayContainer$mobilefuse_sdk_core_release(@NotNull StoryboardAdmResponse admResponse, @NotNull AdRendererConfig parentConfig, @Nullable AdmClickInfoProvider admClickInfoProvider) {
        OverlayContainer overlayContainer;
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        Intrinsics.checkNotNullParameter(parentConfig, "parentConfig");
        OverlayResponse overlay = admResponse.getOverlay();
        if (overlay != null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            overlayContainer = new OverlayContainer(context, overlay, parentConfig, new StoryboardAdRenderer$createOverlayContainer$1$1(this), new StoryboardAdRenderer$createOverlayContainer$1$2(this), admClickInfoProvider);
        } else {
            overlayContainer = null;
        }
        this.overlayContainer = overlayContainer;
    }

    @VisibleForTesting
    public final void createStoryboardAdView$mobilefuse_sdk_core_release(@NotNull StoryboardAdmResponse admResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(admResponse, "admResponse");
        try {
            AdRendererConfig config = this.config;
            Intrinsics.checkNotNullExpressionValue(config, "config");
            AdRendererConfig adRendererConfigUpdateConfigForPage = updateConfigForPage(config, admResponse);
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            StoryboardAdView storyboardAdView = new StoryboardAdView(context, this.renderingActivity, adRendererConfigUpdateConfigForPage, admResponse, createStoryboardListener());
            this.listAdRenders.add(storyboardAdView);
            storyboardAdView.updateListener(createAdRenderListener(storyboardAdView));
            storyboardAdView.prepareRenderer();
            String adm = admResponse.getAdm();
            if (adm != null) {
                storyboardAdView.preload(adm);
            }
            if (admResponse.getOverlay() != null) {
                storyboardAdView.setContainsOverlay(true);
            }
        } catch (Throwable th2) {
            AdRendererListener adRendererListener = this.listener;
            if (adRendererListener != null) {
                adRendererListener.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
            }
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() throws Throwable {
        destroyCurrentRender();
        this.overlayContainer = null;
        this.contentContainer = null;
        this.currentPage = null;
        super.destroy();
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @NotNull
    public View getAdView() {
        AdRendererContainer adRendererContainer = this.contentContainer;
        return adRendererContainer != null ? adRendererContainer : new View(this.context);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    @NotNull
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(@Nullable Context context) {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.storyboard.StoryboardAdRenderer.getOnLayoutChangeListener.1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            }
        };
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(@Nullable String adm) {
        AdRendererListener adRendererListener;
        try {
            if (adm == null) {
                AdRendererListener adRendererListener2 = this.listener;
                if (adRendererListener2 != null) {
                    adRendererListener2.onAdRuntimeError(RtbLossReason.MISSING_MARKUP);
                    return;
                }
                return;
            }
            JSONArray jSONArray = new JSONArray(adm);
            int length = jSONArray.length();
            int length2 = jSONArray.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length2; i11++) {
                Either<BaseError, StoryboardAdmResponse> eitherAdmStoryboardResponseParse = StoryboardAdmResponse.INSTANCE.admStoryboardResponseParse(jSONArray.get(i11).toString());
                if (eitherAdmStoryboardResponseParse instanceof ErrorResult) {
                    i10++;
                    if (i10 == length && (adRendererListener = this.listener) != null) {
                        adRendererListener.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
                    }
                }
                if (eitherAdmStoryboardResponseParse instanceof SuccessResult) {
                    createStoryboardAdView$mobilefuse_sdk_core_release((StoryboardAdmResponse) ((SuccessResult) eitherAdmStoryboardResponseParse).getValue());
                }
            }
            createContainer();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void renderAdmImpl() throws Throwable {
        showAdRender();
    }
}
