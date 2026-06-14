package com.amazon.device.ads;

import android.content.Context;
import com.amazon.aps.ads.metrics.ApsMetricsBannerListenerAdapter;
import com.amazon.aps.ads.metrics.ApsMetricsInterstitialListenerAdapter;
import com.amazon.aps.ads.util.adview.ApsAdViewConstants;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdView extends ApsAdViewImpl implements ApsAdViewConstants {
    static final String LOG_TAG = "DTBAdView";

    protected DTBAdView(Context context) {
        super(context);
    }

    public DTBAdMRAIDController getController() {
        return super.getMraidHandler();
    }

    protected void initAdBannerListener(DTBAdBannerListener dTBAdBannerListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsBannerListenerAdapter(getBidId(), dTBAdBannerListener));
            setMraidHandler(new DTBAdMRAIDBannerController(this, (ApsMetricsBannerListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdBannerListener", e10);
        }
    }

    protected void initAdExpandedListener(DTBAdExpandedListener dTBAdExpandedListener, int i10) {
        try {
            DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = new DTBAdMRAIDExpandedController(this);
            setMraidHandler(dTBAdMRAIDExpandedController);
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.findControllerByIndex(i10));
            dTBAdExpandedListener.onCreateExpandedController((DTBAdMRAIDExpandedController) getMraidHandler());
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdExpandedListener", e10);
        }
    }

    protected void initAdInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsInterstitialListenerAdapter(getBidId(), dTBAdInterstitialListener));
            setMraidHandler(new DTBAdMRAIDInterstitialController(this, (ApsMetricsInterstitialListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdInterstitialListener", e10);
        }
    }

    public DTBAdView(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(context);
        initAdInterstitialListener(dTBAdInterstitialListener);
    }

    public DTBAdView(Context context, DTBAdBannerListener dTBAdBannerListener) {
        super(context);
        initAdBannerListener(dTBAdBannerListener);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener) {
        this(context, dTBAdExpandedListener, 0);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener, int i10) {
        super(context);
        initAdExpandedListener(dTBAdExpandedListener, i10);
    }
}
