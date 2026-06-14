package net.pubnative.lite.sdk.interstitial.viewModel;

import android.content.Context;
import android.view.View;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.InterstitialActivityInteractor;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.mraid.model.HTMLAd;
import net.pubnative.lite.sdk.utils.ClickThroughTimerManager;

/* JADX INFO: loaded from: classes3.dex */
public class MraidInterstitialViewModel extends InterstitialViewModel implements MRAIDViewListener, MRAIDNativeFeatureListener, MRAIDViewCloseLayoutListener, ClickThroughTimerManager.ClickThroughTimerListener {
    private boolean mCustomCTAClickTracked;
    private boolean mCustomCTAImpressionTracked;
    private boolean mCustomEndCardClickTracked;
    private boolean mCustomEndCardCloseTracked;
    private boolean mCustomEndCardImpressionTracked;
    private boolean mLoadCustomEndCardTracked;
    private final String[] mSupportedNativeFeatures;
    private MRAIDBanner mView;

    public MraidInterstitialViewModel(Context context, String str, String str2, int i10, long j10, InterstitialActivityInteractor interstitialActivityInteractor) {
        super(context, str, str2, i10, j10, interstitialActivityInteractor);
        this.mSupportedNativeFeatures = new String[]{MRAIDNativeFeature.CALENDAR, MRAIDNativeFeature.INLINE_VIDEO, MRAIDNativeFeature.SMS, MRAIDNativeFeature.STORE_PICTURE, MRAIDNativeFeature.TEL, "location"};
        this.mLoadCustomEndCardTracked = false;
        this.mCustomEndCardImpressionTracked = false;
        this.mCustomEndCardCloseTracked = false;
        this.mCustomEndCardClickTracked = false;
        this.mCustomCTAImpressionTracked = false;
        this.mCustomCTAClickTracked = false;
        processInterstitialAd();
        interstitialActivityInteractor.setContentLayout();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void closeButtonClicked() {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.DISMISS);
        this.mListener.finishActivity();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void destroyAd() {
        MRAIDBanner mRAIDBanner = this.mView;
        if (mRAIDBanner != null) {
            mRAIDBanner.stopAdSession();
            this.mView.destroy();
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public View getAdView() {
        MraidInterstitialViewModel mraidInterstitialViewModel;
        Ad ad2 = this.mAd;
        MRAIDBanner mRAIDBanner = null;
        if (ad2 != null) {
            if (ad2.getAssetUrl(APIAsset.HTML_BANNER) != null) {
                mraidInterstitialViewModel = this;
                mRAIDBanner = new MRAIDBanner(this.mContext, this.mAd.getAssetUrl(APIAsset.HTML_BANNER), "", Boolean.TRUE, Boolean.FALSE, this.mSupportedNativeFeatures, mraidInterstitialViewModel, this, getContentInfoContainer());
            } else {
                mraidInterstitialViewModel = this;
                if (mraidInterstitialViewModel.mAd.getAssetHtml(APIAsset.HTML_BANNER) != null) {
                    MRAIDBanner mRAIDBanner2 = new MRAIDBanner(mraidInterstitialViewModel.mContext, "", mraidInterstitialViewModel.mAd.getAssetHtml(APIAsset.HTML_BANNER), Boolean.TRUE, Boolean.FALSE, mraidInterstitialViewModel.mSupportedNativeFeatures, mraidInterstitialViewModel, this, getContentInfoContainer());
                    mraidInterstitialViewModel = mraidInterstitialViewModel;
                    mRAIDBanner = mRAIDBanner2;
                }
            }
            if (mRAIDBanner != null) {
                HTMLAd hTMLAd = new HTMLAd(mraidInterstitialViewModel.mContext, mraidInterstitialViewModel.mAd, HTMLAd.AdType.INTERSTITIAL);
                mraidInterstitialViewModel.htmlAd = hTMLAd;
                hTMLAd.setLink(mraidInterstitialViewModel.mAd.getLink());
                mraidInterstitialViewModel.htmlAd.setClickThroughTimerListener(this);
                mRAIDBanner.setCloseLayoutListener(this);
                Integer skipDelay = mraidInterstitialViewModel.htmlAd.getSkipDelay();
                mraidInterstitialViewModel.mIsSkippable = skipDelay != null && skipDelay.intValue() == 0;
                mRAIDBanner.setHtmlAd(mraidInterstitialViewModel.htmlAd);
            }
        } else {
            mraidInterstitialViewModel = this;
        }
        mraidInterstitialViewModel.mView = mRAIDBanner;
        return mRAIDBanner;
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public Boolean hasReducedCloseSize() {
        return Boolean.valueOf(this.htmlAd.hasReducedCloseSize());
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
        InterstitialActivityInteractor interstitialActivityInteractor = this.mListener;
        if (interstitialActivityInteractor != null) {
            interstitialActivityInteractor.hideInterstitialCloseButton();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
        this.mListener.hideInterstitialSkipButton();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CLICK);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CLICK);
        handleURL(str);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.CLICK);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
        this.mIsSkippable = true;
        this.mListener.showInterstitialCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
        this.mIsSkippable = false;
        this.mListener.showInterstitialSkipButton(this.mSkipListener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.ERROR);
        dismiss();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.SHOW);
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
        this.mListener.hideInterstitialCloseButton();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewCloseLayoutListener
    public void onShowCloseLayout() {
        this.mIsSkippable = true;
        this.mListener.showInterstitialCloseButton(this.mCloseListener);
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void pauseAd() {
        MRAIDBanner mRAIDBanner = this.mView;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void resetVolumeChangeTracker() {
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void resumeAd() {
        MRAIDBanner mRAIDBanner;
        if (isFeedbackFormOpen() || (mRAIDBanner = this.mView) == null) {
            return;
        }
        mRAIDBanner.resume();
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public boolean shouldShowContentInfo() {
        return false;
    }

    @Override // net.pubnative.lite.sdk.interstitial.viewModel.InterstitialViewModel
    public void skipButtonClicked() {
        sendBroadcast(HyBidInterstitialBroadcastReceiver.Action.PLAYABLE_SKIP_CLICK);
        this.mView.skipButtonClicked();
    }
}
