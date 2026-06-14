package com.amazon.device.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdUtils;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.bidder.adapter.ApsBidderInterstitialAdAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdInterstitial {
    protected static final String INTERSTITIAL_CACHE_KEY = "INTERSTITIAL_CACHE_KEY";
    private static final String LOG_TAG = "DTBAdInterstitial";
    private static Map<Integer, DTBAdInterstitial> dtbAdInterstitialCache = DesugarCollections.synchronizedMap(new HashMap());
    DTBAdView adView;
    ApsAd apsAd;
    private final ApsAdListener apsAdListener = new ApsAdListener() { // from class: com.amazon.device.ads.DTBAdInterstitial.1
        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClicked(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onAdClicked(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClosed(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onAdClosed(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdError(ApsAd apsAd) {
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdFailedToLoad(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onAdFailed(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdLoaded(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onAdLoaded(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdOpen(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onAdOpen(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onImpressionFired(ApsAd apsAd) {
            if (apsAd != null) {
                ApsUtils.INSTANCE.fireAAXImpressionPixel(apsAd);
            }
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onImpressionFired(null);
            }
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onVideoCompleted(ApsAd apsAd) {
            if (DTBAdInterstitial.this.getInterstitialListener() != null) {
                DTBAdInterstitial.this.getInterstitialListener().onVideoCompleted(null);
            }
        }
    };
    ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter;
    private Context context;

    public DTBAdInterstitial(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            this.context = context;
            this.adView = new DTBAdView(context, dTBAdInterstitialListener);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdInterstitial class", e10);
        }
    }

    static DTBAdInterstitial getFromCache(int i10) {
        if (dtbAdInterstitialCache.containsKey(Integer.valueOf(i10))) {
            return dtbAdInterstitialCache.get(Integer.valueOf(i10));
        }
        return null;
    }

    private DTBAdMRAIDInterstitialController getInterstitialController() {
        return (DTBAdMRAIDInterstitialController) this.adView.getController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DTBAdInterstitialListener getInterstitialListener() {
        return getInterstitialController().getInterstitialListener();
    }

    public static int getWidth(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getWidth method", e10);
            return 0;
        }
    }

    private static int putInCache(DTBAdInterstitial dTBAdInterstitial) {
        dtbAdInterstitialCache.put(Integer.valueOf(dTBAdInterstitial.hashCode()), dTBAdInterstitial);
        return dTBAdInterstitial.hashCode();
    }

    static void removeFromCache(int i10) {
        dtbAdInterstitialCache.remove(Integer.valueOf(i10));
    }

    public void fetchAd(Map<String, Object> map) {
        try {
            if (!map.containsKey(DtbConstants.AMZN_SDK_BIDDER_ID_KEY) || !map.containsKey(DtbConstants.AMZN_BIDDER_REQUEST_KEY) || !map.containsKey(DtbConstants.AMZN_IMP_URL_KEY)) {
                this.adView.fetchAd((Map<String, ? extends Object>) map);
                return;
            }
            ApsAd apsAdForBidderRendering = ApsAdUtils.getApsAdForBidderRendering(ApsAdFormat.INTERSTITIAL, (String) map.get(DtbConstants.AMZN_SDK_BIDDER_ID_KEY), (String) map.get(DtbConstants.AMZN_BIDDER_REQUEST_KEY), (String) map.get(DtbConstants.AMZN_IMP_URL_KEY));
            this.apsAd = apsAdForBidderRendering;
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(this.context, apsAdForBidderRendering, this.apsAdListener);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with extraData", e10);
        }
    }

    DTBAdView getAdView() {
        return this.adView;
    }

    void onAdClosed() {
        DTBAdInterstitialListener interstitialListener = getInterstitialListener();
        if (interstitialListener != null) {
            interstitialListener.onAdClosed(this.adView);
        }
    }

    protected void setDtbAdInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            this.adView = new DTBAdView(this.context, dTBAdInterstitialListener);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdInterstitial class", e10);
        }
    }

    void setListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        getInterstitialController().setInterstitialListener(dTBAdInterstitialListener);
    }

    public void show() {
        try {
            ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter = this.apsBidderInterstitialAdAdapter;
            if (apsBidderInterstitialAdAdapter != null) {
                apsBidderInterstitialAdAdapter.showInterstitialAd(this.context, this.apsAd, this.apsAdListener);
                return;
            }
            if (getInterstitialController() == null) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "There is no controller before showing the interstitial ad");
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) DTBInterstitialActivity.class);
            intent.putExtra(INTERSTITIAL_CACHE_KEY, putInCache(this));
            getInterstitialController().startOMSDKSession();
            this.context.startActivity(intent);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute show method", e10);
        }
    }

    protected DTBAdInterstitial(Context context) {
        this.context = context;
    }

    public void fetchAd(Bundle bundle) {
        fetchAd(bundle.getString("bid_html_template", ""), bundle);
    }

    public void fetchAd(String str) {
        fetchAd(str, null);
    }

    public void fetchAd(String str, Bundle bundle) {
        try {
            if (ApsAdUtils.sdkRenderingBridgeEnabled(str)) {
                ApsAd apsAdForBidderRendering = ApsAdUtils.getApsAdForBidderRendering(ApsAdFormat.INTERSTITIAL, new JSONObject(str));
                this.apsAd = apsAdForBidderRendering;
                this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(this.context, apsAdForBidderRendering, this.apsAdListener);
                return;
            }
            if (ApsAdUtils.sdkRenderingBridgeEnabled(bundle)) {
                ApsAd apsAdForBidderRendering2 = ApsAdUtils.getApsAdForBidderRendering(ApsAdFormat.INTERSTITIAL, bundle.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY), bundle.getString(DtbConstants.AMZN_BIDDER_REQUEST_KEY), bundle.getString(DtbConstants.AMZN_IMP_URL_KEY));
                this.apsAd = apsAdForBidderRendering2;
                this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(this.context, apsAdForBidderRendering2, this.apsAdListener);
                return;
            }
            this.adView.fetchAd(str, bundle);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with adHtml and  bundle argument", e10);
        }
    }
}
