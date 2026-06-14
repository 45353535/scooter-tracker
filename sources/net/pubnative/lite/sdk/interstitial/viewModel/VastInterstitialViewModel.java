package net.pubnative.lite.sdk.interstitial.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor;
import net.pubnative.lite.sdk.interstitial.viewModel.VastInterstitialViewModel;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.AdCloseButtonListener;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* JADX INFO: loaded from: classes3.dex */
public class VastInterstitialViewModel extends InterstitialViewModel implements AdPresenter.ImpressionListener, AdCloseButtonListener, VolumeObserver.VolumeChangeListener {
    private static final String TAG = "VastInterstitialViewModel";
    private VideoAdCacheItem mAdCacheItem;
    private AdTracker mAdEventTracker;
    private final CloseButtonListener mCloseButtonListener;
    protected List<String> mCustomCTAClickTrackedEvents;
    private AdTracker mCustomCTAEndCardTracker;
    protected Boolean mCustomCTAImpressionTracked;
    private AdTracker mCustomCTATracker;
    protected Boolean mCustomEndCardClickTracked;
    protected Boolean mCustomEndCardCloseTracked;
    protected Boolean mCustomEndCardImpressionTracked;
    protected Boolean mCustomEndCardSkipTracked;
    protected Boolean mDefaultEndCardClickTracked;
    protected Boolean mDefaultEndCardCloseTracked;
    protected Boolean mDefaultEndCardImpressionTracked;
    protected Boolean mDefaultEndCardSkipTracked;
    private boolean mHasEndCard;
    private boolean mIsAdPausedBeforeRender;
    private boolean mIsVideoFinished;
    protected Boolean mLoadCustomEndCardTracked;
    protected Boolean mLoadDefaultEndCardTracked;
    protected Boolean mLoadEndCardFailTracked;
    private boolean mReady;
    private VideoAd mVideoAd;
    private final VideoAdListener mVideoAdListener;
    private VideoAdView mVideoPlayer;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.interstitial.viewModel.VastInterstitialViewModel$1, reason: invalid class name */
    class AnonymousClass1 extends VideoAdListener {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.mIsSkippable = true;
            vastInterstitialViewModel.mListener.showInterstitialCloseButton(vastInterstitialViewModel.mCloseListener);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdClicked() {
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CLICK);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
            VastInterstitialViewModel.this.mHasEndCard = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.mReady = false;
            vastInterstitialViewModel.mIsVideoFinished = true;
            if (!vastInterstitialViewModel.mHasEndCard) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastInterstitialViewModel.AnonymousClass1.a(this.f95863b);
                    }
                }, 100L);
            }
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_FINISH);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastInterstitialViewModel.this.mListener.hideProgressBar();
            Bundle bundle = new Bundle();
            bundle.putInt("pn_video_progress", 0);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.ERROR);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
            VastInterstitialViewModel.this.mListener.finishActivity();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel.mReady) {
                return;
            }
            vastInterstitialViewModel.mReady = true;
            vastInterstitialViewModel.mListener.hideProgressBar();
            VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel2.mIsAdPausedBeforeRender) {
                return;
            }
            vastInterstitialViewModel2.mVideoAd.show();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onAdSkipped() {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.mIsVideoFinished = true;
            vastInterstitialViewModel.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_SKIP);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdStarted() {
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_START);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z10) {
            String str = z10 ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastInterstitialViewModel.this.mCustomCTAClickTrackedEvents.contains(str)) {
                return;
            }
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.invokeOnCustomCTAClick(str, vastInterstitialViewModel.mAd, "fullscreen");
            if (str.equals("custom_cta_endcard_click")) {
                AdTracker adTracker = VastInterstitialViewModel.this.mCustomCTAEndCardTracker;
                if (adTracker != null) {
                    adTracker.trackClick();
                }
            } else {
                AdTracker adTracker2 = VastInterstitialViewModel.this.mCustomCTATracker;
                if (adTracker2 != null) {
                    adTracker2.trackClick();
                }
            }
            VastInterstitialViewModel.this.mCustomCTAClickTrackedEvents.add(str);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastInterstitialViewModel.this.mCustomCTAImpressionTracked.booleanValue()) {
                return;
            }
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            vastInterstitialViewModel.invokeOnCustomCTAShow(vastInterstitialViewModel.mAd, "fullscreen");
            AdTracker adTracker = VastInterstitialViewModel.this.mCustomCTATracker;
            if (adTracker != null) {
                adTracker.trackImpression();
            }
            VastInterstitialViewModel.this.mCustomCTAImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastInterstitialViewModel.this.mCustomEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString("click", str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CUSTOM_END_CARD_CLICK, bundle);
            VastInterstitialViewModel.this.mCustomEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastInterstitialViewModel.this.mCustomEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CUSTOM_END_CARD_SHOW, bundle);
            VastInterstitialViewModel.this.mCustomEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastInterstitialViewModel.this.mDefaultEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DEFAULT_END_CARD_CLICK, bundle);
            VastInterstitialViewModel.this.mDefaultEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastInterstitialViewModel.this.mDefaultEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DEFAULT_END_CARD_SHOW, bundle);
            VastInterstitialViewModel.this.mDefaultEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastInterstitialViewModel.this.mCustomEndCardCloseTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastInterstitialViewModel.this.mDefaultEndCardCloseTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
                    vastInterstitialViewModel.mCustomEndCardCloseTracked = Boolean.TRUE;
                    vastInterstitialViewModel.mAdEventTracker.trackCustomEndcardEvent(3, null);
                } else {
                    VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
                    vastInterstitialViewModel2.mDefaultEndCardCloseTracked = Boolean.TRUE;
                    vastInterstitialViewModel2.mAdEventTracker.trackCompanionAdEvent(3, null);
                }
                VastInterstitialViewModel vastInterstitialViewModel3 = VastInterstitialViewModel.this;
                vastInterstitialViewModel3.invokeOnEndCardClosed(vastInterstitialViewModel3.mDefaultEndCardCloseTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (VastInterstitialViewModel.this.mLoadEndCardFailTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(Reporting.Key.IS_CUSTOM_END_CARD, bool.booleanValue());
            VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.END_CARD_LOAD_FAILURE, bundle);
            VastInterstitialViewModel.this.mLoadEndCardFailTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastInterstitialViewModel.this.mLoadCustomEndCardTracked.booleanValue()) && (bool.booleanValue() || !VastInterstitialViewModel.this.mLoadDefaultEndCardTracked.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastInterstitialViewModel.this.hideContentInfo();
                        VastInterstitialViewModel.this.mLoadCustomEndCardTracked = Boolean.TRUE;
                    } else {
                        VastInterstitialViewModel.this.mLoadDefaultEndCardTracked = Boolean.TRUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(Reporting.Key.IS_CUSTOM_END_CARD, bool.booleanValue());
                    VastInterstitialViewModel.this.sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.END_CARD_LOAD_SUCCESS, bundle);
                }
            } finally {
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastInterstitialViewModel.this.mCustomEndCardSkipTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastInterstitialViewModel.this.mDefaultEndCardSkipTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastInterstitialViewModel.this.mAdEventTracker.trackCustomEndcardEvent(2, null);
                } else {
                    VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
                    vastInterstitialViewModel.mDefaultEndCardSkipTracked = Boolean.TRUE;
                    vastInterstitialViewModel.mAdEventTracker.trackCompanionAdEvent(2, null);
                }
                VastInterstitialViewModel vastInterstitialViewModel2 = VastInterstitialViewModel.this;
                vastInterstitialViewModel2.invokeOnEndCardSkipped(vastInterstitialViewModel2.mDefaultEndCardSkipTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplay() {
            VastInterstitialViewModel.this.mReady = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplayFinish() {
            VastInterstitialViewModel.this.mReady = false;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed(int i10) {
            VastInterstitialViewModel vastInterstitialViewModel = VastInterstitialViewModel.this;
            if (vastInterstitialViewModel.mIsSkippable) {
                i10 = 100;
            }
            vastInterstitialViewModel.dismissVideo(i10);
            VastInterstitialViewModel.this.dismiss();
        }
    }

    public VastInterstitialViewModel(Context context, String str, String str2, int i10, long j10, InterstitialActivityInteractor interstitialActivityInteractor) {
        super(context, str, str2, i10, j10, interstitialActivityInteractor);
        this.mReady = false;
        this.mHasEndCard = false;
        this.mIsVideoFinished = false;
        Boolean bool = Boolean.FALSE;
        this.mDefaultEndCardClickTracked = bool;
        this.mCustomEndCardClickTracked = bool;
        this.mCustomCTAClickTrackedEvents = new ArrayList();
        this.mDefaultEndCardImpressionTracked = bool;
        this.mCustomEndCardImpressionTracked = bool;
        this.mLoadDefaultEndCardTracked = bool;
        this.mLoadCustomEndCardTracked = bool;
        this.mLoadEndCardFailTracked = bool;
        this.mCustomCTAImpressionTracked = bool;
        this.mDefaultEndCardSkipTracked = bool;
        this.mCustomEndCardSkipTracked = bool;
        this.mCustomEndCardCloseTracked = bool;
        this.mDefaultEndCardCloseTracked = bool;
        this.mIsAdPausedBeforeRender = false;
        this.mVideoAdListener = new AnonymousClass1();
        this.mCloseButtonListener = new CloseButtonListener() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.d
            @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
            public final void onCloseButtonVisible() {
                VastInterstitialViewModel.d(this.f95862a);
            }
        };
        initiateCustomCTAAdTrackers();
        initiateEventTrackers();
        processInterstitialAd();
        interstitialActivityInteractor.setContentLayout();
        initVolumeTracker();
    }

    public static /* synthetic */ void d(VastInterstitialViewModel vastInterstitialViewModel) {
        vastInterstitialViewModel.mIsVideoFinished = true;
        vastInterstitialViewModel.mIsSkippable = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissVideo(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("pn_video_progress", i10);
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_DISMISS, bundle);
    }

    private void initVolumeTracker() {
        VolumeObserver.getInstance().setListener(this);
    }

    private void initiateCustomCTAAdTrackers() {
        if (this.mAd != null) {
            this.mCustomCTATracker = new AdTracker(this.mAd.getBeacons("custom_cta_show"), this.mAd.getBeacons("custom_cta_click"), false);
            this.mCustomCTAEndCardTracker = new AdTracker(null, this.mAd.getBeacons("custom_cta_endcard_click"), false);
        }
    }

    private void initiateEventTrackers() {
        if (this.mAd != null) {
            this.mAdEventTracker = new AdTracker(null, null, null, this.mAd.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), this.mAd.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT));
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void closeButtonClicked() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd == null) {
            return;
        }
        if (!this.mIsVideoFinished) {
            videoAd.skip();
            return;
        }
        videoAd.closeVideo();
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void destroyAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.destroy();
            this.mIsAdPausedBeforeRender = false;
            this.mReady = false;
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public View getAdView() {
        if (this.mAd == null) {
            return null;
        }
        VideoAdView videoAdView = new VideoAdView(this.mContext);
        this.mVideoPlayer = videoAdView;
        return videoAdView;
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public Boolean hasReducedCloseSize() {
        return Boolean.FALSE;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.SHOW);
    }

    @Override // net.pubnative.lite.sdk.vpaid.volume.VolumeObserver.VolumeChangeListener
    public void onVolumeChanged() {
        this.mVideoAd.onVolumeChanged();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void pauseAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            boolean z10 = this.mReady;
            if (!z10) {
                this.mIsAdPausedBeforeRender = true;
            }
            if (z10 && videoAd.isAdStarted()) {
                this.mVideoAd.pause();
            }
            if (this.mIsVideoFinished) {
                this.mVideoAd.pauseEndCardCloseButtonTimer();
            }
        }
    }

    public void renderVastAd() {
        VastInterstitialViewModel vastInterstitialViewModel;
        try {
            try {
                if (this.mAd == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("pn_video_progress", 0);
                    sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.ERROR);
                    sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle);
                    sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
                    this.mListener.finishActivity();
                    return;
                }
                this.mIsSkippable = this.mSkipOffset == 0;
                if (this.mVideoAd == null) {
                    vastInterstitialViewModel = this;
                    VideoAd videoAd = new VideoAd(this.mContext, this.mAd, true, true, vastInterstitialViewModel, this);
                    vastInterstitialViewModel.mVideoAd = videoAd;
                    videoAd.useMobileNetworkForCaching(true);
                } else {
                    vastInterstitialViewModel = this;
                }
                vastInterstitialViewModel.mVideoAd.bindView(vastInterstitialViewModel.mVideoPlayer);
                vastInterstitialViewModel.mVideoAd.setAdListener(vastInterstitialViewModel.mVideoAdListener);
                vastInterstitialViewModel.mVideoAd.setAdCloseButtonListener(vastInterstitialViewModel.mCloseButtonListener);
                vastInterstitialViewModel.mListener.showProgressBar();
                VideoAdCacheItem videoAdCacheItemRemove = HyBid.getVideoAdCache().remove(vastInterstitialViewModel.mZoneId);
                vastInterstitialViewModel.mAdCacheItem = videoAdCacheItemRemove;
                if (videoAdCacheItemRemove != null) {
                    if (videoAdCacheItemRemove.getAdParams() != null) {
                        vastInterstitialViewModel.mAdCacheItem.getAdParams().setPublisherSkipSeconds(vastInterstitialViewModel.mSkipOffset);
                        if (vastInterstitialViewModel.mAdCacheItem.getEndCardData() != null && !TextUtils.isEmpty(vastInterstitialViewModel.mAdCacheItem.getEndCardData().getContent())) {
                            vastInterstitialViewModel.mHasEndCard = AdEndCardManager.isEndCardEnabled(vastInterstitialViewModel.mAd).booleanValue();
                        } else if (vastInterstitialViewModel.mAd.isEndCardEnabled() != null && vastInterstitialViewModel.mAd.isEndCardEnabled().booleanValue() && vastInterstitialViewModel.mAd.isCustomEndCardEnabled() != null && vastInterstitialViewModel.mAd.isCustomEndCardEnabled().booleanValue() && vastInterstitialViewModel.mAd.hasCustomEndCard()) {
                            vastInterstitialViewModel.mHasEndCard = true;
                        }
                        if (vastInterstitialViewModel.mAdCacheItem.getAdParams().getAdIcon() != null) {
                            setupContentInfo(vastInterstitialViewModel.mAdCacheItem.getAdParams().getAdIcon());
                        } else {
                            setupContentInfo(null);
                        }
                    }
                    vastInterstitialViewModel.mVideoAd.setVideoCacheItem(vastInterstitialViewModel.mAdCacheItem);
                } else {
                    setupContentInfo(null);
                }
                vastInterstitialViewModel.mVideoPlayer.postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.interstitial.viewModel.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastInterstitialViewModel vastInterstitialViewModel2 = this.f95861b;
                        vastInterstitialViewModel2.mVideoAd.load(vastInterstitialViewModel2.mIntegrationType);
                    }
                }, 1000L);
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Logger.e(TAG, e.getMessage());
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pn_video_progress", 0);
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.ERROR);
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.VIDEO_ERROR, bundle2);
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void resetVolumeChangeTracker() {
        VolumeObserver.getInstance().reset();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void resumeAd() {
        VideoAd videoAd;
        if (isFeedbackFormOpen() || (videoAd = this.mVideoAd) == null) {
            return;
        }
        if (this.mReady) {
            if (videoAd.isAdStarted()) {
                this.mVideoAd.resume();
            } else {
                this.mListener.hideProgressBar();
                this.mIsAdPausedBeforeRender = false;
                this.mVideoAd.show();
            }
        }
        if (this.mIsVideoFinished) {
            this.mVideoAd.resumeEndCardCloseButtonTimer();
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public boolean shouldShowContentInfo() {
        return true;
    }

    @Override // net.pubnative.lite.sdk.vpaid.AdCloseButtonListener
    public void showButton() {
        if (!this.mHasEndCard) {
            this.mIsSkippable = true;
        }
        this.mListener.showInterstitialCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void skipButtonClicked() {
    }
}
