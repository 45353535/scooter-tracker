package net.pubnative.lite.sdk.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.contentinfo.AdFeedbackFormHelper;
import net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.URLValidator;
import net.pubnative.lite.sdk.utils.UrlHandler;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNBeaconWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.visibility.ImpressionTracker;
import net.pubnative.lite.sdk.visibility.TrackingManager;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAd implements ImpressionTracker.Listener, PNAPIContentInfoView.ContentInfoListener {
    private static final String TAG = "NativeAd";
    private Bitmap bannerBitmap;
    private Bitmap iconBitmap;
    public boolean isLinkClickRunning;
    protected Ad mAd;
    private View mAdView;
    private View mClickableView;
    private boolean mIsImpressionConfirmed;
    protected Listener mListener;
    private ReportingController mReportingController;
    private Map<String, String> mTrackingExtras;
    private List<String> mUsedAssets;
    String processedURL;

    public interface Listener {
        void onAdClick(NativeAd nativeAd, View view);

        void onAdImpression(NativeAd nativeAd, View view);
    }

    public NativeAd() {
        this.processedURL = "";
        this.isLinkClickRunning = false;
        this.mAd = null;
        this.mReportingController = HyBid.getReportingController();
    }

    private void confirmBeacons(String str, Context context) {
        Ad ad2 = this.mAd;
        if (ad2 == null) {
            Log.w(TAG, "confirmBeacons - Error: ad data not present");
            return;
        }
        List<AdData> beacons = ad2.getBeacons(str);
        if (beacons == null) {
            return;
        }
        for (AdData adData : beacons) {
            String strInjectExtras = injectExtras(adData.getURL());
            String stringField = adData.getStringField("js");
            if (!TextUtils.isEmpty(strInjectExtras)) {
                TrackingManager.track(context, strInjectExtras);
            } else if (!TextUtils.isEmpty(stringField)) {
                try {
                    new PNBeaconWebView(context).loadBeacon(stringField);
                } catch (Exception e10) {
                    Log.e(TAG, "confirmImpressionBeacons - JS Error: " + e10);
                }
            }
        }
    }

    private void confirmClickBeacons(Context context) {
        confirmBeacons("click", context);
    }

    private void confirmImpressionBeacons(Context context) {
        List<String> list = this.mUsedAssets;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                TrackingManager.track(context, it.next());
            }
        }
        confirmBeacons("impression", context);
    }

    private String getClickUrl() {
        return injectExtras(this.mAd.link);
    }

    private String injectExtras(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.mTrackingExtras) == null || map.size() <= 0) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : this.mTrackingExtras.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getKey());
        }
        return builderBuildUpon.build().toString();
    }

    private void invokeOnContentInfoClick() {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(Reporting.EventType.CONTENT_INFO_CLICK);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("native");
        reportingEvent.setPlatform("android");
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            reportingEvent.setImpId(ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    private void stopTrackingClicks() {
        View view = this.mClickableView;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    private void stopTrackingImpression() {
        ImpressionManager.stopTrackingAll(this);
    }

    public Bitmap getBannerBitmap() {
        return this.bannerBitmap;
    }

    public String getBannerUrl() {
        AdData asset;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("banner")) == null) {
            return null;
        }
        return asset.getURL();
    }

    public Integer getBidPoints() {
        Ad ad2 = this.mAd;
        return Integer.valueOf(ad2 != null ? ad2.getECPM().intValue() : 0);
    }

    public String getCallToActionText() {
        AdData asset;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("cta")) == null) {
            return null;
        }
        return asset.getText();
    }

    public View getContentInfo(Context context) {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getContentInfo(context, this);
        }
        return null;
    }

    public String getContentInfoClickUrl() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getContentInfoClickUrl();
        }
        return null;
    }

    public String getContentInfoIconUrl() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getContentInfoIconUrl();
        }
        return null;
    }

    public String getContentInfoText() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getContentInfoText();
        }
        return null;
    }

    public String getCreativeId() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getCreativeId();
        }
        return null;
    }

    public String getDescription() {
        AdData asset;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("description")) == null) {
            return null;
        }
        return asset.getText();
    }

    public Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public String getIconUrl() {
        AdData asset;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("icon")) == null) {
            return null;
        }
        return asset.getURL();
    }

    public String getImpressionId() {
        Ad ad2 = this.mAd;
        if (ad2 != null) {
            return ad2.getImpressionId();
        }
        return null;
    }

    public int getRating() {
        AdData asset;
        Double number;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("rating")) == null || (number = asset.getNumber()) == null) {
            return 0;
        }
        return number.intValue();
    }

    public String getTitle() {
        AdData asset;
        Ad ad2 = this.mAd;
        if (ad2 == null || (asset = ad2.getAsset("title")) == null) {
            return null;
        }
        return asset.getText();
    }

    protected void invokeOnClick(View view) {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdClick(this, view);
        }
    }

    public synchronized void invokeOnImpression(View view) {
        try {
            this.mIsImpressionConfirmed = true;
            if (view != null && view.getContext() != null) {
                Ad ad2 = this.mAd;
                if (ad2 != null && !TextUtils.isEmpty(ad2.getZoneId())) {
                    new SessionImpressionPrefs(view.getContext()).insert(this.mAd.getZoneId());
                }
                Listener listener = this.mListener;
                if (listener != null) {
                    listener.onAdImpression(this, view);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                EventTracker.post(this.mAdView.getContext(), list.get(i10), null, false);
            }
        }
        invokeOnContentInfoClick();
    }

    @Override // net.pubnative.lite.sdk.visibility.ImpressionTracker.Listener
    public void onImpression(View view) {
        confirmImpressionBeacons(view.getContext());
        invokeOnImpression(view);
    }

    @Override // net.pubnative.lite.sdk.views.PNAPIContentInfoView.ContentInfoListener
    public synchronized void onLinkClicked(String str) {
        View view = this.mAdView;
        if (view == null || view.getContext() == null || this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        AdFeedbackFormHelper adFeedbackFormHelper = new AdFeedbackFormHelper();
        if (URLValidator.isValidURL(str)) {
            adFeedbackFormHelper.showFeedbackForm(this.mAdView.getContext(), str, this.mAd, "native", IntegrationType.STANDALONE, new AdFeedbackLoadListener() { // from class: net.pubnative.lite.sdk.models.NativeAd.1
                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onFormClosed() {
                    NativeAd.this.isLinkClickRunning = false;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoad(String str2) {
                    NativeAd.this.processedURL = str2;
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFailed(Throwable th2) {
                    NativeAd.this.isLinkClickRunning = false;
                    Logger.e(NativeAd.TAG, th2.getMessage());
                }

                @Override // net.pubnative.lite.sdk.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFinished() {
                    NativeAd.this.isLinkClickRunning = false;
                }
            });
        } else {
            Logger.e(TAG, "Content info url is invalid");
            this.isLinkClickRunning = false;
        }
    }

    public void onNativeClick() {
        View view = this.mAdView;
        if (view != null) {
            confirmClickBeacons(view.getContext());
            openURL(getClickUrl(), true);
        }
    }

    protected void openURL(String str, boolean z10) {
        View view;
        Context context = ((!z10 || (view = this.mAdView) == null) && (view = this.mClickableView) == null) ? null : view.getContext();
        if (context == null || this.mAd == null) {
            return;
        }
        new UrlHandler(context).handleUrl(str, this.mAd.getLink(), this.mAd.getNavigationMode());
    }

    public void setBannerBitmap(Bitmap bitmap) {
        this.bannerBitmap = bitmap;
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.iconBitmap = bitmap;
    }

    public void startTracking(View view, Listener listener) {
        startTracking(view, view, listener);
    }

    public void startTrackingClicks(View view) {
        if (TextUtils.isEmpty(getClickUrl())) {
            Log.w(TAG, "click url is empty, clicks won't be tracked");
        } else if (view == null) {
            Log.w(TAG, "click view is null, clicks won't be tracked");
        } else {
            this.mClickableView = view;
            view.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.models.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f95878b.onNativeClick(view2);
                }
            });
        }
    }

    public void startTrackingImpression(View view) {
        if (view == null) {
            Log.w(TAG, "ad view is null, cannot start tracking");
        } else if (this.mIsImpressionConfirmed) {
            Log.i(TAG, "impression is already confirmed, dropping impression tracking");
        } else {
            this.mAdView = view;
            ImpressionManager.startTrackingView(view, this.mAd.getImpressionMinVisibleTime(), this.mAd.getImpressionVisiblePercent(), this);
        }
    }

    public void stopTracking() {
        stopTrackingImpression();
        stopTrackingClicks();
    }

    public void startTracking(View view, View view2, Listener listener) {
        startTracking(view, view2, null, listener);
    }

    public void startTracking(View view, View view2, Map<String, String> map, Listener listener) {
        if (listener == null) {
            Log.w(TAG, "startTracking - listener is null, start tracking without callbacks");
        }
        this.mListener = listener;
        this.mTrackingExtras = map;
        stopTracking();
        startTrackingImpression(view);
        startTrackingClicks(view2);
    }

    public void onNativeClick(View view) {
        invokeOnClick(view);
        confirmClickBeacons(view.getContext());
        openURL(getClickUrl(), false);
    }

    public NativeAd(Ad ad2) {
        this.processedURL = "";
        this.isLinkClickRunning = false;
        this.mAd = ad2;
        this.mReportingController = HyBid.getReportingController();
    }
}
