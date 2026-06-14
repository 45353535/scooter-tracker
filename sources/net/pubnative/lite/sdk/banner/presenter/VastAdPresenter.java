package net.pubnative.lite.sdk.banner.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.contentinfo.AdFeedbackFormHelper;
import net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.ContentInfo;
import net.pubnative.lite.sdk.models.ContentInfoIconXPosition;
import net.pubnative.lite.sdk.models.ContentInfoIconYPosition;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.PositionX;
import net.pubnative.lite.sdk.models.PositionY;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.CheckUtils;
import net.pubnative.lite.sdk.utils.HybidConsumer;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.URLValidator;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.visibility.ImpressionTracker;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.VideoVisibilityListener;
import net.pubnative.lite.sdk.vpaid.VideoVisibilityManager;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class VastAdPresenter implements AdPresenter, ImpressionTracker.Listener, PNAPIContentInfoView.ContentInfoListener, VideoVisibilityListener {
    private static final String TAG = "VastAdPresenter";
    public boolean isLinkClickRunning;
    private final Ad mAd;
    private final CloseButtonListener mAdCloseButtonListener;
    private AdTracker mAdEventTracker;
    private AdSize mAdSize;
    private AdTracker mAdTracker;
    private View mContentInfo;
    private final Context mContext;
    private List<String> mCustomCTAClickTrackedEvents;
    private AdTracker mCustomCTAEndcardTracker;
    private Boolean mCustomCTAImpressionTracked;
    private AdTracker mCustomCTATracker;
    private Boolean mCustomEndCardClickTracked;
    private Boolean mCustomEndCardCloseTracked;
    private Boolean mCustomEndCardImpressionTracked;
    private Boolean mCustomEndCardSkipTracked;
    private AdTracker mCustomEndcardTracker;
    private Boolean mDefaultEndCardClickTracked;
    private Boolean mDefaultEndCardCloseTracked;
    private Boolean mDefaultEndCardImpressionTracked;
    private Boolean mDefaultEndCardSkipTracked;
    private AdPresenter.ImpressionListener mImpressionListener;
    private IntegrationType mIntegrationType;
    private boolean mIsDestroyed;
    private AdPresenter.Listener mListener;
    private Boolean mLoadCustomEndCardTracked;
    private Boolean mLoadDefaultEndCardTracked;
    private final ImpressionTracker.Listener mNativeTrackerListener;
    private ReportingController mReportingController;
    private final ImpressionTrackingMethod mTrackingMethod;
    private Icon mVastIcon;
    private VideoAd mVideoAd;
    private final VideoAdListener mVideoAdListener;
    private final AdPresenter.ImpressionListener mVideoImpressionListener;
    private VideoListener mVideoListener;
    private VideoAdView mVideoPlayer;
    private VideoVisibilityManager videoVisibilityManager;
    private boolean mLoaded = false;
    private boolean wasClicked = false;
    private boolean isFeedbackFormVisible = false;

    public VastAdPresenter(Context context, Ad ad2, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, IntegrationType integrationType) {
        Boolean bool = Boolean.FALSE;
        this.mDefaultEndCardClickTracked = bool;
        this.mCustomEndCardClickTracked = bool;
        this.mCustomCTAClickTrackedEvents = new ArrayList();
        this.mDefaultEndCardImpressionTracked = bool;
        this.mCustomEndCardImpressionTracked = bool;
        this.mLoadDefaultEndCardTracked = bool;
        this.mLoadCustomEndCardTracked = bool;
        this.mCustomCTAImpressionTracked = bool;
        this.mDefaultEndCardSkipTracked = bool;
        this.mCustomEndCardSkipTracked = bool;
        this.mDefaultEndCardCloseTracked = bool;
        this.mCustomEndCardCloseTracked = bool;
        this.mNativeTrackerListener = new ImpressionTracker.Listener() { // from class: net.pubnative.lite.sdk.banner.presenter.VastAdPresenter.1
            @Override // net.pubnative.lite.sdk.visibility.ImpressionTracker.Listener
            public void onImpression(View view) {
                VideoAd videoAd = VastAdPresenter.this.mVideoAd;
                if (videoAd != null) {
                    videoAd.show();
                }
            }
        };
        this.mVideoImpressionListener = new AdPresenter.ImpressionListener() { // from class: net.pubnative.lite.sdk.banner.presenter.VastAdPresenter.2
            @Override // net.pubnative.lite.sdk.presenter.AdPresenter.ImpressionListener
            public void onImpression() {
                AdPresenter.ImpressionListener impressionListener = VastAdPresenter.this.mImpressionListener;
                if (impressionListener != null) {
                    impressionListener.onImpression();
                }
            }
        };
        this.mAdCloseButtonListener = new CloseButtonListener() { // from class: net.pubnative.lite.sdk.banner.presenter.VastAdPresenter.3
            @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
            public void onCloseButtonVisible() {
            }
        };
        this.mVideoAdListener = new VideoAdListener() { // from class: net.pubnative.lite.sdk.banner.presenter.VastAdPresenter.4
            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdClicked() {
                VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                if (vastAdPresenter.mIsDestroyed) {
                    return;
                }
                AdPresenter.Listener listener = vastAdPresenter.mListener;
                if (listener != null) {
                    listener.onAdClicked(vastAdPresenter);
                }
                VastAdPresenter.this.wasClicked = true;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdCustomEndCardFound() {
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdDidReachEnd() {
                VideoListener videoListener = VastAdPresenter.this.mVideoListener;
                if (videoListener != null) {
                    videoListener.onVideoFinished();
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdDismissed() {
                onAdDismissed(-1);
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdLoadFail(PlayerInfo playerInfo) {
                VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                AdPresenter.Listener listener = vastAdPresenter.mListener;
                if (listener != null) {
                    listener.onAdError(vastAdPresenter);
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdLoadSuccess() {
                VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                if (vastAdPresenter.mIsDestroyed || vastAdPresenter.mLoaded) {
                    return;
                }
                vastAdPresenter.mLoaded = true;
                AdPresenter.Listener listener = vastAdPresenter.mListener;
                if (listener != null) {
                    listener.onAdLoaded(vastAdPresenter, vastAdPresenter.buildView());
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdSkipped() {
                VideoListener videoListener = VastAdPresenter.this.mVideoListener;
                if (videoListener != null) {
                    videoListener.onVideoSkipped();
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdStarted() {
                VideoListener videoListener = VastAdPresenter.this.mVideoListener;
                if (videoListener != null) {
                    videoListener.onVideoStarted();
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onCustomCTACLick(boolean z10) {
                String str = z10 ? "custom_cta_endcard_click" : "custom_cta_click";
                if (VastAdPresenter.this.mCustomCTAClickTrackedEvents.contains(str)) {
                    return;
                }
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setEventType(str);
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                if (str.equals("custom_cta_endcard_click")) {
                    AdTracker adTracker = VastAdPresenter.this.mCustomCTAEndcardTracker;
                    if (adTracker != null) {
                        adTracker.trackClick();
                    }
                } else {
                    AdTracker adTracker2 = VastAdPresenter.this.mCustomCTATracker;
                    if (adTracker2 != null) {
                        adTracker2.trackImpression();
                    }
                }
                VastAdPresenter.this.mCustomCTAClickTrackedEvents.add(str);
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onCustomCTALoadFail() {
                Logger.e("onCustomCTALoadFail", "CTA Failed to load");
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onCustomCTAShow() {
                if (VastAdPresenter.this.mCustomCTAImpressionTracked.booleanValue()) {
                    return;
                }
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setEventType("custom_cta_show");
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                AdTracker adTracker = VastAdPresenter.this.mCustomCTATracker;
                if (adTracker != null) {
                    adTracker.trackImpression();
                }
                VastAdPresenter.this.mCustomCTAImpressionTracked = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onCustomEndCardClick(String str) {
                if (VastAdPresenter.this.mCustomEndCardClickTracked.booleanValue()) {
                    return;
                }
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setEventType("custom_endcard_click");
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    reportingEvent.setAdFormat("banner");
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                if (!vastAdPresenter.wasClicked) {
                    vastAdPresenter.mAdTracker.trackClick();
                }
                VastAdPresenter.this.mCustomEndcardTracker.trackClick();
                VastAdPresenter.this.mAdEventTracker.trackCustomEndcardEvent(4, null);
                VastAdPresenter.this.mCustomEndCardClickTracked = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onCustomEndCardShow(String str) {
                if (VastAdPresenter.this.mCustomEndCardImpressionTracked.booleanValue()) {
                    return;
                }
                VastAdPresenter.this.hideContentInfo();
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    reportingEvent.setAdFormat("banner");
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    reportingEvent.setEventType("custom_endcard_impression");
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, str);
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                VastAdPresenter.this.mCustomEndcardTracker.trackImpression();
                VastAdPresenter.this.mAdEventTracker.trackCustomEndcardEvent(1, null);
                VastAdPresenter.this.mCustomEndCardImpressionTracked = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onDefaultEndCardClick(String str) {
                if (VastAdPresenter.this.mDefaultEndCardClickTracked.booleanValue()) {
                    return;
                }
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_CLICK);
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    reportingEvent.setAdFormat("banner");
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                VastAdPresenter.this.mAdEventTracker.trackCompanionAdEvent(4, null);
                VastAdPresenter.this.mDefaultEndCardClickTracked = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onDefaultEndCardShow(String str) {
                if (VastAdPresenter.this.mDefaultEndCardImpressionTracked.booleanValue()) {
                    return;
                }
                VastAdPresenter.this.reportCompanionView();
                if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    reportingEvent.setAdFormat("banner");
                    reportingEvent.setPlatform("android");
                    reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                    Ad ad3 = VastAdPresenter.this.mAd;
                    if (ad3 != null) {
                        reportingEvent.setImpId(ad3.getSessionId());
                        reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                        reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                    }
                    reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_IMPRESSION);
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, str);
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
                VastAdPresenter.this.mAdEventTracker.trackCompanionAdEvent(1, null);
                VastAdPresenter.this.mDefaultEndCardImpressionTracked = Boolean.TRUE;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onEndCardClosed(Boolean bool2) {
                if (bool2.booleanValue() && VastAdPresenter.this.mCustomEndCardCloseTracked.booleanValue()) {
                    return;
                }
                if (bool2.booleanValue() || !VastAdPresenter.this.mDefaultEndCardCloseTracked.booleanValue()) {
                    if (bool2.booleanValue()) {
                        VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                        vastAdPresenter.mCustomEndCardCloseTracked = Boolean.TRUE;
                        vastAdPresenter.mAdEventTracker.trackCustomEndcardEvent(3, null);
                    } else {
                        VastAdPresenter vastAdPresenter2 = VastAdPresenter.this;
                        vastAdPresenter2.mDefaultEndCardCloseTracked = Boolean.TRUE;
                        vastAdPresenter2.mAdEventTracker.trackCompanionAdEvent(3, null);
                    }
                    if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
                        return;
                    }
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    if (VastAdPresenter.this.mDefaultEndCardCloseTracked.booleanValue()) {
                        reportingEvent.setEventType(Reporting.EventType.CUSTOM_ENDCARD_CLOSE);
                        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
                    } else {
                        reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_CLOSE);
                        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
                    }
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onEndCardLoadFail(Boolean bool2) {
                if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                Ad ad3 = VastAdPresenter.this.mAd;
                if (ad3 != null) {
                    reportingEvent.setImpId(ad3.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                }
                if (bool2.booleanValue()) {
                    reportingEvent.setEventType(Reporting.EventType.CUSTOM_END_CARD_LOAD_FAILURE);
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
                } else {
                    reportingEvent.setEventType(Reporting.EventType.DEFAULT_END_CARD_LOAD_FAILURE);
                    reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
                }
                HyBid.getReportingController().reportEvent(reportingEvent);
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public synchronized void onEndCardLoadSuccess(Boolean bool2) {
                try {
                    if ((!bool2.booleanValue() || !VastAdPresenter.this.mLoadCustomEndCardTracked.booleanValue()) && (bool2.booleanValue() || !VastAdPresenter.this.mLoadDefaultEndCardTracked.booleanValue())) {
                        if (bool2.booleanValue()) {
                            VastAdPresenter.this.mLoadCustomEndCardTracked = Boolean.TRUE;
                        } else {
                            VastAdPresenter.this.mLoadDefaultEndCardTracked = Boolean.TRUE;
                        }
                        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                            ReportingEvent reportingEvent = new ReportingEvent();
                            reportingEvent.setTimestamp(System.currentTimeMillis());
                            reportingEvent.setAdFormat("banner");
                            reportingEvent.setPlatform("android");
                            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(VastAdPresenter.this.mIntegrationType));
                            Ad ad3 = VastAdPresenter.this.mAd;
                            if (ad3 != null) {
                                reportingEvent.setImpId(ad3.getSessionId());
                                reportingEvent.setCampaignId(VastAdPresenter.this.mAd.getCampaignId());
                                reportingEvent.setConfigId(VastAdPresenter.this.mAd.getConfigId());
                            }
                            if (VastAdPresenter.this.mLoadDefaultEndCardTracked.booleanValue()) {
                                reportingEvent.setEventType(Reporting.EventType.DEFAULT_END_CARD_LOAD_SUCCESS);
                                reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
                            } else {
                                reportingEvent.setEventType(Reporting.EventType.CUSTOM_END_CARD_LOAD_SUCCESS);
                                reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "custom");
                            }
                            HyBid.getReportingController().reportEvent(reportingEvent);
                        }
                    }
                } finally {
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onEndCardSkipped(Boolean bool2) {
                if (bool2.booleanValue() && VastAdPresenter.this.mCustomEndCardSkipTracked.booleanValue()) {
                    return;
                }
                if (bool2.booleanValue() || !VastAdPresenter.this.mDefaultEndCardSkipTracked.booleanValue()) {
                    if (bool2.booleanValue()) {
                        VastAdPresenter.this.mAdEventTracker.trackCustomEndcardEvent(2, null);
                    } else {
                        VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                        vastAdPresenter.mDefaultEndCardSkipTracked = Boolean.TRUE;
                        vastAdPresenter.mAdEventTracker.trackCompanionAdEvent(2, null);
                    }
                    if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
                        return;
                    }
                    ReportingEvent reportingEvent = new ReportingEvent();
                    reportingEvent.setTimestamp(System.currentTimeMillis());
                    if (VastAdPresenter.this.mDefaultEndCardSkipTracked.booleanValue()) {
                        reportingEvent.setEventType(Reporting.EventType.DEFAULT_ENDCARD_SKIP);
                        reportingEvent.setCustomString(Reporting.Key.END_CARD_TYPE, "default");
                    }
                    HyBid.getReportingController().reportEvent(reportingEvent);
                }
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdListener
            public void onAdDismissed(int i10) {
                VastAdPresenter.this.hideContentInfo();
                VideoListener videoListener = VastAdPresenter.this.mVideoListener;
                if (videoListener != null) {
                    videoListener.onVideoDismissed(i10);
                }
            }
        };
        this.isLinkClickRunning = false;
        this.mContext = context;
        this.mAdSize = adSize;
        this.mAd = ad2;
        this.mReportingController = HyBid.getReportingController();
        ImpressionTrackingMethod impressionTrackingMethodFromString = (ad2 == null || ad2.getImpressionTrackingMethod() == null || ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod()) == null) ? null : ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod());
        if (impressionTrackingMethodFromString != null) {
            this.mTrackingMethod = impressionTrackingMethodFromString;
        } else if (impressionTrackingMethod != null) {
            this.mTrackingMethod = impressionTrackingMethod;
        } else {
            this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        }
        VideoVisibilityManager videoVisibilityManager = VideoVisibilityManager.getInstance();
        this.videoVisibilityManager = videoVisibilityManager;
        videoVisibilityManager.addCallback(this);
        this.mIntegrationType = integrationType;
        initiateAdTrackers();
        initiateCustomCTAAdTrackers();
        initiateEventTrackers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View buildView() {
        ViewGroup frameLayout = new FrameLayout(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(this.mVideoPlayer, layoutParams);
        setupContentInfo(frameLayout);
        return frameLayout;
    }

    private View getContentInfo(Context context, Ad ad2, ContentInfo contentInfo) {
        return contentInfo == null ? ad2.getContentInfoContainer(context, this) : ad2.getContentInfoContainer(context, contentInfo, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideContentInfo() {
        View view = this.mContentInfo;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void initiateAdTrackers() {
        if (this.mAd != null) {
            this.mAdTracker = new AdTracker(this.mAd.getBeacons("impression"), this.mAd.getBeacons("click"));
            this.mCustomEndcardTracker = new AdTracker(this.mAd.getBeacons("custom_endcard_impression"), this.mAd.getBeacons("custom_endcard_click"));
        }
    }

    private void initiateCustomCTAAdTrackers() {
        if (this.mAd != null) {
            this.mCustomCTATracker = new AdTracker(this.mAd.getBeacons("custom_cta_show"), this.mAd.getBeacons("custom_cta_click"), false);
            this.mCustomCTAEndcardTracker = new AdTracker(null, this.mAd.getBeacons("custom_cta_endcard_click"), false);
        }
    }

    private void initiateEventTrackers() {
        if (this.mAd != null) {
            this.mAdEventTracker = new AdTracker(null, null, null, this.mAd.getBeacons(Ad.Beacon.COMPANION_AD_EVENT), this.mAd.getBeacons(Ad.Beacon.CUSTOM_ENDCARD_EVENT));
        }
    }

    private void invokeOnContentInfoClick() {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.CONTENT_INFO_CLICK);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setPlatform("android");
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportCompanionView() {
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.COMPANION_VIEW);
        reportingEvent.setAdFormat("banner");
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    private void setupContentInfo(ViewGroup viewGroup) {
        if (getAd() == null || viewGroup == null) {
            return;
        }
        ContentInfo contentInfo = Utils.parseContentInfo(this.mVastIcon);
        View contentInfo2 = getContentInfo(viewGroup.getContext(), getAd(), contentInfo);
        this.mContentInfo = contentInfo2;
        if (contentInfo2 != null) {
            if (contentInfo != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) contentInfo2.getLayoutParams();
                layoutParams.gravity = ((getAd().getContentInfoIconXPosition() == null ? contentInfo.getPositionX() != PositionX.RIGHT : getAd().getContentInfoIconXPosition() != ContentInfoIconXPosition.RIGHT) ? GravityCompat.START : GravityCompat.END) | ((getAd().getContentInfoIconYPosition() == null ? contentInfo.getPositionY() != PositionY.BOTTOM : getAd().getContentInfoIconYPosition() != ContentInfoIconYPosition.BOTTOM) ? 48 : 80);
                viewGroup.addView(this.mContentInfo, layoutParams);
            } else {
                viewGroup.addView(contentInfo2);
            }
            if (contentInfo == null || contentInfo.getViewTrackers() == null || contentInfo.getViewTrackers().isEmpty()) {
                return;
            }
            Iterator<String> it = contentInfo.getViewTrackers().iterator();
            while (it.hasNext()) {
                EventTracker.post(viewGroup.getContext(), it.next(), null, true);
            }
        }
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void destroy() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.destroy();
        }
        this.videoVisibilityManager.removeCallback(this);
        this.mListener = null;
        this.mIsDestroyed = true;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public Ad getAd() {
        return this.mAd;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void load() {
        VideoAdCacheItem videoAdCacheItemRemove;
        if (CheckUtils.NoThrow.checkArgument(!this.mIsDestroyed, "VastMRectPresenter is destroyed")) {
            try {
                if (this.mAd != null) {
                    this.mVideoAd = new VideoAd(this.mContext, this.mAd, false, false, this.mVideoImpressionListener);
                    VideoAdView videoAdView = new VideoAdView(this.mContext);
                    this.mVideoPlayer = videoAdView;
                    this.mVideoAd.bindView(videoAdView);
                    this.mVideoAd.setAdListener(this.mVideoAdListener);
                    this.mVideoAd.setAdCloseButtonListener(this.mAdCloseButtonListener);
                    Boolean bool = Boolean.FALSE;
                    this.mDefaultEndCardClickTracked = bool;
                    this.mCustomEndCardClickTracked = bool;
                    this.mDefaultEndCardImpressionTracked = bool;
                    this.mCustomEndCardImpressionTracked = bool;
                    this.mLoadDefaultEndCardTracked = bool;
                    this.mLoadCustomEndCardTracked = bool;
                    if (!TextUtils.isEmpty(getAd().getZoneId()) && (videoAdCacheItemRemove = HyBid.getVideoAdCache().remove(getAd().getZoneId())) != null) {
                        this.mVideoAd.setVideoCacheItem(videoAdCacheItemRemove);
                        if (videoAdCacheItemRemove.getAdParams() != null && videoAdCacheItemRemove.getAdParams().getAdIcon() != null) {
                            this.mVastIcon = videoAdCacheItemRemove.getAdParams().getAdIcon();
                        }
                    }
                    this.mVideoAd.load(this.mIntegrationType);
                }
            } catch (Exception e10) {
                Logger.e(TAG, e10.getMessage());
                AdPresenter.Listener listener = this.mListener;
                if (listener != null) {
                    listener.onAdError(this);
                }
                VideoListener videoListener = this.mVideoListener;
                if (videoListener != null) {
                    videoListener.onVideoError(0);
                }
            }
        }
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                EventTracker.post(this.mContext, list.get(i10), null, false);
            }
        }
        invokeOnContentInfoClick();
    }

    @Override // net.pubnative.lite.sdk.visibility.ImpressionTracker.Listener
    public void onImpression(View view) {
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public synchronized void onLinkClicked(String str) {
        Ad ad2;
        if (this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        AdFeedbackFormHelper adFeedbackFormHelper = new AdFeedbackFormHelper();
        if (URLValidator.isValidURL(str) && (ad2 = this.mAd) != null) {
            adFeedbackFormHelper.showFeedbackForm(this.mContext, str, ad2, "banner", IntegrationType.STANDALONE, new AdFeedbackLoadListener() { // from class: net.pubnative.lite.sdk.banner.presenter.VastAdPresenter.5
                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onFormClosed() {
                    VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                    vastAdPresenter.isFeedbackFormVisible = false;
                    vastAdPresenter.isLinkClickRunning = false;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoad(String str2) {
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFailed(Throwable th2) {
                    Logger.e(VastAdPresenter.TAG, th2.getMessage());
                    VastAdPresenter.this.isLinkClickRunning = false;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFinished() {
                    VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                    vastAdPresenter.isFeedbackFormVisible = true;
                    vastAdPresenter.isLinkClickRunning = false;
                }
            });
        } else {
            Logger.e(TAG, "URL is invalid");
            this.isLinkClickRunning = false;
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoVisibilityListener
    public void pauseAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd == null || !videoAd.isShowing()) {
            return;
        }
        this.mVideoAd.pause();
    }

    @Override // net.pubnative.lite.sdk.vpaid.VideoVisibilityListener
    public void resumeAd() {
        VideoAd videoAd = this.mVideoAd;
        if (videoAd == null || !videoAd.isShowing() || this.isFeedbackFormVisible) {
            return;
        }
        this.mVideoAd.resume();
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void setImpressionListener(AdPresenter.ImpressionListener impressionListener) {
        this.mImpressionListener = impressionListener;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void setListener(AdPresenter.Listener listener) {
        this.mListener = listener;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void setMRaidListener(MRAIDViewListener mRAIDViewListener) {
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void setVideoListener(VideoListener videoListener) {
        this.mVideoListener = videoListener;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void startTracking() {
        startTracking(null);
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void stopTracking() {
        if (this.mTrackingMethod == ImpressionTrackingMethod.AD_VIEWABLE) {
            ImpressionManager.stopTrackingView(this.mVideoPlayer);
        }
        this.mVideoAd.dismiss();
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void startTracking(HybidConsumer<Double> hybidConsumer) {
        if (this.mTrackingMethod == ImpressionTrackingMethod.AD_VIEWABLE) {
            ImpressionManager.startTrackingView(this.mVideoPlayer, this.mAdSize, this.mAd.getImpressionMinVisibleTime(), this.mAd.getImpressionVisiblePercent(), this.mNativeTrackerListener, hybidConsumer);
            return;
        }
        VideoAd videoAd = this.mVideoAd;
        if (videoAd != null) {
            videoAd.show();
        }
    }
}
