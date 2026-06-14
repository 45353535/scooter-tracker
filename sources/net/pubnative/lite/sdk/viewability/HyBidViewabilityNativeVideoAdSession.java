package net.pubnative.lite.sdk.viewability;

import android.view.View;
import java.util.List;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.viewability.baseom.BaseVerificationScriptResource;
import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;
import net.pubnative.lite.sdk.viewability.baseom.MediaEventType;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidViewabilityNativeVideoAdSession extends HyBidViewabilityAdSession {
    private static final String OM_EXCEPTION = "OM SDK Ad Session - Exception";
    private static final String TAG = "HyBidViewabilityNativeVideoAdSession";
    private boolean completeFired;
    private boolean firstQuartileFired;
    private Object mMediaEvents;
    private boolean midpointFired;
    private boolean muted;
    private final Integer skipOffset;
    private boolean startFired;
    private boolean thirdQuartileFired;

    public HyBidViewabilityNativeVideoAdSession(BaseViewabilityManager baseViewabilityManager, Integer num) {
        super(baseViewabilityManager);
        this.startFired = false;
        this.firstQuartileFired = false;
        this.midpointFired = false;
        this.thirdQuartileFired = false;
        this.completeFired = false;
        this.muted = true;
        this.skipOffset = num;
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

    protected void createMediaEvents() {
        Object obj;
        try {
            if (!shouldSkipViewabilityMeasurement() && (obj = this.mAdSession) != null) {
                this.mMediaEvents = this.viewabilityManager.createMediaEvents(obj);
            }
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireBufferFinish() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.BUFFER_FINISH, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireBufferStart() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.BUFFER_START, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireClick() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.CLICK, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireComplete() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null || this.completeFired) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.COMPLETE, obj);
            this.completeFired = true;
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireFirstQuartile() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null || this.firstQuartileFired) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.FIRST_QUARTILE, obj);
            this.firstQuartileFired = true;
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    @Override // net.pubnative.lite.sdk.viewability.HyBidViewabilityAdSession
    public void fireLoaded() {
        try {
            if (shouldSkipViewabilityMeasurement()) {
                return;
            }
            Integer num = this.skipOffset;
            Object objCreateVastPropertiesForNonSkippableMedia = (num == null || num.intValue() <= -1) ? this.viewabilityManager.createVastPropertiesForNonSkippableMedia() : this.viewabilityManager.createVastPropertiesForSkippableMedia(this.skipOffset);
            Object obj = this.mAdEvents;
            if (obj != null) {
                this.viewabilityManager.fireEventProperties(obj, objCreateVastPropertiesForNonSkippableMedia);
            }
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireMidpoint() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null || this.midpointFired) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.MIDPOINT, obj);
            this.midpointFired = true;
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void firePause() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.PAUSE, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireResume() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.RESUME, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireSkipped() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.SKIPPED, obj);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireStart(float f10, boolean z10) {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null || this.startFired) {
                return;
            }
            this.viewabilityManager.fireMediaEventStart(obj, f10, z10 ? 0.0f : 1.0f);
            this.startFired = true;
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireThirdQuartile() {
        Object obj;
        try {
            if (shouldSkipViewabilityMeasurement() || (obj = this.mMediaEvents) == null || this.thirdQuartileFired) {
                return;
            }
            this.viewabilityManager.fireMediaEvents(MediaEventType.THIRD_QUARTILE, obj);
            this.thirdQuartileFired = true;
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void fireVolumeChange(boolean z10) {
        try {
            if (!shouldSkipViewabilityMeasurement() && z10 != this.muted) {
                this.muted = z10;
                Object obj = this.mMediaEvents;
                if (obj == null || this.completeFired) {
                    return;
                }
                this.viewabilityManager.fireMediaEventVolumeChange(obj, z10 ? 0.0f : 1.0f);
            }
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }

    public void initAdSession(View view, List<BaseVerificationScriptResource> list) {
        if (shouldSkipViewabilityMeasurement()) {
            return;
        }
        this.mVerificationScriptResources.addAll(list);
        try {
            Object objCreateNativeAdSessionContext = this.viewabilityManager.createNativeAdSessionContext(this.mVerificationScriptResources);
            Object objCreateAdSession = this.viewabilityManager.createAdSession(this.viewabilityManager.getNativeAdSessionConfiguration(), objCreateNativeAdSessionContext);
            this.mAdSession = objCreateAdSession;
            this.viewabilityManager.registerAdView(objCreateAdSession, view);
            createAdEvents();
            createMediaEvents();
            this.viewabilityManager.startAdSession(this.mAdSession);
        } catch (Exception e10) {
            Logger.e(TAG, OM_EXCEPTION, e10);
        }
    }
}
