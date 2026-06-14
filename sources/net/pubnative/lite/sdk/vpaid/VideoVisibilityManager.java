package net.pubnative.lite.sdk.vpaid;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class VideoVisibilityManager {
    private static VideoVisibilityManager instance;
    ArrayList<VideoVisibilityListener> videoVisibilityListeners = new ArrayList<>();

    public enum VideoAdStatus {
        PAUSED,
        RESUMED
    }

    private VideoVisibilityManager() {
    }

    public static VideoVisibilityManager getInstance() {
        if (instance == null) {
            instance = new VideoVisibilityManager();
        }
        return instance;
    }

    public void addCallback(VideoVisibilityListener videoVisibilityListener) {
        this.videoVisibilityListeners.add(videoVisibilityListener);
    }

    public void removeCallback(VideoVisibilityListener videoVisibilityListener) {
        this.videoVisibilityListeners.remove(videoVisibilityListener);
    }

    public void reportChange(VideoAdStatus videoAdStatus) {
        ArrayList<VideoVisibilityListener> arrayList = this.videoVisibilityListeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            VideoVisibilityListener videoVisibilityListener = arrayList.get(i10);
            i10++;
            VideoVisibilityListener videoVisibilityListener2 = videoVisibilityListener;
            if (videoAdStatus == VideoAdStatus.PAUSED) {
                videoVisibilityListener2.pauseAd();
            } else {
                videoVisibilityListener2.resumeAd();
            }
        }
    }
}
