package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSession;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;
import com.iab.omid.library.amazon.adsession.Partner;

/* JADX INFO: loaded from: classes5.dex */
public class DtbOmSdkSessionManager {
    private static final String APS_OMSDK_ACTIVATION_NOT_INITIALIZED_MESSAGE = "OMIDSDK Activation failed to initialize";
    private static final String APS_OM_SDK_ACTIVATION_ERROR_MESSAGE = "OMIDSDK Failed to activate";
    private static final String APS_OM_SDK_ADD_FRIENDLY_OBSTRUCTION_ERROR_MESSAGE = "OMIDSDK Failed to add friendly obstruction";
    private static final String APS_OM_SDK_AD_EVENTS_CREATION_ERROR_MESSAGE = "OMIDSDK Failed to create ad event";
    private static final String APS_OM_SDK_AD_SESSION_CONFIG_ERROR_MESSAGE = "OMIDSDK Failed to initialize config for ";
    private static final String APS_OM_SDK_AD_SESSION_CREATION_ERROR_MESSAGE = "OMIDSDK Failed to create ad session";
    private static final String APS_OM_SDK_IMPRESSION_ERROR_MESSAGE = "OMIDSDK Failed to trigger impression event";
    private static final String APS_OM_SDK_LOAD_EVENT_ERROR_MESSAGE = "OMIDSDK Failed to load ad event";
    private static final String APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE = "OMIDSDK Failed to create partner object";
    private static final String APS_OM_SDK_REGISTER_AD_VIEW_ERROR_MESSAGE = "OMIDSDK Failed to register ad view";
    private static final String APS_OM_SDK_START_AD_SESSION_ERROR_MESSAGE = "OMIDSDK Failed to start ad session";
    private static final String APS_OM_SDK_STOP_AD_SESSION_ERROR_MESSAGE = "OMIDSDK Failed to stop ad session";
    private static final String LOGTAG = "DtbOmSdkSessionManager";
    private static boolean featureEnabled;
    private static boolean isOmSdkActive;
    private AdSessionConfiguration adSessionConfiguration;
    private AdSessionContext adSessionContext;
    private AdEvents dtbOmSdkAdEvents;
    private AdSession dtbOmSdkAdSession;
    private Partner dtbOmSdkPartner;

    private DtbOmSdkSessionManager() {
        computeFeatureEnabledFlag();
        if (featureEnabled) {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.w0
                @Override // java.lang.Runnable
                public final void run() {
                    DtbOmSdkSessionManager.e(this.f7482b);
                }
            });
        }
    }

    public static /* synthetic */ void a(DtbOmSdkSessionManager dtbOmSdkSessionManager) {
        AdSession adSession = dtbOmSdkSessionManager.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on start Ad Session");
            return;
        }
        try {
            adSession.start();
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad session id: " + dtbOmSdkSessionManager.dtbOmSdkAdSession.getAdSessionId());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_START_AD_SESSION_ERROR_MESSAGE, e10);
        }
    }

    protected static void activateOMSDK(final Context context) {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.y0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.f(context);
            }
        });
    }

    public static /* synthetic */ void b(DtbOmSdkSessionManager dtbOmSdkSessionManager) {
        AdSession adSession = dtbOmSdkSessionManager.dtbOmSdkAdSession;
        if (adSession == null || !isOmSdkActive) {
            DtbLog.error(LOGTAG, "OMSDK : Open measurement ad Session not active");
            return;
        }
        try {
            adSession.finish();
            dtbOmSdkSessionManager.adSessionContext = null;
            dtbOmSdkSessionManager.dtbOmSdkAdSession = null;
            dtbOmSdkSessionManager.dtbOmSdkAdEvents = null;
            dtbOmSdkSessionManager.adSessionConfiguration = null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_STOP_AD_SESSION_ERROR_MESSAGE, e10);
        }
    }

    public static /* synthetic */ void c(DtbOmSdkSessionManager dtbOmSdkSessionManager, View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = dtbOmSdkSessionManager.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on add Friendly Obstruction");
            return;
        }
        try {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        } catch (RuntimeException unused) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_ADD_FRIENDLY_OBSTRUCTION_ERROR_MESSAGE);
        }
    }

    private void computeFeatureEnabledFlag() {
        if (DTBMetricsConfiguration.getDeniedOmSdkVersionList("denied_version_list").isEmpty()) {
            featureEnabled = true;
        } else {
            featureEnabled = !r0.contains(DtbConstants.INTEGRATED_OM_VERSION.replaceAll("_", "."));
        }
    }

    private void createOmAdEvents() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on create Ad Event");
        } else {
            this.dtbOmSdkAdEvents = AdEvents.createAdEvents(adSession);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad Event created");
        }
    }

    private void createOmAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        if (adSessionConfiguration == null || adSessionContext == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OM_SDK_AD_SESSION_CREATION_ERROR_MESSAGE);
        } else {
            this.dtbOmSdkAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad Session Created");
        }
    }

    public static /* synthetic */ void d(DtbOmSdkSessionManager dtbOmSdkSessionManager, CreativeType creativeType, Owner owner, Owner owner2, boolean z10, WebView webView, String str) {
        if (dtbOmSdkSessionManager.dtbOmSdkPartner == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE);
            return;
        }
        try {
            dtbOmSdkSessionManager.adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, owner, owner2, z10);
            AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(dtbOmSdkSessionManager.dtbOmSdkPartner, webView, str, "");
            dtbOmSdkSessionManager.adSessionContext = adSessionContextCreateHtmlAdSessionContext;
            dtbOmSdkSessionManager.createOmAdSession(dtbOmSdkSessionManager.adSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
            if (CreativeType.HTML_DISPLAY.equals(creativeType)) {
                dtbOmSdkSessionManager.createOmAdEvents();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_AD_SESSION_CONFIG_ERROR_MESSAGE + creativeType, e10);
        }
    }

    public static /* synthetic */ void e(DtbOmSdkSessionManager dtbOmSdkSessionManager) {
        dtbOmSdkSessionManager.getClass();
        try {
            dtbOmSdkSessionManager.dtbOmSdkPartner = Partner.createPartner(DTBMetricsConfiguration.getClientConfigVal("partner_name", "Amazon1", "om_sdk_feature"), DtbCommonUtils.getSDKVersion());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE, e10);
        }
    }

    public static /* synthetic */ void f(Context context) {
        try {
            Omid.activate(context);
            isOmSdkActive = Omid.isActive();
        } catch (Throwable th2) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_ACTIVATION_ERROR_MESSAGE, th2);
        }
    }

    public static /* synthetic */ void g(DtbOmSdkSessionManager dtbOmSdkSessionManager) {
        AdEvents adEvents = dtbOmSdkSessionManager.dtbOmSdkAdEvents;
        if (adEvents == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on impressionOccured");
            return;
        }
        try {
            adEvents.impressionOccurred();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_IMPRESSION_ERROR_MESSAGE, e10);
        }
    }

    public static boolean getFeatureEnableFlag() {
        return featureEnabled;
    }

    public static DtbOmSdkSessionManager getNewInstance() {
        if (isOmSdkActive) {
            return new DtbOmSdkSessionManager();
        }
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OMSDK_ACTIVATION_NOT_INITIALIZED_MESSAGE);
        return null;
    }

    public static /* synthetic */ void h(DtbOmSdkSessionManager dtbOmSdkSessionManager) {
        AdEvents adEvents = dtbOmSdkSessionManager.dtbOmSdkAdEvents;
        if (adEvents == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on adLoaded event");
            return;
        }
        try {
            adEvents.loaded();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_LOAD_EVENT_ERROR_MESSAGE, e10);
        }
    }

    public static /* synthetic */ void i(DtbOmSdkSessionManager dtbOmSdkSessionManager, WebView webView) {
        AdSession adSession = dtbOmSdkSessionManager.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on register Ad View");
            return;
        }
        try {
            adSession.registerAdView(webView);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad view registered");
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_REGISTER_AD_VIEW_ERROR_MESSAGE, e10);
        }
    }

    private void initOmAdSession(final WebView webView, final String str, final CreativeType creativeType, final Owner owner, final Owner owner2, final boolean z10) {
        if (featureEnabled) {
            DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.t0
                @Override // java.lang.Runnable
                public final void run() {
                    DtbOmSdkSessionManager.d(this.f7467b, creativeType, owner, owner2, z10, webView, str);
                }
            });
        } else {
            DtbLog.error(LOGTAG, "OM SDK Feature Turned Off");
        }
    }

    protected static boolean isOmSdkActive() {
        return isOmSdkActive;
    }

    public void addFriendlyObstruction(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.u0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.c(this.f7475b, view, friendlyObstructionPurpose);
            }
        });
    }

    public void displayAdEventLoaded() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.v0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.h(this.f7480b);
            }
        });
    }

    protected AdEvents getCurrentAdEvents() {
        return this.dtbOmSdkAdEvents;
    }

    protected AdSession getCurrentAdSession() {
        return this.dtbOmSdkAdSession;
    }

    protected void impressionOccured() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.a1
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.g(this.f7407b);
            }
        });
    }

    public void initHtmlDisplayOmAdSession(WebView webView, String str) {
        initOmAdSession(webView, str, CreativeType.HTML_DISPLAY, Owner.NATIVE, Owner.NONE, false);
    }

    public void initJavaScriptOmAdSession(WebView webView, String str) {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        initOmAdSession(webView, str, creativeType, owner, owner, true);
    }

    public void registerAdView(final WebView webView) {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.s0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.i(this.f7462b, webView);
            }
        });
    }

    public void startAdSession() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.x0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.a(this.f7484b);
            }
        });
    }

    public synchronized void stopOmAdSession() {
        DtbThreadService.executeOnMainThread(new Runnable() { // from class: com.amazon.device.ads.z0
            @Override // java.lang.Runnable
            public final void run() {
                DtbOmSdkSessionManager.b(this.f7488b);
            }
        });
    }
}
