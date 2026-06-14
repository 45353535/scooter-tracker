package net.pubnative.lite.sdk.vpaid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdAudioStateManager;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityFriendlyObstruction;
import net.pubnative.lite.sdk.vpaid.enums.AudioState;
import net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class VideoAd extends BaseVideoAd {
    private static final String LOG_TAG = "VideoAd";
    private volatile VideoAdView mBannerView;
    private boolean mIsAdStarted;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.vpaid.VideoAd$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$vpaid$enums$AudioState;

        static {
            int[] iArr = new int[AudioState.values().length];
            $SwitchMap$net$pubnative$lite$sdk$vpaid$enums$AudioState = iArr;
            try {
                iArr[AudioState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$enums$AudioState[AudioState.MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$enums$AudioState[AudioState.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VideoAd(Context context, Ad ad2, boolean z10, boolean z11, AdPresenter.ImpressionListener impressionListener) {
        super(context, ad2, z10, z11, impressionListener, null);
        this.mIsAdStarted = false;
    }

    public static /* synthetic */ void m(VideoAd videoAd) {
        videoAd.getClass();
        String str = LOG_TAG;
        Logger.d(str, "Video will be dismissed");
        if (videoAd.getAdState() != 202) {
            Logger.e(str, "Can't dismiss ad, it's not displaying");
            return;
        }
        if (videoAd.mBannerView != null) {
            videoAd.mBannerView.setVisibility(8);
            videoAd.mBannerView.removeAllViews();
        }
        if (videoAd.getAdController() != null) {
            videoAd.getAdController().dismiss();
        }
        videoAd.onBannerHide();
    }

    private void onBannerHide() {
        Logger.d(LOG_TAG, "Ad disappeared from screen");
        setReady();
        setAdState(200);
        if (getAdListener() != null) {
            getAdListener().onAdDismissed(getAdController().getProgress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateAudioState() {
        int i10 = AnonymousClass2.$SwitchMap$net$pubnative$lite$sdk$vpaid$enums$AudioState[AdAudioStateManager.getAudioState(getAd(), this.isFullscreen).ordinal()];
        if (i10 == 1 || i10 == 2 || (i10 == 3 && Utils.isPhoneMuted(getContext()))) {
            getAdController().toggleMute();
        }
    }

    public void bindView(VideoAdView videoAdView) {
        if (videoAdView == null) {
            Logger.e(LOG_TAG, "Bind view is null");
            return;
        }
        Logger.d(LOG_TAG, "Bind view (visibility: " + videoAdView.getVisibility() + ")");
        this.mBannerView = videoAdView;
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ void clearCache() {
        super.clearCache();
    }

    public void closeVideo() {
        getAdController().closeSelf();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public void dismiss() {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.f
            @Override // java.lang.Runnable
            public final void run() {
                VideoAd.m(this.f96063b);
            }
        });
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    int getAdFormat() {
        return 1000;
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    AdSpotDimensions getAdSpotDimensions() {
        if (this.mBannerView != null) {
            return new AdSpotDimensions(this.mBannerView.getWidth(), this.mBannerView.getHeight());
        }
        return null;
    }

    public boolean isAdStarted() {
        return this.mIsAdStarted;
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ Boolean isInterstitial() {
        return super.isInterstitial();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ boolean isRewarded() {
        return super.isRewarded();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ void load(IntegrationType integrationType) {
        super.load(integrationType);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void onAdFinishedReplaying() {
        super.onAdFinishedReplaying();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void onAdReplaying() {
        super.onAdReplaying();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void onEndCardClosed(Boolean bool) {
        super.onEndCardClosed(bool);
    }

    public void onVolumeChanged() {
        if (getAdController() != null) {
            getAdController().onVolumeChanged();
        }
    }

    public void pause() {
        if (getAdController() != null) {
            getAdController().pause();
        }
    }

    public void pauseEndCardCloseButtonTimer() {
        Logger.d(LOG_TAG, "pause End Card Timer");
        if (getAdController() != null) {
            getAdController().pauseEndCardCloseButtonTimer();
        }
    }

    public void resume() {
        if (getAdController() == null || !isReady()) {
            return;
        }
        getAdController().resume();
    }

    public void resumeEndCardCloseButtonTimer() {
        Logger.d(LOG_TAG, "resume End Card Timer");
        if (getAdController() != null) {
            getAdController().resumeEndCardCloseButtonTimer();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        super.setAdCloseButtonListener(closeButtonListener);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void setAdListener(VideoAdListener videoAdListener) {
        super.setAdListener(videoAdListener);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ void setDebugMode(boolean z10) {
        super.setDebugMode(z10);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd, net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void setRewarded(boolean z10) {
        super.setRewarded(z10);
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal
    public /* bridge */ /* synthetic */ void setVideoCacheItem(VideoAdCacheItem videoAdCacheItem) {
        super.setVideoCacheItem(videoAdCacheItem);
    }

    public void show() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.VideoAd.1
            @Override // java.lang.Runnable
            public void run() {
                VideoAd.this.runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.VideoAd.1.1
                    private void showAd() {
                        String str = VideoAd.LOG_TAG;
                        Logger.d(str, "Banner did start showing ad");
                        if (VideoAd.this.getAdState() == 202) {
                            Logger.d(str, "Banner already displays on screen");
                            return;
                        }
                        if (!VideoAd.this.isReady() || VideoAd.this.mBannerView == null) {
                            Logger.e(str, "Banner is not ready");
                        } else {
                            VideoAd.this.setAdState(202);
                            VideoAd.this.stopExpirationTimer();
                            if (VideoAd.this.getAdController() != null) {
                                synchronized (this) {
                                    try {
                                        if (VideoAd.this.getAdController() != null && VideoAd.this.getAdController().getAdParams() != null) {
                                            VideoAd.this.getViewabilityAdSession().initAdSession(VideoAd.this.mBannerView, VideoAd.this.getAdController().getAdParams().getVerificationScriptResources());
                                            VideoAd.this.getAdController().buildVideoAdView(VideoAd.this.mBannerView);
                                            for (HyBidViewabilityFriendlyObstruction hyBidViewabilityFriendlyObstruction : VideoAd.this.getAdController().getViewabilityFriendlyObstructions()) {
                                                VideoAd.this.getViewabilityAdSession().addFriendlyObstruction(hyBidViewabilityFriendlyObstruction.getView(), hyBidViewabilityFriendlyObstruction.getPurpose(), hyBidViewabilityFriendlyObstruction.getReason());
                                            }
                                            VideoAd.this.getViewabilityAdSession().fireLoaded();
                                            VideoAd.this.getAdController().playAd();
                                            VideoAd.this.validateAudioState();
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                Logger.e(str, "getAdController() is null and can not set attributes to banner view ");
                                if (VideoAd.this.getAdListener() != null) {
                                    VideoAd.this.getAdListener().onAdLoadFail(new PlayerInfo("getAdController() is null and can not set attributes to banner view "));
                                }
                            }
                        }
                        VideoAd.this.mIsAdStarted = true;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        showAd();
                    }
                });
            }
        }, 500L);
    }

    public void skip() {
        getAdController().skipVideo();
    }

    @Override // net.pubnative.lite.sdk.vpaid.BaseVideoAd
    public /* bridge */ /* synthetic */ void useMobileNetworkForCaching(boolean z10) {
        super.useMobileNetworkForCaching(z10);
    }

    public VideoAd(Context context, Ad ad2, boolean z10, boolean z11, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) {
        super(context, ad2, z10, z11, impressionListener, adCloseButtonListener);
        this.mIsAdStarted = false;
    }
}
