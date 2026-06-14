package net.pubnative.lite.sdk.viewability;

import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidViewabilityWebAdSession extends HyBidViewabilityAdSession {
    private static final String TAG = "HyBidViewabilityWebAdSession";

    public HyBidViewabilityWebAdSession(BaseViewabilityManager baseViewabilityManager) {
        super(baseViewabilityManager);
    }

    private boolean shouldSkipViewabilityMeasurement() {
        BaseViewabilityManager baseViewabilityManager = this.viewabilityManager;
        return baseViewabilityManager == null || !baseViewabilityManager.isViewabilityMeasurementEnabled();
    }

    protected void createAdEvents() {
        Object obj;
        if (shouldSkipViewabilityMeasurement() || (obj = this.mAdSession) == null) {
            return;
        }
        this.mAdEvents = this.viewabilityManager.createAdEvents(obj);
    }

    public void initAdSession(WebView webView, boolean z10) {
        if (shouldSkipViewabilityMeasurement()) {
            return;
        }
        try {
            Object objCreateHtmlAdSessionContext = this.viewabilityManager.createHtmlAdSessionContext(webView);
            BaseViewabilityManager baseViewabilityManager = this.viewabilityManager;
            Object objCreateAdSession = this.viewabilityManager.createAdSession(baseViewabilityManager.getWebAdSessionConfiguration(z10, baseViewabilityManager.getOwner(z10)), objCreateHtmlAdSessionContext);
            this.mAdSession = objCreateAdSession;
            this.viewabilityManager.registerAdView(objCreateAdSession, webView);
            createAdEvents();
            this.viewabilityManager.startAdSession(this.mAdSession);
        } catch (IllegalArgumentException e10) {
            Logger.e("", e10.getMessage());
        } catch (NullPointerException e11) {
            Logger.e(TAG, "OM SDK Ad Session - Exception", e11);
        }
    }
}
