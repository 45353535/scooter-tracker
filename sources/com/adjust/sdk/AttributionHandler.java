package com.adjust.sdk;

import android.net.Uri;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import com.adjust.sdk.scheduler.TimerOnce;
import com.ironsource.C4257c4;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AttributionHandler implements IAttributionHandler, IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final String ATTRIBUTION_TIMER_NAME = "Attribution timer";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private String lastInitiatedBy;
    private boolean paused;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler("AttributionHandler");
    private TimerOnce timer = new TimerOnce(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.1
        @Override // java.lang.Runnable
        public final void run() {
            AttributionHandler.this.sendAttributionRequest();
        }
    }, ATTRIBUTION_TIMER_NAME);

    public AttributionHandler(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z10, iActivityPackageSender);
    }

    private ActivityPackage buildAndGetAttributionPackage(ActivityHandler.InternalState internalState) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        PackageBuilder packageBuilder = new PackageBuilder(iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getActivityState(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), jCurrentTimeMillis);
        packageBuilder.internalState = internalState;
        ActivityPackage activityPackageBuildAttributionPackage = packageBuilder.buildAttributionPackage(this.lastInitiatedBy);
        this.lastInitiatedBy = null;
        return activityPackageBuildAttributionPackage;
    }

    private void checkAttributionI(IActivityHandler iActivityHandler, ResponseData responseData) {
        if (responseData.jsonResponse == null) {
            return;
        }
        Long l10 = responseData.askIn;
        if (l10 == null || l10.longValue() < 0) {
            iActivityHandler.setAskingAttribution(false);
            return;
        }
        iActivityHandler.setAskingAttribution(true);
        this.lastInitiatedBy = "backend";
        getAttributionI(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAttributionResponseI(IActivityHandler iActivityHandler, AttributionResponseData attributionResponseData) {
        checkAttributionI(iActivityHandler, attributionResponseData);
        checkDeeplinkInAttributionResponseI(attributionResponseData);
        iActivityHandler.launchAttributionResponseTasks(attributionResponseData);
    }

    private void checkDeeplinkInAttributionResponseI(AttributionResponseData attributionResponseData) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONObject jSONObject = attributionResponseData.jsonResponse;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(C4257c4.f42799c)) == null || (strOptString = jSONObjectOptJSONObject.optString(Constants.DEEPLINK, null)) == null) {
            return;
        }
        attributionResponseData.deeplink = Uri.parse(strOptString);
    }

    private void checkDeeplinkInSessionResponseI(SessionResponseData sessionResponseData) {
        String strOptString;
        JSONObject jSONObject = sessionResponseData.jsonResponse;
        if (jSONObject == null || (strOptString = jSONObject.optString(Constants.DEEPLINK, null)) == null) {
            return;
        }
        sessionResponseData.deeplink = Uri.parse(strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSdkClickResponseI(IActivityHandler iActivityHandler, SdkClickResponseData sdkClickResponseData) {
        checkAttributionI(iActivityHandler, sdkClickResponseData);
        iActivityHandler.launchSdkClickResponseTasks(sdkClickResponseData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSessionResponseI(IActivityHandler iActivityHandler, SessionResponseData sessionResponseData) {
        checkAttributionI(iActivityHandler, sessionResponseData);
        checkDeeplinkInSessionResponseI(sessionResponseData);
        iActivityHandler.launchSessionResponseTasks(sessionResponseData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAttributionI(long j10) {
        if (this.timer.getFireIn() > j10) {
            return;
        }
        if (j10 != 0) {
            this.logger.debug("Waiting to query attribution in %s seconds", Util.SecondsDisplayFormat.format(j10 / 1000.0d));
        }
        this.timer.startIn(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequest() {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.6
            @Override // java.lang.Runnable
            public final void run() {
                AttributionHandler.this.sendAttributionRequestI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequestI() {
        if (this.activityHandlerWeakRef.get().getActivityState().isGdprForgotten) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Attribution handler is paused", new Object[0]);
            return;
        }
        ActivityPackage activityPackageBuildAndGetAttributionPackage = buildAndGetAttributionPackage(this.activityHandlerWeakRef.get().getInternalState());
        this.logger.verbose("%s", activityPackageBuildAndGetAttributionPackage.getExtendedString());
        this.activityPackageSender.sendActivityPackage(activityPackageBuildAndGetAttributionPackage, null, this);
    }

    public void checkAttributionResponse(final AttributionResponseData attributionResponseData) {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.5
            @Override // java.lang.Runnable
            public final void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                AttributionHandler.this.checkAttributionResponseI(iActivityHandler, attributionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSdkClickResponse(final SdkClickResponseData sdkClickResponseData) {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.4
            @Override // java.lang.Runnable
            public final void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                AttributionHandler.this.checkSdkClickResponseI(iActivityHandler, sdkClickResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSessionResponse(final SessionResponseData sessionResponseData) {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.3
            @Override // java.lang.Runnable
            public final void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                AttributionHandler.this.checkSessionResponseI(iActivityHandler, sessionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void getAttribution() {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.2
            @Override // java.lang.Runnable
            public final void run() {
                AttributionHandler.this.lastInitiatedBy = "sdk";
                AttributionHandler.this.getAttributionI(0L);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.paused = !z10;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(final ResponseData responseData) {
        this.scheduler.submit(new Runnable() { // from class: com.adjust.sdk.AttributionHandler.7
            @Override // java.lang.Runnable
            public final void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                ResponseData responseData2 = responseData;
                if (responseData2.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler.gotOptOutResponse();
                } else if (responseData2 instanceof AttributionResponseData) {
                    AttributionHandler.this.checkAttributionResponseI(iActivityHandler, (AttributionResponseData) responseData2);
                }
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void teardown() {
        this.logger.verbose("AttributionHandler teardown", new Object[0]);
        TimerOnce timerOnce = this.timer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.timer = null;
        this.logger = null;
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
    }
}
