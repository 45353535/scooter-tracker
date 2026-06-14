package net.pubnative.lite.sdk.vpaid;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.taurusx.tax.f.s;
import io.bidmachine.m4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdExperience;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.MediaPlayerErrors;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.UrlHandler;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityFriendlyObstruction;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityNativeVideoAdSession;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.helpers.ErrorLog;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause;
import net.pubnative.lite.sdk.vpaid.macros.MacroHelper;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;
import net.pubnative.lite.sdk.vpaid.models.vpaid.TrackingEvent;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.utils.UrlClickSource;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;

/* JADX INFO: loaded from: classes3.dex */
class VideoAdControllerVast implements VideoAdController, ReplayListener {
    private static final int DELAY_UNTIL_EXECUTE = 100;
    private static final String LOG_TAG = "VideoAdControllerVast";
    private boolean containsStartEvent;
    private Action currentAction;
    private boolean finishedPlaying;
    private boolean firstQuartileFired;
    private Boolean hasEndcard;
    private Boolean isActionsProcessingRun;
    private Boolean isAndroid6VersionDevice;
    boolean isAutoClose;
    Boolean isAutoCloseRemoteConfig;
    private Boolean isCreativeViewEventsTracked;
    private boolean isFullscreen;
    private boolean isImpressionFired;
    private Boolean isLastEndCardCustom;
    private boolean isReplay;
    private boolean isVideoCompleted;
    private boolean isVideoSkipped;
    private final List<Action> mActions;
    private final Handler mActionsProcessingHandler;
    private final AdParams mAdParams;
    private final BaseVideoAdInternal mBaseAdInternal;
    private final TextureView.SurfaceTextureListener mCreateTextureListener;
    private final AdTracker mCreativeViewEventsTracker;
    private int mDoneMillis;
    private int mDuration;
    private final List<EndCardData> mEndCardsData;
    private String mImageUri;
    private final AdPresenter.ImpressionListener mImpressionListener;
    private final IntegrationType mIntegrationType;
    private final MacroHelper mMacroHelper;
    private MediaPlayer mMediaPlayer;
    private final MediaPlayer.OnCompletionListener mOnCompletionListener;
    private final MediaPlayer.OnErrorListener mOnErrorListener;
    private final Map<Action, List<Action>> mPendingActions;
    private int mSkipTimeMillis;
    private TimerWithPause mSkipTimerWithPause;
    private TimerWithPause mTimerWithPause;
    private String mVideoUri;
    private final ViewControllerVast mViewControllerVast;
    private final HyBidViewabilityNativeVideoAdSession mViewabilityAdSession;
    private final List<HyBidViewabilityFriendlyObstruction> mViewabilityFriendlyObstructions;
    private boolean midpointFired;
    private boolean replaySdkEventFired;
    private boolean startFired;
    private boolean thirdQuartileFired;
    private boolean videoCompletedFired;
    private boolean videoVisible;
    private final boolean CLOSE_VIDEO_AFTER_FINISH_DEFAULT = false;
    private final boolean CLOSE_VIDEO_AFTER_FINISH_REWARDED_DEFAULT = false;
    private final List<TrackingEvent> mTrackingEventsList = new ArrayList();

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource;

        static {
            int[] iArr = new int[UrlClickSource.values().length];
            $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource = iArr;
            try {
                iArr[UrlClickSource.VAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource[UrlClickSource.CUSTOM_CTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource[UrlClickSource.DEFAULT_END_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource[UrlClickSource.CUSTOM_END_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Action.values().length];
            $SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action = iArr2;
            try {
                iArr2[Action.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action[Action.PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action[Action.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action[Action.RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum Action {
        PREPARE,
        PLAY,
        PAUSE,
        RESUME,
        INITIAL
    }

    VideoAdControllerVast(BaseVideoAdInternal baseVideoAdInternal, AdParams adParams, HyBidViewabilityNativeVideoAdSession hyBidViewabilityNativeVideoAdSession, boolean z10, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener, CustomCTAData customCTAData, Integer num, IntegrationType integrationType) {
        Boolean bool = Boolean.FALSE;
        this.isCreativeViewEventsTracked = bool;
        this.mEndCardsData = new ArrayList();
        this.mSkipTimeMillis = -1;
        this.mDuration = -1;
        this.mDoneMillis = -1;
        this.videoVisible = false;
        this.finishedPlaying = false;
        this.isImpressionFired = false;
        this.isVideoSkipped = false;
        this.isVideoCompleted = false;
        this.containsStartEvent = false;
        this.startFired = false;
        this.firstQuartileFired = false;
        this.midpointFired = false;
        this.thirdQuartileFired = false;
        this.videoCompletedFired = false;
        this.replaySdkEventFired = false;
        this.isFullscreen = false;
        this.isReplay = false;
        this.isAndroid6VersionDevice = bool;
        this.mPendingActions = new LinkedHashMap();
        this.mActions = new Vector();
        this.mActionsProcessingHandler = new Handler(Looper.getMainLooper());
        this.isActionsProcessingRun = bool;
        this.currentAction = Action.INITIAL;
        this.isLastEndCardCustom = bool;
        this.mOnErrorListener = new MediaPlayer.OnErrorListener() { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.1
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                if (i11 == MediaPlayerErrors.MEDIA_ERROR_SYSTEM || i11 == MediaPlayerErrors.MEDIA_ERROR_SYSTEM_CALLBACK) {
                    return false;
                }
                ErrorLog.postError(VideoAdControllerVast.this.mBaseAdInternal.getContext(), VastError.MEDIA_FILE_UNSUPPORTED);
                VideoAdControllerVast.this.mBaseAdInternal.onAdLoadFailInternal(new PlayerInfo("Error loading media file"));
                return true;
            }
        };
        this.mOnCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: net.pubnative.lite.sdk.vpaid.l
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f96071b.handleMediaPlayerComplete();
            }
        };
        this.isAutoCloseRemoteConfig = null;
        this.mCreateTextureListener = new TextureView.SurfaceTextureListener() { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.6
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                VideoAdControllerVast.this.mMediaPlayer.setSurface(new Surface(surfaceTexture));
                if (!VideoAdControllerVast.this.adFinishedPlaying() || VideoAdControllerVast.this.isReplay) {
                    VideoAdControllerVast.this.resumeAd();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mBaseAdInternal = baseVideoAdInternal;
        this.mAdParams = adParams;
        this.mViewabilityAdSession = hyBidViewabilityNativeVideoAdSession;
        this.mViewabilityFriendlyObstructions = new ArrayList();
        this.mViewControllerVast = new ViewControllerVast(this, z10, getEndcardCloseDelay(baseVideoAdInternal), getFullScreenClickability(baseVideoAdInternal), hasReducedCloseSize(baseVideoAdInternal), adCloseButtonListener, this, customCTAData, num, baseVideoAdInternal.getAd().isBrandAd(), baseVideoAdInternal.getAd().hasHiddenUxControls(), baseVideoAdInternal.getAd().getLearnMoreData());
        this.mMacroHelper = new MacroHelper();
        this.mCreativeViewEventsTracker = new AdTracker(getAdParams().getCompanionCreativeViewEvents(), null);
        if (Build.VERSION.SDK_INT <= 23) {
            this.isAndroid6VersionDevice = Boolean.TRUE;
        }
        if (z10) {
            this.videoVisible = true;
        }
        this.isFullscreen = z10;
        this.mImpressionListener = impressionListener;
        if (baseVideoAdInternal.getAd().isBrandAd()) {
            this.isAutoClose = false;
        } else {
            if (isRewarded()) {
                this.isAutoClose = false;
                if (baseVideoAdInternal.getAd() != null) {
                    this.isAutoCloseRemoteConfig = baseVideoAdInternal.getAd().needCloseRewardAfterFinish();
                }
            } else {
                this.isAutoClose = false;
                if (baseVideoAdInternal.getAd() != null) {
                    this.isAutoCloseRemoteConfig = baseVideoAdInternal.getAd().needCloseInterAfterFinish();
                }
            }
            Boolean bool2 = this.isAutoCloseRemoteConfig;
            if (bool2 != null) {
                this.isAutoClose = bool2.booleanValue();
            }
        }
        this.hasEndcard = AdEndCardManager.getDefaultEndCard();
        this.mIntegrationType = integrationType;
    }

    public static /* synthetic */ void a(VideoAdControllerVast videoAdControllerVast) {
        while (!videoAdControllerVast.mActions.isEmpty()) {
            Action action = videoAdControllerVast.mActions.get(0);
            videoAdControllerVast.executeAction(action);
            videoAdControllerVast.currentAction = action;
            if (!videoAdControllerVast.mActions.isEmpty()) {
                videoAdControllerVast.mActions.remove(0);
            }
            if (!videoAdControllerVast.mPendingActions.isEmpty() && videoAdControllerVast.mPendingActions.containsKey(action)) {
                List<Action> list = videoAdControllerVast.mPendingActions.get(action);
                if (list != null && !list.isEmpty()) {
                    videoAdControllerVast.mActions.addAll(0, list);
                }
                videoAdControllerVast.mPendingActions.remove(action);
            }
        }
        videoAdControllerVast.isActionsProcessingRun = Boolean.FALSE;
    }

    private synchronized void addAction(Action action) {
        try {
            if (this.mActions.isEmpty()) {
                this.mActions.add(action);
            } else {
                if (!this.mActions.get(r0.size() - 1).equals(action)) {
                    this.mActions.add(action);
                }
            }
            if (this.mPendingActions.isEmpty() || !this.mPendingActions.containsKey(action)) {
                return;
            }
            List<Action> list = this.mPendingActions.get(action);
            if (list != null && !list.isEmpty()) {
                this.mActions.addAll(list);
            }
            this.mPendingActions.remove(action);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void addMissingDefaultEvents(int i10) {
        for (String str : m4.a(new Object[]{"start", "firstQuartile", "midpoint", "thirdQuartile"})) {
            Iterator<TrackingEvent> it = this.mTrackingEventsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.mTrackingEventsList.add(createDefaultEvent(str, null, i10, null));
                    break;
                } else {
                    String str2 = it.next().name;
                    if (str2 == null || !str2.equalsIgnoreCase(str)) {
                    }
                }
            }
        }
    }

    private synchronized void addPendingAction(Action action, Action action2) {
        if (action != null && action2 != null) {
            if (this.mPendingActions.containsKey(action2) && this.mPendingActions.get(action2) != null) {
                this.mPendingActions.get(action2).add(action);
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(action);
        this.mPendingActions.put(action2, linkedList);
    }

    public static /* synthetic */ void c(VideoAdControllerVast videoAdControllerVast) {
        videoAdControllerVast.getClass();
        try {
            videoAdControllerVast.mMediaPlayer.setSurface(videoAdControllerVast.mViewControllerVast.getSurface());
            if (videoAdControllerVast.finishedPlaying) {
                videoAdControllerVast.mMediaPlayer.seekTo(videoAdControllerVast.mDuration);
            }
        } catch (IllegalStateException e10) {
            Logger.e(LOG_TAG, "mediaPlayer cant recover surface: " + e10.getMessage());
        }
    }

    private synchronized void cancelPendingPauseAction() {
        List<Action> list;
        try {
            if (!this.mActions.isEmpty()) {
                if (this.mActions.get(r0.size() - 1) == Action.PAUSE) {
                    this.mActions.remove(r0.size() - 1);
                }
            }
            Map<Action, List<Action>> map = this.mPendingActions;
            Action action = Action.PLAY;
            if (!map.containsKey(action) || (list = this.mPendingActions.get(action)) == null || list.isEmpty() || !list.get(list.size() - 1).equals(Action.PAUSE)) {
                return;
            }
            this.mPendingActions.get(action).remove(list.size() - 1);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void clearAllActions() {
        this.mActions.clear();
        this.mPendingActions.clear();
    }

    private TrackingEvent createDefaultEvent(String str, String str2, int i10, String str3) {
        TrackingEvent trackingEvent = new TrackingEvent(str2);
        trackingEvent.name = str;
        if (str.equalsIgnoreCase("start")) {
            trackingEvent.timeMillis = 0;
            trackingEvent.name = "start";
            this.containsStartEvent = true;
        }
        if (str.equalsIgnoreCase("firstQuartile")) {
            trackingEvent.timeMillis = i10 / 4;
            trackingEvent.name = "firstQuartile";
        }
        if (str.equalsIgnoreCase("midpoint")) {
            trackingEvent.timeMillis = i10 / 2;
            trackingEvent.name = "midpoint";
        }
        if (str.equalsIgnoreCase("thirdQuartile")) {
            trackingEvent.timeMillis = (i10 * 3) / 4;
            trackingEvent.name = "thirdQuartile";
        }
        return trackingEvent;
    }

    private void createProgressPoints(int i10) {
        this.mTrackingEventsList.clear();
        AdParams adParams = this.mAdParams;
        if (adParams == null) {
            return;
        }
        if (adParams.getImpressions() != null) {
            Iterator<String> it = this.mAdParams.getImpressions().iterator();
            while (it.hasNext()) {
                this.mTrackingEventsList.add(new TrackingEvent(it.next()));
            }
        }
        if (this.mAdParams.getEvents() != null) {
            for (Tracking tracking : this.mAdParams.getEvents()) {
                TrackingEvent trackingEvent = new TrackingEvent(tracking.getText());
                if (tracking.getEvent().equalsIgnoreCase("creativeView")) {
                    trackingEvent.timeMillis = 0;
                    trackingEvent.name = "creativeView";
                    this.mTrackingEventsList.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("start")) {
                    trackingEvent.timeMillis = 0;
                    trackingEvent.name = "start";
                    this.mTrackingEventsList.add(trackingEvent);
                    this.containsStartEvent = true;
                }
                if (tracking.getEvent().equalsIgnoreCase("firstQuartile")) {
                    trackingEvent.timeMillis = i10 / 4;
                    trackingEvent.name = "firstQuartile";
                    this.mTrackingEventsList.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("midpoint")) {
                    trackingEvent.timeMillis = i10 / 2;
                    trackingEvent.name = "midpoint";
                    this.mTrackingEventsList.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("thirdQuartile")) {
                    trackingEvent.timeMillis = (i10 * 3) / 4;
                    trackingEvent.name = "thirdQuartile";
                    this.mTrackingEventsList.add(trackingEvent);
                }
                if (tracking.getEvent().equalsIgnoreCase("progress") && tracking.getOffset() != null) {
                    if (tracking.getOffset().contains("%")) {
                        trackingEvent.timeMillis = (Utils.parsePercent(tracking.getOffset()) * i10) / 100;
                    } else {
                        Integer duration = Utils.parseDuration(tracking.getOffset());
                        if (duration != null) {
                            trackingEvent.timeMillis = duration.intValue() * 1000;
                        }
                    }
                    this.mTrackingEventsList.add(trackingEvent);
                }
            }
        }
    }

    private void createReplayTimer(final int i10) {
        ViewControllerVast viewControllerVast;
        this.mDuration = i10;
        this.mDoneMillis = -1;
        this.mTimerWithPause = new TimerWithPause(i10, 10L) { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.4
            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onFinish() {
                ViewControllerVast viewControllerVast2 = VideoAdControllerVast.this.mViewControllerVast;
                if (viewControllerVast2 != null) {
                    viewControllerVast2.showEndcards();
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onTick(long j10) {
                int i11 = (int) j10;
                VideoAdControllerVast.this.mViewControllerVast.setProgress(i11, i10);
                VideoAdControllerVast.this.mDoneMillis = i10 - i11;
                ArrayList arrayList = new ArrayList();
                for (TrackingEvent trackingEvent : VideoAdControllerVast.this.mTrackingEventsList) {
                    if (VideoAdControllerVast.this.mDoneMillis > trackingEvent.timeMillis) {
                        String str = trackingEvent.name;
                        if (str != null && str.equals("start")) {
                            VideoAdControllerVast videoAdControllerVast = VideoAdControllerVast.this;
                            if (!videoAdControllerVast.isImpressionFired && videoAdControllerVast.containsStartEvent) {
                                videoAdControllerVast.mImpressionListener.onImpression();
                                VideoAdControllerVast.this.isImpressionFired = true;
                            }
                        }
                        EventTracker.postEvent(VideoAdControllerVast.this.mBaseAdInternal.getContext(), trackingEvent.url, trackingEvent.name, VideoAdControllerVast.this.mMacroHelper, false);
                        VideoAdControllerVast.this.fireViewabilityTrackingEvent(trackingEvent.name);
                        arrayList.add(trackingEvent);
                    }
                }
                VideoAdControllerVast.this.mTrackingEventsList.removeAll(arrayList);
            }
        }.create();
        int i11 = this.mSkipTimeMillis;
        if (i11 <= 0 || !this.isFullscreen) {
            if (i11 == 0 && this.isFullscreen && (viewControllerVast = this.mViewControllerVast) != null) {
                viewControllerVast.endSkip(Boolean.valueOf(this.isAutoClose), this.hasEndcard);
                return;
            }
            return;
        }
        this.mSkipTimerWithPause = new TimerWithPause(i11, 10L) { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.5
            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onFinish() {
                ViewControllerVast viewControllerVast2 = VideoAdControllerVast.this.mViewControllerVast;
                if (viewControllerVast2 != null) {
                    viewControllerVast2.endSkip(Boolean.FALSE, Boolean.TRUE);
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onTick(long j10) {
                VideoAdControllerVast videoAdControllerVast = VideoAdControllerVast.this;
                videoAdControllerVast.mViewControllerVast.setSkipProgress((int) j10, videoAdControllerVast.mSkipTimeMillis);
            }
        }.create();
        if (this.mViewControllerVast == null || hasHiddenUx()) {
            return;
        }
        this.mViewControllerVast.showCountdownTimer();
    }

    private void createTimer(final int i10) {
        ViewControllerVast viewControllerVast;
        boolean z10 = false;
        if (this.isReplay) {
            createReplayTimer(i10);
            this.isVideoSkipped = false;
            return;
        }
        this.mDuration = i10;
        this.mDoneMillis = -1;
        initSkipTime(i10);
        createProgressPoints(i10);
        addMissingDefaultEvents(i10);
        if (AdEndCardManager.isEndCardEnabled(this.mBaseAdInternal.getAd()).booleanValue() && hasNextEndCard().booleanValue()) {
            z10 = true;
        }
        this.hasEndcard = Boolean.valueOf(z10);
        this.mTimerWithPause = new TimerWithPause(i10, 10L) { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.2
            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onFinish() {
                ViewControllerVast viewControllerVast2 = VideoAdControllerVast.this.mViewControllerVast;
                if (viewControllerVast2 != null) {
                    viewControllerVast2.resetProgress();
                    VideoAdControllerVast.this.handleMediaPlayerComplete();
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
            public void onTick(long j10) {
                int i11 = (int) j10;
                VideoAdControllerVast.this.mViewControllerVast.setProgress(i11, i10);
                VideoAdControllerVast videoAdControllerVast = VideoAdControllerVast.this;
                videoAdControllerVast.mDoneMillis = i10 - i11;
                if (!videoAdControllerVast.isImpressionFired && !videoAdControllerVast.containsStartEvent) {
                    videoAdControllerVast.mImpressionListener.onImpression();
                    VideoAdControllerVast.this.isImpressionFired = true;
                }
                ArrayList arrayList = new ArrayList();
                for (TrackingEvent trackingEvent : VideoAdControllerVast.this.mTrackingEventsList) {
                    if (VideoAdControllerVast.this.mDoneMillis > trackingEvent.timeMillis) {
                        String str = trackingEvent.name;
                        if (str != null && str.equals("start")) {
                            VideoAdControllerVast videoAdControllerVast2 = VideoAdControllerVast.this;
                            if (!videoAdControllerVast2.isImpressionFired && videoAdControllerVast2.containsStartEvent) {
                                videoAdControllerVast2.mImpressionListener.onImpression();
                                VideoAdControllerVast.this.isImpressionFired = true;
                            }
                        }
                        EventTracker.postEvent(VideoAdControllerVast.this.mBaseAdInternal.getContext(), trackingEvent.url, trackingEvent.name, VideoAdControllerVast.this.mMacroHelper, false);
                        VideoAdControllerVast.this.fireViewabilityTrackingEvent(trackingEvent.name);
                        arrayList.add(trackingEvent);
                    }
                }
                VideoAdControllerVast.this.mTrackingEventsList.removeAll(arrayList);
            }
        }.create();
        int i11 = this.mSkipTimeMillis;
        if (i11 > 0 && this.isFullscreen) {
            this.mSkipTimerWithPause = new TimerWithPause(i11, 10L) { // from class: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.3
                @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
                public void onFinish() {
                    VideoAdControllerVast videoAdControllerVast = VideoAdControllerVast.this;
                    ViewControllerVast viewControllerVast2 = videoAdControllerVast.mViewControllerVast;
                    if (viewControllerVast2 != null) {
                        viewControllerVast2.endSkip(Boolean.valueOf(videoAdControllerVast.isAutoClose), VideoAdControllerVast.this.hasEndcard);
                    }
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.TimerWithPause
                public void onTick(long j10) {
                    VideoAdControllerVast videoAdControllerVast = VideoAdControllerVast.this;
                    videoAdControllerVast.mViewControllerVast.setSkipProgress((int) j10, videoAdControllerVast.mSkipTimeMillis);
                }
            }.create();
        } else if (i11 == 0 && this.isFullscreen && (viewControllerVast = this.mViewControllerVast) != null) {
            viewControllerVast.endSkip(Boolean.valueOf(this.isAutoClose), this.hasEndcard);
        }
    }

    public static /* synthetic */ void d(VideoAdControllerVast videoAdControllerVast) {
        BaseVideoAdInternal baseVideoAdInternal = videoAdControllerVast.mBaseAdInternal;
        if (baseVideoAdInternal != null && baseVideoAdInternal.isInterstitial().booleanValue() && videoAdControllerVast.finishedPlaying && videoAdControllerVast.mImageUri == null && videoAdControllerVast.isAutoClose && !videoAdControllerVast.hasEndcard.booleanValue()) {
            videoAdControllerVast.closeSelf();
        }
    }

    public static /* synthetic */ void e(VideoAdControllerVast videoAdControllerVast) {
        videoAdControllerVast.getClass();
        try {
            videoAdControllerVast.processPrepareAction();
        } catch (Exception e10) {
            Logger.e(LOG_TAG, "mediaPlayer re-init: " + e10.getMessage());
            videoAdControllerVast.closeSelf();
        }
    }

    private synchronized void executeAction(Action action) {
        int i10 = AnonymousClass7.$SwitchMap$net$pubnative$lite$sdk$vpaid$VideoAdControllerVast$Action[action.ordinal()];
        if (i10 == 1) {
            try {
                processPrepareAction();
            } catch (IOException unused) {
                tryReInitMediaPlayer();
            }
        } else if (i10 == 2) {
            processPlayAction();
        } else if (i10 == 3) {
            processPauseAction();
        } else {
            if (i10 != 4) {
                return;
            }
            processResumeAction();
        }
    }

    private void fireReportingEvent(String str) {
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        if (isRewarded()) {
            reportingEvent.setAdFormat("rewarded");
        } else if (this.isFullscreen) {
            reportingEvent.setAdFormat("fullscreen");
        } else {
            reportingEvent.setAdFormat("banner");
        }
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        reportingEvent.setTimestamp(System.currentTimeMillis());
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null && baseVideoAdInternal.getAd() != null) {
            reportingEvent.setImpId(this.mBaseAdInternal.getAd().getSessionId());
            reportingEvent.setCampaignId(this.mBaseAdInternal.getAd().getCampaignId());
            reportingEvent.setConfigId(this.mBaseAdInternal.getAd().getConfigId());
        }
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireViewabilityTrackingEvent(String str) {
        if (getViewabilityAdSession() == null || TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "midpoint":
                getViewabilityAdSession().fireMidpoint();
                if (!this.midpointFired) {
                    fireReportingEvent("midpoint");
                    this.midpointFired = true;
                    break;
                }
                break;
            case "thirdQuartile":
                getViewabilityAdSession().fireThirdQuartile();
                if (!this.thirdQuartileFired) {
                    fireReportingEvent("third_quartile");
                    this.thirdQuartileFired = true;
                    break;
                }
                break;
            case "start":
                try {
                    getViewabilityAdSession().fireStart(getAdParams().getDuration(), true);
                    break;
                } catch (Exception unused) {
                    if (this.mDuration > 0) {
                        getViewabilityAdSession().fireStart(this.mDuration, true);
                    } else if (this.mSkipTimeMillis > 0) {
                        getViewabilityAdSession().fireStart(this.mSkipTimeMillis, true);
                    }
                }
                if (!this.startFired) {
                    fireReportingEvent(Reporting.EventType.VIDEO_STARTED);
                    this.startFired = true;
                    break;
                }
                break;
            case "firstQuartile":
                getViewabilityAdSession().fireFirstQuartile();
                if (!this.firstQuartileFired) {
                    fireReportingEvent("first_quartile");
                    this.firstQuartileFired = true;
                    break;
                }
                break;
        }
    }

    private Integer getEndcardCloseDelay(BaseVideoAdInternal baseVideoAdInternal) {
        if (baseVideoAdInternal == null || baseVideoAdInternal.getAd() == null) {
            return null;
        }
        return baseVideoAdInternal.getAd().getEndCardCloseDelay();
    }

    private Boolean getFullScreenClickability(BaseVideoAdInternal baseVideoAdInternal) {
        if (baseVideoAdInternal == null || baseVideoAdInternal.getAd() == null) {
            return null;
        }
        return baseVideoAdInternal.getAd().getFullScreenClickability();
    }

    private Integer getNativeCloseButtonDelay(BaseVideoAdInternal baseVideoAdInternal) {
        if (baseVideoAdInternal == null || baseVideoAdInternal.getAd() == null) {
            return null;
        }
        return getCloseButtonDelay(baseVideoAdInternal.getAd());
    }

    private EndCardData getNextEndCard() {
        if (this.mEndCardsData.isEmpty()) {
            return null;
        }
        EndCardData endCardData = this.mEndCardsData.get(0);
        this.mEndCardsData.remove(0);
        return endCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaPlayerComplete() {
        if (this.isVideoCompleted) {
            return;
        }
        if (this.isReplay) {
            this.mBaseAdInternal.onAdFinishedReplaying();
        }
        this.mViewControllerVast.hideSkipButton();
        this.mViewControllerVast.hideMuteButton();
        this.isVideoCompleted = true;
        this.mViewControllerVast.setTimerVisible(false);
        this.mBaseAdInternal.onAdDidReachEnd();
        if (!this.videoCompletedFired) {
            fireReportingEvent(Reporting.EventType.VIDEO_AD_COMPLETE);
            this.videoCompletedFired = true;
        }
        skipVideo(false);
        if (this.isVideoSkipped) {
            return;
        }
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "complete", this.mMacroHelper, true);
    }

    private boolean hasHiddenUx() {
        return this.mBaseAdInternal.getAd().isBrandAd() && this.mBaseAdInternal.getAd().hasHiddenUxControls();
    }

    private Boolean hasNextEndCard() {
        return Boolean.valueOf(!this.mEndCardsData.isEmpty());
    }

    private boolean hasReducedCloseSize(BaseVideoAdInternal baseVideoAdInternal) {
        if (baseVideoAdInternal != null && baseVideoAdInternal.getAd() != null) {
            Boolean boolIsIconSizeReduced = baseVideoAdInternal.getAd().isIconSizeReduced();
            if (baseVideoAdInternal.getAd().getAdExperience().equalsIgnoreCase(AdExperience.PERFORMANCE) && boolIsIconSizeReduced != null && boolIsIconSizeReduced.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initSkipTime(int r9) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.VideoAdControllerVast.initSkipTime(int):void");
    }

    private boolean isEndCardShowable() {
        Ad ad2 = this.mBaseAdInternal.getAd();
        if (ad2 != null) {
            return AdEndCardManager.isEndCardEnabled(ad2).booleanValue();
        }
        return false;
    }

    private synchronized void muteVideo(boolean z10, boolean z11) {
        if (this.mMediaPlayer != null) {
            try {
                getViewabilityAdSession().fireVolumeChange(z10);
                if (z10) {
                    this.mMediaPlayer.setVolume(0.0f, 0.0f);
                    if (z11) {
                        fireReportingEvent(Reporting.EventType.VIDEO_MUTE);
                        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "mute", this.mMacroHelper, false);
                    }
                } else {
                    float systemVolume = Utils.getSystemVolume(this.mBaseAdInternal.getContext());
                    this.mMediaPlayer.setVolume(systemVolume, systemVolume);
                    if (z11) {
                        fireReportingEvent(Reporting.EventType.VIDEO_UNMUTE);
                        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "unmute", this.mMacroHelper, false);
                    }
                }
            } catch (RuntimeException e10) {
                HyBid.reportException((Exception) e10);
                Logger.w(LOG_TAG, e10.getMessage());
            }
        }
    }

    private void postDelayed(Runnable runnable) {
        this.mViewControllerVast.postDelayed(runnable, 100L);
    }

    private synchronized void processActions() {
        if (!this.mActions.isEmpty() && !this.isActionsProcessingRun.booleanValue()) {
            this.isActionsProcessingRun = Boolean.TRUE;
            this.mActionsProcessingHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.m
                @Override // java.lang.Runnable
                public final void run() {
                    VideoAdControllerVast.a(this.f96072b);
                }
            });
        }
    }

    private void processPauseAction() {
        TimerWithPause timerWithPause = this.mTimerWithPause;
        if (timerWithPause != null) {
            timerWithPause.pause();
        }
        TimerWithPause timerWithPause2 = this.mSkipTimerWithPause;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    this.mMediaPlayer.pause();
                    getViewabilityAdSession().firePause();
                }
            } catch (IllegalStateException e10) {
                Logger.e(VideoAdControllerVast.class.getSimpleName(), "Media player is not prepared: " + e10.getMessage());
            }
        }
        if (this.isVideoCompleted || this.isVideoSkipped) {
            return;
        }
        fireReportingEvent(Reporting.EventType.VIDEO_PAUSE);
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "pause", this.mMacroHelper, false);
    }

    private void processPlayAction() {
        if (this.mMediaPlayer == null) {
            return;
        }
        muteVideo(this.mViewControllerVast.isMute(), false);
        this.mViewControllerVast.adjustLayoutParams(this.mMediaPlayer.getVideoWidth(), this.mMediaPlayer.getVideoHeight());
        this.mMediaPlayer.setSurface(this.mViewControllerVast.getSurface());
        createTimer(this.mMediaPlayer.getDuration());
        if (!this.isReplay) {
            getViewabilityAdSession().fireImpression();
        }
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null && baseVideoAdInternal.getAdListener() != null) {
            this.mBaseAdInternal.getAdListener().onAdStarted();
        }
        this.mMediaPlayer.start();
    }

    private void processPrepareAction() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.mMediaPlayer = new MediaPlayer();
        try {
            String str = this.mVideoUri;
            if (str == null || str.isEmpty()) {
                this.mBaseAdInternal.onAdLoadFailInternal(new PlayerInfo("Invalid media file uri"));
            }
            this.mMediaPlayer.setDataSource(this.mVideoUri);
            this.mMediaPlayer.setOnCompletionListener(this.mOnCompletionListener);
            this.mMediaPlayer.setOnErrorListener(this.mOnErrorListener);
            this.mMediaPlayer.setLooping(false);
            this.mMediaPlayer.prepare();
        } catch (IOException e10) {
            e = e10;
            Logger.e(LOG_TAG, "startMediaPlayer: " + e.getMessage());
            this.mBaseAdInternal.onAdLoadFailInternal(new PlayerInfo("Error loading media file"));
        } catch (RuntimeException e11) {
            e = e11;
            Logger.e(LOG_TAG, "startMediaPlayer: " + e.getMessage());
            this.mBaseAdInternal.onAdLoadFailInternal(new PlayerInfo("Error loading media file"));
        }
    }

    private void processResumeAction() {
        MediaPlayer mediaPlayer;
        if (!this.isVideoCompleted && (mediaPlayer = this.mMediaPlayer) != null) {
            mediaPlayer.setSurface(this.mViewControllerVast.getSurface());
            this.mMediaPlayer.start();
        }
        if (this.isVideoCompleted) {
            recoverMediaPlayerSurface();
        }
        TimerWithPause timerWithPause = this.mTimerWithPause;
        if (timerWithPause != null && timerWithPause.isPaused()) {
            this.mTimerWithPause.resume();
        }
        TimerWithPause timerWithPause2 = this.mSkipTimerWithPause;
        if (timerWithPause2 != null && timerWithPause2.isPaused()) {
            this.mSkipTimerWithPause.resume();
        }
        if (this.isVideoCompleted || this.isVideoSkipped) {
            return;
        }
        fireReportingEvent(Reporting.EventType.VIDEO_RESUME);
        getViewabilityAdSession().fireResume();
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "resume", this.mMacroHelper, false);
    }

    private void recoverMediaPlayerSurface() {
        if (this.mMediaPlayer == null) {
            return;
        }
        postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.k
            @Override // java.lang.Runnable
            public final void run() {
                VideoAdControllerVast.c(this.f96070b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeAd() {
        if (this.currentAction == Action.PAUSE && !this.isVideoSkipped) {
            addAction(Action.RESUME);
        } else if (isVideoVisible()) {
            cancelPendingPauseAction();
        }
        this.mViewControllerVast.resume();
        processActions();
    }

    private void sendReplaySdkEventAndReport() {
        BaseVideoAdInternal baseVideoAdInternal;
        if (!this.replaySdkEventFired && (baseVideoAdInternal = this.mBaseAdInternal) != null && baseVideoAdInternal.getAd() != null) {
            new AdTracker(null, null, this.mBaseAdInternal.getAd().getBeacons(Ad.Beacon.SDK_EVENT), null, null).trackSdkEvent(3, null);
            this.replaySdkEventFired = true;
        }
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.VIDEO_REPLAY);
        if (isRewarded()) {
            reportingEvent.setAdFormat("rewarded");
        } else {
            reportingEvent.setAdFormat("fullscreen");
        }
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        reportingEvent.setTimestamp(System.currentTimeMillis());
        BaseVideoAdInternal baseVideoAdInternal2 = this.mBaseAdInternal;
        if (baseVideoAdInternal2 != null && baseVideoAdInternal2.getAd() != null) {
            reportingEvent.setImpId(this.mBaseAdInternal.getAd().getSessionId());
            reportingEvent.setCampaignId(this.mBaseAdInternal.getAd().getCampaignId());
            reportingEvent.setConfigId(this.mBaseAdInternal.getAd().getConfigId());
        }
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    private void sendRewindVastEvent() {
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), EventConstants.REWIND, this.mMacroHelper, false);
    }

    private void trackClickThroughEvent(String str) {
        if (Objects.equals(str, this.mAdParams.getVideoRedirectUrl())) {
            EventTracker.postEvent(this.mBaseAdInternal.getContext(), str, s.f66022o, this.mMacroHelper, false);
        } else if (Objects.equals(str, this.mAdParams.getEndCardRedirectUrl())) {
            EventTracker.postEvent(this.mBaseAdInternal.getContext(), str, com.taurusx.tax.f.c.f66001o, this.mMacroHelper, false);
        }
    }

    private String trackEndCardClicks() {
        String endCardRedirectUrl = this.mAdParams.getEndCardRedirectUrl();
        Iterator<String> it = this.mAdParams.getEndCardClicks().iterator();
        while (it.hasNext()) {
            EventTracker.postEvent(this.mBaseAdInternal.getContext(), it.next(), "EndcardClick", this.mMacroHelper, false);
        }
        return endCardRedirectUrl;
    }

    private String trackVideoClicks() {
        String videoRedirectUrl = this.mAdParams.getVideoRedirectUrl();
        Iterator<String> it = this.mAdParams.getVideoClicks().iterator();
        while (it.hasNext()) {
            EventTracker.postEvent(this.mBaseAdInternal.getContext(), it.next(), "VideoClick", this.mMacroHelper, false);
        }
        return videoRedirectUrl;
    }

    private void tryReInitMediaPlayer() {
        postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.h
            @Override // java.lang.Runnable
            public final void run() {
                VideoAdControllerVast.e(this.f96064b);
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean adFinishedPlaying() {
        return this.finishedPlaying;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void addEndCardData(EndCardData endCardData) {
        if (endCardData != null) {
            this.mEndCardsData.add(endCardData);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mViewabilityFriendlyObstructions.add(new HyBidViewabilityFriendlyObstruction(view, baseFriendlyObstructionPurpose, str));
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void buildVideoAdView(VideoAdView videoAdView) {
        this.mViewControllerVast.buildVideoAdView(videoAdView);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void closeEndCard() {
        closeSelf();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void closeSelf() {
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "close", this.mMacroHelper, true);
        EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "closeLinear", this.mMacroHelper, true);
        this.mBaseAdInternal.dismiss();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void destroy() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (RuntimeException unused) {
                Logger.e(LOG_TAG, "Error releasing HyBid video player");
            }
        }
        if (this.currentAction == Action.INITIAL) {
            EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), EventConstants.NOT_USED, this.mMacroHelper, true);
        }
        this.finishedPlaying = true;
        TimerWithPause timerWithPause = this.mTimerWithPause;
        if (timerWithPause != null) {
            timerWithPause.pause();
            this.mTimerWithPause = null;
        }
        TimerWithPause timerWithPause2 = this.mSkipTimerWithPause;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
            this.mSkipTimerWithPause = null;
        }
        this.mViewControllerVast.destroy();
        clearAllActions();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void dismiss() {
        this.mViewControllerVast.dismiss();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public AdParams getAdParams() {
        return this.mAdParams;
    }

    public Integer getCloseButtonDelay(Ad ad2) {
        return SkipOffsetManager.getNativeCloseButtonDelay(ad2.getNativeCloseButtonDelay());
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public int getProgress() {
        int i10;
        int i11 = this.mDoneMillis;
        if (i11 == -1 || (i10 = this.mDuration) == -1) {
            return -1;
        }
        return (i11 * 100) / i10;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public HyBidViewabilityNativeVideoAdSession getViewabilityAdSession() {
        return this.mViewabilityAdSession;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public List<HyBidViewabilityFriendlyObstruction> getViewabilityFriendlyObstructions() {
        return this.mViewabilityFriendlyObstructions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean isRewarded() {
        return this.mBaseAdInternal.isRewarded();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public boolean isVideoVisible() {
        return this.videoVisible;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTAClick(boolean z10) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTAClick(z10);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTALoadFail() {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTALoadFail();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomCTAShow() {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomCTAShow();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomEndCardClick(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onCustomEndCardShow(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onCustomEndCardShow(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onDefaultEndCardClick(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onDefaultEndCardClick(str);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onDefaultEndCardShow(String str) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onDefaultEndCardShow(str);
        }
        if (this.mCreativeViewEventsTracker == null || this.isCreativeViewEventsTracked.booleanValue()) {
            return;
        }
        this.mCreativeViewEventsTracker.trackImpression();
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.CREATIVE_VIEW);
            if (isRewarded()) {
                reportingEvent.setAdFormat("rewarded");
            } else if (this.isFullscreen) {
                reportingEvent.setAdFormat("fullscreen");
            } else {
                reportingEvent.setAdFormat("banner");
            }
            reportingEvent.setCreativeType("video");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            reportingEvent.setTimestamp(System.currentTimeMillis());
            BaseVideoAdInternal baseVideoAdInternal2 = this.mBaseAdInternal;
            if (baseVideoAdInternal2 != null && baseVideoAdInternal2.getAd() != null) {
                reportingEvent.setImpId(this.mBaseAdInternal.getAd().getSessionId());
                reportingEvent.setCampaignId(this.mBaseAdInternal.getAd().getCampaignId());
                reportingEvent.setConfigId(this.mBaseAdInternal.getAd().getConfigId());
            }
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        this.isCreativeViewEventsTracked = Boolean.TRUE;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardClosed(Boolean bool) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardClosed(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardLoadFail(Boolean bool) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardLoadFail(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onEndCardLoadSuccess(Boolean bool) {
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardLoadSuccess(bool);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void onVolumeChanged() {
        muteVideo(this.mViewControllerVast.isMute(), false);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void openUrl(String str, UrlClickSource urlClickSource) {
        String navigationMode;
        String link;
        if (urlClickSource == null) {
            return;
        }
        int i10 = AnonymousClass7.$SwitchMap$net$pubnative$lite$sdk$vpaid$utils$UrlClickSource[urlClickSource.ordinal()];
        if (i10 == 1 || i10 == 2) {
            str = trackVideoClicks();
            this.mBaseAdInternal.onAdClicked();
        } else if (i10 == 3) {
            str = trackEndCardClicks();
            String strTrackVideoClicks = trackVideoClicks();
            if (str == null) {
                str = strTrackVideoClicks;
            }
            this.mBaseAdInternal.onAdClicked();
        } else if (i10 == 4) {
            String strTrackVideoClicks2 = trackVideoClicks();
            if (str == null) {
                str = strTrackVideoClicks2;
            }
        }
        String str2 = LOG_TAG;
        Logger.d(str2, "Handle external url");
        if (!Utils.isOnline(this.mBaseAdInternal.getContext())) {
            Logger.e(str2, "No internet connection");
            return;
        }
        Context context = this.mBaseAdInternal.getContext();
        trackClickThroughEvent(str);
        if (this.mBaseAdInternal.getAd() != null) {
            navigationMode = this.mBaseAdInternal.getAd().getNavigationMode();
            link = this.mBaseAdInternal.getAd().getLink();
        } else {
            navigationMode = null;
            link = null;
        }
        new UrlHandler(context).handleUrl(str, link, navigationMode);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void pause() {
        if (this.currentAction == Action.INITIAL) {
            addPendingAction(Action.PAUSE, Action.PLAY);
        } else {
            addAction(Action.PAUSE);
        }
        this.mViewControllerVast.pause();
        processActions();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void pauseEndCardCloseButtonTimer() {
        this.mViewControllerVast.pauseEndCardCloseButtonTimer();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void playAd() {
        addAction(Action.PREPARE);
        addAction(Action.PLAY);
        processActions();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void prepare(VideoAdController.OnPreparedListener onPreparedListener) {
        onPreparedListener.onPrepared();
    }

    @Override // net.pubnative.lite.sdk.vpaid.ReplayListener
    public void replayVast() {
        this.isVideoCompleted = false;
        this.mBaseAdInternal.onAdReplaying();
        ViewControllerVast viewControllerVast = this.mViewControllerVast;
        if (viewControllerVast != null) {
            viewControllerVast.recoverGoneCountdownView();
            this.mViewControllerVast.hideEndcards();
            this.mViewControllerVast.hideSkipButton();
        }
        this.isReplay = true;
        sendReplaySdkEventAndReport();
        sendRewindVastEvent();
        playAd();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void resume() {
        if (!this.isAndroid6VersionDevice.booleanValue() || this.mMediaPlayer == null) {
            resumeAd();
            return;
        }
        ViewControllerVast viewControllerVast = this.mViewControllerVast;
        if (viewControllerVast == null || viewControllerVast.getTexture() == null) {
            resumeAd();
        } else {
            this.mViewControllerVast.getTexture().setSurfaceTextureListener(this.mCreateTextureListener);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void resumeEndCardCloseButtonTimer() {
        this.mViewControllerVast.resumeEndCardCloseButtonTimer();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setEndCardFilePath(String str) {
        this.mImageUri = str;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVideoFilePath(String str) {
        this.mVideoUri = str;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVideoVisible(boolean z10) {
        if (this.videoVisible && z10) {
            recoverMediaPlayerSurface();
        }
        this.videoVisible = z10;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void setVolume(boolean z10) {
        muteVideo(z10, true);
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void skipEndCard() {
        EndCardData nextEndCard = getNextEndCard();
        if (nextEndCard == null || !isEndCardShowable() || (nextEndCard.getType() == EndCardData.Type.STATIC_RESOURCE && TextUtils.isEmpty(this.mImageUri))) {
            closeSelf();
            return;
        }
        BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
        if (baseVideoAdInternal != null) {
            baseVideoAdInternal.onEndCardSkipped(this.isLastEndCardCustom);
            ViewControllerVast viewControllerVast = this.mViewControllerVast;
            String str = this.mImageUri;
            BaseVideoAdInternal baseVideoAdInternal2 = this.mBaseAdInternal;
            Objects.requireNonNull(baseVideoAdInternal2);
            viewControllerVast.showLastCustomEndCard(nextEndCard, str, new i(baseVideoAdInternal2));
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void skipVideo() {
        this.mViewControllerVast.hideSkipButton();
        this.mViewControllerVast.setTimerVisible(false);
        this.mViewControllerVast.hideMuteButton();
        skipVideo(true);
        this.isVideoSkipped = true;
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoAdController
    public void toggleMute() {
        this.mViewControllerVast.muteVideo();
    }

    private void skipVideo(boolean z10) {
        if (this.isReplay) {
            this.mBaseAdInternal.onAdFinishedReplaying();
            this.mViewControllerVast.showEndcards();
            pause();
        }
        if (this.finishedPlaying) {
            return;
        }
        this.finishedPlaying = true;
        clearAllActions();
        if (z10) {
            getViewabilityAdSession().fireSkipped();
            this.mBaseAdInternal.onAdSkipped();
        } else if (!this.isVideoSkipped) {
            getViewabilityAdSession().fireComplete();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
        }
        TimerWithPause timerWithPause = this.mTimerWithPause;
        if (timerWithPause != null) {
            timerWithPause.pause();
            this.mTimerWithPause = null;
        }
        TimerWithPause timerWithPause2 = this.mSkipTimerWithPause;
        if (timerWithPause2 != null) {
            timerWithPause2.pause();
            this.mSkipTimerWithPause = null;
        }
        if (z10) {
            fireReportingEvent(Reporting.EventType.VIDEO_AD_SKIPPED);
            EventTracker.postEventByType(this.mBaseAdInternal.getContext(), this.mAdParams.getEvents(), "skip", this.mMacroHelper, true);
        }
        if (this.isAutoClose) {
            this.hasEndcard = Boolean.FALSE;
            closeSelf();
            return;
        }
        EndCardData nextEndCard = getNextEndCard();
        Boolean boolValueOf = Boolean.valueOf(true ^ hasNextEndCard().booleanValue());
        if (nextEndCard != null && isEndCardShowable() && (nextEndCard.getType() != EndCardData.Type.STATIC_RESOURCE || !TextUtils.isEmpty(this.mImageUri))) {
            this.hasEndcard = Boolean.TRUE;
            this.isLastEndCardCustom = nextEndCard.isCustom();
            BaseVideoAdInternal baseVideoAdInternal = this.mBaseAdInternal;
            if (baseVideoAdInternal != null) {
                this.mViewControllerVast.showEndCard(nextEndCard, this.mImageUri, boolValueOf, new i(baseVideoAdInternal));
            }
        } else if (z10) {
            closeSelf();
        } else {
            BaseVideoAdInternal baseVideoAdInternal2 = this.mBaseAdInternal;
            if (baseVideoAdInternal2 != null) {
                baseVideoAdInternal2.onAdCloseButtonVisible();
            }
        }
        postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.j
            @Override // java.lang.Runnable
            public final void run() {
                VideoAdControllerVast.d(this.f96069b);
            }
        });
    }
}
