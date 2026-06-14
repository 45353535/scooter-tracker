package net.pubnative.lite.sdk.rewarded.viewModel;

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
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor;
import net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel;
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
public class VastRewardedViewModel extends RewardedViewModel implements AdPresenter.ImpressionListener, AdCloseButtonListener, VolumeObserver.VolumeChangeListener {
    private static final String TAG = "VastRewardedViewModel";
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

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel$1, reason: invalid class name */
    class AnonymousClass1 extends VideoAdListener {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.mIsSkippable = true;
            vastRewardedViewModel.mListener.showRewardedCloseButton(vastRewardedViewModel.mCloseListener);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdClicked() {
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLICK);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
            VastRewardedViewModel.this.mHasEndCard = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.mReady = false;
            vastRewardedViewModel.mIsVideoFinished = true;
            if (!vastRewardedViewModel.mHasEndCard) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastRewardedViewModel.AnonymousClass1.a(this.f95963b);
                    }
                }, 100L);
            }
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_FINISH);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastRewardedViewModel.this.mListener.hideProgressBar();
            Bundle bundle = new Bundle();
            bundle.putInt("pn_video_progress", 0);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
            VastRewardedViewModel.this.mListener.finishActivity();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            if (vastRewardedViewModel.mReady) {
                return;
            }
            vastRewardedViewModel.mReady = true;
            vastRewardedViewModel.mListener.hideProgressBar();
            VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
            if (vastRewardedViewModel2.mIsAdPausedBeforeRender) {
                return;
            }
            vastRewardedViewModel2.mVideoAd.show();
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onAdSkipped() {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.mIsVideoFinished = true;
            vastRewardedViewModel.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_SKIP);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdStarted() {
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_START);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z10) {
            String str = z10 ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastRewardedViewModel.this.mCustomCTAClickTrackedEvents.contains(str)) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.invokeOnCustomCTAClick(str, vastRewardedViewModel.mAd, "fullscreen");
            if (str.equals("custom_cta_endcard_click")) {
                AdTracker adTracker = VastRewardedViewModel.this.mCustomCTAEndCardTracker;
                if (adTracker != null) {
                    adTracker.trackClick();
                }
            } else {
                AdTracker adTracker2 = VastRewardedViewModel.this.mCustomCTATracker;
                if (adTracker2 != null) {
                    adTracker2.trackClick();
                }
            }
            VastRewardedViewModel.this.mCustomCTAClickTrackedEvents.add(str);
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastRewardedViewModel.this.mCustomCTAImpressionTracked.booleanValue()) {
                return;
            }
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            vastRewardedViewModel.invokeOnCustomCTAShow(vastRewardedViewModel.mAd, "fullscreen");
            AdTracker adTracker = VastRewardedViewModel.this.mCustomCTATracker;
            if (adTracker != null) {
                adTracker.trackImpression();
            }
            VastRewardedViewModel.this.mCustomCTAImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastRewardedViewModel.this.mCustomEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString("click", str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.mCustomEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastRewardedViewModel.this.mCustomEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CUSTOM_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.mCustomEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastRewardedViewModel.this.mDefaultEndCardClickTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_CLICK, bundle);
            VastRewardedViewModel.this.mDefaultEndCardClickTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastRewardedViewModel.this.mDefaultEndCardImpressionTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Reporting.Key.END_CARD_TYPE, str);
            bundle.putString(Reporting.Key.CLICK_SOURCE_TYPE, Reporting.Key.CLICK_SOURCE_TYPE_END_CARD);
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.DEFAULT_END_CARD_SHOW, bundle);
            VastRewardedViewModel.this.mDefaultEndCardImpressionTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.mCustomEndCardCloseTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.mDefaultEndCardCloseTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.mCustomEndCardCloseTracked = Boolean.TRUE;
                    vastRewardedViewModel.mAdEventTracker.trackCustomEndcardEvent(3, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                    vastRewardedViewModel2.mDefaultEndCardCloseTracked = Boolean.TRUE;
                    vastRewardedViewModel2.mAdEventTracker.trackCompanionAdEvent(3, null);
                }
                VastRewardedViewModel vastRewardedViewModel3 = VastRewardedViewModel.this;
                vastRewardedViewModel3.invokeOnEndCardClosed(vastRewardedViewModel3.mDefaultEndCardCloseTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (VastRewardedViewModel.this.mLoadEndCardFailTracked.booleanValue()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(Reporting.Key.IS_CUSTOM_END_CARD, bool.booleanValue());
            VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.END_CARD_LOAD_FAILURE, bundle);
            VastRewardedViewModel.this.mLoadEndCardFailTracked = Boolean.TRUE;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastRewardedViewModel.this.mLoadCustomEndCardTracked.booleanValue()) && (bool.booleanValue() || !VastRewardedViewModel.this.mLoadDefaultEndCardTracked.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastRewardedViewModel.this.hideContentInfo();
                        VastRewardedViewModel.this.mLoadCustomEndCardTracked = Boolean.TRUE;
                    } else {
                        VastRewardedViewModel.this.mLoadDefaultEndCardTracked = Boolean.TRUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(Reporting.Key.IS_CUSTOM_END_CARD, bool.booleanValue());
                    VastRewardedViewModel.this.sendBroadcast(HyBidRewardedBroadcastReceiver.Action.END_CARD_LOAD_SUCCESS, bundle);
                }
            } finally {
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastRewardedViewModel.this.mCustomEndCardSkipTracked.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastRewardedViewModel.this.mDefaultEndCardSkipTracked.booleanValue()) {
                if (bool.booleanValue()) {
                    VastRewardedViewModel.this.mAdEventTracker.trackCustomEndcardEvent(2, null);
                } else {
                    VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
                    vastRewardedViewModel.mDefaultEndCardSkipTracked = Boolean.TRUE;
                    vastRewardedViewModel.mAdEventTracker.trackCompanionAdEvent(2, null);
                }
                VastRewardedViewModel vastRewardedViewModel2 = VastRewardedViewModel.this;
                vastRewardedViewModel2.invokeOnEndCardSkipped(vastRewardedViewModel2.mDefaultEndCardSkipTracked);
            }
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplay() {
            VastRewardedViewModel.this.mReady = true;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onReplayFinish() {
            VastRewardedViewModel.this.mReady = false;
        }

        @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
        public void onAdDismissed(int i10) {
            VastRewardedViewModel vastRewardedViewModel = VastRewardedViewModel.this;
            if (vastRewardedViewModel.mIsSkippable) {
                i10 = 100;
            }
            vastRewardedViewModel.dismissVideo(i10);
            VastRewardedViewModel.this.dismiss();
        }
    }

    public VastRewardedViewModel(Context context, String str, String str2, int i10, long j10, RewardedActivityInteractor rewardedActivityInteractor) {
        super(context, str, str2, i10, j10, rewardedActivityInteractor);
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
        this.mCloseButtonListener = new CloseButtonListener() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.d
            @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
            public final void onCloseButtonVisible() {
                VastRewardedViewModel.d(this.f95962a);
            }
        };
        initiateCustomCTAAdTrackers();
        initiateEventTrackers();
        processRewardedAd();
        rewardedActivityInteractor.setContentLayout();
        initVolumeTracker();
    }

    public static /* synthetic */ void d(VastRewardedViewModel vastRewardedViewModel) {
        vastRewardedViewModel.mIsVideoFinished = true;
        vastRewardedViewModel.mIsSkippable = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissVideo(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("pn_video_progress", i10);
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_DISMISS, bundle);
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

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
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
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void destroyAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.destroy();
            this.mIsAdPausedBeforeRender = false;
            this.mReady = false;
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public View getAdView() {
        if (this.mAd == null) {
            return null;
        }
        VideoAdView videoAdView = new VideoAdView(this.mContext);
        this.mVideoPlayer = videoAdView;
        return videoAdView;
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean hasReducedCloseSize() {
        return false;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.OPEN);
    }

    @Override // net.pubnative.lite.sdk.vpaid.volume.VolumeObserver.VolumeChangeListener
    public void onVolumeChanged() {
        this.mVideoAd.onVolumeChanged();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
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
        VastRewardedViewModel vastRewardedViewModel;
        try {
            try {
                if (this.mAd == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("pn_video_progress", 0);
                    sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
                    sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle);
                    sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
                    this.mListener.finishActivity();
                    return;
                }
                this.mIsSkippable = this.mSkipOffset == 0;
                if (this.mVideoAd == null) {
                    vastRewardedViewModel = this;
                    VideoAd videoAd = new VideoAd(this.mContext, this.mAd, true, true, vastRewardedViewModel, this);
                    vastRewardedViewModel.mVideoAd = videoAd;
                    videoAd.useMobileNetworkForCaching(true);
                } else {
                    vastRewardedViewModel = this;
                }
                vastRewardedViewModel.mVideoAd.bindView(vastRewardedViewModel.mVideoPlayer);
                vastRewardedViewModel.mVideoAd.setRewarded(true);
                vastRewardedViewModel.mVideoAd.setAdListener(vastRewardedViewModel.mVideoAdListener);
                vastRewardedViewModel.mVideoAd.setAdCloseButtonListener(vastRewardedViewModel.mCloseButtonListener);
                vastRewardedViewModel.mListener.showProgressBar();
                VideoAdCacheItem videoAdCacheItemRemove = HyBid.getVideoAdCache().remove(vastRewardedViewModel.mZoneId);
                vastRewardedViewModel.mAdCacheItem = videoAdCacheItemRemove;
                if (videoAdCacheItemRemove != null) {
                    if (videoAdCacheItemRemove.getAdParams() != null) {
                        vastRewardedViewModel.mAdCacheItem.getAdParams().setPublisherSkipSeconds(vastRewardedViewModel.mSkipOffset);
                        if (vastRewardedViewModel.mAdCacheItem.getEndCardData() != null && !TextUtils.isEmpty(vastRewardedViewModel.mAdCacheItem.getEndCardData().getContent())) {
                            vastRewardedViewModel.mHasEndCard = AdEndCardManager.isEndCardEnabled(vastRewardedViewModel.mAd).booleanValue();
                        } else if (vastRewardedViewModel.mAd.isEndCardEnabled() != null && vastRewardedViewModel.mAd.isEndCardEnabled().booleanValue() && vastRewardedViewModel.mAd.isCustomEndCardEnabled() != null && vastRewardedViewModel.mAd.isCustomEndCardEnabled().booleanValue() && vastRewardedViewModel.mAd.hasCustomEndCard()) {
                            vastRewardedViewModel.mHasEndCard = true;
                        }
                        if (vastRewardedViewModel.mAdCacheItem.getAdParams().getAdIcon() != null) {
                            setupContentInfo(vastRewardedViewModel.mAdCacheItem.getAdParams().getAdIcon());
                        } else {
                            setupContentInfo(null);
                        }
                    }
                    vastRewardedViewModel.mVideoAd.setVideoCacheItem(vastRewardedViewModel.mAdCacheItem);
                } else {
                    setupContentInfo(null);
                }
                vastRewardedViewModel.mVideoPlayer.postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.viewModel.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        VastRewardedViewModel vastRewardedViewModel2 = this.f95961b;
                        vastRewardedViewModel2.mVideoAd.load(vastRewardedViewModel2.mIntegrationType);
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
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.VIDEO_ERROR, bundle2);
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void resetVolumeChangeTracker() {
        VolumeObserver.getInstance().reset();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
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

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean shouldShowContentInfo() {
        return true;
    }

    @Override // net.pubnative.lite.sdk.vpaid.AdCloseButtonListener
    public void showButton() {
        if (!this.mHasEndCard) {
            this.mIsSkippable = true;
        }
        this.mListener.showRewardedCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void skipButtonClicked() {
    }
}
