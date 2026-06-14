package net.pubnative.lite.sdk.visibility;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.utils.HybidConsumer;
import net.pubnative.lite.sdk.visibility.ImpressionTracker;

/* JADX INFO: loaded from: classes3.dex */
public class ImpressionManager {
    private static final String TAG = "ImpressionManager";
    private static ImpressionManager instance;
    protected List<ImpressionTracker> mTrackers;

    private ImpressionManager() {
    }

    public static ImpressionManager getInstance() {
        if (instance == null) {
            ImpressionManager impressionManager = new ImpressionManager();
            instance = impressionManager;
            impressionManager.mTrackers = new ArrayList();
        }
        return instance;
    }

    public static void startTrackingView(View view, Integer num, Double d10, ImpressionTracker.Listener listener) {
        startTrackingView(view, null, num, d10, listener, null);
    }

    public static void stopTrackingAll(ImpressionTracker.Listener listener) {
        getInstance().stopTracking(listener);
    }

    public static void stopTrackingView(View view) {
        getInstance().removeView(view);
    }

    protected void addView(View view, AdSize adSize, Integer num, Double d10, ImpressionTracker.Listener listener, HybidConsumer<Double> hybidConsumer) {
        ImpressionTracker impressionTracker;
        if (view == null) {
            Log.w(TAG, "trying to start tracking null view, dropping this calll");
            return;
        }
        if (listener == null) {
            Log.w(TAG, "trying to start tracking with null listener");
            return;
        }
        if (containsTracker(view)) {
            if (!this.mTrackers.get(indexOfTracker(view)).equals(listener)) {
                removeView(view);
            }
        }
        if (containsTracker(listener)) {
            impressionTracker = this.mTrackers.get(indexOfTracker(view));
        } else {
            ImpressionTracker impressionTracker2 = new ImpressionTracker(num, d10);
            if (adSize != null) {
                impressionTracker2.setAdSize(adSize, d10);
            }
            impressionTracker2.setListener(listener);
            this.mTrackers.add(impressionTracker2);
            impressionTracker = impressionTracker2;
        }
        impressionTracker.addView(view, hybidConsumer);
    }

    protected boolean containsTracker(View view) {
        return indexOfTracker(view) >= 0;
    }

    protected int indexOfTracker(View view) {
        for (int i10 = 0; i10 < this.mTrackers.size(); i10++) {
            if (this.mTrackers.get(i10).equals(view)) {
                return i10;
            }
        }
        return -1;
    }

    protected void removeView(View view) {
        if (view == null) {
            Log.w(TAG, "trying to remove null view, dropping this call");
            return;
        }
        if (containsTracker(view)) {
            ImpressionTracker impressionTracker = this.mTrackers.get(indexOfTracker(view));
            impressionTracker.removeView(view);
            if (impressionTracker.isEmpty()) {
                impressionTracker.clear();
                this.mTrackers.remove(impressionTracker);
            }
        }
    }

    protected void stopTracking(ImpressionTracker.Listener listener) {
        if (listener == null) {
            Log.w(TAG, "trying to remove all views from null listener, dropping this call");
        } else if (containsTracker(listener)) {
            this.mTrackers.get(indexOfTracker(listener)).clear();
            this.mTrackers.remove(listener);
        }
    }

    public static void startTrackingView(View view, AdSize adSize, Integer num, Double d10, ImpressionTracker.Listener listener, HybidConsumer<Double> hybidConsumer) {
        getInstance().addView(view, adSize, num, d10, listener, hybidConsumer);
    }

    protected boolean containsTracker(ImpressionTracker.Listener listener) {
        return indexOfTracker(listener) >= 0;
    }

    protected int indexOfTracker(ImpressionTracker.Listener listener) {
        for (int i10 = 0; i10 < this.mTrackers.size(); i10++) {
            if (this.mTrackers.get(i10).equals(listener)) {
                return i10;
            }
        }
        return -1;
    }
}
