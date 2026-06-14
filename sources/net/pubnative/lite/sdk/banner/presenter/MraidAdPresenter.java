package net.pubnative.lite.sdk.banner.presenter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.view.View;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.contentinfo.AdFeedbackFormHelper;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.CheckUtils;
import net.pubnative.lite.sdk.utils.HybidConsumer;
import net.pubnative.lite.sdk.utils.UrlHandler;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.ProgressDialogFragment;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.visibility.ImpressionTracker;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MraidAdPresenter implements AdPresenter, MRAIDViewListener, MRAIDNativeFeatureListener, ImpressionTracker.Listener, PNAPIContentInfoView.ContentInfoListener {
    private static final boolean MRAID_EXPAND_DEFAULT = true;
    private static final String TAG = "MraidAdPresenter";
    private final Ad mAd;
    private AdSize mAdSize;
    private final Context mContext;
    private AdPresenter.ImpressionListener mImpressionListener;
    private AdPresenter.Listener mListener;
    private MRAIDBanner mMRAIDBanner;
    private MRAIDViewListener mRaidListener;
    private final String[] mSupportedNativeFeatures;
    private final ImpressionTrackingMethod mTrackingMethod;
    private final UrlHandler mUrlHandlerDelegate;
    private boolean mIsDestroyed = false;
    String processedURL = "";
    private ReportingController mReportingController = HyBid.getReportingController();

    public MraidAdPresenter(Context context, Ad ad2, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod) {
        this.mContext = context;
        this.mAdSize = adSize;
        this.mAd = ad2;
        if (ad2 != null && ad2.getImpressionTrackingMethod() != null && ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod()) != null) {
            impressionTrackingMethod = ImpressionTrackingMethod.fromString(ad2.getImpressionTrackingMethod());
        }
        if (impressionTrackingMethod != null) {
            this.mTrackingMethod = impressionTrackingMethod;
        } else {
            this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        }
        this.mUrlHandlerDelegate = new UrlHandler(context);
        this.mSupportedNativeFeatures = new String[]{MRAIDNativeFeature.CALENDAR, MRAIDNativeFeature.INLINE_VIDEO, MRAIDNativeFeature.SMS, MRAIDNativeFeature.STORE_PICTURE, MRAIDNativeFeature.TEL, "location"};
    }

    private void invokeOnContentInfoClick() {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.CONTENT_INFO_CLICK);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (this.mAdSize == AdSize.SIZE_INTERSTITIAL) {
            reportingEvent.setAdFormat("fullscreen");
        } else {
            reportingEvent.setAdFormat("banner");
        }
        reportingEvent.setPlatform("android");
        Ad ad2 = getAd();
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(ad2.getCampaignId());
            reportingEvent.setConfigId(ad2.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void destroy() {
        MRAIDBanner mRAIDBanner = this.mMRAIDBanner;
        if (mRAIDBanner != null) {
            mRAIDBanner.destroy();
        }
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

    public void hideProgressDialog(FragmentManager fragmentManager) {
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("progress dialog");
        if (fragmentFindFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commit();
        }
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.mIsDestroyed, "MraidAdPresenter is destroyed")) {
            Boolean mraidExpand = this.mAd.getMraidExpand();
            if (mraidExpand == null) {
                mraidExpand = Boolean.TRUE;
            }
            Boolean bool = mraidExpand;
            if (this.mAd.getAssetUrl(APIAsset.HTML_BANNER) != null) {
                this.mMRAIDBanner = new MRAIDBanner(this.mContext, this.mAd.getAssetUrl(APIAsset.HTML_BANNER), "", Boolean.TRUE, bool, this.mSupportedNativeFeatures, this, this, this.mAd.getContentInfoContainer(this.mContext, this));
            } else if (this.mAd.getAssetHtml(APIAsset.HTML_BANNER) != null) {
                this.mMRAIDBanner = new MRAIDBanner(this.mContext, "", this.mAd.getAssetHtml(APIAsset.HTML_BANNER), Boolean.TRUE, bool, this.mSupportedNativeFeatures, this, this, this.mAd.getContentInfoContainer(this.mContext, this));
            }
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
        AdPresenter.Listener listener;
        if (this.mIsDestroyed || (listener = this.mListener) == null) {
            return;
        }
        listener.onAdClicked(this);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        String navigationMode;
        String link;
        if (this.mIsDestroyed) {
            return;
        }
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            navigationMode = ad2.getNavigationMode();
            link = this.mAd.getLink();
        } else {
            navigationMode = null;
            link = null;
        }
        this.mUrlHandlerDelegate.handleUrl(str, link, navigationMode);
        AdPresenter.Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdClicked(this);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
        AdPresenter.Listener listener;
        if (this.mIsDestroyed || (listener = this.mListener) == null) {
            return;
        }
        listener.onAdClicked(this);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
        MRAIDViewListener mRAIDViewListener = this.mRaidListener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.onExpandedAdClosed();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        AdPresenter.Listener listener;
        if (this.mIsDestroyed || (listener = this.mListener) == null) {
            return;
        }
        listener.onAdError(this);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        AdPresenter.Listener listener;
        AdPresenter.ImpressionListener impressionListener;
        if (this.mIsDestroyed || (listener = this.mListener) == null) {
            return;
        }
        listener.onAdLoaded(this, this.mMRAIDBanner);
        if (this.mTrackingMethod != ImpressionTrackingMethod.AD_RENDERED || (impressionListener = this.mImpressionListener) == null) {
            return;
        }
        impressionListener.onImpression();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i10, int i11, int i12, int i13) {
        return true;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
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
        AdPresenter.ImpressionListener impressionListener = this.mImpressionListener;
        if (impressionListener != null) {
            impressionListener.onImpression();
        }
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public void onLinkClicked(String str) {
        new AdFeedbackFormHelper().showFeedbackForm(this.mContext, str, this.mAd, "banner", IntegrationType.STANDALONE);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onReplayClicked() {
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
        this.mRaidListener = mRAIDViewListener;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void setVideoListener(VideoListener videoListener) {
    }

    public void showProgressDialog(FragmentManager fragmentManager, String str, String str2) {
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("progress dialog");
        if (fragmentFindFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commit();
        }
        fragmentManager.beginTransaction().addToBackStack(null).commit();
        ProgressDialogFragment.newInstance(str, str2).show(fragmentManager, "progress dialog");
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void startTracking() {
        startTracking(null);
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void stopTracking() {
        MRAIDBanner mRAIDBanner = this.mMRAIDBanner;
        if (mRAIDBanner != null) {
            mRAIDBanner.stopAdSession();
            if (this.mTrackingMethod == ImpressionTrackingMethod.AD_VIEWABLE) {
                ImpressionManager.stopTrackingView(this.mMRAIDBanner);
            }
        }
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter
    public void startTracking(HybidConsumer<Double> hybidConsumer) {
        MRAIDBanner mRAIDBanner = this.mMRAIDBanner;
        if (mRAIDBanner == null || this.mTrackingMethod != ImpressionTrackingMethod.AD_VIEWABLE) {
            return;
        }
        ImpressionManager.startTrackingView(mRAIDBanner, this.mAdSize, this.mAd.getImpressionMinVisibleTime(), this.mAd.getImpressionVisiblePercent(), this, hybidConsumer);
    }
}
