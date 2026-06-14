package com.amazon.device.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdMRAIDInterstitialController extends DTBAdMRAIDController implements DTBAdViewDisplayListener {
    private String bidId;
    DTBAdInterstitialListener interstitialListener;
    boolean pageDisplayed;
    boolean pageLoaded;

    DTBAdMRAIDInterstitialController(DTBAdView dTBAdView, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(dTBAdView);
        this.pageLoaded = false;
        this.pageDisplayed = false;
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanOnCloseHandler() {
        try {
            DTBAdView dTBAdView = this.adView;
            if (dTBAdView != null) {
                dTBAdView.setWebViewClient(null);
                this.adView.removeAllViews();
                this.adView.cleanup();
                DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
                if (dTBAdInterstitialListener != null) {
                    dTBAdInterstitialListener.onAdClosed(this.adView);
                }
            }
            Activity currentActivity = ActivityMonitor.getInstance().getCurrentActivity();
            if (this.useCustomClose && !currentActivity.isFinishing() && (currentActivity instanceof DTBInterstitialActivity)) {
                DTBInterstitialActivity dTBInterstitialActivity = (DTBInterstitialActivity) currentActivity;
                dTBInterstitialActivity.cleanup();
                dTBInterstitialActivity.finish();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(DTBAdMRAIDController.LOG_TAG, "Failed to execute cleanOnCloseHandler method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to execute cleanOnCloseHandler method", e10);
        }
    }

    private void executeClose(String str) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        commandCompleted(str);
        setState(MraidStateType.HIDDEN);
        fireViewableChange(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7432b.cleanOnCloseHandler();
            }
        });
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void expand(Map<String, Object> map) {
        fireErrorEvent("expand", "invalid placement type for interstitial ");
        commandCompleted("expand");
    }

    DTBAdInterstitialListener getInterstitialListener() {
        return this.interstitialListener;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected String getPlacementType() {
        return "interstitial";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.e0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7424b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onImpressionFired(dTBAdMRAIDInterstitialController.adView);
                }
            });
            super.impressionFired();
        }
    }

    void initializeOnLoadAndDisplay() throws JSONException {
        if (this.pageLoaded && this.pageDisplayed) {
            prepareMraid();
        } else {
            createLoadReport();
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        if (this.interstitialListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.b0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7414b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onAdClicked(dTBAdMRAIDInterstitialController.adView);
                }
            });
        }
    }

    public void onAdError() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.c0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7416b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onAdError(dTBAdMRAIDInterstitialController.adView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdFailedToLoad() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdFailedToLoad");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.a0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7406b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onAdFailed(dTBAdMRAIDInterstitialController.adView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.f0
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7426b;
                dTBAdMRAIDInterstitialController.interstitialListener.onAdLeftApplication(dTBAdMRAIDInterstitialController.adView);
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLoaded() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on OnAdLoaded");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.d0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7418b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onAdLoaded(dTBAdMRAIDInterstitialController.adView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdOpened() {
        DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
        if (dTBAdInterstitialListener != null) {
            dTBAdInterstitialListener.onAdOpen(this.adView);
        }
    }

    @Override // com.amazon.device.ads.DTBAdViewDisplayListener
    public void onInitialDisplay() {
        this.pageDisplayed = true;
        try {
            initializeOnLoadAndDisplay();
        } catch (JSONException e10) {
            DtbLog.error("JSON exception:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onMRAIDClose() {
        executeClose("close");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onMRAIDUnload() {
        executeClose("unload");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        this.pageLoaded = true;
        try {
            initializeOnLoadAndDisplay();
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                String bidId = getAdView().getBidId();
                this.bidId = bidId;
                ApsMetrics.customEvent("interstitialCreativeFinished", bidId, null);
            }
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    protected void onResize(Map<String, Object> map) {
        fireErrorEvent("resize", "invalid placement type");
        commandCompleted("resize");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onVideoCompleted() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.g0
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController = this.f7430b;
                    dTBAdMRAIDInterstitialController.interstitialListener.onVideoCompleted(dTBAdMRAIDInterstitialController.adView);
                }
            });
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    void passLoadError() {
        onAdError();
    }

    void setInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        this.interstitialListener = dTBAdInterstitialListener;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void startEndCardDisplayOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null || getAdView() == null) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.LOG, "OMSDK : Aps OMSDK Session Manager or AdView is null on start");
            return;
        }
        try {
            if (getDtbOmSdkSessionManager().getCurrentAdSession() != null) {
                getDtbOmSdkSessionManager().stopOmAdSession();
            }
            getDtbOmSdkSessionManager().initHtmlDisplayOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            getDtbOmSdkSessionManager().registerAdView(getAdView());
            getDtbOmSdkSessionManager().startAdSession();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "OMSDK : End Card display : Unable to restart OM SDK session", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void startOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null || getAdView() == null) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.LOG, "OMSDK : Aps OMSDK Session Manager or AdView is null on start");
            return;
        }
        try {
            if (getDtbOmSdkSessionManager().getCurrentAdSession() != null) {
                getDtbOmSdkSessionManager().stopOmAdSession();
            }
            if (getAdView().getIsVideo()) {
                getDtbOmSdkSessionManager().initJavaScriptOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            } else {
                getDtbOmSdkSessionManager().initHtmlDisplayOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            }
            getDtbOmSdkSessionManager().registerAdView(getAdView());
            getDtbOmSdkSessionManager().startAdSession();
            getDtbOmSdkSessionManager().displayAdEventLoaded();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "OMSDK :Unable to start OM SDK session", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void stopOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMSDK : Aps OmSdk Session Manager is null on Stop Session");
        } else {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
    }
}
