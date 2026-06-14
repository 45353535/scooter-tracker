package net.pubnative.lite.sdk.viewability;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.viewability.baseom.BaseVerificationScriptResource;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HyBidViewabilityAdSession {
    private static final String TAG = "HyBidViewabilityAdSession";
    protected Object mAdEvents;
    protected Object mAdSession;
    protected final List<BaseVerificationScriptResource> mVerificationScriptResources = new ArrayList();
    final BaseViewabilityManager viewabilityManager;

    public HyBidViewabilityAdSession(BaseViewabilityManager baseViewabilityManager) {
        this.viewabilityManager = baseViewabilityManager;
    }

    private boolean shouldSkipViewabilityMeasurement() {
        BaseViewabilityManager baseViewabilityManager = this.viewabilityManager;
        return baseViewabilityManager == null || !baseViewabilityManager.isViewabilityMeasurementEnabled();
    }

    public void addFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        Object obj;
        if (shouldSkipViewabilityMeasurement() || view == null || (obj = this.mAdSession) == null) {
            return;
        }
        this.viewabilityManager.addFriendlyObstruction(obj, view, baseFriendlyObstructionPurpose, str);
    }

    public void fireImpression() {
        Object obj;
        if (shouldSkipViewabilityMeasurement() || (obj = this.mAdEvents) == null) {
            return;
        }
        try {
            this.viewabilityManager.fireImpression(obj);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public void fireLoaded() {
        Object obj;
        if (shouldSkipViewabilityMeasurement() || (obj = this.mAdEvents) == null) {
            return;
        }
        try {
            this.viewabilityManager.fireLoaded(obj);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            Logger.e(TAG, e10.getMessage());
        }
    }

    public void stopAdSession() {
        Object obj;
        if (shouldSkipViewabilityMeasurement() || (obj = this.mAdSession) == null) {
            return;
        }
        try {
            this.viewabilityManager.stopAdSession(obj);
        } catch (RuntimeException e10) {
            Logger.e(TAG, e10.getMessage());
        }
        this.mAdSession = null;
    }
}
