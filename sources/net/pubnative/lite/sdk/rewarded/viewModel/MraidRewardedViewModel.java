package net.pubnative.lite.sdk.rewarded.viewModel;

import android.content.Context;
import android.view.View;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.mraid.model.HTMLAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.RewardedActivityInteractor;
import net.pubnative.lite.sdk.utils.ClickThroughTimerManager;

/* JADX INFO: loaded from: classes3.dex */
public class MraidRewardedViewModel extends RewardedViewModel implements MRAIDViewListener, MRAIDNativeFeatureListener, MRAIDViewCloseLayoutListener, ClickThroughTimerManager.ClickThroughTimerListener {
    private boolean mCustomCTAClickTracked;
    private boolean mCustomCTAImpressionTracked;
    private boolean mCustomEndCardClickTracked;
    private boolean mCustomEndCardCloseTracked;
    private boolean mCustomEndCardImpressionTracked;
    private boolean mLoadCustomEndCardTracked;
    private final String[] mSupportedNativeFeatures;
    private MRAIDBanner mView;

    public MraidRewardedViewModel(Context context, String str, String str2, int i10, long j10, RewardedActivityInteractor rewardedActivityInteractor) {
        super(context, str, str2, i10, j10, rewardedActivityInteractor);
        this.mSupportedNativeFeatures = new String[]{MRAIDNativeFeature.CALENDAR, MRAIDNativeFeature.INLINE_VIDEO, MRAIDNativeFeature.SMS, MRAIDNativeFeature.STORE_PICTURE, MRAIDNativeFeature.TEL, "location"};
        this.mLoadCustomEndCardTracked = false;
        this.mCustomEndCardImpressionTracked = false;
        this.mCustomEndCardCloseTracked = false;
        this.mCustomEndCardClickTracked = false;
        this.mCustomCTAImpressionTracked = false;
        this.mCustomCTAClickTracked = false;
        processRewardedAd();
        rewardedActivityInteractor.setContentLayout();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void closeButtonClicked() {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLOSE);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void destroyAd() {
        MRAIDBanner mRAIDBanner = this.mView;
        if (mRAIDBanner != null) {
            mRAIDBanner.stopAdSession();
            this.mView.destroy();
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public View getAdView() {
        MraidRewardedViewModel mraidRewardedViewModel;
        Ad ad2 = this.mAd;
        MRAIDBanner mRAIDBanner = null;
        if (ad2 != null) {
            if (ad2.getAssetUrl(APIAsset.HTML_BANNER) != null) {
                mraidRewardedViewModel = this;
                mRAIDBanner = new MRAIDBanner(this.mContext, this.mAd.getAssetUrl(APIAsset.HTML_BANNER), "", Boolean.TRUE, Boolean.FALSE, this.mSupportedNativeFeatures, mraidRewardedViewModel, this, getContentInfoContainer());
            } else {
                mraidRewardedViewModel = this;
                if (mraidRewardedViewModel.mAd.getAssetHtml(APIAsset.HTML_BANNER) != null) {
                    MRAIDBanner mRAIDBanner2 = new MRAIDBanner(mraidRewardedViewModel.mContext, "", mraidRewardedViewModel.mAd.getAssetHtml(APIAsset.HTML_BANNER), Boolean.TRUE, Boolean.FALSE, mraidRewardedViewModel.mSupportedNativeFeatures, mraidRewardedViewModel, this, getContentInfoContainer());
                    mraidRewardedViewModel = mraidRewardedViewModel;
                    mRAIDBanner = mRAIDBanner2;
                }
            }
            if (mRAIDBanner != null) {
                HTMLAd hTMLAd = new HTMLAd(mraidRewardedViewModel.mContext, mraidRewardedViewModel.mAd, HTMLAd.AdType.REWARDED);
                mraidRewardedViewModel.htmlAd = hTMLAd;
                hTMLAd.setLink(mraidRewardedViewModel.mAd.getLink());
                mraidRewardedViewModel.htmlAd.setClickThroughTimerListener(this);
                mRAIDBanner.setCloseLayoutListener(this);
                Integer skipDelay = mraidRewardedViewModel.htmlAd.getSkipDelay();
                mraidRewardedViewModel.mIsSkippable = skipDelay != null && skipDelay.intValue() == 0;
                mRAIDBanner.setHtmlAd(mraidRewardedViewModel.htmlAd);
            }
        } else {
            mraidRewardedViewModel = this;
        }
        mraidRewardedViewModel.mView = mRAIDBanner;
        return mRAIDBanner;
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean hasReducedCloseSize() {
        return this.htmlAd.hasReducedCloseSize();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
        RewardedActivityInteractor rewardedActivityInteractor = this.mListener;
        if (rewardedActivityInteractor != null) {
            rewardedActivityInteractor.hideRewardedCloseButton();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
        this.mListener.hideRewardedSkipButton();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLICK);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLICK);
        handleURL(str);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.CLICK);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
        this.mIsSkippable = true;
        this.mListener.showRewardedCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
        this.mListener.showRewardedSkipButton(this.mSkipListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.ERROR);
        dismiss();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.OPEN);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
        return true;
    }

    @Override // net.pubnative.lite.sdk.utils.ClickThroughTimerManager.ClickThroughTimerListener
    public void onClickThroughTriggered() {
        this.mAdTracker.trackClick();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener
    public void onClose() {
        dismiss();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_cta_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        if (this.mCustomCTAClickTracked) {
            return;
        }
        this.mCustomCTATracker.trackClick();
        this.mCustomCTAClickTracked = true;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.setEventType("custom_cta_show");
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        if (this.mCustomCTAImpressionTracked) {
            return;
        }
        this.mCustomCTATracker.trackImpression();
        this.mCustomCTAImpressionTracked = true;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
        if (this.mCustomEndCardClickTracked) {
            return;
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_endcard_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        this.mAdTracker.trackClick();
        this.mCustomEndcardTracker.trackClick();
        this.mAdEventTracker.trackCustomEndcardEvent(4, null);
        this.mCustomEndCardClickTracked = true;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
        if (this.mCustomEndCardCloseTracked) {
            return;
        }
        this.mCustomEndCardCloseTracked = true;
        this.mAdEventTracker.trackCustomEndcardEvent(3, null);
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setEventType(Reporting.EventType.CUSTOM_ENDCARD_CLOSE);
        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        reportingEvent.setEventType(Reporting.EventType.CUSTOM_END_CARD_LOAD_FAILURE);
        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
        if (this.mLoadCustomEndCardTracked) {
            return;
        }
        this.mLoadCustomEndCardTracked = true;
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        reportingEvent.setEventType(Reporting.EventType.CUSTOM_END_CARD_LOAD_SUCCESS);
        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
        if (this.mCustomEndCardImpressionTracked) {
            return;
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            Ad ad2 = this.mAd;
            if (ad2 != null) {
                reportingEvent.setImpId(ad2.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.setEventType("custom_endcard_impression");
            reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, str);
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        this.mCustomEndcardTracker.trackImpression();
        this.mAdEventTracker.trackCustomEndcardEvent(1, null);
        this.mCustomEndCardImpressionTracked = true;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener
    public void onRemoveCloseLayout() {
        this.mListener.hideRewardedCloseButton();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener
    public void onShowCloseLayout() {
        this.mIsSkippable = true;
        this.mListener.showRewardedCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void pauseAd() {
        MRAIDBanner mRAIDBanner = this.mView;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void resetVolumeChangeTracker() {
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void resumeAd() {
        MRAIDBanner mRAIDBanner;
        if (isFeedbackFormOpen() || (mRAIDBanner = this.mView) == null) {
            return;
        }
        mRAIDBanner.resume();
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public boolean shouldShowContentInfo() {
        return false;
    }

    @Override // net.pubnative.lite.sdk.rewarded.viewModel.RewardedViewModel
    public void skipButtonClicked() {
        sendBroadcast(HyBidRewardedBroadcastReceiver.Action.PLAYABLE_SKIP_CLICK);
        this.mView.skipButtonClicked();
    }
}
