package com.mobilefuse.sdk.vast;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.AdLifecycleEvent;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.ExtendedAdType;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.rendering.ExtendedController;
import com.mobilefuse.sdk.ad.rendering.omniad.ThumbnailAdController;
import com.mobilefuse.sdk.ad.rendering.omniad.thumbnail.GetThumbnailInitSizeKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector;
import com.mobilefuse.sdk.rtb.Protocol;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.mobilefuse.sdk.vast.endcard.EndCardSchedulerHelper;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge;
import com.mobilefuse.videoplayer.controller.FullscreenChangedListener;
import com.mobilefuse.videoplayer.model.DataRegulation;
import com.mobilefuse.videoplayer.model.VastError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class VastAdRenderer extends BaseAdRenderer<VastOmidBridge> {
    public static final float DEFAULT_END_CARD_CLOSE_SECONDS = 0.0f;
    public static final int DEFAULT_MAX_END_CARDS = 1;
    public static final long END_CARD_AUTO_CLOSE_DELAY = 10000;
    private boolean isVideoStreamEnabled;
    private ProgressBar loaderView;
    private VideoPlayer videoPlayer;

    @Nullable
    private ViewTreeInspector viewTreeInspector;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.vast.VastAdRenderer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey;

        static {
            int[] iArr = new int[ObservableConfigKey.values().length];
            $SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey = iArr;
            try {
                iArr[ObservableConfigKey.MUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey[ObservableConfigKey.MUTED_FROM_VIDEO_UI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey[ObservableConfigKey.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey[ObservableConfigKey.POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum VastAdLifecycleEvent implements AdLifecycleEvent {
        VAST_VIDEO_LOADED,
        VAST_VIDEO_STARTED,
        VAST_VIDEO_SKIPPED,
        VAST_VIDEO_FIRST_QUARTILE,
        VAST_VIDEO_MIDPOINT,
        VAST_VIDEO_THIRD_QUARTILE,
        VAST_VIDEO_COMPLETED
    }

    public enum VastExtendedAdType implements ExtendedAdType {
        THUMBNAIL
    }

    public VastAdRenderer(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        super(context, adRendererConfig, adRendererListener);
        initialize();
    }

    public static /* synthetic */ Unit a(VastAdRenderer vastAdRenderer) {
        vastAdRenderer.dispatchSkipAdAvailability();
        return Unit.f93236a;
    }

    private void addProgressBarAsOmidFriendlyObstruction() {
        ProgressBar progressBar;
        try {
            if (hasOmidBridge() && (progressBar = this.loaderView) != null && progressBar.getVisibility() == 0) {
                ((VastOmidBridge) this.omidBridge).addFriendlyObstruction(progressBar, OmidFriendlyObstructionPurpose.OTHER, null);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public static /* synthetic */ void b(VastAdRenderer vastAdRenderer, List list) throws Throwable {
        T t10 = vastAdRenderer.omidBridge;
        if (t10 == 0) {
            return;
        }
        ((VastOmidBridge) t10).removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != vastAdRenderer.loaderView && !vastAdRenderer.externalFriendlyObstructions.contains(view)) {
                ((VastOmidBridge) vastAdRenderer.omidBridge).addFriendlyObstruction(view, OmidFriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        vastAdRenderer.addProgressBarAsOmidFriendlyObstruction();
        vastAdRenderer.addRegisteredExternalFriendlyObstructions();
    }

    public static /* synthetic */ void c(VastAdRenderer vastAdRenderer, boolean z10) {
        vastAdRenderer.getClass();
        try {
            vastAdRenderer.observableConfig.setValue(ObservableConfigKey.MUTED_FROM_VIDEO_UI, Boolean.valueOf(z10));
        } catch (Throwable th2) {
            StabilityHelper.logException(vastAdRenderer, th2);
        }
    }

    private void createExternalController() throws Throwable {
        ExtendedAdType extendedAdType = this.extendedAdType;
        VastExtendedAdType vastExtendedAdType = VastExtendedAdType.THUMBNAIL;
        if (extendedAdType != vastExtendedAdType || this.renderingActivity == null) {
            return;
        }
        Point point = new Point(this.config.getAdWidth(), this.config.getAdHeight());
        Point currentMediaFileSizeDp = this.videoPlayer.getCurrentMediaFileSizeDp();
        if (currentMediaFileSizeDp == null) {
            currentMediaFileSizeDp = point;
        }
        Point thumbnailInitSize = GetThumbnailInitSizeKt.getThumbnailInitSize(point, currentMediaFileSizeDp);
        ThumbnailAdController thumbnailAdController = new ThumbnailAdController(this.renderingActivity, this.contentContainer, thumbnailInitSize);
        this.extendedController = thumbnailAdController;
        thumbnailAdController.setAdWidth(thumbnailInitSize.x);
        this.extendedController.setAdHeight(thumbnailInitSize.y);
        this.videoPlayer.setFullscreenAllowed();
        this.videoPlayer.setEnterFullscreenOnVideoTap(true);
        this.videoPlayer.setFullscreenChangedListener(new FullscreenChangedListener() { // from class: com.mobilefuse.sdk.vast.a
            @Override // com.mobilefuse.videoplayer.controller.FullscreenChangedListener
            public final void onFullscreenChanged(boolean z10) {
                VastAdRenderer.g(this.f53434a, z10);
            }
        });
        this.videoPlayer.enableExternalFullscreenControl(new ExternalFullscreenControlBridge() { // from class: com.mobilefuse.sdk.vast.b
            @Override // com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge
            public final void onFullscreenChangeStarted(boolean z10, Function0 function0) {
                VastAdRenderer.d(this.f53435a, z10, function0);
            }
        });
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            ObservableConfigKey observableConfigKey = ObservableConfigKey.POSITION;
            if (observableConfig.hasValue(observableConfigKey) && this.extendedAdType == vastExtendedAdType) {
                ((ThumbnailAdController) this.extendedController).setAnchor(this.observableConfig.getIntValue(observableConfigKey, 3));
            }
        }
    }

    public static /* synthetic */ void d(VastAdRenderer vastAdRenderer, boolean z10, Function0 function0) {
        ExtendedController extendedController = vastAdRenderer.extendedController;
        if (extendedController == null) {
            return;
        }
        ((ThumbnailAdController) extendedController).requestFullscreenChange(z10, function0);
    }

    private void destroyViewTreeInspector() throws Throwable {
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
            this.viewTreeInspector = null;
        }
    }

    public static /* synthetic */ void e(VastAdRenderer vastAdRenderer) {
        vastAdRenderer.getClass();
        try {
            ViewTreeInspector viewTreeInspector = vastAdRenderer.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.stopObstructionsChecking();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(vastAdRenderer, th2);
        }
    }

    public static /* synthetic */ void f(final VastAdRenderer vastAdRenderer) {
        vastAdRenderer.getClass();
        try {
            if (((VastOmidBridge) vastAdRenderer.omidBridge).getVideoView() == null) {
                return;
            }
            vastAdRenderer.viewTreeInspector = new ViewTreeInspector(((VastOmidBridge) vastAdRenderer.omidBridge).getVideoView(), new ViewTreeInspector.ObstructionsChangeListener() { // from class: com.mobilefuse.sdk.vast.c
                @Override // com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector.ObstructionsChangeListener
                public final void onChanged(List list) throws Throwable {
                    VastAdRenderer.b(this.f53436a, list);
                }
            });
            vastAdRenderer.addProgressBarAsOmidFriendlyObstruction();
            vastAdRenderer.addRegisteredExternalFriendlyObstructions();
            vastAdRenderer.viewTreeInspector.startObstructionsChecking();
        } catch (Throwable th2) {
            StabilityHelper.logException(vastAdRenderer, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishOmidSession() throws Throwable {
        destroyOmidBridge();
        destroyViewTreeInspector();
    }

    public static /* synthetic */ void g(VastAdRenderer vastAdRenderer, boolean z10) {
        vastAdRenderer.getClass();
        try {
            AdRendererListener adRendererListener = vastAdRenderer.listener;
            if (adRendererListener != null) {
                adRendererListener.onFullscreenChanged(z10);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(vastAdRenderer, th2);
        }
    }

    public static List<Protocol> getSupportedProtocols() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.VAST2);
        arrayList.add(Protocol.VAST2_WRAPPER);
        arrayList.add(Protocol.VAST3);
        arrayList.add(Protocol.VAST3_WRAPPER);
        arrayList.add(Protocol.VAST4);
        arrayList.add(Protocol.VAST4_WRAPPER);
        return arrayList;
    }

    public static /* synthetic */ void h(VastAdRenderer vastAdRenderer) {
        vastAdRenderer.getClass();
        try {
            ViewTreeInspector viewTreeInspector = vastAdRenderer.viewTreeInspector;
            if (viewTreeInspector != null) {
                viewTreeInspector.startObstructionsChecking();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(vastAdRenderer, th2);
        }
    }

    private void initViewTreeInspector() throws Throwable {
        if (this.viewTreeInspector == null && hasOmidBridge()) {
            ((VastOmidBridge) this.omidBridge).setAdSessionInitCompleteListener(new Runnable() { // from class: com.mobilefuse.sdk.vast.h
                @Override // java.lang.Runnable
                public final void run() {
                    VastAdRenderer.f(this.f53441b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveAdmClickProvider() {
        try {
            ObservableConfig observableConfig = this.observableConfig;
            if (observableConfig != null && observableConfig.getBooleanValue(ObservableConfigKey.ADM_CLICK_INFO_ENABLED, false)) {
                this.admClickInfoProvider = this.videoPlayer.getAdmClickInfoProvider();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    protected void createContainer() throws Throwable {
        int adHeight = this.config.getAdHeight();
        if (adHeight != -1) {
            adHeight = Utils.convertDpToPx(this.context, this.config.getAdHeight());
        }
        this.contentContainer = (AdRendererContainer) ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.mobilefuse_vast_player_view, (ViewGroup) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, adHeight);
        this.contentContainer.setAttachedToWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.vast.f
            @Override // java.lang.Runnable
            public final void run() {
                VastAdRenderer.h(this.f53439b);
            }
        });
        this.contentContainer.setDetachedFromWindowCallback(new Runnable() { // from class: com.mobilefuse.sdk.vast.g
            @Override // java.lang.Runnable
            public final void run() {
                VastAdRenderer.e(this.f53440b);
            }
        });
        if (this.extendedAdType != VastExtendedAdType.THUMBNAIL) {
            this.contentContainer.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.contentContainer.setLayoutParams(layoutParams);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void destroy() throws Throwable {
        try {
            finishOmidSession();
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.destroy();
                this.videoPlayer = null;
            }
            ProgressBar progressBar = this.loaderView;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ExtendedController extendedController = this.extendedController;
            if (extendedController != null) {
                extendedController.unbindContent();
                this.extendedController = null;
            }
            super.destroy();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public View getAdView() throws Throwable {
        return this.contentContainer;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected View.OnLayoutChangeListener getOnLayoutChangeListener(Context context) throws Throwable {
        return new View.OnLayoutChangeListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer.3
            @Override // android.view.View.OnLayoutChangeListener
            @RequiresApi(api = 19)
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (i12 == i16 && i13 == i17) {
                    return;
                }
                try {
                    Log.d("MF", "onLayoutChange [left: " + i10 + ", top: " + i11 + ", right: " + i12 + ", bottom: " + i13 + C4240b4.j.f42674e);
                    if (((BaseAdRenderer) VastAdRenderer.this).extendedController != null) {
                        ((BaseAdRenderer) VastAdRenderer.this).extendedController.invalidateLayout();
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        };
    }

    void initUi() throws Throwable {
        this.loaderView = (ProgressBar) this.contentContainer.findViewById(R.id.loaderView);
    }

    protected void initialize() throws Throwable {
        createContainer();
        initUi();
        this.videoPlayer = (VideoPlayer) this.contentContainer.findViewById(R.id.vastPlayer);
        VideoPlayerSettings.setDeviceIp(this.config.getDeviceIp());
        VideoPlayerSettings.setAdvertisingId(this.config.getAdvertisingId());
        VideoPlayerSettings.setLimitTrackingEnabled(this.config.isLimitTrackingEnabled());
        this.videoPlayer.setUiAdm(this.config.getUiAdm());
        this.videoPlayer.setCloseConfigResponse(this.config.getCloseConfigResponse());
        if (this.config.isSubjectToCoppa()) {
            VideoPlayerSettings.addApplicableDataRegulations(DataRegulation.COPPA);
        }
        ObservableConfig observableConfig = this.observableConfig;
        if (observableConfig != null) {
            if (observableConfig.getBooleanValue(ObservableConfigKey.MUTE_ENABLED)) {
                this.videoPlayer.setMuteAllowed();
                this.videoPlayer.setMuted(this.observableConfig.getBooleanValue(ObservableConfigKey.AWAITING_MUTED));
                this.videoPlayer.setMuteChangedListener(new MuteChangedListener() { // from class: com.mobilefuse.sdk.vast.d
                    @Override // com.mobilefuse.sdk.MuteChangedListener
                    public final void onMutedChanged(boolean z10) {
                        VastAdRenderer.c(this.f53437a, z10);
                    }
                });
            }
            ObservableConfig observableConfig2 = this.observableConfig;
            ObservableConfigKey observableConfigKey = ObservableConfigKey.ENDCARD_CLOSABLE;
            boolean booleanValue = observableConfig2.hasValue(observableConfigKey) ? this.observableConfig.getBooleanValue(observableConfigKey) : true;
            float floatValue = this.observableConfig.getFloatValue(ObservableConfigKey.END_CARD_CLOSE_SECONDS, 0.0f);
            if (this.extendedAdType == VastExtendedAdType.THUMBNAIL) {
                EndCardSchedulerHelper.applyThumbnailScheduler(this.videoPlayer, floatValue, 10000L);
            } else {
                EndCardSchedulerHelper.applyBaseVastScheduler(this.videoPlayer, floatValue, booleanValue);
            }
            int intValue = this.observableConfig.getIntValue(ObservableConfigKey.MAX_END_CARDS, 1);
            if (intValue >= 0) {
                this.videoPlayer.setMaxEndCardsToShow(intValue);
            }
            ObservableConfig observableConfig3 = this.observableConfig;
            ObservableConfigKey observableConfigKey2 = ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR;
            if (observableConfig3.hasValue(observableConfigKey2)) {
                Object value = this.observableConfig.getValue(observableConfigKey2);
                if (value instanceof ClickthroughBehaviour) {
                    this.videoPlayer.setClickthroughBehaviour((ClickthroughBehaviour) value);
                }
            }
            ObservableConfig observableConfig4 = this.observableConfig;
            ObservableConfigKey observableConfigKey3 = ObservableConfigKey.FORCE_SKIP_SECONDS;
            if (observableConfig4.hasValue(observableConfigKey3)) {
                float floatValue2 = this.observableConfig.getFloatValue(observableConfigKey3, -1.0f);
                if (floatValue2 > -1.0f) {
                    this.videoPlayer.setForceSkipSeconds(floatValue2);
                }
            }
            ObservableConfig observableConfig5 = this.observableConfig;
            ObservableConfigKey observableConfigKey4 = ObservableConfigKey.BLOCK_SKIP_SECONDS;
            if (observableConfig5.hasValue(observableConfigKey4)) {
                float floatValue3 = this.observableConfig.getFloatValue(observableConfigKey4, -1.0f);
                if (floatValue3 > -1.0f) {
                    this.videoPlayer.setBlockSkipSeconds(floatValue3);
                }
            }
            ObservableConfig observableConfig6 = this.observableConfig;
            ObservableConfigKey observableConfigKey5 = ObservableConfigKey.VIDEO_STREAM_ENABLED;
            if (observableConfig6.hasValue(observableConfigKey5)) {
                boolean booleanValue2 = this.observableConfig.getBooleanValue(observableConfigKey5, false);
                this.isVideoStreamEnabled = booleanValue2;
                this.videoPlayer.setVideoStreamEnabled(booleanValue2);
            }
            ObservableConfig observableConfig7 = this.observableConfig;
            ObservableConfigKey observableConfigKey6 = ObservableConfigKey.ALLOW_CLICKTHROUGH_WITHOUT_TAP;
            if (observableConfig7.hasValue(observableConfigKey6)) {
                this.videoPlayer.setAllowClickthroughWithoutTap(this.observableConfig.getBooleanValue(observableConfigKey6, false));
            }
        }
        startActivityLifecycleChecking();
        Telemetry.reportAdMetric(TelemetryAdInfo.createVastInstance(this.config.getAdInstanceId(), Boolean.valueOf(this.isVideoStreamEnabled)), MetricRecordName.ON_VIDEO_PLAYER_CREATED);
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void onActivityDestroy() throws Throwable {
        destroy();
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onActivityPauseImpl() throws Throwable {
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.stopObstructionsChecking();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.onActivityPause();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onActivityResumeImpl() throws Throwable {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.onActivityResume();
        }
        ViewTreeInspector viewTreeInspector = this.viewTreeInspector;
        if (viewTreeInspector != null) {
            viewTreeInspector.startObstructionsChecking();
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected boolean onAdCloseRequested() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return true;
        }
        videoPlayer.pause();
        return true;
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void onConfigPropertyChanged(ObservableConfigKey observableConfigKey, Object obj) throws Throwable {
        try {
            int i10 = AnonymousClass4.$SwitchMap$com$mobilefuse$sdk$config$ObservableConfigKey[observableConfigKey.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (this.videoPlayer.isMuteAllowed()) {
                    this.videoPlayer.setMuted(((Boolean) obj).booleanValue());
                }
            } else if (i10 == 3) {
                this.videoPlayer.setFullscreen(((Boolean) obj).booleanValue());
            } else {
                if (i10 != 4) {
                    return;
                }
                ExtendedController extendedController = this.extendedController;
                if (extendedController instanceof ThumbnailAdController) {
                    ((ThumbnailAdController) extendedController).setAnchor(((Integer) obj).intValue());
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    protected void preloadAdmImpl(String str) throws Throwable {
        this.videoPlayer.setOmidBridge((VastOmidBridge) this.omidBridge);
        this.videoPlayer.loadVast(str, new VideoPlayer.LoadListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer.1
            @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
            public void onError(VastError vastError) {
                try {
                    if (vastError == VastError.XML_PARSING_FAILED) {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.INVALID_MARKUP);
                        return;
                    }
                    if (vastError == VastError.WRAPPER_LIMIT_REACHED) {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.WRAPPER_TOO_DEEP);
                        return;
                    }
                    if (vastError == VastError.MEDIAFILES_UNSUPPORTED) {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.UNSUPPORTED_MEDIA_FILE);
                        return;
                    }
                    if (vastError == VastError.MEDIAFILE_TIMEOUT) {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.ASSET_LOAD_TIMEOUT);
                    } else if (vastError == VastError.MEDIAFILE_NOT_FOUND) {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.MEDIA_FILE_NOT_FOUND);
                    } else {
                        VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
            public void onVideoLoaded() {
                try {
                    Telemetry.reportAdMetric(TelemetryAdInfo.createVastInstance(((BaseAdRenderer) VastAdRenderer.this).config.getAdInstanceId(), Boolean.valueOf(VastAdRenderer.this.isVideoStreamEnabled)), MetricRecordName.VIDEO_CACHED);
                    VastAdRenderer.this.saveAdmClickProvider();
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_LOADED);
                    VastAdRenderer.this.onAdPreloaded();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        });
    }

    @Override // com.mobilefuse.sdk.BaseAdRenderer
    public void renderAdmImpl() throws Throwable {
        initViewTreeInspector();
        createExternalController();
        ExtendedController extendedController = this.extendedController;
        if (extendedController != null) {
            extendedController.bindContent(this.contentContainer, this.renderingActivity);
        }
        this.videoPlayer.setOnVideoSkipButtonVisible(new Function0() { // from class: com.mobilefuse.sdk.vast.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VastAdRenderer.a(this.f53438b);
            }
        });
        ObservableConfig observableConfig = this.observableConfig;
        ObservableConfigKey observableConfigKey = ObservableConfigKey.AWAITING_MUTED;
        if (observableConfig.hasValue(observableConfigKey)) {
            ObservableConfig observableConfig2 = this.observableConfig;
            observableConfig2.setValue(ObservableConfigKey.MUTED, Boolean.valueOf(observableConfig2.getBooleanValue(observableConfigKey)));
            this.observableConfig.clearValue(observableConfigKey);
        }
        this.videoPlayer.play(this.renderingActivity, new VideoPlayer.PlaybackListener() { // from class: com.mobilefuse.sdk.vast.VastAdRenderer.2
            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onAdCompleted() {
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_COMPLETED);
                    VastAdRenderer.this.onAdClosed();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onAdImpression() {
                VastAdRenderer.this.reportAdImpression();
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onClicked(String str) {
                try {
                    ((BaseAdRenderer) VastAdRenderer.this).listener.onAdClicked(str);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onEndCardError() {
                try {
                    VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoCompleted() {
                try {
                    VastAdRenderer.this.finishOmidSession();
                    VastAdRenderer.this.dispatchSkipAdAvailability();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoError() {
                try {
                    VastAdRenderer.this.onAdRuntimeError(RtbLossReason.CREATIVE_GENERAL);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoFirstQuartile() {
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_FIRST_QUARTILE);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoMidpoint() {
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_MIDPOINT);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoPaused() {
                super.onVideoPaused();
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoPlaying() {
                super.onVideoPlaying();
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoSkipped() {
                try {
                    VastAdRenderer.this.finishOmidSession();
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_SKIPPED);
                    VastAdRenderer.this.dispatchSkipAdAvailability();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoStarted() {
                try {
                    VastAdRenderer.this.loaderView.setVisibility(8);
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_STARTED);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoThirdQuartile() {
                try {
                    VastAdRenderer.this.onAdLifecycleEvent(VastAdLifecycleEvent.VAST_VIDEO_THIRD_QUARTILE);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
            }
        });
    }
}
