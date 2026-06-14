package net.pubnative.lite.sdk.vpaid;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidActivityInteractor {
    private static boolean activityVisible;
    private static HyBidActivityInteractor instance;

    private HyBidActivityInteractor() {
        activityVisible = true;
    }

    public static HyBidActivityInteractor getInstance() {
        if (instance == null) {
            instance = new HyBidActivityInteractor();
        }
        return instance;
    }

    public void activityCreated() {
        activityVisible = true;
    }

    public void activityDestroyed() {
        activityVisible = false;
        instance = null;
    }

    public void activityPaused() {
        activityVisible = false;
    }

    public void activityResumed() {
        activityVisible = true;
    }

    public boolean isActivityVisible() {
        return activityVisible;
    }
}
