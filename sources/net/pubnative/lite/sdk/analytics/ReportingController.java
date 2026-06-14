package net.pubnative.lite.sdk.analytics;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTracker;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTrackerCallback;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class ReportingController {
    private static final String TAG = "ReportingController";
    private List<ReportingEvent> adEventList;
    private List<ReportingTracker> adFiredTrackers;
    private final List<ReportingEventCallback> mListeners = new ArrayList();
    private final List<ReportingTrackerCallback> mTrackerListeners = new ArrayList();

    public static /* synthetic */ void a(ReportingController reportingController, ReportingTracker reportingTracker) {
        ReportingTrackerCallback reportingTrackerCallback;
        for (int i10 = 0; i10 < reportingController.mTrackerListeners.size(); i10++) {
            try {
                if (i10 < reportingController.mTrackerListeners.size() && (reportingTrackerCallback = reportingController.mTrackerListeners.get(i10)) != null) {
                    reportingTrackerCallback.onFire(reportingTracker);
                }
            } catch (Exception e10) {
                Logger.d("exception - " + ReportingController.class.getSimpleName(), e10.toString());
            }
        }
    }

    public static /* synthetic */ void b(ReportingController reportingController, ReportingEvent reportingEvent) {
        ReportingEventCallback reportingEventCallback;
        for (int i10 = 0; i10 < reportingController.mListeners.size(); i10++) {
            try {
                if (i10 < reportingController.mListeners.size() && (reportingEventCallback = reportingController.mListeners.get(i10)) != null) {
                    reportingEventCallback.onEvent(reportingEvent);
                }
            } catch (Exception e10) {
                Logger.d("exception - " + ReportingController.class.getSimpleName(), e10.toString());
            }
        }
    }

    public void addCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            if (reportingEventCallback != null) {
                try {
                    if (!this.mListeners.contains(reportingEventCallback)) {
                        this.mListeners.add(reportingEventCallback);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void addTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            if (reportingTrackerCallback != null) {
                try {
                    if (!this.mTrackerListeners.contains(reportingTrackerCallback)) {
                        this.mTrackerListeners.add(reportingTrackerCallback);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void cacheAdEventList(List<ReportingEvent> list) {
        this.adEventList = list;
    }

    public void clearAdEventList() {
        List<ReportingEvent> list = this.adEventList;
        if (list != null) {
            list.clear();
        }
    }

    public void clearFiredTrackerstList() {
        List<ReportingTracker> list = this.adFiredTrackers;
        if (list != null) {
            list.clear();
        }
    }

    public List<ReportingEvent> getAdEventList() {
        return this.adEventList;
    }

    public List<ReportingTracker> getFiredTrackersList() {
        return this.adFiredTrackers;
    }

    public boolean removeCallback(ReportingEventCallback reportingEventCallback) {
        synchronized (this) {
            try {
                if (reportingEventCallback == null) {
                    return false;
                }
                int iIndexOf = this.mListeners.indexOf(reportingEventCallback);
                if (iIndexOf == -1) {
                    return false;
                }
                this.mListeners.remove(iIndexOf);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean removeTrackerCallback(ReportingTrackerCallback reportingTrackerCallback) {
        synchronized (this) {
            try {
                if (reportingTrackerCallback == null) {
                    return false;
                }
                int iIndexOf = this.mTrackerListeners.indexOf(reportingTrackerCallback);
                if (iIndexOf == -1) {
                    return false;
                }
                this.mTrackerListeners.remove(iIndexOf);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void reportEvent(final ReportingEvent reportingEvent) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bh.a
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.b(this.f6417b, reportingEvent);
            }
        });
    }

    public synchronized void reportFiredTracker(final ReportingTracker reportingTracker) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bh.b
            @Override // java.lang.Runnable
            public final void run() {
                ReportingController.a(this.f6419b, reportingTracker);
            }
        });
    }
}
